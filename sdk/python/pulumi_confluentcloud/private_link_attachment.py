# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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

__all__ = ['PrivateLinkAttachmentArgs', 'PrivateLinkAttachment']

@pulumi.input_type
class PrivateLinkAttachmentArgs:
    def __init__(__self__, *,
                 cloud: pulumi.Input[builtins.str],
                 display_name: pulumi.Input[builtins.str],
                 environment: pulumi.Input['PrivateLinkAttachmentEnvironmentArgs'],
                 region: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a PrivateLinkAttachment resource.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that hosts the resources to access with the Private Link Attachment.
        :param pulumi.Input[builtins.str] display_name: The name of the Private Link Attachment.
        :param pulumi.Input['PrivateLinkAttachmentEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] region: The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        """
        pulumi.set(__self__, "cloud", cloud)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Input[builtins.str]:
        """
        The cloud service provider that hosts the resources to access with the Private Link Attachment.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the Private Link Attachment.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['PrivateLinkAttachmentEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['PrivateLinkAttachmentEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[builtins.str]:
        """
        The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _PrivateLinkAttachmentState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAwArgs']]]] = None,
                 azures: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAzureArgs']]]] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 dns_domain: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input['PrivateLinkAttachmentEnvironmentArgs']] = None,
                 gcps: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentGcpArgs']]]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 resource_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering PrivateLinkAttachment resources.
        :param pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAwArgs']]] aws: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAzureArgs']]] azures: (Optional Configuration Block) supports the following:
               - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that hosts the resources to access with the Private Link Attachment.
        :param pulumi.Input[builtins.str] display_name: The name of the Private Link Attachment.
        :param pulumi.Input[builtins.str] dns_domain: (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        :param pulumi.Input['PrivateLinkAttachmentEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentGcpArgs']]] gcps: (Optional Configuration Block) supports the following:
        :param pulumi.Input[builtins.str] region: The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        :param pulumi.Input[builtins.str] resource_name: (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azures is not None:
            pulumi.set(__self__, "azures", azures)
        if cloud is not None:
            pulumi.set(__self__, "cloud", cloud)
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

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAwArgs']]]]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAwArgs']]]]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azures(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAzureArgs']]]]:
        """
        (Optional Configuration Block) supports the following:
        - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        """
        return pulumi.get(self, "azures")

    @azures.setter
    def azures(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentAzureArgs']]]]):
        pulumi.set(self, "azures", value)

    @property
    @pulumi.getter
    def cloud(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The cloud service provider that hosts the resources to access with the Private Link Attachment.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Private Link Attachment.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "dns_domain")

    @dns_domain.setter
    def dns_domain(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "dns_domain", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['PrivateLinkAttachmentEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['PrivateLinkAttachmentEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gcps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentGcpArgs']]]]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "gcps")

    @gcps.setter
    def gcps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateLinkAttachmentGcpArgs']]]]):
        pulumi.set(self, "gcps", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_name", value)


@pulumi.type_token("confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment")
class PrivateLinkAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['PrivateLinkAttachmentEnvironmentArgs', 'PrivateLinkAttachmentEnvironmentArgsDict']]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `PrivateLinkAttachment` provides a Private Link Attachment resource that enables creating, editing, and deleting Private Link Attachments on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.PrivateLinkAttachment("main",
            cloud="AWS",
            region="us-west-2",
            display_name="staging-platt",
            environment={
                "id": "env-3732nw",
            })
        pulumi.export("privateLinkAttachment", main)
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `PrivateLinkAttachment` resource:
        * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        * enterprise-privatelinkattachment-azure-kafka-acls: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import a Private Link Attachment by using Environment ID and Private Link Attachment ID, in the format `<Environment ID>/<Private Link Attachment ID>`. The following example shows how to import a Private Link Attachment:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment main env-abc123/platt-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that hosts the resources to access with the Private Link Attachment.
        :param pulumi.Input[builtins.str] display_name: The name of the Private Link Attachment.
        :param pulumi.Input[Union['PrivateLinkAttachmentEnvironmentArgs', 'PrivateLinkAttachmentEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[builtins.str] region: The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLinkAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `PrivateLinkAttachment` provides a Private Link Attachment resource that enables creating, editing, and deleting Private Link Attachments on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.PrivateLinkAttachment("main",
            cloud="AWS",
            region="us-west-2",
            display_name="staging-platt",
            environment={
                "id": "env-3732nw",
            })
        pulumi.export("privateLinkAttachment", main)
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `PrivateLinkAttachment` resource:
        * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        * enterprise-privatelinkattachment-azure-kafka-acls: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import a Private Link Attachment by using Environment ID and Private Link Attachment ID, in the format `<Environment ID>/<Private Link Attachment ID>`. The following example shows how to import a Private Link Attachment:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment main env-abc123/platt-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param PrivateLinkAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLinkAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud: Optional[pulumi.Input[builtins.str]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['PrivateLinkAttachmentEnvironmentArgs', 'PrivateLinkAttachmentEnvironmentArgsDict']]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateLinkAttachmentArgs.__new__(PrivateLinkAttachmentArgs)

            if cloud is None and not opts.urn:
                raise TypeError("Missing required property 'cloud'")
            __props__.__dict__["cloud"] = cloud
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["aws"] = None
            __props__.__dict__["azures"] = None
            __props__.__dict__["dns_domain"] = None
            __props__.__dict__["gcps"] = None
            __props__.__dict__["resource_name"] = None
        super(PrivateLinkAttachment, __self__).__init__(
            'confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentAwArgs', 'PrivateLinkAttachmentAwArgsDict']]]]] = None,
            azures: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentAzureArgs', 'PrivateLinkAttachmentAzureArgsDict']]]]] = None,
            cloud: Optional[pulumi.Input[builtins.str]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            dns_domain: Optional[pulumi.Input[builtins.str]] = None,
            environment: Optional[pulumi.Input[Union['PrivateLinkAttachmentEnvironmentArgs', 'PrivateLinkAttachmentEnvironmentArgsDict']]] = None,
            gcps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentGcpArgs', 'PrivateLinkAttachmentGcpArgsDict']]]]] = None,
            region: Optional[pulumi.Input[builtins.str]] = None,
            resource_name_: Optional[pulumi.Input[builtins.str]] = None) -> 'PrivateLinkAttachment':
        """
        Get an existing PrivateLinkAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentAwArgs', 'PrivateLinkAttachmentAwArgsDict']]]] aws: (Optional Configuration Block) supports the following:
        :param pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentAzureArgs', 'PrivateLinkAttachmentAzureArgsDict']]]] azures: (Optional Configuration Block) supports the following:
               - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        :param pulumi.Input[builtins.str] cloud: The cloud service provider that hosts the resources to access with the Private Link Attachment.
        :param pulumi.Input[builtins.str] display_name: The name of the Private Link Attachment.
        :param pulumi.Input[builtins.str] dns_domain: (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        :param pulumi.Input[Union['PrivateLinkAttachmentEnvironmentArgs', 'PrivateLinkAttachmentEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PrivateLinkAttachmentGcpArgs', 'PrivateLinkAttachmentGcpArgsDict']]]] gcps: (Optional Configuration Block) supports the following:
        :param pulumi.Input[builtins.str] region: The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        :param pulumi.Input[builtins.str] resource_name_: (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLinkAttachmentState.__new__(_PrivateLinkAttachmentState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["azures"] = azures
        __props__.__dict__["cloud"] = cloud
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["dns_domain"] = dns_domain
        __props__.__dict__["environment"] = environment
        __props__.__dict__["gcps"] = gcps
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_name"] = resource_name_
        return PrivateLinkAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Sequence['outputs.PrivateLinkAttachmentAw']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> pulumi.Output[Sequence['outputs.PrivateLinkAttachmentAzure']]:
        """
        (Optional Configuration Block) supports the following:
        - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Output[builtins.str]:
        """
        The cloud service provider that hosts the resources to access with the Private Link Attachment.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Private Link Attachment.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="dnsDomain")
    def dns_domain(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "dns_domain")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.PrivateLinkAttachmentEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcps(self) -> pulumi.Output[Sequence['outputs.PrivateLinkAttachmentGcp']]:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[builtins.str]:
        """
        The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        """
        return pulumi.get(self, "resource_name")

