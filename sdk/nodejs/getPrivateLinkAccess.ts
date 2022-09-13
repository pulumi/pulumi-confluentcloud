// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAccess` describes a Network data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdPrivateLinkAccess = confluentcloud.getPrivateLinkAccess({
 *     id: "pla-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdPrivateLinkAccess;
 * const exampleUsingNamePrivateLinkAccess = confluentcloud.getPrivateLinkAccess({
 *     displayName: "my_pla",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNamePrivateLinkAccess;
 * ```
 */
export function getPrivateLinkAccess(args: GetPrivateLinkAccessArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivateLinkAccessResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
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
    environment: inputs.GetPrivateLinkAccessEnvironment;
    /**
     * The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
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
     * - `environment` (Required Configuration Block) supports the following:
     */
    readonly displayName: string;
    readonly environment: outputs.GetPrivateLinkAccessEnvironment;
    /**
     * (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    readonly networks: outputs.GetPrivateLinkAccessNetwork[];
}

export function getPrivateLinkAccessOutput(args: GetPrivateLinkAccessOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivateLinkAccessResult> {
    return pulumi.output(args).apply(a => getPrivateLinkAccess(a, opts))
}

/**
 * A collection of arguments for invoking getPrivateLinkAccess.
 */
export interface GetPrivateLinkAccessOutputArgs {
    /**
     * A human-readable name for the Private Link Access.
     */
    displayName?: pulumi.Input<string>;
    environment: pulumi.Input<inputs.GetPrivateLinkAccessEnvironmentArgs>;
    /**
     * The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
     */
    id?: pulumi.Input<string>;
}
