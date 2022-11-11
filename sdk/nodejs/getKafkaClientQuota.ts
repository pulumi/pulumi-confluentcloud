// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To Client Quotas API](https://img.shields.io/badge/-Request%20Access%20To%20Clients%20Quotas-%23bc8540)](mailto:cloud-client-quotas-ea@confluent.io?subject=Request%20to%20join%20Kafka%20Quotas%20Management%20API%20Early%20Access&amp;body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Early%20Access%20for%20kafka-quotas/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
 *
 * > **Note:** `confluentcloud.KafkaClientQuota` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Early Access features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.KafkaClientQuota` describes a Kafka Client Quota.
 *
 * > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleKafkaClientQuota = confluentcloud.getKafkaClientQuota({
 *     id: "cq-abc123",
 * });
 * export const example = exampleKafkaClientQuota;
 * ```
 */
export function getKafkaClientQuota(args: GetKafkaClientQuotaArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaClientQuotaResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getKafkaClientQuota:getKafkaClientQuota", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaClientQuota.
 */
export interface GetKafkaClientQuotaArgs {
    /**
     * The ID of the Kafka Client Quota (for example, `cq-abc123`).
     */
    id: string;
}

/**
 * A collection of values returned by getKafkaClientQuota.
 */
export interface GetKafkaClientQuotaResult {
    /**
     * (Required String) The description of the Kafka Client Quota.
     * - `throughput` (Required Configuration Block) supports the following:
     */
    readonly description: string;
    /**
     * (Required String) The name of the Kafka Client Quota.
     */
    readonly displayName: string;
    readonly environments: outputs.GetKafkaClientQuotaEnvironment[];
    /**
     * (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     */
    readonly id: string;
    readonly kafkaClusters: outputs.GetKafkaClientQuotaKafkaCluster[];
    /**
     * (Required Set of Strings) The list of service accounts to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
     * - `kafkaCluster` (Required Configuration Block) supports the following:
     */
    readonly principals: string[];
    readonly throughputs: outputs.GetKafkaClientQuotaThroughput[];
}

export function getKafkaClientQuotaOutput(args: GetKafkaClientQuotaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaClientQuotaResult> {
    return pulumi.output(args).apply(a => getKafkaClientQuota(a, opts))
}

/**
 * A collection of arguments for invoking getKafkaClientQuota.
 */
export interface GetKafkaClientQuotaOutputArgs {
    /**
     * The ID of the Kafka Client Quota (for example, `cq-abc123`).
     */
    id: pulumi.Input<string>;
}
