// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To Networking v1](https://img.shields.io/badge/-Request%20Access%20To%20Networking%20v1-%23bc8540)](mailto:ccloud-api-access+networking-v1-early-access@confluent.io?subject=Request%20to%20join%20networking/v1%20API%20Early%20Access&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Early%20Access%20for%20networking/v1%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
 *
 * > **Note:** `confluentcloud.TransitGatewayAttachment` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Early Access features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingIdTransitGatewayAttachment = confluentcloud.getTransitGatewayAttachment({
 *     id: "tgwa-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingId = exampleUsingIdTransitGatewayAttachment;
 * const exampleUsingNameTransitGatewayAttachment = confluentcloud.getTransitGatewayAttachment({
 *     displayName: "my_tgwa",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameTransitGatewayAttachment;
 * ```
 */
export function getTransitGatewayAttachment(args: GetTransitGatewayAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitGatewayAttachmentResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment", {
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitGatewayAttachment.
 */
export interface GetTransitGatewayAttachmentArgs {
    /**
     * A human-readable name for the Transit Gateway Attachment.
     */
    displayName?: string;
    environment: inputs.GetTransitGatewayAttachmentEnvironment;
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     */
    id?: string;
}

/**
 * A collection of values returned by getTransitGatewayAttachment.
 */
export interface GetTransitGatewayAttachmentResult {
    /**
     * (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     */
    readonly aws: outputs.GetTransitGatewayAttachmentAw[];
    /**
     * (Required String) The name of the Transit Gateway Attachment.
     * - `environment` (Required Configuration Block) supports the following:
     */
    readonly displayName: string;
    readonly environment: outputs.GetTransitGatewayAttachmentEnvironment;
    /**
     * (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    readonly networks: outputs.GetTransitGatewayAttachmentNetwork[];
}

export function getTransitGatewayAttachmentOutput(args: GetTransitGatewayAttachmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitGatewayAttachmentResult> {
    return pulumi.output(args).apply(a => getTransitGatewayAttachment(a, opts))
}

/**
 * A collection of arguments for invoking getTransitGatewayAttachment.
 */
export interface GetTransitGatewayAttachmentOutputArgs {
    /**
     * A human-readable name for the Transit Gateway Attachment.
     */
    displayName?: pulumi.Input<string>;
    environment: pulumi.Input<inputs.GetTransitGatewayAttachmentEnvironmentArgs>;
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     */
    id?: pulumi.Input<string>;
}
