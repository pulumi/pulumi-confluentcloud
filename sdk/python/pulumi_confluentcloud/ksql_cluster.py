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

__all__ = ['KsqlClusterArgs', 'KsqlCluster']

@pulumi.input_type
class KsqlClusterArgs:
    def __init__(__self__, *,
                 credential_identity: pulumi.Input['KsqlClusterCredentialIdentityArgs'],
                 csu: pulumi.Input[int],
                 display_name: pulumi.Input[str],
                 environment: pulumi.Input['KsqlClusterEnvironmentArgs'],
                 kafka_cluster: pulumi.Input['KsqlClusterKafkaClusterArgs'],
                 use_detailed_processing_log: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a KsqlCluster resource.
        :param pulumi.Input[int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input['KsqlClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        KsqlClusterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            credential_identity=credential_identity,
            csu=csu,
            display_name=display_name,
            environment=environment,
            kafka_cluster=kafka_cluster,
            use_detailed_processing_log=use_detailed_processing_log,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             credential_identity: Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']] = None,
             csu: Optional[pulumi.Input[int]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             environment: Optional[pulumi.Input['KsqlClusterEnvironmentArgs']] = None,
             kafka_cluster: Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']] = None,
             use_detailed_processing_log: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if credential_identity is None and 'credentialIdentity' in kwargs:
            credential_identity = kwargs['credentialIdentity']
        if credential_identity is None:
            raise TypeError("Missing 'credential_identity' argument")
        if csu is None:
            raise TypeError("Missing 'csu' argument")
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if display_name is None:
            raise TypeError("Missing 'display_name' argument")
        if environment is None:
            raise TypeError("Missing 'environment' argument")
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if kafka_cluster is None:
            raise TypeError("Missing 'kafka_cluster' argument")
        if use_detailed_processing_log is None and 'useDetailedProcessingLog' in kwargs:
            use_detailed_processing_log = kwargs['useDetailedProcessingLog']

        _setter("credential_identity", credential_identity)
        _setter("csu", csu)
        _setter("display_name", display_name)
        _setter("environment", environment)
        _setter("kafka_cluster", kafka_cluster)
        if use_detailed_processing_log is not None:
            _setter("use_detailed_processing_log", use_detailed_processing_log)

    @property
    @pulumi.getter(name="credentialIdentity")
    def credential_identity(self) -> pulumi.Input['KsqlClusterCredentialIdentityArgs']:
        return pulumi.get(self, "credential_identity")

    @credential_identity.setter
    def credential_identity(self, value: pulumi.Input['KsqlClusterCredentialIdentityArgs']):
        pulumi.set(self, "credential_identity", value)

    @property
    @pulumi.getter
    def csu(self) -> pulumi.Input[int]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @csu.setter
    def csu(self, value: pulumi.Input[int]):
        pulumi.set(self, "csu", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The name of the ksqlDB cluster.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
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
    def use_detailed_processing_log(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

    @use_detailed_processing_log.setter
    def use_detailed_processing_log(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_detailed_processing_log", value)


@pulumi.input_type
class _KsqlClusterState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 credential_identity: Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']] = None,
                 csu: Optional[pulumi.Input[int]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['KsqlClusterEnvironmentArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 resource_name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 storage: Optional[pulumi.Input[int]] = None,
                 topic_prefix: Optional[pulumi.Input[str]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering KsqlCluster resources.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        :param pulumi.Input[int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input['KsqlClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the ksqlDB cluster.
        :param pulumi.Input[str] rest_endpoint: (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        :param pulumi.Input[int] storage: (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        :param pulumi.Input[str] topic_prefix: (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        :param pulumi.Input[bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        _KsqlClusterState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            credential_identity=credential_identity,
            csu=csu,
            display_name=display_name,
            environment=environment,
            kafka_cluster=kafka_cluster,
            kind=kind,
            resource_name=resource_name,
            rest_endpoint=rest_endpoint,
            storage=storage,
            topic_prefix=topic_prefix,
            use_detailed_processing_log=use_detailed_processing_log,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[pulumi.Input[str]] = None,
             credential_identity: Optional[pulumi.Input['KsqlClusterCredentialIdentityArgs']] = None,
             csu: Optional[pulumi.Input[int]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             environment: Optional[pulumi.Input['KsqlClusterEnvironmentArgs']] = None,
             kafka_cluster: Optional[pulumi.Input['KsqlClusterKafkaClusterArgs']] = None,
             kind: Optional[pulumi.Input[str]] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             storage: Optional[pulumi.Input[int]] = None,
             topic_prefix: Optional[pulumi.Input[str]] = None,
             use_detailed_processing_log: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if api_version is None and 'apiVersion' in kwargs:
            api_version = kwargs['apiVersion']
        if credential_identity is None and 'credentialIdentity' in kwargs:
            credential_identity = kwargs['credentialIdentity']
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if resource_name is None and 'resourceName' in kwargs:
            resource_name = kwargs['resourceName']
        if rest_endpoint is None and 'restEndpoint' in kwargs:
            rest_endpoint = kwargs['restEndpoint']
        if topic_prefix is None and 'topicPrefix' in kwargs:
            topic_prefix = kwargs['topicPrefix']
        if use_detailed_processing_log is None and 'useDetailedProcessingLog' in kwargs:
            use_detailed_processing_log = kwargs['useDetailedProcessingLog']

        if api_version is not None:
            _setter("api_version", api_version)
        if credential_identity is not None:
            _setter("credential_identity", credential_identity)
        if csu is not None:
            _setter("csu", csu)
        if display_name is not None:
            _setter("display_name", display_name)
        if environment is not None:
            _setter("environment", environment)
        if kafka_cluster is not None:
            _setter("kafka_cluster", kafka_cluster)
        if kind is not None:
            _setter("kind", kind)
        if resource_name is not None:
            _setter("resource_name", resource_name)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)
        if storage is not None:
            _setter("storage", storage)
        if topic_prefix is not None:
            _setter("topic_prefix", topic_prefix)
        if use_detailed_processing_log is not None:
            _setter("use_detailed_processing_log", use_detailed_processing_log)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[str]]):
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
    def csu(self) -> Optional[pulumi.Input[int]]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @csu.setter
    def csu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "csu", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the ksqlDB cluster.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
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
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the ksqlDB cluster.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)

    @property
    @pulumi.getter
    def storage(self) -> Optional[pulumi.Input[int]]:
        """
        (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        """
        return pulumi.get(self, "storage")

    @storage.setter
    def storage(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "storage", value)

    @property
    @pulumi.getter(name="topicPrefix")
    def topic_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        """
        return pulumi.get(self, "topic_prefix")

    @topic_prefix.setter
    def topic_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "topic_prefix", value)

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

    @use_detailed_processing_log.setter
    def use_detailed_processing_log(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_detailed_processing_log", value)


class KsqlCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credential_identity: Optional[pulumi.Input[pulumi.InputType['KsqlClusterCredentialIdentityArgs']]] = None,
                 csu: Optional[pulumi.Input[int]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['KsqlClusterEnvironmentArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KsqlClusterKafkaClusterArgs']]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Import

        You can import a ksqlDB cluster by using Environment ID and ksqlDB cluster ID, in the format `<Environment ID>/<ksqlDB cluster ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/ksqlCluster:KsqlCluster example env-abc123/lksqlc-abc123
        ```

         !> **Warning:**

        Do not forget to delete the terminal's command history afterward for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input[pulumi.InputType['KsqlClusterEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KsqlClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a ksqlDB cluster by using Environment ID and ksqlDB cluster ID, in the format `<Environment ID>/<ksqlDB cluster ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/ksqlCluster:KsqlCluster example env-abc123/lksqlc-abc123
        ```

         !> **Warning:**

        Do not forget to delete the terminal's command history afterward for security purposes.

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
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KsqlClusterArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credential_identity: Optional[pulumi.Input[pulumi.InputType['KsqlClusterCredentialIdentityArgs']]] = None,
                 csu: Optional[pulumi.Input[int]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['KsqlClusterEnvironmentArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KsqlClusterKafkaClusterArgs']]] = None,
                 use_detailed_processing_log: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KsqlClusterArgs.__new__(KsqlClusterArgs)

            if credential_identity is not None and not isinstance(credential_identity, KsqlClusterCredentialIdentityArgs):
                credential_identity = credential_identity or {}
                def _setter(key, value):
                    credential_identity[key] = value
                KsqlClusterCredentialIdentityArgs._configure(_setter, **credential_identity)
            if credential_identity is None and not opts.urn:
                raise TypeError("Missing required property 'credential_identity'")
            __props__.__dict__["credential_identity"] = credential_identity
            if csu is None and not opts.urn:
                raise TypeError("Missing required property 'csu'")
            __props__.__dict__["csu"] = csu
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is not None and not isinstance(environment, KsqlClusterEnvironmentArgs):
                environment = environment or {}
                def _setter(key, value):
                    environment[key] = value
                KsqlClusterEnvironmentArgs._configure(_setter, **environment)
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if kafka_cluster is not None and not isinstance(kafka_cluster, KsqlClusterKafkaClusterArgs):
                kafka_cluster = kafka_cluster or {}
                def _setter(key, value):
                    kafka_cluster[key] = value
                KsqlClusterKafkaClusterArgs._configure(_setter, **kafka_cluster)
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
            api_version: Optional[pulumi.Input[str]] = None,
            credential_identity: Optional[pulumi.Input[pulumi.InputType['KsqlClusterCredentialIdentityArgs']]] = None,
            csu: Optional[pulumi.Input[int]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['KsqlClusterEnvironmentArgs']]] = None,
            kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KsqlClusterKafkaClusterArgs']]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None,
            storage: Optional[pulumi.Input[int]] = None,
            topic_prefix: Optional[pulumi.Input[str]] = None,
            use_detailed_processing_log: Optional[pulumi.Input[bool]] = None) -> 'KsqlCluster':
        """
        Get an existing KsqlCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        :param pulumi.Input[int] csu: The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        :param pulumi.Input[str] display_name: The name of the ksqlDB cluster.
        :param pulumi.Input[pulumi.InputType['KsqlClusterEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the ksqlDB cluster.
        :param pulumi.Input[str] rest_endpoint: (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        :param pulumi.Input[int] storage: (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        :param pulumi.Input[str] topic_prefix: (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        :param pulumi.Input[bool] use_detailed_processing_log: Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
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
    def api_version(self) -> pulumi.Output[str]:
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
    def csu(self) -> pulumi.Output[int]:
        """
        The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
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
    def kind(self) -> pulumi.Output[str]:
        """
        (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the ksqlDB cluster.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[str]:
        """
        (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter
    def storage(self) -> pulumi.Output[int]:
        """
        (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        """
        return pulumi.get(self, "storage")

    @property
    @pulumi.getter(name="topicPrefix")
    def topic_prefix(self) -> pulumi.Output[str]:
        """
        (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        """
        return pulumi.get(self, "topic_prefix")

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> pulumi.Output[Optional[bool]]:
        """
        Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        """
        return pulumi.get(self, "use_detailed_processing_log")

