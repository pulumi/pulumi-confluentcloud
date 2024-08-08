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
    'GetTagResult',
    'AwaitableGetTagResult',
    'get_tag',
    'get_tag_output',
]

@pulumi.output_type
class GetTagResult:
    """
    A collection of values returned by getTag.
    """
    def __init__(__self__, credentials=None, description=None, entity_types=None, id=None, name=None, rest_endpoint=None, schema_registry_cluster=None, version=None):
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if entity_types and not isinstance(entity_types, list):
            raise TypeError("Expected argument 'entity_types' to be a list")
        pulumi.set(__self__, "entity_types", entity_types)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetTagCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Optional String) The description of the tag.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="entityTypes")
    def entity_types(self) -> Sequence[str]:
        """
        (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`.
        """
        return pulumi.get(self, "entity_types")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Tag, in the format `<Schema Registry cluster ID>/<Tag name>`, for example, `lsrc-8wrx70/PII`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetTagSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        (Optional Integer) The version, for example, `1`.
        """
        return pulumi.get(self, "version")


class AwaitableGetTagResult(GetTagResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagResult(
            credentials=self.credentials,
            description=self.description,
            entity_types=self.entity_types,
            id=self.id,
            name=self.name,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            version=self.version)


def get_tag(credentials: Optional[Union['GetTagCredentialsArgs', 'GetTagCredentialsArgsDict']] = None,
            name: Optional[str] = None,
            rest_endpoint: Optional[str] = None,
            schema_registry_cluster: Optional[Union['GetTagSchemaRegistryClusterArgs', 'GetTagSchemaRegistryClusterArgsDict']] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagResult:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['name'] = name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getTag:getTag', __args__, opts=opts, typ=GetTagResult).value

    return AwaitableGetTagResult(
        credentials=pulumi.get(__ret__, 'credentials'),
        description=pulumi.get(__ret__, 'description'),
        entity_types=pulumi.get(__ret__, 'entity_types'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_tag)
def get_tag_output(credentials: Optional[pulumi.Input[Optional[Union['GetTagCredentialsArgs', 'GetTagCredentialsArgsDict']]]] = None,
                   name: Optional[pulumi.Input[str]] = None,
                   rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                   schema_registry_cluster: Optional[pulumi.Input[Optional[Union['GetTagSchemaRegistryClusterArgs', 'GetTagSchemaRegistryClusterArgsDict']]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTagResult]:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    ...
