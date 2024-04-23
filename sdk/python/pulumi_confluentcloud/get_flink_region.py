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
    'GetFlinkRegionResult',
    'AwaitableGetFlinkRegionResult',
    'get_flink_region',
    'get_flink_region_output',
]

@pulumi.output_type
class GetFlinkRegionResult:
    """
    A collection of values returned by getFlinkRegion.
    """
    def __init__(__self__, api_version=None, cloud=None, id=None, kind=None, region=None, rest_endpoint=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the Flink region, for example, `fcpm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def cloud(self) -> str:
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Flink region, for example, `aws.us-east-1`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the Flink region, for example, `Region`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> str:
        """
        (Required String) The HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")


class AwaitableGetFlinkRegionResult(GetFlinkRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlinkRegionResult(
            api_version=self.api_version,
            cloud=self.cloud,
            id=self.id,
            kind=self.kind,
            region=self.region,
            rest_endpoint=self.rest_endpoint)


def get_flink_region(cloud: Optional[str] = None,
                     region: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlinkRegionResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `get_flink_region` describes a Flink cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example = confluentcloud.get_flink_region(cloud="AWS",
        region="us-east-1")
    pulumi.export("example", example)
    ```


    :param str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param str region: The cloud service provider region, for example, `us-east-1`.
    """
    __args__ = dict()
    __args__['cloud'] = cloud
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getFlinkRegion:getFlinkRegion', __args__, opts=opts, typ=GetFlinkRegionResult).value

    return AwaitableGetFlinkRegionResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        cloud=pulumi.get(__ret__, 'cloud'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        region=pulumi.get(__ret__, 'region'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'))


@_utilities.lift_output_func(get_flink_region)
def get_flink_region_output(cloud: Optional[pulumi.Input[str]] = None,
                            region: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlinkRegionResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `get_flink_region` describes a Flink cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example = confluentcloud.get_flink_region(cloud="AWS",
        region="us-east-1")
    pulumi.export("example", example)
    ```


    :param str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param str region: The cloud service provider region, for example, `us-east-1`.
    """
    ...
