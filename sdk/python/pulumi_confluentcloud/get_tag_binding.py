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


def get_tag_binding(credentials: Optional[Union['GetTagBindingCredentialsArgs', 'GetTagBindingCredentialsArgsDict']] = None,
                    entity_name: Optional[str] = None,
                    entity_type: Optional[str] = None,
                    rest_endpoint: Optional[str] = None,
                    schema_registry_cluster: Optional[Union['GetTagBindingSchemaRegistryClusterArgs', 'GetTagBindingSchemaRegistryClusterArgsDict']] = None,
                    tag_name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagBindingResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `TagBinding` describes a Tag Binding data source.

    ## Example Usage

    ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_tag_binding(schema_registry_cluster={
            "id": essentials["id"],
        },
        rest_endpoint=essentials["restEndpoint"],
        credentials={
            "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
            "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
        },
        tag_name="PII",
        entity_name="lsrc-8wrx70:.:100001",
        entity_type="sr_schema")
    ```

    ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_tag_binding(tag_name="PII",
        entity_name="lsrc-8wrx70:.:100001",
        entity_type="sr_schema")
    ```


    :param str entity_name: The qualified name of the entity., for example, `${data..main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
    :param str entity_type: The entity type, for example, `sr_schema`.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str tag_name: The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
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
        credentials=pulumi.get(__ret__, 'credentials'),
        entity_name=pulumi.get(__ret__, 'entity_name'),
        entity_type=pulumi.get(__ret__, 'entity_type'),
        id=pulumi.get(__ret__, 'id'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        tag_name=pulumi.get(__ret__, 'tag_name'))
def get_tag_binding_output(credentials: Optional[pulumi.Input[Optional[Union['GetTagBindingCredentialsArgs', 'GetTagBindingCredentialsArgsDict']]]] = None,
                           entity_name: Optional[pulumi.Input[str]] = None,
                           entity_type: Optional[pulumi.Input[str]] = None,
                           rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                           schema_registry_cluster: Optional[pulumi.Input[Optional[Union['GetTagBindingSchemaRegistryClusterArgs', 'GetTagBindingSchemaRegistryClusterArgsDict']]]] = None,
                           tag_name: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTagBindingResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `TagBinding` describes a Tag Binding data source.

    ## Example Usage

    ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_tag_binding(schema_registry_cluster={
            "id": essentials["id"],
        },
        rest_endpoint=essentials["restEndpoint"],
        credentials={
            "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
            "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
        },
        tag_name="PII",
        entity_name="lsrc-8wrx70:.:100001",
        entity_type="sr_schema")
    ```

    ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_tag_binding(tag_name="PII",
        entity_name="lsrc-8wrx70:.:100001",
        entity_type="sr_schema")
    ```


    :param str entity_name: The qualified name of the entity., for example, `${data..main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
    :param str entity_type: The entity type, for example, `sr_schema`.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str tag_name: The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['entityName'] = entity_name
    __args__['entityType'] = entity_type
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    __args__['tagName'] = tag_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getTagBinding:getTagBinding', __args__, opts=opts, typ=GetTagBindingResult)
    return __ret__.apply(lambda __response__: GetTagBindingResult(
        credentials=pulumi.get(__response__, 'credentials'),
        entity_name=pulumi.get(__response__, 'entity_name'),
        entity_type=pulumi.get(__response__, 'entity_type'),
        id=pulumi.get(__response__, 'id'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__response__, 'schema_registry_cluster'),
        tag_name=pulumi.get(__response__, 'tag_name')))
