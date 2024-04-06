// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Peering` describes a Peering data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdPeering = confluentcloud.getPeering({
 *     id: "peer-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdPeering;
 * const exampleUsingNamePeering = confluentcloud.getPeering({
 *     displayName: "my_peering",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNamePeering;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPeering(args: GetPeeringArgs, opts?: pulumi.InvokeOptions): Promise<GetPeeringResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getPeering:getPeering", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPeering.
 */
export interface GetPeeringArgs {
    /**
     * A human-readable name for the Peering.
     */
    displayName?: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: inputs.GetPeeringEnvironment;
    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: string;
}

/**
 * A collection of values returned by getPeering.
 */
export interface GetPeeringResult {
    /**
     * (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
     */
    readonly aws: outputs.GetPeeringAw[];
    /**
     * (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     */
    readonly azures: outputs.GetPeeringAzure[];
    /**
     * (Optional String) The name of the Peering.
     */
    readonly displayName: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly environment: outputs.GetPeeringEnvironment;
    /**
     * (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     */
    readonly gcps: outputs.GetPeeringGcp[];
    /**
     * (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networks: outputs.GetPeeringNetwork[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Peering` describes a Peering data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdPeering = confluentcloud.getPeering({
 *     id: "peer-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdPeering;
 * const exampleUsingNamePeering = confluentcloud.getPeering({
 *     displayName: "my_peering",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNamePeering;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPeeringOutput(args: GetPeeringOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPeeringResult> {
    return pulumi.output(args).apply((a: any) => getPeering(a, opts))
}

/**
 * A collection of arguments for invoking getPeering.
 */
export interface GetPeeringOutputArgs {
    /**
     * A human-readable name for the Peering.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: pulumi.Input<inputs.GetPeeringEnvironmentArgs>;
    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: pulumi.Input<string>;
}
