// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.DnsForwarder` provides a DNS Forwarder resource that enables creating, editing, and deleting DNS Forwarders on Confluent Cloud.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {});
 * const main = new confluentcloud.DnsForwarder("main", {
 *     displayName: "dns_forwarder",
 *     environment: {
 *         id: development.id,
 *     },
 *     domains: [
 *         "example.com",
 *         "domainname.com",
 *     ],
 *     gateway: {
 *         id: confluent_network.main.gateway[0].id,
 *     },
 *     forwardViaIp: {
 *         dnsServerIps: [
 *             "10.200.0.0",
 *             "10.200.0.1",
 *         ],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * You can import a DNS Forwarder by using Environment ID and DNS Forwarder ID, in the format `<Environment ID>/<DNS Forwarder ID>`. The following example shows how to import a DNS Forwarder:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/dnsForwarder:DnsForwarder main env-abc123/dnsf-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class DnsForwarder extends pulumi.CustomResource {
    /**
     * Get an existing DnsForwarder resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DnsForwarderState, opts?: pulumi.CustomResourceOptions): DnsForwarder {
        return new DnsForwarder(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/dnsForwarder:DnsForwarder';

    /**
     * Returns true if the given object is an instance of DnsForwarder.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DnsForwarder {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DnsForwarder.__pulumiType;
    }

    /**
     * The name of the DNS Forwarder.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * List of domains for the DNS forwarder to use.
     */
    public readonly domains!: pulumi.Output<string[]>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.DnsForwarderEnvironment>;
    public readonly forwardViaIp!: pulumi.Output<outputs.DnsForwarderForwardViaIp | undefined>;
    public readonly gateway!: pulumi.Output<outputs.DnsForwarderGateway>;

    /**
     * Create a DnsForwarder resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DnsForwarderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DnsForwarderArgs | DnsForwarderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DnsForwarderState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["domains"] = state ? state.domains : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["forwardViaIp"] = state ? state.forwardViaIp : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
        } else {
            const args = argsOrState as DnsForwarderArgs | undefined;
            if ((!args || args.domains === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domains'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.gateway === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gateway'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["domains"] = args ? args.domains : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["forwardViaIp"] = args ? args.forwardViaIp : undefined;
            resourceInputs["gateway"] = args ? args.gateway : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DnsForwarder.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DnsForwarder resources.
 */
export interface DnsForwarderState {
    /**
     * The name of the DNS Forwarder.
     */
    displayName?: pulumi.Input<string>;
    /**
     * List of domains for the DNS forwarder to use.
     */
    domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.DnsForwarderEnvironment>;
    forwardViaIp?: pulumi.Input<inputs.DnsForwarderForwardViaIp>;
    gateway?: pulumi.Input<inputs.DnsForwarderGateway>;
}

/**
 * The set of arguments for constructing a DnsForwarder resource.
 */
export interface DnsForwarderArgs {
    /**
     * The name of the DNS Forwarder.
     */
    displayName?: pulumi.Input<string>;
    /**
     * List of domains for the DNS forwarder to use.
     */
    domains: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.DnsForwarderEnvironment>;
    forwardViaIp?: pulumi.Input<inputs.DnsForwarderForwardViaIp>;
    gateway: pulumi.Input<inputs.DnsForwarderGateway>;
}
