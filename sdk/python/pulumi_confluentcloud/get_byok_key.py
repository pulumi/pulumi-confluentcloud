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

__all__ = [
    'GetByokKeyResult',
    'AwaitableGetByokKeyResult',
    'get_byok_key',
    'get_byok_key_output',
]

@pulumi.output_type
class GetByokKeyResult:
    """
    A collection of values returned by getByokKey.
    """
    def __init__(__self__, aws=None, azures=None, id=None):
        if aws and not isinstance(aws, list):
            raise TypeError("Expected argument 'aws' to be a list")
        pulumi.set(__self__, "aws", aws)
        if azures and not isinstance(azures, list):
            raise TypeError("Expected argument 'azures' to be a list")
        pulumi.set(__self__, "azures", azures)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def aws(self) -> Sequence['outputs.GetByokKeyAwResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter
    def azures(self) -> Sequence['outputs.GetByokKeyAzureResult']:
        """
        (Optional Configuration Block) supports the following:
        """
        return pulumi.get(self, "azures")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the BYOK key, for example, `cck-abcde`.
        """
        return pulumi.get(self, "id")


class AwaitableGetByokKeyResult(GetByokKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetByokKeyResult(
            aws=self.aws,
            azures=self.azures,
            id=self.id)


def get_byok_key(id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetByokKeyResult:
    """
    [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    > **Note:** `ByokKey` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.

    `ByokKey` describes a BYOK Key data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    azure_key = confluentcloud.get_byok_key(id="cck-abcde")
    pulumi.export("byok", azure_key)
    ```


    :param str id: The ID of the BYOK key, for example, `cck-abcde`.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getByokKey:getByokKey', __args__, opts=opts, typ=GetByokKeyResult).value

    return AwaitableGetByokKeyResult(
        aws=__ret__.aws,
        azures=__ret__.azures,
        id=__ret__.id)


@_utilities.lift_output_func(get_byok_key)
def get_byok_key_output(id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetByokKeyResult]:
    """
    [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    > **Note:** `ByokKey` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\\
    **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.

    `ByokKey` describes a BYOK Key data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    azure_key = confluentcloud.get_byok_key(id="cck-abcde")
    pulumi.export("byok", azure_key)
    ```


    :param str id: The ID of the BYOK key, for example, `cck-abcde`.
    """
    ...
