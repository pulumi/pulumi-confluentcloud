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

__all__ = ['ApiKeyArgs', 'ApiKey']

@pulumi.input_type
class ApiKeyArgs:
    def __init__(__self__, *,
                 owner: pulumi.Input['ApiKeyOwnerArgs'],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 managed_resource: Optional[pulumi.Input['ApiKeyManagedResourceArgs']] = None):
        """
        The set of arguments for constructing a ApiKey resource.
        :param pulumi.Input['ApiKeyOwnerArgs'] owner: The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        :param pulumi.Input[builtins.str] description: A free-form description of the API Account.
        :param pulumi.Input[builtins.bool] disable_wait_for_ready: An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the API Key.
        :param pulumi.Input['ApiKeyManagedResourceArgs'] managed_resource: The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
               'srcm.v3.Cluster'.
        """
        pulumi.set(__self__, "owner", owner)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_wait_for_ready is not None:
            pulumi.set(__self__, "disable_wait_for_ready", disable_wait_for_ready)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if managed_resource is not None:
            pulumi.set(__self__, "managed_resource", managed_resource)

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Input['ApiKeyOwnerArgs']:
        """
        The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: pulumi.Input['ApiKeyOwnerArgs']):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A free-form description of the API Account.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        """
        return pulumi.get(self, "disable_wait_for_ready")

    @disable_wait_for_ready.setter
    def disable_wait_for_ready(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "disable_wait_for_ready", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-readable name for the API Key.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="managedResource")
    def managed_resource(self) -> Optional[pulumi.Input['ApiKeyManagedResourceArgs']]:
        """
        The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
        'srcm.v3.Cluster'.
        """
        return pulumi.get(self, "managed_resource")

    @managed_resource.setter
    def managed_resource(self, value: Optional[pulumi.Input['ApiKeyManagedResourceArgs']]):
        pulumi.set(self, "managed_resource", value)


@pulumi.input_type
class _ApiKeyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 managed_resource: Optional[pulumi.Input['ApiKeyManagedResourceArgs']] = None,
                 owner: Optional[pulumi.Input['ApiKeyOwnerArgs']] = None,
                 secret: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ApiKey resources.
        :param pulumi.Input[builtins.str] description: A free-form description of the API Account.
        :param pulumi.Input[builtins.bool] disable_wait_for_ready: An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the API Key.
        :param pulumi.Input['ApiKeyManagedResourceArgs'] managed_resource: The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
               'srcm.v3.Cluster'.
        :param pulumi.Input['ApiKeyOwnerArgs'] owner: The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        :param pulumi.Input[builtins.str] secret: (Required String, Sensitive) The secret of the API Key.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_wait_for_ready is not None:
            pulumi.set(__self__, "disable_wait_for_ready", disable_wait_for_ready)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if managed_resource is not None:
            pulumi.set(__self__, "managed_resource", managed_resource)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A free-form description of the API Account.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        """
        return pulumi.get(self, "disable_wait_for_ready")

    @disable_wait_for_ready.setter
    def disable_wait_for_ready(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "disable_wait_for_ready", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A human-readable name for the API Key.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="managedResource")
    def managed_resource(self) -> Optional[pulumi.Input['ApiKeyManagedResourceArgs']]:
        """
        The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
        'srcm.v3.Cluster'.
        """
        return pulumi.get(self, "managed_resource")

    @managed_resource.setter
    def managed_resource(self, value: Optional[pulumi.Input['ApiKeyManagedResourceArgs']]):
        pulumi.set(self, "managed_resource", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input['ApiKeyOwnerArgs']]:
        """
        The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input['ApiKeyOwnerArgs']]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        (Required String, Sensitive) The secret of the API Key.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "secret", value)


@pulumi.type_token("confluentcloud:index/apiKey:ApiKey")
class ApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 managed_resource: Optional[pulumi.Input[Union['ApiKeyManagedResourceArgs', 'ApiKeyManagedResourceArgsDict']]] = None,
                 owner: Optional[pulumi.Input[Union['ApiKeyOwnerArgs', 'ApiKeyOwnerArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Example Tableflow API Key
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        env_manager_tableflow_api_key = confluentcloud.ApiKey("env-manager-tableflow-api-key",
            display_name="env-manager-tableflow-api-key",
            description="Tableflow API Key that is owned by 'env-manager' service account",
            owner={
                "id": env_manager["id"],
                "api_version": env_manager["apiVersion"],
                "kind": env_manager["kind"],
            },
            managed_resource={
                "id": "tableflow",
                "api_version": "tableflow/v1",
                "kind": "Tableflow",
            })
        ```

        ### Example Cloud API Key
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        env_manager_cloud_api_key = confluentcloud.ApiKey("env-manager-cloud-api-key",
            display_name="env-manager-cloud-api-key",
            description="Cloud API Key that is owned by 'env-manager' service account",
            owner={
                "id": env_manager["id"],
                "api_version": env_manager["apiVersion"],
                "kind": env_manager["kind"],
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ApiKey` resource:
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

        You can import a Cluster API Key by using the Environment ID and Cluster API Key ID in the format `<Environment ID>/<Cluster API Key ID>`, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        $ export API_KEY_SECRET="<api_key_secret>"

        Option #1: Cluster API Key

        ```sh
        $ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key "env-abc123/UTT6WDRXX7FHD2GV"
        ```

        You can import a Cloud or Tableflow API Key by using Cloud or Tableflow API Key ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        $ export API_KEY_SECRET="<api_key_secret>"

        Option #2: Cloud or Tableflow API Key

        ```sh
        $ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key "4UEXOMMWIBE5KZQG"
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A free-form description of the API Account.
        :param pulumi.Input[builtins.bool] disable_wait_for_ready: An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the API Key.
        :param pulumi.Input[Union['ApiKeyManagedResourceArgs', 'ApiKeyManagedResourceArgsDict']] managed_resource: The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
               'srcm.v3.Cluster'.
        :param pulumi.Input[Union['ApiKeyOwnerArgs', 'ApiKeyOwnerArgsDict']] owner: The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Example Tableflow API Key
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        env_manager_tableflow_api_key = confluentcloud.ApiKey("env-manager-tableflow-api-key",
            display_name="env-manager-tableflow-api-key",
            description="Tableflow API Key that is owned by 'env-manager' service account",
            owner={
                "id": env_manager["id"],
                "api_version": env_manager["apiVersion"],
                "kind": env_manager["kind"],
            },
            managed_resource={
                "id": "tableflow",
                "api_version": "tableflow/v1",
                "kind": "Tableflow",
            })
        ```

        ### Example Cloud API Key
        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        env_manager_cloud_api_key = confluentcloud.ApiKey("env-manager-cloud-api-key",
            display_name="env-manager-cloud-api-key",
            description="Cloud API Key that is owned by 'env-manager' service account",
            owner={
                "id": env_manager["id"],
                "api_version": env_manager["apiVersion"],
                "kind": env_manager["kind"],
            })
        ```

        ## Getting Started

        The following end-to-end examples might help to get started with `ApiKey` resource:
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

        You can import a Cluster API Key by using the Environment ID and Cluster API Key ID in the format `<Environment ID>/<Cluster API Key ID>`, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        $ export API_KEY_SECRET="<api_key_secret>"

        Option #1: Cluster API Key

        ```sh
        $ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key "env-abc123/UTT6WDRXX7FHD2GV"
        ```

        You can import a Cloud or Tableflow API Key by using Cloud or Tableflow API Key ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        $ export API_KEY_SECRET="<api_key_secret>"

        Option #2: Cloud or Tableflow API Key

        ```sh
        $ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key "4UEXOMMWIBE5KZQG"
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param ApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 managed_resource: Optional[pulumi.Input[Union['ApiKeyManagedResourceArgs', 'ApiKeyManagedResourceArgsDict']]] = None,
                 owner: Optional[pulumi.Input[Union['ApiKeyOwnerArgs', 'ApiKeyOwnerArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiKeyArgs.__new__(ApiKeyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["disable_wait_for_ready"] = disable_wait_for_ready
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["managed_resource"] = managed_resource
            if owner is None and not opts.urn:
                raise TypeError("Missing required property 'owner'")
            __props__.__dict__["owner"] = owner
            __props__.__dict__["secret"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ApiKey, __self__).__init__(
            'confluentcloud:index/apiKey:ApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            disable_wait_for_ready: Optional[pulumi.Input[builtins.bool]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            managed_resource: Optional[pulumi.Input[Union['ApiKeyManagedResourceArgs', 'ApiKeyManagedResourceArgsDict']]] = None,
            owner: Optional[pulumi.Input[Union['ApiKeyOwnerArgs', 'ApiKeyOwnerArgsDict']]] = None,
            secret: Optional[pulumi.Input[builtins.str]] = None) -> 'ApiKey':
        """
        Get an existing ApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A free-form description of the API Account.
        :param pulumi.Input[builtins.bool] disable_wait_for_ready: An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        :param pulumi.Input[builtins.str] display_name: A human-readable name for the API Key.
        :param pulumi.Input[Union['ApiKeyManagedResourceArgs', 'ApiKeyManagedResourceArgsDict']] managed_resource: The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
               'srcm.v3.Cluster'.
        :param pulumi.Input[Union['ApiKeyOwnerArgs', 'ApiKeyOwnerArgsDict']] owner: The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        :param pulumi.Input[builtins.str] secret: (Required String, Sensitive) The secret of the API Key.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiKeyState.__new__(_ApiKeyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["disable_wait_for_ready"] = disable_wait_for_ready
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["managed_resource"] = managed_resource
        __props__.__dict__["owner"] = owner
        __props__.__dict__["secret"] = secret
        return ApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        A free-form description of the API Account.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disableWaitForReady")
    def disable_wait_for_ready(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        """
        return pulumi.get(self, "disable_wait_for_ready")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        A human-readable name for the API Key.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="managedResource")
    def managed_resource(self) -> pulumi.Output[Optional['outputs.ApiKeyManagedResource']]:
        """
        The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster',
        'srcm.v3.Cluster'.
        """
        return pulumi.get(self, "managed_resource")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output['outputs.ApiKeyOwner']:
        """
        The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[builtins.str]:
        """
        (Required String, Sensitive) The secret of the API Key.
        """
        return pulumi.get(self, "secret")

