// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Subject Config by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>/<Subject name>`, for example:
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/subjectConfig:SubjectConfig example lsrc-abc123/test-subject
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class SubjectConfig extends pulumi.CustomResource {
    /**
     * Get an existing SubjectConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubjectConfigState, opts?: pulumi.CustomResourceOptions): SubjectConfig {
        return new SubjectConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/subjectConfig:SubjectConfig';

    /**
     * Returns true if the given object is an instance of SubjectConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubjectConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubjectConfig.__pulumiType;
    }

    /**
     * The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
     */
    public readonly compatibilityLevel!: pulumi.Output<string>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.SubjectConfigCredentials | undefined>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.SubjectConfigSchemaRegistryCluster | undefined>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    public readonly subjectName!: pulumi.Output<string>;

    /**
     * Create a SubjectConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubjectConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubjectConfigArgs | SubjectConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubjectConfigState | undefined;
            resourceInputs["compatibilityLevel"] = state ? state.compatibilityLevel : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["subjectName"] = state ? state.subjectName : undefined;
        } else {
            const args = argsOrState as SubjectConfigArgs | undefined;
            if ((!args || args.subjectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subjectName'");
            }
            resourceInputs["compatibilityLevel"] = args ? args.compatibilityLevel : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["subjectName"] = args ? args.subjectName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SubjectConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubjectConfig resources.
 */
export interface SubjectConfigState {
    /**
     * The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
     */
    compatibilityLevel?: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SubjectConfigCredentials>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SubjectConfigSchemaRegistryCluster>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    subjectName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SubjectConfig resource.
 */
export interface SubjectConfigArgs {
    /**
     * The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
     */
    compatibilityLevel?: pulumi.Input<string>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SubjectConfigCredentials>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SubjectConfigSchemaRegistryCluster>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     */
    subjectName: pulumi.Input<string>;
}
