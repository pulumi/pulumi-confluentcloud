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
    'GetPrivateLinkAccessResult',
    'AwaitableGetPrivateLinkAccessResult',
    'get_private_link_access',
    'get_private_link_access_output',
]

@pulumi.output_type
class GetPrivateLinkAccessResult:
    """
    A collection of values returned by getPrivateLinkAccess.
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
    def aws(self) -> Sequence['outputs.GetPrivateLinkAccessAwResult']:
        """
        (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> Sequence['outputs.GetPrivateLinkAccessAzureResult']:
        """
        (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Optional String) The name of the Private Link Access.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetPrivateLinkAccessEnvironmentResult':
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcps(self) -> Sequence['outputs.GetPrivateLinkAccessGcpResult']:
        """
        (Optional Configuration Block) The GCP-specific Private Service Connect details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetPrivateLinkAccessNetworkResult']:
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "networks")


class AwaitableGetPrivateLinkAccessResult(GetPrivateLinkAccessResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateLinkAccessResult(
            aws=self.aws,
            azures=self.azures,
            display_name=self.display_name,
            environment=self.environment,
            gcps=self.gcps,
            id=self.id,
            networks=self.networks)


def get_private_link_access(display_name: Optional[str] = None,
                            environment: Optional[pulumi.InputType['GetPrivateLinkAccessEnvironmentArgs']] = None,
                            id: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateLinkAccessResult:
    """
    [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `PrivateLinkAccess` describes a Private Link Access data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_private_link_access = confluentcloud.get_private_link_access(id="pla-abc123",
        environment=confluentcloud.GetPrivateLinkAccessEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_private_link_access)
    example_using_name_private_link_access = confluentcloud.get_private_link_access(display_name="my_pla",
        environment=confluentcloud.GetPrivateLinkAccessEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_private_link_access)
    ```
    <!--End PulumiCodeChooser -->


    :param str display_name: A human-readable name for the Private Link Access.
    :param pulumi.InputType['GetPrivateLinkAccessEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess', __args__, opts=opts, typ=GetPrivateLinkAccessResult).value

    return AwaitableGetPrivateLinkAccessResult(
        aws=pulumi.get(__ret__, 'aws'),
        azures=pulumi.get(__ret__, 'azures'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        gcps=pulumi.get(__ret__, 'gcps'),
        id=pulumi.get(__ret__, 'id'),
        networks=pulumi.get(__ret__, 'networks'))


@_utilities.lift_output_func(get_private_link_access)
def get_private_link_access_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                   environment: Optional[pulumi.Input[pulumi.InputType['GetPrivateLinkAccessEnvironmentArgs']]] = None,
                                   id: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivateLinkAccessResult]:
    """
    [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `PrivateLinkAccess` describes a Private Link Access data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_private_link_access = confluentcloud.get_private_link_access(id="pla-abc123",
        environment=confluentcloud.GetPrivateLinkAccessEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_private_link_access)
    example_using_name_private_link_access = confluentcloud.get_private_link_access(display_name="my_pla",
        environment=confluentcloud.GetPrivateLinkAccessEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_private_link_access)
    ```
    <!--End PulumiCodeChooser -->


    :param str display_name: A human-readable name for the Private Link Access.
    :param pulumi.InputType['GetPrivateLinkAccessEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    ...
