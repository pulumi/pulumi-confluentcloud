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

__all__ = ['KafkaAclArgs', 'KafkaAcl']

@pulumi.input_type
class KafkaAclArgs:
    def __init__(__self__, *,
                 host: pulumi.Input[str],
                 operation: pulumi.Input[str],
                 pattern_type: pulumi.Input[str],
                 permission: pulumi.Input[str],
                 principal: pulumi.Input[str],
                 resource_name: pulumi.Input[str],
                 resource_type: pulumi.Input[str],
                 credentials: Optional[pulumi.Input['KafkaAclCredentialsArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KafkaAcl resource.
        :param pulumi.Input[str] host: The host for the ACL.
        :param pulumi.Input[str] operation: The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] pattern_type: The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        :param pulumi.Input[str] permission: The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        :param pulumi.Input[str] principal: The principal for the ACL.
        :param pulumi.Input[str] resource_name: The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        :param pulumi.Input[str] resource_type: The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input['KafkaAclCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        KafkaAclArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            host=host,
            operation=operation,
            pattern_type=pattern_type,
            permission=permission,
            principal=principal,
            resource_name=resource_name,
            resource_type=resource_type,
            credentials=credentials,
            kafka_cluster=kafka_cluster,
            rest_endpoint=rest_endpoint,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             host: Optional[pulumi.Input[str]] = None,
             operation: Optional[pulumi.Input[str]] = None,
             pattern_type: Optional[pulumi.Input[str]] = None,
             permission: Optional[pulumi.Input[str]] = None,
             principal: Optional[pulumi.Input[str]] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             resource_type: Optional[pulumi.Input[str]] = None,
             credentials: Optional[pulumi.Input['KafkaAclCredentialsArgs']] = None,
             kafka_cluster: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if host is None:
            raise TypeError("Missing 'host' argument")
        if operation is None:
            raise TypeError("Missing 'operation' argument")
        if pattern_type is None and 'patternType' in kwargs:
            pattern_type = kwargs['patternType']
        if pattern_type is None:
            raise TypeError("Missing 'pattern_type' argument")
        if permission is None:
            raise TypeError("Missing 'permission' argument")
        if principal is None:
            raise TypeError("Missing 'principal' argument")
        if resource_name is None and 'resourceName' in kwargs:
            resource_name = kwargs['resourceName']
        if resource_name is None:
            raise TypeError("Missing 'resource_name' argument")
        if resource_type is None and 'resourceType' in kwargs:
            resource_type = kwargs['resourceType']
        if resource_type is None:
            raise TypeError("Missing 'resource_type' argument")
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if rest_endpoint is None and 'restEndpoint' in kwargs:
            rest_endpoint = kwargs['restEndpoint']

        _setter("host", host)
        _setter("operation", operation)
        _setter("pattern_type", pattern_type)
        _setter("permission", permission)
        _setter("principal", principal)
        _setter("resource_name", resource_name)
        _setter("resource_type", resource_type)
        if credentials is not None:
            _setter("credentials", credentials)
        if kafka_cluster is not None:
            _setter("kafka_cluster", kafka_cluster)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter
    def host(self) -> pulumi.Input[str]:
        """
        The host for the ACL.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def operation(self) -> pulumi.Input[str]:
        """
        The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "operation")

    @operation.setter
    def operation(self, value: pulumi.Input[str]):
        pulumi.set(self, "operation", value)

    @property
    @pulumi.getter(name="patternType")
    def pattern_type(self) -> pulumi.Input[str]:
        """
        The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        """
        return pulumi.get(self, "pattern_type")

    @pattern_type.setter
    def pattern_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "pattern_type", value)

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Input[str]:
        """
        The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: pulumi.Input[str]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Input[str]:
        """
        The principal for the ACL.
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: pulumi.Input[str]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Input[str]:
        """
        The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Input[str]:
        """
        The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_type", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['KafkaAclCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['KafkaAclCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaAclKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)


@pulumi.input_type
class _KafkaAclState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['KafkaAclCredentialsArgs']] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']] = None,
                 operation: Optional[pulumi.Input[str]] = None,
                 pattern_type: Optional[pulumi.Input[str]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 resource_name: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KafkaAcl resources.
        :param pulumi.Input['KafkaAclCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] host: The host for the ACL.
        :param pulumi.Input[str] operation: The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] pattern_type: The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        :param pulumi.Input[str] permission: The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        :param pulumi.Input[str] principal: The principal for the ACL.
        :param pulumi.Input[str] resource_name: The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        :param pulumi.Input[str] resource_type: The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        _KafkaAclState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            credentials=credentials,
            host=host,
            kafka_cluster=kafka_cluster,
            operation=operation,
            pattern_type=pattern_type,
            permission=permission,
            principal=principal,
            resource_name=resource_name,
            resource_type=resource_type,
            rest_endpoint=rest_endpoint,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             credentials: Optional[pulumi.Input['KafkaAclCredentialsArgs']] = None,
             host: Optional[pulumi.Input[str]] = None,
             kafka_cluster: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']] = None,
             operation: Optional[pulumi.Input[str]] = None,
             pattern_type: Optional[pulumi.Input[str]] = None,
             permission: Optional[pulumi.Input[str]] = None,
             principal: Optional[pulumi.Input[str]] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             resource_type: Optional[pulumi.Input[str]] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if kafka_cluster is None and 'kafkaCluster' in kwargs:
            kafka_cluster = kwargs['kafkaCluster']
        if pattern_type is None and 'patternType' in kwargs:
            pattern_type = kwargs['patternType']
        if resource_name is None and 'resourceName' in kwargs:
            resource_name = kwargs['resourceName']
        if resource_type is None and 'resourceType' in kwargs:
            resource_type = kwargs['resourceType']
        if rest_endpoint is None and 'restEndpoint' in kwargs:
            rest_endpoint = kwargs['restEndpoint']

        if credentials is not None:
            _setter("credentials", credentials)
        if host is not None:
            _setter("host", host)
        if kafka_cluster is not None:
            _setter("kafka_cluster", kafka_cluster)
        if operation is not None:
            _setter("operation", operation)
        if pattern_type is not None:
            _setter("pattern_type", pattern_type)
        if permission is not None:
            _setter("permission", permission)
        if principal is not None:
            _setter("principal", principal)
        if resource_name is not None:
            _setter("resource_name", resource_name)
        if resource_type is not None:
            _setter("resource_type", resource_type)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['KafkaAclCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['KafkaAclCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        """
        The host for the ACL.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaAclKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaAclKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter
    def operation(self) -> Optional[pulumi.Input[str]]:
        """
        The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "operation")

    @operation.setter
    def operation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operation", value)

    @property
    @pulumi.getter(name="patternType")
    def pattern_type(self) -> Optional[pulumi.Input[str]]:
        """
        The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        """
        return pulumi.get(self, "pattern_type")

    @pattern_type.setter
    def pattern_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pattern_type", value)

    @property
    @pulumi.getter
    def permission(self) -> Optional[pulumi.Input[str]]:
        """
        The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter
    def principal(self) -> Optional[pulumi.Input[str]]:
        """
        The principal for the ACL.
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_type", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)


class KafkaAcl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['KafkaAclCredentialsArgs']]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaAclKafkaClusterArgs']]] = None,
                 operation: Optional[pulumi.Input[str]] = None,
                 pattern_type: Optional[pulumi.Input[str]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 resource_name_: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        You can import Kafka ACLs by using the Kafka cluster ID and attributes of `confluent_kafka_acl` resource in the format `<Kafka cluster ID>/<Kafka ACL resource type>#<Kafka ACL resource name>#<Kafka ACL pattern type>#<Kafka ACL principal>#<Kafka ACL host>#<Kafka ACL operation>#<Kafka ACL permission>`, for exampleOption #1Manage multiple Kafka clusters in the same Terraform workspace $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
        ```

         Option #2Manage a single Kafka cluster in the same Terraform workspace $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['KafkaAclCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] host: The host for the ACL.
        :param pulumi.Input[str] operation: The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] pattern_type: The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        :param pulumi.Input[str] permission: The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        :param pulumi.Input[str] principal: The principal for the ACL.
        :param pulumi.Input[str] resource_name_: The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        :param pulumi.Input[str] resource_type: The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaAclArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import Kafka ACLs by using the Kafka cluster ID and attributes of `confluent_kafka_acl` resource in the format `<Kafka cluster ID>/<Kafka ACL resource type>#<Kafka ACL resource name>#<Kafka ACL pattern type>#<Kafka ACL principal>#<Kafka ACL host>#<Kafka ACL operation>#<Kafka ACL permission>`, for exampleOption #1Manage multiple Kafka clusters in the same Terraform workspace $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
        ```

         Option #2Manage a single Kafka cluster in the same Terraform workspace $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param KafkaAclArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaAclArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KafkaAclArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['KafkaAclCredentialsArgs']]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaAclKafkaClusterArgs']]] = None,
                 operation: Optional[pulumi.Input[str]] = None,
                 pattern_type: Optional[pulumi.Input[str]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 resource_name_: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaAclArgs.__new__(KafkaAclArgs)

            if credentials is not None and not isinstance(credentials, KafkaAclCredentialsArgs):
                credentials = credentials or {}
                def _setter(key, value):
                    credentials[key] = value
                KafkaAclCredentialsArgs._configure(_setter, **credentials)
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__.__dict__["host"] = host
            if kafka_cluster is not None and not isinstance(kafka_cluster, KafkaAclKafkaClusterArgs):
                kafka_cluster = kafka_cluster or {}
                def _setter(key, value):
                    kafka_cluster[key] = value
                KafkaAclKafkaClusterArgs._configure(_setter, **kafka_cluster)
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            if operation is None and not opts.urn:
                raise TypeError("Missing required property 'operation'")
            __props__.__dict__["operation"] = operation
            if pattern_type is None and not opts.urn:
                raise TypeError("Missing required property 'pattern_type'")
            __props__.__dict__["pattern_type"] = pattern_type
            if permission is None and not opts.urn:
                raise TypeError("Missing required property 'permission'")
            __props__.__dict__["permission"] = permission
            if principal is None and not opts.urn:
                raise TypeError("Missing required property 'principal'")
            __props__.__dict__["principal"] = principal
            if resource_name_ is None and not opts.urn:
                raise TypeError("Missing required property 'resource_name_'")
            __props__.__dict__["resource_name"] = resource_name_
            if resource_type is None and not opts.urn:
                raise TypeError("Missing required property 'resource_type'")
            __props__.__dict__["resource_type"] = resource_type
            __props__.__dict__["rest_endpoint"] = rest_endpoint
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(KafkaAcl, __self__).__init__(
            'confluentcloud:index/kafkaAcl:KafkaAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['KafkaAclCredentialsArgs']]] = None,
            host: Optional[pulumi.Input[str]] = None,
            kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaAclKafkaClusterArgs']]] = None,
            operation: Optional[pulumi.Input[str]] = None,
            pattern_type: Optional[pulumi.Input[str]] = None,
            permission: Optional[pulumi.Input[str]] = None,
            principal: Optional[pulumi.Input[str]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None,
            resource_type: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None) -> 'KafkaAcl':
        """
        Get an existing KafkaAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['KafkaAclCredentialsArgs']] credentials: The Cluster API Credentials.
        :param pulumi.Input[str] host: The host for the ACL.
        :param pulumi.Input[str] operation: The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] pattern_type: The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        :param pulumi.Input[str] permission: The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        :param pulumi.Input[str] principal: The principal for the ACL.
        :param pulumi.Input[str] resource_name_: The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        :param pulumi.Input[str] resource_type: The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        :param pulumi.Input[str] rest_endpoint: The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaAclState.__new__(_KafkaAclState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["host"] = host
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["operation"] = operation
        __props__.__dict__["pattern_type"] = pattern_type
        __props__.__dict__["permission"] = permission
        __props__.__dict__["principal"] = principal
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["resource_type"] = resource_type
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        return KafkaAcl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.KafkaAclCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        The host for the ACL.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output[Optional['outputs.KafkaAclKafkaCluster']]:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter
    def operation(self) -> pulumi.Output[str]:
        """
        The operation type for the ACL. Accepted values are: `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.  See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "operation")

    @property
    @pulumi.getter(name="patternType")
    def pattern_type(self) -> pulumi.Output[str]:
        """
        The pattern type for the ACL. Accepted values are: `LITERAL` and `PREFIXED`.
        """
        return pulumi.get(self, "pattern_type")

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Output[str]:
        """
        The permission for the ACL. Accepted values are: `DENY` and `ALLOW`.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Output[str]:
        """
        The principal for the ACL.
        """
        return pulumi.get(self, "principal")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        The resource name for the ACL. Must be `kafka-cluster` if `resource_type` equals to `CLUSTER`.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Output[str]:
        """
        The type of the resource. Accepted values are: `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`. See [Authorization using ACLs](https://docs.confluent.io/platform/current/kafka/authorization.html#operations) to find definitions of resource types and mappings of `(resource_type, operation)` to one or more Kafka APIs or request types.
        """
        return pulumi.get(self, "resource_type")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
        """
        return pulumi.get(self, "rest_endpoint")

