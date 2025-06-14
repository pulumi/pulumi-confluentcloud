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
from . import outputs
from ._inputs import *

__all__ = [
    'GetSchemaRegistryClustersResult',
    'AwaitableGetSchemaRegistryClustersResult',
    'get_schema_registry_clusters',
    'get_schema_registry_clusters_output',
]

@pulumi.output_type
class GetSchemaRegistryClustersResult:
    """
    A collection of values returned by getSchemaRegistryClusters.
    """
    def __init__(__self__, clusters=None, environment=None, id=None):
        if clusters and not isinstance(clusters, list):
            raise TypeError("Expected argument 'clusters' to be a list")
        pulumi.set(__self__, "clusters", clusters)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def clusters(self) -> Sequence['outputs.GetSchemaRegistryClustersClusterResult']:
        """
        (Required List of Object) List of Schema Registry clusters. Each Schema Registry cluster object exports the following attributes:
        """
        return pulumi.get(self, "clusters")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetSchemaRegistryClustersEnvironmentResult':
        """
        (Required Object) exports the following attributes:
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetSchemaRegistryClustersResult(GetSchemaRegistryClustersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemaRegistryClustersResult(
            clusters=self.clusters,
            environment=self.environment,
            id=self.id)


def get_schema_registry_clusters(environment: Optional[Union['GetSchemaRegistryClustersEnvironmentArgs', 'GetSchemaRegistryClustersEnvironmentArgsDict']] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryClustersResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `data.confluent_schema_registry_clusters` describes a data source for Schema Registry Clusters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_schema_registry_clusters(environment={
        "id": "env-xyz456",
    })
    ```


    :param Union['GetSchemaRegistryClustersEnvironmentArgs', 'GetSchemaRegistryClustersEnvironmentArgsDict'] environment: (Required Object) exports the following attributes:
    """
    __args__ = dict()
    __args__['environment'] = environment
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryClusters:getSchemaRegistryClusters', __args__, opts=opts, typ=GetSchemaRegistryClustersResult).value

    return AwaitableGetSchemaRegistryClustersResult(
        clusters=pulumi.get(__ret__, 'clusters'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'))
def get_schema_registry_clusters_output(environment: Optional[pulumi.Input[Optional[Union['GetSchemaRegistryClustersEnvironmentArgs', 'GetSchemaRegistryClustersEnvironmentArgsDict']]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSchemaRegistryClustersResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `data.confluent_schema_registry_clusters` describes a data source for Schema Registry Clusters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_schema_registry_clusters(environment={
        "id": "env-xyz456",
    })
    ```


    :param Union['GetSchemaRegistryClustersEnvironmentArgs', 'GetSchemaRegistryClustersEnvironmentArgsDict'] environment: (Required Object) exports the following attributes:
    """
    __args__ = dict()
    __args__['environment'] = environment
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getSchemaRegistryClusters:getSchemaRegistryClusters', __args__, opts=opts, typ=GetSchemaRegistryClustersResult)
    return __ret__.apply(lambda __response__: GetSchemaRegistryClustersResult(
        clusters=pulumi.get(__response__, 'clusters'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id')))
