// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * [![Request Access To Networking v1](https://img.shields.io/badge/-Request%20Access%20To%20Networking%20v1-%23bc8540)](mailto:ccloud-api-access+networking-v1-limited-availability@confluent.io?subject=Request%20to%20join%20networking/v1%20API%20Limited%20Availability&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Limited%20Availability%20for%20networking/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
 *
 * > **Note:** `confluentcloud.PrivateLinkAttachmentConnection` data source is available in **Limited Availability** for early adopters. Limited Availability features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Limited Availability** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Limited Availability features. Limited Availability features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Limited Availability releases of the Limited Availability features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getPrivateLinkAttachmentConnection({
 *     id: "plattc-p5j3ov",
 *     environment: {
 *         id: "env-8gv0v5",
 *     },
 * });
 * export const plattc = main;
 * ```
 */
export function getPrivateLinkAttachmentConnection(args: GetPrivateLinkAttachmentConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivateLinkAttachmentConnectionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getPrivateLinkAttachmentConnection:getPrivateLinkAttachmentConnection", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivateLinkAttachmentConnection.
 */
export interface GetPrivateLinkAttachmentConnectionArgs {
    environment: inputs.GetPrivateLinkAttachmentConnectionEnvironment;
    /**
     * The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     */
    id: string;
}

/**
 * A collection of values returned by getPrivateLinkAttachmentConnection.
 */
export interface GetPrivateLinkAttachmentConnectionResult {
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly aws: outputs.GetPrivateLinkAttachmentConnectionAw[];
    readonly azures: outputs.GetPrivateLinkAttachmentConnectionAzure[];
    /**
     * (Optional String) The name of the Private Link Attachment Connection.
     */
    readonly displayName: string;
    readonly environment: outputs.GetPrivateLinkAttachmentConnectionEnvironment;
    readonly gcps: outputs.GetPrivateLinkAttachmentConnectionGcp[];
    /**
     * (Required String) The unique identifier for the private link attachment.
     */
    readonly id: string;
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly privateLinkAttachments: outputs.GetPrivateLinkAttachmentConnectionPrivateLinkAttachment[];
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     */
    readonly resourceName: string;
}
/**
 * [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * [![Request Access To Networking v1](https://img.shields.io/badge/-Request%20Access%20To%20Networking%20v1-%23bc8540)](mailto:ccloud-api-access+networking-v1-limited-availability@confluent.io?subject=Request%20to%20join%20networking/v1%20API%20Limited%20Availability&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Limited%20Availability%20for%20networking/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
 *
 * > **Note:** `confluentcloud.PrivateLinkAttachmentConnection` data source is available in **Limited Availability** for early adopters. Limited Availability features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Limited Availability** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Limited Availability features. Limited Availability features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Limited Availability releases of the Limited Availability features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getPrivateLinkAttachmentConnection({
 *     id: "plattc-p5j3ov",
 *     environment: {
 *         id: "env-8gv0v5",
 *     },
 * });
 * export const plattc = main;
 * ```
 */
export function getPrivateLinkAttachmentConnectionOutput(args: GetPrivateLinkAttachmentConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivateLinkAttachmentConnectionResult> {
    return pulumi.output(args).apply((a: any) => getPrivateLinkAttachmentConnection(a, opts))
}

/**
 * A collection of arguments for invoking getPrivateLinkAttachmentConnection.
 */
export interface GetPrivateLinkAttachmentConnectionOutputArgs {
    environment: pulumi.Input<inputs.GetPrivateLinkAttachmentConnectionEnvironmentArgs>;
    /**
     * The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     */
    id: pulumi.Input<string>;
}