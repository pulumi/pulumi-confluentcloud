// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * You can import a Schema by using the Schema Registry cluster ID, Subject name, and unique identifier (or `latest` when `recreate_on_update = false`) of the Schema in the format `<Schema Registry cluster ID>/<Subject name>/<Schema identifier>`, for example:
 *
 * Option A: recreate_on_update = false (by default)
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/latest
 * ```
 *
 * Option B: recreate_on_update = true
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/100003
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Schema extends pulumi.CustomResource {
    /**
     * Get an existing Schema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaState, opts?: pulumi.CustomResourceOptions): Schema {
        return new Schema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/schema:Schema';

    /**
     * Returns true if the given object is an instance of Schema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schema.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.SchemaCredentials | undefined>;
    /**
     * The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     */
    public readonly format!: pulumi.Output<string>;
    /**
     * An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
     */
    public readonly hardDelete!: pulumi.Output<boolean | undefined>;
    /**
     * See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    public readonly metadata!: pulumi.Output<outputs.SchemaMetadata>;
    /**
     * An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
     */
    public readonly recreateOnUpdate!: pulumi.Output<boolean | undefined>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    public readonly ruleset!: pulumi.Output<outputs.SchemaRuleset>;
    /**
     * The schema string, for example, `file("./schema_version_1.avsc")`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     */
    public /*out*/ readonly schemaIdentifier!: pulumi.Output<number>;
    /**
     * The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     */
    public readonly schemaReferences!: pulumi.Output<outputs.SchemaSchemaReference[] | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.SchemaSchemaRegistryCluster | undefined>;
    /**
     * An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
     */
    public readonly skipValidationDuringPlan!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    public readonly subjectName!: pulumi.Output<string>;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a Schema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaArgs | SchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["hardDelete"] = state ? state.hardDelete : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["recreateOnUpdate"] = state ? state.recreateOnUpdate : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["ruleset"] = state ? state.ruleset : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["schemaIdentifier"] = state ? state.schemaIdentifier : undefined;
            resourceInputs["schemaReferences"] = state ? state.schemaReferences : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["skipValidationDuringPlan"] = state ? state.skipValidationDuringPlan : undefined;
            resourceInputs["subjectName"] = state ? state.subjectName : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as SchemaArgs | undefined;
            if ((!args || args.format === undefined) && !opts.urn) {
                throw new Error("Missing required property 'format'");
            }
            if ((!args || args.subjectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subjectName'");
            }
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["hardDelete"] = args ? args.hardDelete : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["recreateOnUpdate"] = args ? args.recreateOnUpdate : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["ruleset"] = args ? args.ruleset : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["schemaReferences"] = args ? args.schemaReferences : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["skipValidationDuringPlan"] = args ? args.skipValidationDuringPlan : undefined;
            resourceInputs["subjectName"] = args ? args.subjectName : undefined;
            resourceInputs["schemaIdentifier"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Schema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schema resources.
 */
export interface SchemaState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaCredentials>;
    /**
     * The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     */
    format?: pulumi.Input<string>;
    /**
     * An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
     */
    hardDelete?: pulumi.Input<boolean>;
    /**
     * See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    metadata?: pulumi.Input<inputs.SchemaMetadata>;
    /**
     * An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
     */
    recreateOnUpdate?: pulumi.Input<boolean>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    ruleset?: pulumi.Input<inputs.SchemaRuleset>;
    /**
     * The schema string, for example, `file("./schema_version_1.avsc")`.
     */
    schema?: pulumi.Input<string>;
    /**
     * (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     */
    schemaIdentifier?: pulumi.Input<number>;
    /**
     * The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     */
    schemaReferences?: pulumi.Input<pulumi.Input<inputs.SchemaSchemaReference>[]>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaSchemaRegistryCluster>;
    /**
     * An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
     */
    skipValidationDuringPlan?: pulumi.Input<boolean>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    subjectName?: pulumi.Input<string>;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Schema resource.
 */
export interface SchemaArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaCredentials>;
    /**
     * The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     */
    format: pulumi.Input<string>;
    /**
     * An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
     */
    hardDelete?: pulumi.Input<boolean>;
    /**
     * See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    metadata?: pulumi.Input<inputs.SchemaMetadata>;
    /**
     * An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
     */
    recreateOnUpdate?: pulumi.Input<boolean>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    ruleset?: pulumi.Input<inputs.SchemaRuleset>;
    /**
     * The schema string, for example, `file("./schema_version_1.avsc")`.
     */
    schema?: pulumi.Input<string>;
    /**
     * The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     */
    schemaReferences?: pulumi.Input<pulumi.Input<inputs.SchemaSchemaReference>[]>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaSchemaRegistryCluster>;
    /**
     * An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
     */
    skipValidationDuringPlan?: pulumi.Input<boolean>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    subjectName: pulumi.Input<string>;
}
