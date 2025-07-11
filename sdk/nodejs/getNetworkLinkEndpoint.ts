// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
 *
 * ## Example Usage
 *
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
     * The ID of the Network Link Endpoint, for example, `nle-zyw30`.
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
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
 *
 * ## Example Usage
 *
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
 */
export function getNetworkLinkEndpointOutput(args: GetNetworkLinkEndpointOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkLinkEndpointResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getNetworkLinkEndpoint:getNetworkLinkEndpoint", {
        "environment": args.environment,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkLinkEndpoint.
 */
export interface GetNetworkLinkEndpointOutputArgs {
    environment: pulumi.Input<inputs.GetNetworkLinkEndpointEnvironmentArgs>;
    /**
     * The ID of the Network Link Endpoint, for example, `nle-zyw30`.
     */
    id: pulumi.Input<string>;
}
