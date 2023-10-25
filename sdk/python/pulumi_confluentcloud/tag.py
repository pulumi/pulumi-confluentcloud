# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TagArgs', 'Tag']

@pulumi.input_type
class TagArgs:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['TagCredentialsArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a Tag resource.
        :param pulumi.Input['TagCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] description: The description of the tag to be created.
        :param pulumi.Input[str] name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        TagArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            credentials=credentials,
            description=description,
            name=name,
            rest_endpoint=rest_endpoint,
            schema_registry_cluster=schema_registry_cluster,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             credentials: Optional[pulumi.Input['TagCredentialsArgs']] = None,
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             schema_registry_cluster: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if rest_endpoint is None and 'restEndpoint' in kwargs:
            rest_endpoint = kwargs['restEndpoint']
        if schema_registry_cluster is None and 'schemaRegistryCluster' in kwargs:
            schema_registry_cluster = kwargs['schemaRegistryCluster']

        if credentials is not None:
            _setter("credentials", credentials)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            _setter("schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['TagCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['TagCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the tag to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['TagSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _TagState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['TagCredentialsArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 entity_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Tag resources.
        :param pulumi.Input['TagCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] description: The description of the tag to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entity_types: (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[str] name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] version: (Optional Integer) The version, for example, `1`.
        """
        _TagState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            credentials=credentials,
            description=description,
            entity_types=entity_types,
            name=name,
            rest_endpoint=rest_endpoint,
            schema_registry_cluster=schema_registry_cluster,
            version=version,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             credentials: Optional[pulumi.Input['TagCredentialsArgs']] = None,
             description: Optional[pulumi.Input[str]] = None,
             entity_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             schema_registry_cluster: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']] = None,
             version: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if entity_types is None and 'entityTypes' in kwargs:
            entity_types = kwargs['entityTypes']
        if rest_endpoint is None and 'restEndpoint' in kwargs:
            rest_endpoint = kwargs['restEndpoint']
        if schema_registry_cluster is None and 'schemaRegistryCluster' in kwargs:
            schema_registry_cluster = kwargs['schemaRegistryCluster']

        if credentials is not None:
            _setter("credentials", credentials)
        if description is not None:
            _setter("description", description)
        if entity_types is not None:
            _setter("entity_types", entity_types)
        if name is not None:
            _setter("name", name)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            _setter("schema_registry_cluster", schema_registry_cluster)
        if version is not None:
            _setter("version", version)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['TagCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['TagCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the tag to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="entityTypes")
    def entity_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        """
        return pulumi.get(self, "entity_types")

    @entity_types.setter
    def entity_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "entity_types", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['TagSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['TagSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        (Optional Integer) The version, for example, `1`.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class Tag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['TagCredentialsArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['TagSchemaRegistryClusterArgs']]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Tag by using the Schema Registry cluster ID, Tag name in the format `<Schema Registry cluster ID>/<Tag name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/tag:Tag pii lsrc-8wrx70/PII
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TagCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] description: The description of the tag to be created.
        :param pulumi.Input[str] name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TagArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Tag by using the Schema Registry cluster ID, Tag name in the format `<Schema Registry cluster ID>/<Tag name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/tag:Tag pii lsrc-8wrx70/PII
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param TagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TagArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['TagCredentialsArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['TagSchemaRegistryClusterArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagArgs.__new__(TagArgs)

            credentials = _utilities.configure(credentials, TagCredentialsArgs, True)
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            schema_registry_cluster = _utilities.configure(schema_registry_cluster, TagSchemaRegistryClusterArgs, True)
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            __props__.__dict__["entity_types"] = None
            __props__.__dict__["version"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Tag, __self__).__init__(
            'confluentcloud:index/tag:Tag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['TagCredentialsArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            entity_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['TagSchemaRegistryClusterArgs']]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'Tag':
        """
        Get an existing Tag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TagCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] description: The description of the tag to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entity_types: (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        :param pulumi.Input[str] name: The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[int] version: (Optional Integer) The version, for example, `1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagState.__new__(_TagState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["description"] = description
        __props__.__dict__["entity_types"] = entity_types
        __props__.__dict__["name"] = name
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["version"] = version
        return Tag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.TagCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the tag to be created.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="entityTypes")
    def entity_types(self) -> pulumi.Output[Sequence[str]]:
        """
        (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        """
        return pulumi.get(self, "entity_types")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.TagSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        (Optional Integer) The version, for example, `1`.
        """
        return pulumi.get(self, "version")

