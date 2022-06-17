"""A Python Pulumi program to setup a Basic Kafka cluster with ACLs for both the producer and consumer."""

import pulumi
import pulumi_confluentcloud as confluent


environment = confluent.Environment("py-staging", display_name="Staging")

# Create the basic cluster.
cluster = confluent.KafkaCluster("basic-cluster",
                                 display_name="inventory",
                                 availability="SINGLE_ZONE",
                                 cloud="AWS",
                                 region="us-west-2",
                                 environment=confluent.KafkaClusterEnvironmentArgs(
                                     id=environment.id),
                                 basics=[{}])

cluster_managed_resource = confluent.ApiKeyManagedResourceArgs(id=cluster.id,
                                                               api_version=cluster.api_version,
                                                               kind=cluster.kind,
                                                               environment=confluent.ApiKeyManagedResourceEnvironmentArgs(
                                                                   id=environment.id))

# Create a service account that will be used to manage the cluster
# and bind the CloudClusterAdmin to it.
app_manager = confluent.ServiceAccount("app-manager",
                                       display_name="app-manager",
                                       description="Service account to manage 'inventory' Kafka cluster")

cluster_admin_role_binding = confluent.RoleBinding("app-manager-kafka-cluster-admin",
                                                   principal=pulumi.Output.concat(
                                                       "User:", app_manager.id),
                                                   role_name="CloudClusterAdmin",
                                                   crn_pattern=cluster.rbac_crn)

# Create an API key owned by the app manager service account.
app_manager_api_key_owner = confluent.ApiKeyOwnerArgs(
    id=app_manager.id, api_version=app_manager.api_version, kind=app_manager.kind)
app_manager_api_key = confluent.ApiKey("app-manager-kafka-api-key",
                                       display_name="app-manager-kafka-api-key",
                                       owner=app_manager_api_key_owner,
                                       managed_resource=cluster_managed_resource,
                                       opts=pulumi.ResourceOptions(
                                           depends_on=[
                                               cluster_admin_role_binding
                                           ]
                                       ))

# Create the Orders topic.
orders = confluent.KafkaTopic("orders",
                              kafka_cluster=confluent.KafkaTopicKafkaClusterArgs(
                                  id=cluster.id),
                              topic_name="orders",
                              http_endpoint=cluster.http_endpoint,
                              credentials=confluent.KafkaTopicCredentialsArgs(
                                  key=app_manager_api_key.id,
                                  secret=app_manager_api_key.secret
                              ))

# Create the producer service account and an API key for it.
app_producer = confluent.ServiceAccount("app-producer",
                                        display_name="app-producer",
                                        description="Service account to produce to 'orders' topic of 'inventory' Kafka cluster")

app_producer_api_key = confluent.ApiKey("app-producer-kafka-api-key",
                                        display_name="app-producer-kafka-api-key",
                                        owner=confluent.ApiKeyOwnerArgs(id=app_producer.id,
                                                                        api_version=app_producer.api_version,
                                                                        kind=app_producer.kind),
                                        managed_resource=cluster_managed_resource)

# Create the consumer service account and an API key for it.
app_consumer = confluent.ServiceAccount("app-consumer",
                                        display_name="app-consumer",
                                        description="Service account to consume from 'orders' topic of 'inventory' Kafka cluster")

app_consumer_api_key = confluent.ApiKey("app-consumer-kafka-api-key",
                                        display_name="app-consumer-kafka-api-key",
                                        owner=confluent.ApiKeyOwnerArgs(id=app_consumer.id,
                                                                        api_version=app_consumer.api_version,
                                                                        kind=app_consumer.kind),
                                        managed_resource=cluster_managed_resource)


def create_acl(name: str,
               operation: str,
               principal: confluent.ServiceAccount,
               resource_type: str = "TOPIC",
               pattern_type: str = "LITERAL",
               resource_name: str = None):
    """
    Creates an ACL resource for the orders topic by default
    if `resource_name` arg is not passed.
    """
    if resource_name is None:
        resource_name = orders.topic_name

    return confluent.KafkaAcl(name,
                              kafka_cluster=confluent.KafkaAclKafkaClusterArgs(
                                  id=cluster.id
                              ),
                              resource_type=resource_type,
                              operation=operation,
                              permission="ALLOW",
                              resource_name_=resource_name,
                              pattern_type=pattern_type,
                              principal=pulumi.Output.concat(
                                  "User:", principal.id),
                              host="*",
                              http_endpoint=cluster.http_endpoint,
                              credentials=confluent.KafkaAclCredentialsArgs(key=app_manager_api_key.id,
                                                                            secret=app_manager_api_key.secret
                                                                            ))


app_producer_acl = create_acl(
    "app-producer-write-on-topic", "WRITE", app_producer)

# In order to consume from a topic, a consumer will need read access to
# the topic as well as the consumer group that it belongs to.
app_consumer_topic_acl = create_acl(
    "app-consumer-read-on-topic", "READ", app_consumer)
# The `confluent_cli_consumer_` consumer group prefix is for the confluent CLI's default
# consumer group. Change the prefix to whatever consumer group ID your consumer uses.
app_consumer_group_acl = create_acl(
    "app-consumer-read-on-group", "READ", app_consumer, "GROUP", "PREFIXED", "confluent_cli_consumer_")

app_connector = confluent.ServiceAccount("app-connector",
                                         display_name="app-connector",
                                         description="Service account of S3 Source Connector to consume from an S3 bucket and write to the 'orders' topic of 'inventory' Kafka cluster")

app_connector_describe_on_cluster_acl = create_acl(
    "app-connector-describe-on-cluster", "DESCRIBE", app_connector, "CLUSTER", resource_name="kafka-cluster")

app_connector_write_on_topic_acl = create_acl(
    "app-connector-write-on-target-topic", "WRITE", app_connector, "TOPIC")

app_connector_create_on_data_preview_topics_acl = create_acl(
    "app-connector-create-on-data-preview-topics", "CREATE", app_connector, "TOPIC", "PREFIXED", "data-preview")

app_connector_write_on_data_preview_topics_acl = create_acl(
    "app-connector-write-on-data-preview-topics", "WRITE", app_connector, "TOPIC", "PREFIXED", "data-preview")

# The following stack configuration is required to configure
# the source connector.
# Uncomment it once you've set the required properties
# using `pulumi config set ...`.
#
# config = pulumi.Config()
# aws_access_key_id = config.require("AWS_ACCESS_KEY_ID")
# aws_secret_access_key = config.require_secret("AWS_SECRET_ACCESS_KEY")
# s3_bucket_name = config.require("S3_SOURCE_BUCKET_NAME")

# Create the source connector. To get the config for the connector you are working with,
# use the Confluent CLIv2 to describe the connector.
# For example, to get the config for the S3Connector
# plugin: `confluent connect plugin describe S3Source --cluster <cluster-id> --environment <env-id>`
#
# $ confluent connect plugin describe S3Source --cluster lkc-w7jrww --environment env-w7zo65
#
# The following are required configs:
# connector.class : S3Source
# name : ["name" is required]
# topic.regex.list : ["topic.regex.list" is required]
# kafka.api.key : ["kafka.api.key" is required when "kafka.auth.mode==KAFKA_API_KEY"]
# kafka.api.secret : ["kafka.api.secret" is required when "kafka.auth.mode==KAFKA_API_KEY"]
# input.data.format : ["input.data.format" is required]
# output.data.format : [Value "${input.data.format}" is not a valid "Output Message Format" type]
# aws.access.key.id : ["aws.access.key.id" is required]
# aws.secret.access.key : ["aws.secret.access.key" is required]
# s3.bucket.name : ["s3.bucket.name" is required]
# s3.region : ["s3.region" is required]
# tasks.max : ["tasks.max" is required]
#
# See https://docs.confluent.io/cloud/current/connectors/cc-s3-source.html.
#
# Once you've verified the required configs update the config_sensitive and/or
# config_nonsensitive accordingly.
#
# source_connector = confluent.Connector("source",
#                                        environment=confluent.ConnectorEnvironmentArgs(
#                                            id=environment.id),
#                                        kafka_cluster=confluent.ConnectorKafkaClusterArgs(
#                                            id=cluster.id),
#                                        config_sensitive={
#                                            "aws.access.key.id": aws_access_key_id,
#                                            "aws.secret.access.id": aws_secret_access_key,
#                                        },
#                                        config_nonsensitive={
#                                            "connector.class": "S3Source",
#                                            "name": "S3SourceConnector_0",
#                                            "topic.regex.list": pulumi.Output.concat(orders.topic_name, ":.*") # Send all files to the orders topic.
#                                            "kafka.auth.mode": "SERVICE_ACCOUNT",
#                                            "kafka.service.account.id": app_connector.id,
#                                            "input.data.format": "JSON",
#                                            "output.data.format": "BYTES",
#                                            "s3.bucket.name": s3_bucket_name,
#                                            "tasks.max": "1"
#                                        })

pulumi.export("environment-id", environment.id)
pulumi.export("cluster-id", cluster.id)
pulumi.export("topic-name", orders.topic_name)
pulumi.export("app-producer-api-key-id", app_producer_api_key.id)
pulumi.export("app-producer-api-key-secret", app_producer_api_key.secret)
pulumi.export("app-consumer-api-key-id", app_consumer_api_key.id)
pulumi.export("app-consumer-api-key-secret", app_consumer_api_key.secret)
