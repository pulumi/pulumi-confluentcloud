// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     // Loads the only Schema Registry cluster in the target environment
 *     const exampleUsingEnvId = await confluentcloud.getSchemaRegistryCluster({
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingId = await confluentcloud.getSchemaRegistryCluster({
 *         id: "lsrc-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getSchemaRegistryCluster({
 *         displayName: "Stream Governance Package",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingEnvId: exampleUsingEnvId,
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
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
     * The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
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
     * (Required String) The cloud service provider that that the Schema Registry cluster belongs to, for example, `AWS`.
     */
    readonly cloud: string;
    /**
     * (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     */
    readonly displayName: string;
    readonly environment: outputs.GetSchemaRegistryClusterEnvironment;
    /**
     * (Required String) The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
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
     * (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `us-east4`.
     */
    readonly region: string;
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
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     // Loads the only Schema Registry cluster in the target environment
 *     const exampleUsingEnvId = await confluentcloud.getSchemaRegistryCluster({
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingId = await confluentcloud.getSchemaRegistryCluster({
 *         id: "lsrc-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getSchemaRegistryCluster({
 *         displayName: "Stream Governance Package",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingEnvId: exampleUsingEnvId,
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
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
     * The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
     */
    id?: pulumi.Input<string>;
}
