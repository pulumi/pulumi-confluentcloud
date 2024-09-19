// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.ServiceAccount` describes a Service Account data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getServiceAccount({
 *         id: "sa-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getServiceAccount({
 *         displayName: "test_sa",
 *     });
 *     const test_env = new confluentcloud.Environment("test-env", {displayName: `env_for_${exampleUsingId.displayName}`});
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getServiceAccount(args?: GetServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getServiceAccount:getServiceAccount", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountArgs {
    /**
     * A human-readable name for the Service Account. Limited to 64 characters in length.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: string;
    /**
     * The ID of the Service Account (e.g., `sa-abc123`).
     */
    id?: string;
}

/**
 * A collection of values returned by getServiceAccount.
 */
export interface GetServiceAccountResult {
    /**
     * (Required String) An API Version of the schema version of the Service Account.
     */
    readonly apiVersion: string;
    /**
     * (Required String) A free-form description of the Service Account.
     */
    readonly description: string;
    /**
     * (Required String) A human-readable name for the Service Account. Limited to 64 characters in length.
     */
    readonly displayName: string;
    /**
     * (Required String) The ID of the Service Account (e.g., `sa-abc123`).
     */
    readonly id: string;
    /**
     * (Required String) A kind of the Service Account.
     */
    readonly kind: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.ServiceAccount` describes a Service Account data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getServiceAccount({
 *         id: "sa-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getServiceAccount({
 *         displayName: "test_sa",
 *     });
 *     const test_env = new confluentcloud.Environment("test-env", {displayName: `env_for_${exampleUsingId.displayName}`});
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getServiceAccountOutput(args?: GetServiceAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getServiceAccount:getServiceAccount", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountOutputArgs {
    /**
     * A human-readable name for the Service Account. Limited to 64 characters in length.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Service Account (e.g., `sa-abc123`).
     */
    id?: pulumi.Input<string>;
}
