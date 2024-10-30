// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.BusinessMetadataBinding` provides a Business Metadata Binding resource that enables creating, editing, and deleting Business Metadata Bindings on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getKafkaTopic({
 *     topicName: "orders",
 * });
 * const mainBusinessMetadataBinding = new confluentcloud.BusinessMetadataBinding("main", {
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
 *     },
 *     businessMetadataName: pii.name,
 *     entityName: main.then(main => `${schemaRegistryId}:${kafkaId}:${main.topicName}`),
 *     entityType: "kafka_topic",
 *     attributes: {
 *         team: "teamName",
 *         email: "team@company.com",
 *     },
 * });
 * ```
 *
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getKafkaTopic({
 *     topicName: "orders",
 * });
 * const mainBusinessMetadataBinding = new confluentcloud.BusinessMetadataBinding("main", {
 *     businessMetadataName: pii.name,
 *     entityName: main.then(main => `${schemaRegistryId}:${kafkaId}:${main.topicName}`),
 *     entityType: "kafka_topic",
 *     attributes: {
 *         team: "teamName",
 *         email: "team@company.com",
 *     },
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end example might help to get started with [Stream Catalog](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html):
 * * stream-catalog
 *
 * ## Import
 *
 * You can import a Business Metadata Binding by using the Schema Registry cluster ID, Business Metadata name, entity name and entity type in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example:
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class BusinessMetadataBinding extends pulumi.CustomResource {
    /**
     * Get an existing BusinessMetadataBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BusinessMetadataBindingState, opts?: pulumi.CustomResourceOptions): BusinessMetadataBinding {
        return new BusinessMetadataBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding';

    /**
     * Returns true if the given object is an instance of BusinessMetadataBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BusinessMetadataBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BusinessMetadataBinding.__pulumiType;
    }

    /**
     * The attributes.
     */
    public readonly attributes!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     */
    public readonly businessMetadataName!: pulumi.Output<string>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.BusinessMetadataBindingCredentials | undefined>;
    /**
     * The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     */
    public readonly entityName!: pulumi.Output<string>;
    /**
     * The entity type, for example, `srSchema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     */
    public readonly entityType!: pulumi.Output<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.BusinessMetadataBindingSchemaRegistryCluster | undefined>;

    /**
     * Create a BusinessMetadataBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BusinessMetadataBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BusinessMetadataBindingArgs | BusinessMetadataBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BusinessMetadataBindingState | undefined;
            resourceInputs["attributes"] = state ? state.attributes : undefined;
            resourceInputs["businessMetadataName"] = state ? state.businessMetadataName : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["entityName"] = state ? state.entityName : undefined;
            resourceInputs["entityType"] = state ? state.entityType : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
        } else {
            const args = argsOrState as BusinessMetadataBindingArgs | undefined;
            if ((!args || args.businessMetadataName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'businessMetadataName'");
            }
            if ((!args || args.entityName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityName'");
            }
            if ((!args || args.entityType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityType'");
            }
            resourceInputs["attributes"] = args ? args.attributes : undefined;
            resourceInputs["businessMetadataName"] = args ? args.businessMetadataName : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["entityName"] = args ? args.entityName : undefined;
            resourceInputs["entityType"] = args ? args.entityType : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BusinessMetadataBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BusinessMetadataBinding resources.
 */
export interface BusinessMetadataBindingState {
    /**
     * The attributes.
     */
    attributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     */
    businessMetadataName?: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.BusinessMetadataBindingCredentials>;
    /**
     * The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     */
    entityName?: pulumi.Input<string>;
    /**
     * The entity type, for example, `srSchema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     */
    entityType?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.BusinessMetadataBindingSchemaRegistryCluster>;
}

/**
 * The set of arguments for constructing a BusinessMetadataBinding resource.
 */
export interface BusinessMetadataBindingArgs {
    /**
     * The attributes.
     */
    attributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     */
    businessMetadataName: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.BusinessMetadataBindingCredentials>;
    /**
     * The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     */
    entityName: pulumi.Input<string>;
    /**
     * The entity type, for example, `srSchema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     */
    entityType: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.BusinessMetadataBindingSchemaRegistryCluster>;
}
