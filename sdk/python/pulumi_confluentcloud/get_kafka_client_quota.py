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

__all__ = [
    'GetKafkaClientQuotaResult',
    'AwaitableGetKafkaClientQuotaResult',
    'get_kafka_client_quota',
    'get_kafka_client_quota_output',
]

@pulumi.output_type
class GetKafkaClientQuotaResult:
    """
    A collection of values returned by getKafkaClientQuota.
    """
    def __init__(__self__, description=None, display_name=None, environments=None, id=None, kafka_clusters=None, principals=None, throughputs=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environments and not isinstance(environments, list):
            raise TypeError("Expected argument 'environments' to be a list")
        pulumi.set(__self__, "environments", environments)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kafka_clusters and not isinstance(kafka_clusters, list):
            raise TypeError("Expected argument 'kafka_clusters' to be a list")
        pulumi.set(__self__, "kafka_clusters", kafka_clusters)
        if principals and not isinstance(principals, list):
            raise TypeError("Expected argument 'principals' to be a list")
        pulumi.set(__self__, "principals", principals)
        if throughputs and not isinstance(throughputs, list):
            raise TypeError("Expected argument 'throughputs' to be a list")
        pulumi.set(__self__, "throughputs", throughputs)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Required String) The description of the Kafka Client Quota.
        - `throughput` (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Kafka Client Quota.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environments(self) -> Sequence['outputs.GetKafkaClientQuotaEnvironmentResult']:
        return pulumi.get(self, "environments")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kafkaClusters")
    def kafka_clusters(self) -> Sequence['outputs.GetKafkaClientQuotaKafkaClusterResult']:
        return pulumi.get(self, "kafka_clusters")

    @property
    @pulumi.getter
    def principals(self) -> Sequence[str]:
        """
        (Required Set of Strings) The list of service accounts to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
        - `kafka_cluster` (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "principals")

    @property
    @pulumi.getter
    def throughputs(self) -> Sequence['outputs.GetKafkaClientQuotaThroughputResult']:
        return pulumi.get(self, "throughputs")


class AwaitableGetKafkaClientQuotaResult(GetKafkaClientQuotaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKafkaClientQuotaResult(
            description=self.description,
            display_name=self.display_name,
            environments=self.environments,
            id=self.id,
            kafka_clusters=self.kafka_clusters,
            principals=self.principals,
            throughputs=self.throughputs)


def get_kafka_client_quota(id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKafkaClientQuotaResult:
    """
    [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To Client Quotas API](https://img.shields.io/badge/-Request%20Access%20To%20Clients%20Quotas-%23bc8540)](mailto:cloud-client-quotas-ea@confluent.io?subject=Request%20to%20join%20Kafka%20Quotas%20Management%20API%20Early%20Access&amp;body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Early%20Access%20for%20kafka-quotas/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)

    > **Note:** `KafkaClientQuota` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Early Access features at any time in Confluent’s sole discretion.

    `KafkaClientQuota` describes a Kafka Client Quota.

    > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_kafka_client_quota = confluentcloud.get_kafka_client_quota(id="cq-abc123")
    pulumi.export("example", example_kafka_client_quota)
    ```


    :param str id: The ID of the Kafka Client Quota (for example, `cq-abc123`).
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getKafkaClientQuota:getKafkaClientQuota', __args__, opts=opts, typ=GetKafkaClientQuotaResult).value

    return AwaitableGetKafkaClientQuotaResult(
        description=__ret__.description,
        display_name=__ret__.display_name,
        environments=__ret__.environments,
        id=__ret__.id,
        kafka_clusters=__ret__.kafka_clusters,
        principals=__ret__.principals,
        throughputs=__ret__.throughputs)


@_utilities.lift_output_func(get_kafka_client_quota)
def get_kafka_client_quota_output(id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKafkaClientQuotaResult]:
    """
    [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To Client Quotas API](https://img.shields.io/badge/-Request%20Access%20To%20Clients%20Quotas-%23bc8540)](mailto:cloud-client-quotas-ea@confluent.io?subject=Request%20to%20join%20Kafka%20Quotas%20Management%20API%20Early%20Access&amp;body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Early%20Access%20for%20kafka-quotas/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)

    > **Note:** `KafkaClientQuota` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Early Access features at any time in Confluent’s sole discretion.

    `KafkaClientQuota` describes a Kafka Client Quota.

    > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_kafka_client_quota = confluentcloud.get_kafka_client_quota(id="cq-abc123")
    pulumi.export("example", example_kafka_client_quota)
    ```


    :param str id: The ID of the Kafka Client Quota (for example, `cq-abc123`).
    """
    ...
