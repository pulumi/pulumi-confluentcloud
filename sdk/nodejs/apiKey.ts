// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Kafka API Key by using the Environment ID and Kafka API Key ID in the format `<Environment ID>/<Kafka API Key ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export API_KEY_SECRET="<api_key_secret>" # Option #1Kafka API Key
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key "env-abc123/UTT6WDRXX7FHD2GV"
 * ```
 *
 *  You can import a Cloud API Key by using Cloud API Key ID, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export API_KEY_SECRET="<api_key_secret>" # Option #2Cloud API Key
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key "4UEXOMMWIBE5KZQG"
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class ApiKey extends pulumi.CustomResource {
    /**
     * Get an existing ApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiKeyState, opts?: pulumi.CustomResourceOptions): ApiKey {
        return new ApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/apiKey:ApiKey';

    /**
     * Returns true if the given object is an instance of ApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiKey.__pulumiType;
    }

    /**
     * A free-form description of the API Account.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     */
    public readonly disableWaitForReady!: pulumi.Output<boolean | undefined>;
    /**
     * A human-readable name for the API Key.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
     */
    public readonly managedResource!: pulumi.Output<outputs.ApiKeyManagedResource | undefined>;
    /**
     * The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
     */
    public readonly owner!: pulumi.Output<outputs.ApiKeyOwner>;
    /**
     * (Required String, Sensitive) The secret of the API Key.
     */
    public /*out*/ readonly secret!: pulumi.Output<string>;

    /**
     * Create a ApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiKeyArgs | ApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiKeyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disableWaitForReady"] = state ? state.disableWaitForReady : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["managedResource"] = state ? state.managedResource : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
        } else {
            const args = argsOrState as ApiKeyArgs | undefined;
            if ((!args || args.owner === undefined) && !opts.urn) {
                throw new Error("Missing required property 'owner'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disableWaitForReady"] = args ? args.disableWaitForReady : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["managedResource"] = args ? args.managedResource : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["secret"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiKey resources.
 */
export interface ApiKeyState {
    /**
     * A free-form description of the API Account.
     */
    description?: pulumi.Input<string>;
    /**
     * An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     */
    disableWaitForReady?: pulumi.Input<boolean>;
    /**
     * A human-readable name for the API Key.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
     */
    managedResource?: pulumi.Input<inputs.ApiKeyManagedResource>;
    /**
     * The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
     */
    owner?: pulumi.Input<inputs.ApiKeyOwner>;
    /**
     * (Required String, Sensitive) The secret of the API Key.
     */
    secret?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiKey resource.
 */
export interface ApiKeyArgs {
    /**
     * A free-form description of the API Account.
     */
    description?: pulumi.Input<string>;
    /**
     * An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     */
    disableWaitForReady?: pulumi.Input<boolean>;
    /**
     * A human-readable name for the API Key.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
     */
    managedResource?: pulumi.Input<inputs.ApiKeyManagedResource>;
    /**
     * The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
     */
    owner: pulumi.Input<inputs.ApiKeyOwner>;
}
