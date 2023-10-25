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

__all__ = ['PrivateLinkAttachmentConnectionArgs', 'PrivateLinkAttachmentConnection']

@pulumi.input_type
class PrivateLinkAttachmentConnectionArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs'],
                 private_link_attachment: pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs'],
                 aws: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']] = None,
                 azure: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 gcp: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']] = None):
        """
        The set of arguments for constructing a PrivateLinkAttachmentConnection resource.
        :param pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs'] private_link_attachment: The private_link_attachment to which this belongs.
        :param pulumi.Input[str] display_name: The name of the Private Link Attachment Connection.
        """
        PrivateLinkAttachmentConnectionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            environment=environment,
            private_link_attachment=private_link_attachment,
            aws=aws,
            azure=azure,
            display_name=display_name,
            gcp=gcp,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             environment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']] = None,
             private_link_attachment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']] = None,
             aws: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']] = None,
             azure: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             gcp: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if environment is None:
            raise TypeError("Missing 'environment' argument")
        if private_link_attachment is None and 'privateLinkAttachment' in kwargs:
            private_link_attachment = kwargs['privateLinkAttachment']
        if private_link_attachment is None:
            raise TypeError("Missing 'private_link_attachment' argument")
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']

        _setter("environment", environment)
        _setter("private_link_attachment", private_link_attachment)
        if aws is not None:
            _setter("aws", aws)
        if azure is not None:
            _setter("azure", azure)
        if display_name is not None:
            _setter("display_name", display_name)
        if gcp is not None:
            _setter("gcp", gcp)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="privateLinkAttachment")
    def private_link_attachment(self) -> pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']:
        """
        The private_link_attachment to which this belongs.
        """
        return pulumi.get(self, "private_link_attachment")

    @private_link_attachment.setter
    def private_link_attachment(self, value: pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']):
        pulumi.set(self, "private_link_attachment", value)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']]:
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azure(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']]:
        return pulumi.get(self, "azure")

    @azure.setter
    def azure(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']]):
        pulumi.set(self, "azure", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Private Link Attachment Connection.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def gcp(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']]:
        return pulumi.get(self, "gcp")

    @gcp.setter
    def gcp(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']]):
        pulumi.set(self, "gcp", value)


@pulumi.input_type
class _PrivateLinkAttachmentConnectionState:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']] = None,
                 azure: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']] = None,
                 gcp: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']] = None,
                 private_link_attachment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']] = None,
                 resource_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrivateLinkAttachmentConnection resources.
        :param pulumi.Input[str] display_name: The name of the Private Link Attachment Connection.
        :param pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs'] private_link_attachment: The private_link_attachment to which this belongs.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        """
        _PrivateLinkAttachmentConnectionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            aws=aws,
            azure=azure,
            display_name=display_name,
            environment=environment,
            gcp=gcp,
            private_link_attachment=private_link_attachment,
            resource_name=resource_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             aws: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']] = None,
             azure: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             environment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']] = None,
             gcp: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']] = None,
             private_link_attachment: Optional[pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if private_link_attachment is None and 'privateLinkAttachment' in kwargs:
            private_link_attachment = kwargs['privateLinkAttachment']
        if resource_name is None and 'resourceName' in kwargs:
            resource_name = kwargs['resourceName']

        if aws is not None:
            _setter("aws", aws)
        if azure is not None:
            _setter("azure", azure)
        if display_name is not None:
            _setter("display_name", display_name)
        if environment is not None:
            _setter("environment", environment)
        if gcp is not None:
            _setter("gcp", gcp)
        if private_link_attachment is not None:
            _setter("private_link_attachment", private_link_attachment)
        if resource_name is not None:
            _setter("resource_name", resource_name)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']]:
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAwsArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azure(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']]:
        return pulumi.get(self, "azure")

    @azure.setter
    def azure(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionAzureArgs']]):
        pulumi.set(self, "azure", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Private Link Attachment Connection.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def gcp(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']]:
        return pulumi.get(self, "gcp")

    @gcp.setter
    def gcp(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionGcpArgs']]):
        pulumi.set(self, "gcp", value)

    @property
    @pulumi.getter(name="privateLinkAttachment")
    def private_link_attachment(self) -> Optional[pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']]:
        """
        The private_link_attachment to which this belongs.
        """
        return pulumi.get(self, "private_link_attachment")

    @private_link_attachment.setter
    def private_link_attachment(self, value: Optional[pulumi.Input['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']]):
        pulumi.set(self, "private_link_attachment", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)


class PrivateLinkAttachmentConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAwsArgs']]] = None,
                 azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAzureArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionEnvironmentArgs']]] = None,
                 gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionGcpArgs']]] = None,
                 private_link_attachment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']]] = None,
                 __props__=None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `PrivateLinkAttachmentConnection` provides a Private Link Attachment Connection resource that enables creating, editing, and deleting Private Link Attachment Connections on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.PrivateLinkAttachmentConnection("main",
            display_name="my_endpoint",
            environment=confluentcloud.PrivateLinkAttachmentConnectionEnvironmentArgs(
                id="env-8gv0v5",
            ),
            aws=confluentcloud.PrivateLinkAttachmentConnectionAwsArgs(
                vpc_endpoint_id="vpce-0ed4d51f5d6ef9b6d",
            ),
            private_link_attachment=confluentcloud.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs(
                id="platt-plyvyl",
            ))
        pulumi.export("privateLinkAttachmentConnection", main)
        ```

        ## Import

        You can import a Private Link Attachment Connection by using Environment ID and Private Link Attachment Connection ID, in the format `<Environment ID>/<Private Link Attachment Connection ID>`. The following example shows how to import a Private Link Attachment Connection$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection main env-abc123/plattc-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The name of the Private Link Attachment Connection.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']] private_link_attachment: The private_link_attachment to which this belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateLinkAttachmentConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `PrivateLinkAttachmentConnection` provides a Private Link Attachment Connection resource that enables creating, editing, and deleting Private Link Attachment Connections on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.PrivateLinkAttachmentConnection("main",
            display_name="my_endpoint",
            environment=confluentcloud.PrivateLinkAttachmentConnectionEnvironmentArgs(
                id="env-8gv0v5",
            ),
            aws=confluentcloud.PrivateLinkAttachmentConnectionAwsArgs(
                vpc_endpoint_id="vpce-0ed4d51f5d6ef9b6d",
            ),
            private_link_attachment=confluentcloud.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs(
                id="platt-plyvyl",
            ))
        pulumi.export("privateLinkAttachmentConnection", main)
        ```

        ## Import

        You can import a Private Link Attachment Connection by using Environment ID and Private Link Attachment Connection ID, in the format `<Environment ID>/<Private Link Attachment Connection ID>`. The following example shows how to import a Private Link Attachment Connection$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection main env-abc123/plattc-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param PrivateLinkAttachmentConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateLinkAttachmentConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PrivateLinkAttachmentConnectionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAwsArgs']]] = None,
                 azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAzureArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionEnvironmentArgs']]] = None,
                 gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionGcpArgs']]] = None,
                 private_link_attachment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateLinkAttachmentConnectionArgs.__new__(PrivateLinkAttachmentConnectionArgs)

            aws = _utilities.configure(aws, PrivateLinkAttachmentConnectionAwsArgs, True)
            __props__.__dict__["aws"] = aws
            azure = _utilities.configure(azure, PrivateLinkAttachmentConnectionAzureArgs, True)
            __props__.__dict__["azure"] = azure
            __props__.__dict__["display_name"] = display_name
            environment = _utilities.configure(environment, PrivateLinkAttachmentConnectionEnvironmentArgs, True)
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            gcp = _utilities.configure(gcp, PrivateLinkAttachmentConnectionGcpArgs, True)
            __props__.__dict__["gcp"] = gcp
            private_link_attachment = _utilities.configure(private_link_attachment, PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs, True)
            if private_link_attachment is None and not opts.urn:
                raise TypeError("Missing required property 'private_link_attachment'")
            __props__.__dict__["private_link_attachment"] = private_link_attachment
            __props__.__dict__["resource_name"] = None
        super(PrivateLinkAttachmentConnection, __self__).__init__(
            'confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAwsArgs']]] = None,
            azure: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionAzureArgs']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionEnvironmentArgs']]] = None,
            gcp: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionGcpArgs']]] = None,
            private_link_attachment: Optional[pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None) -> 'PrivateLinkAttachmentConnection':
        """
        Get an existing PrivateLinkAttachmentConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The name of the Private Link Attachment Connection.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[pulumi.InputType['PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs']] private_link_attachment: The private_link_attachment to which this belongs.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateLinkAttachmentConnectionState.__new__(_PrivateLinkAttachmentConnectionState)

        __props__.__dict__["aws"] = aws
        __props__.__dict__["azure"] = azure
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["gcp"] = gcp
        __props__.__dict__["private_link_attachment"] = private_link_attachment
        __props__.__dict__["resource_name"] = resource_name_
        return PrivateLinkAttachmentConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aws(self) -> pulumi.Output[Optional['outputs.PrivateLinkAttachmentConnectionAws']]:
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azure(self) -> pulumi.Output[Optional['outputs.PrivateLinkAttachmentConnectionAzure']]:
        return pulumi.get(self, "azure")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Private Link Attachment Connection.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.PrivateLinkAttachmentConnectionEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcp(self) -> pulumi.Output[Optional['outputs.PrivateLinkAttachmentConnectionGcp']]:
        return pulumi.get(self, "gcp")

    @property
    @pulumi.getter(name="privateLinkAttachment")
    def private_link_attachment(self) -> pulumi.Output['outputs.PrivateLinkAttachmentConnectionPrivateLinkAttachment']:
        """
        The private_link_attachment to which this belongs.
        """
        return pulumi.get(self, "private_link_attachment")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        """
        return pulumi.get(self, "resource_name")

