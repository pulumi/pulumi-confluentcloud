// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaCluster` describes a Kafka cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingId = confluentcloud.getKafkaCluster({
 *     id: "lkc-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * const test_sa = new confluentcloud.ServiceAccount("test-sa", {description: exampleUsingId.then(exampleUsingId => `app_mgr for ${exampleUsingId.displayName}`)});
 * const exampleUsingNameKafkaCluster = confluentcloud.getKafkaCluster({
 *     displayName: "basic_kafka_cluster",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameKafkaCluster;
 * ```
 */
export function getKafkaCluster(args: GetKafkaClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getKafkaCluster:getKafkaCluster", {
        "basics": args.basics,
        "dedicated": args.dedicated,
        "displayName": args.displayName,
        "enterprises": args.enterprises,
        "environment": args.environment,
        "id": args.id,
        "standards": args.standards,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaCluster.
 */
export interface GetKafkaClusterArgs {
    /**
     * (Optional Configuration Block) The configuration of the Basic Kafka cluster.
     */
    basics?: inputs.GetKafkaClusterBasic[];
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    dedicated?: inputs.GetKafkaClusterDedicated;
    /**
     * A human-readable name for the Kafka cluster.
     */
    displayName?: string;
    /**
     * (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
     */
    enterprises?: inputs.GetKafkaClusterEnterprise[];
    environment: inputs.GetKafkaClusterEnvironment;
    /**
     * The ID of the Kafka cluster, for example, `lkc-abc123`.
     */
    id?: string;
    /**
     * (Optional Configuration Block) The configuration of the Standard Kafka cluster.
     */
    standards?: inputs.GetKafkaClusterStandard[];
}

/**
 * A collection of values returned by getKafkaCluster.
 */
export interface GetKafkaClusterResult {
    /**
     * (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     */
    readonly apiVersion: string;
    /**
     * (Required String) The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     */
    readonly availability: string;
    /**
     * (Optional Configuration Block) The configuration of the Basic Kafka cluster.
     */
    readonly basics?: outputs.GetKafkaClusterBasic[];
    /**
     * (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     */
    readonly bootstrapEndpoint: string;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly byokKeys: outputs.GetKafkaClusterByokKey[];
    /**
     * (Required String) The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    readonly cloud: string;
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    readonly dedicated?: outputs.GetKafkaClusterDedicated;
    /**
     * (Required String) The name of the Kafka cluster.
     */
    readonly displayName: string;
    /**
     * (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
     */
    readonly enterprises?: outputs.GetKafkaClusterEnterprise[];
    readonly environment: outputs.GetKafkaClusterEnvironment;
    /**
     * (Required String) The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     */
    readonly id: string;
    /**
     * (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     */
    readonly kind: string;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly networks: outputs.GetKafkaClusterNetwork[];
    /**
     * (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     */
    readonly rbacCrn: string;
    /**
     * (Required String) The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    readonly region: string;
    /**
     * (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    readonly restEndpoint: string;
    /**
     * (Optional Configuration Block) The configuration of the Standard Kafka cluster.
     */
    readonly standards?: outputs.GetKafkaClusterStandard[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaCluster` describes a Kafka cluster data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingId = confluentcloud.getKafkaCluster({
 *     id: "lkc-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * const test_sa = new confluentcloud.ServiceAccount("test-sa", {description: exampleUsingId.then(exampleUsingId => `app_mgr for ${exampleUsingId.displayName}`)});
 * const exampleUsingNameKafkaCluster = confluentcloud.getKafkaCluster({
 *     displayName: "basic_kafka_cluster",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameKafkaCluster;
 * ```
 */
export function getKafkaClusterOutput(args: GetKafkaClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaClusterResult> {
    return pulumi.output(args).apply((a: any) => getKafkaCluster(a, opts))
}

/**
 * A collection of arguments for invoking getKafkaCluster.
 */
export interface GetKafkaClusterOutputArgs {
    /**
     * (Optional Configuration Block) The configuration of the Basic Kafka cluster.
     */
    basics?: pulumi.Input<pulumi.Input<inputs.GetKafkaClusterBasicArgs>[]>;
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    dedicated?: pulumi.Input<inputs.GetKafkaClusterDedicatedArgs>;
    /**
     * A human-readable name for the Kafka cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
     */
    enterprises?: pulumi.Input<pulumi.Input<inputs.GetKafkaClusterEnterpriseArgs>[]>;
    environment: pulumi.Input<inputs.GetKafkaClusterEnvironmentArgs>;
    /**
     * The ID of the Kafka cluster, for example, `lkc-abc123`.
     */
    id?: pulumi.Input<string>;
    /**
     * (Optional Configuration Block) The configuration of the Standard Kafka cluster.
     */
    standards?: pulumi.Input<pulumi.Input<inputs.GetKafkaClusterStandardArgs>[]>;
}
