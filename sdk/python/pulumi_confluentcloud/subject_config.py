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

__all__ = ['SubjectConfigArgs', 'SubjectConfig']

@pulumi.input_type
class SubjectConfigArgs:
    def __init__(__self__, *,
                 subject_name: pulumi.Input[str],
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SubjectConfigCredentialsArgs']] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a SubjectConfig resource.
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        :param pulumi.Input[str] compatibility_level: The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        :param pulumi.Input['SubjectConfigCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        pulumi.set(__self__, "subject_name", subject_name)
        if compatibility_level is not None:
            pulumi.set(__self__, "compatibility_level", compatibility_level)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> pulumi.Input[str]:
        """
        The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        return pulumi.get(self, "subject_name")

    @subject_name.setter
    def subject_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "subject_name", value)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> Optional[pulumi.Input[str]]:
        """
        The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        """
        return pulumi.get(self, "compatibility_level")

    @compatibility_level.setter
    def compatibility_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compatibility_level", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SubjectConfigCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SubjectConfigCredentialsArgs']]):
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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _SubjectConfigState:
    def __init__(__self__, *,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['SubjectConfigCredentialsArgs']] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']] = None,
                 subject_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SubjectConfig resources.
        :param pulumi.Input[str] compatibility_level: The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        :param pulumi.Input['SubjectConfigCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        if compatibility_level is not None:
            pulumi.set(__self__, "compatibility_level", compatibility_level)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if subject_name is not None:
            pulumi.set(__self__, "subject_name", subject_name)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> Optional[pulumi.Input[str]]:
        """
        The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        """
        return pulumi.get(self, "compatibility_level")

    @compatibility_level.setter
    def compatibility_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compatibility_level", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SubjectConfigCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SubjectConfigCredentialsArgs']]):
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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SubjectConfigSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        return pulumi.get(self, "subject_name")

    @subject_name.setter
    def subject_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_name", value)


class SubjectConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['SubjectConfigCredentialsArgs']]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SubjectConfigSchemaRegistryClusterArgs']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Subject Config by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/subjectConfig:SubjectConfig example lsrc-abc123/test-subject
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compatibility_level: The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        :param pulumi.Input[pulumi.InputType['SubjectConfigCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubjectConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Subject Config by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/subjectConfig:SubjectConfig example lsrc-abc123/test-subject
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param SubjectConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubjectConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['SubjectConfigCredentialsArgs']]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SubjectConfigSchemaRegistryClusterArgs']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubjectConfigArgs.__new__(SubjectConfigArgs)

            __props__.__dict__["compatibility_level"] = compatibility_level
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            if subject_name is None and not opts.urn:
                raise TypeError("Missing required property 'subject_name'")
            __props__.__dict__["subject_name"] = subject_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SubjectConfig, __self__).__init__(
            'confluentcloud:index/subjectConfig:SubjectConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compatibility_level: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['SubjectConfigCredentialsArgs']]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[pulumi.InputType['SubjectConfigSchemaRegistryClusterArgs']]] = None,
            subject_name: Optional[pulumi.Input[str]] = None) -> 'SubjectConfig':
        """
        Get an existing SubjectConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compatibility_level: The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        :param pulumi.Input[pulumi.InputType['SubjectConfigCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubjectConfigState.__new__(_SubjectConfigState)

        __props__.__dict__["compatibility_level"] = compatibility_level
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["subject_name"] = subject_name
        return SubjectConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> pulumi.Output[str]:
        """
        The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        """
        return pulumi.get(self, "compatibility_level")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.SubjectConfigCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.SubjectConfigSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> pulumi.Output[str]:
        """
        The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        return pulumi.get(self, "subject_name")

