// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Gateway` provides a Gateway resource that enables creating, editing, and deleting Gateways on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {displayName: "Development"});
 * const main = new confluentcloud.Gateway("main", {
 *     displayName: "my_gateway",
 *     environment: {
 *         id: development.id,
 *     },
 *     awsEgressPrivateLinkGateway: {
 *         region: "us-west-2",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Gateway by using Environment ID and Gateway ID, in the format `<Environment ID>/<Gateway ID>`. The following example shows how to import a Gateway:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/gateway:Gateway main env-abc123/gw-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    /**
     * (Optional Configuration Block) supports the following:
     */
    public readonly awsEgressPrivateLinkGateway!: pulumi.Output<outputs.GatewayAwsEgressPrivateLinkGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    public readonly awsPrivateNetworkInterfaceGateway!: pulumi.Output<outputs.GatewayAwsPrivateNetworkInterfaceGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    public readonly azureEgressPrivateLinkGateway!: pulumi.Output<outputs.GatewayAzureEgressPrivateLinkGateway>;
    /**
     * The name of the Gateway.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.GatewayEnvironment>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayState | undefined;
            resourceInputs["awsEgressPrivateLinkGateway"] = state ? state.awsEgressPrivateLinkGateway : undefined;
            resourceInputs["awsPrivateNetworkInterfaceGateway"] = state ? state.awsPrivateNetworkInterfaceGateway : undefined;
            resourceInputs["azureEgressPrivateLinkGateway"] = state ? state.azureEgressPrivateLinkGateway : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            resourceInputs["awsEgressPrivateLinkGateway"] = args ? args.awsEgressPrivateLinkGateway : undefined;
            resourceInputs["awsPrivateNetworkInterfaceGateway"] = args ? args.awsPrivateNetworkInterfaceGateway : undefined;
            resourceInputs["azureEgressPrivateLinkGateway"] = args ? args.azureEgressPrivateLinkGateway : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Gateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * (Optional Configuration Block) supports the following:
     */
    awsEgressPrivateLinkGateway?: pulumi.Input<inputs.GatewayAwsEgressPrivateLinkGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    awsPrivateNetworkInterfaceGateway?: pulumi.Input<inputs.GatewayAwsPrivateNetworkInterfaceGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    azureEgressPrivateLinkGateway?: pulumi.Input<inputs.GatewayAzureEgressPrivateLinkGateway>;
    /**
     * The name of the Gateway.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.GatewayEnvironment>;
}

/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * (Optional Configuration Block) supports the following:
     */
    awsEgressPrivateLinkGateway?: pulumi.Input<inputs.GatewayAwsEgressPrivateLinkGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    awsPrivateNetworkInterfaceGateway?: pulumi.Input<inputs.GatewayAwsPrivateNetworkInterfaceGateway>;
    /**
     * (Optional Configuration Block) supports the following:
     */
    azureEgressPrivateLinkGateway?: pulumi.Input<inputs.GatewayAzureEgressPrivateLinkGateway>;
    /**
     * The name of the Gateway.
     */
    displayName: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.GatewayEnvironment>;
}
