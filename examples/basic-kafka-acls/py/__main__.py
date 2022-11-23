"""A Python Pulumi program to setup a Basic Kafka cluster with ACLs for both the producer and consumer."""

import pulumi
import pulumi_confluentcloud as confluent


environment = confluent.Environment("py-staging")

# Create the basic cluster.
cluster = confluent.KafkaCluster("basic-cluster",
                                 availability="SINGLE_ZONE",
                                 cloud="AWS",
                                 region="us-west-2",
                                 environment=confluent.KafkaClusterEnvironmentArgs(
                                     id=environment.id),
                                 basic={})

cluster_managed_resource = confluent.ApiKeyManagedResourceArgs(id=cluster.id,
                                                               api_version=cluster.api_version,
                                                               kind=cluster.kind,
                                                               environment=confluent.ApiKeyManagedResourceEnvironmentArgs(
                                                                   id=environment.id))

# Create a service account that will be used to manage the cluster
# and bind the CloudClusterAdmin to it.
app_manager = confluent.ServiceAccount("app-manager",
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
                              rest_endpoint=cluster.rest_endpoint,
                              credentials=confluent.KafkaTopicCredentialsArgs(
                                  key=app_manager_api_key.id,
                                  secret=app_manager_api_key.secret
                              ))

# Create the producer service account and an API key for it.
app_producer = confluent.ServiceAccount("app-producer",
                                        description="Service account to produce to 'orders' topic of 'inventory' Kafka cluster")

app_producer_api_key = confluent.ApiKey("app-producer-kafka-api-key",
                                        owner=confluent.ApiKeyOwnerArgs(id=app_producer.id,
                                                                        api_version=app_producer.api_version,
                                                                        kind=app_producer.kind),
                                        managed_resource=cluster_managed_resource)

# Create the consumer service account and an API key for it.
app_consumer = confluent.ServiceAccount("app-consumer",
                                        description="Service account to consume from 'orders' topic of 'inventory' Kafka cluster")

app_consumer_api_key = confluent.ApiKey("app-consumer-kafka-api-key",
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
                              rest_endpoint=cluster.rest_endpoint,
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

pulumi.export("environment-id", environment.id)
pulumi.export("cluster-id", cluster.id)
pulumi.export("topic-name", orders.topic_name)
pulumi.export("app-producer-api-key-id", app_producer_api_key.id)
pulumi.export("app-producer-api-key-secret", app_producer_api_key.secret)
pulumi.export("app-consumer-api-key-id", app_consumer_api_key.id)
pulumi.export("app-consumer-api-key-secret", app_consumer_api_key.secret)
