// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaTopic` describes a Kafka Topic data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = confluentcloud.getKafkaTopic({
 *     kafkaCluster: {
 *         id: basic_cluster.id,
 *     },
 *     topicName: "orders",
 *     restEndpoint: basic_cluster.restEndpoint,
 *     credentials: {
 *         key: "<Kafka API Key for confluent_kafka_cluster.basic-cluster>",
 *         secret: "<Kafka API Secret for confluent_kafka_cluster.basic-cluster>",
 *     },
 * });
 * export const config = orders.then(orders => orders.config);
 * ```
 *
 * ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = confluentcloud.getKafkaTopic({
 *     topicName: "orders",
 * });
 * export const config = orders.then(orders => orders.config);
 * ```
 */
export function getKafkaTopic(args: GetKafkaTopicArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaTopicResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getKafkaTopic:getKafkaTopic", {
        "credentials": args.credentials,
        "kafkaCluster": args.kafkaCluster,
        "restEndpoint": args.restEndpoint,
        "topicName": args.topicName,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaTopic.
 */
export interface GetKafkaTopicArgs {
    credentials?: inputs.GetKafkaTopicCredentials;
    kafkaCluster?: inputs.GetKafkaTopicKafkaCluster;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint: string;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
     */
    topicName: string;
}

/**
 * A collection of values returned by getKafkaTopic.
 */
export interface GetKafkaTopicResult {
    /**
     * (Optional Map) The custom topic settings:
     */
    readonly config: {[key: string]: string};
    readonly credentials?: outputs.GetKafkaTopicCredentials;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly kafkaCluster?: outputs.GetKafkaTopicKafkaCluster;
    /**
     * (Required Number) The number of partitions to create in the topic. Defaults to `6`.
     */
    readonly partitionsCount: number;
    readonly restEndpoint: string;
    readonly topicName: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaTopic` describes a Kafka Topic data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = confluentcloud.getKafkaTopic({
 *     kafkaCluster: {
 *         id: basic_cluster.id,
 *     },
 *     topicName: "orders",
 *     restEndpoint: basic_cluster.restEndpoint,
 *     credentials: {
 *         key: "<Kafka API Key for confluent_kafka_cluster.basic-cluster>",
 *         secret: "<Kafka API Secret for confluent_kafka_cluster.basic-cluster>",
 *     },
 * });
 * export const config = orders.then(orders => orders.config);
 * ```
 *
 * ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = confluentcloud.getKafkaTopic({
 *     topicName: "orders",
 * });
 * export const config = orders.then(orders => orders.config);
 * ```
 */
export function getKafkaTopicOutput(args: GetKafkaTopicOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKafkaTopicResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getKafkaTopic:getKafkaTopic", {
        "credentials": args.credentials,
        "kafkaCluster": args.kafkaCluster,
        "restEndpoint": args.restEndpoint,
        "topicName": args.topicName,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaTopic.
 */
export interface GetKafkaTopicOutputArgs {
    credentials?: pulumi.Input<inputs.GetKafkaTopicCredentialsArgs>;
    kafkaCluster?: pulumi.Input<inputs.GetKafkaTopicKafkaClusterArgs>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint: pulumi.Input<string>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
     */
    topicName: pulumi.Input<string>;
}
