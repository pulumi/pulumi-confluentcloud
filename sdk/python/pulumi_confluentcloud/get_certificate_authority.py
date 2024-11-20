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

__all__ = [
    'GetCertificateAuthorityResult',
    'AwaitableGetCertificateAuthorityResult',
    'get_certificate_authority',
    'get_certificate_authority_output',
]

@pulumi.output_type
class GetCertificateAuthorityResult:
    """
    A collection of values returned by getCertificateAuthority.
    """
    def __init__(__self__, certificate_chain_filename=None, crl_source=None, crl_updated_at=None, crl_url=None, description=None, display_name=None, expiration_dates=None, fingerprints=None, id=None, serial_numbers=None):
        if certificate_chain_filename and not isinstance(certificate_chain_filename, str):
            raise TypeError("Expected argument 'certificate_chain_filename' to be a str")
        pulumi.set(__self__, "certificate_chain_filename", certificate_chain_filename)
        if crl_source and not isinstance(crl_source, str):
            raise TypeError("Expected argument 'crl_source' to be a str")
        pulumi.set(__self__, "crl_source", crl_source)
        if crl_updated_at and not isinstance(crl_updated_at, str):
            raise TypeError("Expected argument 'crl_updated_at' to be a str")
        pulumi.set(__self__, "crl_updated_at", crl_updated_at)
        if crl_url and not isinstance(crl_url, str):
            raise TypeError("Expected argument 'crl_url' to be a str")
        pulumi.set(__self__, "crl_url", crl_url)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if expiration_dates and not isinstance(expiration_dates, list):
            raise TypeError("Expected argument 'expiration_dates' to be a list")
        pulumi.set(__self__, "expiration_dates", expiration_dates)
        if fingerprints and not isinstance(fingerprints, list):
            raise TypeError("Expected argument 'fingerprints' to be a list")
        pulumi.set(__self__, "fingerprints", fingerprints)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if serial_numbers and not isinstance(serial_numbers, list):
            raise TypeError("Expected argument 'serial_numbers' to be a list")
        pulumi.set(__self__, "serial_numbers", serial_numbers)

    @property
    @pulumi.getter(name="certificateChainFilename")
    def certificate_chain_filename(self) -> str:
        """
        (Required String) The name of the certificate file, for example, `certificate.pem`.
        """
        return pulumi.get(self, "certificate_chain_filename")

    @property
    @pulumi.getter(name="crlSource")
    def crl_source(self) -> str:
        """
        (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
        """
        return pulumi.get(self, "crl_source")

    @property
    @pulumi.getter(name="crlUpdatedAt")
    def crl_updated_at(self) -> str:
        """
        (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
        """
        return pulumi.get(self, "crl_updated_at")

    @property
    @pulumi.getter(name="crlUrl")
    def crl_url(self) -> str:
        """
        (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
        """
        return pulumi.get(self, "crl_url")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (Required String) A description for the Certificate Authority.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        (Required String) A human-readable name for the Certificate Authority.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="expirationDates")
    def expiration_dates(self) -> Sequence[str]:
        """
        (Required List of Strings) The expiration dates of certificates in the chain, for example, `["2017-07-21T17:32:28Z"]`.
        """
        return pulumi.get(self, "expiration_dates")

    @property
    @pulumi.getter
    def fingerprints(self) -> Sequence[str]:
        """
        (Required List of Strings) The fingerprints for each certificate in the certificate chain, for example, `["B1BC968BD4f49D622AA89A81F2150152A41D829C"]`.
        """
        return pulumi.get(self, "fingerprints")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="serialNumbers")
    def serial_numbers(self) -> Sequence[str]:
        """
        (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        """
        return pulumi.get(self, "serial_numbers")


class AwaitableGetCertificateAuthorityResult(GetCertificateAuthorityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificateAuthorityResult(
            certificate_chain_filename=self.certificate_chain_filename,
            crl_source=self.crl_source,
            crl_updated_at=self.crl_updated_at,
            crl_url=self.crl_url,
            description=self.description,
            display_name=self.display_name,
            expiration_dates=self.expiration_dates,
            fingerprints=self.fingerprints,
            id=self.id,
            serial_numbers=self.serial_numbers)


def get_certificate_authority(crl_source: Optional[str] = None,
                              crl_updated_at: Optional[str] = None,
                              crl_url: Optional[str] = None,
                              id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificateAuthorityResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `CertificateAuthority` describes a Certificate Authority data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_certificate_authority(id="op-abc123")
    pulumi.export("certificateAuthority", main)
    ```


    :param str crl_source: (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
    :param str crl_updated_at: (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
    :param str crl_url: (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
    :param str id: The ID of the Certificate Authority, for example, `op-abc123`.
    """
    __args__ = dict()
    __args__['crlSource'] = crl_source
    __args__['crlUpdatedAt'] = crl_updated_at
    __args__['crlUrl'] = crl_url
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getCertificateAuthority:getCertificateAuthority', __args__, opts=opts, typ=GetCertificateAuthorityResult).value

    return AwaitableGetCertificateAuthorityResult(
        certificate_chain_filename=pulumi.get(__ret__, 'certificate_chain_filename'),
        crl_source=pulumi.get(__ret__, 'crl_source'),
        crl_updated_at=pulumi.get(__ret__, 'crl_updated_at'),
        crl_url=pulumi.get(__ret__, 'crl_url'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        expiration_dates=pulumi.get(__ret__, 'expiration_dates'),
        fingerprints=pulumi.get(__ret__, 'fingerprints'),
        id=pulumi.get(__ret__, 'id'),
        serial_numbers=pulumi.get(__ret__, 'serial_numbers'))
def get_certificate_authority_output(crl_source: Optional[pulumi.Input[Optional[str]]] = None,
                                     crl_updated_at: Optional[pulumi.Input[Optional[str]]] = None,
                                     crl_url: Optional[pulumi.Input[Optional[str]]] = None,
                                     id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCertificateAuthorityResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `CertificateAuthority` describes a Certificate Authority data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    main = confluentcloud.get_certificate_authority(id="op-abc123")
    pulumi.export("certificateAuthority", main)
    ```


    :param str crl_source: (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
    :param str crl_updated_at: (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
    :param str crl_url: (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
    :param str id: The ID of the Certificate Authority, for example, `op-abc123`.
    """
    __args__ = dict()
    __args__['crlSource'] = crl_source
    __args__['crlUpdatedAt'] = crl_updated_at
    __args__['crlUrl'] = crl_url
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getCertificateAuthority:getCertificateAuthority', __args__, opts=opts, typ=GetCertificateAuthorityResult)
    return __ret__.apply(lambda __response__: GetCertificateAuthorityResult(
        certificate_chain_filename=pulumi.get(__response__, 'certificate_chain_filename'),
        crl_source=pulumi.get(__response__, 'crl_source'),
        crl_updated_at=pulumi.get(__response__, 'crl_updated_at'),
        crl_url=pulumi.get(__response__, 'crl_url'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        expiration_dates=pulumi.get(__response__, 'expiration_dates'),
        fingerprints=pulumi.get(__response__, 'fingerprints'),
        id=pulumi.get(__response__, 'id'),
        serial_numbers=pulumi.get(__response__, 'serial_numbers')))
