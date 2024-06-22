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

__all__ = ['PrivateLinkAccessArgs', 'PrivateLinkAccess']

@pulumi.input_type
class PrivateLinkAccessArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['PrivateLinkAccessEnvironmentArgs'],
                 network: pulumi.Input['PrivateLinkAccessNetworkArgs'],
                 aws: Optional[pulumi.Input['PrivateLinkAccessAwsArgs']] = None,
                 azure: Optional[pulumi.Input['PrivateLinkAccessAzureArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gcp: Optional[pulumi.Input['PrivateLinkAccessGcpArgs']] = None):
        """
        The set of arguments for constructing a PrivateLinkAccess resource.
        :param pulumi.Input['PrivateLinkAccessEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['PrivateLinkAccessNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        :param pulumi.Input[str] display_name: The name of the Private Link Access.
        """
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "network", network)
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azure is not None:
            pulumi.set(__self__, "azure", azure)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if gcp is not None:
            pulumi.set(__self__, "gcp", gcp)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['PrivateLinkAccessEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['PrivateLinkAccessEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['PrivateLinkAccessNetworkArgs']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['PrivateLinkAccessNetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['PrivateLinkAccessAwsArgs']]:
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['PrivateLinkAccessAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azure(self) -> Optional[pulumi.Input['PrivateLinkAccessAzureArgs']]:
        return pulumi.get(self, "azure")

    @azure.setter
    def azure(self, value: Optional[pulumi.Input['PrivateLinkAccessAzureArgs']]):
        pulumi.set(self, "azure", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Private Link Access.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def gcp(self) -> Optional[pulumi.Input['PrivateLinkAccessGcpArgs']]:
        return pulumi.get(self, "gcp")

    @gcp.setter
    def gcp(self, value: Optional[pulumi.Input['PrivateLinkAccessGcpArgs']]):
        pulumi.set(self, "gcp", value)


@pulumi.input_type
class _PrivateLinkAccessState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['PrivateLinkAccessAwsArgs']] = None,
                 azure: Optional[pulumi.Input['PrivateLinkAccessAzureArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['PrivateLinkAccessEnvironmentArgs']] = None,
                 gcp: Optional[pulumi.Input['PrivateLinkAccessGcpArgs']] = None,
                 network: Optional[pulumi.Input['PrivateLinkAccessNetworkArgs']] = None):
        """
        Input properties used for looking up and filtering PrivateLinkAccess resources.
        :param pulumi.Input[str] display_name: The name of the Private Link Access.
        :param pulumi.Input['PrivateLinkAccessEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['PrivateLinkAccessNetworkArgs'] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azure is not None:
            pulumi.set(__self__, "azure", azure)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if gcp is not None:
            pulumi.set(__self__, "gcp", gcp)
        if network is not None:
            pulumi.set(__self__, "network", network)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['PrivateLinkAccessAwsArgs']]:
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['PrivateLinkAccessAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azure(self) -> Optional[pulumi.Input['PrivateLinkAccessAzureArgs']]:
        return pulumi.get(self, "azure")

    @azure.setter
    def azure(self, value: Optional[pulumi.Input['PrivateLinkAccessAzureArgs']]):
        pulumi.set(self, "azure", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Private Link Access.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['PrivateLinkAccessEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['PrivateLinkAccessEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gcp(self) -> Optional[pulumi.Input['PrivateLinkAccessGcpArgs']]:
        return pulumi.get(self, "gcp")

    @gcp.setter
    def gcp(self, value: Optional[pulumi.Input['PrivateLinkAccessGcpArgs']]):
        pulumi.set(self, "gcp", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['PrivateLinkAccessNetworkArgs']]:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['PrivateLinkAccessNetworkArgs']]):
        pulumi.set(self, "network", value)


class PrivateLinkAccess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAwsArgs']]] = None,
                 azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAzureArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessEnvironmentArgs']]] = None,
                 gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessGcpArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessNetworkArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Example Private Link Access on AWS

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws_private_link = confluentcloud.Network("aws-private-link",
            display_name="AWS Private Link Network",
            cloud="AWS",
            region="us-east-1",
            connection_types=["PRIVATELINK"],
            zones=[
                "use1-az1",
                "use1-az2",
                "use1-az6",
            ],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        aws = confluentcloud.PrivateLinkAccess("aws",
            display_name="AWS Private Link Access",
            aws=confluentcloud.PrivateLinkAccessAwsArgs(
                account="012345678901",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=aws_private_link.id,
            ))
        ```

        ### Example Private Link Access on Azure

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        azure_private_link = confluentcloud.Network("azure-private-link",
            display_name="Azure Private Link Network",
            cloud="AZURE",
            region="centralus",
            connection_types=["PRIVATELINK"],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        azure = confluentcloud.PrivateLinkAccess("azure",
            display_name="Azure Private Link Access",
            azure=confluentcloud.PrivateLinkAccessAzureArgs(
                subscription="1234abcd-12ab-34cd-1234-123456abcdef",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=azure_private_link.id,
            ))
        ```

        ### Example Private Service Connect on GCP

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        gcp_private_service_connect = confluentcloud.Network("gcp-private-service-connect",
            display_name="GCP Private Service Connect Network",
            cloud="GCP",
            region="us-central1",
            connection_types=["PRIVATELINK"],
            zones=[
                "us-central1-a",
                "us-central1-b",
                "us-central1-c",
            ],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        gcp = confluentcloud.PrivateLinkAccess("gcp",
            display_name="GCP Private Service Connect",
            gcp=confluentcloud.PrivateLinkAccessGcpArgs(
                project="temp-gear-123456",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=gcp_private_service_connect.id,
            ))
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `PrivateLinkAccess` resource:
          * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
          * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
          * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
          * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
          * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
          * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC

        ## Import

        You can import a Private Link Access by using Environment ID and Private Link Access ID, in the format `<Environment ID>/<Private Link Access ID>`. The following example shows how to import a Private Link Access:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/privateLinkAccess:PrivateLinkAccess my_pla env-abc123/pla-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The name of the Private Link Access.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAccessEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAccessNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLinkAccessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Example Private Link Access on AWS

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        aws_private_link = confluentcloud.Network("aws-private-link",
            display_name="AWS Private Link Network",
            cloud="AWS",
            region="us-east-1",
            connection_types=["PRIVATELINK"],
            zones=[
                "use1-az1",
                "use1-az2",
                "use1-az6",
            ],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        aws = confluentcloud.PrivateLinkAccess("aws",
            display_name="AWS Private Link Access",
            aws=confluentcloud.PrivateLinkAccessAwsArgs(
                account="012345678901",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=aws_private_link.id,
            ))
        ```

        ### Example Private Link Access on Azure

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        azure_private_link = confluentcloud.Network("azure-private-link",
            display_name="Azure Private Link Network",
            cloud="AZURE",
            region="centralus",
            connection_types=["PRIVATELINK"],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        azure = confluentcloud.PrivateLinkAccess("azure",
            display_name="Azure Private Link Access",
            azure=confluentcloud.PrivateLinkAccessAzureArgs(
                subscription="1234abcd-12ab-34cd-1234-123456abcdef",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=azure_private_link.id,
            ))
        ```

        ### Example Private Service Connect on GCP

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        gcp_private_service_connect = confluentcloud.Network("gcp-private-service-connect",
            display_name="GCP Private Service Connect Network",
            cloud="GCP",
            region="us-central1",
            connection_types=["PRIVATELINK"],
            zones=[
                "us-central1-a",
                "us-central1-b",
                "us-central1-c",
            ],
            environment=confluentcloud.NetworkEnvironmentArgs(
                id=development.id,
            ))
        gcp = confluentcloud.PrivateLinkAccess("gcp",
            display_name="GCP Private Service Connect",
            gcp=confluentcloud.PrivateLinkAccessGcpArgs(
                project="temp-gear-123456",
            ),
            environment=confluentcloud.PrivateLinkAccessEnvironmentArgs(
                id=development.id,
            ),
            network=confluentcloud.PrivateLinkAccessNetworkArgs(
                id=gcp_private_service_connect.id,
            ))
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `PrivateLinkAccess` resource:
          * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
          * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
          * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
          * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
          * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
          * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC

        ## Import

        You can import a Private Link Access by using Environment ID and Private Link Access ID, in the format `<Environment ID>/<Private Link Access ID>`. The following example shows how to import a Private Link Access:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/privateLinkAccess:PrivateLinkAccess my_pla env-abc123/pla-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param PrivateLinkAccessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLinkAccessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAwsArgs']]] = None,
                 azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAzureArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessEnvironmentArgs']]] = None,
                 gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessGcpArgs']]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessNetworkArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateLinkAccessArgs.__new__(PrivateLinkAccessArgs)

            __props__.__dict__["aws"] = aws
            __props__.__dict__["azure"] = azure
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            __props__.__dict__["gcp"] = gcp
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
        super(PrivateLinkAccess, __self__).__init__(
            'confluentcloud:index/privateLinkAccess:PrivateLinkAccess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAwsArgs']]] = None,
            azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessAzureArgs']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessEnvironmentArgs']]] = None,
            gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessGcpArgs']]] = None,
            network: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAccessNetworkArgs']]] = None) -> 'PrivateLinkAccess':
        """
        Get an existing PrivateLinkAccess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The name of the Private Link Access.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAccessEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAccessNetworkArgs']] network: Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
               accounts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLinkAccessState.__new__(_PrivateLinkAccessState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["azure"] = azure
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["gcp"] = gcp
        __props__.__dict__["network"] = network
        return PrivateLinkAccess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Optional['outputs.PrivateLinkAccessAws']]:
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azure(self) -> pulumi.Output[Optional['outputs.PrivateLinkAccessAzure']]:
        return pulumi.get(self, "azure")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Private Link Access.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.PrivateLinkAccessEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcp(self) -> pulumi.Output[Optional['outputs.PrivateLinkAccessGcp']]:
        return pulumi.get(self, "gcp")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.PrivateLinkAccessNetwork']:
        """
        Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        accounts.
        """
        return pulumi.get(self, "network")
