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
    'GetNetworkResult',
    'AwaitableGetNetworkResult',
    'get_network',
    'get_network_output',
]

@pulumi.output_type
class GetNetworkResult:
    """
    A collection of values returned by getNetwork.
    """
    def __init__(__self__, aws=None, azures=None, cidr=None, cloud=None, connection_types=None, display_name=None, dns_configs=None, dns_domain=None, environment=None, gateways=None, gcps=None, id=None, region=None, reserved_cidr=None, resource_name=None, zonal_subdomains=None, zone_infos=None, zones=None):
        if aws and not isinstance(aws, list):
            raise TypeError("Expected argument 'aws' to be a list")
        pulumi.set(__self__, "aws", aws)
        if azures and not isinstance(azures, list):
            raise TypeError("Expected argument 'azures' to be a list")
        pulumi.set(__self__, "azures", azures)
        if cidr and not isinstance(cidr, str):
            raise TypeError("Expected argument 'cidr' to be a str")
        pulumi.set(__self__, "cidr", cidr)
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if connection_types and not isinstance(connection_types, list):
            raise TypeError("Expected argument 'connection_types' to be a list")
        pulumi.set(__self__, "connection_types", connection_types)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if dns_configs and not isinstance(dns_configs, list):
            raise TypeError("Expected argument 'dns_configs' to be a list")
        pulumi.set(__self__, "dns_configs", dns_configs)
        if dns_domain and not isinstance(dns_domain, str):
            raise TypeError("Expected argument 'dns_domain' to be a str")
        pulumi.set(__self__, "dns_domain", dns_domain)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
        if gcps and not isinstance(gcps, list):
            raise TypeError("Expected argument 'gcps' to be a list")
        pulumi.set(__self__, "gcps", gcps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if reserved_cidr and not isinstance(reserved_cidr, str):
            raise TypeError("Expected argument 'reserved_cidr' to be a str")
        pulumi.set(__self__, "reserved_cidr", reserved_cidr)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)
        if zonal_subdomains and not isinstance(zonal_subdomains, dict):
            raise TypeError("Expected argument 'zonal_subdomains' to be a dict")
        pulumi.set(__self__, "zonal_subdomains", zonal_subdomains)
        if zone_infos and not isinstance(zone_infos, list):
            raise TypeError("Expected argument 'zone_infos' to be a list")
        pulumi.set(__self__, "zone_infos", zone_infos)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetNetworkAwResult']:
        """
        (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> Sequence['outputs.GetNetworkAzureResult']:
        """
        (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter
    def cidr(self) -> str:
        """
        (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        """
        return pulumi.get(self, "cidr")

    @property
    @pulumi.getter
    def cloud(self) -> str:
        """
        (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="connectionTypes")
    def connection_types(self) -> Sequence[str]:
        """
        (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        """
        return pulumi.get(self, "connection_types")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Network.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="dnsConfigs")
    def dns_configs(self) -> Sequence['outputs.GetNetworkDnsConfigResult']:
        """
        (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
        """
        return pulumi.get(self, "dns_configs")

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> str:
        return pulumi.get(self, "dns_domain")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetNetworkEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetNetworkGatewayResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "gateways")

    @property
    @pulumi.getter
    def gcps(self) -> Sequence['outputs.GetNetworkGcpResult']:
        """
        (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Optional String) The ID of the Gateway, for example, `gw-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        (Required String) The cloud provider region where the network exists.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="reservedCidr")
    def reserved_cidr(self) -> str:
        """
        (Required String) The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
        """
        return pulumi.get(self, "reserved_cidr")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Network.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="zonalSubdomains")
    def zonal_subdomains(self) -> Mapping[str, str]:
        return pulumi.get(self, "zonal_subdomains")

    @property
    @pulumi.getter(name="zoneInfos")
    def zone_infos(self) -> Sequence['outputs.GetNetworkZoneInfoResult']:
        """
        (Required Configuration Blocks) Each item represents information related to a single zone. It supports the following:
        """
        return pulumi.get(self, "zone_infos")

    @property
    @pulumi.getter
    def zones(self) -> Sequence[str]:
        """
        (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
        used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
        networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
        On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        return pulumi.get(self, "zones")


class AwaitableGetNetworkResult(GetNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkResult(
            aws=self.aws,
            azures=self.azures,
            cidr=self.cidr,
            cloud=self.cloud,
            connection_types=self.connection_types,
            display_name=self.display_name,
            dns_configs=self.dns_configs,
            dns_domain=self.dns_domain,
            environment=self.environment,
            gateways=self.gateways,
            gcps=self.gcps,
            id=self.id,
            region=self.region,
            reserved_cidr=self.reserved_cidr,
            resource_name=self.resource_name,
            zonal_subdomains=self.zonal_subdomains,
            zone_infos=self.zone_infos,
            zones=self.zones)


def get_network(aws: Optional[Sequence[Union['GetNetworkAwArgs', 'GetNetworkAwArgsDict']]] = None,
                azures: Optional[Sequence[Union['GetNetworkAzureArgs', 'GetNetworkAzureArgsDict']]] = None,
                display_name: Optional[str] = None,
                dns_configs: Optional[Sequence[Union['GetNetworkDnsConfigArgs', 'GetNetworkDnsConfigArgsDict']]] = None,
                environment: Optional[Union['GetNetworkEnvironmentArgs', 'GetNetworkEnvironmentArgsDict']] = None,
                gcps: Optional[Sequence[Union['GetNetworkGcpArgs', 'GetNetworkGcpArgsDict']]] = None,
                id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Network` describes a Network data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_network(id="n-abc123",
        environment={
            "id": "env-xyz456",
        })
    test_sa = confluentcloud.ServiceAccount("test-sa",
        display_name="test_sa",
        description=f"test_sa for {example_using_id.display_name}")
    example_using_name = confluentcloud.get_network(display_name="my_network",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param Sequence[Union['GetNetworkAwArgs', 'GetNetworkAwArgsDict']] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
    :param Sequence[Union['GetNetworkAzureArgs', 'GetNetworkAzureArgsDict']] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
    :param str display_name: A human-readable name for the Network.
    :param Sequence[Union['GetNetworkDnsConfigArgs', 'GetNetworkDnsConfigArgsDict']] dns_configs: (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
    :param Sequence[Union['GetNetworkGcpArgs', 'GetNetworkGcpArgsDict']] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
    :param str id: The ID of the Network, for example, `n-abc123`.
    """
    __args__ = dict()
    __args__['aws'] = aws
    __args__['azures'] = azures
    __args__['displayName'] = display_name
    __args__['dnsConfigs'] = dns_configs
    __args__['environment'] = environment
    __args__['gcps'] = gcps
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getNetwork:getNetwork', __args__, opts=opts, typ=GetNetworkResult).value

    return AwaitableGetNetworkResult(
        aws=pulumi.get(__ret__, 'aws'),
        azures=pulumi.get(__ret__, 'azures'),
        cidr=pulumi.get(__ret__, 'cidr'),
        cloud=pulumi.get(__ret__, 'cloud'),
        connection_types=pulumi.get(__ret__, 'connection_types'),
        display_name=pulumi.get(__ret__, 'display_name'),
        dns_configs=pulumi.get(__ret__, 'dns_configs'),
        dns_domain=pulumi.get(__ret__, 'dns_domain'),
        environment=pulumi.get(__ret__, 'environment'),
        gateways=pulumi.get(__ret__, 'gateways'),
        gcps=pulumi.get(__ret__, 'gcps'),
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'),
        reserved_cidr=pulumi.get(__ret__, 'reserved_cidr'),
        resource_name=pulumi.get(__ret__, 'resource_name'),
        zonal_subdomains=pulumi.get(__ret__, 'zonal_subdomains'),
        zone_infos=pulumi.get(__ret__, 'zone_infos'),
        zones=pulumi.get(__ret__, 'zones'))


@_utilities.lift_output_func(get_network)
def get_network_output(aws: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkAwArgs', 'GetNetworkAwArgsDict']]]]] = None,
                       azures: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkAzureArgs', 'GetNetworkAzureArgsDict']]]]] = None,
                       display_name: Optional[pulumi.Input[Optional[str]]] = None,
                       dns_configs: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkDnsConfigArgs', 'GetNetworkDnsConfigArgsDict']]]]] = None,
                       environment: Optional[pulumi.Input[Union['GetNetworkEnvironmentArgs', 'GetNetworkEnvironmentArgsDict']]] = None,
                       gcps: Optional[pulumi.Input[Optional[Sequence[Union['GetNetworkGcpArgs', 'GetNetworkGcpArgsDict']]]]] = None,
                       id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetworkResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `Network` describes a Network data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_network(id="n-abc123",
        environment={
            "id": "env-xyz456",
        })
    test_sa = confluentcloud.ServiceAccount("test-sa",
        display_name="test_sa",
        description=f"test_sa for {example_using_id.display_name}")
    example_using_name = confluentcloud.get_network(display_name="my_network",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param Sequence[Union['GetNetworkAwArgs', 'GetNetworkAwArgsDict']] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
    :param Sequence[Union['GetNetworkAzureArgs', 'GetNetworkAzureArgsDict']] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
    :param str display_name: A human-readable name for the Network.
    :param Sequence[Union['GetNetworkDnsConfigArgs', 'GetNetworkDnsConfigArgsDict']] dns_configs: (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
    :param Sequence[Union['GetNetworkGcpArgs', 'GetNetworkGcpArgsDict']] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
    :param str id: The ID of the Network, for example, `n-abc123`.
    """
    ...
