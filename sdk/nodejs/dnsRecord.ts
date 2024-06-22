// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.DnsRecord` provides a DNS Record resource that enables creating, editing, and deleting DNS Records on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {displayName: "Development"});
 * const main = new confluentcloud.DnsRecord("main", {
 *     displayName: "dns_record",
 *     environment: {
 *         id: development.id,
 *     },
 *     domain: "example.com",
 *     gateway: {
 *         id: mainConfluentNetwork.gateway[0].id,
 *     },
 *     privateLinkAccessPoint: {
 *         id: mainConfluentAccessPoint.id,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * You can import a DNS Record by using Environment ID and DNS Record ID, in the format `<Environment ID>/<DNS Record ID>`. The following example shows how to import a DNS Record:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/dnsRecord:DnsRecord main env-abc123/dnsrec-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class DnsRecord extends pulumi.CustomResource {
    /**
     * Get an existing DnsRecord resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DnsRecordState, opts?: pulumi.CustomResourceOptions): DnsRecord {
        return new DnsRecord(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/dnsRecord:DnsRecord';

    /**
     * Returns true if the given object is an instance of DnsRecord.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DnsRecord {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DnsRecord.__pulumiType;
    }

    /**
     * The name of the DNS Record.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The fully qualified domain name of the DNS Record.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.DnsRecordEnvironment>;
    public readonly gateway!: pulumi.Output<outputs.DnsRecordGateway>;
    public readonly privateLinkAccessPoint!: pulumi.Output<outputs.DnsRecordPrivateLinkAccessPoint | undefined>;

    /**
     * Create a DnsRecord resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DnsRecordArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DnsRecordArgs | DnsRecordState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DnsRecordState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["privateLinkAccessPoint"] = state ? state.privateLinkAccessPoint : undefined;
        } else {
            const args = argsOrState as DnsRecordArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.gateway === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gateway'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["gateway"] = args ? args.gateway : undefined;
            resourceInputs["privateLinkAccessPoint"] = args ? args.privateLinkAccessPoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DnsRecord.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DnsRecord resources.
 */
export interface DnsRecordState {
    /**
     * The name of the DNS Record.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The fully qualified domain name of the DNS Record.
     */
    domain?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.DnsRecordEnvironment>;
    gateway?: pulumi.Input<inputs.DnsRecordGateway>;
    privateLinkAccessPoint?: pulumi.Input<inputs.DnsRecordPrivateLinkAccessPoint>;
}

/**
 * The set of arguments for constructing a DnsRecord resource.
 */
export interface DnsRecordArgs {
    /**
     * The name of the DNS Record.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The fully qualified domain name of the DNS Record.
     */
    domain: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.DnsRecordEnvironment>;
    gateway: pulumi.Input<inputs.DnsRecordGateway>;
    privateLinkAccessPoint?: pulumi.Input<inputs.DnsRecordPrivateLinkAccessPoint>;
}