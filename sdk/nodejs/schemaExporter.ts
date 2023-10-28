// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Schema Exporter by using the Schema Registry cluster ID, Schema Exporter name in the format `<Schema Registry cluster ID>/<Schema Exporter name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/schemaExporter:SchemaExporter main lsrc-8wrx70/test-exporter
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class SchemaExporter extends pulumi.CustomResource {
    /**
     * Get an existing SchemaExporter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaExporterState, opts?: pulumi.CustomResourceOptions): SchemaExporter {
        return new SchemaExporter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/schemaExporter:SchemaExporter';

    /**
     * Returns true if the given object is an instance of SchemaExporter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SchemaExporter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SchemaExporter.__pulumiType;
    }

    /**
     * Block for custom *nonsensitive* configuration properties:
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * Customized context of the exporter if `contextType` is set to `CUSTOM`.
     */
    public readonly context!: pulumi.Output<string>;
    /**
     * Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
     */
    public readonly contextType!: pulumi.Output<string>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.SchemaExporterCredentials | undefined>;
    public readonly destinationSchemaRegistryCluster!: pulumi.Output<outputs.SchemaExporterDestinationSchemaRegistryCluster>;
    /**
     * The configuration setting name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
     */
    public readonly resetOnUpdate!: pulumi.Output<boolean | undefined>;
    /**
     * The REST endpoint of the destination Schema Registry cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.SchemaExporterSchemaRegistryCluster | undefined>;
    /**
     * The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dcOrders`.
     */
    public readonly subjectRenameFormat!: pulumi.Output<string>;
    /**
     * Name of each exporter subject.
     */
    public readonly subjects!: pulumi.Output<string[]>;

    /**
     * Create a SchemaExporter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaExporterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaExporterArgs | SchemaExporterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaExporterState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["contextType"] = state ? state.contextType : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["destinationSchemaRegistryCluster"] = state ? state.destinationSchemaRegistryCluster : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resetOnUpdate"] = state ? state.resetOnUpdate : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subjectRenameFormat"] = state ? state.subjectRenameFormat : undefined;
            resourceInputs["subjects"] = state ? state.subjects : undefined;
        } else {
            const args = argsOrState as SchemaExporterArgs | undefined;
            if ((!args || args.destinationSchemaRegistryCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationSchemaRegistryCluster'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["context"] = args ? args.context : undefined;
            resourceInputs["contextType"] = args ? args.contextType : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["destinationSchemaRegistryCluster"] = args ? args.destinationSchemaRegistryCluster : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resetOnUpdate"] = args ? args.resetOnUpdate : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["subjectRenameFormat"] = args ? args.subjectRenameFormat : undefined;
            resourceInputs["subjects"] = args ? args.subjects : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SchemaExporter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SchemaExporter resources.
 */
export interface SchemaExporterState {
    /**
     * Block for custom *nonsensitive* configuration properties:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Customized context of the exporter if `contextType` is set to `CUSTOM`.
     */
    context?: pulumi.Input<string>;
    /**
     * Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
     */
    contextType?: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaExporterCredentials>;
    destinationSchemaRegistryCluster?: pulumi.Input<inputs.SchemaExporterDestinationSchemaRegistryCluster>;
    /**
     * The configuration setting name.
     */
    name?: pulumi.Input<string>;
    /**
     * The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
     */
    resetOnUpdate?: pulumi.Input<boolean>;
    /**
     * The REST endpoint of the destination Schema Registry cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaExporterSchemaRegistryCluster>;
    /**
     * The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
     */
    status?: pulumi.Input<string>;
    /**
     * Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dcOrders`.
     */
    subjectRenameFormat?: pulumi.Input<string>;
    /**
     * Name of each exporter subject.
     */
    subjects?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SchemaExporter resource.
 */
export interface SchemaExporterArgs {
    /**
     * Block for custom *nonsensitive* configuration properties:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Customized context of the exporter if `contextType` is set to `CUSTOM`.
     */
    context?: pulumi.Input<string>;
    /**
     * Context type of the exporter. Accepted values are: `CUSTOM`, `NONE` or `AUTO`. Defaults to `AUTO`.
     */
    contextType?: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaExporterCredentials>;
    destinationSchemaRegistryCluster: pulumi.Input<inputs.SchemaExporterDestinationSchemaRegistryCluster>;
    /**
     * The configuration setting name.
     */
    name?: pulumi.Input<string>;
    /**
     * The flag to control whether to reset the exporter when updating configs. Defaults to `false`.
     */
    resetOnUpdate?: pulumi.Input<boolean>;
    /**
     * The REST endpoint of the destination Schema Registry cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaExporterSchemaRegistryCluster>;
    /**
     * The status of the schema exporter. Accepted values are: `RUNNING` and `PAUSED`.
     */
    status?: pulumi.Input<string>;
    /**
     * Format string for the subject name in the destination cluster, which may contain `${subject}` as a placeholder for the originating subject name. For example, `dc_${subject}` for the subject orders will map to the destination subject name `dcOrders`.
     */
    subjectRenameFormat?: pulumi.Input<string>;
    /**
     * Name of each exporter subject.
     */
    subjects?: pulumi.Input<pulumi.Input<string>[]>;
}