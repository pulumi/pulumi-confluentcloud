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
    'GetFlinkComputePoolResult',
    'AwaitableGetFlinkComputePoolResult',
    'get_flink_compute_pool',
    'get_flink_compute_pool_output',
]

@pulumi.output_type
class GetFlinkComputePoolResult:
    """
    A collection of values returned by getFlinkComputePool.
    """
    def __init__(__self__, api_version=None, cloud=None, display_name=None, environment=None, id=None, kind=None, max_cfu=None, region=None, resource_name=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if max_cfu and not isinstance(max_cfu, int):
            raise TypeError("Expected argument 'max_cfu' to be a int")
        pulumi.set(__self__, "max_cfu", max_cfu)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def cloud(self) -> str:
        """
        (Required String) The cloud service provider that runs the Flink Compute Pool.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Flink Compute Pool.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetFlinkComputePoolEnvironmentResult':
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter(name="maxCfu")
    def max_cfu(self) -> int:
        """
        (Required Integer) Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to.
        """
        return pulumi.get(self, "max_cfu")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        (Required String) The cloud service provider region that hosts the Flink Compute Pool.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Flink Compute Pool.
        """
        return pulumi.get(self, "resource_name")


class AwaitableGetFlinkComputePoolResult(GetFlinkComputePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlinkComputePoolResult(
            api_version=self.api_version,
            cloud=self.cloud,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            kind=self.kind,
            max_cfu=self.max_cfu,
            region=self.region,
            resource_name=self.resource_name)


def get_flink_compute_pool(display_name: Optional[str] = None,
                           environment: Optional[pulumi.InputType['GetFlinkComputePoolEnvironmentArgs']] = None,
                           id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlinkComputePoolResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkComputePool` describes a Flink Compute Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_flink_compute_pool(id="lfcp-abc123",
        environment=confluentcloud.GetFlinkComputePoolEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_flink_compute_pool(display_name="my_compute_pool",
        environment=confluentcloud.GetFlinkComputePoolEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: A human-readable name for the Flink Compute Pool.
    :param pulumi.InputType['GetFlinkComputePoolEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getFlinkComputePool:getFlinkComputePool', __args__, opts=opts, typ=GetFlinkComputePoolResult).value

    return AwaitableGetFlinkComputePoolResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        cloud=pulumi.get(__ret__, 'cloud'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        max_cfu=pulumi.get(__ret__, 'max_cfu'),
        region=pulumi.get(__ret__, 'region'),
        resource_name=pulumi.get(__ret__, 'resource_name'))


@_utilities.lift_output_func(get_flink_compute_pool)
def get_flink_compute_pool_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                  environment: Optional[pulumi.Input[pulumi.InputType['GetFlinkComputePoolEnvironmentArgs']]] = None,
                                  id: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlinkComputePoolResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkComputePool` describes a Flink Compute Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_flink_compute_pool(id="lfcp-abc123",
        environment=confluentcloud.GetFlinkComputePoolEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_flink_compute_pool(display_name="my_compute_pool",
        environment=confluentcloud.GetFlinkComputePoolEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: A human-readable name for the Flink Compute Pool.
    :param pulumi.InputType['GetFlinkComputePoolEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    ...
