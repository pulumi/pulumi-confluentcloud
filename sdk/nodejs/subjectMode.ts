// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const example = new confluentcloud.SubjectMode("example", {
 *     schemaRegistryCluster: {
 *         id: essentials.id,
 *     },
 *     restEndpoint: essentials.restEndpoint,
 *     subjectName: "proto-purchase-value",
 *     mode: "READONLY",
 *     credentials: {
 *         key: "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
 *         secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
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
 * const example = new confluentcloud.SubjectMode("example", {
 *     subjectName: "proto-purchase-value",
 *     mode: "READONLY",
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Subject Mode by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/subjectMode:SubjectMode example lsrc-abc123/test-subject
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class SubjectMode extends pulumi.CustomResource {
    /**
     * Get an existing SubjectMode resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubjectModeState, opts?: pulumi.CustomResourceOptions): SubjectMode {
        return new SubjectMode(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/subjectMode:SubjectMode';

    /**
     * Returns true if the given object is an instance of SubjectMode.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubjectMode {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubjectMode.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.SubjectModeCredentials | undefined>;
    /**
     * An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.SubjectModeSchemaRegistryCluster | undefined>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    public readonly subjectName!: pulumi.Output<string>;

    /**
     * Create a SubjectMode resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubjectModeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubjectModeArgs | SubjectModeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubjectModeState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["subjectName"] = state ? state.subjectName : undefined;
        } else {
            const args = argsOrState as SubjectModeArgs | undefined;
            if ((!args || args.subjectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subjectName'");
            }
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["subjectName"] = args ? args.subjectName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SubjectMode.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubjectMode resources.
 */
export interface SubjectModeState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SubjectModeCredentials>;
    /**
     * An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     */
    mode?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SubjectModeSchemaRegistryCluster>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    subjectName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SubjectMode resource.
 */
export interface SubjectModeArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SubjectModeCredentials>;
    /**
     * An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     */
    mode?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SubjectModeSchemaRegistryCluster>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    subjectName: pulumi.Input<string>;
}
