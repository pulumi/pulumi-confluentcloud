// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getFlinkRegion` describes a Flink cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const example = await confluentcloud.getFlinkRegion({
 *         cloud: "AWS",
 *         region: "us-east-1",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 */
export function getFlinkRegion(args: GetFlinkRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetFlinkRegionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getFlinkRegion:getFlinkRegion", {
        "cloud": args.cloud,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkRegion.
 */
export interface GetFlinkRegionArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: string;
    /**
     * The cloud service provider region, for example, `us-east-1`.
     */
    region: string;
}

/**
 * A collection of values returned by getFlinkRegion.
 */
export interface GetFlinkRegionResult {
    /**
     * (Required String) An API Version of the Flink region, for example, `fcpm/v2`.
     */
    readonly apiVersion: string;
    readonly cloud: string;
    /**
     * (Required String) The ID of the Flink region, for example, `aws.us-east-1`.
     */
    readonly id: string;
    /**
     * (Required String) A kind of the Flink region, for example, `Region`.
     */
    readonly kind: string;
    /**
     * (Required String) The private HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.private.confluent.cloud`.
     */
    readonly privateRestEndpoint: string;
    readonly region: string;
    /**
     * (Required String) The HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`.
     */
    readonly restEndpoint: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getFlinkRegion` describes a Flink cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const example = await confluentcloud.getFlinkRegion({
 *         cloud: "AWS",
 *         region: "us-east-1",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 */
export function getFlinkRegionOutput(args: GetFlinkRegionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFlinkRegionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getFlinkRegion:getFlinkRegion", {
        "cloud": args.cloud,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkRegion.
 */
export interface GetFlinkRegionOutputArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: pulumi.Input<string>;
    /**
     * The cloud service provider region, for example, `us-east-1`.
     */
    region: pulumi.Input<string>;
}
