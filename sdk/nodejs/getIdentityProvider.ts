// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.IdentityProvider` describes an Identity Provider data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getIdentityProvider({
 *         id: "op-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getIdentityProvider({
 *         displayName: "My OIDC Provider: Azure AD",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getIdentityProvider(args?: GetIdentityProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetIdentityProviderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getIdentityProvider:getIdentityProvider", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getIdentityProvider.
 */
export interface GetIdentityProviderArgs {
    /**
     * A human-readable name for the Identity Provider.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: string;
    /**
     * The ID of the Identity Provider, for example, `op-abc123`.
     */
    id?: string;
}

/**
 * A collection of values returned by getIdentityProvider.
 */
export interface GetIdentityProviderResult {
    /**
     * (Required String) A description for the Identity Provider.
     */
    readonly description: string;
    /**
     * (Required String) A human-readable name for the Identity Provider.
     */
    readonly displayName: string;
    /**
     * (Required String) The ID of the Identity Provider, for example, `op-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     */
    readonly issuer: string;
    /**
     * (Required String) A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     */
    readonly jwksUri: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.IdentityProvider` describes an Identity Provider data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getIdentityProvider({
 *         id: "op-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getIdentityProvider({
 *         displayName: "My OIDC Provider: Azure AD",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getIdentityProviderOutput(args?: GetIdentityProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIdentityProviderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getIdentityProvider:getIdentityProvider", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getIdentityProvider.
 */
export interface GetIdentityProviderOutputArgs {
    /**
     * A human-readable name for the Identity Provider.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Identity Provider, for example, `op-abc123`.
     */
    id?: pulumi.Input<string>;
}
