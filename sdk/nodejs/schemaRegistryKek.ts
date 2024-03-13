// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Schema Registry Key by using the Schema Registry cluster ID, Kek name in the format `<Schema Registry cluster ID>/<Kek name>`, for example:
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
 *
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/schemaRegistryKek:SchemaRegistryKek aws_key lsrc-8wrx70/aws_key
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class SchemaRegistryKek extends pulumi.CustomResource {
    /**
     * Get an existing SchemaRegistryKek resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaRegistryKekState, opts?: pulumi.CustomResourceOptions): SchemaRegistryKek {
        return new SchemaRegistryKek(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/schemaRegistryKek:SchemaRegistryKek';

    /**
     * Returns true if the given object is an instance of SchemaRegistryKek.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SchemaRegistryKek {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SchemaRegistryKek.__pulumiType;
    }

    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.SchemaRegistryKekCredentials | undefined>;
    /**
     * The optional description for the KEK.
     */
    public readonly doc!: pulumi.Output<string>;
    /**
     * Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
     * on destroy. Defaults to `false` (soft delete).
     */
    public readonly hardDelete!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the key from KMS. 
     * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
     * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
     * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
     */
    public readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
     */
    public readonly kmsType!: pulumi.Output<string>;
    /**
     * The custom property name (for example, `KeyUsage`).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
     */
    public readonly properties!: pulumi.Output<{[key: string]: string}>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    public readonly schemaRegistryCluster!: pulumi.Output<outputs.SchemaRegistryKekSchemaRegistryCluster | undefined>;
    /**
     * The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
     */
    public readonly shared!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SchemaRegistryKek resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaRegistryKekArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaRegistryKekArgs | SchemaRegistryKekState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaRegistryKekState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["doc"] = state ? state.doc : undefined;
            resourceInputs["hardDelete"] = state ? state.hardDelete : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["kmsType"] = state ? state.kmsType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = state ? state.schemaRegistryCluster : undefined;
            resourceInputs["shared"] = state ? state.shared : undefined;
        } else {
            const args = argsOrState as SchemaRegistryKekArgs | undefined;
            if ((!args || args.kmsKeyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kmsKeyId'");
            }
            if ((!args || args.kmsType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kmsType'");
            }
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["doc"] = args ? args.doc : undefined;
            resourceInputs["hardDelete"] = args ? args.hardDelete : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["kmsType"] = args ? args.kmsType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["schemaRegistryCluster"] = args ? args.schemaRegistryCluster : undefined;
            resourceInputs["shared"] = args ? args.shared : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SchemaRegistryKek.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SchemaRegistryKek resources.
 */
export interface SchemaRegistryKekState {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaRegistryKekCredentials>;
    /**
     * The optional description for the KEK.
     */
    doc?: pulumi.Input<string>;
    /**
     * Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
     * on destroy. Defaults to `false` (soft delete).
     */
    hardDelete?: pulumi.Input<boolean>;
    /**
     * The ID of the key from KMS. 
     * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
     * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
     * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
     */
    kmsType?: pulumi.Input<string>;
    /**
     * The custom property name (for example, `KeyUsage`).
     */
    name?: pulumi.Input<string>;
    /**
     * The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
     */
    properties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaRegistryKekSchemaRegistryCluster>;
    /**
     * The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
     */
    shared?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SchemaRegistryKek resource.
 */
export interface SchemaRegistryKekArgs {
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.SchemaRegistryKekCredentials>;
    /**
     * The optional description for the KEK.
     */
    doc?: pulumi.Input<string>;
    /**
     * Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
     * on destroy. Defaults to `false` (soft delete).
     */
    hardDelete?: pulumi.Input<boolean>;
    /**
     * The ID of the key from KMS. 
     * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
     * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
     * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
     */
    kmsKeyId: pulumi.Input<string>;
    /**
     * The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
     */
    kmsType: pulumi.Input<string>;
    /**
     * The custom property name (for example, `KeyUsage`).
     */
    name?: pulumi.Input<string>;
    /**
     * The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
     */
    properties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.SchemaRegistryKekSchemaRegistryCluster>;
    /**
     * The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
     */
    shared?: pulumi.Input<boolean>;
}
