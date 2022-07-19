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
    'GetPeeringResult',
    'AwaitableGetPeeringResult',
    'get_peering',
    'get_peering_output',
]

@pulumi.output_type
class GetPeeringResult:
    """
    A collection of values returned by getPeering.
    """
    def __init__(__self__, aws=None, azures=None, display_name=None, environment=None, gcps=None, id=None, networks=None):
        if aws and not isinstance(aws, list):
            raise TypeError("Expected argument 'aws' to be a list")
        pulumi.set(__self__, "aws", aws)
        if azures and not isinstance(azures, list):
            raise TypeError("Expected argument 'azures' to be a list")
        pulumi.set(__self__, "azures", azures)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if gcps and not isinstance(gcps, list):
            raise TypeError("Expected argument 'gcps' to be a list")
        pulumi.set(__self__, "gcps", gcps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetPeeringAwResult']:
        """
        (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> Sequence['outputs.GetPeeringAzureResult']:
        """
        (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Optional String) The name of the Peering.
        - `environment` (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetPeeringEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcps(self) -> Sequence['outputs.GetPeeringGcpResult']:
        """
        (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetPeeringNetworkResult']:
        return pulumi.get(self, "networks")


class AwaitableGetPeeringResult(GetPeeringResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPeeringResult(
            aws=self.aws,
            azures=self.azures,
            display_name=self.display_name,
            environment=self.environment,
            gcps=self.gcps,
            id=self.id,
            networks=self.networks)


def get_peering(display_name: Optional[str] = None,
                environment: Optional[pulumi.InputType['GetPeeringEnvironmentArgs']] = None,
                id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPeeringResult:
    """
    <img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt="">

    `Peering` describes a Peering data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_peering = confluentcloud.get_peering(id="peer-abc123",
        environment=confluentcloud.GetPeeringEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_peering)
    example_using_name_peering = confluentcloud.get_peering(display_name="my_peering",
        environment=confluentcloud.GetPeeringEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_peering)
    ```


    :param str display_name: A human-readable name for the Peering.
    :param str id: The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getPeering:getPeering', __args__, opts=opts, typ=GetPeeringResult).value

    return AwaitableGetPeeringResult(
        aws=__ret__.aws,
        azures=__ret__.azures,
        display_name=__ret__.display_name,
        environment=__ret__.environment,
        gcps=__ret__.gcps,
        id=__ret__.id,
        networks=__ret__.networks)


@_utilities.lift_output_func(get_peering)
def get_peering_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                       environment: Optional[pulumi.Input[pulumi.InputType['GetPeeringEnvironmentArgs']]] = None,
                       id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPeeringResult]:
    """
    <img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt="">

    `Peering` describes a Peering data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_peering = confluentcloud.get_peering(id="peer-abc123",
        environment=confluentcloud.GetPeeringEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_peering)
    example_using_name_peering = confluentcloud.get_peering(display_name="my_peering",
        environment=confluentcloud.GetPeeringEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_peering)
    ```


    :param str display_name: A human-readable name for the Peering.
    :param str id: The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
    """
    ...
