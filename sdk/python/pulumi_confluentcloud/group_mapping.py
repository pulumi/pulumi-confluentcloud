# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = ['GroupMappingArgs', 'GroupMapping']

@pulumi.input_type
class GroupMappingArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[builtins.str],
                 filter: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a GroupMapping resource.
        :param pulumi.Input[builtins.str] display_name: The name of the Group Mapping.
        :param pulumi.Input[builtins.str] filter: A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        :param pulumi.Input[builtins.str] description: A description explaining the purpose and use of the group mapping.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "filter", filter)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the Group Mapping.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Input[builtins.str]:
        """
        A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A description explaining the purpose and use of the group mapping.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _GroupMappingState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 filter: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering GroupMapping resources.
        :param pulumi.Input[builtins.str] description: A description explaining the purpose and use of the group mapping.
        :param pulumi.Input[builtins.str] display_name: The name of the Group Mapping.
        :param pulumi.Input[builtins.str] filter: A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A description explaining the purpose and use of the group mapping.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Group Mapping.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "filter", value)


class GroupMapping(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 filter: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `GroupMapping` provides a Group Mapping resource that enables creating, editing, and deleting group mappings on Confluent Cloud.

        > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        application_developers = confluentcloud.GroupMapping("application-developers",
            display_name="Application Developers",
            description="Admin access to production environment for Engineering",
            filter="\\"engineering\\" in groups")
        envadmin = confluentcloud.RoleBinding("envadmin",
            principal=application_developers.id.apply(lambda id: f"User:{id}"),
            role_name="EnvironmentAdmin",
            crn_pattern=prod["resourceName"])
        ```

        ## Import

        You can import a Group Mapping by using Group Mapping ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/groupMapping:GroupMapping application-developers group-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A description explaining the purpose and use of the group mapping.
        :param pulumi.Input[builtins.str] display_name: The name of the Group Mapping.
        :param pulumi.Input[builtins.str] filter: A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupMappingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `GroupMapping` provides a Group Mapping resource that enables creating, editing, and deleting group mappings on Confluent Cloud.

        > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        application_developers = confluentcloud.GroupMapping("application-developers",
            display_name="Application Developers",
            description="Admin access to production environment for Engineering",
            filter="\\"engineering\\" in groups")
        envadmin = confluentcloud.RoleBinding("envadmin",
            principal=application_developers.id.apply(lambda id: f"User:{id}"),
            role_name="EnvironmentAdmin",
            crn_pattern=prod["resourceName"])
        ```

        ## Import

        You can import a Group Mapping by using Group Mapping ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/groupMapping:GroupMapping application-developers group-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param GroupMappingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupMappingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 filter: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupMappingArgs.__new__(GroupMappingArgs)

            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
        super(GroupMapping, __self__).__init__(
            'confluentcloud:index/groupMapping:GroupMapping',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            filter: Optional[pulumi.Input[builtins.str]] = None) -> 'GroupMapping':
        """
        Get an existing GroupMapping resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A description explaining the purpose and use of the group mapping.
        :param pulumi.Input[builtins.str] display_name: The name of the Group Mapping.
        :param pulumi.Input[builtins.str] filter: A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupMappingState.__new__(_GroupMappingState)

        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["filter"] = filter
        return GroupMapping(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        A description explaining the purpose and use of the group mapping.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Group Mapping.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output[builtins.str]:
        """
        A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        return pulumi.get(self, "filter")

