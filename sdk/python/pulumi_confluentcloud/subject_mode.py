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

__all__ = ['SubjectModeArgs', 'SubjectMode']

@pulumi.input_type
class SubjectModeArgs:
    def __init__(__self__, *,
                 subject_name: pulumi.Input[str],
                 credentials: Optional[pulumi.Input['SubjectModeCredentialsArgs']] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']] = None):
        """
        The set of arguments for constructing a SubjectMode resource.
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        :param pulumi.Input['SubjectModeCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] mode: The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        pulumi.set(__self__, "subject_name", subject_name)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
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
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SubjectModeCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SubjectModeCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']]):
        pulumi.set(self, "schema_registry_cluster", value)


@pulumi.input_type
class _SubjectModeState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['SubjectModeCredentialsArgs']] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']] = None,
                 subject_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SubjectMode resources.
        :param pulumi.Input['SubjectModeCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] mode: The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster is not None:
            pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if subject_name is not None:
            pulumi.set(__self__, "subject_name", subject_name)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['SubjectModeCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['SubjectModeCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

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
    def schema_registry_cluster(self) -> Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']]:
        return pulumi.get(self, "schema_registry_cluster")

    @schema_registry_cluster.setter
    def schema_registry_cluster(self, value: Optional[pulumi.Input['SubjectModeSchemaRegistryClusterArgs']]):
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


class SubjectMode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Union['SubjectModeCredentialsArgs', 'SubjectModeCredentialsArgsDict']]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['SubjectModeSchemaRegistryClusterArgs', 'SubjectModeSchemaRegistryClusterArgsDict']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Subject Mode by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/subjectMode:SubjectMode example lsrc-abc123/test-subject
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['SubjectModeCredentialsArgs', 'SubjectModeCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] mode: The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubjectModeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Subject Mode by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:

        $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"

        $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"

        $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"

        ```sh
        $ pulumi import confluentcloud:index/subjectMode:SubjectMode example lsrc-abc123/test-subject
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param SubjectModeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubjectModeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Union['SubjectModeCredentialsArgs', 'SubjectModeCredentialsArgsDict']]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 schema_registry_cluster: Optional[pulumi.Input[Union['SubjectModeSchemaRegistryClusterArgs', 'SubjectModeSchemaRegistryClusterArgsDict']]] = None,
                 subject_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubjectModeArgs.__new__(SubjectModeArgs)

            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["mode"] = mode
            __props__.__dict__["rest_endpoint"] = rest_endpoint
            __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
            if subject_name is None and not opts.urn:
                raise TypeError("Missing required property 'subject_name'")
            __props__.__dict__["subject_name"] = subject_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SubjectMode, __self__).__init__(
            'confluentcloud:index/subjectMode:SubjectMode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[Union['SubjectModeCredentialsArgs', 'SubjectModeCredentialsArgsDict']]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            schema_registry_cluster: Optional[pulumi.Input[Union['SubjectModeSchemaRegistryClusterArgs', 'SubjectModeSchemaRegistryClusterArgsDict']]] = None,
            subject_name: Optional[pulumi.Input[str]] = None) -> 'SubjectMode':
        """
        Get an existing SubjectMode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['SubjectModeCredentialsArgs', 'SubjectModeCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] mode: The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        :param pulumi.Input[str] subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubjectModeState.__new__(_SubjectModeState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["mode"] = mode
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["schema_registry_cluster"] = schema_registry_cluster
        __props__.__dict__["subject_name"] = subject_name
        return SubjectMode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.SubjectModeCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> pulumi.Output[Optional['outputs.SubjectModeSchemaRegistryCluster']]:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> pulumi.Output[str]:
        """
        The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        """
        return pulumi.get(self, "subject_name")

