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

__all__ = [
    'GetProviderIntegrationResult',
    'AwaitableGetProviderIntegrationResult',
    'get_provider_integration',
    'get_provider_integration_output',
]

@pulumi.output_type
class GetProviderIntegrationResult:
    """
    A collection of values returned by getProviderIntegration.
    """
    def __init__(__self__, aws=None, display_name=None, environment=None, id=None, usages=None):
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
        if usages and not isinstance(usages, list):
            raise TypeError("Expected argument 'usages' to be a list")
        pulumi.set(__self__, "usages", usages)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetProviderIntegrationAwResult']:
        """
        (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        """
        (Required String) A human-readable name for the Provider Integration.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetProviderIntegrationEnvironmentResult':
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        (Required String) The ID of the Environment that the Provider Integration belongs to, for example, `env-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def usages(self) -> Sequence[builtins.str]:
        """
        (Required List of Strings) List of resource CRNs where this provider integration is being used.
        """
        return pulumi.get(self, "usages")


class AwaitableGetProviderIntegrationResult(GetProviderIntegrationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProviderIntegrationResult(
            aws=self.aws,
            display_name=self.display_name,
            environment=self.environment,
            id=self.id,
            usages=self.usages)


def get_provider_integration(display_name: Optional[builtins.str] = None,
                             environment: Optional[Union['GetProviderIntegrationEnvironmentArgs', 'GetProviderIntegrationEnvironmentArgsDict']] = None,
                             id: Optional[builtins.str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProviderIntegrationResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `ProviderIntegration` describes a Confluent Provider Integration data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_provider_integration(id="cspi-4xg0q",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_provider_integration(display_name="provider_integration_main",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```

    ## Getting Started

    The following end-to-end examples might help to get started with `ProviderIntegration` data source:
    * s3-sink-connector-assume-role: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration


    :param builtins.str display_name: A human-readable name for the Provider Integration.
    :param Union['GetProviderIntegrationEnvironmentArgs', 'GetProviderIntegrationEnvironmentArgsDict'] environment: (Required Configuration Block) supports the following:
    :param builtins.str id: The ID of the Provider Integration, for example, `cspi-4xg0q`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getProviderIntegration:getProviderIntegration', __args__, opts=opts, typ=GetProviderIntegrationResult).value

    return AwaitableGetProviderIntegrationResult(
        aws=pulumi.get(__ret__, 'aws'),
        display_name=pulumi.get(__ret__, 'display_name'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        usages=pulumi.get(__ret__, 'usages'))
def get_provider_integration_output(display_name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                    environment: Optional[pulumi.Input[Union['GetProviderIntegrationEnvironmentArgs', 'GetProviderIntegrationEnvironmentArgsDict']]] = None,
                                    id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetProviderIntegrationResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `ProviderIntegration` describes a Confluent Provider Integration data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_provider_integration(id="cspi-4xg0q",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_provider_integration(display_name="provider_integration_main",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```

    ## Getting Started

    The following end-to-end examples might help to get started with `ProviderIntegration` data source:
    * s3-sink-connector-assume-role: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration


    :param builtins.str display_name: A human-readable name for the Provider Integration.
    :param Union['GetProviderIntegrationEnvironmentArgs', 'GetProviderIntegrationEnvironmentArgsDict'] environment: (Required Configuration Block) supports the following:
    :param builtins.str id: The ID of the Provider Integration, for example, `cspi-4xg0q`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getProviderIntegration:getProviderIntegration', __args__, opts=opts, typ=GetProviderIntegrationResult)
    return __ret__.apply(lambda __response__: GetProviderIntegrationResult(
        aws=pulumi.get(__response__, 'aws'),
        display_name=pulumi.get(__response__, 'display_name'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id'),
        usages=pulumi.get(__response__, 'usages')))
