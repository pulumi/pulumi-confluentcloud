// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CatalogIntegration` describes a Catalog Integration data source.
 *
 * ## Example Usage
 */
export function getCatalogIntegration(args: GetCatalogIntegrationArgs, opts?: pulumi.InvokeOptions): Promise<GetCatalogIntegrationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getCatalogIntegration:getCatalogIntegration", {
        "credentials": args.credentials,
        "environment": args.environment,
        "id": args.id,
        "kafkaCluster": args.kafkaCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalogIntegration.
 */
export interface GetCatalogIntegrationArgs {
    credentials?: inputs.GetCatalogIntegrationCredentials;
    environment: inputs.GetCatalogIntegrationEnvironment;
    /**
     * The ID of the Catalog Integration, for example, `tci-abc123`.
     */
    id: string;
    kafkaCluster: inputs.GetCatalogIntegrationKafkaCluster;
}

/**
 * A collection of values returned by getCatalogIntegration.
 */
export interface GetCatalogIntegrationResult {
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly awsGlues: outputs.GetCatalogIntegrationAwsGlue[];
    readonly credentials?: outputs.GetCatalogIntegrationCredentials;
    /**
     * (Required String) The name of the catalog integration.
     */
    readonly displayName: string;
    readonly environment: outputs.GetCatalogIntegrationEnvironment;
    readonly id: string;
    readonly kafkaCluster: outputs.GetCatalogIntegrationKafkaCluster;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly snowflakes: outputs.GetCatalogIntegrationSnowflake[];
    /**
     * (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
     */
    readonly suspended: boolean;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CatalogIntegration` describes a Catalog Integration data source.
 *
 * ## Example Usage
 */
export function getCatalogIntegrationOutput(args: GetCatalogIntegrationOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCatalogIntegrationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getCatalogIntegration:getCatalogIntegration", {
        "credentials": args.credentials,
        "environment": args.environment,
        "id": args.id,
        "kafkaCluster": args.kafkaCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getCatalogIntegration.
 */
export interface GetCatalogIntegrationOutputArgs {
    credentials?: pulumi.Input<inputs.GetCatalogIntegrationCredentialsArgs>;
    environment: pulumi.Input<inputs.GetCatalogIntegrationEnvironmentArgs>;
    /**
     * The ID of the Catalog Integration, for example, `tci-abc123`.
     */
    id: pulumi.Input<string>;
    kafkaCluster: pulumi.Input<inputs.GetCatalogIntegrationKafkaClusterArgs>;
}
