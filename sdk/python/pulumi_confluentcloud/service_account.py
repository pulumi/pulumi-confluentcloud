# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServiceAccountArgs', 'ServiceAccount']

@pulumi.input_type
class ServiceAccountArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceAccount resource.
        :param pulumi.Input[str] description: A free-form description of the Service Account.
        :param pulumi.Input[str] display_name: A human-readable name for the Service Account.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-form description of the Service Account.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable name for the Service Account.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _ServiceAccountState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceAccount resources.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
        :param pulumi.Input[str] description: A free-form description of the Service Account.
        :param pulumi.Input[str] display_name: A human-readable name for the Service Account.
        :param pulumi.Input[str] kind: (Required String) A kind of the Service Account, for example, `ServiceAccount`.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", api_version)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-form description of the Service Account.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-readable name for the Service Account.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) A kind of the Service Account, for example, `ServiceAccount`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)


class ServiceAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `ServiceAccount` provides a Service Account resource that enables creating, editing, and deleting service accounts on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example_sa = confluentcloud.ServiceAccount("example-sa",
            display_name="orders-app-sa",
            description="Service Account for orders app")
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ServiceAccount` resource:
        * `basic-kafka-acls`: *Basic* Kafka cluster with authorization using ACLs
        * `basic-kafka-acls-with-alias`: *Basic* Kafka cluster with authorization using ACLs
        * `standard-kafka-acls`: *Standard* Kafka cluster with authorization using ACLs
        * `standard-kafka-rbac`: *Standard* Kafka cluster with authorization using RBAC
        * `dedicated-public-kafka-acls`: *Dedicated* Kafka cluster that is accessible over the public internet with authorization using ACLs
        * `dedicated-public-kafka-rbac`: *Dedicated* Kafka cluster that is accessible over the public internet with authorization using RBAC
        * `dedicated-privatelink-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        * `dedicated-privatelink-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
        * `dedicated-privatelink-azure-kafka-rbac`: *Dedicated* Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
        * `dedicated-privatelink-azure-kafka-acls`: *Dedicated* Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
        * `dedicated-private-service-connect-gcp-kafka-acls`: *Dedicated* Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
        * `dedicated-private-service-connect-gcp-kafka-rbac`: *Dedicated* Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
        * `dedicated-vnet-peering-azure-kafka-acls`: *Dedicated* Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vnet-peering-azure-kafka-rbac`: *Dedicated* Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-vpc-peering-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vpc-peering-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-vpc-peering-gcp-kafka-acls`: *Dedicated* Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vpc-peering-gcp-kafka-rbac`: *Dedicated* Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-transit-gateway-attachment-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
        * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
        * `enterprise-privatelinkattachment-aws-kafka-acls`: *Enterprise* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import a Service Account by using Service Account ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/serviceAccount:ServiceAccount my_sa sa-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form description of the Service Account.
        :param pulumi.Input[str] display_name: A human-readable name for the Service Account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServiceAccountArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `ServiceAccount` provides a Service Account resource that enables creating, editing, and deleting service accounts on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example_sa = confluentcloud.ServiceAccount("example-sa",
            display_name="orders-app-sa",
            description="Service Account for orders app")
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ServiceAccount` resource:
        * `basic-kafka-acls`: *Basic* Kafka cluster with authorization using ACLs
        * `basic-kafka-acls-with-alias`: *Basic* Kafka cluster with authorization using ACLs
        * `standard-kafka-acls`: *Standard* Kafka cluster with authorization using ACLs
        * `standard-kafka-rbac`: *Standard* Kafka cluster with authorization using RBAC
        * `dedicated-public-kafka-acls`: *Dedicated* Kafka cluster that is accessible over the public internet with authorization using ACLs
        * `dedicated-public-kafka-rbac`: *Dedicated* Kafka cluster that is accessible over the public internet with authorization using RBAC
        * `dedicated-privatelink-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        * `dedicated-privatelink-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
        * `dedicated-privatelink-azure-kafka-rbac`: *Dedicated* Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
        * `dedicated-privatelink-azure-kafka-acls`: *Dedicated* Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
        * `dedicated-private-service-connect-gcp-kafka-acls`: *Dedicated* Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
        * `dedicated-private-service-connect-gcp-kafka-rbac`: *Dedicated* Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
        * `dedicated-vnet-peering-azure-kafka-acls`: *Dedicated* Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vnet-peering-azure-kafka-rbac`: *Dedicated* Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-vpc-peering-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vpc-peering-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-vpc-peering-gcp-kafka-acls`: *Dedicated* Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
        * `dedicated-vpc-peering-gcp-kafka-rbac`: *Dedicated* Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
        * `dedicated-transit-gateway-attachment-aws-kafka-acls`: *Dedicated* Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
        * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: *Dedicated* Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
        * `enterprise-privatelinkattachment-aws-kafka-acls`: *Enterprise* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs

        ## Import

        You can import a Service Account by using Service Account ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/serviceAccount:ServiceAccount my_sa sa-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param ServiceAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceAccountArgs.__new__(ServiceAccountArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["api_version"] = None
            __props__.__dict__["kind"] = None
        super(ServiceAccount, __self__).__init__(
            'confluentcloud:index/serviceAccount:ServiceAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_version: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None) -> 'ServiceAccount':
        """
        Get an existing ServiceAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
        :param pulumi.Input[str] description: A free-form description of the Service Account.
        :param pulumi.Input[str] display_name: A human-readable name for the Service Account.
        :param pulumi.Input[str] kind: (Required String) A kind of the Service Account, for example, `ServiceAccount`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceAccountState.__new__(_ServiceAccountState)

        __props__.__dict__["api_version"] = api_version
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["kind"] = kind
        return ServiceAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A free-form description of the Service Account.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        A human-readable name for the Service Account.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        (Required String) A kind of the Service Account, for example, `ServiceAccount`.
        """
        return pulumi.get(self, "kind")

