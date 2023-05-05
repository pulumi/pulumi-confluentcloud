// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Business Metadata by using the Schema Registry cluster ID, Business Metadata name in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/businessMetadata:BusinessMetadata pii lsrc-8wrx70/PII
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class BusinessMetadata extends pulumi.CustomResource {
    /**
     * Get an existing BusinessMetadata resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BusinessMetadataState, opts?: pulumi.CustomResourceOptions): BusinessMetadata {
        return new BusinessMetadata(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/businessMetadata:BusinessMetadata';

    /**
     * Returns true if the given object is an instance of BusinessMetadata.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BusinessMetadata {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BusinessMetadata.__pulumiType;
    }

    /**
     * The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     */
    public readonly attributeDefinitions!: pulumi.Output<outputs.BusinessMetadataAttributeDefinition[]>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.BusinessMetadataCredentials | undefined>;
    /**
     * The description of the Business Metadata.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the attribute.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.BusinessMetadataSchemaRegistryCluster | undefined>;
    /**
     * (Required Integer) The version of the Business Metadata, for example, `1`.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a BusinessMetadata resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BusinessMetadataArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BusinessMetadataArgs | BusinessMetadataState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BusinessMetadataState | undefined;
            resourceInputs["attributeDefinitions"] = state ? state.attributeDefinitions : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as BusinessMetadataArgs | undefined;
            resourceInputs["attributeDefinitions"] = args ? args.attributeDefinitions : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BusinessMetadata.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BusinessMetadata resources.
 */
export interface BusinessMetadataState {
    /**
     * The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     */
    attributeDefinitions?: pulumi.Input<pulumi.Input<inputs.BusinessMetadataAttributeDefinition>[]>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.BusinessMetadataCredentials>;
    /**
     * The description of the Business Metadata.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the attribute.
     */
    name?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.BusinessMetadataSchemaRegistryCluster>;
    /**
     * (Required Integer) The version of the Business Metadata, for example, `1`.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a BusinessMetadata resource.
 */
export interface BusinessMetadataArgs {
    /**
     * The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     */
    attributeDefinitions?: pulumi.Input<pulumi.Input<inputs.BusinessMetadataAttributeDefinition>[]>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.BusinessMetadataCredentials>;
    /**
     * The description of the Business Metadata.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the attribute.
     */
    name?: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.BusinessMetadataSchemaRegistryCluster>;
}
