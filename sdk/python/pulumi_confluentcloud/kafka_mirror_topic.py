# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
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
                 mirror_topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a KafkaMirrorTopic resource.
        :param pulumi.Input[builtins.str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        pulumi.set(__self__, "cluster_link", cluster_link)
        pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        pulumi.set(__self__, "source_kafka_topic", source_kafka_topic)
        if mirror_topic_name is not None:
            pulumi.set(__self__, "mirror_topic_name", mirror_topic_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

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
    def mirror_topic_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        return pulumi.get(self, "mirror_topic_name")

    @mirror_topic_name.setter
    def mirror_topic_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mirror_topic_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _KafkaMirrorTopicState:
    def __init__(__self__, *,
                 cluster_link: Optional[pulumi.Input['KafkaMirrorTopicClusterLinkArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaMirrorTopicKafkaClusterArgs']] = None,
                 mirror_topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 source_kafka_topic: Optional[pulumi.Input['KafkaMirrorTopicSourceKafkaTopicArgs']] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering KafkaMirrorTopic resources.
        :param pulumi.Input[builtins.str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        if cluster_link is not None:
            pulumi.set(__self__, "cluster_link", cluster_link)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if mirror_topic_name is not None:
            pulumi.set(__self__, "mirror_topic_name", mirror_topic_name)
        if source_kafka_topic is not None:
            pulumi.set(__self__, "source_kafka_topic", source_kafka_topic)
        if status is not None:
            pulumi.set(__self__, "status", status)

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
    def mirror_topic_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        return pulumi.get(self, "mirror_topic_name")

    @mirror_topic_name.setter
    def mirror_topic_name(self, value: Optional[pulumi.Input[builtins.str]]):
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
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic")
class KafkaMirrorTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_link: Optional[pulumi.Input[Union['KafkaMirrorTopicClusterLinkArgs', 'KafkaMirrorTopicClusterLinkArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['KafkaMirrorTopicKafkaClusterArgs', 'KafkaMirrorTopicKafkaClusterArgsDict']]] = None,
                 mirror_topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 source_kafka_topic: Optional[pulumi.Input[Union['KafkaMirrorTopicSourceKafkaTopicArgs', 'KafkaMirrorTopicSourceKafkaTopicArgsDict']]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.KafkaMirrorTopic("example",
            source_kafka_topic={
                "topic_name": "orders",
            },
            cluster_link={
                "link_name": source_outbound["linkName"],
            },
            kafka_cluster={
                "id": destination["id"],
                "rest_endpoint": destination["restEndpoint"],
                "credentials": {
                    "key": app_manager_destination_cluster_api_key["id"],
                    "secret": app_manager_destination_cluster_api_key["secret"],
                },
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `KafkaMirrorTopic` resource:
          * destination-initiated-cluster-link-rbac: An example of setting up a _destination_ initiated cluster link with a mirror topic
          * source-initiated-cluster-link-rbac: An example of setting up a _source_ initiated cluster link with a mirror topic

        See [Mirror Topics on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/mirror-topics-cc.html) to learn more about Mirror Topics on Confluent Cloud.

        ## Import

        You can import a Kafka mirror topic by using the Kafka cluster ID, cluster link name, and Kafka topic name in the format `<Kafka cluster ID>/<Cluster link name>/<Kafka topic name>`, for example:

        $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>"

        $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>"

        $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic my_mirror_topic lkc-abc123/my-cluster-link/orders-123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaMirrorTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.KafkaMirrorTopic("example",
            source_kafka_topic={
                "topic_name": "orders",
            },
            cluster_link={
                "link_name": source_outbound["linkName"],
            },
            kafka_cluster={
                "id": destination["id"],
                "rest_endpoint": destination["restEndpoint"],
                "credentials": {
                    "key": app_manager_destination_cluster_api_key["id"],
                    "secret": app_manager_destination_cluster_api_key["secret"],
                },
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `KafkaMirrorTopic` resource:
          * destination-initiated-cluster-link-rbac: An example of setting up a _destination_ initiated cluster link with a mirror topic
          * source-initiated-cluster-link-rbac: An example of setting up a _source_ initiated cluster link with a mirror topic

        See [Mirror Topics on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/mirror-topics-cc.html) to learn more about Mirror Topics on Confluent Cloud.

        ## Import

        You can import a Kafka mirror topic by using the Kafka cluster ID, cluster link name, and Kafka topic name in the format `<Kafka cluster ID>/<Cluster link name>/<Kafka topic name>`, for example:

        $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>"

        $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>"

        $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_link: Optional[pulumi.Input[Union['KafkaMirrorTopicClusterLinkArgs', 'KafkaMirrorTopicClusterLinkArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['KafkaMirrorTopicKafkaClusterArgs', 'KafkaMirrorTopicKafkaClusterArgsDict']]] = None,
                 mirror_topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 source_kafka_topic: Optional[pulumi.Input[Union['KafkaMirrorTopicSourceKafkaTopicArgs', 'KafkaMirrorTopicSourceKafkaTopicArgsDict']]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaMirrorTopicArgs.__new__(KafkaMirrorTopicArgs)

            if cluster_link is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_link'")
            __props__.__dict__["cluster_link"] = cluster_link
            if kafka_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'kafka_cluster'")
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            __props__.__dict__["mirror_topic_name"] = mirror_topic_name
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
            cluster_link: Optional[pulumi.Input[Union['KafkaMirrorTopicClusterLinkArgs', 'KafkaMirrorTopicClusterLinkArgsDict']]] = None,
            kafka_cluster: Optional[pulumi.Input[Union['KafkaMirrorTopicKafkaClusterArgs', 'KafkaMirrorTopicKafkaClusterArgsDict']]] = None,
            mirror_topic_name: Optional[pulumi.Input[builtins.str]] = None,
            source_kafka_topic: Optional[pulumi.Input[Union['KafkaMirrorTopicSourceKafkaTopicArgs', 'KafkaMirrorTopicSourceKafkaTopicArgsDict']]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None) -> 'KafkaMirrorTopic':
        """
        Get an existing KafkaMirrorTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] mirror_topic_name: The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `<prefix>` is configured for the cluster link, the mirror topic name has to be of the format `<prefix><source_topic_name>`.
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
    def mirror_topic_name(self) -> pulumi.Output[builtins.str]:
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
    def status(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "status")

