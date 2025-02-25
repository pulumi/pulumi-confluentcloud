# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    def __init__(__self__, api_version=None, catalog_endpoint=None, cloud=None, display_name=None, environment=None, id=None, kind=None, package=None, private_rest_endpoint=None, region=None, resource_name=None, rest_endpoint=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if catalog_endpoint and not isinstance(catalog_endpoint, str):
            raise TypeError("Expected argument 'catalog_endpoint' to be a str")
        pulumi.set(__self__, "catalog_endpoint", catalog_endpoint)
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
        if package and not isinstance(package, str):
            raise TypeError("Expected argument 'package' to be a str")
        pulumi.set(__self__, "package", package)
        if private_rest_endpoint and not isinstance(private_rest_endpoint, str):
            raise TypeError("Expected argument 'private_rest_endpoint' to be a str")
        pulumi.set(__self__, "private_rest_endpoint", private_rest_endpoint)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
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
    @pulumi.getter(name="catalogEndpoint")
    def catalog_endpoint(self) -> str:
        """
        (Required String) The Catalog endpoint of the Schema Registry cluster, for example, `https://psrc-y1113.us-west-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "catalog_endpoint")

    @property
    @pulumi.getter
    def cloud(self) -> str:
        """
        (Required String) The cloud service provider that the Schema Registry cluster belongs to, for example, `AWS`.
        """
        return pulumi.get(self, "cloud")

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
        """
        (Required String) The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
        """
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
    @pulumi.getter(name="privateRestEndpoint")
    def private_rest_endpoint(self) -> str:
        """
        (Required String) The private HTTP endpoint of the Schema Registry cluster, for example, `https://lsrc.us-west-2.aws.private.confluent.cloud`.
        """
        return pulumi.get(self, "private_rest_endpoint")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `us-east4`.
        """
        return pulumi.get(self, "region")

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
            catalog_endpoint=self.catalog_endpoint,
            cloud=self.cloud,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            kind=self.kind,
            package=self.package,
            private_rest_endpoint=self.private_rest_endpoint,
            region=self.region,
            resource_name=self.resource_name,
            rest_endpoint=self.rest_endpoint)


def get_schema_registry_cluster(display_name: Optional[str] = None,
                                environment: Optional[Union['GetSchemaRegistryClusterEnvironmentArgs', 'GetSchemaRegistryClusterEnvironmentArgsDict']] = None,
                                id: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryClusterResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    # Loads the only Schema Registry cluster in the target environment
    example_using_env_id = confluentcloud.get_schema_registry_cluster(environment={
        "id": "env-xyz456",
    })
    pulumi.export("exampleUsingEnvId", example_using_env_id)
    example_using_id = confluentcloud.get_schema_registry_cluster(id="lsrc-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_schema_registry_cluster(display_name="Stream Governance Package",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: The name for the Schema Registry cluster.
    :param str id: The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster', __args__, opts=opts, typ=GetSchemaRegistryClusterResult).value

    return AwaitableGetSchemaRegistryClusterResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        catalog_endpoint=pulumi.get(__ret__, 'catalog_endpoint'),
        cloud=pulumi.get(__ret__, 'cloud'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        package=pulumi.get(__ret__, 'package'),
        private_rest_endpoint=pulumi.get(__ret__, 'private_rest_endpoint'),
        region=pulumi.get(__ret__, 'region'),
        resource_name=pulumi.get(__ret__, 'resource_name'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'))
def get_schema_registry_cluster_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                       environment: Optional[pulumi.Input[Union['GetSchemaRegistryClusterEnvironmentArgs', 'GetSchemaRegistryClusterEnvironmentArgsDict']]] = None,
                                       id: Optional[pulumi.Input[Optional[str]]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSchemaRegistryClusterResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    # Loads the only Schema Registry cluster in the target environment
    example_using_env_id = confluentcloud.get_schema_registry_cluster(environment={
        "id": "env-xyz456",
    })
    pulumi.export("exampleUsingEnvId", example_using_env_id)
    example_using_id = confluentcloud.get_schema_registry_cluster(id="lsrc-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_schema_registry_cluster(display_name="Stream Governance Package",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: The name for the Schema Registry cluster.
    :param str id: The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster', __args__, opts=opts, typ=GetSchemaRegistryClusterResult)
    return __ret__.apply(lambda __response__: GetSchemaRegistryClusterResult(
        api_version=pulumi.get(__response__, 'api_version'),
        catalog_endpoint=pulumi.get(__response__, 'catalog_endpoint'),
        cloud=pulumi.get(__response__, 'cloud'),
        display_name=pulumi.get(__response__, 'display_name'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id'),
        kind=pulumi.get(__response__, 'kind'),
        package=pulumi.get(__response__, 'package'),
        private_rest_endpoint=pulumi.get(__response__, 'private_rest_endpoint'),
        region=pulumi.get(__response__, 'region'),
        resource_name=pulumi.get(__response__, 'resource_name'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint')))
