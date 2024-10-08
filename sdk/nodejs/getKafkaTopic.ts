// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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
export function getKafkaTopicOutput(args: GetKafkaTopicOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaTopicResult> {
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
