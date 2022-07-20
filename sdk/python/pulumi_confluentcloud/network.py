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

__all__ = ['NetworkArgs', 'Network']

@pulumi.input_type
class NetworkArgs:
    def __init__(__self__, *,
                 cloud: pulumi.Input[str],
                 connection_types: pulumi.Input[Sequence[pulumi.Input[str]]],
                 environment: pulumi.Input['NetworkEnvironmentArgs'],
                 region: pulumi.Input[str],
                 aws: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]] = None,
                 azures: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gcps: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Network resource.
        :param pulumi.Input[str] cloud: The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connection_types: The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        :param pulumi.Input['NetworkEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] region: The cloud provider region where the network exists.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        :param pulumi.Input[str] cidr: The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        :param pulumi.Input[str] display_name: The name of the Network.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] zones: The 3 availability zones for this network. They can optionally be specified for AWS networks
               used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
               On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
               On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
               On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        pulumi.set(__self__, "cloud", cloud)
        pulumi.set(__self__, "connection_types", connection_types)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "region", region)
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azures is not None:
            pulumi.set(__self__, "azures", azures)
        if cidr is not None:
            pulumi.set(__self__, "cidr", cidr)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if gcps is not None:
            pulumi.set(__self__, "gcps", gcps)
        if zones is not None:
            pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Input[str]:
        """
        The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="connectionTypes")
    def connection_types(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        """
        return pulumi.get(self, "connection_types")

    @connection_types.setter
    def connection_types(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "connection_types", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['NetworkEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['NetworkEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The cloud provider region where the network exists.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]]:
        """
        (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azures(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]]:
        """
        (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @azures.setter
    def azures(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]]):
        pulumi.set(self, "azures", value)

    @property
    @pulumi.getter
    def cidr(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def gcps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]]:
        """
        (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @gcps.setter
    def gcps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]]):
        pulumi.set(self, "gcps", value)

    @property
    @pulumi.getter
    def zones(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The 3 availability zones for this network. They can optionally be specified for AWS networks
        used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
        On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        return pulumi.get(self, "zones")

    @zones.setter
    def zones(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "zones", value)


@pulumi.input_type
class _NetworkState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]] = None,
                 azures: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 connection_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 dns_domain: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['NetworkEnvironmentArgs']] = None,
                 gcps: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_name: Optional[pulumi.Input[str]] = None,
                 zonal_subdomains: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Network resources.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        :param pulumi.Input[str] cidr: The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        :param pulumi.Input[str] cloud: The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connection_types: The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        :param pulumi.Input[str] display_name: The name of the Network.
        :param pulumi.Input[str] dns_domain: (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        :param pulumi.Input['NetworkEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        :param pulumi.Input[str] region: The cloud provider region where the network exists.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Network.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] zonal_subdomains: (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] zones: The 3 availability zones for this network. They can optionally be specified for AWS networks
               used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
               On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
               On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
               On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azures is not None:
            pulumi.set(__self__, "azures", azures)
        if cidr is not None:
            pulumi.set(__self__, "cidr", cidr)
        if cloud is not None:
            pulumi.set(__self__, "cloud", cloud)
        if connection_types is not None:
            pulumi.set(__self__, "connection_types", connection_types)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if dns_domain is not None:
            pulumi.set(__self__, "dns_domain", dns_domain)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if gcps is not None:
            pulumi.set(__self__, "gcps", gcps)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)
        if zonal_subdomains is not None:
            pulumi.set(__self__, "zonal_subdomains", zonal_subdomains)
        if zones is not None:
            pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]]:
        """
        (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAwArgs']]]]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azures(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]]:
        """
        (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @azures.setter
    def azures(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAzureArgs']]]]):
        pulumi.set(self, "azures", value)

    @property
    @pulumi.getter
    def cidr(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr", value)

    @property
    @pulumi.getter
    def cloud(self) -> Optional[pulumi.Input[str]]:
        """
        The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="connectionTypes")
    def connection_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        """
        return pulumi.get(self, "connection_types")

    @connection_types.setter
    def connection_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "connection_types", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        """
        return pulumi.get(self, "dns_domain")

    @dns_domain.setter
    def dns_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_domain", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['NetworkEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['NetworkEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gcps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]]:
        """
        (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @gcps.setter
    def gcps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkGcpArgs']]]]):
        pulumi.set(self, "gcps", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The cloud provider region where the network exists.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Network.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="zonalSubdomains")
    def zonal_subdomains(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "zonal_subdomains")

    @zonal_subdomains.setter
    def zonal_subdomains(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "zonal_subdomains", value)

    @property
    @pulumi.getter
    def zones(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The 3 availability zones for this network. They can optionally be specified for AWS networks
        used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
        On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        return pulumi.get(self, "zones")

    @zones.setter
    def zones(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "zones", value)


class Network(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAwArgs']]]]] = None,
                 azures: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAzureArgs']]]]] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 connection_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['NetworkEnvironmentArgs']]] = None,
                 gcps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkGcpArgs']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Network by using Environment ID and Network ID, in the format `<Environment ID>/<Network ID>`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAwArgs']]]] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAzureArgs']]]] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        :param pulumi.Input[str] cidr: The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        :param pulumi.Input[str] cloud: The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connection_types: The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        :param pulumi.Input[str] display_name: The name of the Network.
        :param pulumi.Input[pulumi.InputType['NetworkEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkGcpArgs']]]] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        :param pulumi.Input[str] region: The cloud provider region where the network exists.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] zones: The 3 availability zones for this network. They can optionally be specified for AWS networks
               used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
               On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
               On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
               On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Network by using Environment ID and Network ID, in the format `<Environment ID>/<Network ID>`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param NetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAwArgs']]]]] = None,
                 azures: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAzureArgs']]]]] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 connection_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['NetworkEnvironmentArgs']]] = None,
                 gcps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkGcpArgs']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkArgs.__new__(NetworkArgs)

            __props__.__dict__["aws"] = aws
            __props__.__dict__["azures"] = azures
            __props__.__dict__["cidr"] = cidr
            if cloud is None and not opts.urn:
                raise TypeError("Missing required property 'cloud'")
            __props__.__dict__["cloud"] = cloud
            if connection_types is None and not opts.urn:
                raise TypeError("Missing required property 'connection_types'")
            __props__.__dict__["connection_types"] = connection_types
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            __props__.__dict__["gcps"] = gcps
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["zones"] = zones
            __props__.__dict__["dns_domain"] = None
            __props__.__dict__["resource_name"] = None
            __props__.__dict__["zonal_subdomains"] = None
        super(Network, __self__).__init__(
            'confluentcloud:index/network:Network',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAwArgs']]]]] = None,
            azures: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAzureArgs']]]]] = None,
            cidr: Optional[pulumi.Input[str]] = None,
            cloud: Optional[pulumi.Input[str]] = None,
            connection_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            dns_domain: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['NetworkEnvironmentArgs']]] = None,
            gcps: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkGcpArgs']]]]] = None,
            region: Optional[pulumi.Input[str]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None,
            zonal_subdomains: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Network':
        """
        Get an existing Network resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAwArgs']]]] aws: (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAzureArgs']]]] azures: (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        :param pulumi.Input[str] cidr: The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        :param pulumi.Input[str] cloud: The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] connection_types: The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        :param pulumi.Input[str] display_name: The name of the Network.
        :param pulumi.Input[str] dns_domain: (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        :param pulumi.Input[pulumi.InputType['NetworkEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkGcpArgs']]]] gcps: (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        :param pulumi.Input[str] region: The cloud provider region where the network exists.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Network.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] zonal_subdomains: (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] zones: The 3 availability zones for this network. They can optionally be specified for AWS networks
               used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
               On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
               On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
               On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkState.__new__(_NetworkState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["azures"] = azures
        __props__.__dict__["cidr"] = cidr
        __props__.__dict__["cloud"] = cloud
        __props__.__dict__["connection_types"] = connection_types
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["dns_domain"] = dns_domain
        __props__.__dict__["environment"] = environment
        __props__.__dict__["gcps"] = gcps
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["zonal_subdomains"] = zonal_subdomains
        __props__.__dict__["zones"] = zones
        return Network(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Sequence['outputs.NetworkAw']]:
        """
        (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> pulumi.Output[Sequence['outputs.NetworkAzure']]:
        """
        (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter
    def cidr(self) -> pulumi.Output[str]:
        """
        The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        """
        return pulumi.get(self, "cidr")

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Output[str]:
        """
        The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="connectionTypes")
    def connection_types(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        """
        return pulumi.get(self, "connection_types")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Network.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> pulumi.Output[str]:
        """
        (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        """
        return pulumi.get(self, "dns_domain")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.NetworkEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcps(self) -> pulumi.Output[Sequence['outputs.NetworkGcp']]:
        """
        (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        """
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The cloud provider region where the network exists.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Network.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="zonalSubdomains")
    def zonal_subdomains(self) -> pulumi.Output[Mapping[str, str]]:
        """
        (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "zonal_subdomains")

    @property
    @pulumi.getter
    def zones(self) -> pulumi.Output[Sequence[str]]:
        """
        The 3 availability zones for this network. They can optionally be specified for AWS networks
        used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
        On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        """
        return pulumi.get(self, "zones")

