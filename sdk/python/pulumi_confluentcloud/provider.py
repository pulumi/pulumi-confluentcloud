# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 cloud_api_key: Optional[pulumi.Input[str]] = None,
                 cloud_api_secret: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 flink_api_key: Optional[pulumi.Input[str]] = None,
                 flink_api_secret: Optional[pulumi.Input[str]] = None,
                 flink_compute_pool_id: Optional[pulumi.Input[str]] = None,
                 flink_principal_id: Optional[pulumi.Input[str]] = None,
                 flink_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_api_key: Optional[pulumi.Input[str]] = None,
                 kafka_api_secret: Optional[pulumi.Input[str]] = None,
                 kafka_id: Optional[pulumi.Input[str]] = None,
                 kafka_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_key: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_secret: Optional[pulumi.Input[str]] = None,
                 schema_registry_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_rest_endpoint: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] cloud_api_key: The Confluent Cloud API Key.
        :param pulumi.Input[str] cloud_api_secret: The Confluent Cloud API Secret.
        :param pulumi.Input[str] endpoint: The base endpoint of Confluent Cloud API.
        :param pulumi.Input[str] environment_id: The Flink Environment ID.
        :param pulumi.Input[str] flink_api_key: The Flink API Key.
        :param pulumi.Input[str] flink_api_secret: The Flink API Secret.
        :param pulumi.Input[str] flink_compute_pool_id: The Flink Compute Pool ID.
        :param pulumi.Input[str] flink_principal_id: The Flink Principal ID.
        :param pulumi.Input[str] flink_rest_endpoint: The Flink REST Endpoint.
        :param pulumi.Input[str] kafka_api_key: The Kafka Cluster API Key.
        :param pulumi.Input[str] kafka_api_secret: The Kafka Cluster API Secret.
        :param pulumi.Input[str] kafka_id: The Kafka Cluster ID.
        :param pulumi.Input[str] kafka_rest_endpoint: The Kafka Cluster REST Endpoint.
        :param pulumi.Input[int] max_retries: Maximum number of retries of HTTP client. Defaults to 4.
        :param pulumi.Input[str] organization_id: The Flink Organization ID.
        :param pulumi.Input[str] schema_registry_api_key: The Schema Registry Cluster API Key.
        :param pulumi.Input[str] schema_registry_api_secret: The Schema Registry Cluster API Secret.
        :param pulumi.Input[str] schema_registry_id: The Schema Registry Cluster ID.
        :param pulumi.Input[str] schema_registry_rest_endpoint: The Schema Registry Cluster REST Endpoint.
        """
        if cloud_api_key is not None:
            pulumi.set(__self__, "cloud_api_key", cloud_api_key)
        if cloud_api_secret is not None:
            pulumi.set(__self__, "cloud_api_secret", cloud_api_secret)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if flink_api_key is not None:
            pulumi.set(__self__, "flink_api_key", flink_api_key)
        if flink_api_secret is not None:
            pulumi.set(__self__, "flink_api_secret", flink_api_secret)
        if flink_compute_pool_id is not None:
            pulumi.set(__self__, "flink_compute_pool_id", flink_compute_pool_id)
        if flink_principal_id is not None:
            pulumi.set(__self__, "flink_principal_id", flink_principal_id)
        if flink_rest_endpoint is not None:
            pulumi.set(__self__, "flink_rest_endpoint", flink_rest_endpoint)
        if kafka_api_key is not None:
            pulumi.set(__self__, "kafka_api_key", kafka_api_key)
        if kafka_api_secret is not None:
            pulumi.set(__self__, "kafka_api_secret", kafka_api_secret)
        if kafka_id is not None:
            pulumi.set(__self__, "kafka_id", kafka_id)
        if kafka_rest_endpoint is not None:
            pulumi.set(__self__, "kafka_rest_endpoint", kafka_rest_endpoint)
        if max_retries is not None:
            pulumi.set(__self__, "max_retries", max_retries)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if schema_registry_api_key is not None:
            pulumi.set(__self__, "schema_registry_api_key", schema_registry_api_key)
        if schema_registry_api_secret is not None:
            pulumi.set(__self__, "schema_registry_api_secret", schema_registry_api_secret)
        if schema_registry_id is not None:
            pulumi.set(__self__, "schema_registry_id", schema_registry_id)
        if schema_registry_rest_endpoint is not None:
            pulumi.set(__self__, "schema_registry_rest_endpoint", schema_registry_rest_endpoint)

    @property
    @pulumi.getter(name="cloudApiKey")
    def cloud_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Confluent Cloud API Key.
        """
        return pulumi.get(self, "cloud_api_key")

    @cloud_api_key.setter
    def cloud_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_api_key", value)

    @property
    @pulumi.getter(name="cloudApiSecret")
    def cloud_api_secret(self) -> Optional[pulumi.Input[str]]:
        """
        The Confluent Cloud API Secret.
        """
        return pulumi.get(self, "cloud_api_secret")

    @cloud_api_secret.setter
    def cloud_api_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_api_secret", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The base endpoint of Confluent Cloud API.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink Environment ID.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="flinkApiKey")
    def flink_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink API Key.
        """
        return pulumi.get(self, "flink_api_key")

    @flink_api_key.setter
    def flink_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flink_api_key", value)

    @property
    @pulumi.getter(name="flinkApiSecret")
    def flink_api_secret(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink API Secret.
        """
        return pulumi.get(self, "flink_api_secret")

    @flink_api_secret.setter
    def flink_api_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flink_api_secret", value)

    @property
    @pulumi.getter(name="flinkComputePoolId")
    def flink_compute_pool_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink Compute Pool ID.
        """
        return pulumi.get(self, "flink_compute_pool_id")

    @flink_compute_pool_id.setter
    def flink_compute_pool_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flink_compute_pool_id", value)

    @property
    @pulumi.getter(name="flinkPrincipalId")
    def flink_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink Principal ID.
        """
        return pulumi.get(self, "flink_principal_id")

    @flink_principal_id.setter
    def flink_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flink_principal_id", value)

    @property
    @pulumi.getter(name="flinkRestEndpoint")
    def flink_rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink REST Endpoint.
        """
        return pulumi.get(self, "flink_rest_endpoint")

    @flink_rest_endpoint.setter
    def flink_rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flink_rest_endpoint", value)

    @property
    @pulumi.getter(name="kafkaApiKey")
    def kafka_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Kafka Cluster API Key.
        """
        return pulumi.get(self, "kafka_api_key")

    @kafka_api_key.setter
    def kafka_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kafka_api_key", value)

    @property
    @pulumi.getter(name="kafkaApiSecret")
    def kafka_api_secret(self) -> Optional[pulumi.Input[str]]:
        """
        The Kafka Cluster API Secret.
        """
        return pulumi.get(self, "kafka_api_secret")

    @kafka_api_secret.setter
    def kafka_api_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kafka_api_secret", value)

    @property
    @pulumi.getter(name="kafkaId")
    def kafka_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Kafka Cluster ID.
        """
        return pulumi.get(self, "kafka_id")

    @kafka_id.setter
    def kafka_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kafka_id", value)

    @property
    @pulumi.getter(name="kafkaRestEndpoint")
    def kafka_rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The Kafka Cluster REST Endpoint.
        """
        return pulumi.get(self, "kafka_rest_endpoint")

    @kafka_rest_endpoint.setter
    def kafka_rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kafka_rest_endpoint", value)

    @property
    @pulumi.getter(name="maxRetries")
    def max_retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries of HTTP client. Defaults to 4.
        """
        return pulumi.get(self, "max_retries")

    @max_retries.setter
    def max_retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_retries", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Flink Organization ID.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="schemaRegistryApiKey")
    def schema_registry_api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Schema Registry Cluster API Key.
        """
        return pulumi.get(self, "schema_registry_api_key")

    @schema_registry_api_key.setter
    def schema_registry_api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_registry_api_key", value)

    @property
    @pulumi.getter(name="schemaRegistryApiSecret")
    def schema_registry_api_secret(self) -> Optional[pulumi.Input[str]]:
        """
        The Schema Registry Cluster API Secret.
        """
        return pulumi.get(self, "schema_registry_api_secret")

    @schema_registry_api_secret.setter
    def schema_registry_api_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_registry_api_secret", value)

    @property
    @pulumi.getter(name="schemaRegistryId")
    def schema_registry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Schema Registry Cluster ID.
        """
        return pulumi.get(self, "schema_registry_id")

    @schema_registry_id.setter
    def schema_registry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_registry_id", value)

    @property
    @pulumi.getter(name="schemaRegistryRestEndpoint")
    def schema_registry_rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The Schema Registry Cluster REST Endpoint.
        """
        return pulumi.get(self, "schema_registry_rest_endpoint")

    @schema_registry_rest_endpoint.setter
    def schema_registry_rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_registry_rest_endpoint", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_api_key: Optional[pulumi.Input[str]] = None,
                 cloud_api_secret: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 flink_api_key: Optional[pulumi.Input[str]] = None,
                 flink_api_secret: Optional[pulumi.Input[str]] = None,
                 flink_compute_pool_id: Optional[pulumi.Input[str]] = None,
                 flink_principal_id: Optional[pulumi.Input[str]] = None,
                 flink_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_api_key: Optional[pulumi.Input[str]] = None,
                 kafka_api_secret: Optional[pulumi.Input[str]] = None,
                 kafka_id: Optional[pulumi.Input[str]] = None,
                 kafka_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_key: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_secret: Optional[pulumi.Input[str]] = None,
                 schema_registry_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the confluent package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_api_key: The Confluent Cloud API Key.
        :param pulumi.Input[str] cloud_api_secret: The Confluent Cloud API Secret.
        :param pulumi.Input[str] endpoint: The base endpoint of Confluent Cloud API.
        :param pulumi.Input[str] environment_id: The Flink Environment ID.
        :param pulumi.Input[str] flink_api_key: The Flink API Key.
        :param pulumi.Input[str] flink_api_secret: The Flink API Secret.
        :param pulumi.Input[str] flink_compute_pool_id: The Flink Compute Pool ID.
        :param pulumi.Input[str] flink_principal_id: The Flink Principal ID.
        :param pulumi.Input[str] flink_rest_endpoint: The Flink REST Endpoint.
        :param pulumi.Input[str] kafka_api_key: The Kafka Cluster API Key.
        :param pulumi.Input[str] kafka_api_secret: The Kafka Cluster API Secret.
        :param pulumi.Input[str] kafka_id: The Kafka Cluster ID.
        :param pulumi.Input[str] kafka_rest_endpoint: The Kafka Cluster REST Endpoint.
        :param pulumi.Input[int] max_retries: Maximum number of retries of HTTP client. Defaults to 4.
        :param pulumi.Input[str] organization_id: The Flink Organization ID.
        :param pulumi.Input[str] schema_registry_api_key: The Schema Registry Cluster API Key.
        :param pulumi.Input[str] schema_registry_api_secret: The Schema Registry Cluster API Secret.
        :param pulumi.Input[str] schema_registry_id: The Schema Registry Cluster ID.
        :param pulumi.Input[str] schema_registry_rest_endpoint: The Schema Registry Cluster REST Endpoint.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the confluent package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_api_key: Optional[pulumi.Input[str]] = None,
                 cloud_api_secret: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 flink_api_key: Optional[pulumi.Input[str]] = None,
                 flink_api_secret: Optional[pulumi.Input[str]] = None,
                 flink_compute_pool_id: Optional[pulumi.Input[str]] = None,
                 flink_principal_id: Optional[pulumi.Input[str]] = None,
                 flink_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 kafka_api_key: Optional[pulumi.Input[str]] = None,
                 kafka_api_secret: Optional[pulumi.Input[str]] = None,
                 kafka_id: Optional[pulumi.Input[str]] = None,
                 kafka_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_key: Optional[pulumi.Input[str]] = None,
                 schema_registry_api_secret: Optional[pulumi.Input[str]] = None,
                 schema_registry_id: Optional[pulumi.Input[str]] = None,
                 schema_registry_rest_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["cloud_api_key"] = None if cloud_api_key is None else pulumi.Output.secret(cloud_api_key)
            __props__.__dict__["cloud_api_secret"] = None if cloud_api_secret is None else pulumi.Output.secret(cloud_api_secret)
            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["environment_id"] = environment_id
            __props__.__dict__["flink_api_key"] = None if flink_api_key is None else pulumi.Output.secret(flink_api_key)
            __props__.__dict__["flink_api_secret"] = None if flink_api_secret is None else pulumi.Output.secret(flink_api_secret)
            __props__.__dict__["flink_compute_pool_id"] = flink_compute_pool_id
            __props__.__dict__["flink_principal_id"] = flink_principal_id
            __props__.__dict__["flink_rest_endpoint"] = flink_rest_endpoint
            __props__.__dict__["kafka_api_key"] = None if kafka_api_key is None else pulumi.Output.secret(kafka_api_key)
            __props__.__dict__["kafka_api_secret"] = None if kafka_api_secret is None else pulumi.Output.secret(kafka_api_secret)
            __props__.__dict__["kafka_id"] = kafka_id
            __props__.__dict__["kafka_rest_endpoint"] = kafka_rest_endpoint
            __props__.__dict__["max_retries"] = pulumi.Output.from_input(max_retries).apply(pulumi.runtime.to_json) if max_retries is not None else None
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["schema_registry_api_key"] = None if schema_registry_api_key is None else pulumi.Output.secret(schema_registry_api_key)
            __props__.__dict__["schema_registry_api_secret"] = None if schema_registry_api_secret is None else pulumi.Output.secret(schema_registry_api_secret)
            __props__.__dict__["schema_registry_id"] = schema_registry_id
            __props__.__dict__["schema_registry_rest_endpoint"] = schema_registry_rest_endpoint
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["cloudApiKey", "cloudApiSecret", "flinkApiKey", "flinkApiSecret", "kafkaApiKey", "kafkaApiSecret", "schemaRegistryApiKey", "schemaRegistryApiSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'confluentcloud',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="cloudApiKey")
    def cloud_api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The Confluent Cloud API Key.
        """
        return pulumi.get(self, "cloud_api_key")

    @property
    @pulumi.getter(name="cloudApiSecret")
    def cloud_api_secret(self) -> pulumi.Output[Optional[str]]:
        """
        The Confluent Cloud API Secret.
        """
        return pulumi.get(self, "cloud_api_secret")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The base endpoint of Confluent Cloud API.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink Environment ID.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter(name="flinkApiKey")
    def flink_api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink API Key.
        """
        return pulumi.get(self, "flink_api_key")

    @property
    @pulumi.getter(name="flinkApiSecret")
    def flink_api_secret(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink API Secret.
        """
        return pulumi.get(self, "flink_api_secret")

    @property
    @pulumi.getter(name="flinkComputePoolId")
    def flink_compute_pool_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink Compute Pool ID.
        """
        return pulumi.get(self, "flink_compute_pool_id")

    @property
    @pulumi.getter(name="flinkPrincipalId")
    def flink_principal_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink Principal ID.
        """
        return pulumi.get(self, "flink_principal_id")

    @property
    @pulumi.getter(name="flinkRestEndpoint")
    def flink_rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink REST Endpoint.
        """
        return pulumi.get(self, "flink_rest_endpoint")

    @property
    @pulumi.getter(name="kafkaApiKey")
    def kafka_api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The Kafka Cluster API Key.
        """
        return pulumi.get(self, "kafka_api_key")

    @property
    @pulumi.getter(name="kafkaApiSecret")
    def kafka_api_secret(self) -> pulumi.Output[Optional[str]]:
        """
        The Kafka Cluster API Secret.
        """
        return pulumi.get(self, "kafka_api_secret")

    @property
    @pulumi.getter(name="kafkaId")
    def kafka_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Kafka Cluster ID.
        """
        return pulumi.get(self, "kafka_id")

    @property
    @pulumi.getter(name="kafkaRestEndpoint")
    def kafka_rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The Kafka Cluster REST Endpoint.
        """
        return pulumi.get(self, "kafka_rest_endpoint")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Flink Organization ID.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="schemaRegistryApiKey")
    def schema_registry_api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The Schema Registry Cluster API Key.
        """
        return pulumi.get(self, "schema_registry_api_key")

    @property
    @pulumi.getter(name="schemaRegistryApiSecret")
    def schema_registry_api_secret(self) -> pulumi.Output[Optional[str]]:
        """
        The Schema Registry Cluster API Secret.
        """
        return pulumi.get(self, "schema_registry_api_secret")

    @property
    @pulumi.getter(name="schemaRegistryId")
    def schema_registry_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Schema Registry Cluster ID.
        """
        return pulumi.get(self, "schema_registry_id")

    @property
    @pulumi.getter(name="schemaRegistryRestEndpoint")
    def schema_registry_rest_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The Schema Registry Cluster REST Endpoint.
        """
        return pulumi.get(self, "schema_registry_rest_endpoint")
