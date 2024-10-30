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

__all__ = ['CertificateAuthorityArgs', 'CertificateAuthority']

@pulumi.input_type
class CertificateAuthorityArgs:
    def __init__(__self__, *,
                 certificate_chain: pulumi.Input[str],
                 certificate_chain_filename: pulumi.Input[str],
                 description: pulumi.Input[str],
                 display_name: pulumi.Input[str],
                 crl_chain: Optional[pulumi.Input[str]] = None,
                 crl_url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CertificateAuthority resource.
        :param pulumi.Input[str] certificate_chain: A base64 encoded string containing the signing certificate chain.
        :param pulumi.Input[str] certificate_chain_filename: The name of the certificate file.
        :param pulumi.Input[str] description: A description of the Certificate Authority.
        :param pulumi.Input[str] display_name: The name of the Certificate Authority.
        :param pulumi.Input[str] crl_chain: A base64 encoded string containing the CRL for this certificate authority.
        :param pulumi.Input[str] crl_url: The url from which to fetch the CRL for the certificate authority.
        """
        pulumi.set(__self__, "certificate_chain", certificate_chain)
        pulumi.set(__self__, "certificate_chain_filename", certificate_chain_filename)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "display_name", display_name)
        if crl_chain is not None:
            pulumi.set(__self__, "crl_chain", crl_chain)
        if crl_url is not None:
            pulumi.set(__self__, "crl_url", crl_url)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Input[str]:
        """
        A base64 encoded string containing the signing certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter(name="certificateChainFilename")
    def certificate_chain_filename(self) -> pulumi.Input[str]:
        """
        The name of the certificate file.
        """
        return pulumi.get(self, "certificate_chain_filename")

    @certificate_chain_filename.setter
    def certificate_chain_filename(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_chain_filename", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        A description of the Certificate Authority.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The name of the Certificate Authority.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="crlChain")
    def crl_chain(self) -> Optional[pulumi.Input[str]]:
        """
        A base64 encoded string containing the CRL for this certificate authority.
        """
        return pulumi.get(self, "crl_chain")

    @crl_chain.setter
    def crl_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_chain", value)

    @property
    @pulumi.getter(name="crlUrl")
    def crl_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url from which to fetch the CRL for the certificate authority.
        """
        return pulumi.get(self, "crl_url")

    @crl_url.setter
    def crl_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_url", value)


@pulumi.input_type
class _CertificateAuthorityState:
    def __init__(__self__, *,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 certificate_chain_filename: Optional[pulumi.Input[str]] = None,
                 crl_chain: Optional[pulumi.Input[str]] = None,
                 crl_source: Optional[pulumi.Input[str]] = None,
                 crl_updated_at: Optional[pulumi.Input[str]] = None,
                 crl_url: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 expiration_dates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 serial_numbers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering CertificateAuthority resources.
        :param pulumi.Input[str] certificate_chain: A base64 encoded string containing the signing certificate chain.
        :param pulumi.Input[str] certificate_chain_filename: The name of the certificate file.
        :param pulumi.Input[str] crl_chain: A base64 encoded string containing the CRL for this certificate authority.
        :param pulumi.Input[str] crl_source: (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        :param pulumi.Input[str] crl_updated_at: (Optional String) The timestamp for when CRL was last updated.
        :param pulumi.Input[str] crl_url: The url from which to fetch the CRL for the certificate authority.
        :param pulumi.Input[str] description: A description of the Certificate Authority.
        :param pulumi.Input[str] display_name: The name of the Certificate Authority.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] expiration_dates: (Required List of Strings) The expiration dates of certificates in the chain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] serial_numbers: (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        """
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if certificate_chain_filename is not None:
            pulumi.set(__self__, "certificate_chain_filename", certificate_chain_filename)
        if crl_chain is not None:
            pulumi.set(__self__, "crl_chain", crl_chain)
        if crl_source is not None:
            pulumi.set(__self__, "crl_source", crl_source)
        if crl_updated_at is not None:
            pulumi.set(__self__, "crl_updated_at", crl_updated_at)
        if crl_url is not None:
            pulumi.set(__self__, "crl_url", crl_url)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if expiration_dates is not None:
            pulumi.set(__self__, "expiration_dates", expiration_dates)
        if fingerprints is not None:
            pulumi.set(__self__, "fingerprints", fingerprints)
        if serial_numbers is not None:
            pulumi.set(__self__, "serial_numbers", serial_numbers)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        A base64 encoded string containing the signing certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter(name="certificateChainFilename")
    def certificate_chain_filename(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the certificate file.
        """
        return pulumi.get(self, "certificate_chain_filename")

    @certificate_chain_filename.setter
    def certificate_chain_filename(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain_filename", value)

    @property
    @pulumi.getter(name="crlChain")
    def crl_chain(self) -> Optional[pulumi.Input[str]]:
        """
        A base64 encoded string containing the CRL for this certificate authority.
        """
        return pulumi.get(self, "crl_chain")

    @crl_chain.setter
    def crl_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_chain", value)

    @property
    @pulumi.getter(name="crlSource")
    def crl_source(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        """
        return pulumi.get(self, "crl_source")

    @crl_source.setter
    def crl_source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_source", value)

    @property
    @pulumi.getter(name="crlUpdatedAt")
    def crl_updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) The timestamp for when CRL was last updated.
        """
        return pulumi.get(self, "crl_updated_at")

    @crl_updated_at.setter
    def crl_updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_updated_at", value)

    @property
    @pulumi.getter(name="crlUrl")
    def crl_url(self) -> Optional[pulumi.Input[str]]:
        """
        The url from which to fetch the CRL for the certificate authority.
        """
        return pulumi.get(self, "crl_url")

    @crl_url.setter
    def crl_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "crl_url", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the Certificate Authority.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Certificate Authority.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="expirationDates")
    def expiration_dates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Required List of Strings) The expiration dates of certificates in the chain.
        """
        return pulumi.get(self, "expiration_dates")

    @expiration_dates.setter
    def expiration_dates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "expiration_dates", value)

    @property
    @pulumi.getter
    def fingerprints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        """
        return pulumi.get(self, "fingerprints")

    @fingerprints.setter
    def fingerprints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "fingerprints", value)

    @property
    @pulumi.getter(name="serialNumbers")
    def serial_numbers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        """
        return pulumi.get(self, "serial_numbers")

    @serial_numbers.setter
    def serial_numbers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "serial_numbers", value)


class CertificateAuthority(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 certificate_chain_filename: Optional[pulumi.Input[str]] = None,
                 crl_chain: Optional[pulumi.Input[str]] = None,
                 crl_url: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `CertificateAuthority` provides a Certificate Authority resource that enables creating, editing, and deleting Certificate Authorities on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.CertificateAuthority("main",
            display_name="my_certificate_authority",
            description="description",
            certificate_chain_filename="certificate.pem",
            certificate_chain="***REDACTED***")
        ```

        ## Import

        You can import a Certificate Authority by using Certificate Authority ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/certificateAuthority:CertificateAuthority main op-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_chain: A base64 encoded string containing the signing certificate chain.
        :param pulumi.Input[str] certificate_chain_filename: The name of the certificate file.
        :param pulumi.Input[str] crl_chain: A base64 encoded string containing the CRL for this certificate authority.
        :param pulumi.Input[str] crl_url: The url from which to fetch the CRL for the certificate authority.
        :param pulumi.Input[str] description: A description of the Certificate Authority.
        :param pulumi.Input[str] display_name: The name of the Certificate Authority.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateAuthorityArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

        `CertificateAuthority` provides a Certificate Authority resource that enables creating, editing, and deleting Certificate Authorities on Confluent Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        main = confluentcloud.CertificateAuthority("main",
            display_name="my_certificate_authority",
            description="description",
            certificate_chain_filename="certificate.pem",
            certificate_chain="***REDACTED***")
        ```

        ## Import

        You can import a Certificate Authority by using Certificate Authority ID, for example:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/certificateAuthority:CertificateAuthority main op-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param CertificateAuthorityArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateAuthorityArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 certificate_chain_filename: Optional[pulumi.Input[str]] = None,
                 crl_chain: Optional[pulumi.Input[str]] = None,
                 crl_url: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateAuthorityArgs.__new__(CertificateAuthorityArgs)

            if certificate_chain is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_chain'")
            __props__.__dict__["certificate_chain"] = None if certificate_chain is None else pulumi.Output.secret(certificate_chain)
            if certificate_chain_filename is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_chain_filename'")
            __props__.__dict__["certificate_chain_filename"] = certificate_chain_filename
            __props__.__dict__["crl_chain"] = None if crl_chain is None else pulumi.Output.secret(crl_chain)
            __props__.__dict__["crl_url"] = crl_url
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["crl_source"] = None
            __props__.__dict__["crl_updated_at"] = None
            __props__.__dict__["expiration_dates"] = None
            __props__.__dict__["fingerprints"] = None
            __props__.__dict__["serial_numbers"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["certificateChain", "crlChain"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(CertificateAuthority, __self__).__init__(
            'confluentcloud:index/certificateAuthority:CertificateAuthority',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            certificate_chain_filename: Optional[pulumi.Input[str]] = None,
            crl_chain: Optional[pulumi.Input[str]] = None,
            crl_source: Optional[pulumi.Input[str]] = None,
            crl_updated_at: Optional[pulumi.Input[str]] = None,
            crl_url: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            expiration_dates: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            serial_numbers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'CertificateAuthority':
        """
        Get an existing CertificateAuthority resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_chain: A base64 encoded string containing the signing certificate chain.
        :param pulumi.Input[str] certificate_chain_filename: The name of the certificate file.
        :param pulumi.Input[str] crl_chain: A base64 encoded string containing the CRL for this certificate authority.
        :param pulumi.Input[str] crl_source: (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        :param pulumi.Input[str] crl_updated_at: (Optional String) The timestamp for when CRL was last updated.
        :param pulumi.Input[str] crl_url: The url from which to fetch the CRL for the certificate authority.
        :param pulumi.Input[str] description: A description of the Certificate Authority.
        :param pulumi.Input[str] display_name: The name of the Certificate Authority.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] expiration_dates: (Required List of Strings) The expiration dates of certificates in the chain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] serial_numbers: (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateAuthorityState.__new__(_CertificateAuthorityState)

        __props__.__dict__["certificate_chain"] = certificate_chain
        __props__.__dict__["certificate_chain_filename"] = certificate_chain_filename
        __props__.__dict__["crl_chain"] = crl_chain
        __props__.__dict__["crl_source"] = crl_source
        __props__.__dict__["crl_updated_at"] = crl_updated_at
        __props__.__dict__["crl_url"] = crl_url
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["expiration_dates"] = expiration_dates
        __props__.__dict__["fingerprints"] = fingerprints
        __props__.__dict__["serial_numbers"] = serial_numbers
        return CertificateAuthority(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[str]:
        """
        A base64 encoded string containing the signing certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter(name="certificateChainFilename")
    def certificate_chain_filename(self) -> pulumi.Output[str]:
        """
        The name of the certificate file.
        """
        return pulumi.get(self, "certificate_chain_filename")

    @property
    @pulumi.getter(name="crlChain")
    def crl_chain(self) -> pulumi.Output[Optional[str]]:
        """
        A base64 encoded string containing the CRL for this certificate authority.
        """
        return pulumi.get(self, "crl_chain")

    @property
    @pulumi.getter(name="crlSource")
    def crl_source(self) -> pulumi.Output[str]:
        """
        (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        """
        return pulumi.get(self, "crl_source")

    @property
    @pulumi.getter(name="crlUpdatedAt")
    def crl_updated_at(self) -> pulumi.Output[str]:
        """
        (Optional String) The timestamp for when CRL was last updated.
        """
        return pulumi.get(self, "crl_updated_at")

    @property
    @pulumi.getter(name="crlUrl")
    def crl_url(self) -> pulumi.Output[Optional[str]]:
        """
        The url from which to fetch the CRL for the certificate authority.
        """
        return pulumi.get(self, "crl_url")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description of the Certificate Authority.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Certificate Authority.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="expirationDates")
    def expiration_dates(self) -> pulumi.Output[Sequence[str]]:
        """
        (Required List of Strings) The expiration dates of certificates in the chain.
        """
        return pulumi.get(self, "expiration_dates")

    @property
    @pulumi.getter
    def fingerprints(self) -> pulumi.Output[Sequence[str]]:
        """
        (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        """
        return pulumi.get(self, "fingerprints")

    @property
    @pulumi.getter(name="serialNumbers")
    def serial_numbers(self) -> pulumi.Output[Sequence[str]]:
        """
        (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        """
        return pulumi.get(self, "serial_numbers")
