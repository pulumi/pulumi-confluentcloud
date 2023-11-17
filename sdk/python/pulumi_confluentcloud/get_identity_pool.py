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
    'GetIdentityPoolResult',
    'AwaitableGetIdentityPoolResult',
    'get_identity_pool',
    'get_identity_pool_output',
]

@pulumi.output_type
class GetIdentityPoolResult:
    """
    A collection of values returned by getIdentityPool.
    """
    def __init__(__self__, description=None, display_name=None, filter=None, id=None, identity_claim=None, identity_provider=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_claim and not isinstance(identity_claim, str):
            raise TypeError("Expected argument 'identity_claim' to be a str")
        pulumi.set(__self__, "identity_claim", identity_claim)
        if identity_provider and not isinstance(identity_provider, dict):
            raise TypeError("Expected argument 'identity_provider' to be a dict")
        pulumi.set(__self__, "identity_provider", identity_provider)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Required String) A description for the Identity Pool.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Identity Pool.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def filter(self) -> str:
        """
        (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityClaim")
    def identity_claim(self) -> str:
        """
        (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
        """
        return pulumi.get(self, "identity_claim")

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> 'outputs.GetIdentityPoolIdentityProviderResult':
        """
        (Required Configuration Block) supports the following:
        """
        return pulumi.get(self, "identity_provider")


class AwaitableGetIdentityPoolResult(GetIdentityPoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIdentityPoolResult(
            description=self.description,
            display_name=self.display_name,
            filter=self.filter,
            id=self.id,
            identity_claim=self.identity_claim,
            identity_provider=self.identity_provider)


def get_identity_pool(display_name: Optional[str] = None,
                      id: Optional[str] = None,
                      identity_provider: Optional[pulumi.InputType['GetIdentityPoolIdentityProviderArgs']] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIdentityPoolResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `IdentityPool` describes an Identity Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_identity_pool = confluentcloud.get_identity_pool(id="pool-xyz456",
        identity_provider=confluentcloud.GetIdentityPoolIdentityProviderArgs(
            id="op-abc123",
        ))
    pulumi.export("exampleUsingId", example_using_id_identity_pool)
    example_using_name_identity_pool = confluentcloud.get_identity_pool(display_name="My Identity Pool",
        identity_provider=confluentcloud.GetIdentityPoolIdentityProviderArgs(
            id="op-abc123",
        ))
    pulumi.export("exampleUsingName", example_using_name_identity_pool)
    ```


    :param str display_name: A human-readable name for the Identity Pool.
    :param str id: The ID of the Identity Pool, for example, `pool-xyz456`.
    :param pulumi.InputType['GetIdentityPoolIdentityProviderArgs'] identity_provider: (Required Configuration Block) supports the following:
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    __args__['identityProvider'] = identity_provider
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getIdentityPool:getIdentityPool', __args__, opts=opts, typ=GetIdentityPoolResult).value

    return AwaitableGetIdentityPoolResult(
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        identity_claim=pulumi.get(__ret__, 'identity_claim'),
        identity_provider=pulumi.get(__ret__, 'identity_provider'))


@_utilities.lift_output_func(get_identity_pool)
def get_identity_pool_output(display_name: Optional[pulumi.Input[Optional[str]]] = None,
                             id: Optional[pulumi.Input[Optional[str]]] = None,
                             identity_provider: Optional[pulumi.Input[pulumi.InputType['GetIdentityPoolIdentityProviderArgs']]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIdentityPoolResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `IdentityPool` describes an Identity Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id_identity_pool = confluentcloud.get_identity_pool(id="pool-xyz456",
        identity_provider=confluentcloud.GetIdentityPoolIdentityProviderArgs(
            id="op-abc123",
        ))
    pulumi.export("exampleUsingId", example_using_id_identity_pool)
    example_using_name_identity_pool = confluentcloud.get_identity_pool(display_name="My Identity Pool",
        identity_provider=confluentcloud.GetIdentityPoolIdentityProviderArgs(
            id="op-abc123",
        ))
    pulumi.export("exampleUsingName", example_using_name_identity_pool)
    ```


    :param str display_name: A human-readable name for the Identity Pool.
    :param str id: The ID of the Identity Pool, for example, `pool-xyz456`.
    :param pulumi.InputType['GetIdentityPoolIdentityProviderArgs'] identity_provider: (Required Configuration Block) supports the following:
    """
    ...
