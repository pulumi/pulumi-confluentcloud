// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Tag Binding by using the Schema Registry cluster ID, Tag name, entity name and entity type in the format `<Schema Registry Cluster Id>/<Tag Name>/<Entity Name>/<Entity Type>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/tagBinding:TagBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class TagBinding extends pulumi.CustomResource {
    /**
     * Get an existing TagBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagBindingState, opts?: pulumi.CustomResourceOptions): TagBinding {
        return new TagBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/tagBinding:TagBinding';

    /**
     * Returns true if the given object is an instance of TagBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TagBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TagBinding.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.TagBindingCredentials | undefined>;
    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
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
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.TagBindingSchemaRegistryCluster | undefined>;
    /**
     * The name of the tag to be applied, for example, `PII`.
     */
    public readonly tagName!: pulumi.Output<string>;

    /**
     * Create a TagBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagBindingArgs | TagBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagBindingState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["entityName"] = state ? state.entityName : undefined;
            resourceInputs["entityType"] = state ? state.entityType : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["tagName"] = state ? state.tagName : undefined;
        } else {
            const args = argsOrState as TagBindingArgs | undefined;
            if ((!args || args.entityName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityName'");
            }
            if ((!args || args.entityType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityType'");
            }
            if ((!args || args.tagName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagName'");
            }
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["entityName"] = args ? args.entityName : undefined;
            resourceInputs["entityType"] = args ? args.entityType : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["tagName"] = args ? args.tagName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(TagBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TagBinding resources.
 */
export interface TagBindingState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TagBindingCredentials>;
    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
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
    schemaRegistryCluster?: pulumi.Input<inputs.TagBindingSchemaRegistryCluster>;
    /**
     * The name of the tag to be applied, for example, `PII`.
     */
    tagName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TagBinding resource.
 */
export interface TagBindingArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TagBindingCredentials>;
    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
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
    schemaRegistryCluster?: pulumi.Input<inputs.TagBindingSchemaRegistryCluster>;
    /**
     * The name of the tag to be applied, for example, `PII`.
     */
    tagName: pulumi.Input<string>;
}
