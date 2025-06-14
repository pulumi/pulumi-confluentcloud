# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['RoleBindingArgs', 'RoleBinding']

@pulumi.input_type
class RoleBindingArgs:
    def __init__(__self__, *,
                 crn_pattern: pulumi.Input[builtins.str],
                 principal: pulumi.Input[builtins.str],
                 role_name: pulumi.Input[builtins.str],
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a RoleBinding resource.
        :param pulumi.Input[builtins.str] crn_pattern: A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        :param pulumi.Input[builtins.str] principal: A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        :param pulumi.Input[builtins.str] role_name: A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        pulumi.set(__self__, "crn_pattern", crn_pattern)
        pulumi.set(__self__, "principal", principal)
        pulumi.set(__self__, "role_name", role_name)
        if disable_wait_for_ready is not None:
            pulumi.set(__self__, "disable_wait_for_ready", disable_wait_for_ready)

    @property
    @pulumi.getter(name="crnPattern")
    def crn_pattern(self) -> pulumi.Input[builtins.str]:
        """
        A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        """
        return pulumi.get(self, "crn_pattern")

    @crn_pattern.setter
    def crn_pattern(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "crn_pattern", value)

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Input[builtins.str]:
        """
        A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[builtins.str]:
        """
        A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "disable_wait_for_ready")

    @disable_wait_for_ready.setter
    def disable_wait_for_ready(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "disable_wait_for_ready", value)


@pulumi.input_type
class _RoleBindingState:
    def __init__(__self__, *,
                 crn_pattern: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 principal: Optional[pulumi.Input[builtins.str]] = None,
                 role_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering RoleBinding resources.
        :param pulumi.Input[builtins.str] crn_pattern: A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        :param pulumi.Input[builtins.str] principal: A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        :param pulumi.Input[builtins.str] role_name: A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        if crn_pattern is not None:
            pulumi.set(__self__, "crn_pattern", crn_pattern)
        if disable_wait_for_ready is not None:
            pulumi.set(__self__, "disable_wait_for_ready", disable_wait_for_ready)
        if principal is not None:
            pulumi.set(__self__, "principal", principal)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter(name="crnPattern")
    def crn_pattern(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        """
        return pulumi.get(self, "crn_pattern")

    @crn_pattern.setter
    def crn_pattern(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "crn_pattern", value)

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "disable_wait_for_ready")

    @disable_wait_for_ready.setter
    def disable_wait_for_ready(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "disable_wait_for_ready", value)

    @property
    @pulumi.getter
    def principal(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "role_name", value)


@pulumi.type_token("confluentcloud:index/roleBinding:RoleBinding")
class RoleBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 crn_pattern: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 principal: Optional[pulumi.Input[builtins.str]] = None,
                 role_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `RoleBinding` provides a Role Binding resource that enables creating, reading, and deleting role bindings on Confluent Cloud.

        > **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).

        ## Example of using time_sleep

        This configuration introduces a 360-second custom delay after the creation of a role binding, before creating a Kafka topic.

        For context, using `disable_wait_for_ready = false` (the default setting) results in a 90-second hardcoded delay, while opting for `disable_wait_for_ready = true` results in a 0-second delay.

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud
        import pulumi_time as time

        app_manager_kafka_cluster_admin_skip_sync = confluentcloud.RoleBinding("app-manager-kafka-cluster-admin-skip-sync",
            principal=f"User:{app_manager['id']}",
            role_name="CloudClusterAdmin",
            crn_pattern=standard["rbacCrn"],
            disable_wait_for_ready=True)
        wait360_seconds_after_role_binding = time.index.Sleep("wait_360_seconds_after_role_binding", create_duration=360s,
        opts = pulumi.ResourceOptions(depends_on=[app_manager_kafka_cluster_admin_skip_sync]))
        orders = confluentcloud.KafkaTopic("orders",
            kafka_cluster={
                "id": standard["id"],
            },
            topic_name="orders",
            rest_endpoint=standard["restEndpoint"],
            credentials={
                "key": app_manager_kafka_api_key["id"],
                "secret": app_manager_kafka_api_key["secret"],
            },
            opts = pulumi.ResourceOptions(depends_on=[wait360_seconds_after_role_binding]))
        ```

        ## Import

        You can import a Role Binding by using Role Binding ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/roleBinding:RoleBinding my_rb rb-f3a90de
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] crn_pattern: A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        :param pulumi.Input[builtins.str] principal: A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        :param pulumi.Input[builtins.str] role_name: A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `RoleBinding` provides a Role Binding resource that enables creating, reading, and deleting role bindings on Confluent Cloud.

        > **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).

        ## Example of using time_sleep

        This configuration introduces a 360-second custom delay after the creation of a role binding, before creating a Kafka topic.

        For context, using `disable_wait_for_ready = false` (the default setting) results in a 90-second hardcoded delay, while opting for `disable_wait_for_ready = true` results in a 0-second delay.

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud
        import pulumi_time as time

        app_manager_kafka_cluster_admin_skip_sync = confluentcloud.RoleBinding("app-manager-kafka-cluster-admin-skip-sync",
            principal=f"User:{app_manager['id']}",
            role_name="CloudClusterAdmin",
            crn_pattern=standard["rbacCrn"],
            disable_wait_for_ready=True)
        wait360_seconds_after_role_binding = time.index.Sleep("wait_360_seconds_after_role_binding", create_duration=360s,
        opts = pulumi.ResourceOptions(depends_on=[app_manager_kafka_cluster_admin_skip_sync]))
        orders = confluentcloud.KafkaTopic("orders",
            kafka_cluster={
                "id": standard["id"],
            },
            topic_name="orders",
            rest_endpoint=standard["restEndpoint"],
            credentials={
                "key": app_manager_kafka_api_key["id"],
                "secret": app_manager_kafka_api_key["secret"],
            },
            opts = pulumi.ResourceOptions(depends_on=[wait360_seconds_after_role_binding]))
        ```

        ## Import

        You can import a Role Binding by using Role Binding ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/roleBinding:RoleBinding my_rb rb-f3a90de
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param RoleBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 crn_pattern: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 principal: Optional[pulumi.Input[builtins.str]] = None,
                 role_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleBindingArgs.__new__(RoleBindingArgs)

            if crn_pattern is None and not opts.urn:
                raise TypeError("Missing required property 'crn_pattern'")
            __props__.__dict__["crn_pattern"] = crn_pattern
            __props__.__dict__["disable_wait_for_ready"] = disable_wait_for_ready
            if principal is None and not opts.urn:
                raise TypeError("Missing required property 'principal'")
            __props__.__dict__["principal"] = principal
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
        super(RoleBinding, __self__).__init__(
            'confluentcloud:index/roleBinding:RoleBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            crn_pattern: Optional[pulumi.Input[builtins.str]] = None,
            disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
            principal: Optional[pulumi.Input[builtins.str]] = None,
            role_name: Optional[pulumi.Input[builtins.str]] = None) -> 'RoleBinding':
        """
        Get an existing RoleBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] crn_pattern: A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        :param pulumi.Input[builtins.str] principal: A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        :param pulumi.Input[builtins.str] role_name: A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleBindingState.__new__(_RoleBindingState)

        __props__.__dict__["crn_pattern"] = crn_pattern
        __props__.__dict__["disable_wait_for_ready"] = disable_wait_for_ready
        __props__.__dict__["principal"] = principal
        __props__.__dict__["role_name"] = role_name
        return RoleBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="crnPattern")
    def crn_pattern(self) -> pulumi.Output[builtins.str]:
        """
        A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        """
        return pulumi.get(self, "crn_pattern")

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> pulumi.Output[Optional[builtins.bool]]:
        return pulumi.get(self, "disable_wait_for_ready")

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Output[builtins.str]:
        """
        A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        """
        return pulumi.get(self, "principal")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[builtins.str]:
        """
        A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        """
        return pulumi.get(self, "role_name")

