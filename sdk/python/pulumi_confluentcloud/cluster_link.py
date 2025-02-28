# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['ClusterLinkArgs', 'ClusterLink']

@pulumi.input_type
class ClusterLinkArgs:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connection_mode: Optional[pulumi.Input[str]] = None,
                 destination_kafka_cluster: Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']] = None,
                 link: Optional[pulumi.Input[str]] = None,
                 link_mode: Optional[pulumi.Input[str]] = None,
                 local_kafka_cluster: Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']] = None,
                 remote_kafka_cluster: Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']] = None,
                 source_kafka_cluster: Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']] = None):
        """
        The set of arguments for constructing a ClusterLink resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom cluster link settings to set:
        :param pulumi.Input[str] connection_mode: The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        :param pulumi.Input[str] link: The name of the cluster link, for example, `my-cluster-link`.
        :param pulumi.Input[str] link_mode: The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if connection_mode is not None:
            pulumi.set(__self__, "connection_mode", connection_mode)
        if destination_kafka_cluster is not None:
            pulumi.set(__self__, "destination_kafka_cluster", destination_kafka_cluster)
        if link is not None:
            pulumi.set(__self__, "link", link)
        if link_mode is not None:
            pulumi.set(__self__, "link_mode", link_mode)
        if local_kafka_cluster is not None:
            pulumi.set(__self__, "local_kafka_cluster", local_kafka_cluster)
        if remote_kafka_cluster is not None:
            pulumi.set(__self__, "remote_kafka_cluster", remote_kafka_cluster)
        if source_kafka_cluster is not None:
            pulumi.set(__self__, "source_kafka_cluster", source_kafka_cluster)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The custom cluster link settings to set:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="connectionMode")
    def connection_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        """
        return pulumi.get(self, "connection_mode")

    @connection_mode.setter
    def connection_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_mode", value)

    @property
    @pulumi.getter(name="destinationKafkaCluster")
    def destination_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']]:
        return pulumi.get(self, "destination_kafka_cluster")

    @destination_kafka_cluster.setter
    def destination_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']]):
        pulumi.set(self, "destination_kafka_cluster", value)

    @property
    @pulumi.getter
    def link(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cluster link, for example, `my-cluster-link`.
        """
        return pulumi.get(self, "link")

    @link.setter
    def link(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link", value)

    @property
    @pulumi.getter(name="linkMode")
    def link_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        return pulumi.get(self, "link_mode")

    @link_mode.setter
    def link_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_mode", value)

    @property
    @pulumi.getter(name="localKafkaCluster")
    def local_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']]:
        return pulumi.get(self, "local_kafka_cluster")

    @local_kafka_cluster.setter
    def local_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']]):
        pulumi.set(self, "local_kafka_cluster", value)

    @property
    @pulumi.getter(name="remoteKafkaCluster")
    def remote_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']]:
        return pulumi.get(self, "remote_kafka_cluster")

    @remote_kafka_cluster.setter
    def remote_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']]):
        pulumi.set(self, "remote_kafka_cluster", value)

    @property
    @pulumi.getter(name="sourceKafkaCluster")
    def source_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']]:
        return pulumi.get(self, "source_kafka_cluster")

    @source_kafka_cluster.setter
    def source_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']]):
        pulumi.set(self, "source_kafka_cluster", value)


@pulumi.input_type
class _ClusterLinkState:
    def __init__(__self__, *,
                 cluster_link_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connection_mode: Optional[pulumi.Input[str]] = None,
                 destination_kafka_cluster: Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']] = None,
                 link: Optional[pulumi.Input[str]] = None,
                 link_mode: Optional[pulumi.Input[str]] = None,
                 local_kafka_cluster: Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']] = None,
                 remote_kafka_cluster: Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']] = None,
                 source_kafka_cluster: Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']] = None):
        """
        Input properties used for looking up and filtering ClusterLink resources.
        :param pulumi.Input[str] cluster_link_id: (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom cluster link settings to set:
        :param pulumi.Input[str] connection_mode: The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        :param pulumi.Input[str] link: The name of the cluster link, for example, `my-cluster-link`.
        :param pulumi.Input[str] link_mode: The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        if cluster_link_id is not None:
            pulumi.set(__self__, "cluster_link_id", cluster_link_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if connection_mode is not None:
            pulumi.set(__self__, "connection_mode", connection_mode)
        if destination_kafka_cluster is not None:
            pulumi.set(__self__, "destination_kafka_cluster", destination_kafka_cluster)
        if link is not None:
            pulumi.set(__self__, "link", link)
        if link_mode is not None:
            pulumi.set(__self__, "link_mode", link_mode)
        if local_kafka_cluster is not None:
            pulumi.set(__self__, "local_kafka_cluster", local_kafka_cluster)
        if remote_kafka_cluster is not None:
            pulumi.set(__self__, "remote_kafka_cluster", remote_kafka_cluster)
        if source_kafka_cluster is not None:
            pulumi.set(__self__, "source_kafka_cluster", source_kafka_cluster)

    @property
    @pulumi.getter(name="clusterLinkId")
    def cluster_link_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
        """
        return pulumi.get(self, "cluster_link_id")

    @cluster_link_id.setter
    def cluster_link_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_link_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The custom cluster link settings to set:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="connectionMode")
    def connection_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        """
        return pulumi.get(self, "connection_mode")

    @connection_mode.setter
    def connection_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_mode", value)

    @property
    @pulumi.getter(name="destinationKafkaCluster")
    def destination_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']]:
        return pulumi.get(self, "destination_kafka_cluster")

    @destination_kafka_cluster.setter
    def destination_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkDestinationKafkaClusterArgs']]):
        pulumi.set(self, "destination_kafka_cluster", value)

    @property
    @pulumi.getter
    def link(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cluster link, for example, `my-cluster-link`.
        """
        return pulumi.get(self, "link")

    @link.setter
    def link(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link", value)

    @property
    @pulumi.getter(name="linkMode")
    def link_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        return pulumi.get(self, "link_mode")

    @link_mode.setter
    def link_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_mode", value)

    @property
    @pulumi.getter(name="localKafkaCluster")
    def local_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']]:
        return pulumi.get(self, "local_kafka_cluster")

    @local_kafka_cluster.setter
    def local_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkLocalKafkaClusterArgs']]):
        pulumi.set(self, "local_kafka_cluster", value)

    @property
    @pulumi.getter(name="remoteKafkaCluster")
    def remote_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']]:
        return pulumi.get(self, "remote_kafka_cluster")

    @remote_kafka_cluster.setter
    def remote_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkRemoteKafkaClusterArgs']]):
        pulumi.set(self, "remote_kafka_cluster", value)

    @property
    @pulumi.getter(name="sourceKafkaCluster")
    def source_kafka_cluster(self) -> Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']]:
        return pulumi.get(self, "source_kafka_cluster")

    @source_kafka_cluster.setter
    def source_kafka_cluster(self, value: Optional[pulumi.Input['ClusterLinkSourceKafkaClusterArgs']]):
        pulumi.set(self, "source_kafka_cluster", value)


class ClusterLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connection_mode: Optional[pulumi.Input[str]] = None,
                 destination_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkDestinationKafkaClusterArgs', 'ClusterLinkDestinationKafkaClusterArgsDict']]] = None,
                 link: Optional[pulumi.Input[str]] = None,
                 link_mode: Optional[pulumi.Input[str]] = None,
                 local_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkLocalKafkaClusterArgs', 'ClusterLinkLocalKafkaClusterArgsDict']]] = None,
                 remote_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkRemoteKafkaClusterArgs', 'ClusterLinkRemoteKafkaClusterArgsDict']]] = None,
                 source_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkSourceKafkaClusterArgs', 'ClusterLinkSourceKafkaClusterArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        # https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode
        east_to_west = confluentcloud.ClusterLink("east-to-west",
            link="bidirectional-link",
            link_mode="BIDIRECTIONAL",
            local_kafka_cluster={
                "id": east["id"],
                "rest_endpoint": east["restEndpoint"],
                "credentials": {
                    "key": app_manager_east_cluster_api_key["id"],
                    "secret": app_manager_east_cluster_api_key["secret"],
                },
            },
            remote_kafka_cluster={
                "id": west["id"],
                "bootstrap_endpoint": west["bootstrapEndpoint"],
                "credentials": {
                    "key": app_manager_west_cluster_api_key["id"],
                    "secret": app_manager_west_cluster_api_key["secret"],
                },
            })
        west_to_east = confluentcloud.ClusterLink("west-to-east",
            link="bidirectional-link",
            link_mode="BIDIRECTIONAL",
            local_kafka_cluster={
                "id": west["id"],
                "rest_endpoint": west["restEndpoint"],
                "credentials": {
                    "key": app_manager_west_cluster_api_key["id"],
                    "secret": app_manager_west_cluster_api_key["secret"],
                },
            },
            remote_kafka_cluster={
                "id": east["id"],
                "bootstrap_endpoint": east["bootstrapEndpoint"],
                "credentials": {
                    "key": app_manager_east_cluster_api_key["id"],
                    "secret": app_manager_east_cluster_api_key["secret"],
                },
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ClusterLink` resource:
          * `destination-initiated-cluster-link-rbac`: An example of setting up a _destination_ initiated cluster link with a mirror topic
          * `source-initiated-cluster-link-rbac`: An example of setting up a _source_ initiated cluster link with a mirror topic
          * `regular-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics
          * `advanced-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics ([advanced option](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode))

        See [Cluster Linking on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/index.html) to learn more about Cluster Linking on Confluent Cloud.

        ## Import

        You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode,

        source (or local for bidirectional cluster links) Kafka cluster ID, and destination (or remote  for bidirectional cluster links) Kafka cluster ID, in the format `<Cluster link name>/<Cluster link mode>/<Cluster connection mode>/<Source (Local) Kafka cluster ID>/<Destination (Remote) Kafka cluster ID>`, for example:

        Option #1 when using source-initiated or destination-initiated cluster links

        $ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="<source_kafka_bootstrap_endpoint>"

        $ export IMPORT_SOURCE_KAFKA_API_KEY="<source_kafka_api_key>"

        $ export IMPORT_SOURCE_KAFKA_API_SECRET="<source_kafka_api_secret>"

        $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="<destination_kafka_rest_endpoint>"

        $ export IMPORT_DESTINATION_KAFKA_API_KEY="<destination_kafka_api_key>"

        $ export IMPORT_DESTINATION_KAFKA_API_SECRET="<destination_kafka_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
        ```

        Option #2 when using bidirectional cluster links

        $ export IMPORT_LOCAL_KAFKA_BOOTSTRAP_ENDPOINT="<local_kafka_bootstrap_endpoint>"

        $ export IMPORT_LOCAL_KAFKA_API_KEY="<local_kafka_api_key>"

        $ export IMPORT_LOCAL_KAFKA_API_SECRET="<local_kafka_api_secret>"

        $ export IMPORT_REMOTE_KAFKA_REST_ENDPOINT="<remote_kafka_rest_endpoint>"

        $ export IMPORT_REMOTE_KAFKA_API_KEY="<remote_kafka_api_key>"

        $ export IMPORT_REMOTE_KAFKA_API_SECRET="<remote_kafka_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/BIDIRECTIONAL/OUTBOUND/lkc-abc123/lkc-xyz456
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom cluster link settings to set:
        :param pulumi.Input[str] connection_mode: The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        :param pulumi.Input[str] link: The name of the cluster link, for example, `my-cluster-link`.
        :param pulumi.Input[str] link_mode: The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ClusterLinkArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        # https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode
        east_to_west = confluentcloud.ClusterLink("east-to-west",
            link="bidirectional-link",
            link_mode="BIDIRECTIONAL",
            local_kafka_cluster={
                "id": east["id"],
                "rest_endpoint": east["restEndpoint"],
                "credentials": {
                    "key": app_manager_east_cluster_api_key["id"],
                    "secret": app_manager_east_cluster_api_key["secret"],
                },
            },
            remote_kafka_cluster={
                "id": west["id"],
                "bootstrap_endpoint": west["bootstrapEndpoint"],
                "credentials": {
                    "key": app_manager_west_cluster_api_key["id"],
                    "secret": app_manager_west_cluster_api_key["secret"],
                },
            })
        west_to_east = confluentcloud.ClusterLink("west-to-east",
            link="bidirectional-link",
            link_mode="BIDIRECTIONAL",
            local_kafka_cluster={
                "id": west["id"],
                "rest_endpoint": west["restEndpoint"],
                "credentials": {
                    "key": app_manager_west_cluster_api_key["id"],
                    "secret": app_manager_west_cluster_api_key["secret"],
                },
            },
            remote_kafka_cluster={
                "id": east["id"],
                "bootstrap_endpoint": east["bootstrapEndpoint"],
                "credentials": {
                    "key": app_manager_east_cluster_api_key["id"],
                    "secret": app_manager_east_cluster_api_key["secret"],
                },
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ClusterLink` resource:
          * `destination-initiated-cluster-link-rbac`: An example of setting up a _destination_ initiated cluster link with a mirror topic
          * `source-initiated-cluster-link-rbac`: An example of setting up a _source_ initiated cluster link with a mirror topic
          * `regular-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics
          * `advanced-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics ([advanced option](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode))

        See [Cluster Linking on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/index.html) to learn more about Cluster Linking on Confluent Cloud.

        ## Import

        You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode,

        source (or local for bidirectional cluster links) Kafka cluster ID, and destination (or remote  for bidirectional cluster links) Kafka cluster ID, in the format `<Cluster link name>/<Cluster link mode>/<Cluster connection mode>/<Source (Local) Kafka cluster ID>/<Destination (Remote) Kafka cluster ID>`, for example:

        Option #1 when using source-initiated or destination-initiated cluster links

        $ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="<source_kafka_bootstrap_endpoint>"

        $ export IMPORT_SOURCE_KAFKA_API_KEY="<source_kafka_api_key>"

        $ export IMPORT_SOURCE_KAFKA_API_SECRET="<source_kafka_api_secret>"

        $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="<destination_kafka_rest_endpoint>"

        $ export IMPORT_DESTINATION_KAFKA_API_KEY="<destination_kafka_api_key>"

        $ export IMPORT_DESTINATION_KAFKA_API_SECRET="<destination_kafka_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
        ```

        Option #2 when using bidirectional cluster links

        $ export IMPORT_LOCAL_KAFKA_BOOTSTRAP_ENDPOINT="<local_kafka_bootstrap_endpoint>"

        $ export IMPORT_LOCAL_KAFKA_API_KEY="<local_kafka_api_key>"

        $ export IMPORT_LOCAL_KAFKA_API_SECRET="<local_kafka_api_secret>"

        $ export IMPORT_REMOTE_KAFKA_REST_ENDPOINT="<remote_kafka_rest_endpoint>"

        $ export IMPORT_REMOTE_KAFKA_API_KEY="<remote_kafka_api_key>"

        $ export IMPORT_REMOTE_KAFKA_API_SECRET="<remote_kafka_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/BIDIRECTIONAL/OUTBOUND/lkc-abc123/lkc-xyz456
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param ClusterLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 connection_mode: Optional[pulumi.Input[str]] = None,
                 destination_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkDestinationKafkaClusterArgs', 'ClusterLinkDestinationKafkaClusterArgsDict']]] = None,
                 link: Optional[pulumi.Input[str]] = None,
                 link_mode: Optional[pulumi.Input[str]] = None,
                 local_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkLocalKafkaClusterArgs', 'ClusterLinkLocalKafkaClusterArgsDict']]] = None,
                 remote_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkRemoteKafkaClusterArgs', 'ClusterLinkRemoteKafkaClusterArgsDict']]] = None,
                 source_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkSourceKafkaClusterArgs', 'ClusterLinkSourceKafkaClusterArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterLinkArgs.__new__(ClusterLinkArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["connection_mode"] = connection_mode
            __props__.__dict__["destination_kafka_cluster"] = destination_kafka_cluster
            __props__.__dict__["link"] = link
            __props__.__dict__["link_mode"] = link_mode
            __props__.__dict__["local_kafka_cluster"] = local_kafka_cluster
            __props__.__dict__["remote_kafka_cluster"] = remote_kafka_cluster
            __props__.__dict__["source_kafka_cluster"] = source_kafka_cluster
            __props__.__dict__["cluster_link_id"] = None
        super(ClusterLink, __self__).__init__(
            'confluentcloud:index/clusterLink:ClusterLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_link_id: Optional[pulumi.Input[str]] = None,
            config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            connection_mode: Optional[pulumi.Input[str]] = None,
            destination_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkDestinationKafkaClusterArgs', 'ClusterLinkDestinationKafkaClusterArgsDict']]] = None,
            link: Optional[pulumi.Input[str]] = None,
            link_mode: Optional[pulumi.Input[str]] = None,
            local_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkLocalKafkaClusterArgs', 'ClusterLinkLocalKafkaClusterArgsDict']]] = None,
            remote_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkRemoteKafkaClusterArgs', 'ClusterLinkRemoteKafkaClusterArgsDict']]] = None,
            source_kafka_cluster: Optional[pulumi.Input[Union['ClusterLinkSourceKafkaClusterArgs', 'ClusterLinkSourceKafkaClusterArgsDict']]] = None) -> 'ClusterLink':
        """
        Get an existing ClusterLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_link_id: (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: The custom cluster link settings to set:
        :param pulumi.Input[str] connection_mode: The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        :param pulumi.Input[str] link: The name of the cluster link, for example, `my-cluster-link`.
        :param pulumi.Input[str] link_mode: The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterLinkState.__new__(_ClusterLinkState)

        __props__.__dict__["cluster_link_id"] = cluster_link_id
        __props__.__dict__["config"] = config
        __props__.__dict__["connection_mode"] = connection_mode
        __props__.__dict__["destination_kafka_cluster"] = destination_kafka_cluster
        __props__.__dict__["link"] = link
        __props__.__dict__["link_mode"] = link_mode
        __props__.__dict__["local_kafka_cluster"] = local_kafka_cluster
        __props__.__dict__["remote_kafka_cluster"] = remote_kafka_cluster
        __props__.__dict__["source_kafka_cluster"] = source_kafka_cluster
        return ClusterLink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterLinkId")
    def cluster_link_id(self) -> pulumi.Output[str]:
        """
        (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
        """
        return pulumi.get(self, "cluster_link_id")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The custom cluster link settings to set:
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="connectionMode")
    def connection_mode(self) -> pulumi.Output[Optional[str]]:
        """
        The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        """
        return pulumi.get(self, "connection_mode")

    @property
    @pulumi.getter(name="destinationKafkaCluster")
    def destination_kafka_cluster(self) -> pulumi.Output[Optional['outputs.ClusterLinkDestinationKafkaCluster']]:
        return pulumi.get(self, "destination_kafka_cluster")

    @property
    @pulumi.getter
    def link(self) -> pulumi.Output[str]:
        """
        The name of the cluster link, for example, `my-cluster-link`.
        """
        return pulumi.get(self, "link")

    @property
    @pulumi.getter(name="linkMode")
    def link_mode(self) -> pulumi.Output[Optional[str]]:
        """
        The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        """
        return pulumi.get(self, "link_mode")

    @property
    @pulumi.getter(name="localKafkaCluster")
    def local_kafka_cluster(self) -> pulumi.Output[Optional['outputs.ClusterLinkLocalKafkaCluster']]:
        return pulumi.get(self, "local_kafka_cluster")

    @property
    @pulumi.getter(name="remoteKafkaCluster")
    def remote_kafka_cluster(self) -> pulumi.Output[Optional['outputs.ClusterLinkRemoteKafkaCluster']]:
        return pulumi.get(self, "remote_kafka_cluster")

    @property
    @pulumi.getter(name="sourceKafkaCluster")
    def source_kafka_cluster(self) -> pulumi.Output[Optional['outputs.ClusterLinkSourceKafkaCluster']]:
        return pulumi.get(self, "source_kafka_cluster")

