# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetEnvironmentResult',
    'AwaitableGetEnvironmentResult',
    'get_environment',
    'get_environment_output',
]

@pulumi.output_type
class GetEnvironmentResult:
    """
    A collection of values returned by getEnvironment.
    """
    def __init__(__self__, display_name=None, id=None, resource_name=None):
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Environment.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Environment, for example, `env-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        return pulumi.get(self, "resource_name")


class AwaitableGetEnvironmentResult(GetEnvironmentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnvironmentResult(
            display_name=self.display_name,
            id=self.id,
            resource_name=self.resource_name)


def get_environment(display_name: Optional[str] = None,
                    id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnvironmentResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Environment` describes an Environment data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_environment = confluentcloud.get_environment(id="env-abc123")
    pulumi.export("exampleUsingId", example_using_id_environment)
    example_using_name_environment = confluentcloud.get_environment(display_name="stag")
    example_using_name_service_account = confluentcloud.get_service_account(display_name="test_sa")
    test_role_binding = confluentcloud.RoleBinding("test-role-binding",
        principal=f"User:{example_using_name_service_account.id}",
        role_name="EnvironmentAdmin",
        crn_pattern=example_using_name_environment.resource_name)
    ```


    :param str display_name: A human-readable name for the Environment.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param str id: The ID of the Environment, for example, `env-abc123`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getEnvironment:getEnvironment', __args__, opts=opts, typ=GetEnvironmentResult).value

    return AwaitableGetEnvironmentResult(
        display_name=pulumi.get(__ret__, 'display_name'),
        id=pulumi.get(__ret__, 'id'),
        resource_name=pulumi.get(__ret__, 'resource_name'))


@_utilities.lift_output_func(get_environment)
def get_environment_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                           id: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnvironmentResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Environment` describes an Environment data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_environment = confluentcloud.get_environment(id="env-abc123")
    pulumi.export("exampleUsingId", example_using_id_environment)
    example_using_name_environment = confluentcloud.get_environment(display_name="stag")
    example_using_name_service_account = confluentcloud.get_service_account(display_name="test_sa")
    test_role_binding = confluentcloud.RoleBinding("test-role-binding",
        principal=f"User:{example_using_name_service_account.id}",
        role_name="EnvironmentAdmin",
        crn_pattern=example_using_name_environment.resource_name)
    ```


    :param str display_name: A human-readable name for the Environment.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param str id: The ID of the Environment, for example, `env-abc123`.
    """
    ...
