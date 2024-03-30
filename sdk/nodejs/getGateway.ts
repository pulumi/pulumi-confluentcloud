// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getGateway` describes a Gateway data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getGateway({
 *     id: "gw-abc123",
 *     environment: {
 *         id: "env-123abc",
 *     },
 * });
 * export const gateway = main;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGateway(args: GetGatewayArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewayResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getGateway:getGateway", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getGateway.
 */
export interface GetGatewayArgs {
    environment: inputs.GetGatewayEnvironment;
    /**
     * The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     */
    id: string;
}

/**
 * A collection of values returned by getGateway.
 */
export interface GetGatewayResult {
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly awsEgressPrivateLinkGateways: outputs.GetGatewayAwsEgressPrivateLinkGateway[];
    /**
     * (Optional Configuration Block) supports the following:
     */
    readonly awsPeeringGateways: outputs.GetGatewayAwsPeeringGateway[];
    /**
     * (Required String) A human-readable name for the Gateway.
     */
    readonly displayName: string;
    readonly environment: outputs.GetGatewayEnvironment;
    readonly id: string;
}
/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getGateway` describes a Gateway data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getGateway({
 *     id: "gw-abc123",
 *     environment: {
 *         id: "env-123abc",
 *     },
 * });
 * export const gateway = main;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getGatewayOutput(args: GetGatewayOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGatewayResult> {
    return pulumi.output(args).apply((a: any) => getGateway(a, opts))
}

/**
 * A collection of arguments for invoking getGateway.
 */
export interface GetGatewayOutputArgs {
    environment: pulumi.Input<inputs.GetGatewayEnvironmentArgs>;
    /**
     * The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     */
    id: pulumi.Input<string>;
}
