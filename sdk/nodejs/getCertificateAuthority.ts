// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CertificateAuthority` describes a Certificate Authority data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getCertificateAuthority({
 *     id: "op-abc123",
 * });
 * export const certificateAuthority = main;
 * ```
 */
export function getCertificateAuthority(args: GetCertificateAuthorityArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateAuthorityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getCertificateAuthority:getCertificateAuthority", {
        "crlSource": args.crlSource,
        "crlUpdatedAt": args.crlUpdatedAt,
        "crlUrl": args.crlUrl,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificateAuthority.
 */
export interface GetCertificateAuthorityArgs {
    /**
     * (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     */
    crlSource?: string;
    /**
     * (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     */
    crlUpdatedAt?: string;
    /**
     * (Optional String) The url from which to fetch the CRL for the certificate authority if crlSource is URL.
     */
    crlUrl?: string;
    /**
     * The ID of the Certificate Authority, for example, `op-abc123`.
     */
    id: string;
}

/**
 * A collection of values returned by getCertificateAuthority.
 */
export interface GetCertificateAuthorityResult {
    /**
     * (Required String) The name of the certificate file, for example, `certificate.pem`.
     */
    readonly certificateChainFilename: string;
    /**
     * (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     */
    readonly crlSource: string;
    /**
     * (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     */
    readonly crlUpdatedAt: string;
    /**
     * (Optional String) The url from which to fetch the CRL for the certificate authority if crlSource is URL.
     */
    readonly crlUrl: string;
    /**
     * (Required String) A description for the Certificate Authority.
     */
    readonly description: string;
    /**
     * (Required String) A human-readable name for the Certificate Authority.
     */
    readonly displayName: string;
    /**
     * (Required List of Strings) The expiration dates of certificates in the chain, for example, `["2017-07-21T17:32:28Z"]`.
     */
    readonly expirationDates: string[];
    /**
     * (Required List of Strings) The fingerprints for each certificate in the certificate chain, for example, `["B1BC968BD4f49D622AA89A81F2150152A41D829C"]`.
     */
    readonly fingerprints: string[];
    readonly id: string;
    /**
     * (Required List of Strings) The serial numbers for each certificate in the certificate chain.
     */
    readonly serialNumbers: string[];
}
/**
 * [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CertificateAuthority` describes a Certificate Authority data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getCertificateAuthority({
 *     id: "op-abc123",
 * });
 * export const certificateAuthority = main;
 * ```
 */
export function getCertificateAuthorityOutput(args: GetCertificateAuthorityOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCertificateAuthorityResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getCertificateAuthority:getCertificateAuthority", {
        "crlSource": args.crlSource,
        "crlUpdatedAt": args.crlUpdatedAt,
        "crlUrl": args.crlUrl,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificateAuthority.
 */
export interface GetCertificateAuthorityOutputArgs {
    /**
     * (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     */
    crlSource?: pulumi.Input<string>;
    /**
     * (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     */
    crlUpdatedAt?: pulumi.Input<string>;
    /**
     * (Optional String) The url from which to fetch the CRL for the certificate authority if crlSource is URL.
     */
    crlUrl?: pulumi.Input<string>;
    /**
     * The ID of the Certificate Authority, for example, `op-abc123`.
     */
    id: pulumi.Input<string>;
}
