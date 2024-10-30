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

__all__ = ['SchemaRegistryDekArgs', 'SchemaRegistryDek']

@pulumi.input_type
class SchemaRegistryDekArgs:
    def __init__(__self__, *,
                 kek_name: pulumi.Input[str],
                 subject_name: pulumi.Input[str],
                 algorithm: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']] = None,
                 encrypted_key_material: Optional[pulumi.Input[str]] = None,
                 hard_delete: Optional[pulumi.Input[bool]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a SchemaRegistryDek resource.
        :param pulumi.Input[str] kek_name: The name of the KEK used to encrypt this DEK.
        :param pulumi.Input[str] subject_name: The subject for this DEK.
        :param pulumi.Input[str] algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        :param pulumi.Input['SchemaRegistryDekCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] encrypted_key_material: The encrypted key material for the DEK.
        :param pulumi.Input[bool] hard_delete: Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
               on destroy. Defaults to `false` (soft delete).
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] version: The version of this DEK. Defaults to `1`.
        """
        pulumi.set(__self__, "kek_name", kek_name)
        pulumi.set(__self__, "subject_name", subject_name)
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if encrypted_key_material is not None:
            pulumi.set(__self__, "encrypted_key_material", encrypted_key_material)
        if hard_delete is not None:
            pulumi.set(__self__, "hard_delete", hard_delete)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="kekName")
    def kek_name(self) -> pulumi.Input[str]:
        """
        The name of the KEK used to encrypt this DEK.
        """
        return pulumi.get(self, "kek_name")

    @kek_name.setter
    def kek_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "kek_name", value)

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> pulumi.Input[str]:
        """
        The subject for this DEK.
        """
        return pulumi.get(self, "subject_name")

    @subject_name.setter
    def subject_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "subject_name", value)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="encryptedKeyMaterial")
    def encrypted_key_material(self) -> Optional[pulumi.Input[str]]:
        """
        The encrypted key material for the DEK.
        """
        return pulumi.get(self, "encrypted_key_material")

    @encrypted_key_material.setter
    def encrypted_key_material(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encrypted_key_material", value)

    @property
    @pulumi.getter(name="hardDelete")
    def hard_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
        on destroy. Defaults to `false` (soft delete).
        """
        return pulumi.get(self, "hard_delete")

    @hard_delete.setter
    def hard_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "hard_delete", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version of this DEK. Defaults to `1`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _SchemaRegistryDekState:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']] = None,
                 encrypted_key_material: Optional[pulumi.Input[str]] = None,
                 hard_delete: Optional[pulumi.Input[bool]] = None,
                 kek_name: Optional[pulumi.Input[str]] = None,
                 key_material: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering SchemaRegistryDek resources.
        :param pulumi.Input[str] algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        :param pulumi.Input['SchemaRegistryDekCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] encrypted_key_material: The encrypted key material for the DEK.
        :param pulumi.Input[bool] hard_delete: Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
               on destroy. Defaults to `false` (soft delete).
        :param pulumi.Input[str] kek_name: The name of the KEK used to encrypt this DEK.
        :param pulumi.Input[str] key_material: (Optional String) The decrypted version of encrypted key material.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The subject for this DEK.
        :param pulumi.Input[int] version: The version of this DEK. Defaults to `1`.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if encrypted_key_material is not None:
            pulumi.set(__self__, "encrypted_key_material", encrypted_key_material)
        if hard_delete is not None:
            pulumi.set(__self__, "hard_delete", hard_delete)
        if kek_name is not None:
            pulumi.set(__self__, "kek_name", kek_name)
        if key_material is not None:
            pulumi.set(__self__, "key_material", key_material)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if subject_name is not None:
            pulumi.set(__self__, "subject_name", subject_name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SchemaRegistryDekCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="encryptedKeyMaterial")
    def encrypted_key_material(self) -> Optional[pulumi.Input[str]]:
        """
        The encrypted key material for the DEK.
        """
        return pulumi.get(self, "encrypted_key_material")

    @encrypted_key_material.setter
    def encrypted_key_material(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encrypted_key_material", value)

    @property
    @pulumi.getter(name="hardDelete")
    def hard_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
        on destroy. Defaults to `false` (soft delete).
        """
        return pulumi.get(self, "hard_delete")

    @hard_delete.setter
    def hard_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "hard_delete", value)

    @property
    @pulumi.getter(name="kekName")
    def kek_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the KEK used to encrypt this DEK.
        """
        return pulumi.get(self, "kek_name")

    @kek_name.setter
    def kek_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kek_name", value)

    @property
    @pulumi.getter(name="keyMaterial")
    def key_material(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) The decrypted version of encrypted key material.
        """
        return pulumi.get(self, "key_material")

    @key_material.setter
    def key_material(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_material", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SchemaRegistryDekSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> Optional[pulumi.Input[str]]:
        """
        The subject for this DEK.
        """
        return pulumi.get(self, "subject_name")

    @subject_name.setter
    def subject_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version of this DEK. Defaults to `1`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class SchemaRegistryDek(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[Union['SchemaRegistryDekCredentialsArgs', 'SchemaRegistryDekCredentialsArgsDict']]] = None,
                 encrypted_key_material: Optional[pulumi.Input[str]] = None,
                 hard_delete: Optional[pulumi.Input[bool]] = None,
                 kek_name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['SchemaRegistryDekSchemaRegistryClusterArgs', 'SchemaRegistryDekSchemaRegistryClusterArgsDict']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `SchemaRegistryDek` provides a Schema Registry Data Encryption Key (DEK) resource that enables creating, editing, and deleting Schema Registry Data Encryption Keys on Confluent Cloud.

        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        my_dek = confluentcloud.SchemaRegistryDek("my_dek",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            kek_name="my_kek",
            subject_name="my_subject",
            hard_delete=True)
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        my_dek = confluentcloud.SchemaRegistryDek("my_dek",
            kek_name="my_kek",
            subject_name="my_subject",
            hard_delete=True)
        ```

        ## Getting Started

        The following end-to-end example might help to get started with field-level encryption:
          * field-level-encryption-schema

        ## Import

        You can import a Schema Registry Key by using the Schema Registry cluster ID, KEK name, Subject, Version and Algorithm in the format `<Schema Registry Cluster Id>/<Schema Registry KEK Name>/<Subject>/<Version>/<Algorithm>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/schemaRegistryDek:SchemaRegistryDek my_dek lsrc-8wrx70/testkek/ts/1/AES256_GCM
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        :param pulumi.Input[Union['SchemaRegistryDekCredentialsArgs', 'SchemaRegistryDekCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] encrypted_key_material: The encrypted key material for the DEK.
        :param pulumi.Input[bool] hard_delete: Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
               on destroy. Defaults to `false` (soft delete).
        :param pulumi.Input[str] kek_name: The name of the KEK used to encrypt this DEK.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The subject for this DEK.
        :param pulumi.Input[int] version: The version of this DEK. Defaults to `1`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaRegistryDekArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `SchemaRegistryDek` provides a Schema Registry Data Encryption Key (DEK) resource that enables creating, editing, and deleting Schema Registry Data Encryption Keys on Confluent Cloud.

        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        my_dek = confluentcloud.SchemaRegistryDek("my_dek",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            kek_name="my_kek",
            subject_name="my_subject",
            hard_delete=True)
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        my_dek = confluentcloud.SchemaRegistryDek("my_dek",
            kek_name="my_kek",
            subject_name="my_subject",
            hard_delete=True)
        ```

        ## Getting Started

        The following end-to-end example might help to get started with field-level encryption:
          * field-level-encryption-schema

        ## Import

        You can import a Schema Registry Key by using the Schema Registry cluster ID, KEK name, Subject, Version and Algorithm in the format `<Schema Registry Cluster Id>/<Schema Registry KEK Name>/<Subject>/<Version>/<Algorithm>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/schemaRegistryDek:SchemaRegistryDek my_dek lsrc-8wrx70/testkek/ts/1/AES256_GCM
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param SchemaRegistryDekArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaRegistryDekArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[Union['SchemaRegistryDekCredentialsArgs', 'SchemaRegistryDekCredentialsArgsDict']]] = None,
                 encrypted_key_material: Optional[pulumi.Input[str]] = None,
                 hard_delete: Optional[pulumi.Input[bool]] = None,
                 kek_name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['SchemaRegistryDekSchemaRegistryClusterArgs', 'SchemaRegistryDekSchemaRegistryClusterArgsDict']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaRegistryDekArgs.__new__(SchemaRegistryDekArgs)

            __props__.__dict__["algorithm"] = algorithm
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["encrypted_key_material"] = encrypted_key_material
            __props__.__dict__["hard_delete"] = hard_delete
            if kek_name is None and not opts.urn:
                raise TypeError("Missing required property 'kek_name'")
            __props__.__dict__["kek_name"] = kek_name
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            if subject_name is None and not opts.urn:
                raise TypeError("Missing required property 'subject_name'")
            __props__.__dict__["subject_name"] = subject_name
            __props__.__dict__["version"] = version
            __props__.__dict__["key_material"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SchemaRegistryDek, __self__).__init__(
            'confluentcloud:index/schemaRegistryDek:SchemaRegistryDek',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[Union['SchemaRegistryDekCredentialsArgs', 'SchemaRegistryDekCredentialsArgsDict']]] = None,
            encrypted_key_material: Optional[pulumi.Input[str]] = None,
            hard_delete: Optional[pulumi.Input[bool]] = None,
            kek_name: Optional[pulumi.Input[str]] = None,
            key_material: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[Union['SchemaRegistryDekSchemaRegistryClusterArgs', 'SchemaRegistryDekSchemaRegistryClusterArgsDict']]] = None,
            subject_name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'SchemaRegistryDek':
        """
        Get an existing SchemaRegistryDek resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        :param pulumi.Input[Union['SchemaRegistryDekCredentialsArgs', 'SchemaRegistryDekCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] encrypted_key_material: The encrypted key material for the DEK.
        :param pulumi.Input[bool] hard_delete: Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
               on destroy. Defaults to `false` (soft delete).
        :param pulumi.Input[str] kek_name: The name of the KEK used to encrypt this DEK.
        :param pulumi.Input[str] key_material: (Optional String) The decrypted version of encrypted key material.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The subject for this DEK.
        :param pulumi.Input[int] version: The version of this DEK. Defaults to `1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaRegistryDekState.__new__(_SchemaRegistryDekState)

        __props__.__dict__["algorithm"] = algorithm
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["encrypted_key_material"] = encrypted_key_material
        __props__.__dict__["hard_delete"] = hard_delete
        __props__.__dict__["kek_name"] = kek_name
        __props__.__dict__["key_material"] = key_material
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["subject_name"] = subject_name
        __props__.__dict__["version"] = version
        return SchemaRegistryDek(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.SchemaRegistryDekCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="encryptedKeyMaterial")
    def encrypted_key_material(self) -> pulumi.Output[str]:
        """
        The encrypted key material for the DEK.
        """
        return pulumi.get(self, "encrypted_key_material")

    @property
    @pulumi.getter(name="hardDelete")
    def hard_delete(self) -> pulumi.Output[Optional[bool]]:
        """
        Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
        on destroy. Defaults to `false` (soft delete).
        """
        return pulumi.get(self, "hard_delete")

    @property
    @pulumi.getter(name="kekName")
    def kek_name(self) -> pulumi.Output[str]:
        """
        The name of the KEK used to encrypt this DEK.
        """
        return pulumi.get(self, "kek_name")

    @property
    @pulumi.getter(name="keyMaterial")
    def key_material(self) -> pulumi.Output[str]:
        """
        (Optional String) The decrypted version of encrypted key material.
        """
        return pulumi.get(self, "key_material")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.SchemaRegistryDekSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> pulumi.Output[str]:
        """
        The subject for this DEK.
        """
        return pulumi.get(self, "subject_name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[Optional[int]]:
        """
        The version of this DEK. Defaults to `1`.
        """
        return pulumi.get(self, "version")

