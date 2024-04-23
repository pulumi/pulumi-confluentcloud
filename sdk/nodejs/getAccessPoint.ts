// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.AccessPoint` describes a Access Point data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getAccessPoint({
 *     id: "ap-abc123",
 *     environment: {
 *         id: "env-123abc",
 *     },
 * });
 * export const accessPoint = main;
 * ```
 */
export function getAccessPoint(args: GetAccessPointArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessPointResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getAccessPoint:getAccessPoint", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessPoint.
 */
export interface GetAccessPointArgs {
    environment: inputs.GetAccessPointEnvironment;
    /**
     * The ID of the Access Point, for example, `ap-abc123`.
     */
    id: string;
}

/**
 * A collection of values returned by getAccessPoint.
 */
export interface GetAccessPointResult {
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly awsEgressPrivateLinkEndpoints: outputs.GetAccessPointAwsEgressPrivateLinkEndpoint[];
    /**
     * (Required String) A human-readable name for the Access Point.
     */
    readonly displayName: string;
    readonly environment: outputs.GetAccessPointEnvironment;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly gateways: outputs.GetAccessPointGateway[];
    /**
     * (Required String) The ID of the gateway to which the Access Point belongs, for example, `gw-abc123`.
     */
    readonly id: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.AccessPoint` describes a Access Point data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getAccessPoint({
 *     id: "ap-abc123",
 *     environment: {
 *         id: "env-123abc",
 *     },
 * });
 * export const accessPoint = main;
 * ```
 */
export function getAccessPointOutput(args: GetAccessPointOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccessPointResult> {
    return pulumi.output(args).apply((a: any) => getAccessPoint(a, opts))
}

/**
 * A collection of arguments for invoking getAccessPoint.
 */
export interface GetAccessPointOutputArgs {
    environment: pulumi.Input<inputs.GetAccessPointEnvironmentArgs>;
    /**
     * The ID of the Access Point, for example, `ap-abc123`.
     */
    id: pulumi.Input<string>;
}
