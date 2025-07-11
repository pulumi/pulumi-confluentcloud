// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.TagBinding` describes a Tag Binding data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getTagBinding({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     tagName: "PII",
 *     entityName: "lsrc-8wrx70:.:100001",
 *     entityType: "sr_schema",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getTagBinding({
 *     tagName: "PII",
 *     entityName: "lsrc-8wrx70:.:100001",
 *     entityType: "sr_schema",
 * });
 * ```
 * > **Note:** We also support `schemaRegistryRestEndpoint` instead of `catalogRestEndpoint` for the time being.
 */
export function getTagBinding(args: GetTagBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetTagBindingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getTagBinding:getTagBinding", {
        "credentials": args.credentials,
        "entityName": args.entityName,
        "entityType": args.entityType,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "tagName": args.tagName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTagBinding.
 */
export interface GetTagBindingArgs {
    credentials?: inputs.GetTagBindingCredentials;
    /**
     * The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entityName` attribute.
     */
    entityName: string;
    /**
     * The entity type, for example, `srSchema`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    entityType: string;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetTagBindingSchemaRegistryCluster;
    /**
     * The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     */
    tagName: string;
}

/**
 * A collection of values returned by getTagBinding.
 */
export interface GetTagBindingResult {
    readonly credentials?: outputs.GetTagBindingCredentials;
    readonly entityName: string;
    readonly entityType: string;
    /**
     * (Required String) The ID of the Tag Binding, in the format `<Schema Registry Cluster Id>/<Tag Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
     */
    readonly id: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetTagBindingSchemaRegistryCluster;
    readonly tagName: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.TagBinding` describes a Tag Binding data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getTagBinding({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     tagName: "PII",
 *     entityName: "lsrc-8wrx70:.:100001",
 *     entityType: "sr_schema",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getTagBinding({
 *     tagName: "PII",
 *     entityName: "lsrc-8wrx70:.:100001",
 *     entityType: "sr_schema",
 * });
 * ```
 * > **Note:** We also support `schemaRegistryRestEndpoint` instead of `catalogRestEndpoint` for the time being.
 */
export function getTagBindingOutput(args: GetTagBindingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTagBindingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getTagBinding:getTagBinding", {
        "credentials": args.credentials,
        "entityName": args.entityName,
        "entityType": args.entityType,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "tagName": args.tagName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTagBinding.
 */
export interface GetTagBindingOutputArgs {
    credentials?: pulumi.Input<inputs.GetTagBindingCredentialsArgs>;
    /**
     * The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entityName` attribute.
     */
    entityName: pulumi.Input<string>;
    /**
     * The entity type, for example, `srSchema`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    entityType: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetTagBindingSchemaRegistryClusterArgs>;
    /**
     * The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     */
    tagName: pulumi.Input<string>;
}
