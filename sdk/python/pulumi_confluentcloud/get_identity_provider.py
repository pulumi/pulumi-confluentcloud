# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = [
    'GetIdentityProviderResult',
    'AwaitableGetIdentityProviderResult',
    'get_identity_provider',
    'get_identity_provider_output',
]

@pulumi.output_type
class GetIdentityProviderResult:
    """
    A collection of values returned by getIdentityProvider.
    """
    def __init__(__self__, description=None, display_name=None, id=None, identity_claim=None, issuer=None, jwks_uri=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_claim and not isinstance(identity_claim, str):
            raise TypeError("Expected argument 'identity_claim' to be a str")
        pulumi.set(__self__, "identity_claim", identity_claim)
        if issuer and not isinstance(issuer, str):
            raise TypeError("Expected argument 'issuer' to be a str")
        pulumi.set(__self__, "issuer", issuer)
        if jwks_uri and not isinstance(jwks_uri, str):
            raise TypeError("Expected argument 'jwks_uri' to be a str")
        pulumi.set(__self__, "jwks_uri", jwks_uri)

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        (Required String) A description for the Identity Provider.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        """
        (Required String) A human-readable name for the Identity Provider.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        (Required String) The ID of the Identity Provider, for example, `op-abc123`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityClaim")
    def identity_claim(self) -> builtins.str:
        """
        (Optional String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
        """
        return pulumi.get(self, "identity_claim")

    @property
    @pulumi.getter
    def issuer(self) -> builtins.str:
        """
        (Required String) A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="jwksUri")
    def jwks_uri(self) -> builtins.str:
        """
        (Required String) A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
        """
        return pulumi.get(self, "jwks_uri")


class AwaitableGetIdentityProviderResult(GetIdentityProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIdentityProviderResult(
            description=self.description,
            display_name=self.display_name,
            id=self.id,
            identity_claim=self.identity_claim,
            issuer=self.issuer,
            jwks_uri=self.jwks_uri)


def get_identity_provider(display_name: Optional[builtins.str] = None,
                          id: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIdentityProviderResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `IdentityProvider` describes an Identity Provider data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_identity_provider(id="op-abc123")
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_identity_provider(display_name="My OIDC Provider: Azure AD")
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param builtins.str display_name: A human-readable name for the Identity Provider.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param builtins.str id: The ID of the Identity Provider, for example, `op-abc123`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getIdentityProvider:getIdentityProvider', __args__, opts=opts, typ=GetIdentityProviderResult).value

    return AwaitableGetIdentityProviderResult(
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        id=pulumi.get(__ret__, 'id'),
        identity_claim=pulumi.get(__ret__, 'identity_claim'),
        issuer=pulumi.get(__ret__, 'issuer'),
        jwks_uri=pulumi.get(__ret__, 'jwks_uri'))
def get_identity_provider_output(display_name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIdentityProviderResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `IdentityProvider` describes an Identity Provider data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_identity_provider(id="op-abc123")
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_identity_provider(display_name="My OIDC Provider: Azure AD")
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param builtins.str display_name: A human-readable name for the Identity Provider.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    :param builtins.str id: The ID of the Identity Provider, for example, `op-abc123`.
    """
    __args__ = dict()
    __args__['displayName'] = display_name
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getIdentityProvider:getIdentityProvider', __args__, opts=opts, typ=GetIdentityProviderResult)
    return __ret__.apply(lambda __response__: GetIdentityProviderResult(
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        id=pulumi.get(__response__, 'id'),
        identity_claim=pulumi.get(__response__, 'identity_claim'),
        issuer=pulumi.get(__response__, 'issuer'),
        jwks_uri=pulumi.get(__response__, 'jwks_uri')))
