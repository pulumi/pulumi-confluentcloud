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
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, api_version=None, email=None, full_name=None, id=None, kind=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if full_name and not isinstance(full_name, str):
            raise TypeError("Expected argument 'full_name' to be a str")
        pulumi.set(__self__, "full_name", full_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the schema version of the User.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        (Required String) The email address of the User.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> str:
        """
        (Required String) The full name of the User.
        """
        return pulumi.get(self, "full_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the User, for example, `u-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the User.
        """
        return pulumi.get(self, "kind")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            api_version=self.api_version,
            email=self.email,
            full_name=self.full_name,
            id=self.id,
            kind=self.kind)


def get_user(email: Optional[str] = None,
             full_name: Optional[str] = None,
             id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `get_user` describes a User data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_user = confluentcloud.get_user(id="u-abc123")
    pulumi.export("exampleUsingId", example_using_id_user)
    example_using_email = confluentcloud.get_user(email="test123@gmail.com")
    test_env = confluentcloud.Environment("test-env")
    standard_cluster_on_aws = confluentcloud.KafkaCluster("standard-cluster-on-aws",
        availability="SINGLE_ZONE",
        cloud="AWS",
        region="us-west-2",
        standard=confluentcloud.KafkaClusterStandardArgs(),
        environment=confluentcloud.KafkaClusterEnvironmentArgs(
            id=test_env.id,
        ))
    test_role_binding = confluentcloud.RoleBinding("test-role-binding",
        principal=f"User:{example_using_email.id}",
        role_name="CloudClusterAdmin",
        crn_pattern=standard_cluster_on_aws.rbac_crn)
    example_using_full_name = confluentcloud.get_user(full_name="John Doe")
    ```
    <!--End PulumiCodeChooser -->


    :param str email: The email address of the User.
           
           > **Note:** Exactly one from the `id`, `full_name` and `email` attributes must be specified.
    :param str full_name: The full name of the User.
    :param str id: The ID of the User (e.g., `u-abc123`).
    """
    __args__ = dict()
    __args__['email'] = email
    __args__['fullName'] = full_name
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        email=pulumi.get(__ret__, 'email'),
        full_name=pulumi.get(__ret__, 'full_name'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'))


@_utilities.lift_output_func(get_user)
def get_user_output(email: Optional[pulumi.Input[Optional[str]]] = None,
                    full_name: Optional[pulumi.Input[Optional[str]]] = None,
                    id: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `get_user` describes a User data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_user = confluentcloud.get_user(id="u-abc123")
    pulumi.export("exampleUsingId", example_using_id_user)
    example_using_email = confluentcloud.get_user(email="test123@gmail.com")
    test_env = confluentcloud.Environment("test-env")
    standard_cluster_on_aws = confluentcloud.KafkaCluster("standard-cluster-on-aws",
        availability="SINGLE_ZONE",
        cloud="AWS",
        region="us-west-2",
        standard=confluentcloud.KafkaClusterStandardArgs(),
        environment=confluentcloud.KafkaClusterEnvironmentArgs(
            id=test_env.id,
        ))
    test_role_binding = confluentcloud.RoleBinding("test-role-binding",
        principal=f"User:{example_using_email.id}",
        role_name="CloudClusterAdmin",
        crn_pattern=standard_cluster_on_aws.rbac_crn)
    example_using_full_name = confluentcloud.get_user(full_name="John Doe")
    ```
    <!--End PulumiCodeChooser -->


    :param str email: The email address of the User.
           
           > **Note:** Exactly one from the `id`, `full_name` and `email` attributes must be specified.
    :param str full_name: The full name of the User.
    :param str id: The ID of the User (e.g., `u-abc123`).
    """
    ...
