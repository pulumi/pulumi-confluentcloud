// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const nle = confluentcloud.getNetworkLinkEndpoint({
 *     id: "nle-1357",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const networkLinkEndpoint = nle;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkLinkEndpoint(args: GetNetworkLinkEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkLinkEndpointResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getNetworkLinkEndpoint:getNetworkLinkEndpoint", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkLinkEndpoint.
 */
export interface GetNetworkLinkEndpointArgs {
    environment: inputs.GetNetworkLinkEndpointEnvironment;
    /**
     * The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     */
    id: string;
}

/**
 * A collection of values returned by getNetworkLinkEndpoint.
 */
export interface GetNetworkLinkEndpointResult {
    /**
     * (Optional String) The description of the Network Link Endpoint.
     */
    readonly description: string;
    /**
     * (Optional String) The name of the Network Link Endpoint.
     */
    readonly displayName: string;
    readonly environment: outputs.GetNetworkLinkEndpointEnvironment;
    /**
     * (Required String) The ID of the Network Link Service
     */
    readonly id: string;
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networkLinkServices: outputs.GetNetworkLinkEndpointNetworkLinkService[];
    /**
     * (Required Configuration Block) supports the following:
     */
    readonly networks: outputs.GetNetworkLinkEndpointNetwork[];
    /**
     * (Required String) The Confluent Resource Name of the Network Link Endpoint.
     */
    readonly resourceName: string;
}
/**
 * [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const nle = confluentcloud.getNetworkLinkEndpoint({
 *     id: "nle-1357",
 *     environment: {
 *         id: "env-1234",
 *     },
 * });
 * export const networkLinkEndpoint = nle;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNetworkLinkEndpointOutput(args: GetNetworkLinkEndpointOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkLinkEndpointResult> {
    return pulumi.output(args).apply((a: any) => getNetworkLinkEndpoint(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkLinkEndpoint.
 */
export interface GetNetworkLinkEndpointOutputArgs {
    environment: pulumi.Input<inputs.GetNetworkLinkEndpointEnvironmentArgs>;
    /**
     * The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     */
    id: pulumi.Input<string>;
}
