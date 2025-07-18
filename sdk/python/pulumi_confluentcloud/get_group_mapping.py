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

__all__ = [
    'GetGroupMappingResult',
    'AwaitableGetGroupMappingResult',
    'get_group_mapping',
    'get_group_mapping_output',
]

@pulumi.output_type
class GetGroupMappingResult:
    """
    A collection of values returned by getGroupMapping.
    """
    def __init__(__self__, description=None, display_name=None, filter=None, id=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        (Required String) A description explaining the purpose and use of the group mapping.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        """
        (Required String) The name of the Group Mapping.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def filter(self) -> builtins.str:
        """
        (Required String) A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        (Required String) The ID of the Group Mapping (for example, `group-abc123`).
        """
        return pulumi.get(self, "id")


class AwaitableGetGroupMappingResult(GetGroupMappingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupMappingResult(
            description=self.description,
            display_name=self.display_name,
            filter=self.filter,
            id=self.id)


def get_group_mapping(display_name: Optional[builtins.str] = None,
                      id: Optional[builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupMappingResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `GroupMapping` describes a Group Mapping data source.

    > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_group_mapping(id="group-abc123")
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_group_mapping(display_name="Default")
    ```


    :param builtins.str display_name: The name of the Group Mapping.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param builtins.str id: The ID of the Group Mapping.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getGroupMapping:getGroupMapping', __args__, opts=opts, typ=GetGroupMappingResult).value

    return AwaitableGetGroupMappingResult(
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'))
def get_group_mapping_output(display_name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                             id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGroupMappingResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `GroupMapping` describes a Group Mapping data source.

    > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_group_mapping(id="group-abc123")
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_group_mapping(display_name="Default")
    ```


    :param builtins.str display_name: The name of the Group Mapping.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param builtins.str id: The ID of the Group Mapping.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getGroupMapping:getGroupMapping', __args__, opts=opts, typ=GetGroupMappingResult)
    return __ret__.apply(lambda __response__: GetGroupMappingResult(
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id')))
