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

__all__ = ['SchemaExporterArgs', 'SchemaExporter']

@pulumi.input_type
class SchemaExporterArgs:
    def __init__(__self__, *,
                 destination_schema_registry_cluster: pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs'],
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 context_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SchemaExporterCredentialsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reset_on_update: Optional[pulumi.Input[bool]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subject_rename_format: Optional[pulumi.Input[str]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SchemaExporter resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: Block for custom *nonsensitive* configuration properties:
        :param pulumi.Input[str] context: Customized context of the exporter if `context_type` is set to `CUSTOM`.
        :param pulumi.Input[str] context_type: Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        :param pulumi.Input['SchemaExporterCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] name: Name of the Schema Exporter.
        :param pulumi.Input[bool] reset_on_update: The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] status: The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        :param pulumi.Input[str] subject_rename_format: Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subjects: Name of each exporter subject.
        """
        pulumi.set(__self__, "destination_schema_registry_cluster", destination_schema_registry_cluster)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if context_type is not None:
            pulumi.set(__self__, "context_type", context_type)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if reset_on_update is not None:
            pulumi.set(__self__, "reset_on_update", reset_on_update)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subject_rename_format is not None:
            pulumi.set(__self__, "subject_rename_format", subject_rename_format)
        if subjects is not None:
            pulumi.set(__self__, "subjects", subjects)

    @property
    @pulumi.getter(name="destinationSchemaRegistryCluster")
    def destination_schema_registry_cluster(self) -> pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs']:
        return pulumi.get(self, "destination_schema_registry_cluster")

    @destination_schema_registry_cluster.setter
    def destination_schema_registry_cluster(self, value: pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs']):
        pulumi.set(self, "destination_schema_registry_cluster", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Block for custom *nonsensitive* configuration properties:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[str]]:
        """
        Customized context of the exporter if `context_type` is set to `CUSTOM`.
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context", value)

    @property
    @pulumi.getter(name="contextType")
    def context_type(self) -> Optional[pulumi.Input[str]]:
        """
        Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        """
        return pulumi.get(self, "context_type")

    @context_type.setter
    def context_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context_type", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SchemaExporterCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SchemaExporterCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Schema Exporter.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resetOnUpdate")
    def reset_on_update(self) -> Optional[pulumi.Input[bool]]:
        """
        The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        """
        return pulumi.get(self, "reset_on_update")

    @reset_on_update.setter
    def reset_on_update(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "reset_on_update", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="subjectRenameFormat")
    def subject_rename_format(self) -> Optional[pulumi.Input[str]]:
        """
        Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        """
        return pulumi.get(self, "subject_rename_format")

    @subject_rename_format.setter
    def subject_rename_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_rename_format", value)

    @property
    @pulumi.getter
    def subjects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Name of each exporter subject.
        """
        return pulumi.get(self, "subjects")

    @subjects.setter
    def subjects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subjects", value)


@pulumi.input_type
class _SchemaExporterState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 context_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SchemaExporterCredentialsArgs']] = None,
                 destination_schema_registry_cluster: Optional[pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reset_on_update: Optional[pulumi.Input[bool]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subject_rename_format: Optional[pulumi.Input[str]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SchemaExporter resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: Block for custom *nonsensitive* configuration properties:
        :param pulumi.Input[str] context: Customized context of the exporter if `context_type` is set to `CUSTOM`.
        :param pulumi.Input[str] context_type: Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        :param pulumi.Input['SchemaExporterCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] name: Name of the Schema Exporter.
        :param pulumi.Input[bool] reset_on_update: The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] status: The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        :param pulumi.Input[str] subject_rename_format: Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subjects: Name of each exporter subject.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if context_type is not None:
            pulumi.set(__self__, "context_type", context_type)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if destination_schema_registry_cluster is not None:
            pulumi.set(__self__, "destination_schema_registry_cluster", destination_schema_registry_cluster)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if reset_on_update is not None:
            pulumi.set(__self__, "reset_on_update", reset_on_update)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subject_rename_format is not None:
            pulumi.set(__self__, "subject_rename_format", subject_rename_format)
        if subjects is not None:
            pulumi.set(__self__, "subjects", subjects)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Block for custom *nonsensitive* configuration properties:
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[str]]:
        """
        Customized context of the exporter if `context_type` is set to `CUSTOM`.
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context", value)

    @property
    @pulumi.getter(name="contextType")
    def context_type(self) -> Optional[pulumi.Input[str]]:
        """
        Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        """
        return pulumi.get(self, "context_type")

    @context_type.setter
    def context_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "context_type", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SchemaExporterCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SchemaExporterCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="destinationSchemaRegistryCluster")
    def destination_schema_registry_cluster(self) -> Optional[pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "destination_schema_registry_cluster")

    @destination_schema_registry_cluster.setter
    def destination_schema_registry_cluster(self, value: Optional[pulumi.Input['SchemaExporterDestinationSchemaRegistryClusterArgs']]):
        pulumi.set(self, "destination_schema_registry_cluster", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Schema Exporter.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resetOnUpdate")
    def reset_on_update(self) -> Optional[pulumi.Input[bool]]:
        """
        The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        """
        return pulumi.get(self, "reset_on_update")

    @reset_on_update.setter
    def reset_on_update(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "reset_on_update", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SchemaExporterSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="subjectRenameFormat")
    def subject_rename_format(self) -> Optional[pulumi.Input[str]]:
        """
        Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        """
        return pulumi.get(self, "subject_rename_format")

    @subject_rename_format.setter
    def subject_rename_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_rename_format", value)

    @property
    @pulumi.getter
    def subjects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Name of each exporter subject.
        """
        return pulumi.get(self, "subjects")

    @subjects.setter
    def subjects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subjects", value)


class SchemaExporter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 context_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['SchemaExporterCredentialsArgs']]] = None,
                 destination_schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterDestinationSchemaRegistryClusterArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reset_on_update: Optional[pulumi.Input[bool]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterSchemaRegistryClusterArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subject_rename_format: Optional[pulumi.Input[str]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Schema Exporter by using the Schema Registry cluster ID, Schema Exporter name in the format `<Schema Registry cluster ID>/<Schema Exporter name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/schemaExporter:SchemaExporter main lsrc-8wrx70/test-exporter
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: Block for custom *nonsensitive* configuration properties:
        :param pulumi.Input[str] context: Customized context of the exporter if `context_type` is set to `CUSTOM`.
        :param pulumi.Input[str] context_type: Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        :param pulumi.Input[pulumi.InputType['SchemaExporterCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] name: Name of the Schema Exporter.
        :param pulumi.Input[bool] reset_on_update: The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] status: The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        :param pulumi.Input[str] subject_rename_format: Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subjects: Name of each exporter subject.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaExporterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Schema Exporter by using the Schema Registry cluster ID, Schema Exporter name in the format `<Schema Registry cluster ID>/<Schema Exporter name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/schemaExporter:SchemaExporter main lsrc-8wrx70/test-exporter
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param SchemaExporterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaExporterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 context: Optional[pulumi.Input[str]] = None,
                 context_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['SchemaExporterCredentialsArgs']]] = None,
                 destination_schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterDestinationSchemaRegistryClusterArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reset_on_update: Optional[pulumi.Input[bool]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterSchemaRegistryClusterArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subject_rename_format: Optional[pulumi.Input[str]] = None,
                 subjects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaExporterArgs.__new__(SchemaExporterArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["context"] = context
            __props__.__dict__["context_type"] = context_type
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if destination_schema_registry_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'destination_schema_registry_cluster'")
            __props__.__dict__["destination_schema_registry_cluster"] = destination_schema_registry_cluster
            __props__.__dict__["name"] = name
            __props__.__dict__["reset_on_update"] = reset_on_update
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            __props__.__dict__["status"] = status
            __props__.__dict__["subject_rename_format"] = subject_rename_format
            __props__.__dict__["subjects"] = subjects
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SchemaExporter, __self__).__init__(
            'confluentcloud:index/schemaExporter:SchemaExporter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            context: Optional[pulumi.Input[str]] = None,
            context_type: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['SchemaExporterCredentialsArgs']]] = None,
            destination_schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterDestinationSchemaRegistryClusterArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            reset_on_update: Optional[pulumi.Input[bool]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SchemaExporterSchemaRegistryClusterArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subject_rename_format: Optional[pulumi.Input[str]] = None,
            subjects: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'SchemaExporter':
        """
        Get an existing SchemaExporter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] config: Block for custom *nonsensitive* configuration properties:
        :param pulumi.Input[str] context: Customized context of the exporter if `context_type` is set to `CUSTOM`.
        :param pulumi.Input[str] context_type: Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        :param pulumi.Input[pulumi.InputType['SchemaExporterCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] name: Name of the Schema Exporter.
        :param pulumi.Input[bool] reset_on_update: The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] status: The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        :param pulumi.Input[str] subject_rename_format: Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subjects: Name of each exporter subject.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaExporterState.__new__(_SchemaExporterState)

        __props__.__dict__["config"] = config
        __props__.__dict__["context"] = context
        __props__.__dict__["context_type"] = context_type
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["destination_schema_registry_cluster"] = destination_schema_registry_cluster
        __props__.__dict__["name"] = name
        __props__.__dict__["reset_on_update"] = reset_on_update
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["status"] = status
        __props__.__dict__["subject_rename_format"] = subject_rename_format
        __props__.__dict__["subjects"] = subjects
        return SchemaExporter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Block for custom *nonsensitive* configuration properties:
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def context(self) -> pulumi.Output[str]:
        """
        Customized context of the exporter if `context_type` is set to `CUSTOM`.
        """
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="contextType")
    def context_type(self) -> pulumi.Output[str]:
        """
        Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
        """
        return pulumi.get(self, "context_type")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.SchemaExporterCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="destinationSchemaRegistryCluster")
    def destination_schema_registry_cluster(self) -> pulumi.Output['outputs.SchemaExporterDestinationSchemaRegistryCluster']:
        return pulumi.get(self, "destination_schema_registry_cluster")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Schema Exporter.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resetOnUpdate")
    def reset_on_update(self) -> pulumi.Output[Optional[bool]]:
        """
        The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
        """
        return pulumi.get(self, "reset_on_update")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.SchemaExporterSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subjectRenameFormat")
    def subject_rename_format(self) -> pulumi.Output[str]:
        """
        Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dc_orders`.
        """
        return pulumi.get(self, "subject_rename_format")

    @property
    @pulumi.getter
    def subjects(self) -> pulumi.Output[Sequence[str]]:
        """
        Name of each exporter subject.
        """
        return pulumi.get(self, "subjects")

