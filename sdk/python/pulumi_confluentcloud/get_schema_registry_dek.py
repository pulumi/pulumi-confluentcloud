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
    'GetSchemaRegistryDekResult',
    'AwaitableGetSchemaRegistryDekResult',
    'get_schema_registry_dek',
    'get_schema_registry_dek_output',
]

@pulumi.output_type
class GetSchemaRegistryDekResult:
    """
    A collection of values returned by getSchemaRegistryDek.
    """
    def __init__(__self__, algorithm=None, credentials=None, encrypted_key_material=None, hard_delete=None, id=None, kek_name=None, key_material=None, rest_endpoint=None, schema_registry_cluster=None, subject_name=None, version=None):
        if algorithm and not isinstance(algorithm, str):
            raise TypeError("Expected argument 'algorithm' to be a str")
        pulumi.set(__self__, "algorithm", algorithm)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if encrypted_key_material and not isinstance(encrypted_key_material, str):
            raise TypeError("Expected argument 'encrypted_key_material' to be a str")
        pulumi.set(__self__, "encrypted_key_material", encrypted_key_material)
        if hard_delete and not isinstance(hard_delete, bool):
            raise TypeError("Expected argument 'hard_delete' to be a bool")
        pulumi.set(__self__, "hard_delete", hard_delete)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kek_name and not isinstance(kek_name, str):
            raise TypeError("Expected argument 'kek_name' to be a str")
        pulumi.set(__self__, "kek_name", kek_name)
        if key_material and not isinstance(key_material, str):
            raise TypeError("Expected argument 'key_material' to be a str")
        pulumi.set(__self__, "key_material", key_material)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if subject_name and not isinstance(subject_name, str):
            raise TypeError("Expected argument 'subject_name' to be a str")
        pulumi.set(__self__, "subject_name", subject_name)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[str]:
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetSchemaRegistryDekCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="encryptedKeyMaterial")
    def encrypted_key_material(self) -> str:
        """
        (Optional String) The encrypted key material for the DEK.
        """
        return pulumi.get(self, "encrypted_key_material")

    @property
    @pulumi.getter(name="hardDelete")
    def hard_delete(self) -> bool:
        """
        (Optional Boolean) An optional flag to control whether a dek should be soft or hard deleted.
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
    @pulumi.getter(name="kekName")
    def kek_name(self) -> str:
        return pulumi.get(self, "kek_name")

    @property
    @pulumi.getter(name="keyMaterial")
    def key_material(self) -> str:
        """
        (Optional String) The decrypted version of encrypted key material.
        """
        return pulumi.get(self, "key_material")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetSchemaRegistryDekSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> str:
        return pulumi.get(self, "subject_name")

    @property
    @pulumi.getter
    def version(self) -> Optional[int]:
        return pulumi.get(self, "version")


class AwaitableGetSchemaRegistryDekResult(GetSchemaRegistryDekResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemaRegistryDekResult(
            algorithm=self.algorithm,
            credentials=self.credentials,
            encrypted_key_material=self.encrypted_key_material,
            hard_delete=self.hard_delete,
            id=self.id,
            kek_name=self.kek_name,
            key_material=self.key_material,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            subject_name=self.subject_name,
            version=self.version)


def get_schema_registry_dek(algorithm: Optional[str] = None,
                            credentials: Optional[pulumi.InputType['GetSchemaRegistryDekCredentialsArgs']] = None,
                            kek_name: Optional[str] = None,
                            rest_endpoint: Optional[str] = None,
                            schema_registry_cluster: Optional[pulumi.InputType['GetSchemaRegistryDekSchemaRegistryClusterArgs']] = None,
                            subject_name: Optional[str] = None,
                            version: Optional[int] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryDekResult:
    """
    Use this data source to access information about an existing resource.

    :param str algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str kek_name: The name of the KEK used to encrypt this DEK.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str subject_name: The subject for this DEK.
    :param int version: The version of this DEK. Defaults to `1`.
    """
    __args__ = dict()
    __args__['algorithm'] = algorithm
    __args__['credentials'] = credentials
    __args__['kekName'] = kek_name
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    __args__['subjectName'] = subject_name
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryDek:getSchemaRegistryDek', __args__, opts=opts, typ=GetSchemaRegistryDekResult).value

    return AwaitableGetSchemaRegistryDekResult(
        algorithm=pulumi.get(__ret__, 'algorithm'),
        credentials=pulumi.get(__ret__, 'credentials'),
        encrypted_key_material=pulumi.get(__ret__, 'encrypted_key_material'),
        hard_delete=pulumi.get(__ret__, 'hard_delete'),
        id=pulumi.get(__ret__, 'id'),
        kek_name=pulumi.get(__ret__, 'kek_name'),
        key_material=pulumi.get(__ret__, 'key_material'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        subject_name=pulumi.get(__ret__, 'subject_name'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_schema_registry_dek)
def get_schema_registry_dek_output(algorithm: Optional[pulumi.Input[Optional[str]]] = None,
                                   credentials: Optional[pulumi.Input[Optional[pulumi.InputType['GetSchemaRegistryDekCredentialsArgs']]]] = None,
                                   kek_name: Optional[pulumi.Input[str]] = None,
                                   rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                                   schema_registry_cluster: Optional[pulumi.Input[Optional[pulumi.InputType['GetSchemaRegistryDekSchemaRegistryClusterArgs']]]] = None,
                                   subject_name: Optional[pulumi.Input[str]] = None,
                                   version: Optional[pulumi.Input[Optional[int]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSchemaRegistryDekResult]:
    """
    Use this data source to access information about an existing resource.

    :param str algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
           
           > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
    :param str kek_name: The name of the KEK used to encrypt this DEK.
    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str subject_name: The subject for this DEK.
    :param int version: The version of this DEK. Defaults to `1`.
    """
    ...
