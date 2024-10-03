# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['ProviderIntegrationArgs', 'ProviderIntegration']

@pulumi.input_type
class ProviderIntegrationArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[str],
                 environment: pulumi.Input['ProviderIntegrationEnvironmentArgs'],
                 aws: Optional[pulumi.Input['ProviderIntegrationAwsArgs']] = None):
        """
        The set of arguments for constructing a ProviderIntegration resource.
        :param pulumi.Input[str] display_name: The name of the Provider Integration.
        :param pulumi.Input['ProviderIntegrationEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['ProviderIntegrationAwsArgs'] aws: (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        if aws is not None:
            pulumi.set(__self__, "aws", aws)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The name of the Provider Integration.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['ProviderIntegrationEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['ProviderIntegrationEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['ProviderIntegrationAwsArgs']]:
        """
        (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['ProviderIntegrationAwsArgs']]):
        pulumi.set(self, "aws", value)


@pulumi.input_type
class _ProviderIntegrationState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['ProviderIntegrationAwsArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['ProviderIntegrationEnvironmentArgs']] = None,
                 usages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ProviderIntegration resources.
        :param pulumi.Input['ProviderIntegrationAwsArgs'] aws: (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Provider Integration.
        :param pulumi.Input['ProviderIntegrationEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usages: (Required List of Strings) List of resource CRNs where this provider integration is being used.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if usages is not None:
            pulumi.set(__self__, "usages", usages)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['ProviderIntegrationAwsArgs']]:
        """
        (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['ProviderIntegrationAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Provider Integration.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['ProviderIntegrationEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['ProviderIntegrationEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def usages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Required List of Strings) List of resource CRNs where this provider integration is being used.
        """
        return pulumi.get(self, "usages")

    @usages.setter
    def usages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "usages", value)


class ProviderIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[Union['ProviderIntegrationAwsArgs', 'ProviderIntegrationAwsArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['ProviderIntegrationEnvironmentArgs', 'ProviderIntegrationEnvironmentArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        staging = confluentcloud.Environment("staging",
            display_name="Staging",
            stream_governance={
                "package": "ESSENTIALS",
            })
        main = confluentcloud.ProviderIntegration("main",
            environment={
                "id": staging.id,
            },
            aws={
                "customer_role_arn": customer_role_arn,
            },
            display_name="provider_integration_main")
        ```

        ## Import

        You can import a Provider Integration by using Environment ID and Provider Integration ID, in the format `<Environment ID>/<Provider Integration ID>`. The following example shows how to import a Provider Integration:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/providerIntegration:ProviderIntegration main env-abc123/cspi-4xg0q
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ProviderIntegrationAwsArgs', 'ProviderIntegrationAwsArgsDict']] aws: (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Provider Integration.
        :param pulumi.Input[Union['ProviderIntegrationEnvironmentArgs', 'ProviderIntegrationEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProviderIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        staging = confluentcloud.Environment("staging",
            display_name="Staging",
            stream_governance={
                "package": "ESSENTIALS",
            })
        main = confluentcloud.ProviderIntegration("main",
            environment={
                "id": staging.id,
            },
            aws={
                "customer_role_arn": customer_role_arn,
            },
            display_name="provider_integration_main")
        ```

        ## Import

        You can import a Provider Integration by using Environment ID and Provider Integration ID, in the format `<Environment ID>/<Provider Integration ID>`. The following example shows how to import a Provider Integration:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/providerIntegration:ProviderIntegration main env-abc123/cspi-4xg0q
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param ProviderIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[Union['ProviderIntegrationAwsArgs', 'ProviderIntegrationAwsArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['ProviderIntegrationEnvironmentArgs', 'ProviderIntegrationEnvironmentArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderIntegrationArgs.__new__(ProviderIntegrationArgs)

            __props__.__dict__["aws"] = aws
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            __props__.__dict__["usages"] = None
        super(ProviderIntegration, __self__).__init__(
            'confluentcloud:index/providerIntegration:ProviderIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[Union['ProviderIntegrationAwsArgs', 'ProviderIntegrationAwsArgsDict']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[Union['ProviderIntegrationEnvironmentArgs', 'ProviderIntegrationEnvironmentArgsDict']]] = None,
            usages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ProviderIntegration':
        """
        Get an existing ProviderIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ProviderIntegrationAwsArgs', 'ProviderIntegrationAwsArgsDict']] aws: (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Provider Integration.
        :param pulumi.Input[Union['ProviderIntegrationEnvironmentArgs', 'ProviderIntegrationEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usages: (Required List of Strings) List of resource CRNs where this provider integration is being used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProviderIntegrationState.__new__(_ProviderIntegrationState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["usages"] = usages
        return ProviderIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Optional['outputs.ProviderIntegrationAws']]:
        """
        (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Provider Integration.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.ProviderIntegrationEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def usages(self) -> pulumi.Output[Sequence[str]]:
        """
        (Required List of Strings) List of resource CRNs where this provider integration is being used.
        """
        return pulumi.get(self, "usages")

