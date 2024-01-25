// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Example Network that supports Private Link Connections
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {});
 * const aws_private_link = new confluentcloud.Network("aws-private-link", {
 *     displayName: "AWS Private Link Network",
 *     cloud: "AWS",
 *     region: "us-east-1",
 *     connectionTypes: ["PRIVATELINK"],
 *     zones: [
 *         "use1-az1",
 *         "use1-az2",
 *         "use1-az6",
 *     ],
 *     environment: {
 *         id: development.id,
 *     },
 * });
 * ```
 * ### Example Network that supports Peering Connections
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {});
 * const azure_peering = new confluentcloud.Network("azure-peering", {
 *     displayName: "Azure Peering Network",
 *     cloud: "AZURE",
 *     region: "eastus2",
 *     cidr: "10.10.0.0/16",
 *     connectionTypes: ["PEERING"],
 *     environment: {
 *         id: development.id,
 *     },
 * });
 * ```
 * ### Example Network that supports Private Service Connect Connections
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {});
 * const gcp_private_service_connect = new confluentcloud.Network("gcp-private-service-connect", {
 *     displayName: "GCP Private Service Connect Network",
 *     cloud: "GCP",
 *     region: "us-central1",
 *     connectionTypes: ["PRIVATELINK"],
 *     zones: [
 *         "us-central1-a",
 *         "us-central1-b",
 *         "us-central1-c",
 *     ],
 *     environment: {
 *         id: development.id,
 *     },
 *     dnsConfig: {
 *         resolution: "PRIVATE",
 *     },
 * });
 * ```
 * ### Example Network that supports Transit Gateway Endpoints
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {});
 * const aws_transit_gateway_attachment = new confluentcloud.Network("aws-transit-gateway-attachment", {
 *     displayName: "AWS Transit Gateway Attachment Network",
 *     cloud: "AWS",
 *     region: "us-east-1",
 *     cidr: "10.10.0.0/16",
 *     connectionTypes: ["TRANSITGATEWAY"],
 *     environment: {
 *         id: development.id,
 *     },
 * });
 * ```
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.Network` resource:
 *   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
 *   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
 *   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
 *   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *
 * ## Import
 *
 * You can import a Network by using Environment ID and Network ID, in the format `<Environment ID>/<Network ID>`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Network extends pulumi.CustomResource {
    /**
     * Get an existing Network resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkState, opts?: pulumi.CustomResourceOptions): Network {
        return new Network(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/network:Network';

    /**
     * Returns true if the given object is an instance of Network.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Network {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Network.__pulumiType;
    }

    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    public readonly aws!: pulumi.Output<outputs.NetworkAw[]>;
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    public readonly azures!: pulumi.Output<outputs.NetworkAzure[]>;
    /**
     * The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     *
     * > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    public readonly cloud!: pulumi.Output<string>;
    /**
     * The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     */
    public readonly connectionTypes!: pulumi.Output<string[]>;
    /**
     * The name of the Network.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Network DNS config. It applies only to the PRIVATELINK network connection type.
     */
    public readonly dnsConfig!: pulumi.Output<outputs.NetworkDnsConfig>;
    /**
     * (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     */
    public /*out*/ readonly dnsDomain!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.NetworkEnvironment>;
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    public readonly gcps!: pulumi.Output<outputs.NetworkGcp[]>;
    /**
     * The cloud provider region where the network exists.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     */
    public readonly reservedCidr!: pulumi.Output<string>;
    /**
     * (Required String) The Confluent Resource Name of the Network.
     */
    public /*out*/ readonly resourceName!: pulumi.Output<string>;
    /**
     * (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     */
    public /*out*/ readonly zonalSubdomains!: pulumi.Output<{[key: string]: string}>;
    /**
     * Each item represents information related to a single zone.
     */
    public readonly zoneInfos!: pulumi.Output<outputs.NetworkZoneInfo[]>;
    /**
     * The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    public readonly zones!: pulumi.Output<string[]>;

    /**
     * Create a Network resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkArgs | NetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkState | undefined;
            resourceInputs["aws"] = state ? state.aws : undefined;
            resourceInputs["azures"] = state ? state.azures : undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["connectionTypes"] = state ? state.connectionTypes : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["dnsConfig"] = state ? state.dnsConfig : undefined;
            resourceInputs["dnsDomain"] = state ? state.dnsDomain : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["gcps"] = state ? state.gcps : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["reservedCidr"] = state ? state.reservedCidr : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
            resourceInputs["zonalSubdomains"] = state ? state.zonalSubdomains : undefined;
            resourceInputs["zoneInfos"] = state ? state.zoneInfos : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as NetworkArgs | undefined;
            if ((!args || args.cloud === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloud'");
            }
            if ((!args || args.connectionTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionTypes'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["aws"] = args ? args.aws : undefined;
            resourceInputs["azures"] = args ? args.azures : undefined;
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["connectionTypes"] = args ? args.connectionTypes : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["dnsConfig"] = args ? args.dnsConfig : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["gcps"] = args ? args.gcps : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["reservedCidr"] = args ? args.reservedCidr : undefined;
            resourceInputs["zoneInfos"] = args ? args.zoneInfos : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
            resourceInputs["dnsDomain"] = undefined /*out*/;
            resourceInputs["resourceName"] = undefined /*out*/;
            resourceInputs["zonalSubdomains"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Network.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Network resources.
 */
export interface NetworkState {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    aws?: pulumi.Input<pulumi.Input<inputs.NetworkAw>[]>;
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    azures?: pulumi.Input<pulumi.Input<inputs.NetworkAzure>[]>;
    /**
     * The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     *
     * > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
     */
    cidr?: pulumi.Input<string>;
    /**
     * The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     */
    connectionTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Network.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Network DNS config. It applies only to the PRIVATELINK network connection type.
     */
    dnsConfig?: pulumi.Input<inputs.NetworkDnsConfig>;
    /**
     * (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     */
    dnsDomain?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.NetworkEnvironment>;
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    gcps?: pulumi.Input<pulumi.Input<inputs.NetworkGcp>[]>;
    /**
     * The cloud provider region where the network exists.
     */
    region?: pulumi.Input<string>;
    /**
     * The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     */
    reservedCidr?: pulumi.Input<string>;
    /**
     * (Required String) The Confluent Resource Name of the Network.
     */
    resourceName?: pulumi.Input<string>;
    /**
     * (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     */
    zonalSubdomains?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Each item represents information related to a single zone.
     */
    zoneInfos?: pulumi.Input<pulumi.Input<inputs.NetworkZoneInfo>[]>;
    /**
     * The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Network resource.
 */
export interface NetworkArgs {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     */
    aws?: pulumi.Input<pulumi.Input<inputs.NetworkAw>[]>;
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     */
    azures?: pulumi.Input<pulumi.Input<inputs.NetworkAzure>[]>;
    /**
     * The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     *
     * > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
     */
    cidr?: pulumi.Input<string>;
    /**
     * The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: pulumi.Input<string>;
    /**
     * The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     */
    connectionTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Network.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Network DNS config. It applies only to the PRIVATELINK network connection type.
     */
    dnsConfig?: pulumi.Input<inputs.NetworkDnsConfig>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.NetworkEnvironment>;
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     */
    gcps?: pulumi.Input<pulumi.Input<inputs.NetworkGcp>[]>;
    /**
     * The cloud provider region where the network exists.
     */
    region: pulumi.Input<string>;
    /**
     * The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     */
    reservedCidr?: pulumi.Input<string>;
    /**
     * Each item represents information related to a single zone.
     */
    zoneInfos?: pulumi.Input<pulumi.Input<inputs.NetworkZoneInfo>[]>;
    /**
     * The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}
