// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Peering by using Environment ID and Peering ID, in the format `<Environment ID>/<Peering ID>`. The following example shows how to import a Peering$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/peering:Peering my_peer env-abc123/peer-abc123
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Peering extends pulumi.CustomResource {
    /**
     * Get an existing Peering resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PeeringState, opts?: pulumi.CustomResourceOptions): Peering {
        return new Peering(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/peering:Peering';

    /**
     * Returns true if the given object is an instance of Peering.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Peering {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Peering.__pulumiType;
    }

    public readonly aws!: pulumi.Output<outputs.PeeringAws | undefined>;
    public readonly azure!: pulumi.Output<outputs.PeeringAzure | undefined>;
    /**
     * The name of the Peering.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.PeeringEnvironment>;
    public readonly gcp!: pulumi.Output<outputs.PeeringGcp | undefined>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    public readonly network!: pulumi.Output<outputs.PeeringNetwork>;

    /**
     * Create a Peering resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PeeringArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PeeringArgs | PeeringState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PeeringState | undefined;
            resourceInputs["aws"] = state ? state.aws : undefined;
            resourceInputs["azure"] = state ? state.azure : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["gcp"] = state ? state.gcp : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
        } else {
            const args = argsOrState as PeeringArgs | undefined;
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            resourceInputs["aws"] = args ? args.aws : undefined;
            resourceInputs["azure"] = args ? args.azure : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["gcp"] = args ? args.gcp : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Peering.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Peering resources.
 */
export interface PeeringState {
    aws?: pulumi.Input<inputs.PeeringAws>;
    azure?: pulumi.Input<inputs.PeeringAzure>;
    /**
     * The name of the Peering.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.PeeringEnvironment>;
    gcp?: pulumi.Input<inputs.PeeringGcp>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network?: pulumi.Input<inputs.PeeringNetwork>;
}

/**
 * The set of arguments for constructing a Peering resource.
 */
export interface PeeringArgs {
    aws?: pulumi.Input<inputs.PeeringAws>;
    azure?: pulumi.Input<inputs.PeeringAzure>;
    /**
     * The name of the Peering.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.PeeringEnvironment>;
    gcp?: pulumi.Input<inputs.PeeringGcp>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network: pulumi.Input<inputs.PeeringNetwork>;
}
