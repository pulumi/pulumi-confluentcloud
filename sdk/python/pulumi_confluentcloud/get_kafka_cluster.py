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
    'GetKafkaClusterResult',
    'AwaitableGetKafkaClusterResult',
    'get_kafka_cluster',
    'get_kafka_cluster_output',
]

@pulumi.output_type
class GetKafkaClusterResult:
    """
    A collection of values returned by getKafkaCluster.
    """
    def __init__(__self__, api_version=None, availability=None, basics=None, bootstrap_endpoint=None, byok_keys=None, cloud=None, dedicated=None, display_name=None, enterprises=None, environment=None, freights=None, id=None, kind=None, networks=None, rbac_crn=None, region=None, rest_endpoint=None, standards=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if availability and not isinstance(availability, str):
            raise TypeError("Expected argument 'availability' to be a str")
        pulumi.set(__self__, "availability", availability)
        if basics and not isinstance(basics, list):
            raise TypeError("Expected argument 'basics' to be a list")
        pulumi.set(__self__, "basics", basics)
        if bootstrap_endpoint and not isinstance(bootstrap_endpoint, str):
            raise TypeError("Expected argument 'bootstrap_endpoint' to be a str")
        pulumi.set(__self__, "bootstrap_endpoint", bootstrap_endpoint)
        if byok_keys and not isinstance(byok_keys, list):
            raise TypeError("Expected argument 'byok_keys' to be a list")
        pulumi.set(__self__, "byok_keys", byok_keys)
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if dedicated and not isinstance(dedicated, dict):
            raise TypeError("Expected argument 'dedicated' to be a dict")
        pulumi.set(__self__, "dedicated", dedicated)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if enterprises and not isinstance(enterprises, list):
            raise TypeError("Expected argument 'enterprises' to be a list")
        pulumi.set(__self__, "enterprises", enterprises)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if freights and not isinstance(freights, list):
            raise TypeError("Expected argument 'freights' to be a list")
        pulumi.set(__self__, "freights", freights)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if rbac_crn and not isinstance(rbac_crn, str):
            raise TypeError("Expected argument 'rbac_crn' to be a str")
        pulumi.set(__self__, "rbac_crn", rbac_crn)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if standards and not isinstance(standards, list):
            raise TypeError("Expected argument 'standards' to be a list")
        pulumi.set(__self__, "standards", standards)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> str:
        """
        (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def availability(self) -> str:
        """
        (Required String) The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
        """
        return pulumi.get(self, "availability")

    @property
    @pulumi.getter
    def basics(self) -> Optional[Sequence['outputs.GetKafkaClusterBasicResult']]:
        """
        (Optional Configuration Block) The configuration of the Basic Kafka cluster.
        """
        return pulumi.get(self, "basics")

    @property
    @pulumi.getter(name="bootstrapEndpoint")
    def bootstrap_endpoint(self) -> str:
        """
        (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
        """
        return pulumi.get(self, "bootstrap_endpoint")

    @property
    @pulumi.getter(name="byokKeys")
    def byok_keys(self) -> Sequence['outputs.GetKafkaClusterByokKeyResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "byok_keys")

    @property
    @pulumi.getter
    def cloud(self) -> str:
        """
        (Required String) The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter
    def dedicated(self) -> Optional['outputs.GetKafkaClusterDedicatedResult']:
        """
        (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        """
        return pulumi.get(self, "dedicated")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Kafka cluster.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def enterprises(self) -> Optional[Sequence['outputs.GetKafkaClusterEnterpriseResult']]:
        """
        (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
        """
        return pulumi.get(self, "enterprises")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetKafkaClusterEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def freights(self) -> Optional[Sequence['outputs.GetKafkaClusterFreightResult']]:
        """
        (Optional Configuration Block) The configuration of the Freight Kafka cluster.
        """
        return pulumi.get(self, "freights")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        (Required String) A kind of the Kafka cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetKafkaClusterNetworkResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="rbacCrn")
    def rbac_crn(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
        """
        return pulumi.get(self, "rbac_crn")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        (Required String) The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> str:
        """
        (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        """
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter
    def standards(self) -> Optional[Sequence['outputs.GetKafkaClusterStandardResult']]:
        """
        (Optional Configuration Block) The configuration of the Standard Kafka cluster.
        """
        return pulumi.get(self, "standards")


class AwaitableGetKafkaClusterResult(GetKafkaClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKafkaClusterResult(
            api_version=self.api_version,
            availability=self.availability,
            basics=self.basics,
            bootstrap_endpoint=self.bootstrap_endpoint,
            byok_keys=self.byok_keys,
            cloud=self.cloud,
            dedicated=self.dedicated,
            display_name=self.display_name,
            enterprises=self.enterprises,
            environment=self.environment,
            freights=self.freights,
            id=self.id,
            kind=self.kind,
            networks=self.networks,
            rbac_crn=self.rbac_crn,
            region=self.region,
            rest_endpoint=self.rest_endpoint,
            standards=self.standards)


def get_kafka_cluster(basics: Optional[Sequence[Union['GetKafkaClusterBasicArgs', 'GetKafkaClusterBasicArgsDict']]] = None,
                      dedicated: Optional[Union['GetKafkaClusterDedicatedArgs', 'GetKafkaClusterDedicatedArgsDict']] = None,
                      display_name: Optional[str] = None,
                      enterprises: Optional[Sequence[Union['GetKafkaClusterEnterpriseArgs', 'GetKafkaClusterEnterpriseArgsDict']]] = None,
                      environment: Optional[Union['GetKafkaClusterEnvironmentArgs', 'GetKafkaClusterEnvironmentArgsDict']] = None,
                      freights: Optional[Sequence[Union['GetKafkaClusterFreightArgs', 'GetKafkaClusterFreightArgsDict']]] = None,
                      id: Optional[str] = None,
                      standards: Optional[Sequence[Union['GetKafkaClusterStandardArgs', 'GetKafkaClusterStandardArgsDict']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKafkaClusterResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `KafkaCluster` describes a Kafka cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_kafka_cluster(id="lkc-abc123",
        environment={
            "id": "env-xyz456",
        })
    test_sa = confluentcloud.ServiceAccount("test-sa",
        display_name="app_mgr",
        description=f"app_mgr for {example_using_id.display_name}")
    example_using_name = confluentcloud.get_kafka_cluster(display_name="basic_kafka_cluster",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param Sequence[Union['GetKafkaClusterBasicArgs', 'GetKafkaClusterBasicArgsDict']] basics: (Optional Configuration Block) The configuration of the Basic Kafka cluster.
    :param Union['GetKafkaClusterDedicatedArgs', 'GetKafkaClusterDedicatedArgsDict'] dedicated: (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
    :param str display_name: A human-readable name for the Kafka cluster.
    :param Sequence[Union['GetKafkaClusterEnterpriseArgs', 'GetKafkaClusterEnterpriseArgsDict']] enterprises: (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
    :param Sequence[Union['GetKafkaClusterFreightArgs', 'GetKafkaClusterFreightArgsDict']] freights: (Optional Configuration Block) The configuration of the Freight Kafka cluster.
    :param str id: The ID of the Kafka cluster, for example, `lkc-abc123`.
    :param Sequence[Union['GetKafkaClusterStandardArgs', 'GetKafkaClusterStandardArgsDict']] standards: (Optional Configuration Block) The configuration of the Standard Kafka cluster.
    """
    __args__ = dict()
    __args__['basics'] = basics
    __args__['dedicated'] = dedicated
    __args__['displayName'] = display_name
    __args__['enterprises'] = enterprises
    __args__['environment'] = environment
    __args__['freights'] = freights
    __args__['id'] = id
    __args__['standards'] = standards
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getKafkaCluster:getKafkaCluster', __args__, opts=opts, typ=GetKafkaClusterResult).value

    return AwaitableGetKafkaClusterResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        availability=pulumi.get(__ret__, 'availability'),
        basics=pulumi.get(__ret__, 'basics'),
        bootstrap_endpoint=pulumi.get(__ret__, 'bootstrap_endpoint'),
        byok_keys=pulumi.get(__ret__, 'byok_keys'),
        cloud=pulumi.get(__ret__, 'cloud'),
        dedicated=pulumi.get(__ret__, 'dedicated'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enterprises=pulumi.get(__ret__, 'enterprises'),
        environment=pulumi.get(__ret__, 'environment'),
        freights=pulumi.get(__ret__, 'freights'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        networks=pulumi.get(__ret__, 'networks'),
        rbac_crn=pulumi.get(__ret__, 'rbac_crn'),
        region=pulumi.get(__ret__, 'region'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        standards=pulumi.get(__ret__, 'standards'))


@_utilities.lift_output_func(get_kafka_cluster)
def get_kafka_cluster_output(basics: Optional[pulumi.Input[Optional[Sequence[Union['GetKafkaClusterBasicArgs', 'GetKafkaClusterBasicArgsDict']]]]] = None,
                             dedicated: Optional[pulumi.Input[Optional[Union['GetKafkaClusterDedicatedArgs', 'GetKafkaClusterDedicatedArgsDict']]]] = None,
                             display_name: Optional[pulumi.Input[Optional[str]]] = None,
                             enterprises: Optional[pulumi.Input[Optional[Sequence[Union['GetKafkaClusterEnterpriseArgs', 'GetKafkaClusterEnterpriseArgsDict']]]]] = None,
                             environment: Optional[pulumi.Input[Union['GetKafkaClusterEnvironmentArgs', 'GetKafkaClusterEnvironmentArgsDict']]] = None,
                             freights: Optional[pulumi.Input[Optional[Sequence[Union['GetKafkaClusterFreightArgs', 'GetKafkaClusterFreightArgsDict']]]]] = None,
                             id: Optional[pulumi.Input[Optional[str]]] = None,
                             standards: Optional[pulumi.Input[Optional[Sequence[Union['GetKafkaClusterStandardArgs', 'GetKafkaClusterStandardArgsDict']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKafkaClusterResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `KafkaCluster` describes a Kafka cluster data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_kafka_cluster(id="lkc-abc123",
        environment={
            "id": "env-xyz456",
        })
    test_sa = confluentcloud.ServiceAccount("test-sa",
        display_name="app_mgr",
        description=f"app_mgr for {example_using_id.display_name}")
    example_using_name = confluentcloud.get_kafka_cluster(display_name="basic_kafka_cluster",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param Sequence[Union['GetKafkaClusterBasicArgs', 'GetKafkaClusterBasicArgsDict']] basics: (Optional Configuration Block) The configuration of the Basic Kafka cluster.
    :param Union['GetKafkaClusterDedicatedArgs', 'GetKafkaClusterDedicatedArgsDict'] dedicated: (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
    :param str display_name: A human-readable name for the Kafka cluster.
    :param Sequence[Union['GetKafkaClusterEnterpriseArgs', 'GetKafkaClusterEnterpriseArgsDict']] enterprises: (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
    :param Sequence[Union['GetKafkaClusterFreightArgs', 'GetKafkaClusterFreightArgsDict']] freights: (Optional Configuration Block) The configuration of the Freight Kafka cluster.
    :param str id: The ID of the Kafka cluster, for example, `lkc-abc123`.
    :param Sequence[Union['GetKafkaClusterStandardArgs', 'GetKafkaClusterStandardArgsDict']] standards: (Optional Configuration Block) The configuration of the Standard Kafka cluster.
    """
    ...
