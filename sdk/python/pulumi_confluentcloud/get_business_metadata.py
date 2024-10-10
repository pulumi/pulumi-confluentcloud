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
    'GetBusinessMetadataResult',
    'AwaitableGetBusinessMetadataResult',
    'get_business_metadata',
    'get_business_metadata_output',
]

@pulumi.output_type
class GetBusinessMetadataResult:
    """
    A collection of values returned by getBusinessMetadata.
    """
    def __init__(__self__, attribute_definitions=None, credentials=None, description=None, id=None, name=None, rest_endpoint=None, schema_registry_cluster=None, version=None):
        if attribute_definitions and not isinstance(attribute_definitions, list):
            raise TypeError("Expected argument 'attribute_definitions' to be a list")
        pulumi.set(__self__, "attribute_definitions", attribute_definitions)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
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
    @pulumi.getter(name="attributeDefinitions")
    def attribute_definitions(self) -> Sequence['outputs.GetBusinessMetadataAttributeDefinitionResult']:
        """
        (Optional List) The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        """
        return pulumi.get(self, "attribute_definitions")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetBusinessMetadataCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Optional String) The description of this attribute.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Business Metadata, in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example, `lsrc-8wrx70/PII`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        (Required String) The name of the attribute.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetBusinessMetadataSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        (Required Integer) The version of the Business Metadata, for example, `1`.
        """
        return pulumi.get(self, "version")


class AwaitableGetBusinessMetadataResult(GetBusinessMetadataResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBusinessMetadataResult(
            attribute_definitions=self.attribute_definitions,
            credentials=self.credentials,
            description=self.description,
            id=self.id,
            name=self.name,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            version=self.version)


def get_business_metadata(credentials: Optional[Union['GetBusinessMetadataCredentialsArgs', 'GetBusinessMetadataCredentialsArgsDict']] = None,
                          name: Optional[str] = None,
                          rest_endpoint: Optional[str] = None,
                          schema_registry_cluster: Optional[Union['GetBusinessMetadataSchemaRegistryClusterArgs', 'GetBusinessMetadataSchemaRegistryClusterArgsDict']] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBusinessMetadataResult:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['name'] = name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getBusinessMetadata:getBusinessMetadata', __args__, opts=opts, typ=GetBusinessMetadataResult).value

    return AwaitableGetBusinessMetadataResult(
        attribute_definitions=pulumi.get(__ret__, 'attribute_definitions'),
        credentials=pulumi.get(__ret__, 'credentials'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        version=pulumi.get(__ret__, 'version'))
def get_business_metadata_output(credentials: Optional[pulumi.Input[Optional[Union['GetBusinessMetadataCredentialsArgs', 'GetBusinessMetadataCredentialsArgsDict']]]] = None,
                                 name: Optional[pulumi.Input[str]] = None,
                                 rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                                 schema_registry_cluster: Optional[pulumi.Input[Optional[Union['GetBusinessMetadataSchemaRegistryClusterArgs', 'GetBusinessMetadataSchemaRegistryClusterArgsDict']]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBusinessMetadataResult]:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['name'] = name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getBusinessMetadata:getBusinessMetadata', __args__, opts=opts, typ=GetBusinessMetadataResult)
    return __ret__.apply(lambda __response__: GetBusinessMetadataResult(
        attribute_definitions=pulumi.get(__response__, 'attribute_definitions'),
        credentials=pulumi.get(__response__, 'credentials'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__response__, 'schema_registry_cluster'),
        version=pulumi.get(__response__, 'version')))
