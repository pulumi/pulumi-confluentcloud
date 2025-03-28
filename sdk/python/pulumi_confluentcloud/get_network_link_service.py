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
    'GetNetworkLinkServiceResult',
    'AwaitableGetNetworkLinkServiceResult',
    'get_network_link_service',
    'get_network_link_service_output',
]

@pulumi.output_type
class GetNetworkLinkServiceResult:
    """
    A collection of values returned by getNetworkLinkService.
    """
    def __init__(__self__, accept=None, description=None, display_name=None, environment=None, id=None, networks=None, resource_name=None):
        if accept and not isinstance(accept, dict):
            raise TypeError("Expected argument 'accept' to be a dict")
        pulumi.set(__self__, "accept", accept)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter
    def accept(self) -> 'outputs.GetNetworkLinkServiceAcceptResult':
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "accept")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Optional String) The description of the Network Link Service.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Optional String) The name of the Network Link Service.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetNetworkLinkServiceEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Network that the Network Link Service belongs to, for example, `n-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetNetworkLinkServiceNetworkResult']:
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Network Link Service.
        """
        return pulumi.get(self, "resource_name")


class AwaitableGetNetworkLinkServiceResult(GetNetworkLinkServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkLinkServiceResult(
            accept=self.accept,
            description=self.description,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            networks=self.networks,
            resource_name=self.resource_name)


def get_network_link_service(accept: Optional[Union['GetNetworkLinkServiceAcceptArgs', 'GetNetworkLinkServiceAcceptArgsDict']] = None,
                             display_name: Optional[str] = None,
                             environment: Optional[Union['GetNetworkLinkServiceEnvironmentArgs', 'GetNetworkLinkServiceEnvironmentArgsDict']] = None,
                             id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkLinkServiceResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `NetworkLinkService` describes a Network Link Service data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    nls = confluentcloud.get_network_link_service(id="nls-zyw30",
        environment={
            "id": "env-1234",
        })
    pulumi.export("networkLinkService", nls)
    ```


    :param Union['GetNetworkLinkServiceAcceptArgs', 'GetNetworkLinkServiceAcceptArgsDict'] accept: (Optional Configuration Block) supports the following:
    :param str display_name: The Display Name of the Network Link Service, for example, `DR Link`
    :param str id: The ID of the Network Link Service, for example, `nls-zyw30`.
    """
    __args__ = dict()
    __args__['accept'] = accept
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getNetworkLinkService:getNetworkLinkService', __args__, opts=opts, typ=GetNetworkLinkServiceResult).value

    return AwaitableGetNetworkLinkServiceResult(
        accept=pulumi.get(__ret__, 'accept'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        networks=pulumi.get(__ret__, 'networks'),
        resource_name=pulumi.get(__ret__, 'resource_name'))
def get_network_link_service_output(accept: Optional[pulumi.Input[Optional[Union['GetNetworkLinkServiceAcceptArgs', 'GetNetworkLinkServiceAcceptArgsDict']]]] = None,
                                    display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                    environment: Optional[pulumi.Input[Union['GetNetworkLinkServiceEnvironmentArgs', 'GetNetworkLinkServiceEnvironmentArgsDict']]] = None,
                                    id: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkLinkServiceResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `NetworkLinkService` describes a Network Link Service data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    nls = confluentcloud.get_network_link_service(id="nls-zyw30",
        environment={
            "id": "env-1234",
        })
    pulumi.export("networkLinkService", nls)
    ```


    :param Union['GetNetworkLinkServiceAcceptArgs', 'GetNetworkLinkServiceAcceptArgsDict'] accept: (Optional Configuration Block) supports the following:
    :param str display_name: The Display Name of the Network Link Service, for example, `DR Link`
    :param str id: The ID of the Network Link Service, for example, `nls-zyw30`.
    """
    __args__ = dict()
    __args__['accept'] = accept
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getNetworkLinkService:getNetworkLinkService', __args__, opts=opts, typ=GetNetworkLinkServiceResult)
    return __ret__.apply(lambda __response__: GetNetworkLinkServiceResult(
        accept=pulumi.get(__response__, 'accept'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id'),
        networks=pulumi.get(__response__, 'networks'),
        resource_name=pulumi.get(__response__, 'resource_name')))
