# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EnvironmentArgs', 'Environment']

@pulumi.input_type
class EnvironmentArgs:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Environment resource.
        :param pulumi.Input[str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        EnvironmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            display_name=display_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             display_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']

        if display_name is not None:
            _setter("display_name", display_name)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _EnvironmentState:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[str]] = None,
                 resource_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Environment resources.
        :param pulumi.Input[str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        _EnvironmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            display_name=display_name,
            resource_name=resource_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             display_name: Optional[pulumi.Input[str]] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if resource_name is None and 'resourceName' in kwargs:
            resource_name = kwargs['resourceName']

        if display_name is not None:
            _setter("display_name", display_name)
        if resource_name is not None:
            _setter("resource_name", resource_name)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)


class Environment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import an Environment by using Environment ID, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/environment:Environment my_env env-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EnvironmentArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import an Environment by using Environment ID, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/environment:Environment my_env env-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param EnvironmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EnvironmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentArgs.__new__(EnvironmentArgs)

            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["resource_name"] = None
        super(Environment, __self__).__init__(
            'confluentcloud:index/environment:Environment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None) -> 'Environment':
        """
        Get an existing Environment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentState.__new__(_EnvironmentState)

        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["resource_name"] = resource_name_
        return Environment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        return pulumi.get(self, "resource_name")

