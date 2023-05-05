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
    'GetTagBindingResult',
    'AwaitableGetTagBindingResult',
    'get_tag_binding',
    'get_tag_binding_output',
]

@pulumi.output_type
class GetTagBindingResult:
    """
    A collection of values returned by getTagBinding.
    """
    def __init__(__self__, credentials=None, entity_name=None, entity_type=None, id=None, rest_endpoint=None, schema_registry_cluster=None, tag_name=None):
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
        if tag_name and not isinstance(tag_name, str):
            raise TypeError("Expected argument 'tag_name' to be a str")
        pulumi.set(__self__, "tag_name", tag_name)

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetTagBindingCredentialsResult']:
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
        (Required String) The ID of the Tag Binding, in the format `<Schema Registry Cluster Id>/<Tag Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetTagBindingSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> str:
        return pulumi.get(self, "tag_name")


class AwaitableGetTagBindingResult(GetTagBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagBindingResult(
            credentials=self.credentials,
            entity_name=self.entity_name,
            entity_type=self.entity_type,
            id=self.id,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            tag_name=self.tag_name)


def get_tag_binding(credentials: Optional[pulumi.InputType['GetTagBindingCredentialsArgs']] = None,
                    entity_name: Optional[str] = None,
                    entity_type: Optional[str] = None,
                    rest_endpoint: Optional[str] = None,
                    schema_registry_cluster: Optional[pulumi.InputType['GetTagBindingSchemaRegistryClusterArgs']] = None,
                    tag_name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagBindingResult:
    """
    Use this data source to access information about an existing resource.

    :param str entity_name: The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
    :param str entity_type: The entity type, for example, `sr_schema`.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str tag_name: The name of the tag to be applied, for example, `PII`.
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['entityName'] = entity_name
    __args__['entityType'] = entity_type
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    __args__['tagName'] = tag_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getTagBinding:getTagBinding', __args__, opts=opts, typ=GetTagBindingResult).value

    return AwaitableGetTagBindingResult(
        credentials=__ret__.credentials,
        entity_name=__ret__.entity_name,
        entity_type=__ret__.entity_type,
        id=__ret__.id,
        rest_endpoint=__ret__.rest_endpoint,
        schema_registry_cluster=__ret__.schema_registry_cluster,
        tag_name=__ret__.tag_name)


@_utilities.lift_output_func(get_tag_binding)
def get_tag_binding_output(credentials: Optional[pulumi.Input[Optional[pulumi.InputType['GetTagBindingCredentialsArgs']]]] = None,
                           entity_name: Optional[pulumi.Input[str]] = None,
                           entity_type: Optional[pulumi.Input[str]] = None,
                           rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                           schema_registry_cluster: Optional[pulumi.Input[Optional[pulumi.InputType['GetTagBindingSchemaRegistryClusterArgs']]]] = None,
                           tag_name: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTagBindingResult]:
    """
    Use this data source to access information about an existing resource.

    :param str entity_name: The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
    :param str entity_type: The entity type, for example, `sr_schema`.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str tag_name: The name of the tag to be applied, for example, `PII`.
    """
    ...
