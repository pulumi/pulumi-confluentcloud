// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.FlinkComputePool` describes a Flink Compute Pool data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getFlinkComputePool({
 *         id: "lfcp-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getFlinkComputePool({
 *         displayName: "my_compute_pool",
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
export function getFlinkComputePool(args: GetFlinkComputePoolArgs, opts?: pulumi.InvokeOptions): Promise<GetFlinkComputePoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkComputePool.
 */
export interface GetFlinkComputePoolArgs {
    /**
     * A human-readable name for the Flink Compute Pool.
     */
    displayName?: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: inputs.GetFlinkComputePoolEnvironment;
    /**
     * The ID of the Flink Compute Pool, for example, `lfcp-abc123`.
     */
    id?: string;
}

/**
 * A collection of values returned by getFlinkComputePool.
 */
export interface GetFlinkComputePoolResult {
    /**
     * (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
     */
    readonly apiVersion: string;
    /**
     * (Required String) The cloud service provider that runs the Flink Compute Pool.
     */
    readonly cloud: string;
    /**
     * (Required String) The name of the Flink Compute Pool.
     */
    readonly displayName: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly environment: outputs.GetFlinkComputePoolEnvironment;
    /**
     * (Required String) The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
     */
    readonly kind: string;
    /**
     * (Required Integer) Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to.
     */
    readonly maxCfu: number;
    /**
     * (Required String) The cloud service provider region that hosts the Flink Compute Pool.
     */
    readonly region: string;
    /**
     * (Required String) The Confluent Resource Name of the Flink Compute Pool.
     */
    readonly resourceName: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.FlinkComputePool` describes a Flink Compute Pool data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getFlinkComputePool({
 *         id: "lfcp-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getFlinkComputePool({
 *         displayName: "my_compute_pool",
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
export function getFlinkComputePoolOutput(args: GetFlinkComputePoolOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFlinkComputePoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkComputePool.
 */
export interface GetFlinkComputePoolOutputArgs {
    /**
     * A human-readable name for the Flink Compute Pool.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: pulumi.Input<inputs.GetFlinkComputePoolEnvironmentArgs>;
    /**
     * The ID of the Flink Compute Pool, for example, `lfcp-abc123`.
     */
    id?: pulumi.Input<string>;
}
