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
    'GetSchemaRegistryKekResult',
    'AwaitableGetSchemaRegistryKekResult',
    'get_schema_registry_kek',
    'get_schema_registry_kek_output',
]

@pulumi.output_type
class GetSchemaRegistryKekResult:
    """
    A collection of values returned by getSchemaRegistryKek.
    """
    def __init__(__self__, credentials=None, doc=None, hard_delete=None, id=None, kms_key_id=None, kms_type=None, name=None, properties=None, rest_endpoint=None, schema_registry_cluster=None, shared=None):
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if doc and not isinstance(doc, str):
            raise TypeError("Expected argument 'doc' to be a str")
        pulumi.set(__self__, "doc", doc)
        if hard_delete and not isinstance(hard_delete, bool):
            raise TypeError("Expected argument 'hard_delete' to be a bool")
        pulumi.set(__self__, "hard_delete", hard_delete)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kms_key_id and not isinstance(kms_key_id, str):
            raise TypeError("Expected argument 'kms_key_id' to be a str")
        pulumi.set(__self__, "kms_key_id", kms_key_id)
        if kms_type and not isinstance(kms_type, str):
            raise TypeError("Expected argument 'kms_type' to be a str")
        pulumi.set(__self__, "kms_type", kms_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if properties and not isinstance(properties, dict):
            raise TypeError("Expected argument 'properties' to be a dict")
        pulumi.set(__self__, "properties", properties)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if shared and not isinstance(shared, bool):
            raise TypeError("Expected argument 'shared' to be a bool")
        pulumi.set(__self__, "shared", shared)

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetSchemaRegistryKekCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def doc(self) -> str:
        """
        (Optional String) The optional description for the KEK.
        """
        return pulumi.get(self, "doc")

    @property
    @pulumi.getter(name="hardDelete")
    def hard_delete(self) -> bool:
        """
        (Optional Boolean) The optional flag to control whether a kek should be soft or hard deleted. Defaults to `false`.
        """
        return pulumi.get(self, "hard_delete")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> str:
        """
        (Required String) The ID of the key from KMS.
        - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
        - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
        - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="kmsType")
    def kms_type(self) -> str:
        """
        (Required String) The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
        """
        return pulumi.get(self, "kms_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        (Required String) The custom property name (for example, `KeyUsage`).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def properties(self) -> Mapping[str, str]:
        """
        (Optional Map) The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetSchemaRegistryKekSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def shared(self) -> bool:
        """
        (Optional Boolean) The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
        """
        return pulumi.get(self, "shared")


class AwaitableGetSchemaRegistryKekResult(GetSchemaRegistryKekResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemaRegistryKekResult(
            credentials=self.credentials,
            doc=self.doc,
            hard_delete=self.hard_delete,
            id=self.id,
            kms_key_id=self.kms_key_id,
            kms_type=self.kms_type,
            name=self.name,
            properties=self.properties,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            shared=self.shared)


def get_schema_registry_kek(credentials: Optional[Union['GetSchemaRegistryKekCredentialsArgs', 'GetSchemaRegistryKekCredentialsArgsDict']] = None,
                            name: Optional[str] = None,
                            rest_endpoint: Optional[str] = None,
                            schema_registry_cluster: Optional[Union['GetSchemaRegistryKekSchemaRegistryClusterArgs', 'GetSchemaRegistryKekSchemaRegistryClusterArgsDict']] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryKekResult:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name for the KEK.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['name'] = name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryKek:getSchemaRegistryKek', __args__, opts=opts, typ=GetSchemaRegistryKekResult).value

    return AwaitableGetSchemaRegistryKekResult(
        credentials=pulumi.get(__ret__, 'credentials'),
        doc=pulumi.get(__ret__, 'doc'),
        hard_delete=pulumi.get(__ret__, 'hard_delete'),
        id=pulumi.get(__ret__, 'id'),
        kms_key_id=pulumi.get(__ret__, 'kms_key_id'),
        kms_type=pulumi.get(__ret__, 'kms_type'),
        name=pulumi.get(__ret__, 'name'),
        properties=pulumi.get(__ret__, 'properties'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        shared=pulumi.get(__ret__, 'shared'))
def get_schema_registry_kek_output(credentials: Optional[pulumi.Input[Optional[Union['GetSchemaRegistryKekCredentialsArgs', 'GetSchemaRegistryKekCredentialsArgsDict']]]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                                   schema_registry_cluster: Optional[pulumi.Input[Optional[Union['GetSchemaRegistryKekSchemaRegistryClusterArgs', 'GetSchemaRegistryKekSchemaRegistryClusterArgsDict']]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSchemaRegistryKekResult]:
    """
    Use this data source to access information about an existing resource.

    :param str name: The name for the KEK.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['name'] = name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getSchemaRegistryKek:getSchemaRegistryKek', __args__, opts=opts, typ=GetSchemaRegistryKekResult)
    return __ret__.apply(lambda __response__: GetSchemaRegistryKekResult(
        credentials=pulumi.get(__response__, 'credentials'),
        doc=pulumi.get(__response__, 'doc'),
        hard_delete=pulumi.get(__response__, 'hard_delete'),
        id=pulumi.get(__response__, 'id'),
        kms_key_id=pulumi.get(__response__, 'kms_key_id'),
        kms_type=pulumi.get(__response__, 'kms_type'),
        name=pulumi.get(__response__, 'name'),
        properties=pulumi.get(__response__, 'properties'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__response__, 'schema_registry_cluster'),
        shared=pulumi.get(__response__, 'shared')))
