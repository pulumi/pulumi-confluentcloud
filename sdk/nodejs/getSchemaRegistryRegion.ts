// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![Deprecated](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-Deprecated-yellow>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getSchemaRegistryRegion` describes a Schema Registry cluster data source.
 *
 * !> **Warning:** The `confluentcloud.getSchemaRegistryRegion` data source has been deprecated and will be removed in the next major version of the provider (2.0.0).
 * Refer to the Upgrade Guide for more details.
 * The guide will be published once version 2.0.0 is released.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleSchemaRegistryRegion = confluentcloud.getSchemaRegistryRegion({
 *     cloud: "AWS",
 *     region: "us-east-2",
 *     "package": "ESSENTIALS",
 * });
 * export const example = exampleSchemaRegistryRegion;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSchemaRegistryRegion(args: GetSchemaRegistryRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryRegionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchemaRegistryRegion:getSchemaRegistryRegion", {
        "cloud": args.cloud,
        "package": args.package,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryRegion.
 */
export interface GetSchemaRegistryRegionArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: string;
    /**
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     *
     * > **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    package: string;
    /**
     * The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    region: string;
}

/**
 * A collection of values returned by getSchemaRegistryRegion.
 */
export interface GetSchemaRegistryRegionResult {
    readonly cloud: string;
    /**
     * (Required String) The ID of the Schema Registry region, for example, `sgreg-1`.
     */
    readonly id: string;
    readonly package: string;
    readonly region: string;
}
/**
 * [![Deprecated](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-Deprecated-yellow>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getSchemaRegistryRegion` describes a Schema Registry cluster data source.
 *
 * !> **Warning:** The `confluentcloud.getSchemaRegistryRegion` data source has been deprecated and will be removed in the next major version of the provider (2.0.0).
 * Refer to the Upgrade Guide for more details.
 * The guide will be published once version 2.0.0 is released.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleSchemaRegistryRegion = confluentcloud.getSchemaRegistryRegion({
 *     cloud: "AWS",
 *     region: "us-east-2",
 *     "package": "ESSENTIALS",
 * });
 * export const example = exampleSchemaRegistryRegion;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSchemaRegistryRegionOutput(args: GetSchemaRegistryRegionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryRegionResult> {
    return pulumi.output(args).apply((a: any) => getSchemaRegistryRegion(a, opts))
}

/**
 * A collection of arguments for invoking getSchemaRegistryRegion.
 */
export interface GetSchemaRegistryRegionOutputArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: pulumi.Input<string>;
    /**
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     *
     * > **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    package: pulumi.Input<string>;
    /**
     * The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    region: pulumi.Input<string>;
}
