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
from . import outputs
from ._inputs import *

__all__ = ['FlinkComputePoolArgs', 'FlinkComputePool']

@pulumi.input_type
class FlinkComputePoolArgs:
    def __init__(__self__, *,
                 cloud: pulumi.Input[builtins.str],
                 display_name: pulumi.Input[builtins.str],
                 environment: pulumi.Input['FlinkComputePoolEnvironmentArgs'],
                 region: pulumi.Input[builtins.str],
                 max_cfu: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a FlinkComputePool resource.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that runs the Flink Compute Pool.
        :param pulumi.Input[builtins.str] display_name: The name of the Flink Compute Pool.
        :param pulumi.Input['FlinkComputePoolEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] region: The cloud service provider region that hosts the Flink Compute Pool.
        :param pulumi.Input[builtins.int] max_cfu: Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        """
        pulumi.set(__self__, "cloud", cloud)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "region", region)
        if max_cfu is not None:
            pulumi.set(__self__, "max_cfu", max_cfu)

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Input[builtins.str]:
        """
        The cloud service provider that runs the Flink Compute Pool.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the Flink Compute Pool.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['FlinkComputePoolEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['FlinkComputePoolEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[builtins.str]:
        """
        The cloud service provider region that hosts the Flink Compute Pool.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="maxCfu")
    def max_cfu(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        """
        return pulumi.get(self, "max_cfu")

    @max_cfu.setter
    def max_cfu(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "max_cfu", value)


@pulumi.input_type
class _FlinkComputePoolState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[builtins.str]] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input['FlinkComputePoolEnvironmentArgs']] = None,
                 kind: Optional[pulumi.Input[builtins.str]] = None,
                 max_cfu: Optional[pulumi.Input[builtins.int]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 resource_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering FlinkComputePool resources.
        :param pulumi.Input[builtins.str] api_version: (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that runs the Flink Compute Pool.
        :param pulumi.Input[builtins.str] display_name: The name of the Flink Compute Pool.
        :param pulumi.Input['FlinkComputePoolEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] kind: (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        :param pulumi.Input[builtins.int] max_cfu: Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        :param pulumi.Input[builtins.str] region: The cloud service provider region that hosts the Flink Compute Pool.
        :param pulumi.Input[builtins.str] resource_name: (Required String) The Confluent Resource Name of the Flink Compute Pool.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", api_version)
        if cloud is not None:
            pulumi.set(__self__, "cloud", cloud)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if max_cfu is not None:
            pulumi.set(__self__, "max_cfu", max_cfu)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter
    def cloud(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The cloud service provider that runs the Flink Compute Pool.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Flink Compute Pool.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['FlinkComputePoolEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['FlinkComputePoolEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter(name="maxCfu")
    def max_cfu(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        """
        return pulumi.get(self, "max_cfu")

    @max_cfu.setter
    def max_cfu(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "max_cfu", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The cloud service provider region that hosts the Flink Compute Pool.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The Confluent Resource Name of the Flink Compute Pool.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_name", value)


class FlinkComputePool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['FlinkComputePoolEnvironmentArgs', 'FlinkComputePoolEnvironmentArgsDict']]] = None,
                 max_cfu: Optional[pulumi.Input[builtins.int]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.FlinkComputePool("main",
            display_name="standard_compute_pool",
            cloud="AWS",
            region="us-east-1",
            max_cfu=5,
            environment={
                "id": development.id,
            })
        ```

        ## Import

        You can import a Flink Compute Pool by using Environment ID and Flink Compute Pool ID, in the format `<Environment ID>/<Flink Compute Pool ID>`. The following example shows how to import a Flink Compute Pool:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/flinkComputePool:FlinkComputePool main env-abc123/lfcp-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that runs the Flink Compute Pool.
        :param pulumi.Input[builtins.str] display_name: The name of the Flink Compute Pool.
        :param pulumi.Input[Union['FlinkComputePoolEnvironmentArgs', 'FlinkComputePoolEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.int] max_cfu: Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        :param pulumi.Input[builtins.str] region: The cloud service provider region that hosts the Flink Compute Pool.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlinkComputePoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.FlinkComputePool("main",
            display_name="standard_compute_pool",
            cloud="AWS",
            region="us-east-1",
            max_cfu=5,
            environment={
                "id": development.id,
            })
        ```

        ## Import

        You can import a Flink Compute Pool by using Environment ID and Flink Compute Pool ID, in the format `<Environment ID>/<Flink Compute Pool ID>`. The following example shows how to import a Flink Compute Pool:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/flinkComputePool:FlinkComputePool main env-abc123/lfcp-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param FlinkComputePoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlinkComputePoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['FlinkComputePoolEnvironmentArgs', 'FlinkComputePoolEnvironmentArgsDict']]] = None,
                 max_cfu: Optional[pulumi.Input[builtins.int]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlinkComputePoolArgs.__new__(FlinkComputePoolArgs)

            if cloud is None and not opts.urn:
                raise TypeError("Missing required property 'cloud'")
            __props__.__dict__["cloud"] = cloud
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            __props__.__dict__["max_cfu"] = max_cfu
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["api_version"] = None
            __props__.__dict__["kind"] = None
            __props__.__dict__["resource_name"] = None
        super(FlinkComputePool, __self__).__init__(
            'confluentcloud:index/flinkComputePool:FlinkComputePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_version: Optional[pulumi.Input[builtins.str]] = None,
            cloud: Optional[pulumi.Input[builtins.str]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            environment: Optional[pulumi.Input[Union['FlinkComputePoolEnvironmentArgs', 'FlinkComputePoolEnvironmentArgsDict']]] = None,
            kind: Optional[pulumi.Input[builtins.str]] = None,
            max_cfu: Optional[pulumi.Input[builtins.int]] = None,
            region: Optional[pulumi.Input[builtins.str]] = None,
            resource_name_: Optional[pulumi.Input[builtins.str]] = None) -> 'FlinkComputePool':
        """
        Get an existing FlinkComputePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] api_version: (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that runs the Flink Compute Pool.
        :param pulumi.Input[builtins.str] display_name: The name of the Flink Compute Pool.
        :param pulumi.Input[Union['FlinkComputePoolEnvironmentArgs', 'FlinkComputePoolEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] kind: (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        :param pulumi.Input[builtins.int] max_cfu: Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        :param pulumi.Input[builtins.str] region: The cloud service provider region that hosts the Flink Compute Pool.
        :param pulumi.Input[builtins.str] resource_name_: (Required String) The Confluent Resource Name of the Flink Compute Pool.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlinkComputePoolState.__new__(_FlinkComputePoolState)

        __props__.__dict__["api_version"] = api_version
        __props__.__dict__["cloud"] = cloud
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kind"] = kind
        __props__.__dict__["max_cfu"] = max_cfu
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_name"] = resource_name_
        return FlinkComputePool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Output[builtins.str]:
        """
        The cloud service provider that runs the Flink Compute Pool.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Flink Compute Pool.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.FlinkComputePoolEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter(name="maxCfu")
    def max_cfu(self) -> pulumi.Output[builtins.int]:
        """
        Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
        """
        return pulumi.get(self, "max_cfu")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[builtins.str]:
        """
        The cloud service provider region that hosts the Flink Compute Pool.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The Confluent Resource Name of the Flink Compute Pool.
        """
        return pulumi.get(self, "resource_name")

