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

__all__ = ['CatalogEntityAttributesArgs', 'CatalogEntityAttributes']

@pulumi.input_type
class CatalogEntityAttributesArgs:
    def __init__(__self__, *,
                 entity_name: pulumi.Input[builtins.str],
                 entity_type: pulumi.Input[builtins.str],
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 credentials: Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a CatalogEntityAttributes resource.
        :param pulumi.Input[builtins.str] entity_name: The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        :param pulumi.Input[builtins.str] entity_type: The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] attributes: The attributes.
        :param pulumi.Input['CatalogEntityAttributesCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
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
    @pulumi.getter(name="entityName")
    def entity_name(self) -> pulumi.Input[builtins.str]:
        """
        The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        """
        return pulumi.get(self, "entity_name")

    @entity_name.setter
    def entity_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "entity_name", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Input[builtins.str]:
        """
        The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "entity_type", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _CatalogEntityAttributesState:
    def __init__(__self__, *,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 credentials: Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']] = None,
                 entity_name: Optional[pulumi.Input[builtins.str]] = None,
                 entity_type: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']] = None):
        """
        Input properties used for looking up and filtering CatalogEntityAttributes resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] attributes: The attributes.
        :param pulumi.Input['CatalogEntityAttributesCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] entity_name: The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        :param pulumi.Input[builtins.str] entity_type: The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
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
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['CatalogEntityAttributesCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        """
        return pulumi.get(self, "entity_name")

    @entity_name.setter
    def entity_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "entity_name", value)

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        """
        return pulumi.get(self, "entity_type")

    @entity_type.setter
    def entity_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "entity_type", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['CatalogEntityAttributesSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


class CatalogEntityAttributes(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 credentials: Optional[pulumi.Input[Union['CatalogEntityAttributesCredentialsArgs', 'CatalogEntityAttributesCredentialsArgsDict']]] = None,
                 entity_name: Optional[pulumi.Input[builtins.str]] = None,
                 entity_type: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['CatalogEntityAttributesSchemaRegistryClusterArgs', 'CatalogEntityAttributesSchemaRegistryClusterArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        environment = confluentcloud.CatalogEntityAttributes("environment",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=main["id"],
            entity_type="cf_environment",
            attributes={
                "description": "Environment description",
            })
        kafka_cluster = confluentcloud.CatalogEntityAttributes("kafka-cluster",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=basic["id"],
            entity_type="kafka_logical_cluster",
            attributes={
                "description": "Kafka Cluster description",
            })
        topic = confluentcloud.CatalogEntityAttributes("topic",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=f"{basic['id']}:{purchase['topicName']}",
            entity_type="kafka_topic",
            attributes={
                "owner": "dev",
                "description": "Kafka topic for orders",
                "ownerEmail": "dev@gmail.com",
            })
        schema = confluentcloud.CatalogEntityAttributes("schema",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=f"{essentials['id']}:.:{purchase_confluent_schema['schemaIdentifier']}",
            entity_type="sr_schema",
            attributes={
                "description": "Schema description",
            })
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        environment = confluentcloud.CatalogEntityAttributes("environment",
            entity_name=environment_id,
            entity_type="cf_environment",
            attributes={
                "description": "Environment description",
            })
        kafka_cluster = confluentcloud.CatalogEntityAttributes("kafka-cluster",
            entity_name=kafka_cluster_id,
            entity_type="kafka_logical_cluster",
            attributes={
                "description": "Kafka Cluster description",
            })
        topic = confluentcloud.CatalogEntityAttributes("topic",
            entity_name=f"{kafka_cluster_id}:{kafka_topic_name}",
            entity_type="kafka_topic",
            attributes={
                "owner": "dev",
                "description": "Kafka topic for orders",
                "ownerEmail": "dev@gmail.com",
            })
        schema = confluentcloud.CatalogEntityAttributes("schema",
            entity_name=f"{schema_registry_cluster_id}:.:{purchase['schemaIdentifier']}",
            entity_type="sr_schema",
            attributes={
                "description": "Schema description",
            })
        ```
        > **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] attributes: The attributes.
        :param pulumi.Input[Union['CatalogEntityAttributesCredentialsArgs', 'CatalogEntityAttributesCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] entity_name: The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        :param pulumi.Input[builtins.str] entity_type: The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CatalogEntityAttributesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        environment = confluentcloud.CatalogEntityAttributes("environment",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=main["id"],
            entity_type="cf_environment",
            attributes={
                "description": "Environment description",
            })
        kafka_cluster = confluentcloud.CatalogEntityAttributes("kafka-cluster",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=basic["id"],
            entity_type="kafka_logical_cluster",
            attributes={
                "description": "Kafka Cluster description",
            })
        topic = confluentcloud.CatalogEntityAttributes("topic",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=f"{basic['id']}:{purchase['topicName']}",
            entity_type="kafka_topic",
            attributes={
                "owner": "dev",
                "description": "Kafka topic for orders",
                "ownerEmail": "dev@gmail.com",
            })
        schema = confluentcloud.CatalogEntityAttributes("schema",
            schema_registry_cluster={
                "id": essentials["id"],
            },
            rest_endpoint=essentials["restEndpoint"],
            credentials={
                "key": "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
                "secret": "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
            },
            entity_name=f"{essentials['id']}:.:{purchase_confluent_schema['schemaIdentifier']}",
            entity_type="sr_schema",
            attributes={
                "description": "Schema description",
            })
        ```

        ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        environment = confluentcloud.CatalogEntityAttributes("environment",
            entity_name=environment_id,
            entity_type="cf_environment",
            attributes={
                "description": "Environment description",
            })
        kafka_cluster = confluentcloud.CatalogEntityAttributes("kafka-cluster",
            entity_name=kafka_cluster_id,
            entity_type="kafka_logical_cluster",
            attributes={
                "description": "Kafka Cluster description",
            })
        topic = confluentcloud.CatalogEntityAttributes("topic",
            entity_name=f"{kafka_cluster_id}:{kafka_topic_name}",
            entity_type="kafka_topic",
            attributes={
                "owner": "dev",
                "description": "Kafka topic for orders",
                "ownerEmail": "dev@gmail.com",
            })
        schema = confluentcloud.CatalogEntityAttributes("schema",
            entity_name=f"{schema_registry_cluster_id}:.:{purchase['schemaIdentifier']}",
            entity_type="sr_schema",
            attributes={
                "description": "Schema description",
            })
        ```
        > **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.

        :param str resource_name: The name of the resource.
        :param CatalogEntityAttributesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CatalogEntityAttributesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 credentials: Optional[pulumi.Input[Union['CatalogEntityAttributesCredentialsArgs', 'CatalogEntityAttributesCredentialsArgsDict']]] = None,
                 entity_name: Optional[pulumi.Input[builtins.str]] = None,
                 entity_type: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['CatalogEntityAttributesSchemaRegistryClusterArgs', 'CatalogEntityAttributesSchemaRegistryClusterArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CatalogEntityAttributesArgs.__new__(CatalogEntityAttributesArgs)

            __props__.__dict__["attributes"] = attributes
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
        super(CatalogEntityAttributes, __self__).__init__(
            'confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            credentials: Optional[pulumi.Input[Union['CatalogEntityAttributesCredentialsArgs', 'CatalogEntityAttributesCredentialsArgsDict']]] = None,
            entity_name: Optional[pulumi.Input[builtins.str]] = None,
            entity_type: Optional[pulumi.Input[builtins.str]] = None,
            rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[Union['CatalogEntityAttributesSchemaRegistryClusterArgs', 'CatalogEntityAttributesSchemaRegistryClusterArgsDict']]] = None) -> 'CatalogEntityAttributes':
        """
        Get an existing CatalogEntityAttributes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] attributes: The attributes.
        :param pulumi.Input[Union['CatalogEntityAttributesCredentialsArgs', 'CatalogEntityAttributesCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] entity_name: The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        :param pulumi.Input[builtins.str] entity_type: The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        :param pulumi.Input[builtins.str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CatalogEntityAttributesState.__new__(_CatalogEntityAttributesState)

        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["entity_name"] = entity_name
        __props__.__dict__["entity_type"] = entity_type
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        return CatalogEntityAttributes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Optional[Mapping[str, builtins.str]]]:
        """
        The attributes.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.CatalogEntityAttributesCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="entityName")
    def entity_name(self) -> pulumi.Output[builtins.str]:
        """
        The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        """
        return pulumi.get(self, "entity_name")

    @property
    @pulumi.getter(name="entityType")
    def entity_type(self) -> pulumi.Output[builtins.str]:
        """
        The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        """
        return pulumi.get(self, "entity_type")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.CatalogEntityAttributesSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

