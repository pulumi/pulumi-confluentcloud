// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.IdentityPool` describes an Identity Pool data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdIdentityPool = confluentcloud.getIdentityPool({
 *     id: "pool-xyz456",
 *     identityProvider: {
 *         id: "op-abc123",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdIdentityPool;
 * const exampleUsingNameIdentityPool = confluentcloud.getIdentityPool({
 *     displayName: "My Identity Pool",
 *     identityProvider: {
 *         id: "op-abc123",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameIdentityPool;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIdentityPool(args: GetIdentityPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetIdentityPoolResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getIdentityPool:getIdentityPool", {
        "displayName": args.displayName,
        "id": args.id,
        "identityProvider": args.identityProvider,
    }, opts);
}

/**
 * A collection of arguments for invoking getIdentityPool.
 */
export interface GetIdentityPoolArgs {
    /**
     * A human-readable name for the Identity Pool.
     */
    displayName?: string;
    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    identityProvider: inputs.GetIdentityPoolIdentityProvider;
}

/**
 * A collection of values returned by getIdentityPool.
 */
export interface GetIdentityPoolResult {
    /**
     * (Required String) A description for the Identity Pool.
     */
    readonly description: string;
    /**
     * (Required String) A human-readable name for the Identity Pool.
     */
    readonly displayName: string;
    /**
     * (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     */
    readonly filter: string;
    /**
     * (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
     */
    readonly identityClaim: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly identityProvider: outputs.GetIdentityPoolIdentityProvider;
}
/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.IdentityPool` describes an Identity Pool data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdIdentityPool = confluentcloud.getIdentityPool({
 *     id: "pool-xyz456",
 *     identityProvider: {
 *         id: "op-abc123",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdIdentityPool;
 * const exampleUsingNameIdentityPool = confluentcloud.getIdentityPool({
 *     displayName: "My Identity Pool",
 *     identityProvider: {
 *         id: "op-abc123",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameIdentityPool;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIdentityPoolOutput(args: GetIdentityPoolOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIdentityPoolResult> {
    return pulumi.output(args).apply((a: any) => getIdentityPool(a, opts))
}

/**
 * A collection of arguments for invoking getIdentityPool.
 */
export interface GetIdentityPoolOutputArgs {
    /**
     * A human-readable name for the Identity Pool.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: pulumi.Input<string>;
    /**
     * (Required Configuration Block) supports the following:
     */
    identityProvider: pulumi.Input<inputs.GetIdentityPoolIdentityProviderArgs>;
}
