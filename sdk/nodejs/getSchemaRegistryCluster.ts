// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.SchemaRegistryCluster` describes a Schema Registry cluster data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
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
 * <!--End PulumiCodeChooser -->
 */
export function getSchemaRegistryCluster(args: GetSchemaRegistryClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
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
    /**
     * (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
     */
    readonly id: string;
    /**
     * (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     */
    readonly kind: string;
    /**
     * (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     */
    readonly package: string;
    /**
     * (Required Configuration Block) supports the following:
     */
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
/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.SchemaRegistryCluster` describes a Schema Registry cluster data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
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
 * <!--End PulumiCodeChooser -->
 */
export function getSchemaRegistryClusterOutput(args: GetSchemaRegistryClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryClusterResult> {
    return pulumi.output(args).apply((a: any) => getSchemaRegistryCluster(a, opts))
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
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: pulumi.Input<string>;
}
