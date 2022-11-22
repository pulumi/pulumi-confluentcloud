// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Open Preview](https://img.shields.io/badge/Lifecycle%20Stage-Open%20Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * > **Note:** `confluentcloud.SchemaRegistryCluster` resource is available in **Open Preview** for early adopters. Open Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Open Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Open Preview features. Open Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Open Preview features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.SchemaRegistryCluster` describes a Schema Registry cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdSchemaRegistryCluster = confluentcloud.getSchemaRegistryCluster({
 *     id: "lsrc-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdSchemaRegistryCluster;
 * const exampleUsingNameSchemaRegistryCluster = confluentcloud.getSchemaRegistryCluster({
 *     displayName: "Stream Governance Package",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameSchemaRegistryCluster;
 * ```
 */
export function getSchemaRegistryCluster(args: GetSchemaRegistryClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryClusterResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryCluster.
 */
export interface GetSchemaRegistryClusterArgs {
    /**
     * The name for the Schema Registry cluster.
     */
    displayName?: string;
    environment: inputs.GetSchemaRegistryClusterEnvironment;
    /**
     * The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     */
    id?: string;
}

/**
 * A collection of values returned by getSchemaRegistryCluster.
 */
export interface GetSchemaRegistryClusterResult {
    /**
     * (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
     */
    readonly apiVersion: string;
    /**
     * (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     */
    readonly displayName: string;
    readonly environment: outputs.GetSchemaRegistryClusterEnvironment;
    readonly id: string;
    /**
     * (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     */
    readonly kind: string;
    /**
     * (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * - `region` (Required Configuration Block) supports the following:
     */
    readonly package: string;
    readonly regions: outputs.GetSchemaRegistryClusterRegion[];
    /**
     * (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     */
    readonly resourceName: string;
    /**
     * (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     */
    readonly restEndpoint: string;
}

export function getSchemaRegistryClusterOutput(args: GetSchemaRegistryClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryClusterResult> {
    return pulumi.output(args).apply(a => getSchemaRegistryCluster(a, opts))
}

/**
 * A collection of arguments for invoking getSchemaRegistryCluster.
 */
export interface GetSchemaRegistryClusterOutputArgs {
    /**
     * The name for the Schema Registry cluster.
     */
    displayName?: pulumi.Input<string>;
    environment: pulumi.Input<inputs.GetSchemaRegistryClusterEnvironmentArgs>;
    /**
     * The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     */
    id?: pulumi.Input<string>;
}
