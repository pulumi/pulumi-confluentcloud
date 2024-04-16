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

__all__ = ['TransitGatewayAttachmentArgs', 'TransitGatewayAttachment']

@pulumi.input_type
class TransitGatewayAttachmentArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['TransitGatewayAttachmentEnvironmentArgs'],
                 network: pulumi.Input['TransitGatewayAttachmentNetworkArgs'],
                 aws: Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitGatewayAttachment resource.
        :param pulumi.Input['TransitGatewayAttachmentEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['TransitGatewayAttachmentNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input['TransitGatewayAttachmentAwsArgs'] aws: (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Transit Gateway Attachment.
        """
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "network", network)
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['TransitGatewayAttachmentEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['TransitGatewayAttachmentEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['TransitGatewayAttachmentNetworkArgs']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['TransitGatewayAttachmentNetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']]:
        """
        (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Transit Gateway Attachment.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _TransitGatewayAttachmentState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['TransitGatewayAttachmentEnvironmentArgs']] = None,
                 network: Optional[pulumi.Input['TransitGatewayAttachmentNetworkArgs']] = None):
        """
        Input properties used for looking up and filtering TransitGatewayAttachment resources.
        :param pulumi.Input['TransitGatewayAttachmentAwsArgs'] aws: (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Transit Gateway Attachment.
        :param pulumi.Input['TransitGatewayAttachmentEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['TransitGatewayAttachmentNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if network is not None:
            pulumi.set(__self__, "network", network)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']]:
        """
        (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['TransitGatewayAttachmentAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Transit Gateway Attachment.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['TransitGatewayAttachmentEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['TransitGatewayAttachmentEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['TransitGatewayAttachmentNetworkArgs']]:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['TransitGatewayAttachmentNetworkArgs']]):
        pulumi.set(self, "network", value)


class TransitGatewayAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentAwsArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentEnvironmentArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentNetworkArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Example Transit Gateway Attachment on AWS

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws_transit_gateway_attachment = confluentcloud.Network("aws-transit-gateway-attachment",
            display_name="AWS Transit Gateway Attachment Network",
            cloud="AWS",
            region="us-east-2",
            cidr="10.10.0.0/16",
            connection_types=["TRANSITGATEWAY"],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        aws = confluentcloud.TransitGatewayAttachment("aws",
            display_name="AWS Transit Gateway Attachment",
            aws=confluentcloud.TransitGatewayAttachmentAwsArgs(
                ram_resource_share_arn="arn:aws:ram:us-east-2:000000000000:resource-share/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx",
                transit_gateway_id="tgw-xxxxxxxxxxxxxxxxx",
                routes=[
                    "192.168.0.0/16",
                    "172.16.0.0/12",
                    "100.64.0.0/10",
                    "10.0.0.0/8",
                ],
            ),
            environment=confluentcloud.TransitGatewayAttachmentEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.TransitGatewayAttachmentNetworkArgs(
                id=aws_transit_gateway_attachment.id,
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Getting Started

        The following end-to-end examples might help to get started with `TransitGatewayAttachment` resource:
          * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
          * enterprise-privatelinkattachment-aws-kafka-acls

        ## Import

        You can import a Transit Gateway Attachment by using Environment ID and Transit Gateway Attachment ID, in the format `<Environment ID>/<Transit Gateway Attachment ID>`. The following example shows how to import a Transit Gateway Attachment:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment my_tgwa env-abc123/tgwa-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentAwsArgs']] aws: (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Transit Gateway Attachment.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitGatewayAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Example Transit Gateway Attachment on AWS

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws_transit_gateway_attachment = confluentcloud.Network("aws-transit-gateway-attachment",
            display_name="AWS Transit Gateway Attachment Network",
            cloud="AWS",
            region="us-east-2",
            cidr="10.10.0.0/16",
            connection_types=["TRANSITGATEWAY"],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        aws = confluentcloud.TransitGatewayAttachment("aws",
            display_name="AWS Transit Gateway Attachment",
            aws=confluentcloud.TransitGatewayAttachmentAwsArgs(
                ram_resource_share_arn="arn:aws:ram:us-east-2:000000000000:resource-share/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx",
                transit_gateway_id="tgw-xxxxxxxxxxxxxxxxx",
                routes=[
                    "192.168.0.0/16",
                    "172.16.0.0/12",
                    "100.64.0.0/10",
                    "10.0.0.0/8",
                ],
            ),
            environment=confluentcloud.TransitGatewayAttachmentEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.TransitGatewayAttachmentNetworkArgs(
                id=aws_transit_gateway_attachment.id,
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Getting Started

        The following end-to-end examples might help to get started with `TransitGatewayAttachment` resource:
          * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
          * enterprise-privatelinkattachment-aws-kafka-acls

        ## Import

        You can import a Transit Gateway Attachment by using Environment ID and Transit Gateway Attachment ID, in the format `<Environment ID>/<Transit Gateway Attachment ID>`. The following example shows how to import a Transit Gateway Attachment:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment my_tgwa env-abc123/tgwa-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param TransitGatewayAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitGatewayAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentAwsArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentEnvironmentArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentNetworkArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitGatewayAttachmentArgs.__new__(TransitGatewayAttachmentArgs)

            __props__.__dict__["aws"] = aws
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
        super(TransitGatewayAttachment, __self__).__init__(
            'confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentAwsArgs']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentEnvironmentArgs']]] = None,
            network: Optional[pulumi.Input[pulumi.InputType['TransitGatewayAttachmentNetworkArgs']]] = None) -> 'TransitGatewayAttachment':
        """
        Get an existing TransitGatewayAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentAwsArgs']] aws: (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        :param pulumi.Input[str] display_name: The name of the Transit Gateway Attachment.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['TransitGatewayAttachmentNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitGatewayAttachmentState.__new__(_TransitGatewayAttachmentState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["network"] = network
        return TransitGatewayAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Optional['outputs.TransitGatewayAttachmentAws']]:
        """
        (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Transit Gateway Attachment.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.TransitGatewayAttachmentEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.TransitGatewayAttachmentNetwork']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

