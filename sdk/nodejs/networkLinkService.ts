// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Example Network Link Service on AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {displayName: "Development"});
 * const aws_private_link = new confluentcloud.Network("aws-private-link", {
 *     displayName: "AWS Private Link Network",
 *     cloud: "AWS",
 *     region: "us-east-1",
 *     connectionTypes: ["PRIVATELINK"],
 *     zones: [
 *         "use1-az1",
 *         "use1-az2",
 *         "use1-az6",
 *     ],
 *     environment: {
 *         id: development.id,
 *     },
 * });
 * const awsNls = new confluentcloud.NetworkLinkService("aws_nls", {
 *     displayName: "AWS Private Link network link service",
 *     environment: {
 *         id: development.id,
 *     },
 *     network: {
 *         id: aws_private_link.id,
 *     },
 *     description: "Test NL service",
 *     accept: {
 *         environments: [
 *             "env-5678",
 *             "env-0923",
 *         ],
 *         networks: ["n-1234"],
 *     },
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.NetworkLinkService` resource:
 * * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks
 *
 * ## Import
 *
 * You can import a Network Link Service by using Environment ID and Network Link Service ID, in the format `<Environment ID>/<Network Link Service ID>`. The following example shows how to import a Network Link Service:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/networkLinkService:NetworkLinkService my_nls env-abc123/nls-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class NetworkLinkService extends pulumi.CustomResource {
    /**
     * Get an existing NetworkLinkService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkLinkServiceState, opts?: pulumi.CustomResourceOptions): NetworkLinkService {
        return new NetworkLinkService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/networkLinkService:NetworkLinkService';

    /**
     * Returns true if the given object is an instance of NetworkLinkService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkLinkService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkLinkService.__pulumiType;
    }

    public readonly accept!: pulumi.Output<outputs.NetworkLinkServiceAccept>;
    /**
     * The description of the Network Link Service.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The name of the Network Link Service.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.NetworkLinkServiceEnvironment>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    public readonly network!: pulumi.Output<outputs.NetworkLinkServiceNetwork>;
    /**
     * (Required String) The Confluent Resource Name of the Network Link Service.
     */
    public /*out*/ readonly resourceName!: pulumi.Output<string>;

    /**
     * Create a NetworkLinkService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkLinkServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkLinkServiceArgs | NetworkLinkServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkLinkServiceState | undefined;
            resourceInputs["accept"] = state ? state.accept : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
        } else {
            const args = argsOrState as NetworkLinkServiceArgs | undefined;
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            resourceInputs["accept"] = args ? args.accept : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["resourceName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkLinkService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkLinkService resources.
 */
export interface NetworkLinkServiceState {
    accept?: pulumi.Input<inputs.NetworkLinkServiceAccept>;
    /**
     * The description of the Network Link Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Network Link Service.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.NetworkLinkServiceEnvironment>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network?: pulumi.Input<inputs.NetworkLinkServiceNetwork>;
    /**
     * (Required String) The Confluent Resource Name of the Network Link Service.
     */
    resourceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkLinkService resource.
 */
export interface NetworkLinkServiceArgs {
    accept?: pulumi.Input<inputs.NetworkLinkServiceAccept>;
    /**
     * The description of the Network Link Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Network Link Service.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.NetworkLinkServiceEnvironment>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network: pulumi.Input<inputs.NetworkLinkServiceNetwork>;
}
