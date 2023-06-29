# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['KafkaTopicArgs', 'KafkaTopic']

@pulumi.input_type
class KafkaTopicArgs:
    def __init__(__self__, *,
                 topic_name: pulumi.Input[str],
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 credentials: Optional[pulumi.Input['KafkaTopicCredentialsArgs']] = None,
                 http_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']] = None,
                 partitions_count: Optional[pulumi.Input[int]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KafkaTopic resource.
        :param pulumi.Input[str] topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom topic settings to set:
        :param pulumi.Input['KafkaTopicCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] http_endpoint: The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] partitions_count: The number of partitions to create in the topic. Defaults to `6`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        pulumi.set(__self__, "topic_name", topic_name)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if http_endpoint is not None:
            warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
            pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")
        if http_endpoint is not None:
            pulumi.set(__self__, "http_endpoint", http_endpoint)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if partitions_count is not None:
            pulumi.set(__self__, "partitions_count", partitions_count)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Input[str]:
        """
        The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "topic_name", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The custom topic settings to set:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['KafkaTopicCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['KafkaTopicCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="httpEndpoint")
    def http_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
        pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")

        return pulumi.get(self, "http_endpoint")

    @http_endpoint.setter
    def http_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "http_endpoint", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="partitionsCount")
    def partitions_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of partitions to create in the topic. Defaults to `6`.
        """
        return pulumi.get(self, "partitions_count")

    @partitions_count.setter
    def partitions_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "partitions_count", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)


@pulumi.input_type
class _KafkaTopicState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 credentials: Optional[pulumi.Input['KafkaTopicCredentialsArgs']] = None,
                 http_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']] = None,
                 partitions_count: Optional[pulumi.Input[int]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KafkaTopic resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom topic settings to set:
        :param pulumi.Input['KafkaTopicCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] http_endpoint: The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] partitions_count: The number of partitions to create in the topic. Defaults to `6`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if http_endpoint is not None:
            warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
            pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")
        if http_endpoint is not None:
            pulumi.set(__self__, "http_endpoint", http_endpoint)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if partitions_count is not None:
            pulumi.set(__self__, "partitions_count", partitions_count)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if topic_name is not None:
            pulumi.set(__self__, "topic_name", topic_name)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The custom topic settings to set:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['KafkaTopicCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['KafkaTopicCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="httpEndpoint")
    def http_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
        pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")

        return pulumi.get(self, "http_endpoint")

    @http_endpoint.setter
    def http_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "http_endpoint", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaTopicKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="partitionsCount")
    def partitions_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of partitions to create in the topic. Defaults to `6`.
        """
        return pulumi.get(self, "partitions_count")

    @partitions_count.setter
    def partitions_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "partitions_count", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "topic_name", value)


class KafkaTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['KafkaTopicCredentialsArgs']]] = None,
                 http_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaTopicKafkaClusterArgs']]] = None,
                 partitions_count: Optional[pulumi.Input[int]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `<Kafka cluster ID>/<Kafka topic name>`, for exampleOption #1Manage multiple Kafka clusters in the same Terraform workspace $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
        ```

         Option #2Manage a single Kafka cluster in the same Terraform workspace

        ```sh
         $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
        ```

         resource "confluent_kafka_topic" "orders" {

         kafka_cluster {

         id = confluent_kafka_cluster.basic-cluster.id

         }

         topic_name

         = "orders"

         partitions_count

         = 4

         rest_endpoint

        = confluent_kafka_cluster.basic-cluster.rest_endpoint

        # https://docs.confluent.io/cloud/current/clusters/broker-config.html#custom-topic-settings-for-all-cluster-types-supported-by-kafka-rest-api-and-terraform-provider

         config = {

         "cleanup.policy"

        = "delete"

         "delete.retention.ms"

         = "86400000"

         "max.compaction.lag.ms"

         = "9223372036854775807"

         "max.message.bytes"

         = "2097164"

         "message.timestamp.difference.max.ms" = "9223372036854775807"

         "message.timestamp.type"

        = "CreateTime"

         "min.compaction.lag.ms"

         = "0"

         "min.insync.replicas"

         = "2"

         "retention.bytes"

         = "-1"

         "retention.ms"

        = "604800000"

         "segment.bytes"

         = "104857600"

         "segment.ms"

        = "604800000"

         }

         credentials {

         key

        = confluent_api_key.app-manager-kafka-api-key.id

         secret = confluent_api_key.app-manager-kafka-api-key.secret

         } } !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom topic settings to set:
        :param pulumi.Input[pulumi.InputType['KafkaTopicCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] http_endpoint: The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] partitions_count: The number of partitions to create in the topic. Defaults to `6`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `<Kafka cluster ID>/<Kafka topic name>`, for exampleOption #1Manage multiple Kafka clusters in the same Terraform workspace $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
        ```

         Option #2Manage a single Kafka cluster in the same Terraform workspace

        ```sh
         $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
        ```

         resource "confluent_kafka_topic" "orders" {

         kafka_cluster {

         id = confluent_kafka_cluster.basic-cluster.id

         }

         topic_name

         = "orders"

         partitions_count

         = 4

         rest_endpoint

        = confluent_kafka_cluster.basic-cluster.rest_endpoint

        # https://docs.confluent.io/cloud/current/clusters/broker-config.html#custom-topic-settings-for-all-cluster-types-supported-by-kafka-rest-api-and-terraform-provider

         config = {

         "cleanup.policy"

        = "delete"

         "delete.retention.ms"

         = "86400000"

         "max.compaction.lag.ms"

         = "9223372036854775807"

         "max.message.bytes"

         = "2097164"

         "message.timestamp.difference.max.ms" = "9223372036854775807"

         "message.timestamp.type"

        = "CreateTime"

         "min.compaction.lag.ms"

         = "0"

         "min.insync.replicas"

         = "2"

         "retention.bytes"

         = "-1"

         "retention.ms"

        = "604800000"

         "segment.bytes"

         = "104857600"

         "segment.ms"

        = "604800000"

         }

         credentials {

         key

        = confluent_api_key.app-manager-kafka-api-key.id

         secret = confluent_api_key.app-manager-kafka-api-key.secret

         } } !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param KafkaTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['KafkaTopicCredentialsArgs']]] = None,
                 http_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaTopicKafkaClusterArgs']]] = None,
                 partitions_count: Optional[pulumi.Input[int]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaTopicArgs.__new__(KafkaTopicArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if http_endpoint is not None and not opts.urn:
                warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
                pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")
            __props__.__dict__["http_endpoint"] = http_endpoint
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            __props__.__dict__["partitions_count"] = partitions_count
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            if topic_name is None and not opts.urn:
                raise TypeError("Missing required property 'topic_name'")
            __props__.__dict__["topic_name"] = topic_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(KafkaTopic, __self__).__init__(
            'confluentcloud:index/kafkaTopic:KafkaTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['KafkaTopicCredentialsArgs']]] = None,
            http_endpoint: Optional[pulumi.Input[str]] = None,
            kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaTopicKafkaClusterArgs']]] = None,
            partitions_count: Optional[pulumi.Input[int]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            topic_name: Optional[pulumi.Input[str]] = None) -> 'KafkaTopic':
        """
        Get an existing KafkaTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom topic settings to set:
        :param pulumi.Input[pulumi.InputType['KafkaTopicCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] http_endpoint: The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] partitions_count: The number of partitions to create in the topic. Defaults to `6`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaTopicState.__new__(_KafkaTopicState)

        __props__.__dict__["config"] = config
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["http_endpoint"] = http_endpoint
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["partitions_count"] = partitions_count
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["topic_name"] = topic_name
        return KafkaTopic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The custom topic settings to set:
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.KafkaTopicCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="httpEndpoint")
    def http_endpoint(self) -> pulumi.Output[str]:
        """
        The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        warnings.warn("""This parameter has been deprecated in favour of Rest Endpoint""", DeprecationWarning)
        pulumi.log.warn("""http_endpoint is deprecated: This parameter has been deprecated in favour of Rest Endpoint""")

        return pulumi.get(self, "http_endpoint")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output[Optional['outputs.KafkaTopicKafkaCluster']]:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter(name="partitionsCount")
    def partitions_count(self) -> pulumi.Output[Optional[int]]:
        """
        The number of partitions to create in the topic. Defaults to `6`.
        """
        return pulumi.get(self, "partitions_count")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Output[str]:
        """
        The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        """
        return pulumi.get(self, "topic_name")

