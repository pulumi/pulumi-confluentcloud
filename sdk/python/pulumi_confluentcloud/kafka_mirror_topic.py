# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['KafkaMirrorTopicArgs', 'KafkaMirrorTopic']

@pulumi.input_type
class KafkaMirrorTopicArgs:
    def __init__(__self__, *,
                 cluster_link: pulumi.Input['KafkaMirrorTopicClusterLinkArgs'],
                 kafka_cluster: pulumi.Input['KafkaMirrorTopicKafkaClusterArgs'],
                 source_kafka_topic: pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs'],
                 mirror_topic_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KafkaMirrorTopic resource.
        :param pulumi.Input[str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        KafkaMirrorTopicArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_link=cluster_link,
            kafka_cluster=kafka_cluster,
            source_kafka_topic=source_kafka_topic,
            mirror_topic_name=mirror_topic_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_link: Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']] = None,
             kafka_cluster: Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']] = None,
             source_kafka_topic: Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']] = None,
             mirror_topic_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_link is None and 'clusterLink' in kwargs:
            cluster_link = kwargs['clusterLink']
        if cluster_link is None:
            raise TypeError("Missing 'cluster_link' argument")
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if kafka_cluster is None:
            raise TypeError("Missing 'kafka_cluster' argument")
        if source_kafka_topic is None and 'sourceKafkaTopic' in kwargs:
            source_kafka_topic = kwargs['sourceKafkaTopic']
        if source_kafka_topic is None:
            raise TypeError("Missing 'source_kafka_topic' argument")
        if mirror_topic_name is None and 'mirrorTopicName' in kwargs:
            mirror_topic_name = kwargs['mirrorTopicName']

        _setter("cluster_link", cluster_link)
        _setter("kafka_cluster", kafka_cluster)
        _setter("source_kafka_topic", source_kafka_topic)
        if mirror_topic_name is not None:
            _setter("mirror_topic_name", mirror_topic_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="clusterLink")
    def cluster_link(self) -> pulumi.Input['KafkaMirrorTopicClusterLinkArgs']:
        return pulumi.get(self, "cluster_link")

    @cluster_link.setter
    def cluster_link(self, value: pulumi.Input['KafkaMirrorTopicClusterLinkArgs']):
        pulumi.set(self, "cluster_link", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="sourceKafkaTopic")
    def source_kafka_topic(self) -> pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']:
        return pulumi.get(self, "source_kafka_topic")

    @source_kafka_topic.setter
    def source_kafka_topic(self, value: pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']):
        pulumi.set(self, "source_kafka_topic", value)

    @property
    @pulumi.getter(name="mirrorTopicName")
    def mirror_topic_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        return pulumi.get(self, "mirror_topic_name")

    @mirror_topic_name.setter
    def mirror_topic_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mirror_topic_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _KafkaMirrorTopicState:
    def __init__(__self__, *,
                 cluster_link: Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']] = None,
                 mirror_topic_name: Optional[pulumi.Input[str]] = None,
                 source_kafka_topic: Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KafkaMirrorTopic resources.
        :param pulumi.Input[str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        _KafkaMirrorTopicState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_link=cluster_link,
            kafka_cluster=kafka_cluster,
            mirror_topic_name=mirror_topic_name,
            source_kafka_topic=source_kafka_topic,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_link: Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']] = None,
             kafka_cluster: Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']] = None,
             mirror_topic_name: Optional[pulumi.Input[str]] = None,
             source_kafka_topic: Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_link is None and 'clusterLink' in kwargs:
            cluster_link = kwargs['clusterLink']
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if mirror_topic_name is None and 'mirrorTopicName' in kwargs:
            mirror_topic_name = kwargs['mirrorTopicName']
        if source_kafka_topic is None and 'sourceKafkaTopic' in kwargs:
            source_kafka_topic = kwargs['sourceKafkaTopic']

        if cluster_link is not None:
            _setter("cluster_link", cluster_link)
        if kafka_cluster is not None:
            _setter("kafka_cluster", kafka_cluster)
        if mirror_topic_name is not None:
            _setter("mirror_topic_name", mirror_topic_name)
        if source_kafka_topic is not None:
            _setter("source_kafka_topic", source_kafka_topic)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="clusterLink")
    def cluster_link(self) -> Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']]:
        return pulumi.get(self, "cluster_link")

    @cluster_link.setter
    def cluster_link(self, value: Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']]):
        pulumi.set(self, "cluster_link", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="mirrorTopicName")
    def mirror_topic_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        return pulumi.get(self, "mirror_topic_name")

    @mirror_topic_name.setter
    def mirror_topic_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mirror_topic_name", value)

    @property
    @pulumi.getter(name="sourceKafkaTopic")
    def source_kafka_topic(self) -> Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']]:
        return pulumi.get(self, "source_kafka_topic")

    @source_kafka_topic.setter
    def source_kafka_topic(self, value: Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']]):
        pulumi.set(self, "source_kafka_topic", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class KafkaMirrorTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_link: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicClusterLinkArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicKafkaClusterArgs']]] = None,
                 mirror_topic_name: Optional[pulumi.Input[str]] = None,
                 source_kafka_topic: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicSourceKafkaTopicArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Kafka mirror topic by using the Kafka cluster ID, cluster link name, and Kafka topic name in the format `<Kafka cluster ID>/<Cluster link name>/<Kafka topic name>`, for example$ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic my_mirror_topic lkc-abc123/my-cluster-link/orders-123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaMirrorTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Kafka mirror topic by using the Kafka cluster ID, cluster link name, and Kafka topic name in the format `<Kafka cluster ID>/<Cluster link name>/<Kafka topic name>`, for example$ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic my_mirror_topic lkc-abc123/my-cluster-link/orders-123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param KafkaMirrorTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaMirrorTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KafkaMirrorTopicArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_link: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicClusterLinkArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicKafkaClusterArgs']]] = None,
                 mirror_topic_name: Optional[pulumi.Input[str]] = None,
                 source_kafka_topic: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicSourceKafkaTopicArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaMirrorTopicArgs.__new__(KafkaMirrorTopicArgs)

            cluster_link = _utilities.configure(cluster_link, KafkaMirrorTopicClusterLinkArgs, True)
            if cluster_link is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_link'")
            __props__.__dict__["cluster_link"] = cluster_link
            kafka_cluster = _utilities.configure(kafka_cluster, KafkaMirrorTopicKafkaClusterArgs, True)
            if kafka_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'kafka_cluster'")
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            __props__.__dict__["mirror_topic_name"] = mirror_topic_name
            source_kafka_topic = _utilities.configure(source_kafka_topic, KafkaMirrorTopicSourceKafkaTopicArgs, True)
            if source_kafka_topic is None and not opts.urn:
                raise TypeError("Missing required property 'source_kafka_topic'")
            __props__.__dict__["source_kafka_topic"] = source_kafka_topic
            __props__.__dict__["status"] = status
        super(KafkaMirrorTopic, __self__).__init__(
            'confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_link: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicClusterLinkArgs']]] = None,
            kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicKafkaClusterArgs']]] = None,
            mirror_topic_name: Optional[pulumi.Input[str]] = None,
            source_kafka_topic: Optional[pulumi.Input[pulumi.InputType['KafkaMirrorTopicSourceKafkaTopicArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'KafkaMirrorTopic':
        """
        Get an existing KafkaMirrorTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaMirrorTopicState.__new__(_KafkaMirrorTopicState)

        __props__.__dict__["cluster_link"] = cluster_link
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["mirror_topic_name"] = mirror_topic_name
        __props__.__dict__["source_kafka_topic"] = source_kafka_topic
        __props__.__dict__["status"] = status
        return KafkaMirrorTopic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterLink")
    def cluster_link(self) -> pulumi.Output['outputs.KafkaMirrorTopicClusterLink']:
        return pulumi.get(self, "cluster_link")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output['outputs.KafkaMirrorTopicKafkaCluster']:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter(name="mirrorTopicName")
    def mirror_topic_name(self) -> pulumi.Output[str]:
        """
        The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        return pulumi.get(self, "mirror_topic_name")

    @property
    @pulumi.getter(name="sourceKafkaTopic")
    def source_kafka_topic(self) -> pulumi.Output['outputs.KafkaMirrorTopicSourceKafkaTopic']:
        return pulumi.get(self, "source_kafka_topic")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

