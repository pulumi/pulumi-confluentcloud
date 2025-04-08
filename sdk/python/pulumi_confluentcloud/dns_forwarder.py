# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = ['DnsForwarderArgs', 'DnsForwarder']

@pulumi.input_type
class DnsForwarderArgs:
    def __init__(__self__, *,
                 domains: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 environment: pulumi.Input['DnsForwarderEnvironmentArgs'],
                 gateway: pulumi.Input['DnsForwarderGatewayArgs'],
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 forward_via_gcp_dns_zones: Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']] = None,
                 forward_via_ip: Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']] = None):
        """
        The set of arguments for constructing a DnsForwarder resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] domains: List of domains for the DNS forwarder to use.
        :param pulumi.Input['DnsForwarderEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] display_name: The name of the DNS Forwarder.
        """
        pulumi.set(__self__, "domains", domains)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "gateway", gateway)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if forward_via_gcp_dns_zones is not None:
            pulumi.set(__self__, "forward_via_gcp_dns_zones", forward_via_gcp_dns_zones)
        if forward_via_ip is not None:
            pulumi.set(__self__, "forward_via_ip", forward_via_ip)

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        """
        List of domains for the DNS forwarder to use.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['DnsForwarderEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['DnsForwarderEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Input['DnsForwarderGatewayArgs']:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: pulumi.Input['DnsForwarderGatewayArgs']):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the DNS Forwarder.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="forwardViaGcpDnsZones")
    def forward_via_gcp_dns_zones(self) -> Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']]:
        return pulumi.get(self, "forward_via_gcp_dns_zones")

    @forward_via_gcp_dns_zones.setter
    def forward_via_gcp_dns_zones(self, value: Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']]):
        pulumi.set(self, "forward_via_gcp_dns_zones", value)

    @property
    @pulumi.getter(name="forwardViaIp")
    def forward_via_ip(self) -> Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']]:
        return pulumi.get(self, "forward_via_ip")

    @forward_via_ip.setter
    def forward_via_ip(self, value: Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']]):
        pulumi.set(self, "forward_via_ip", value)


@pulumi.input_type
class _DnsForwarderState:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 environment: Optional[pulumi.Input['DnsForwarderEnvironmentArgs']] = None,
                 forward_via_gcp_dns_zones: Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']] = None,
                 forward_via_ip: Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']] = None,
                 gateway: Optional[pulumi.Input['DnsForwarderGatewayArgs']] = None):
        """
        Input properties used for looking up and filtering DnsForwarder resources.
        :param pulumi.Input[builtins.str] display_name: The name of the DNS Forwarder.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] domains: List of domains for the DNS forwarder to use.
        :param pulumi.Input['DnsForwarderEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if forward_via_gcp_dns_zones is not None:
            pulumi.set(__self__, "forward_via_gcp_dns_zones", forward_via_gcp_dns_zones)
        if forward_via_ip is not None:
            pulumi.set(__self__, "forward_via_ip", forward_via_ip)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the DNS Forwarder.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        List of domains for the DNS forwarder to use.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['DnsForwarderEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['DnsForwarderEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="forwardViaGcpDnsZones")
    def forward_via_gcp_dns_zones(self) -> Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']]:
        return pulumi.get(self, "forward_via_gcp_dns_zones")

    @forward_via_gcp_dns_zones.setter
    def forward_via_gcp_dns_zones(self, value: Optional[pulumi.Input['DnsForwarderForwardViaGcpDnsZonesArgs']]):
        pulumi.set(self, "forward_via_gcp_dns_zones", value)

    @property
    @pulumi.getter(name="forwardViaIp")
    def forward_via_ip(self) -> Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']]:
        return pulumi.get(self, "forward_via_ip")

    @forward_via_ip.setter
    def forward_via_ip(self, value: Optional[pulumi.Input['DnsForwarderForwardViaIpArgs']]):
        pulumi.set(self, "forward_via_ip", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input['DnsForwarderGatewayArgs']]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input['DnsForwarderGatewayArgs']]):
        pulumi.set(self, "gateway", value)


class DnsForwarder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 environment: Optional[pulumi.Input[Union['DnsForwarderEnvironmentArgs', 'DnsForwarderEnvironmentArgsDict']]] = None,
                 forward_via_gcp_dns_zones: Optional[pulumi.Input[Union['DnsForwarderForwardViaGcpDnsZonesArgs', 'DnsForwarderForwardViaGcpDnsZonesArgsDict']]] = None,
                 forward_via_ip: Optional[pulumi.Input[Union['DnsForwarderForwardViaIpArgs', 'DnsForwarderForwardViaIpArgsDict']]] = None,
                 gateway: Optional[pulumi.Input[Union['DnsForwarderGatewayArgs', 'DnsForwarderGatewayArgsDict']]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `DnsForwarder` provides a DNS Forwarder resource that enables creating, editing, and deleting DNS Forwarders on Confluent Cloud.

        ## Example Usage

        ### Option #1: Create using ForwardViaIp method

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.DnsForwarder("main",
            display_name="dns_forwarder",
            environment={
                "id": development.id,
            },
            domains=[
                "example.com",
                "domainname.com",
            ],
            gateway={
                "id": main_confluent_network["gateway"][0]["id"],
            },
            forward_via_ip={
                "dns_server_ips": [
                    "10.200.0.0",
                    "10.200.0.1",
                ],
            })
        ```

        ## Import

        You can import a DNS Forwarder by using Environment ID and DNS Forwarder ID, in the format `<Environment ID>/<DNS Forwarder ID>`. The following example shows how to import a DNS Forwarder:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/dnsForwarder:DnsForwarder main env-abc123/dnsf-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] display_name: The name of the DNS Forwarder.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] domains: List of domains for the DNS forwarder to use.
        :param pulumi.Input[Union['DnsForwarderEnvironmentArgs', 'DnsForwarderEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DnsForwarderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `DnsForwarder` provides a DNS Forwarder resource that enables creating, editing, and deleting DNS Forwarders on Confluent Cloud.

        ## Example Usage

        ### Option #1: Create using ForwardViaIp method

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.DnsForwarder("main",
            display_name="dns_forwarder",
            environment={
                "id": development.id,
            },
            domains=[
                "example.com",
                "domainname.com",
            ],
            gateway={
                "id": main_confluent_network["gateway"][0]["id"],
            },
            forward_via_ip={
                "dns_server_ips": [
                    "10.200.0.0",
                    "10.200.0.1",
                ],
            })
        ```

        ## Import

        You can import a DNS Forwarder by using Environment ID and DNS Forwarder ID, in the format `<Environment ID>/<DNS Forwarder ID>`. The following example shows how to import a DNS Forwarder:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/dnsForwarder:DnsForwarder main env-abc123/dnsf-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param DnsForwarderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DnsForwarderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 environment: Optional[pulumi.Input[Union['DnsForwarderEnvironmentArgs', 'DnsForwarderEnvironmentArgsDict']]] = None,
                 forward_via_gcp_dns_zones: Optional[pulumi.Input[Union['DnsForwarderForwardViaGcpDnsZonesArgs', 'DnsForwarderForwardViaGcpDnsZonesArgsDict']]] = None,
                 forward_via_ip: Optional[pulumi.Input[Union['DnsForwarderForwardViaIpArgs', 'DnsForwarderForwardViaIpArgsDict']]] = None,
                 gateway: Optional[pulumi.Input[Union['DnsForwarderGatewayArgs', 'DnsForwarderGatewayArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DnsForwarderArgs.__new__(DnsForwarderArgs)

            __props__.__dict__["display_name"] = display_name
            if domains is None and not opts.urn:
                raise TypeError("Missing required property 'domains'")
            __props__.__dict__["domains"] = domains
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            __props__.__dict__["forward_via_gcp_dns_zones"] = forward_via_gcp_dns_zones
            __props__.__dict__["forward_via_ip"] = forward_via_ip
            if gateway is None and not opts.urn:
                raise TypeError("Missing required property 'gateway'")
            __props__.__dict__["gateway"] = gateway
        super(DnsForwarder, __self__).__init__(
            'confluentcloud:index/dnsForwarder:DnsForwarder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            environment: Optional[pulumi.Input[Union['DnsForwarderEnvironmentArgs', 'DnsForwarderEnvironmentArgsDict']]] = None,
            forward_via_gcp_dns_zones: Optional[pulumi.Input[Union['DnsForwarderForwardViaGcpDnsZonesArgs', 'DnsForwarderForwardViaGcpDnsZonesArgsDict']]] = None,
            forward_via_ip: Optional[pulumi.Input[Union['DnsForwarderForwardViaIpArgs', 'DnsForwarderForwardViaIpArgsDict']]] = None,
            gateway: Optional[pulumi.Input[Union['DnsForwarderGatewayArgs', 'DnsForwarderGatewayArgsDict']]] = None) -> 'DnsForwarder':
        """
        Get an existing DnsForwarder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] display_name: The name of the DNS Forwarder.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] domains: List of domains for the DNS forwarder to use.
        :param pulumi.Input[Union['DnsForwarderEnvironmentArgs', 'DnsForwarderEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DnsForwarderState.__new__(_DnsForwarderState)

        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["domains"] = domains
        __props__.__dict__["environment"] = environment
        __props__.__dict__["forward_via_gcp_dns_zones"] = forward_via_gcp_dns_zones
        __props__.__dict__["forward_via_ip"] = forward_via_ip
        __props__.__dict__["gateway"] = gateway
        return DnsForwarder(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the DNS Forwarder.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        List of domains for the DNS forwarder to use.
        """
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.DnsForwarderEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter(name="forwardViaGcpDnsZones")
    def forward_via_gcp_dns_zones(self) -> pulumi.Output[Optional['outputs.DnsForwarderForwardViaGcpDnsZones']]:
        return pulumi.get(self, "forward_via_gcp_dns_zones")

    @property
    @pulumi.getter(name="forwardViaIp")
    def forward_via_ip(self) -> pulumi.Output[Optional['outputs.DnsForwarderForwardViaIp']]:
        return pulumi.get(self, "forward_via_ip")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output['outputs.DnsForwarderGateway']:
        return pulumi.get(self, "gateway")

