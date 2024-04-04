// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * > **Note:** `confluentcloud.getIpAddresses` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.getIpAddresses` describes IP Addresses data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getIpAddresses({
 *     filter: {
 *         clouds: ["AWS"],
 *         regions: [
 *             "us-east-1",
 *             "us-east-2",
 *         ],
 *         services: ["KAFKA"],
 *         addressTypes: ["EGRESS"],
 *     },
 * });
 * export const ipAddresses = main.then(main => main.ipAddresses);
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIpAddresses(args?: GetIpAddressesArgs, opts?: pulumi.InvokeOptions): Promise<GetIpAddressesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getIpAddresses:getIpAddresses", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpAddresses.
 */
export interface GetIpAddressesArgs {
    filter?: inputs.GetIpAddressesFilter;
}

/**
 * A collection of values returned by getIpAddresses.
 */
export interface GetIpAddressesResult {
    readonly filter?: outputs.GetIpAddressesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (List of Object) List of schemas. Each schema object exports the following attributes:
     */
    readonly ipAddresses: outputs.GetIpAddressesIpAddress[];
}
/**
 * [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * > **Note:** `confluentcloud.getIpAddresses` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.getIpAddresses` describes IP Addresses data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getIpAddresses({
 *     filter: {
 *         clouds: ["AWS"],
 *         regions: [
 *             "us-east-1",
 *             "us-east-2",
 *         ],
 *         services: ["KAFKA"],
 *         addressTypes: ["EGRESS"],
 *     },
 * });
 * export const ipAddresses = main.then(main => main.ipAddresses);
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIpAddressesOutput(args?: GetIpAddressesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpAddressesResult> {
    return pulumi.output(args).apply((a: any) => getIpAddresses(a, opts))
}

/**
 * A collection of arguments for invoking getIpAddresses.
 */
export interface GetIpAddressesOutputArgs {
    filter?: pulumi.Input<inputs.GetIpAddressesFilterArgs>;
}
