// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAccess` describes a Private Link Access data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getPrivateLinkAccess({
 *         id: "pla-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getPrivateLinkAccess({
 *         displayName: "my_pla",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getPrivateLinkAccess(args: GetPrivateLinkAccessArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivateLinkAccessResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivateLinkAccess.
 */
export interface GetPrivateLinkAccessArgs {
    /**
     * A human-readable name for the Private Link Access.
     */
    displayName?: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: inputs.GetPrivateLinkAccessEnvironment;
    /**
     * The ID of the Private Link Access, for example, `pla-abc123`.
     */
    id?: string;
}

/**
 * A collection of values returned by getPrivateLinkAccess.
 */
export interface GetPrivateLinkAccessResult {
    /**
     * (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
     */
    readonly aws: outputs.GetPrivateLinkAccessAw[];
    /**
     * (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
     */
    readonly azures: outputs.GetPrivateLinkAccessAzure[];
    /**
     * (Optional String) The name of the Private Link Access.
     */
    readonly displayName: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly environment: outputs.GetPrivateLinkAccessEnvironment;
    /**
     * (Optional Configuration Block) The GCP-specific Private Service Connect details if available. It supports the following:
     */
    readonly gcps: outputs.GetPrivateLinkAccessGcp[];
    /**
     * (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networks: outputs.GetPrivateLinkAccessNetwork[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAccess` describes a Private Link Access data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getPrivateLinkAccess({
 *         id: "pla-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getPrivateLinkAccess({
 *         displayName: "my_pla",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getPrivateLinkAccessOutput(args: GetPrivateLinkAccessOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrivateLinkAccessResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivateLinkAccess.
 */
export interface GetPrivateLinkAccessOutputArgs {
    /**
     * A human-readable name for the Private Link Access.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: pulumi.Input<inputs.GetPrivateLinkAccessEnvironmentArgs>;
    /**
     * The ID of the Private Link Access, for example, `pla-abc123`.
     */
    id?: pulumi.Input<string>;
}
