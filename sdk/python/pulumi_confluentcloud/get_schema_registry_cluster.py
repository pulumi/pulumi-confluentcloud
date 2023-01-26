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
    'GetSchemaRegistryClusterResult',
    'AwaitableGetSchemaRegistryClusterResult',
    'get_schema_registry_cluster',
    'get_schema_registry_cluster_output',
]

@pulumi.output_type
class GetSchemaRegistryClusterResult:
    """
    A collection of values returned by getSchemaRegistryCluster.
    """
    def __init__(__self__, api_version=None, display_name=None, environment=None, id=None, kind=None, package=None, regions=None, resource_name=None, rest_endpoint=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
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
        if package and not isinstance(package, str):
            raise TypeError("Expected argument 'package' to be a str")
        pulumi.set(__self__, "package", package)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetSchemaRegistryClusterEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def package(self) -> str:
        """
        (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        return pulumi.get(self, "package")

    @property
    @pulumi.getter
    def regions(self) -> Sequence['outputs.GetSchemaRegistryClusterRegionResult']:
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> str:
        """
        (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")


class AwaitableGetSchemaRegistryClusterResult(GetSchemaRegistryClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemaRegistryClusterResult(
            api_version=self.api_version,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            kind=self.kind,
            package=self.package,
            regions=self.regions,
            resource_name=self.resource_name,
            rest_endpoint=self.rest_endpoint)


def get_schema_registry_cluster(display_name: Optional[str] = None,
                                environment: Optional[pulumi.InputType['GetSchemaRegistryClusterEnvironmentArgs']] = None,
                                id: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryClusterResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `SchemaRegistryCluster` describes a Schema Registry cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_schema_registry_cluster = confluentcloud.get_schema_registry_cluster(id="lsrc-abc123",
        environment=confluentcloud.GetSchemaRegistryClusterEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_schema_registry_cluster)
    example_using_name_schema_registry_cluster = confluentcloud.get_schema_registry_cluster(display_name="Stream Governance Package",
        environment=confluentcloud.GetSchemaRegistryClusterEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_schema_registry_cluster)
    ```


    :param str display_name: The name for the Schema Registry cluster.
    :param str id: The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster', __args__, opts=opts, typ=GetSchemaRegistryClusterResult).value

    return AwaitableGetSchemaRegistryClusterResult(
        api_version=__ret__.api_version,
        display_name=__ret__.display_name,
        environment=__ret__.environment,
        id=__ret__.id,
        kind=__ret__.kind,
        package=__ret__.package,
        regions=__ret__.regions,
        resource_name=__ret__.resource_name,
        rest_endpoint=__ret__.rest_endpoint)


@_utilities.lift_output_func(get_schema_registry_cluster)
def get_schema_registry_cluster_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                       environment: Optional[pulumi.Input[pulumi.InputType['GetSchemaRegistryClusterEnvironmentArgs']]] = None,
                                       id: Optional[pulumi.Input[Optional[str]]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSchemaRegistryClusterResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `SchemaRegistryCluster` describes a Schema Registry cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_schema_registry_cluster = confluentcloud.get_schema_registry_cluster(id="lsrc-abc123",
        environment=confluentcloud.GetSchemaRegistryClusterEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id_schema_registry_cluster)
    example_using_name_schema_registry_cluster = confluentcloud.get_schema_registry_cluster(display_name="Stream Governance Package",
        environment=confluentcloud.GetSchemaRegistryClusterEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name_schema_registry_cluster)
    ```


    :param str display_name: The name for the Schema Registry cluster.
    :param str id: The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
    """
    ...
