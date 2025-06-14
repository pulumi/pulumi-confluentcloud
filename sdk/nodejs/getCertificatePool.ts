// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CertificatePool` describes a Certificate Pool data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getCertificatePool({
 *     id: "pool-def456",
 *     certificateAuthority: {
 *         id: "op-abc123",
 *     },
 * });
 * export const certificatePool = main;
 * ```
 */
export function getCertificatePool(args: GetCertificatePoolArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatePoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getCertificatePool:getCertificatePool", {
        "certificateAuthority": args.certificateAuthority,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificatePool.
 */
export interface GetCertificatePoolArgs {
    certificateAuthority: inputs.GetCertificatePoolCertificateAuthority;
    /**
     * The ID of the Certificate Pool, for example, `pool-abc123`.
     */
    id: string;
}

/**
 * A collection of values returned by getCertificatePool.
 */
export interface GetCertificatePoolResult {
    readonly certificateAuthority: outputs.GetCertificatePoolCertificateAuthority;
    /**
     * (Required String) A description of the Certificate Pool.
     */
    readonly description: string;
    /**
     * (Required String) A human-readable name for the Certificate Pool.
     */
    readonly displayName: string;
    /**
     * (Required String) The certificate field that will be used to represent the pool's external identity for audit logging, for example, `UID`.
     */
    readonly externalIdentifier: string;
    /**
     * (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     */
    readonly filter: string;
    readonly id: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CertificatePool` describes a Certificate Pool data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getCertificatePool({
 *     id: "pool-def456",
 *     certificateAuthority: {
 *         id: "op-abc123",
 *     },
 * });
 * export const certificatePool = main;
 * ```
 */
export function getCertificatePoolOutput(args: GetCertificatePoolOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificatePoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getCertificatePool:getCertificatePool", {
        "certificateAuthority": args.certificateAuthority,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificatePool.
 */
export interface GetCertificatePoolOutputArgs {
    certificateAuthority: pulumi.Input<inputs.GetCertificatePoolCertificateAuthorityArgs>;
    /**
     * The ID of the Certificate Pool, for example, `pool-abc123`.
     */
    id: pulumi.Input<string>;
}
