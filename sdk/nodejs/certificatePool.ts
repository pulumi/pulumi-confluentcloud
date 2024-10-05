// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.CertificatePool` provides a Certificate Pool resource that enables creating, editing, and deleting Certificate Pools on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = new confluentcloud.CertificatePool("main", {
 *     certificateAuthority: {
 *         id: mainConfluentCertificateAuthority.id,
 *     },
 *     displayName: "my-certificate-pool",
 *     description: "example description",
 *     externalIdentifier: "CN",
 *     filter: "CN == \"test\"",
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Certificate Pool by using Certificate Authority ID and Certificate Pool ID, in the format `<Certificate Authority ID>/<Certificate Pool ID>`. The following example shows how to import a Certificate Pool:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/certificatePool:CertificatePool main op-abc123/pool-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class CertificatePool extends pulumi.CustomResource {
    /**
     * Get an existing CertificatePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificatePoolState, opts?: pulumi.CustomResourceOptions): CertificatePool {
        return new CertificatePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/certificatePool:CertificatePool';

    /**
     * Returns true if the given object is an instance of CertificatePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertificatePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertificatePool.__pulumiType;
    }

    public readonly certificateAuthority!: pulumi.Output<outputs.CertificatePoolCertificateAuthority>;
    /**
     * A description of the Certificate Pool.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The name of the Certificate Pool.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The certificate field that will be used to represent the pool's external identity for audit logging.
     */
    public readonly externalIdentifier!: pulumi.Output<string>;
    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     */
    public readonly filter!: pulumi.Output<string>;

    /**
     * Create a CertificatePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificatePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificatePoolArgs | CertificatePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificatePoolState | undefined;
            resourceInputs["certificateAuthority"] = state ? state.certificateAuthority : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["externalIdentifier"] = state ? state.externalIdentifier : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
        } else {
            const args = argsOrState as CertificatePoolArgs | undefined;
            if ((!args || args.certificateAuthority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateAuthority'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.externalIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'externalIdentifier'");
            }
            if ((!args || args.filter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filter'");
            }
            resourceInputs["certificateAuthority"] = args ? args.certificateAuthority : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["externalIdentifier"] = args ? args.externalIdentifier : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CertificatePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertificatePool resources.
 */
export interface CertificatePoolState {
    certificateAuthority?: pulumi.Input<inputs.CertificatePoolCertificateAuthority>;
    /**
     * A description of the Certificate Pool.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Certificate Pool.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The certificate field that will be used to represent the pool's external identity for audit logging.
     */
    externalIdentifier?: pulumi.Input<string>;
    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     */
    filter?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertificatePool resource.
 */
export interface CertificatePoolArgs {
    certificateAuthority: pulumi.Input<inputs.CertificatePoolCertificateAuthority>;
    /**
     * A description of the Certificate Pool.
     */
    description: pulumi.Input<string>;
    /**
     * The name of the Certificate Pool.
     */
    displayName: pulumi.Input<string>;
    /**
     * The certificate field that will be used to represent the pool's external identity for audit logging.
     */
    externalIdentifier: pulumi.Input<string>;
    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     */
    filter: pulumi.Input<string>;
}
