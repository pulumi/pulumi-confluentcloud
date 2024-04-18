// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaClientQuota` describes a Kafka Client Quota.
 *
 * > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const example = await confluentcloud.getKafkaClientQuota({
 *         id: "cq-abc123",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKafkaClientQuota(args: GetKafkaClientQuotaArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaClientQuotaResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
     */
    readonly description: string;
    /**
     * (Required String) The name of the Kafka Client Quota.
     */
    readonly displayName: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly environments: outputs.GetKafkaClientQuotaEnvironment[];
    /**
     * (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly kafkaClusters: outputs.GetKafkaClientQuotaKafkaCluster[];
    /**
     * (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
     */
    readonly principals: string[];
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly throughputs: outputs.GetKafkaClientQuotaThroughput[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.KafkaClientQuota` describes a Kafka Client Quota.
 *
 * > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const example = await confluentcloud.getKafkaClientQuota({
 *         id: "cq-abc123",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKafkaClientQuotaOutput(args: GetKafkaClientQuotaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaClientQuotaResult> {
    return pulumi.output(args).apply((a: any) => getKafkaClientQuota(a, opts))
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
