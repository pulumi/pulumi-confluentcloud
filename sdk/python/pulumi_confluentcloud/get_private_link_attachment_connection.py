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

__all__ = [
    'GetPrivateLinkAttachmentConnectionResult',
    'AwaitableGetPrivateLinkAttachmentConnectionResult',
    'get_private_link_attachment_connection',
    'get_private_link_attachment_connection_output',
]

@pulumi.output_type
class GetPrivateLinkAttachmentConnectionResult:
    """
    A collection of values returned by getPrivateLinkAttachmentConnection.
    """
    def __init__(__self__, aws=None, azures=None, display_name=None, environment=None, gcps=None, id=None, private_link_attachments=None, resource_name=None):
        if aws and not isinstance(aws, list):
            raise TypeError("Expected argument 'aws' to be a list")
        pulumi.set(__self__, "aws", aws)
        if azures and not isinstance(azures, list):
            raise TypeError("Expected argument 'azures' to be a list")
        pulumi.set(__self__, "azures", azures)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if gcps and not isinstance(gcps, list):
            raise TypeError("Expected argument 'gcps' to be a list")
        pulumi.set(__self__, "gcps", gcps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if private_link_attachments and not isinstance(private_link_attachments, list):
            raise TypeError("Expected argument 'private_link_attachments' to be a list")
        pulumi.set(__self__, "private_link_attachments", private_link_attachments)
        if resource_name and not isinstance(resource_name, str):
            raise TypeError("Expected argument 'resource_name' to be a str")
        pulumi.set(__self__, "resource_name", resource_name)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetPrivateLinkAttachmentConnectionAwResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> Sequence['outputs.GetPrivateLinkAttachmentConnectionAzureResult']:
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Optional String) The name of the Private Link Attachment Connection.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetPrivateLinkAttachmentConnectionEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def gcps(self) -> Sequence['outputs.GetPrivateLinkAttachmentConnectionGcpResult']:
        return pulumi.get(self, "gcps")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The unique identifier for the private link attachment.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="privateLinkAttachments")
    def private_link_attachments(self) -> Sequence['outputs.GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "private_link_attachments")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> str:
        """
        (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        """
        return pulumi.get(self, "resource_name")


class AwaitableGetPrivateLinkAttachmentConnectionResult(GetPrivateLinkAttachmentConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateLinkAttachmentConnectionResult(
            aws=self.aws,
            azures=self.azures,
            display_name=self.display_name,
            environment=self.environment,
            gcps=self.gcps,
            id=self.id,
            private_link_attachments=self.private_link_attachments,
            resource_name=self.resource_name)


def get_private_link_attachment_connection(environment: Optional[pulumi.InputType['GetPrivateLinkAttachmentConnectionEnvironmentArgs']] = None,
                                           id: Optional[str] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateLinkAttachmentConnectionResult:
    """
    [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    [![Request Access To Networking v1](https://img.shields.io/badge/-Request%20Access%20To%20Networking%20v1-%23bc8540)](mailto:ccloud-api-access+networking-v1-limited-availability@confluent.io?subject=Request%20to%20join%20networking/v1%20API%20Limited%20Availability&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Limited%20Availability%20for%20networking/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)

    > **Note:** `PrivateLinkAttachmentConnection` data source is available in **Limited Availability** for early adopters. Limited Availability features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Limited Availability** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Limited Availability features. Limited Availability features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Limited Availability releases of the Limited Availability features at any time in Confluent’s sole discretion.

    `PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_private_link_attachment_connection(id="plattc-p5j3ov",
        environment=confluentcloud.GetPrivateLinkAttachmentConnectionEnvironmentArgs(
            id="env-8gv0v5",
        ))
    pulumi.export("plattc", main)
    ```


    :param str id: The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
    """
    __args__ = dict()
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getPrivateLinkAttachmentConnection:getPrivateLinkAttachmentConnection', __args__, opts=opts, typ=GetPrivateLinkAttachmentConnectionResult).value

    return AwaitableGetPrivateLinkAttachmentConnectionResult(
        aws=pulumi.get(__ret__, 'aws'),
        azures=pulumi.get(__ret__, 'azures'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        gcps=pulumi.get(__ret__, 'gcps'),
        id=pulumi.get(__ret__, 'id'),
        private_link_attachments=pulumi.get(__ret__, 'private_link_attachments'),
        resource_name=pulumi.get(__ret__, 'resource_name'))


@_utilities.lift_output_func(get_private_link_attachment_connection)
def get_private_link_attachment_connection_output(environment: Optional[pulumi.Input[pulumi.InputType['GetPrivateLinkAttachmentConnectionEnvironmentArgs']]] = None,
                                                  id: Optional[pulumi.Input[str]] = None,
                                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivateLinkAttachmentConnectionResult]:
    """
    [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    [![Request Access To Networking v1](https://img.shields.io/badge/-Request%20Access%20To%20Networking%20v1-%23bc8540)](mailto:ccloud-api-access+networking-v1-limited-availability@confluent.io?subject=Request%20to%20join%20networking/v1%20API%20Limited%20Availability&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Limited%20Availability%20for%20networking/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)

    > **Note:** `PrivateLinkAttachmentConnection` data source is available in **Limited Availability** for early adopters. Limited Availability features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Limited Availability** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Limited Availability features. Limited Availability features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Limited Availability releases of the Limited Availability features at any time in Confluent’s sole discretion.

    `PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_private_link_attachment_connection(id="plattc-p5j3ov",
        environment=confluentcloud.GetPrivateLinkAttachmentConnectionEnvironmentArgs(
            id="env-8gv0v5",
        ))
    pulumi.export("plattc", main)
    ```


    :param str id: The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
    """
    ...