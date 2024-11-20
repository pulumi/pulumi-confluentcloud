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

__all__ = ['AccessPointArgs', 'AccessPoint']

@pulumi.input_type
class AccessPointArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['AccessPointEnvironmentArgs'],
                 gateway: pulumi.Input['AccessPointGatewayArgs'],
                 aws_egress_private_link_endpoint: Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']] = None,
                 aws_private_network_interface: Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']] = None,
                 azure_egress_private_link_endpoint: Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessPoint resource.
        :param pulumi.Input['AccessPointEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs'] aws_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs'] aws_private_network_interface: (Optional Configuration Block) supports the following:
        :param pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs'] azure_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[str] display_name: The name of the Access Point.
        """
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "gateway", gateway)
        if aws_egress_private_link_endpoint is not None:
            pulumi.set(__self__, "aws_egress_private_link_endpoint", aws_egress_private_link_endpoint)
        if aws_private_network_interface is not None:
            pulumi.set(__self__, "aws_private_network_interface", aws_private_network_interface)
        if azure_egress_private_link_endpoint is not None:
            pulumi.set(__self__, "azure_egress_private_link_endpoint", azure_egress_private_link_endpoint)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['AccessPointEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['AccessPointEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Input['AccessPointGatewayArgs']:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: pulumi.Input['AccessPointGatewayArgs']):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="awsEgressPrivateLinkEndpoint")
    def aws_egress_private_link_endpoint(self) -> Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_egress_private_link_endpoint")

    @aws_egress_private_link_endpoint.setter
    def aws_egress_private_link_endpoint(self, value: Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']]):
        pulumi.set(self, "aws_egress_private_link_endpoint", value)

    @property
    @pulumi.getter(name="awsPrivateNetworkInterface")
    def aws_private_network_interface(self) -> Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_private_network_interface")

    @aws_private_network_interface.setter
    def aws_private_network_interface(self, value: Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']]):
        pulumi.set(self, "aws_private_network_interface", value)

    @property
    @pulumi.getter(name="azureEgressPrivateLinkEndpoint")
    def azure_egress_private_link_endpoint(self) -> Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_egress_private_link_endpoint")

    @azure_egress_private_link_endpoint.setter
    def azure_egress_private_link_endpoint(self, value: Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']]):
        pulumi.set(self, "azure_egress_private_link_endpoint", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Access Point.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _AccessPointState:
    def __init__(__self__, *,
                 aws_egress_private_link_endpoint: Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']] = None,
                 aws_private_network_interface: Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']] = None,
                 azure_egress_private_link_endpoint: Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['AccessPointEnvironmentArgs']] = None,
                 gateway: Optional[pulumi.Input['AccessPointGatewayArgs']] = None):
        """
        Input properties used for looking up and filtering AccessPoint resources.
        :param pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs'] aws_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs'] aws_private_network_interface: (Optional Configuration Block) supports the following:
        :param pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs'] azure_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[str] display_name: The name of the Access Point.
        :param pulumi.Input['AccessPointEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        if aws_egress_private_link_endpoint is not None:
            pulumi.set(__self__, "aws_egress_private_link_endpoint", aws_egress_private_link_endpoint)
        if aws_private_network_interface is not None:
            pulumi.set(__self__, "aws_private_network_interface", aws_private_network_interface)
        if azure_egress_private_link_endpoint is not None:
            pulumi.set(__self__, "azure_egress_private_link_endpoint", azure_egress_private_link_endpoint)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter(name="awsEgressPrivateLinkEndpoint")
    def aws_egress_private_link_endpoint(self) -> Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_egress_private_link_endpoint")

    @aws_egress_private_link_endpoint.setter
    def aws_egress_private_link_endpoint(self, value: Optional[pulumi.Input['AccessPointAwsEgressPrivateLinkEndpointArgs']]):
        pulumi.set(self, "aws_egress_private_link_endpoint", value)

    @property
    @pulumi.getter(name="awsPrivateNetworkInterface")
    def aws_private_network_interface(self) -> Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_private_network_interface")

    @aws_private_network_interface.setter
    def aws_private_network_interface(self, value: Optional[pulumi.Input['AccessPointAwsPrivateNetworkInterfaceArgs']]):
        pulumi.set(self, "aws_private_network_interface", value)

    @property
    @pulumi.getter(name="azureEgressPrivateLinkEndpoint")
    def azure_egress_private_link_endpoint(self) -> Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_egress_private_link_endpoint")

    @azure_egress_private_link_endpoint.setter
    def azure_egress_private_link_endpoint(self, value: Optional[pulumi.Input['AccessPointAzureEgressPrivateLinkEndpointArgs']]):
        pulumi.set(self, "azure_egress_private_link_endpoint", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Access Point.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['AccessPointEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['AccessPointEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input['AccessPointGatewayArgs']]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input['AccessPointGatewayArgs']]):
        pulumi.set(self, "gateway", value)


class AccessPoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAwsEgressPrivateLinkEndpointArgs', 'AccessPointAwsEgressPrivateLinkEndpointArgsDict']]] = None,
                 aws_private_network_interface: Optional[pulumi.Input[Union['AccessPointAwsPrivateNetworkInterfaceArgs', 'AccessPointAwsPrivateNetworkInterfaceArgsDict']]] = None,
                 azure_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAzureEgressPrivateLinkEndpointArgs', 'AccessPointAzureEgressPrivateLinkEndpointArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['AccessPointEnvironmentArgs', 'AccessPointEnvironmentArgsDict']]] = None,
                 gateway: Optional[pulumi.Input[Union['AccessPointGatewayArgs', 'AccessPointGatewayArgsDict']]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `AccessPoint` provides a Access Point resource that enables creating, editing, and deleting Access Points on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws = confluentcloud.AccessPoint("aws",
            display_name="access_point",
            environment={
                "id": development.id,
            },
            gateway={
                "id": main["gateway"][0]["id"],
            },
            aws_egress_private_link_endpoint={
                "vpc_endpoint_service_name": "com.amazonaws.vpce.us-west-2.vpce-svc-00000000000000000",
            })
        azure = confluentcloud.AccessPoint("azure",
            display_name="access_point",
            environment={
                "id": development.id,
            },
            gateway={
                "id": main["gateway"][0]["id"],
            },
            azure_egress_private_link_endpoint={
                "private_link_service_resource_id": "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/s-abcde/providers/Microsoft.Network/privateLinkServices/pls-plt-abcdef-az3",
                "private_link_subresource_name": "sqlServer",
            })
        ```

        ## Import

        You can import a Access Point by using Environment ID and Access Point ID, in the format `<Environment ID>/<Access Point ID>`. The following example shows how to import a Access Point:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/accessPoint:AccessPoint main env-abc123/ap-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AccessPointAwsEgressPrivateLinkEndpointArgs', 'AccessPointAwsEgressPrivateLinkEndpointArgsDict']] aws_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Union['AccessPointAwsPrivateNetworkInterfaceArgs', 'AccessPointAwsPrivateNetworkInterfaceArgsDict']] aws_private_network_interface: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Union['AccessPointAzureEgressPrivateLinkEndpointArgs', 'AccessPointAzureEgressPrivateLinkEndpointArgsDict']] azure_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[str] display_name: The name of the Access Point.
        :param pulumi.Input[Union['AccessPointEnvironmentArgs', 'AccessPointEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessPointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `AccessPoint` provides a Access Point resource that enables creating, editing, and deleting Access Points on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws = confluentcloud.AccessPoint("aws",
            display_name="access_point",
            environment={
                "id": development.id,
            },
            gateway={
                "id": main["gateway"][0]["id"],
            },
            aws_egress_private_link_endpoint={
                "vpc_endpoint_service_name": "com.amazonaws.vpce.us-west-2.vpce-svc-00000000000000000",
            })
        azure = confluentcloud.AccessPoint("azure",
            display_name="access_point",
            environment={
                "id": development.id,
            },
            gateway={
                "id": main["gateway"][0]["id"],
            },
            azure_egress_private_link_endpoint={
                "private_link_service_resource_id": "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/s-abcde/providers/Microsoft.Network/privateLinkServices/pls-plt-abcdef-az3",
                "private_link_subresource_name": "sqlServer",
            })
        ```

        ## Import

        You can import a Access Point by using Environment ID and Access Point ID, in the format `<Environment ID>/<Access Point ID>`. The following example shows how to import a Access Point:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/accessPoint:AccessPoint main env-abc123/ap-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param AccessPointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessPointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAwsEgressPrivateLinkEndpointArgs', 'AccessPointAwsEgressPrivateLinkEndpointArgsDict']]] = None,
                 aws_private_network_interface: Optional[pulumi.Input[Union['AccessPointAwsPrivateNetworkInterfaceArgs', 'AccessPointAwsPrivateNetworkInterfaceArgsDict']]] = None,
                 azure_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAzureEgressPrivateLinkEndpointArgs', 'AccessPointAzureEgressPrivateLinkEndpointArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['AccessPointEnvironmentArgs', 'AccessPointEnvironmentArgsDict']]] = None,
                 gateway: Optional[pulumi.Input[Union['AccessPointGatewayArgs', 'AccessPointGatewayArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessPointArgs.__new__(AccessPointArgs)

            __props__.__dict__["aws_egress_private_link_endpoint"] = aws_egress_private_link_endpoint
            __props__.__dict__["aws_private_network_interface"] = aws_private_network_interface
            __props__.__dict__["azure_egress_private_link_endpoint"] = azure_egress_private_link_endpoint
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if gateway is None and not opts.urn:
                raise TypeError("Missing required property 'gateway'")
            __props__.__dict__["gateway"] = gateway
        super(AccessPoint, __self__).__init__(
            'confluentcloud:index/accessPoint:AccessPoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAwsEgressPrivateLinkEndpointArgs', 'AccessPointAwsEgressPrivateLinkEndpointArgsDict']]] = None,
            aws_private_network_interface: Optional[pulumi.Input[Union['AccessPointAwsPrivateNetworkInterfaceArgs', 'AccessPointAwsPrivateNetworkInterfaceArgsDict']]] = None,
            azure_egress_private_link_endpoint: Optional[pulumi.Input[Union['AccessPointAzureEgressPrivateLinkEndpointArgs', 'AccessPointAzureEgressPrivateLinkEndpointArgsDict']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[Union['AccessPointEnvironmentArgs', 'AccessPointEnvironmentArgsDict']]] = None,
            gateway: Optional[pulumi.Input[Union['AccessPointGatewayArgs', 'AccessPointGatewayArgsDict']]] = None) -> 'AccessPoint':
        """
        Get an existing AccessPoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['AccessPointAwsEgressPrivateLinkEndpointArgs', 'AccessPointAwsEgressPrivateLinkEndpointArgsDict']] aws_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Union['AccessPointAwsPrivateNetworkInterfaceArgs', 'AccessPointAwsPrivateNetworkInterfaceArgsDict']] aws_private_network_interface: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Union['AccessPointAzureEgressPrivateLinkEndpointArgs', 'AccessPointAzureEgressPrivateLinkEndpointArgsDict']] azure_egress_private_link_endpoint: (Optional Configuration Block) supports the following:
        :param pulumi.Input[str] display_name: The name of the Access Point.
        :param pulumi.Input[Union['AccessPointEnvironmentArgs', 'AccessPointEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessPointState.__new__(_AccessPointState)

        __props__.__dict__["aws_egress_private_link_endpoint"] = aws_egress_private_link_endpoint
        __props__.__dict__["aws_private_network_interface"] = aws_private_network_interface
        __props__.__dict__["azure_egress_private_link_endpoint"] = azure_egress_private_link_endpoint
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["gateway"] = gateway
        return AccessPoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsEgressPrivateLinkEndpoint")
    def aws_egress_private_link_endpoint(self) -> pulumi.Output[Optional['outputs.AccessPointAwsEgressPrivateLinkEndpoint']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_egress_private_link_endpoint")

    @property
    @pulumi.getter(name="awsPrivateNetworkInterface")
    def aws_private_network_interface(self) -> pulumi.Output[Optional['outputs.AccessPointAwsPrivateNetworkInterface']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_private_network_interface")

    @property
    @pulumi.getter(name="azureEgressPrivateLinkEndpoint")
    def azure_egress_private_link_endpoint(self) -> pulumi.Output[Optional['outputs.AccessPointAzureEgressPrivateLinkEndpoint']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_egress_private_link_endpoint")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Access Point.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.AccessPointEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output['outputs.AccessPointGateway']:
        return pulumi.get(self, "gateway")

