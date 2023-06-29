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
    'GetBusinessMetadataBindingResult',
    'AwaitableGetBusinessMetadataBindingResult',
    'get_business_metadata_binding',
    'get_business_metadata_binding_output',
]

@pulumi.output_type
class GetBusinessMetadataBindingResult:
    """
    A collection of values returned by getBusinessMetadataBinding.
    """
    def __init__(__self__, attributes=None, business_metadata_name=None, credentials=None, entity_name=None, entity_type=None, id=None, rest_endpoint=None, schema_registry_cluster=None):
        if attributes and not isinstance(attributes, dict):
            raise TypeError("Expected argument 'attributes' to be a dict")
        pulumi.set(__self__, "attributes", attributes)
        if business_metadata_name and not isinstance(business_metadata_name, str):
            raise TypeError("Expected argument 'business_metadata_name' to be a str")
        pulumi.set(__self__, "business_metadata_name", business_metadata_name)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if entity_name and not isinstance(entity_name, str):
            raise TypeError("Expected argument 'entity_name' to be a str")
        pulumi.set(__self__, "entity_name", entity_name)
        if entity_type and not isinstance(entity_type, str):
            raise TypeError("Expected argument 'entity_type' to be a str")
        pulumi.set(__self__, "entity_type", entity_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter
    def attributes(self) -> Mapping[str, str]:
        """
        (Optional Map) The block of key-value pair attributes.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="businessMetadataName")
    def business_metadata_name(self) -> str:
        return pulumi.get(self, "business_metadata_name")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetBusinessMetadataBindingCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> str:
        return pulumi.get(self, "entity_name")

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> str:
        return pulumi.get(self, "entity_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Business Metadata Binding, in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetBusinessMetadataBindingSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")


class AwaitableGetBusinessMetadataBindingResult(GetBusinessMetadataBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBusinessMetadataBindingResult(
            attributes=self.attributes,
            business_metadata_name=self.business_metadata_name,
            credentials=self.credentials,
            entity_name=self.entity_name,
            entity_type=self.entity_type,
            id=self.id,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster)


def get_business_metadata_binding(business_metadata_name: Optional[str] = None,
                                  credentials: Optional[pulumi.InputType['GetBusinessMetadataBindingCredentialsArgs']] = None,
                                  entity_name: Optional[str] = None,
                                  entity_type: Optional[str] = None,
                                  rest_endpoint: Optional[str] = None,
                                  schema_registry_cluster: Optional[pulumi.InputType['GetBusinessMetadataBindingSchemaRegistryClusterArgs']] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBusinessMetadataBindingResult:
    """
    Use this data source to access information about an existing resource.

    :param str business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
    :param str entity_name: The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
    :param str entity_type: The entity type, for example, `sr_schema`.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['businessMetadataName'] = business_metadata_name
    __args__['credentials'] = credentials
    __args__['entityName'] = entity_name
    __args__['entityType'] = entity_type
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getBusinessMetadataBinding:getBusinessMetadataBinding', __args__, opts=opts, typ=GetBusinessMetadataBindingResult).value

    return AwaitableGetBusinessMetadataBindingResult(
        attributes=pulumi.get(__ret__, 'attributes'),
        business_metadata_name=pulumi.get(__ret__, 'business_metadata_name'),
        credentials=pulumi.get(__ret__, 'credentials'),
        entity_name=pulumi.get(__ret__, 'entity_name'),
        entity_type=pulumi.get(__ret__, 'entity_type'),
        id=pulumi.get(__ret__, 'id'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'))


@_utilities.lift_output_func(get_business_metadata_binding)
def get_business_metadata_binding_output(business_metadata_name: Optional[pulumi.Input[str]] = None,
                                         credentials: Optional[pulumi.Input[Optional[pulumi.InputType['GetBusinessMetadataBindingCredentialsArgs']]]] = None,
                                         entity_name: Optional[pulumi.Input[str]] = None,
                                         entity_type: Optional[pulumi.Input[str]] = None,
                                         rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                                         schema_registry_cluster: Optional[pulumi.Input[Optional[pulumi.InputType['GetBusinessMetadataBindingSchemaRegistryClusterArgs']]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBusinessMetadataBindingResult]:
    """
    Use this data source to access information about an existing resource.

    :param str business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
    :param str entity_name: The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
    :param str entity_type: The entity type, for example, `sr_schema`.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    ...
