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

__all__ = ['BusinessMetadataBindingArgs', 'BusinessMetadataBinding']

@pulumi.input_type
class BusinessMetadataBindingArgs:
    def __init__(__self__, *,
                 business_metadata_name: pulumi.Input[str],
                 entity_name: pulumi.Input[str],
                 entity_type: pulumi.Input[str],
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 credentials: Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a BusinessMetadataBinding resource.
        :param pulumi.Input[str] business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[str] entity_name: The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        :param pulumi.Input[str] entity_type: The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: The attributes.
        :param pulumi.Input['BusinessMetadataBindingCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        pulumi.set(__self__, "business_metadata_name", business_metadata_name)
        pulumi.set(__self__, "entity_name", entity_name)
        pulumi.set(__self__, "entity_type", entity_type)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter(name="businessMetadataName")
    def business_metadata_name(self) -> pulumi.Input[str]:
        """
        The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "business_metadata_name")

    @business_metadata_name.setter
    def business_metadata_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "business_metadata_name", value)

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> pulumi.Input[str]:
        """
        The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        """
        return pulumi.get(self, "entity_name")

    @entity_name.setter
    def entity_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "entity_name", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Input[str]:
        """
        The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "entity_type", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _BusinessMetadataBindingState:
    def __init__(__self__, *,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 business_metadata_name: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']] = None,
                 entity_name: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']] = None):
        """
        Input properties used for looking up and filtering BusinessMetadataBinding resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: The attributes.
        :param pulumi.Input[str] business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input['BusinessMetadataBindingCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] entity_name: The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        :param pulumi.Input[str] entity_type: The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if business_metadata_name is not None:
            pulumi.set(__self__, "business_metadata_name", business_metadata_name)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if entity_name is not None:
            pulumi.set(__self__, "entity_name", entity_name)
        if entity_type is not None:
            pulumi.set(__self__, "entity_type", entity_type)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="businessMetadataName")
    def business_metadata_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "business_metadata_name")

    @business_metadata_name.setter
    def business_metadata_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "business_metadata_name", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['BusinessMetadataBindingCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> Optional[pulumi.Input[str]]:
        """
        The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        """
        return pulumi.get(self, "entity_name")

    @entity_name.setter
    def entity_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_name", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> Optional[pulumi.Input[str]]:
        """
        The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_type", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['BusinessMetadataBindingSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


class BusinessMetadataBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 business_metadata_name: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingCredentialsArgs']]] = None,
                 entity_name: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingSchemaRegistryClusterArgs']]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Business Metadata Binding by using the Schema Registry cluster ID, Business Metadata name, entity name and entity type in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: The attributes.
        :param pulumi.Input[str] business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[pulumi.InputType['BusinessMetadataBindingCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] entity_name: The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        :param pulumi.Input[str] entity_type: The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BusinessMetadataBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Business Metadata Binding by using the Schema Registry cluster ID, Business Metadata name, entity name and entity type in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param BusinessMetadataBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BusinessMetadataBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 business_metadata_name: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingCredentialsArgs']]] = None,
                 entity_name: Optional[pulumi.Input[str]] = None,
                 entity_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingSchemaRegistryClusterArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BusinessMetadataBindingArgs.__new__(BusinessMetadataBindingArgs)

            __props__.__dict__["attributes"] = attributes
            if business_metadata_name is None and not opts.urn:
                raise TypeError("Missing required property 'business_metadata_name'")
            __props__.__dict__["business_metadata_name"] = business_metadata_name
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if entity_name is None and not opts.urn:
                raise TypeError("Missing required property 'entity_name'")
            __props__.__dict__["entity_name"] = entity_name
            if entity_type is None and not opts.urn:
                raise TypeError("Missing required property 'entity_type'")
            __props__.__dict__["entity_type"] = entity_type
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(BusinessMetadataBinding, __self__).__init__(
            'confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            business_metadata_name: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingCredentialsArgs']]] = None,
            entity_name: Optional[pulumi.Input[str]] = None,
            entity_type: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['BusinessMetadataBindingSchemaRegistryClusterArgs']]] = None) -> 'BusinessMetadataBinding':
        """
        Get an existing BusinessMetadataBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: The attributes.
        :param pulumi.Input[str] business_metadata_name: The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[pulumi.InputType['BusinessMetadataBindingCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] entity_name: The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        :param pulumi.Input[str] entity_type: The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BusinessMetadataBindingState.__new__(_BusinessMetadataBindingState)

        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["business_metadata_name"] = business_metadata_name
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["entity_name"] = entity_name
        __props__.__dict__["entity_type"] = entity_type
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        return BusinessMetadataBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="businessMetadataName")
    def business_metadata_name(self) -> pulumi.Output[str]:
        """
        The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "business_metadata_name")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.BusinessMetadataBindingCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> pulumi.Output[str]:
        """
        The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        """
        return pulumi.get(self, "entity_name")

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Output[str]:
        """
        The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        """
        return pulumi.get(self, "entity_type")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.BusinessMetadataBindingSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

