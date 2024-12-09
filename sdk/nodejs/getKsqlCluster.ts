// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # confluentcloud.KsqlCluster Data Source
 *
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KsqlCluster` describes a ksqlDB cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getKsqlCluster({
 *         id: "lksqlc-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getKsqlCluster({
 *         displayName: "ksqldb_cluster",
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
export function getKsqlCluster(args: GetKsqlClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetKsqlClusterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getKsqlCluster:getKsqlCluster", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getKsqlCluster.
 */
export interface GetKsqlClusterArgs {
    /**
     * The name of the ksqlDB cluster.
     */
    displayName?: string;
    environment: inputs.GetKsqlClusterEnvironment;
    /**
     * The ID of the ksqlDB cluster, for example, `lksqlc-abc123`.
     */
    id?: string;
}

/**
 * A collection of values returned by getKsqlCluster.
 */
export interface GetKsqlClusterResult {
    /**
     * (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
     */
    readonly apiVersion: string;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly credentialIdentities: outputs.GetKsqlClusterCredentialIdentity[];
    /**
     * (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
     */
    readonly csu: number;
    readonly displayName: string;
    readonly environment: outputs.GetKsqlClusterEnvironment;
    /**
     * (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
     */
    readonly id: string;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly kafkaClusters: outputs.GetKsqlClusterKafkaCluster[];
    /**
     * (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
     */
    readonly kind: string;
    /**
     * (Required String) The Confluent Resource Name of the ksqlDB cluster.
     */
    readonly resourceName: string;
    /**
     * (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
     */
    readonly restEndpoint: string;
    /**
     * (Required Integer) The amount of storage (in GB) provisioned to this cluster.
     */
    readonly storage: number;
    /**
     * (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
     */
    readonly topicPrefix: string;
    /**
     * (Optional Boolean) Controls whether the row data should be included in the processing log topic.
     */
    readonly useDetailedProcessingLog: boolean;
}
/**
 * ## # confluentcloud.KsqlCluster Data Source
 *
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KsqlCluster` describes a ksqlDB cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getKsqlCluster({
 *         id: "lksqlc-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getKsqlCluster({
 *         displayName: "ksqldb_cluster",
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
export function getKsqlClusterOutput(args: GetKsqlClusterOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKsqlClusterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getKsqlCluster:getKsqlCluster", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getKsqlCluster.
 */
export interface GetKsqlClusterOutputArgs {
    /**
     * The name of the ksqlDB cluster.
     */
    displayName?: pulumi.Input<string>;
    environment: pulumi.Input<inputs.GetKsqlClusterEnvironmentArgs>;
    /**
     * The ID of the ksqlDB cluster, for example, `lksqlc-abc123`.
     */
    id?: pulumi.Input<string>;
}
