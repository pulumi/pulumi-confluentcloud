// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getTransitGatewayAttachment({
 *         id: "tgwa-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getTransitGatewayAttachment({
 *         displayName: "my_tgwa",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getTransitGatewayAttachment(args: GetTransitGatewayAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitGatewayAttachmentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: inputs.GetTransitGatewayAttachmentEnvironment;
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
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
     */
    readonly displayName: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly environment: outputs.GetTransitGatewayAttachmentEnvironment;
    /**
     * (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networks: outputs.GetTransitGatewayAttachmentNetwork[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getTransitGatewayAttachment({
 *         id: "tgwa-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getTransitGatewayAttachment({
 *         displayName: "my_tgwa",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getTransitGatewayAttachmentOutput(args: GetTransitGatewayAttachmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitGatewayAttachmentResult> {
    return pulumi.output(args).apply((a: any) => getTransitGatewayAttachment(a, opts))
}

/**
 * A collection of arguments for invoking getTransitGatewayAttachment.
 */
export interface GetTransitGatewayAttachmentOutputArgs {
    /**
     * A human-readable name for the Transit Gateway Attachment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required Configuration Block) supports the following:
     */
    environment: pulumi.Input<inputs.GetTransitGatewayAttachmentEnvironmentArgs>;
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: pulumi.Input<string>;
}
