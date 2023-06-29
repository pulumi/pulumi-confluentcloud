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
    'GetRoleBindingResult',
    'AwaitableGetRoleBindingResult',
    'get_role_binding',
    'get_role_binding_output',
]

@pulumi.output_type
class GetRoleBindingResult:
    """
    A collection of values returned by getRoleBinding.
    """
    def __init__(__self__, crn_pattern=None, id=None, principal=None, role_name=None):
        if crn_pattern and not isinstance(crn_pattern, str):
            raise TypeError("Expected argument 'crn_pattern' to be a str")
        pulumi.set(__self__, "crn_pattern", crn_pattern)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if principal and not isinstance(principal, str):
            raise TypeError("Expected argument 'principal' to be a str")
        pulumi.set(__self__, "principal", principal)
        if role_name and not isinstance(role_name, str):
            raise TypeError("Expected argument 'role_name' to be a str")
        pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter(name="crnPattern")
    def crn_pattern(self) -> str:
        """
        (Required String) A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        """
        return pulumi.get(self, "crn_pattern")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def principal(self) -> str:
        """
        (Required String) A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        """
        return pulumi.get(self, "principal")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        """
        (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        return pulumi.get(self, "role_name")


class AwaitableGetRoleBindingResult(GetRoleBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoleBindingResult(
            crn_pattern=self.crn_pattern,
            id=self.id,
            principal=self.principal,
            role_name=self.role_name)


def get_role_binding(id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoleBindingResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `RoleBinding` describes a Role Binding.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_role_binding = confluentcloud.get_role_binding(id="rb-abc123")
    pulumi.export("example", example_role_binding)
    ```


    :param str id: The ID of the Role Binding (for example, `rb-abc123`).
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getRoleBinding:getRoleBinding', __args__, opts=opts, typ=GetRoleBindingResult).value

    return AwaitableGetRoleBindingResult(
        crn_pattern=pulumi.get(__ret__, 'crn_pattern'),
        id=pulumi.get(__ret__, 'id'),
        principal=pulumi.get(__ret__, 'principal'),
        role_name=pulumi.get(__ret__, 'role_name'))


@_utilities.lift_output_func(get_role_binding)
def get_role_binding_output(id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRoleBindingResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `RoleBinding` describes a Role Binding.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_role_binding = confluentcloud.get_role_binding(id="rb-abc123")
    pulumi.export("example", example_role_binding)
    ```


    :param str id: The ID of the Role Binding (for example, `rb-abc123`).
    """
    ...
