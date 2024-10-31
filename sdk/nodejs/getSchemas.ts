// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getSchemas` describes a Schema data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemas({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     filter: {
 *         subjectPrefix: "examples.record",
 *         latestOnly: false,
 *         deleted: true,
 *     },
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 * });
 * export const schemas = main.then(main => main.schemas);
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemas({
 *     filter: {
 *         subjectPrefix: "examples.record",
 *         latestOnly: false,
 *         deleted: true,
 *     },
 * });
 * export const schemas = main.then(main => main.schemas);
 * ```
 */
export function getSchemas(args?: GetSchemasArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemasResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchemas:getSchemas", {
        "credentials": args.credentials,
        "filter": args.filter,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasArgs {
    credentials?: inputs.GetSchemasCredentials;
    filter?: inputs.GetSchemasFilter;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetSchemasSchemaRegistryCluster;
}

/**
 * A collection of values returned by getSchemas.
 */
export interface GetSchemasResult {
    readonly credentials?: outputs.GetSchemasCredentials;
    readonly filter?: outputs.GetSchemasFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetSchemasSchemaRegistryCluster;
    /**
     * (List of Object) List of schemas. Each schema object exports the following attributes:
     */
    readonly schemas: outputs.GetSchemasSchema[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getSchemas` describes a Schema data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemas({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     filter: {
 *         subjectPrefix: "examples.record",
 *         latestOnly: false,
 *         deleted: true,
 *     },
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 * });
 * export const schemas = main.then(main => main.schemas);
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getSchemas({
 *     filter: {
 *         subjectPrefix: "examples.record",
 *         latestOnly: false,
 *         deleted: true,
 *     },
 * });
 * export const schemas = main.then(main => main.schemas);
 * ```
 */
export function getSchemasOutput(args?: GetSchemasOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemasResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getSchemas:getSchemas", {
        "credentials": args.credentials,
        "filter": args.filter,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasOutputArgs {
    credentials?: pulumi.Input<inputs.GetSchemasCredentialsArgs>;
    filter?: pulumi.Input<inputs.GetSchemasFilterArgs>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetSchemasSchemaRegistryClusterArgs>;
}
