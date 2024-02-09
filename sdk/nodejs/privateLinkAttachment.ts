// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAttachment` provides a Private Link Attachment resource that enables creating, editing, and deleting Private Link Attachments on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = new confluentcloud.PrivateLinkAttachment("main", {
 *     cloud: "AWS",
 *     region: "us-west-2",
 *     displayName: "staging-platt",
 *     environment: {
 *         id: "env-3732nw",
 *     },
 * });
 * export const privateLinkAttachment = main;
 * ```
 *
 * ## Import
 *
 * You can import a Private Link Attachment by using Environment ID and Private Link Attachment ID, in the format `<Environment ID>/<Private Link Attachment ID>`. The following example shows how to import a Private Link Attachment:
 *
 *  $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 *  $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment main env-abc123/platt-abc123
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class PrivateLinkAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PrivateLinkAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateLinkAttachmentState, opts?: pulumi.CustomResourceOptions): PrivateLinkAttachment {
        return new PrivateLinkAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment';

    /**
     * Returns true if the given object is an instance of PrivateLinkAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateLinkAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateLinkAttachment.__pulumiType;
    }

    /**
     * (Optional Configuration Block) supports the following:
     */
    public /*out*/ readonly aws!: pulumi.Output<outputs.PrivateLinkAttachmentAw[]>;
    public /*out*/ readonly azures!: pulumi.Output<outputs.PrivateLinkAttachmentAzure[]>;
    /**
     * The cloud service provider that hosts the resources to access with the Private Link Attachment.
     */
    public readonly cloud!: pulumi.Output<string>;
    /**
     * The name of the Private Link Attachment.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
     */
    public /*out*/ readonly dnsDomain!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.PrivateLinkAttachmentEnvironment>;
    public /*out*/ readonly gcps!: pulumi.Output<outputs.PrivateLinkAttachmentGcp[]>;
    /**
     * The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     */
    public /*out*/ readonly resourceName!: pulumi.Output<string>;

    /**
     * Create a PrivateLinkAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateLinkAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateLinkAttachmentArgs | PrivateLinkAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLinkAttachmentState | undefined;
            resourceInputs["aws"] = state ? state.aws : undefined;
            resourceInputs["azures"] = state ? state.azures : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["dnsDomain"] = state ? state.dnsDomain : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["gcps"] = state ? state.gcps : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
        } else {
            const args = argsOrState as PrivateLinkAttachmentArgs | undefined;
            if ((!args || args.cloud === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloud'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["aws"] = undefined /*out*/;
            resourceInputs["azures"] = undefined /*out*/;
            resourceInputs["dnsDomain"] = undefined /*out*/;
            resourceInputs["gcps"] = undefined /*out*/;
            resourceInputs["resourceName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateLinkAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLinkAttachment resources.
 */
export interface PrivateLinkAttachmentState {
    /**
     * (Optional Configuration Block) supports the following:
     */
    aws?: pulumi.Input<pulumi.Input<inputs.PrivateLinkAttachmentAw>[]>;
    azures?: pulumi.Input<pulumi.Input<inputs.PrivateLinkAttachmentAzure>[]>;
    /**
     * The cloud service provider that hosts the resources to access with the Private Link Attachment.
     */
    cloud?: pulumi.Input<string>;
    /**
     * The name of the Private Link Attachment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
     */
    dnsDomain?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.PrivateLinkAttachmentEnvironment>;
    gcps?: pulumi.Input<pulumi.Input<inputs.PrivateLinkAttachmentGcp>[]>;
    /**
     * The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     */
    region?: pulumi.Input<string>;
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     */
    resourceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateLinkAttachment resource.
 */
export interface PrivateLinkAttachmentArgs {
    /**
     * The cloud service provider that hosts the resources to access with the Private Link Attachment.
     */
    cloud: pulumi.Input<string>;
    /**
     * The name of the Private Link Attachment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.PrivateLinkAttachmentEnvironment>;
    /**
     * The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     */
    region: pulumi.Input<string>;
}
