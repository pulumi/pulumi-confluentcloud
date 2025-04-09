# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['BusinessMetadataArgs', 'BusinessMetadata']

@pulumi.input_type
class BusinessMetadataArgs:
    def __init__(__self__, *,
                 attribute_definitions: Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]] = None,
                 credentials: Optional[pulumi.Input['BusinessMetadataCredentialsArgs']] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a BusinessMetadata resource.
        :param pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]] attribute_definitions: The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        :param pulumi.Input['BusinessMetadataCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] description: The description of the Business Metadata.
        :param pulumi.Input[builtins.str] name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        if attribute_definitions is not None:
            pulumi.set(__self__, "attribute_definitions", attribute_definitions)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter(name="attributeDefinitions")
    def attribute_definitions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]]:
        """
        The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        """
        return pulumi.get(self, "attribute_definitions")

    @attribute_definitions.setter
    def attribute_definitions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]]):
        pulumi.set(self, "attribute_definitions", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['BusinessMetadataCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['BusinessMetadataCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Business Metadata.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _BusinessMetadataState:
    def __init__(__self__, *,
                 attribute_definitions: Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]] = None,
                 credentials: Optional[pulumi.Input['BusinessMetadataCredentialsArgs']] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering BusinessMetadata resources.
        :param pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]] attribute_definitions: The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        :param pulumi.Input['BusinessMetadataCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] description: The description of the Business Metadata.
        :param pulumi.Input[builtins.str] name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[builtins.int] version: (Required Integer) The version of the Business Metadata, for example, `1`.
        """
        if attribute_definitions is not None:
            pulumi.set(__self__, "attribute_definitions", attribute_definitions)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="attributeDefinitions")
    def attribute_definitions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]]:
        """
        The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        """
        return pulumi.get(self, "attribute_definitions")

    @attribute_definitions.setter
    def attribute_definitions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BusinessMetadataAttributeDefinitionArgs']]]]):
        pulumi.set(self, "attribute_definitions", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['BusinessMetadataCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['BusinessMetadataCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the Business Metadata.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['BusinessMetadataSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        (Required Integer) The version of the Business Metadata, for example, `1`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)


class BusinessMetadata(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attribute_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BusinessMetadataAttributeDefinitionArgs', 'BusinessMetadataAttributeDefinitionArgsDict']]]]] = None,
                 credentials: Optional[pulumi.Input[Union['BusinessMetadataCredentialsArgs', 'BusinessMetadataCredentialsArgsDict']]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['BusinessMetadataSchemaRegistryClusterArgs', 'BusinessMetadataSchemaRegistryClusterArgsDict']]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `BusinessMetadata` provides a Business Metadata resource that enables creating, editing, and deleting Business Metadata on Confluent Cloud.

        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        pii = confluentcloud.BusinessMetadata("pii",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            name="PII",
            description="PII metadata",
            attribute_definitions=[
                {
                    "name": "team",
                },
                {
                    "name": "email",
                },
            ])
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        pii = confluentcloud.BusinessMetadata("pii",
            name="PII",
            description="PII metadata",
            attribute_definitions=[
                {
                    "name": "team",
                },
                {
                    "name": "email",
                },
            ])
        ```
        > **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.

        ## Getting Started

        The following end-to-end example might help to get started with [Stream Catalog](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html):
        * stream-catalog

        ## Import

        You can import a Business Metadata by using the Schema Registry cluster ID, Business Metadata name in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_CATALOG_REST_ENDPOINT="<catalog_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/businessMetadata:BusinessMetadata pii lsrc-8wrx70/PII
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['BusinessMetadataAttributeDefinitionArgs', 'BusinessMetadataAttributeDefinitionArgsDict']]]] attribute_definitions: The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        :param pulumi.Input[Union['BusinessMetadataCredentialsArgs', 'BusinessMetadataCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] description: The description of the Business Metadata.
        :param pulumi.Input[builtins.str] name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BusinessMetadataArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `BusinessMetadata` provides a Business Metadata resource that enables creating, editing, and deleting Business Metadata on Confluent Cloud.

        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        pii = confluentcloud.BusinessMetadata("pii",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            name="PII",
            description="PII metadata",
            attribute_definitions=[
                {
                    "name": "team",
                },
                {
                    "name": "email",
                },
            ])
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        pii = confluentcloud.BusinessMetadata("pii",
            name="PII",
            description="PII metadata",
            attribute_definitions=[
                {
                    "name": "team",
                },
                {
                    "name": "email",
                },
            ])
        ```
        > **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.

        ## Getting Started

        The following end-to-end example might help to get started with [Stream Catalog](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html):
        * stream-catalog

        ## Import

        You can import a Business Metadata by using the Schema Registry cluster ID, Business Metadata name in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_CATALOG_REST_ENDPOINT="<catalog_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/businessMetadata:BusinessMetadata pii lsrc-8wrx70/PII
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param BusinessMetadataArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BusinessMetadataArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attribute_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BusinessMetadataAttributeDefinitionArgs', 'BusinessMetadataAttributeDefinitionArgsDict']]]]] = None,
                 credentials: Optional[pulumi.Input[Union['BusinessMetadataCredentialsArgs', 'BusinessMetadataCredentialsArgsDict']]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['BusinessMetadataSchemaRegistryClusterArgs', 'BusinessMetadataSchemaRegistryClusterArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BusinessMetadataArgs.__new__(BusinessMetadataArgs)

            __props__.__dict__["attribute_definitions"] = attribute_definitions
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            __props__.__dict__["version"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(BusinessMetadata, __self__).__init__(
            'confluentcloud:index/businessMetadata:BusinessMetadata',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attribute_definitions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BusinessMetadataAttributeDefinitionArgs', 'BusinessMetadataAttributeDefinitionArgsDict']]]]] = None,
            credentials: Optional[pulumi.Input[Union['BusinessMetadataCredentialsArgs', 'BusinessMetadataCredentialsArgsDict']]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[Union['BusinessMetadataSchemaRegistryClusterArgs', 'BusinessMetadataSchemaRegistryClusterArgsDict']]] = None,
            version: Optional[pulumi.Input[builtins.int]] = None) -> 'BusinessMetadata':
        """
        Get an existing BusinessMetadata resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['BusinessMetadataAttributeDefinitionArgs', 'BusinessMetadataAttributeDefinitionArgsDict']]]] attribute_definitions: The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        :param pulumi.Input[Union['BusinessMetadataCredentialsArgs', 'BusinessMetadataCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] description: The description of the Business Metadata.
        :param pulumi.Input[builtins.str] name: The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[builtins.int] version: (Required Integer) The version of the Business Metadata, for example, `1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BusinessMetadataState.__new__(_BusinessMetadataState)

        __props__.__dict__["attribute_definitions"] = attribute_definitions
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["version"] = version
        return BusinessMetadata(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="attributeDefinitions")
    def attribute_definitions(self) -> pulumi.Output[Sequence['outputs.BusinessMetadataAttributeDefinition']]:
        """
        The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
        """
        return pulumi.get(self, "attribute_definitions")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.BusinessMetadataCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the Business Metadata.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.BusinessMetadataSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[builtins.int]:
        """
        (Required Integer) The version of the Business Metadata, for example, `1`.
        """
        return pulumi.get(self, "version")

