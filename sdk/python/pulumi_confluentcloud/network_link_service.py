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

__all__ = ['NetworkLinkServiceArgs', 'NetworkLinkService']

@pulumi.input_type
class NetworkLinkServiceArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['NetworkLinkServiceEnvironmentArgs'],
                 network: pulumi.Input['NetworkLinkServiceNetworkArgs'],
                 accept: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NetworkLinkService resource.
        :param pulumi.Input['NetworkLinkServiceEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['NetworkLinkServiceNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] description: The description of the Network Link Service.
        :param pulumi.Input[str] display_name: The name of the Network Link Service.
        """
        NetworkLinkServiceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            environment=environment,
            network=network,
            accept=accept,
            description=description,
            display_name=display_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             environment: pulumi.Input['NetworkLinkServiceEnvironmentArgs'],
             network: pulumi.Input['NetworkLinkServiceNetworkArgs'],
             accept: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']] = None,
             description: Optional[pulumi.Input[str]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("environment", environment)
        _setter("network", network)
        if accept is not None:
            _setter("accept", accept)
        if description is not None:
            _setter("description", description)
        if display_name is not None:
            _setter("display_name", display_name)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['NetworkLinkServiceEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['NetworkLinkServiceEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['NetworkLinkServiceNetworkArgs']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['NetworkLinkServiceNetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def accept(self) -> Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']]:
        return pulumi.get(self, "accept")

    @accept.setter
    def accept(self, value: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']]):
        pulumi.set(self, "accept", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Network Link Service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network Link Service.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _NetworkLinkServiceState:
    def __init__(__self__, *,
                 accept: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['NetworkLinkServiceEnvironmentArgs']] = None,
                 network: Optional[pulumi.Input['NetworkLinkServiceNetworkArgs']] = None,
                 resource_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkLinkService resources.
        :param pulumi.Input[str] description: The description of the Network Link Service.
        :param pulumi.Input[str] display_name: The name of the Network Link Service.
        :param pulumi.Input['NetworkLinkServiceEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['NetworkLinkServiceNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Network Link Service.
        """
        _NetworkLinkServiceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accept=accept,
            description=description,
            display_name=display_name,
            environment=environment,
            network=network,
            resource_name=resource_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accept: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']] = None,
             description: Optional[pulumi.Input[str]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             environment: Optional[pulumi.Input['NetworkLinkServiceEnvironmentArgs']] = None,
             network: Optional[pulumi.Input['NetworkLinkServiceNetworkArgs']] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if accept is not None:
            _setter("accept", accept)
        if description is not None:
            _setter("description", description)
        if display_name is not None:
            _setter("display_name", display_name)
        if environment is not None:
            _setter("environment", environment)
        if network is not None:
            _setter("network", network)
        if resource_name is not None:
            _setter("resource_name", resource_name)

    @property
    @pulumi.getter
    def accept(self) -> Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']]:
        return pulumi.get(self, "accept")

    @accept.setter
    def accept(self, value: Optional[pulumi.Input['NetworkLinkServiceAcceptArgs']]):
        pulumi.set(self, "accept", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Network Link Service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Network Link Service.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['NetworkLinkServiceEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['NetworkLinkServiceEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['NetworkLinkServiceNetworkArgs']]:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['NetworkLinkServiceNetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Network Link Service.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)


class NetworkLinkService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceAcceptArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceEnvironmentArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceNetworkArgs']]] = None,
                 __props__=None):
        """
        ## Import

        You can import a Network Link Service by using Environment ID and Network Link Service ID, in the format `<Environment ID>/<Network Link Service ID>`. The following example shows how to import a Network Link Service$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/networkLinkService:NetworkLinkService my_nls env-abc123/nls-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Network Link Service.
        :param pulumi.Input[str] display_name: The name of the Network Link Service.
        :param pulumi.Input[pulumi.InputType['NetworkLinkServiceEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['NetworkLinkServiceNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkLinkServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        You can import a Network Link Service by using Environment ID and Network Link Service ID, in the format `<Environment ID>/<Network Link Service ID>`. The following example shows how to import a Network Link Service$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/networkLinkService:NetworkLinkService my_nls env-abc123/nls-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param NetworkLinkServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkLinkServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            NetworkLinkServiceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceAcceptArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceEnvironmentArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceNetworkArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkLinkServiceArgs.__new__(NetworkLinkServiceArgs)

            if accept is not None and not isinstance(accept, NetworkLinkServiceAcceptArgs):
                accept = accept or {}
                def _setter(key, value):
                    accept[key] = value
                NetworkLinkServiceAcceptArgs._configure(_setter, **accept)
            __props__.__dict__["accept"] = accept
            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            if environment is not None and not isinstance(environment, NetworkLinkServiceEnvironmentArgs):
                environment = environment or {}
                def _setter(key, value):
                    environment[key] = value
                NetworkLinkServiceEnvironmentArgs._configure(_setter, **environment)
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if network is not None and not isinstance(network, NetworkLinkServiceNetworkArgs):
                network = network or {}
                def _setter(key, value):
                    network[key] = value
                NetworkLinkServiceNetworkArgs._configure(_setter, **network)
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            __props__.__dict__["resource_name"] = None
        super(NetworkLinkService, __self__).__init__(
            'confluentcloud:index/networkLinkService:NetworkLinkService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accept: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceAcceptArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceEnvironmentArgs']]] = None,
            network: Optional[pulumi.Input[pulumi.InputType['NetworkLinkServiceNetworkArgs']]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None) -> 'NetworkLinkService':
        """
        Get an existing NetworkLinkService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Network Link Service.
        :param pulumi.Input[str] display_name: The name of the Network Link Service.
        :param pulumi.Input[pulumi.InputType['NetworkLinkServiceEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['NetworkLinkServiceNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Network Link Service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkLinkServiceState.__new__(_NetworkLinkServiceState)

        __props__.__dict__["accept"] = accept
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["network"] = network
        __props__.__dict__["resource_name"] = resource_name_
        return NetworkLinkService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def accept(self) -> pulumi.Output['outputs.NetworkLinkServiceAccept']:
        return pulumi.get(self, "accept")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the Network Link Service.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Network Link Service.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.NetworkLinkServiceEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.NetworkLinkServiceNetwork']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Network Link Service.
        """
        return pulumi.get(self, "resource_name")

