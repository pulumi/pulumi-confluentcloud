# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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

__all__ = ['KsqlClusterArgs', 'KsqlCluster']

@pulumi.input_type
class KsqlClusterArgs:
    def __init__(__self__, *,
                 credential_identity: pulumi.Input['KsqlClusterCredentialIdentityArgs'],
                 csu: pulumi.Input[builtins.int],
                 display_name: pulumi.Input[builtins.str],
                 environment: pulumi.Input['KsqlClusterEnvironmentArgs'],
                 kafka_cluster: pulumi.Input['KsqlClusterKafkaClusterArgs'],
                 use_detailed_processing_log: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a KsqlCluster resource.
        :param pulumi.Input[builtins.int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[builtins.str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input['KsqlClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        pulumi.set(__self__, "credential_identity", credential_identity)
        pulumi.set(__self__, "csu", csu)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if use_detailed_processing_log is not None:
            pulumi.set(__self__, "use_detailed_processing_log", use_detailed_processing_log)

    @property
    @pulumi.getter(name="credentialIdentity")
    def credential_identity(self) -> pulumi.Input['KsqlClusterCredentialIdentityArgs']:
        return pulumi.get(self, "credential_identity")

    @credential_identity.setter
    def credential_identity(self, value: pulumi.Input['KsqlClusterCredentialIdentityArgs']):
        pulumi.set(self, "credential_identity", value)

    @property
    @pulumi.getter
    def csu(self) -> pulumi.Input[builtins.int]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @csu.setter
    def csu(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "csu", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the ksqlDB cluster.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['KsqlClusterEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['KsqlClusterEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Input['KsqlClusterKafkaClusterArgs']:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: pulumi.Input['KsqlClusterKafkaClusterArgs']):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

    @use_detailed_processing_log.setter
    def use_detailed_processing_log(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_detailed_processing_log", value)


@pulumi.input_type
class _KsqlClusterState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[builtins.str]] = None,
                 credential_identity: Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']] = None,
                 csu: Optional[pulumi.Input[builtins.int]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input['KsqlClusterEnvironmentArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']] = None,
                 kind: Optional[pulumi.Input[builtins.str]] = None,
                 resource_name: Optional[pulumi.Input[builtins.str]] = None,
                 rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 storage: Optional[pulumi.Input[builtins.int]] = None,
                 topic_prefix: Optional[pulumi.Input[builtins.str]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering KsqlCluster resources.
        :param pulumi.Input[builtins.str] api_version: (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        :param pulumi.Input[builtins.int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[builtins.str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input['KsqlClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] kind: (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        :param pulumi.Input[builtins.str] resource_name: (Required String) The Confluent Resource Name of the ksqlDB cluster.
        :param pulumi.Input[builtins.str] rest_endpoint: (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        :param pulumi.Input[builtins.int] storage: (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        :param pulumi.Input[builtins.str] topic_prefix: (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        :param pulumi.Input[builtins.bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", api_version)
        if credential_identity is not None:
            pulumi.set(__self__, "credential_identity", credential_identity)
        if csu is not None:
            pulumi.set(__self__, "csu", csu)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)
        if rest_endpoint is not None:
            pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if storage is not None:
            pulumi.set(__self__, "storage", storage)
        if topic_prefix is not None:
            pulumi.set(__self__, "topic_prefix", topic_prefix)
        if use_detailed_processing_log is not None:
            pulumi.set(__self__, "use_detailed_processing_log", use_detailed_processing_log)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter(name="credentialIdentity")
    def credential_identity(self) -> Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']]:
        return pulumi.get(self, "credential_identity")

    @credential_identity.setter
    def credential_identity(self, value: Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']]):
        pulumi.set(self, "credential_identity", value)

    @property
    @pulumi.getter
    def csu(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @csu.setter
    def csu(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "csu", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the ksqlDB cluster.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['KsqlClusterEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['KsqlClusterEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The Confluent Resource Name of the ksqlDB cluster.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter
    def storage(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        """
        return pulumi.get(self, "storage")

    @storage.setter
    def storage(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "storage", value)

    @property
    @pulumi.getter(name="topicPrefix")
    def topic_prefix(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        """
        return pulumi.get(self, "topic_prefix")

    @topic_prefix.setter
    def topic_prefix(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "topic_prefix", value)

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

    @use_detailed_processing_log.setter
    def use_detailed_processing_log(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_detailed_processing_log", value)


@pulumi.type_token("confluentcloud:index/ksqlCluster:KsqlCluster")
class KsqlCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credential_identity: Optional[pulumi.Input[Union['KsqlClusterCredentialIdentityArgs', 'KsqlClusterCredentialIdentityArgsDict']]] = None,
                 csu: Optional[pulumi.Input[builtins.int]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['KsqlClusterEnvironmentArgs', 'KsqlClusterEnvironmentArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['KsqlClusterKafkaClusterArgs', 'KsqlClusterKafkaClusterArgsDict']]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        !> **Warning:**  It is strongly recommended that you provision a `data.confluent_schema_registry_cluster` resource before you provision a `KsqlCluster` resource in a given environment. If you're provisioning the `data.confluent_schema_registry_cluster` and the `KsqlCluster` resource in the same pulumi up command, reference the `data.confluent_schema_registry_cluster` from the `depends_on` argument inside the `KsqlCluster` resource. This ensures that the `data.confluent_schema_registry_cluster` resource is created before the `KsqlCluster` resource. If you provision a `KsqlCluster` resource without a `data.confluent_schema_registry_cluster` resource, and later, you want to add a `data.confluent_schema_registry_cluster` resource, you must destroy and re-create your `KsqlCluster` resource after provisioning a `data.confluent_schema_registry_cluster` resource.

        `KsqlCluster` provides a ksqlDB cluster resource that enables creating, editing, and deleting ksqlDB clusters on Confluent Cloud.

        ## Import

        You can import a ksqlDB cluster by using Environment ID and ksqlDB cluster ID, in the format `<Environment ID>/<ksqlDB cluster ID>`, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/ksqlCluster:KsqlCluster example env-abc123/lksqlc-abc123
        ```

        !> **Warning:**  Do not forget to delete the terminal's command history afterward for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[builtins.str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input[Union['KsqlClusterEnvironmentArgs', 'KsqlClusterEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KsqlClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        !> **Warning:**  It is strongly recommended that you provision a `data.confluent_schema_registry_cluster` resource before you provision a `KsqlCluster` resource in a given environment. If you're provisioning the `data.confluent_schema_registry_cluster` and the `KsqlCluster` resource in the same pulumi up command, reference the `data.confluent_schema_registry_cluster` from the `depends_on` argument inside the `KsqlCluster` resource. This ensures that the `data.confluent_schema_registry_cluster` resource is created before the `KsqlCluster` resource. If you provision a `KsqlCluster` resource without a `data.confluent_schema_registry_cluster` resource, and later, you want to add a `data.confluent_schema_registry_cluster` resource, you must destroy and re-create your `KsqlCluster` resource after provisioning a `data.confluent_schema_registry_cluster` resource.

        `KsqlCluster` provides a ksqlDB cluster resource that enables creating, editing, and deleting ksqlDB clusters on Confluent Cloud.

        ## Import

        You can import a ksqlDB cluster by using Environment ID and ksqlDB cluster ID, in the format `<Environment ID>/<ksqlDB cluster ID>`, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/ksqlCluster:KsqlCluster example env-abc123/lksqlc-abc123
        ```

        !> **Warning:**  Do not forget to delete the terminal's command history afterward for security purposes.

        :param str resource_name: The name of the resource.
        :param KsqlClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KsqlClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credential_identity: Optional[pulumi.Input[Union['KsqlClusterCredentialIdentityArgs', 'KsqlClusterCredentialIdentityArgsDict']]] = None,
                 csu: Optional[pulumi.Input[builtins.int]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['KsqlClusterEnvironmentArgs', 'KsqlClusterEnvironmentArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['KsqlClusterKafkaClusterArgs', 'KsqlClusterKafkaClusterArgsDict']]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KsqlClusterArgs.__new__(KsqlClusterArgs)

            if credential_identity is None and not opts.urn:
                raise TypeError("Missing required property 'credential_identity'")
            __props__.__dict__["credential_identity"] = credential_identity
            if csu is None and not opts.urn:
                raise TypeError("Missing required property 'csu'")
            __props__.__dict__["csu"] = csu
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if kafka_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'kafka_cluster'")
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            __props__.__dict__["use_detailed_processing_log"] = use_detailed_processing_log
            __props__.__dict__["api_version"] = None
            __props__.__dict__["kind"] = None
            __props__.__dict__["resource_name"] = None
            __props__.__dict__["rest_endpoint"] = None
            __props__.__dict__["storage"] = None
            __props__.__dict__["topic_prefix"] = None
        super(KsqlCluster, __self__).__init__(
            'confluentcloud:index/ksqlCluster:KsqlCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_version: Optional[pulumi.Input[builtins.str]] = None,
            credential_identity: Optional[pulumi.Input[Union['KsqlClusterCredentialIdentityArgs', 'KsqlClusterCredentialIdentityArgsDict']]] = None,
            csu: Optional[pulumi.Input[builtins.int]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            environment: Optional[pulumi.Input[Union['KsqlClusterEnvironmentArgs', 'KsqlClusterEnvironmentArgsDict']]] = None,
            kafka_cluster: Optional[pulumi.Input[Union['KsqlClusterKafkaClusterArgs', 'KsqlClusterKafkaClusterArgsDict']]] = None,
            kind: Optional[pulumi.Input[builtins.str]] = None,
            resource_name_: Optional[pulumi.Input[builtins.str]] = None,
            rest_endpoint: Optional[pulumi.Input[builtins.str]] = None,
            storage: Optional[pulumi.Input[builtins.int]] = None,
            topic_prefix: Optional[pulumi.Input[builtins.str]] = None,
            use_detailed_processing_log: Optional[pulumi.Input[builtins.bool]] = None) -> 'KsqlCluster':
        """
        Get an existing KsqlCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] api_version: (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        :param pulumi.Input[builtins.int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[builtins.str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input[Union['KsqlClusterEnvironmentArgs', 'KsqlClusterEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] kind: (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        :param pulumi.Input[builtins.str] resource_name_: (Required String) The Confluent Resource Name of the ksqlDB cluster.
        :param pulumi.Input[builtins.str] rest_endpoint: (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        :param pulumi.Input[builtins.int] storage: (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        :param pulumi.Input[builtins.str] topic_prefix: (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        :param pulumi.Input[builtins.bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KsqlClusterState.__new__(_KsqlClusterState)

        __props__.__dict__["api_version"] = api_version
        __props__.__dict__["credential_identity"] = credential_identity
        __props__.__dict__["csu"] = csu
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["kind"] = kind
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        __props__.__dict__["storage"] = storage
        __props__.__dict__["topic_prefix"] = topic_prefix
        __props__.__dict__["use_detailed_processing_log"] = use_detailed_processing_log
        return KsqlCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="credentialIdentity")
    def credential_identity(self) -> pulumi.Output['outputs.KsqlClusterCredentialIdentity']:
        return pulumi.get(self, "credential_identity")

    @property
    @pulumi.getter
    def csu(self) -> pulumi.Output[builtins.int]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the ksqlDB cluster.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.KsqlClusterEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output['outputs.KsqlClusterKafkaCluster']:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The Confluent Resource Name of the ksqlDB cluster.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter
    def storage(self) -> pulumi.Output[builtins.int]:
        """
        (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        """
        return pulumi.get(self, "storage")

    @property
    @pulumi.getter(name="topicPrefix")
    def topic_prefix(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        """
        return pulumi.get(self, "topic_prefix")

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

