// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingId = confluentcloud.getNetwork({
 *     id: "n-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * const test_sa = new confluentcloud.ServiceAccount("test-sa", {description: exampleUsingId.then(exampleUsingId => `test_sa for ${exampleUsingId.displayName}`)});
 * const exampleUsingNameNetwork = confluentcloud.getNetwork({
 *     displayName: "my_network",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameNetwork;
 * ```
 */
export function getNetwork(args: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getNetwork:getNetwork", {
        "aws": args.aws,
        "azures": args.azures,
        "displayName": args.displayName,
        "dnsConfigs": args.dnsConfigs,
        "environment": args.environment,
        "gcps": args.gcps,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkArgs {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    aws?: inputs.GetNetworkAw[];
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    azures?: inputs.GetNetworkAzure[];
    /**
     * A human-readable name for the Network.
     */
    displayName?: string;
    /**
     * (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
     */
    dnsConfigs?: inputs.GetNetworkDnsConfig[];
    environment: inputs.GetNetworkEnvironment;
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    gcps?: inputs.GetNetworkGcp[];
    /**
     * The ID of the Environment that the Network belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    readonly aws: outputs.GetNetworkAw[];
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    readonly azures: outputs.GetNetworkAzure[];
    /**
     * (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     */
    readonly cidr: string;
    /**
     * (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    readonly cloud: string;
    /**
     * (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     */
    readonly connectionTypes: string[];
    /**
     * (Required String) The name of the Network.
     */
    readonly displayName: string;
    /**
     * (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
     */
    readonly dnsConfigs: outputs.GetNetworkDnsConfig[];
    readonly dnsDomain: string;
    readonly environment: outputs.GetNetworkEnvironment;
    readonly gateways: outputs.GetNetworkGateway[];
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    readonly gcps: outputs.GetNetworkGcp[];
    /**
     * (Required String) The ID of the Network, for example, `n-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) The cloud provider region where the network exists.
     */
    readonly region: string;
    /**
     * (Required String) The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     */
    readonly reservedCidr: string;
    /**
     * (Required String) The Confluent Resource Name of the Network.
     */
    readonly resourceName: string;
    readonly zonalSubdomains: {[key: string]: string};
    /**
     * (Required Configuration Blocks) Each item represents information related to a single zone. It supports the following:
     */
    readonly zoneInfos: outputs.GetNetworkZoneInfo[];
    /**
     * (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    readonly zones: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleUsingId = confluentcloud.getNetwork({
 *     id: "n-abc123",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * const test_sa = new confluentcloud.ServiceAccount("test-sa", {description: exampleUsingId.then(exampleUsingId => `test_sa for ${exampleUsingId.displayName}`)});
 * const exampleUsingNameNetwork = confluentcloud.getNetwork({
 *     displayName: "my_network",
 *     environment: {
 *         id: "env-xyz456",
 *     },
 * });
 * export const exampleUsingName = exampleUsingNameNetwork;
 * ```
 */
export function getNetworkOutput(args: GetNetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkResult> {
    return pulumi.output(args).apply((a: any) => getNetwork(a, opts))
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkOutputArgs {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    aws?: pulumi.Input<pulumi.Input<inputs.GetNetworkAwArgs>[]>;
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    azures?: pulumi.Input<pulumi.Input<inputs.GetNetworkAzureArgs>[]>;
    /**
     * A human-readable name for the Network.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
     */
    dnsConfigs?: pulumi.Input<pulumi.Input<inputs.GetNetworkDnsConfigArgs>[]>;
    environment: pulumi.Input<inputs.GetNetworkEnvironmentArgs>;
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    gcps?: pulumi.Input<pulumi.Input<inputs.GetNetworkGcpArgs>[]>;
    /**
     * The ID of the Environment that the Network belongs to, for example, `env-xyz456`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    id?: pulumi.Input<string>;
}
