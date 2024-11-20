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
    'GetAccessPointResult',
    'AwaitableGetAccessPointResult',
    'get_access_point',
    'get_access_point_output',
]

@pulumi.output_type
class GetAccessPointResult:
    """
    A collection of values returned by getAccessPoint.
    """
    def __init__(__self__, aws_egress_private_link_endpoints=None, aws_private_network_interfaces=None, azure_egress_private_link_endpoints=None, display_name=None, environment=None, gateways=None, id=None):
        if aws_egress_private_link_endpoints and not isinstance(aws_egress_private_link_endpoints, list):
            raise TypeError("Expected argument 'aws_egress_private_link_endpoints' to be a list")
        pulumi.set(__self__, "aws_egress_private_link_endpoints", aws_egress_private_link_endpoints)
        if aws_private_network_interfaces and not isinstance(aws_private_network_interfaces, list):
            raise TypeError("Expected argument 'aws_private_network_interfaces' to be a list")
        pulumi.set(__self__, "aws_private_network_interfaces", aws_private_network_interfaces)
        if azure_egress_private_link_endpoints and not isinstance(azure_egress_private_link_endpoints, list):
            raise TypeError("Expected argument 'azure_egress_private_link_endpoints' to be a list")
        pulumi.set(__self__, "azure_egress_private_link_endpoints", azure_egress_private_link_endpoints)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="awsEgressPrivateLinkEndpoints")
    def aws_egress_private_link_endpoints(self) -> Sequence['outputs.GetAccessPointAwsEgressPrivateLinkEndpointResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws_egress_private_link_endpoints")

    @property
    @pulumi.getter(name="awsPrivateNetworkInterfaces")
    def aws_private_network_interfaces(self) -> Sequence['outputs.GetAccessPointAwsPrivateNetworkInterfaceResult']:
        """
        (Optional Configuration Block) Supports the following:
        """
        return pulumi.get(self, "aws_private_network_interfaces")

    @property
    @pulumi.getter(name="azureEgressPrivateLinkEndpoints")
    def azure_egress_private_link_endpoints(self) -> Sequence['outputs.GetAccessPointAzureEgressPrivateLinkEndpointResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azure_egress_private_link_endpoints")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Access Point.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetAccessPointEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetAccessPointGatewayResult']:
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "gateways")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the gateway to which the Access Point belongs, for example, `gw-abc123`.
        """
        return pulumi.get(self, "id")


class AwaitableGetAccessPointResult(GetAccessPointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessPointResult(
            aws_egress_private_link_endpoints=self.aws_egress_private_link_endpoints,
            aws_private_network_interfaces=self.aws_private_network_interfaces,
            azure_egress_private_link_endpoints=self.azure_egress_private_link_endpoints,
            display_name=self.display_name,
            environment=self.environment,
            gateways=self.gateways,
            id=self.id)


def get_access_point(environment: Optional[Union['GetAccessPointEnvironmentArgs', 'GetAccessPointEnvironmentArgsDict']] = None,
                     id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessPointResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `AccessPoint` describes a Access Point data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_access_point(id="ap-abc123",
        environment={
            "id": "env-123abc",
        })
    pulumi.export("accessPoint", main)
    ```


    :param str id: The ID of the Access Point, for example, `ap-abc123`.
    """
    __args__ = dict()
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getAccessPoint:getAccessPoint', __args__, opts=opts, typ=GetAccessPointResult).value

    return AwaitableGetAccessPointResult(
        aws_egress_private_link_endpoints=pulumi.get(__ret__, 'aws_egress_private_link_endpoints'),
        aws_private_network_interfaces=pulumi.get(__ret__, 'aws_private_network_interfaces'),
        azure_egress_private_link_endpoints=pulumi.get(__ret__, 'azure_egress_private_link_endpoints'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        gateways=pulumi.get(__ret__, 'gateways'),
        id=pulumi.get(__ret__, 'id'))
def get_access_point_output(environment: Optional[pulumi.Input[Union['GetAccessPointEnvironmentArgs', 'GetAccessPointEnvironmentArgsDict']]] = None,
                            id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessPointResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `AccessPoint` describes a Access Point data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_access_point(id="ap-abc123",
        environment={
            "id": "env-123abc",
        })
    pulumi.export("accessPoint", main)
    ```


    :param str id: The ID of the Access Point, for example, `ap-abc123`.
    """
    __args__ = dict()
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getAccessPoint:getAccessPoint', __args__, opts=opts, typ=GetAccessPointResult)
    return __ret__.apply(lambda __response__: GetAccessPointResult(
        aws_egress_private_link_endpoints=pulumi.get(__response__, 'aws_egress_private_link_endpoints'),
        aws_private_network_interfaces=pulumi.get(__response__, 'aws_private_network_interfaces'),
        azure_egress_private_link_endpoints=pulumi.get(__response__, 'azure_egress_private_link_endpoints'),
        display_name=pulumi.get(__response__, 'display_name'),
        environment=pulumi.get(__response__, 'environment'),
        gateways=pulumi.get(__response__, 'gateways'),
        id=pulumi.get(__response__, 'id')))
