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

__all__ = [
    'GetKsqlClusterResult',
    'AwaitableGetKsqlClusterResult',
    'get_ksql_cluster',
    'get_ksql_cluster_output',
]

@pulumi.output_type
class GetKsqlClusterResult:
    """
    A collection of values returned by getKsqlCluster.
    """
    def __init__(__self__, api_version=None, credential_identities=None, csu=None, display_name=None, environment=None, id=None, kafka_clusters=None, kind=None, resource_name=None, rest_endpoint=None, storage=None, topic_prefix=None, use_detailed_processing_log=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if credential_identities and not isinstance(credential_identities, list):
            raise TypeError("Expected argument 'credential_identities' to be a list")
        pulumi.set(__self__, "credential_identities", credential_identities)
        if csu and not isinstance(csu, int):
            raise TypeError("Expected argument 'csu' to be a int")
        pulumi.set(__self__, "csu", csu)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kafka_clusters and not isinstance(kafka_clusters, list):
            raise TypeError("Expected argument 'kafka_clusters' to be a list")
        pulumi.set(__self__, "kafka_clusters", kafka_clusters)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if storage and not isinstance(storage, int):
            raise TypeError("Expected argument 'storage' to be a int")
        pulumi.set(__self__, "storage", storage)
        if topic_prefix and not isinstance(topic_prefix, str):
            raise TypeError("Expected argument 'topic_prefix' to be a str")
        pulumi.set(__self__, "topic_prefix", topic_prefix)
        if use_detailed_processing_log and not isinstance(use_detailed_processing_log, bool):
            raise TypeError("Expected argument 'use_detailed_processing_log' to be a bool")
        pulumi.set(__self__, "use_detailed_processing_log", use_detailed_processing_log)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="credentialIdentities")
    def credential_identities(self) -> Sequence['outputs.GetKsqlClusterCredentialIdentityResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "credential_identities")

    @property
    @pulumi.getter
    def csu(self) -> int:
        """
        (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
        """
        return pulumi.get(self, "csu")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetKsqlClusterEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kafkaClusters")
    def kafka_clusters(self) -> Sequence['outputs.GetKsqlClusterKafkaClusterResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "kafka_clusters")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the ksqlDB cluster.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> str:
        """
        (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter
    def storage(self) -> int:
        """
        (Required Integer) The amount of storage (in GB) provisioned to this cluster.
        """
        return pulumi.get(self, "storage")

    @property
    @pulumi.getter(name="topicPrefix")
    def topic_prefix(self) -> str:
        """
        (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        """
        return pulumi.get(self, "topic_prefix")

    @property
    @pulumi.getter(name="useDetailedProcessingLog")
    def use_detailed_processing_log(self) -> bool:
        """
        (Optional Boolean) Controls whether the row data should be included in the processing log topic.
        """
        return pulumi.get(self, "use_detailed_processing_log")


class AwaitableGetKsqlClusterResult(GetKsqlClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKsqlClusterResult(
            api_version=self.api_version,
            credential_identities=self.credential_identities,
            csu=self.csu,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            kafka_clusters=self.kafka_clusters,
            kind=self.kind,
            resource_name=self.resource_name,
            rest_endpoint=self.rest_endpoint,
            storage=self.storage,
            topic_prefix=self.topic_prefix,
            use_detailed_processing_log=self.use_detailed_processing_log)


def get_ksql_cluster(display_name: Optional[str] = None,
                     environment: Optional[Union['GetKsqlClusterEnvironmentArgs', 'GetKsqlClusterEnvironmentArgsDict']] = None,
                     id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKsqlClusterResult:
    """
    # KsqlCluster Data Source

    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `KsqlCluster` describes a ksqlDB cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_ksql_cluster(id="lksqlc-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_ksql_cluster(display_name="ksqldb_cluster",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: The name of the ksqlDB cluster.
    :param str id: The ID of the ksqlDB cluster, for example, `lksqlc-abc123`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getKsqlCluster:getKsqlCluster', __args__, opts=opts, typ=GetKsqlClusterResult).value

    return AwaitableGetKsqlClusterResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        credential_identities=pulumi.get(__ret__, 'credential_identities'),
        csu=pulumi.get(__ret__, 'csu'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        kafka_clusters=pulumi.get(__ret__, 'kafka_clusters'),
        kind=pulumi.get(__ret__, 'kind'),
        resource_name=pulumi.get(__ret__, 'resource_name'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        storage=pulumi.get(__ret__, 'storage'),
        topic_prefix=pulumi.get(__ret__, 'topic_prefix'),
        use_detailed_processing_log=pulumi.get(__ret__, 'use_detailed_processing_log'))


@_utilities.lift_output_func(get_ksql_cluster)
def get_ksql_cluster_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                            environment: Optional[pulumi.Input[Union['GetKsqlClusterEnvironmentArgs', 'GetKsqlClusterEnvironmentArgsDict']]] = None,
                            id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKsqlClusterResult]:
    """
    # KsqlCluster Data Source

    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `KsqlCluster` describes a ksqlDB cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_ksql_cluster(id="lksqlc-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_ksql_cluster(display_name="ksqldb_cluster",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param str display_name: The name of the ksqlDB cluster.
    :param str id: The ID of the ksqlDB cluster, for example, `lksqlc-abc123`.
    """
    ...
