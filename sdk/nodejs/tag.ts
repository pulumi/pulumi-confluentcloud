// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Tag by using the Schema Registry cluster ID, Tag name in the format `<Schema Registry cluster ID>/<Tag name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/tag:Tag pii lsrc-8wrx70/PII
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Tag extends pulumi.CustomResource {
    /**
     * Get an existing Tag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagState, opts?: pulumi.CustomResourceOptions): Tag {
        return new Tag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/tag:Tag';

    /**
     * Returns true if the given object is an instance of Tag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tag.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.TagCredentials | undefined>;
    /**
     * The description of the tag.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     */
    public /*out*/ readonly entityTypes!: pulumi.Output<string[]>;
    /**
     * The name of the tag, for example, `PII`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.TagSchemaRegistryCluster | undefined>;
    /**
     * (Optional Integer) The version, for example, `1`.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a Tag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagArgs | TagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["entityTypes"] = state ? state.entityTypes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["entityTypes"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Tag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tag resources.
 */
export interface TagState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TagCredentials>;
    /**
     * The description of the tag.
     */
    description?: pulumi.Input<string>;
    /**
     * (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     */
    entityTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the tag, for example, `PII`.
     */
    name?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.TagSchemaRegistryCluster>;
    /**
     * (Optional Integer) The version, for example, `1`.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TagCredentials>;
    /**
     * The description of the tag.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the tag, for example, `PII`.
     */
    name?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.TagSchemaRegistryCluster>;
}
