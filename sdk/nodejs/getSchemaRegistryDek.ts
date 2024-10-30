// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.SchemaRegistryDek` describes a Schema Registry Data Encryption Key (DEK) data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const myKey = confluentcloud.getSchemaRegistryDek({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     kekName: "my_kek",
 *     subjectName: "my_subject",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const myKey = confluentcloud.getSchemaRegistryDek({
 *     kekName: "my_kek",
 *     subjectName: "my_subject",
 * });
 * ```
 */
export function getSchemaRegistryDek(args: GetSchemaRegistryDekArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryDekResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchemaRegistryDek:getSchemaRegistryDek", {
        "algorithm": args.algorithm,
        "credentials": args.credentials,
        "kekName": args.kekName,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "subjectName": args.subjectName,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryDek.
 */
export interface GetSchemaRegistryDekArgs {
    /**
     * Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    algorithm?: string;
    credentials?: inputs.GetSchemaRegistryDekCredentials;
    /**
     * The name of the KEK used to encrypt this DEK.
     */
    kekName: string;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetSchemaRegistryDekSchemaRegistryCluster;
    /**
     * The subject for this DEK.
     */
    subjectName: string;
    /**
     * The version of this DEK. Defaults to `1`.
     */
    version?: number;
}

/**
 * A collection of values returned by getSchemaRegistryDek.
 */
export interface GetSchemaRegistryDekResult {
    readonly algorithm?: string;
    readonly credentials?: outputs.GetSchemaRegistryDekCredentials;
    /**
     * (Optional String) The encrypted key material for the DEK.
     */
    readonly encryptedKeyMaterial: string;
    /**
     * (Optional Boolean) An optional flag to control whether a dek should be soft or hard deleted.
     */
    readonly hardDelete: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly kekName: string;
    /**
     * (Optional String) The decrypted version of encrypted key material.
     */
    readonly keyMaterial: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetSchemaRegistryDekSchemaRegistryCluster;
    readonly subjectName: string;
    readonly version?: number;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.SchemaRegistryDek` describes a Schema Registry Data Encryption Key (DEK) data source.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const myKey = confluentcloud.getSchemaRegistryDek({
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     kekName: "my_kek",
 *     subjectName: "my_subject",
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const myKey = confluentcloud.getSchemaRegistryDek({
 *     kekName: "my_kek",
 *     subjectName: "my_subject",
 * });
 * ```
 */
export function getSchemaRegistryDekOutput(args: GetSchemaRegistryDekOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryDekResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getSchemaRegistryDek:getSchemaRegistryDek", {
        "algorithm": args.algorithm,
        "credentials": args.credentials,
        "kekName": args.kekName,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "subjectName": args.subjectName,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryDek.
 */
export interface GetSchemaRegistryDekOutputArgs {
    /**
     * Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    algorithm?: pulumi.Input<string>;
    credentials?: pulumi.Input<inputs.GetSchemaRegistryDekCredentialsArgs>;
    /**
     * The name of the KEK used to encrypt this DEK.
     */
    kekName: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetSchemaRegistryDekSchemaRegistryClusterArgs>;
    /**
     * The subject for this DEK.
     */
    subjectName: pulumi.Input<string>;
    /**
     * The version of this DEK. Defaults to `1`.
     */
    version?: pulumi.Input<number>;
}
