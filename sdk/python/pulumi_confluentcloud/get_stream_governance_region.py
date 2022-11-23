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
    'GetStreamGovernanceRegionResult',
    'AwaitableGetStreamGovernanceRegionResult',
    'get_stream_governance_region',
    'get_stream_governance_region_output',
]

@pulumi.output_type
class GetStreamGovernanceRegionResult:
    """
    A collection of values returned by getStreamGovernanceRegion.
    """
    def __init__(__self__, cloud=None, id=None, package=None, region=None):
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if package and not isinstance(package, str):
            raise TypeError("Expected argument 'package' to be a str")
        pulumi.set(__self__, "package", package)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def cloud(self) -> str:
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Stream Governance region, for example, `sgreg-1`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def package(self) -> str:
        return pulumi.get(self, "package")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")


class AwaitableGetStreamGovernanceRegionResult(GetStreamGovernanceRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamGovernanceRegionResult(
            cloud=self.cloud,
            id=self.id,
            package=self.package,
            region=self.region)


def get_stream_governance_region(cloud: Optional[str] = None,
                                 package: Optional[str] = None,
                                 region: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamGovernanceRegionResult:
    """
    [![Open Preview](https://img.shields.io/badge/Lifecycle%20Stage-Open%20Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    !> **WARNING:** `get_stream_governance_region` data source is deprecated and will be removed in the next version. Use `get_schema_registry_region` instead.

    > **Note:** `get_stream_governance_region` data source is available in **Open Preview** for early adopters. Open Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Open Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Open Preview features. Open Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Open Preview features at any time in Confluent’s sole discretion.

    `get_stream_governance_region` describes a Stream Governance cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_stream_governance_region = confluentcloud.get_stream_governance_region(cloud="AWS",
        region="us-east-2",
        package="ESSENTIALS")
    pulumi.export("example", example_stream_governance_region)
    ```


    :param str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param str package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
    :param str region: The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
    """
    __args__ = dict()
    __args__['cloud'] = cloud
    __args__['package'] = package
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getStreamGovernanceRegion:getStreamGovernanceRegion', __args__, opts=opts, typ=GetStreamGovernanceRegionResult).value

    return AwaitableGetStreamGovernanceRegionResult(
        cloud=__ret__.cloud,
        id=__ret__.id,
        package=__ret__.package,
        region=__ret__.region)


@_utilities.lift_output_func(get_stream_governance_region)
def get_stream_governance_region_output(cloud: Optional[pulumi.Input[str]] = None,
                                        package: Optional[pulumi.Input[str]] = None,
                                        region: Optional[pulumi.Input[str]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStreamGovernanceRegionResult]:
    """
    [![Open Preview](https://img.shields.io/badge/Lifecycle%20Stage-Open%20Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    !> **WARNING:** `get_stream_governance_region` data source is deprecated and will be removed in the next version. Use `get_schema_registry_region` instead.

    > **Note:** `get_stream_governance_region` data source is available in **Open Preview** for early adopters. Open Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Open Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Open Preview features. Open Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Open Preview features at any time in Confluent’s sole discretion.

    `get_stream_governance_region` describes a Stream Governance cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_stream_governance_region = confluentcloud.get_stream_governance_region(cloud="AWS",
        region="us-east-2",
        package="ESSENTIALS")
    pulumi.export("example", example_stream_governance_region)
    ```


    :param str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param str package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
    :param str region: The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
    """
    ...
