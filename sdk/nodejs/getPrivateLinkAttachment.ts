// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAttachment` describes a Private Link Attachment data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getPrivateLinkAttachment({
 *     id: "platt-abcde",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const platt = main;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrivateLinkAttachment(args: GetPrivateLinkAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivateLinkAttachmentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getPrivateLinkAttachment:getPrivateLinkAttachment", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivateLinkAttachment.
 */
export interface GetPrivateLinkAttachmentArgs {
    environment: inputs.GetPrivateLinkAttachmentEnvironment;
    /**
     * The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     */
    id: string;
}

/**
 * A collection of values returned by getPrivateLinkAttachment.
 */
export interface GetPrivateLinkAttachmentResult {
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly aws: outputs.GetPrivateLinkAttachmentAw[];
    readonly azures: outputs.GetPrivateLinkAttachmentAzure[];
    /**
     * (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
     */
    readonly cloud: string;
    /**
     * (Optional String) The name of the Private Link Attachment.
     */
    readonly displayName: string;
    /**
     * (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
     */
    readonly dnsDomain: string;
    readonly environment: outputs.GetPrivateLinkAttachmentEnvironment;
    readonly gcps: outputs.GetPrivateLinkAttachmentGcp[];
    readonly id: string;
    /**
     * (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     */
    readonly region: string;
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     */
    readonly resourceName: string;
}
/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.PrivateLinkAttachment` describes a Private Link Attachment data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getPrivateLinkAttachment({
 *     id: "platt-abcde",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const platt = main;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrivateLinkAttachmentOutput(args: GetPrivateLinkAttachmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrivateLinkAttachmentResult> {
    return pulumi.output(args).apply((a: any) => getPrivateLinkAttachment(a, opts))
}

/**
 * A collection of arguments for invoking getPrivateLinkAttachment.
 */
export interface GetPrivateLinkAttachmentOutputArgs {
    environment: pulumi.Input<inputs.GetPrivateLinkAttachmentEnvironmentArgs>;
    /**
     * The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     */
    id: pulumi.Input<string>;
}
