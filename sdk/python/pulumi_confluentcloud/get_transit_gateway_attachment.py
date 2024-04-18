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
    'GetTransitGatewayAttachmentResult',
    'AwaitableGetTransitGatewayAttachmentResult',
    'get_transit_gateway_attachment',
    'get_transit_gateway_attachment_output',
]

@pulumi.output_type
class GetTransitGatewayAttachmentResult:
    """
    A collection of values returned by getTransitGatewayAttachment.
    """
    def __init__(__self__, aws=None, display_name=None, environment=None, id=None, networks=None):
        if aws and not isinstance(aws, list):
            raise TypeError("Expected argument 'aws' to be a list")
        pulumi.set(__self__, "aws", aws)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetTransitGatewayAttachmentAwResult']:
        """
        (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) The name of the Transit Gateway Attachment.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetTransitGatewayAttachmentEnvironmentResult':
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetTransitGatewayAttachmentNetworkResult']:
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "networks")


class AwaitableGetTransitGatewayAttachmentResult(GetTransitGatewayAttachmentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitGatewayAttachmentResult(
            aws=self.aws,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            networks=self.networks)


def get_transit_gateway_attachment(display_name: Optional[str] = None,
                                   environment: Optional[pulumi.InputType['GetTransitGatewayAttachmentEnvironmentArgs']] = None,
                                   id: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitGatewayAttachmentResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `TransitGatewayAttachment` describes a Transit Gateway Attachment data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_transit_gateway_attachment(id="tgwa-abc123",
        environment=confluentcloud.GetTransitGatewayAttachmentEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_transit_gateway_attachment(display_name="my_tgwa",
        environment=confluentcloud.GetTransitGatewayAttachmentEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name)
    ```
    <!--End PulumiCodeChooser -->


    :param str display_name: A human-readable name for the Transit Gateway Attachment.
    :param pulumi.InputType['GetTransitGatewayAttachmentEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment', __args__, opts=opts, typ=GetTransitGatewayAttachmentResult).value

    return AwaitableGetTransitGatewayAttachmentResult(
        aws=pulumi.get(__ret__, 'aws'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        networks=pulumi.get(__ret__, 'networks'))


@_utilities.lift_output_func(get_transit_gateway_attachment)
def get_transit_gateway_attachment_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                                          environment: Optional[pulumi.Input[pulumi.InputType['GetTransitGatewayAttachmentEnvironmentArgs']]] = None,
                                          id: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTransitGatewayAttachmentResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `TransitGatewayAttachment` describes a Transit Gateway Attachment data source.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_transit_gateway_attachment(id="tgwa-abc123",
        environment=confluentcloud.GetTransitGatewayAttachmentEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_transit_gateway_attachment(display_name="my_tgwa",
        environment=confluentcloud.GetTransitGatewayAttachmentEnvironmentArgs(
            id="env-xyz456",
        ))
    pulumi.export("exampleUsingName", example_using_name)
    ```
    <!--End PulumiCodeChooser -->


    :param str display_name: A human-readable name for the Transit Gateway Attachment.
    :param pulumi.InputType['GetTransitGatewayAttachmentEnvironmentArgs'] environment: (Required Configuration Block) supports the following:
    :param str id: The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    ...
