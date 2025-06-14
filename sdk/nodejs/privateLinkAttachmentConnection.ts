// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAttachmentConnection` provides a Private Link Attachment Connection resource that enables creating, editing, and deleting Private Link Attachment Connections on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const aws = new confluentcloud.PrivateLinkAttachmentConnection("aws", {
 *     displayName: "my_endpoint",
 *     environment: {
 *         id: "env-8gv0v5",
 *     },
 *     aws: {
 *         vpcEndpointId: "vpce-0ed4d51f5d6ef9b6d",
 *     },
 *     privateLinkAttachment: {
 *         id: "platt-plyvyl",
 *     },
 * });
 * const azure = new confluentcloud.PrivateLinkAttachmentConnection("azure", {
 *     displayName: "prod-azure-central-us-az1-connection",
 *     environment: {
 *         id: "env-12345",
 *     },
 *     azure: {
 *         privateEndpointResourceId: "/subscriptions/123aaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa/resourceGroups/testvpc/providers/Microsoft.Network/privateEndpoints/pe-platt-abcdef-az1",
 *     },
 *     privateLinkAttachment: {
 *         id: "platt-abcdef",
 *     },
 * });
 * const gcp = new confluentcloud.PrivateLinkAttachmentConnection("gcp", {
 *     displayName: "prod-gcp-uscentral1-connection",
 *     environment: {
 *         id: "env-12345",
 *     },
 *     gcp: {
 *         privateServiceConnectConnectionId: "48796d35-191c-4de1-83e6-3824517eaa1d",
 *     },
 *     privateLinkAttachment: {
 *         id: "platt-abcdef",
 *     },
 * });
 * export const privateLinkAttachmentConnection = aws;
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAttachmentConnection` resource:
 * * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 * * enterprise-privatelinkattachment-azure-kafka-acls: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 *
 * ## Import
 *
 * You can import a Private Link Attachment Connection by using Environment ID and Private Link Attachment Connection ID, in the format `<Environment ID>/<Private Link Attachment Connection ID>`. The following example shows how to import a Private Link Attachment Connection:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection main env-abc123/plattc-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class PrivateLinkAttachmentConnection extends pulumi.CustomResource {
    /**
     * Get an existing PrivateLinkAttachmentConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrivateLinkAttachmentConnectionState, opts?: pulumi.CustomResourceOptions): PrivateLinkAttachmentConnection {
        return new PrivateLinkAttachmentConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection';

    /**
     * Returns true if the given object is an instance of PrivateLinkAttachmentConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrivateLinkAttachmentConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrivateLinkAttachmentConnection.__pulumiType;
    }

    public readonly aws!: pulumi.Output<outputs.PrivateLinkAttachmentConnectionAws | undefined>;
    public readonly azure!: pulumi.Output<outputs.PrivateLinkAttachmentConnectionAzure | undefined>;
    /**
     * The name of the Private Link Attachment Connection.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.PrivateLinkAttachmentConnectionEnvironment>;
    public readonly gcp!: pulumi.Output<outputs.PrivateLinkAttachmentConnectionGcp | undefined>;
    /**
     * The privateLinkAttachment to which this belongs.
     */
    public readonly privateLinkAttachment!: pulumi.Output<outputs.PrivateLinkAttachmentConnectionPrivateLinkAttachment>;
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     */
    public /*out*/ readonly resourceName!: pulumi.Output<string>;

    /**
     * Create a PrivateLinkAttachmentConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrivateLinkAttachmentConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrivateLinkAttachmentConnectionArgs | PrivateLinkAttachmentConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrivateLinkAttachmentConnectionState | undefined;
            resourceInputs["aws"] = state ? state.aws : undefined;
            resourceInputs["azure"] = state ? state.azure : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["gcp"] = state ? state.gcp : undefined;
            resourceInputs["privateLinkAttachment"] = state ? state.privateLinkAttachment : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
        } else {
            const args = argsOrState as PrivateLinkAttachmentConnectionArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.privateLinkAttachment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateLinkAttachment'");
            }
            resourceInputs["aws"] = args ? args.aws : undefined;
            resourceInputs["azure"] = args ? args.azure : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["gcp"] = args ? args.gcp : undefined;
            resourceInputs["privateLinkAttachment"] = args ? args.privateLinkAttachment : undefined;
            resourceInputs["resourceName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrivateLinkAttachmentConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrivateLinkAttachmentConnection resources.
 */
export interface PrivateLinkAttachmentConnectionState {
    aws?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionAws>;
    azure?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionAzure>;
    /**
     * The name of the Private Link Attachment Connection.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionEnvironment>;
    gcp?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionGcp>;
    /**
     * The privateLinkAttachment to which this belongs.
     */
    privateLinkAttachment?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionPrivateLinkAttachment>;
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     */
    resourceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrivateLinkAttachmentConnection resource.
 */
export interface PrivateLinkAttachmentConnectionArgs {
    aws?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionAws>;
    azure?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionAzure>;
    /**
     * The name of the Private Link Attachment Connection.
     */
    displayName: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.PrivateLinkAttachmentConnectionEnvironment>;
    gcp?: pulumi.Input<inputs.PrivateLinkAttachmentConnectionGcp>;
    /**
     * The privateLinkAttachment to which this belongs.
     */
    privateLinkAttachment: pulumi.Input<inputs.PrivateLinkAttachmentConnectionPrivateLinkAttachment>;
}
