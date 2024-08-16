// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `data.confluent_schema_registry_clusters` describes a data source for Schema Registry Clusters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemaRegistryClusters({
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * ```
 */
export function getSchemaRegistryClusters(args?: GetSchemaRegistryClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryClustersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchemaRegistryClusters:getSchemaRegistryClusters", {
        "environment": args.environment,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryClusters.
 */
export interface GetSchemaRegistryClustersArgs {
    /**
     * (Required Object) exports the following attributes:
     */
    environment?: inputs.GetSchemaRegistryClustersEnvironment;
}

/**
 * A collection of values returned by getSchemaRegistryClusters.
 */
export interface GetSchemaRegistryClustersResult {
    /**
     * (Required List of Object) List of Schema Registry clusters. Each Schema Registry cluster object exports the following attributes:
     */
    readonly clusters: outputs.GetSchemaRegistryClustersCluster[];
    /**
     * (Required Object) exports the following attributes:
     */
    readonly environment: outputs.GetSchemaRegistryClustersEnvironment;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `data.confluent_schema_registry_clusters` describes a data source for Schema Registry Clusters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemaRegistryClusters({
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * ```
 */
export function getSchemaRegistryClustersOutput(args?: GetSchemaRegistryClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryClustersResult> {
    return pulumi.output(args).apply((a: any) => getSchemaRegistryClusters(a, opts))
}

/**
 * A collection of arguments for invoking getSchemaRegistryClusters.
 */
export interface GetSchemaRegistryClustersOutputArgs {
    /**
     * (Required Object) exports the following attributes:
     */
    environment?: pulumi.Input<inputs.GetSchemaRegistryClustersEnvironmentArgs>;
}
