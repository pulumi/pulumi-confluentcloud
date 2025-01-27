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

__all__ = [
    'GetGatewayResult',
    'AwaitableGetGatewayResult',
    'get_gateway',
    'get_gateway_output',
]

@pulumi.output_type
class GetGatewayResult:
    """
    A collection of values returned by getGateway.
    """
    def __init__(__self__, aws_egress_private_link_gateways=None, aws_peering_gateways=None, aws_private_network_interface_gateways=None, azure_egress_private_link_gateways=None, azure_peering_gateways=None, display_name=None, environment=None, gcp_egress_private_service_connect_gateways=None, gcp_peering_gateways=None, id=None):
        if aws_egress_private_link_gateways and not isinstance(aws_egress_private_link_gateways, list):
            raise TypeError("Expected argument 'aws_egress_private_link_gateways' to be a list")
        pulumi.set(__self__, "aws_egress_private_link_gateways", aws_egress_private_link_gateways)
        if aws_peering_gateways and not isinstance(aws_peering_gateways, list):
            raise TypeError("Expected argument 'aws_peering_gateways' to be a list")
        pulumi.set(__self__, "aws_peering_gateways", aws_peering_gateways)
        if aws_private_network_interface_gateways and not isinstance(aws_private_network_interface_gateways, list):
            raise TypeError("Expected argument 'aws_private_network_interface_gateways' to be a list")
        pulumi.set(__self__, "aws_private_network_interface_gateways", aws_private_network_interface_gateways)
        if azure_egress_private_link_gateways and not isinstance(azure_egress_private_link_gateways, list):
            raise TypeError("Expected argument 'azure_egress_private_link_gateways' to be a list")
        pulumi.set(__self__, "azure_egress_private_link_gateways", azure_egress_private_link_gateways)
        if azure_peering_gateways and not isinstance(azure_peering_gateways, list):
            raise TypeError("Expected argument 'azure_peering_gateways' to be a list")
        pulumi.set(__self__, "azure_peering_gateways", azure_peering_gateways)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if gcp_egress_private_service_connect_gateways and not isinstance(gcp_egress_private_service_connect_gateways, list):
            raise TypeError("Expected argument 'gcp_egress_private_service_connect_gateways' to be a list")
        pulumi.set(__self__, "gcp_egress_private_service_connect_gateways", gcp_egress_private_service_connect_gateways)
        if gcp_peering_gateways and not isinstance(gcp_peering_gateways, list):
            raise TypeError("Expected argument 'gcp_peering_gateways' to be a list")
        pulumi.set(__self__, "gcp_peering_gateways", gcp_peering_gateways)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="awsEgressPrivateLinkGateways")
    def aws_egress_private_link_gateways(self) -> Sequence['outputs.GetGatewayAwsEgressPrivateLinkGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_egress_private_link_gateways")

    @property
    @pulumi.getter(name="awsPeeringGateways")
    def aws_peering_gateways(self) -> Sequence['outputs.GetGatewayAwsPeeringGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_peering_gateways")

    @property
    @pulumi.getter(name="awsPrivateNetworkInterfaceGateways")
    def aws_private_network_interface_gateways(self) -> Sequence['outputs.GetGatewayAwsPrivateNetworkInterfaceGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_private_network_interface_gateways")

    @property
    @pulumi.getter(name="azureEgressPrivateLinkGateways")
    def azure_egress_private_link_gateways(self) -> Sequence['outputs.GetGatewayAzureEgressPrivateLinkGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_egress_private_link_gateways")

    @property
    @pulumi.getter(name="azurePeeringGateways")
    def azure_peering_gateways(self) -> Sequence['outputs.GetGatewayAzurePeeringGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_peering_gateways")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Gateway.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetGatewayEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter(name="gcpEgressPrivateServiceConnectGateways")
    def gcp_egress_private_service_connect_gateways(self) -> Sequence['outputs.GetGatewayGcpEgressPrivateServiceConnectGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "gcp_egress_private_service_connect_gateways")

    @property
    @pulumi.getter(name="gcpPeeringGateways")
    def gcp_peering_gateways(self) -> Sequence['outputs.GetGatewayGcpPeeringGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "gcp_peering_gateways")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")


class AwaitableGetGatewayResult(GetGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewayResult(
            aws_egress_private_link_gateways=self.aws_egress_private_link_gateways,
            aws_peering_gateways=self.aws_peering_gateways,
            aws_private_network_interface_gateways=self.aws_private_network_interface_gateways,
            azure_egress_private_link_gateways=self.azure_egress_private_link_gateways,
            azure_peering_gateways=self.azure_peering_gateways,
            display_name=self.display_name,
            environment=self.environment,
            gcp_egress_private_service_connect_gateways=self.gcp_egress_private_service_connect_gateways,
            gcp_peering_gateways=self.gcp_peering_gateways,
            id=self.id)


def get_gateway(environment: Optional[Union['GetGatewayEnvironmentArgs', 'GetGatewayEnvironmentArgsDict']] = None,
                id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewayResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Gateway` describes a Gateway data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_gateway(id="gw-abc123",
        environment={
            "id": "env-123abc",
        })
    pulumi.export("gateway", main)
    ```


    :param str id: The ID of the Gateway, for example, `gw-abc123`.
    """
    __args__ = dict()
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getGateway:getGateway', __args__, opts=opts, typ=GetGatewayResult).value

    return AwaitableGetGatewayResult(
        aws_egress_private_link_gateways=pulumi.get(__ret__, 'aws_egress_private_link_gateways'),
        aws_peering_gateways=pulumi.get(__ret__, 'aws_peering_gateways'),
        aws_private_network_interface_gateways=pulumi.get(__ret__, 'aws_private_network_interface_gateways'),
        azure_egress_private_link_gateways=pulumi.get(__ret__, 'azure_egress_private_link_gateways'),
        azure_peering_gateways=pulumi.get(__ret__, 'azure_peering_gateways'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        gcp_egress_private_service_connect_gateways=pulumi.get(__ret__, 'gcp_egress_private_service_connect_gateways'),
        gcp_peering_gateways=pulumi.get(__ret__, 'gcp_peering_gateways'),
        id=pulumi.get(__ret__, 'id'))
def get_gateway_output(environment: Optional[pulumi.Input[Union['GetGatewayEnvironmentArgs', 'GetGatewayEnvironmentArgsDict']]] = None,
                       id: Optional[pulumi.Input[str]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGatewayResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Gateway` describes a Gateway data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_gateway(id="gw-abc123",
        environment={
            "id": "env-123abc",
        })
    pulumi.export("gateway", main)
    ```


    :param str id: The ID of the Gateway, for example, `gw-abc123`.
    """
    __args__ = dict()
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getGateway:getGateway', __args__, opts=opts, typ=GetGatewayResult)
    return __ret__.apply(lambda __response__: GetGatewayResult(
        aws_egress_private_link_gateways=pulumi.get(__response__, 'aws_egress_private_link_gateways'),
        aws_peering_gateways=pulumi.get(__response__, 'aws_peering_gateways'),
        aws_private_network_interface_gateways=pulumi.get(__response__, 'aws_private_network_interface_gateways'),
        azure_egress_private_link_gateways=pulumi.get(__response__, 'azure_egress_private_link_gateways'),
        azure_peering_gateways=pulumi.get(__response__, 'azure_peering_gateways'),
        display_name=pulumi.get(__response__, 'display_name'),
        environment=pulumi.get(__response__, 'environment'),
        gcp_egress_private_service_connect_gateways=pulumi.get(__response__, 'gcp_egress_private_service_connect_gateways'),
        gcp_peering_gateways=pulumi.get(__response__, 'gcp_peering_gateways'),
        id=pulumi.get(__response__, 'id')))
