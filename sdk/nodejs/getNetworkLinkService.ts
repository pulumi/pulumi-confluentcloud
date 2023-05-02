// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * > **Note:** `confluentcloud.NetworkLinkService` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.NetworkLinkService` describes a Network Link Service data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const nls = confluentcloud.getNetworkLinkService({
 *     id: "nls-zyw30",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const networkLinkService = nls;
 * ```
 */
export function getNetworkLinkService(args: GetNetworkLinkServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkLinkServiceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getNetworkLinkService:getNetworkLinkService", {
        "accept": args.accept,
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkLinkService.
 */
export interface GetNetworkLinkServiceArgs {
    /**
     * (Optional Configuration Block) supports the following:
     */
    accept?: inputs.GetNetworkLinkServiceAccept;
    environment: inputs.GetNetworkLinkServiceEnvironment;
    /**
     * The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
     */
    id: string;
}

/**
 * A collection of values returned by getNetworkLinkService.
 */
export interface GetNetworkLinkServiceResult {
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly accept: outputs.GetNetworkLinkServiceAccept;
    /**
     * (Optional String) The description of the Network Link Service.
     */
    readonly description: string;
    /**
     * (Optional String) The name of the Network Link Service.
     */
    readonly displayName: string;
    readonly environment: outputs.GetNetworkLinkServiceEnvironment;
    /**
     * (Required String) The ID of the Network that the Network Link Service belongs to, for example, `n-abc123`.
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networks: outputs.GetNetworkLinkServiceNetwork[];
    /**
     * (Required String) The Confluent Resource Name of the Network Link Service.
     */
    readonly resourceName: string;
}
/**
 * [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * > **Note:** `confluentcloud.NetworkLinkService` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
 * **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
 *
 * `confluentcloud.NetworkLinkService` describes a Network Link Service data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const nls = confluentcloud.getNetworkLinkService({
 *     id: "nls-zyw30",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const networkLinkService = nls;
 * ```
 */
export function getNetworkLinkServiceOutput(args: GetNetworkLinkServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkLinkServiceResult> {
    return pulumi.output(args).apply((a: any) => getNetworkLinkService(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkLinkService.
 */
export interface GetNetworkLinkServiceOutputArgs {
    /**
     * (Optional Configuration Block) supports the following:
     */
    accept?: pulumi.Input<inputs.GetNetworkLinkServiceAcceptArgs>;
    environment: pulumi.Input<inputs.GetNetworkLinkServiceEnvironmentArgs>;
    /**
     * The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
     */
    id: pulumi.Input<string>;
}