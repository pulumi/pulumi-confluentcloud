// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const staging = new confluentcloud.Environment("staging", {
 *     displayName: "Staging",
 *     streamGovernance: {
 *         "package": "ESSENTIALS",
 *     },
 * });
 * const main = new confluentcloud.ProviderIntegration("main", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     aws: {
 *         customerRoleArn: customerRoleArn,
 *     },
 *     displayName: "provider_integration_main",
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Provider Integration by using Environment ID and Provider Integration ID, in the format `<Environment ID>/<Provider Integration ID>`. The following example shows how to import a Provider Integration:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/providerIntegration:ProviderIntegration main env-abc123/cspi-4xg0q
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class ProviderIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ProviderIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProviderIntegrationState, opts?: pulumi.CustomResourceOptions): ProviderIntegration {
        return new ProviderIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/providerIntegration:ProviderIntegration';

    /**
     * Returns true if the given object is an instance of ProviderIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProviderIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProviderIntegration.__pulumiType;
    }

    /**
     * (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     */
    public readonly aws!: pulumi.Output<outputs.ProviderIntegrationAws | undefined>;
    /**
     * The name of the Provider Integration.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.ProviderIntegrationEnvironment>;
    /**
     * (Required List of Strings) List of resource CRNs where this provider integration is being used.
     */
    public /*out*/ readonly usages!: pulumi.Output<string[]>;

    /**
     * Create a ProviderIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProviderIntegrationArgs | ProviderIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProviderIntegrationState | undefined;
            resourceInputs["aws"] = state ? state.aws : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["usages"] = state ? state.usages : undefined;
        } else {
            const args = argsOrState as ProviderIntegrationArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            resourceInputs["aws"] = args ? args.aws : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["usages"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProviderIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProviderIntegration resources.
 */
export interface ProviderIntegrationState {
    /**
     * (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     */
    aws?: pulumi.Input<inputs.ProviderIntegrationAws>;
    /**
     * The name of the Provider Integration.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.ProviderIntegrationEnvironment>;
    /**
     * (Required List of Strings) List of resource CRNs where this provider integration is being used.
     */
    usages?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ProviderIntegration resource.
 */
export interface ProviderIntegrationArgs {
    /**
     * (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     */
    aws?: pulumi.Input<inputs.ProviderIntegrationAws>;
    /**
     * The name of the Provider Integration.
     */
    displayName: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.ProviderIntegrationEnvironment>;
}
