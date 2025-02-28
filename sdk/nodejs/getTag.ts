// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Tag` describes a Tag data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const pii = confluentcloud.getTag({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     name: "PII",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const pii = confluentcloud.getTag({
 *     name: "PII",
 * });
 * ```
 * > **Note:** We also support `schemaRegistryRestEndpoint` instead of `catalogRestEndpoint` for the time being.
 */
export function getTag(args: GetTagArgs, opts?: pulumi.InvokeOptions): Promise<GetTagResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getTag:getTag", {
        "credentials": args.credentials,
        "name": args.name,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getTag.
 */
export interface GetTagArgs {
    credentials?: inputs.GetTagCredentials;
    /**
     * The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    name: string;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetTagSchemaRegistryCluster;
}

/**
 * A collection of values returned by getTag.
 */
export interface GetTagResult {
    readonly credentials?: outputs.GetTagCredentials;
    /**
     * (Optional String) The description of the tag.
     */
    readonly description: string;
    /**
     * (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`.
     */
    readonly entityTypes: string[];
    /**
     * (Required String) The ID of the Tag, in the format `<Schema Registry cluster ID>/<Tag name>`, for example, `lsrc-8wrx70/PII`.
     */
    readonly id: string;
    readonly name: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetTagSchemaRegistryCluster;
    /**
     * (Optional Integer) The version, for example, `1`.
     */
    readonly version: number;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Tag` describes a Tag data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const pii = confluentcloud.getTag({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     name: "PII",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const pii = confluentcloud.getTag({
 *     name: "PII",
 * });
 * ```
 * > **Note:** We also support `schemaRegistryRestEndpoint` instead of `catalogRestEndpoint` for the time being.
 */
export function getTagOutput(args: GetTagOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTagResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getTag:getTag", {
        "credentials": args.credentials,
        "name": args.name,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getTag.
 */
export interface GetTagOutputArgs {
    credentials?: pulumi.Input<inputs.GetTagCredentialsArgs>;
    /**
     * The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    name: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetTagSchemaRegistryClusterArgs>;
}
