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

__all__ = ['NetworkLinkEndpointArgs', 'NetworkLinkEndpoint']

@pulumi.input_type
class NetworkLinkEndpointArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['NetworkLinkEndpointEnvironmentArgs'],
                 network: pulumi.Input['NetworkLinkEndpointNetworkArgs'],
                 network_link_service: pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs'],
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NetworkLinkEndpoint resource.
        :param pulumi.Input['NetworkLinkEndpointEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['NetworkLinkEndpointNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] description: The description of the Network Link Endpoint.
        :param pulumi.Input[str] display_name: The name of the Network Link Endpoint.
        """
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "network_link_service", network_link_service)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['NetworkLinkEndpointEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['NetworkLinkEndpointEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['NetworkLinkEndpointNetworkArgs']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['NetworkLinkEndpointNetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="networkLinkService")
    def network_link_service(self) -> pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs']:
        return pulumi.get(self, "network_link_service")

    @network_link_service.setter
    def network_link_service(self, value: pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs']):
        pulumi.set(self, "network_link_service", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Network Link Endpoint.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network Link Endpoint.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _NetworkLinkEndpointState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['NetworkLinkEndpointEnvironmentArgs']] = None,
                 network: Optional[pulumi.Input['NetworkLinkEndpointNetworkArgs']] = None,
                 network_link_service: Optional[pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs']] = None,
                 resource_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkLinkEndpoint resources.
        :param pulumi.Input[str] description: The description of the Network Link Endpoint.
        :param pulumi.Input[str] display_name: The name of the Network Link Endpoint.
        :param pulumi.Input['NetworkLinkEndpointEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['NetworkLinkEndpointNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Network Link Endpoint.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if network_link_service is not None:
            pulumi.set(__self__, "network_link_service", network_link_service)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Network Link Endpoint.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network Link Endpoint.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['NetworkLinkEndpointEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['NetworkLinkEndpointEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['NetworkLinkEndpointNetworkArgs']]:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['NetworkLinkEndpointNetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="networkLinkService")
    def network_link_service(self) -> Optional[pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs']]:
        return pulumi.get(self, "network_link_service")

    @network_link_service.setter
    def network_link_service(self, value: Optional[pulumi.Input['NetworkLinkEndpointNetworkLinkServiceArgs']]):
        pulumi.set(self, "network_link_service", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Network Link Endpoint.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)


class NetworkLinkEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['NetworkLinkEndpointEnvironmentArgs', 'NetworkLinkEndpointEnvironmentArgsDict']]] = None,
                 network: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkArgs', 'NetworkLinkEndpointNetworkArgsDict']]] = None,
                 network_link_service: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkLinkServiceArgs', 'NetworkLinkEndpointNetworkLinkServiceArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        nle = confluentcloud.NetworkLinkEndpoint("nle",
            display_name="nle1",
            description="TEST-NLE1",
            environment={
                "id": "env-xyz456",
            },
            network={
                "id": "n-abc123",
            },
            network_link_service={
                "id": "nls-g3e1ox",
            })
        pulumi.export("networkLinkEndpoint", nle)
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `NetworkLinkEndpoint` resource:
        * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks

        ## Import

        You can import a Network Link Endpoint by using Environment ID and Network Link Endpoint ID, in the format `<Environment ID>/<Network Link Endpoint ID>`. The following example shows how to import a Network Link Endpoint:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint my_nle env-abc123/nle-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Network Link Endpoint.
        :param pulumi.Input[str] display_name: The name of the Network Link Endpoint.
        :param pulumi.Input[Union['NetworkLinkEndpointEnvironmentArgs', 'NetworkLinkEndpointEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Union['NetworkLinkEndpointNetworkArgs', 'NetworkLinkEndpointNetworkArgsDict']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkLinkEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        nle = confluentcloud.NetworkLinkEndpoint("nle",
            display_name="nle1",
            description="TEST-NLE1",
            environment={
                "id": "env-xyz456",
            },
            network={
                "id": "n-abc123",
            },
            network_link_service={
                "id": "nls-g3e1ox",
            })
        pulumi.export("networkLinkEndpoint", nle)
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `NetworkLinkEndpoint` resource:
        * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks

        ## Import

        You can import a Network Link Endpoint by using Environment ID and Network Link Endpoint ID, in the format `<Environment ID>/<Network Link Endpoint ID>`. The following example shows how to import a Network Link Endpoint:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint my_nle env-abc123/nle-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param NetworkLinkEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkLinkEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['NetworkLinkEndpointEnvironmentArgs', 'NetworkLinkEndpointEnvironmentArgsDict']]] = None,
                 network: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkArgs', 'NetworkLinkEndpointNetworkArgsDict']]] = None,
                 network_link_service: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkLinkServiceArgs', 'NetworkLinkEndpointNetworkLinkServiceArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkLinkEndpointArgs.__new__(NetworkLinkEndpointArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            if network_link_service is None and not opts.urn:
                raise TypeError("Missing required property 'network_link_service'")
            __props__.__dict__["network_link_service"] = network_link_service
            __props__.__dict__["resource_name"] = None
        super(NetworkLinkEndpoint, __self__).__init__(
            'confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[Union['NetworkLinkEndpointEnvironmentArgs', 'NetworkLinkEndpointEnvironmentArgsDict']]] = None,
            network: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkArgs', 'NetworkLinkEndpointNetworkArgsDict']]] = None,
            network_link_service: Optional[pulumi.Input[Union['NetworkLinkEndpointNetworkLinkServiceArgs', 'NetworkLinkEndpointNetworkLinkServiceArgsDict']]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None) -> 'NetworkLinkEndpoint':
        """
        Get an existing NetworkLinkEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Network Link Endpoint.
        :param pulumi.Input[str] display_name: The name of the Network Link Endpoint.
        :param pulumi.Input[Union['NetworkLinkEndpointEnvironmentArgs', 'NetworkLinkEndpointEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Union['NetworkLinkEndpointNetworkArgs', 'NetworkLinkEndpointNetworkArgsDict']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Network Link Endpoint.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkLinkEndpointState.__new__(_NetworkLinkEndpointState)

        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["network"] = network
        __props__.__dict__["network_link_service"] = network_link_service
        __props__.__dict__["resource_name"] = resource_name_
        return NetworkLinkEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the Network Link Endpoint.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Network Link Endpoint.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.NetworkLinkEndpointEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.NetworkLinkEndpointNetwork']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="networkLinkService")
    def network_link_service(self) -> pulumi.Output['outputs.NetworkLinkEndpointNetworkLinkService']:
        return pulumi.get(self, "network_link_service")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Network Link Endpoint.
        """
        return pulumi.get(self, "resource_name")

