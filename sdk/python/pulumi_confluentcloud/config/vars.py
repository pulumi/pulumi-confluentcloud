# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('confluentcloud')


class _ExportableConfig(types.ModuleType):
    @property
    def cloud_api_key(self) -> Optional[str]:
        """
        The Confluent Cloud API Key.
        """
        return __config__.get('cloudApiKey')

    @property
    def cloud_api_secret(self) -> Optional[str]:
        """
        The Confluent Cloud API Secret.
        """
        return __config__.get('cloudApiSecret')

    @property
    def endpoint(self) -> Optional[str]:
        """
        The base endpoint of Confluent Cloud API.
        """
        return __config__.get('endpoint')

    @property
    def flink_api_key(self) -> Optional[str]:
        """
        The Flink API Key.
        """
        return __config__.get('flinkApiKey')

    @property
    def flink_api_secret(self) -> Optional[str]:
        """
        The Flink API Secret.
        """
        return __config__.get('flinkApiSecret')

    @property
    def flink_compute_pool_id(self) -> Optional[str]:
        """
        The Flink Compute Pool ID.
        """
        return __config__.get('flinkComputePoolId')

    @property
    def flink_principal_id(self) -> Optional[str]:
        """
        The Flink Principal ID.
        """
        return __config__.get('flinkPrincipalId')

    @property
    def flink_rest_endpoint(self) -> Optional[str]:
        """
        The Flink REST Endpoint.
        """
        return __config__.get('flinkRestEndpoint')

    @property
    def kafka_api_key(self) -> Optional[str]:
        """
        The Kafka Cluster API Key.
        """
        return __config__.get('kafkaApiKey')

    @property
    def kafka_api_secret(self) -> Optional[str]:
        """
        The Kafka Cluster API Secret.
        """
        return __config__.get('kafkaApiSecret')

    @property
    def kafka_id(self) -> Optional[str]:
        """
        The Kafka Cluster ID.
        """
        return __config__.get('kafkaId')

    @property
    def kafka_rest_endpoint(self) -> Optional[str]:
        """
        The Kafka Cluster REST Endpoint.
        """
        return __config__.get('kafkaRestEndpoint')

    @property
    def max_retries(self) -> Optional[int]:
        """
        Maximum number of retries of HTTP client. Defaults to 4.
        """
        return __config__.get_int('maxRetries')

    @property
    def schema_registry_api_key(self) -> Optional[str]:
        """
        The Schema Registry Cluster API Key.
        """
        return __config__.get('schemaRegistryApiKey')

    @property
    def schema_registry_api_secret(self) -> Optional[str]:
        """
        The Schema Registry Cluster API Secret.
        """
        return __config__.get('schemaRegistryApiSecret')

    @property
    def schema_registry_id(self) -> Optional[str]:
        """
        The Schema Registry Cluster ID.
        """
        return __config__.get('schemaRegistryId')

    @property
    def schema_registry_rest_endpoint(self) -> Optional[str]:
        """
        The Schema Registry Cluster REST Endpoint.
        """
        return __config__.get('schemaRegistryRestEndpoint')

