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

__all__ = [
    'GetKafkaTopicResult',
    'AwaitableGetKafkaTopicResult',
    'get_kafka_topic',
    'get_kafka_topic_output',
]

@pulumi.output_type
class GetKafkaTopicResult:
    """
    A collection of values returned by getKafkaTopic.
    """
    def __init__(__self__, config=None, credentials=None, id=None, kafka_cluster=None, partitions_count=None, rest_endpoint=None, topic_name=None):
        if config and not isinstance(config, dict):
            raise TypeError("Expected argument 'config' to be a dict")
        pulumi.set(__self__, "config", config)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kafka_cluster and not isinstance(kafka_cluster, dict):
            raise TypeError("Expected argument 'kafka_cluster' to be a dict")
        pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if partitions_count and not isinstance(partitions_count, int):
            raise TypeError("Expected argument 'partitions_count' to be a int")
        pulumi.set(__self__, "partitions_count", partitions_count)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if topic_name and not isinstance(topic_name, str):
            raise TypeError("Expected argument 'topic_name' to be a str")
        pulumi.set(__self__, "topic_name", topic_name)

    @property
    @pulumi.getter
    def config(self) -> Mapping[str, str]:
        """
        (Optional Map) The custom topic settings:
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetKafkaTopicCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional['outputs.GetKafkaTopicKafkaClusterResult']:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter(name="partitionsCount")
    def partitions_count(self) -> int:
        """
        (Required Number) The number of partitions to create in the topic. Defaults to `6`.
        """
        return pulumi.get(self, "partitions_count")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> str:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> str:
        return pulumi.get(self, "topic_name")


class AwaitableGetKafkaTopicResult(GetKafkaTopicResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKafkaTopicResult(
            config=self.config,
            credentials=self.credentials,
            id=self.id,
            kafka_cluster=self.kafka_cluster,
            partitions_count=self.partitions_count,
            rest_endpoint=self.rest_endpoint,
            topic_name=self.topic_name)


def get_kafka_topic(credentials: Optional[Union['GetKafkaTopicCredentialsArgs', 'GetKafkaTopicCredentialsArgsDict']] = None,
                    kafka_cluster: Optional[Union['GetKafkaTopicKafkaClusterArgs', 'GetKafkaTopicKafkaClusterArgsDict']] = None,
                    rest_endpoint: Optional[str] = None,
                    topic_name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKafkaTopicResult:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['kafkaCluster'] = kafka_cluster
    __args__['restEndpoint'] = rest_endpoint
    __args__['topicName'] = topic_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getKafkaTopic:getKafkaTopic', __args__, opts=opts, typ=GetKafkaTopicResult).value

    return AwaitableGetKafkaTopicResult(
        config=pulumi.get(__ret__, 'config'),
        credentials=pulumi.get(__ret__, 'credentials'),
        id=pulumi.get(__ret__, 'id'),
        kafka_cluster=pulumi.get(__ret__, 'kafka_cluster'),
        partitions_count=pulumi.get(__ret__, 'partitions_count'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        topic_name=pulumi.get(__ret__, 'topic_name'))


@_utilities.lift_output_func(get_kafka_topic)
def get_kafka_topic_output(credentials: Optional[pulumi.Input[Optional[Union['GetKafkaTopicCredentialsArgs', 'GetKafkaTopicCredentialsArgsDict']]]] = None,
                           kafka_cluster: Optional[pulumi.Input[Optional[Union['GetKafkaTopicKafkaClusterArgs', 'GetKafkaTopicKafkaClusterArgsDict']]]] = None,
                           rest_endpoint: Optional[pulumi.Input[str]] = None,
                           topic_name: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKafkaTopicResult]:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str topic_name: The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
    """
    ...
