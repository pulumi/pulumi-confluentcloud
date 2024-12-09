# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'GetCertificatePoolResult',
    'AwaitableGetCertificatePoolResult',
    'get_certificate_pool',
    'get_certificate_pool_output',
]

@pulumi.output_type
class GetCertificatePoolResult:
    """
    A collection of values returned by getCertificatePool.
    """
    def __init__(__self__, certificate_authority=None, description=None, display_name=None, external_identifier=None, filter=None, id=None):
        if certificate_authority and not isinstance(certificate_authority, dict):
            raise TypeError("Expected argument 'certificate_authority' to be a dict")
        pulumi.set(__self__, "certificate_authority", certificate_authority)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if external_identifier and not isinstance(external_identifier, str):
            raise TypeError("Expected argument 'external_identifier' to be a str")
        pulumi.set(__self__, "external_identifier", external_identifier)
        if filter and not isinstance(filter, str):
            raise TypeError("Expected argument 'filter' to be a str")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="certificateAuthority")
    def certificate_authority(self) -> 'outputs.GetCertificatePoolCertificateAuthorityResult':
        return pulumi.get(self, "certificate_authority")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Required String) A description of the Certificate Pool.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Certificate Pool.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="externalIdentifier")
    def external_identifier(self) -> str:
        """
        (Required String) The certificate field that will be used to represent the pool's external identity for audit logging, for example, `UID`.
        """
        return pulumi.get(self, "external_identifier")

    @property
    @pulumi.getter
    def filter(self) -> str:
        """
        (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")


class AwaitableGetCertificatePoolResult(GetCertificatePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificatePoolResult(
            certificate_authority=self.certificate_authority,
            description=self.description,
            display_name=self.display_name,
            external_identifier=self.external_identifier,
            filter=self.filter,
            id=self.id)


def get_certificate_pool(certificate_authority: Optional[Union['GetCertificatePoolCertificateAuthorityArgs', 'GetCertificatePoolCertificateAuthorityArgsDict']] = None,
                         id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificatePoolResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `CertificatePool` describes a Certificate Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_certificate_pool(id="pool-def456",
        certificate_authority={
            "id": "op-abc123",
        })
    pulumi.export("certificatePool", main)
    ```


    :param str id: The ID of the Certificate Pool, for example, `pool-abc123`.
    """
    __args__ = dict()
    __args__['certificateAuthority'] = certificate_authority
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getCertificatePool:getCertificatePool', __args__, opts=opts, typ=GetCertificatePoolResult).value

    return AwaitableGetCertificatePoolResult(
        certificate_authority=pulumi.get(__ret__, 'certificate_authority'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        external_identifier=pulumi.get(__ret__, 'external_identifier'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'))
def get_certificate_pool_output(certificate_authority: Optional[pulumi.Input[Union['GetCertificatePoolCertificateAuthorityArgs', 'GetCertificatePoolCertificateAuthorityArgsDict']]] = None,
                                id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCertificatePoolResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `CertificatePool` describes a Certificate Pool data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_certificate_pool(id="pool-def456",
        certificate_authority={
            "id": "op-abc123",
        })
    pulumi.export("certificatePool", main)
    ```


    :param str id: The ID of the Certificate Pool, for example, `pool-abc123`.
    """
    __args__ = dict()
    __args__['certificateAuthority'] = certificate_authority
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getCertificatePool:getCertificatePool', __args__, opts=opts, typ=GetCertificatePoolResult)
    return __ret__.apply(lambda __response__: GetCertificatePoolResult(
        certificate_authority=pulumi.get(__response__, 'certificate_authority'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        external_identifier=pulumi.get(__response__, 'external_identifier'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id')))