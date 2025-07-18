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

__all__ = ['EnvironmentArgs', 'Environment']

@pulumi.input_type
class EnvironmentArgs:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 stream_governance: Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']] = None):
        """
        The set of arguments for constructing a Environment resource.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input['EnvironmentStreamGovernanceArgs'] stream_governance: The stream governance configuration for the Environment. The block supports the following arguments:
        """
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if stream_governance is not None:
            pulumi.set(__self__, "stream_governance", stream_governance)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="streamGovernance")
    def stream_governance(self) -> Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']]:
        """
        The stream governance configuration for the Environment. The block supports the following arguments:
        """
        return pulumi.get(self, "stream_governance")

    @stream_governance.setter
    def stream_governance(self, value: Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']]):
        pulumi.set(self, "stream_governance", value)


@pulumi.input_type
class _EnvironmentState:
    def __init__(__self__, *,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 resource_name: Optional[pulumi.Input[builtins.str]] = None,
                 stream_governance: Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']] = None):
        """
        Input properties used for looking up and filtering Environment resources.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input[builtins.str] resource_name: (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        :param pulumi.Input['EnvironmentStreamGovernanceArgs'] stream_governance: The stream governance configuration for the Environment. The block supports the following arguments:
        """
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)
        if stream_governance is not None:
            pulumi.set(__self__, "stream_governance", stream_governance)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="streamGovernance")
    def stream_governance(self) -> Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']]:
        """
        The stream governance configuration for the Environment. The block supports the following arguments:
        """
        return pulumi.get(self, "stream_governance")

    @stream_governance.setter
    def stream_governance(self, value: Optional[pulumi.Input['EnvironmentStreamGovernanceArgs']]):
        pulumi.set(self, "stream_governance", value)


@pulumi.type_token("confluentcloud:index/environment:Environment")
class Environment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 stream_governance: Optional[pulumi.Input[Union['EnvironmentStreamGovernanceArgs', 'EnvironmentStreamGovernanceArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        prod = confluentcloud.Environment("prod",
            display_name="Production",
            stream_governance={
                "package": "ESSENTIALS",
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `Environment` resource:
          * basic-kafka-acls: _Basic_ Kafka cluster with authorization using ACLs
          * basic-kafka-acls-with-alias: _Basic_ Kafka cluster with authorization using ACLs
          * standard-kafka-acls: _Standard_ Kafka cluster with authorization using ACLs
          * standard-kafka-rbac: _Standard_ Kafka cluster with authorization using RBAC
          * dedicated-public-kafka-acls: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
          * dedicated-public-kafka-rbac: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
          * dedicated-privatelink-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
          * dedicated-privatelink-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
          * dedicated-privatelink-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
          * dedicated-privatelink-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
          * dedicated-private-service-connect-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
          * dedicated-private-service-connect-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
          * dedicated-vnet-peering-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vnet-peering-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-vpc-peering-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vpc-peering-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-vpc-peering-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vpc-peering-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-transit-gateway-attachment-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
          * dedicated-transit-gateway-attachment-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
          * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import an Environment by using Environment ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/environment:Environment my_env env-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input[Union['EnvironmentStreamGovernanceArgs', 'EnvironmentStreamGovernanceArgsDict']] stream_governance: The stream governance configuration for the Environment. The block supports the following arguments:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EnvironmentArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        prod = confluentcloud.Environment("prod",
            display_name="Production",
            stream_governance={
                "package": "ESSENTIALS",
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `Environment` resource:
          * basic-kafka-acls: _Basic_ Kafka cluster with authorization using ACLs
          * basic-kafka-acls-with-alias: _Basic_ Kafka cluster with authorization using ACLs
          * standard-kafka-acls: _Standard_ Kafka cluster with authorization using ACLs
          * standard-kafka-rbac: _Standard_ Kafka cluster with authorization using RBAC
          * dedicated-public-kafka-acls: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
          * dedicated-public-kafka-rbac: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
          * dedicated-privatelink-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
          * dedicated-privatelink-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
          * dedicated-privatelink-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
          * dedicated-privatelink-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
          * dedicated-private-service-connect-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
          * dedicated-private-service-connect-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
          * dedicated-vnet-peering-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vnet-peering-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-vpc-peering-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vpc-peering-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-vpc-peering-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
          * dedicated-vpc-peering-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
          * dedicated-transit-gateway-attachment-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
          * dedicated-transit-gateway-attachment-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
          * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import an Environment by using Environment ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/environment:Environment my_env env-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param EnvironmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 stream_governance: Optional[pulumi.Input[Union['EnvironmentStreamGovernanceArgs', 'EnvironmentStreamGovernanceArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentArgs.__new__(EnvironmentArgs)

            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["stream_governance"] = stream_governance
            __props__.__dict__["resource_name"] = None
        super(Environment, __self__).__init__(
            'confluentcloud:index/environment:Environment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            resource_name_: Optional[pulumi.Input[builtins.str]] = None,
            stream_governance: Optional[pulumi.Input[Union['EnvironmentStreamGovernanceArgs', 'EnvironmentStreamGovernanceArgsDict']]] = None) -> 'Environment':
        """
        Get an existing Environment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        :param pulumi.Input[builtins.str] resource_name_: (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        :param pulumi.Input[Union['EnvironmentStreamGovernanceArgs', 'EnvironmentStreamGovernanceArgsDict']] stream_governance: The stream governance configuration for the Environment. The block supports the following arguments:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentState.__new__(_EnvironmentState)

        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["stream_governance"] = stream_governance
        return Environment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[builtins.str]:
        """
        (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="streamGovernance")
    def stream_governance(self) -> pulumi.Output['outputs.EnvironmentStreamGovernance']:
        """
        The stream governance configuration for the Environment. The block supports the following arguments:
        """
        return pulumi.get(self, "stream_governance")

