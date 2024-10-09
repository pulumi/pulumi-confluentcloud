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
    'GetSchemasResult',
    'AwaitableGetSchemasResult',
    'get_schemas',
    'get_schemas_output',
]

@pulumi.output_type
class GetSchemasResult:
    """
    A collection of values returned by getSchemas.
    """
    def __init__(__self__, credentials=None, filter=None, id=None, rest_endpoint=None, schema_registry_cluster=None, schemas=None):
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if schemas and not isinstance(schemas, list):
            raise TypeError("Expected argument 'schemas' to be a list")
        pulumi.set(__self__, "schemas", schemas)

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetSchemasCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetSchemasFilterResult']:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetSchemasSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def schemas(self) -> Sequence['outputs.GetSchemasSchemaResult']:
        """
        (List of Object) List of schemas. Each schema object exports the following attributes:
        """
        return pulumi.get(self, "schemas")


class AwaitableGetSchemasResult(GetSchemasResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemasResult(
            credentials=self.credentials,
            filter=self.filter,
            id=self.id,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            schemas=self.schemas)


def get_schemas(credentials: Optional[Union['GetSchemasCredentialsArgs', 'GetSchemasCredentialsArgsDict']] = None,
                filter: Optional[Union['GetSchemasFilterArgs', 'GetSchemasFilterArgsDict']] = None,
                rest_endpoint: Optional[str] = None,
                schema_registry_cluster: Optional[Union['GetSchemasSchemaRegistryClusterArgs', 'GetSchemasSchemaRegistryClusterArgsDict']] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemasResult:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['filter'] = filter
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemas:getSchemas', __args__, opts=opts, typ=GetSchemasResult).value

    return AwaitableGetSchemasResult(
        credentials=pulumi.get(__ret__, 'credentials'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        schemas=pulumi.get(__ret__, 'schemas'))
def get_schemas_output(credentials: Optional[pulumi.Input[Optional[Union['GetSchemasCredentialsArgs', 'GetSchemasCredentialsArgsDict']]]] = None,
                       filter: Optional[pulumi.Input[Optional[Union['GetSchemasFilterArgs', 'GetSchemasFilterArgsDict']]]] = None,
                       rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                       schema_registry_cluster: Optional[pulumi.Input[Optional[Union['GetSchemasSchemaRegistryClusterArgs', 'GetSchemasSchemaRegistryClusterArgsDict']]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSchemasResult]:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['filter'] = filter
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getSchemas:getSchemas', __args__, opts=opts, typ=GetSchemasResult)
    return __ret__.apply(lambda __response__: GetSchemasResult(
        credentials=pulumi.get(__response__, 'credentials'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__response__, 'schema_registry_cluster'),
        schemas=pulumi.get(__response__, 'schemas')))
