// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
    /// ## Import
    /// 
    /// You can import a Network by using Environment ID and Network ID, in the format `&lt;Environment ID&gt;/&lt;Network ID&gt;`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/network:Network")]
    public partial class Network : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        [Output("aws")]
        public Output<ImmutableArray<Outputs.NetworkAw>> Aws { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        [Output("azures")]
        public Output<ImmutableArray<Outputs.NetworkAzure>> Azures { get; private set; } = null!;

        /// <summary>
        /// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        /// </summary>
        [Output("connectionTypes")]
        public Output<ImmutableArray<string>> ConnectionTypes { get; private set; } = null!;

        /// <summary>
        /// The name of the Network.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Network DNS config. It applies only to the PRIVATELINK network connection type.
        /// </summary>
        [Output("dnsConfig")]
        public Output<Outputs.NetworkDnsConfig> DnsConfig { get; private set; } = null!;

        /// <summary>
        /// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        /// </summary>
        [Output("dnsDomain")]
        public Output<string> DnsDomain { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.NetworkEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        [Output("gcps")]
        public Output<ImmutableArray<Outputs.NetworkGcp>> Gcps { get; private set; } = null!;

        /// <summary>
        /// The cloud provider region where the network exists.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
        /// </summary>
        [Output("reservedCidr")]
        public Output<string> ReservedCidr { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network.
        /// </summary>
        [Output("resourceName")]
        public Output<string> ResourceName { get; private set; } = null!;

        /// <summary>
        /// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        /// </summary>
        [Output("zonalSubdomains")]
        public Output<ImmutableDictionary<string, string>> ZonalSubdomains { get; private set; } = null!;

        /// <summary>
        /// Each item represents information related to a single zone.
        /// </summary>
        [Output("zoneInfos")]
        public Output<ImmutableArray<Outputs.NetworkZoneInfo>> ZoneInfos { get; private set; } = null!;

        /// <summary>
        /// The 3 availability zones for this network. They can optionally be specified for AWS networks
        /// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
        /// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        [Output("zones")]
        public Output<ImmutableArray<string>> Zones { get; private set; } = null!;


        /// <summary>
        /// Create a Network resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Network(string name, NetworkArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/network:Network", name, args ?? new NetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Network(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/network:Network", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Network resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Network Get(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new Network(name, id, state, options);
        }
    }

    public sealed class NetworkArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        private InputList<Inputs.NetworkAwArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkAwArgs> Aws
        {
            get => _aws ?? (_aws = new InputList<Inputs.NetworkAwArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private InputList<Inputs.NetworkAzureArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkAzureArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.NetworkAzureArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public Input<string> Cloud { get; set; } = null!;

        [Input("connectionTypes", required: true)]
        private InputList<string>? _connectionTypes;

        /// <summary>
        /// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        /// </summary>
        public InputList<string> ConnectionTypes
        {
            get => _connectionTypes ?? (_connectionTypes = new InputList<string>());
            set => _connectionTypes = value;
        }

        /// <summary>
        /// The name of the Network.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Network DNS config. It applies only to the PRIVATELINK network connection type.
        /// </summary>
        [Input("dnsConfig")]
        public Input<Inputs.NetworkDnsConfigArgs>? DnsConfig { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.NetworkEnvironmentArgs> Environment { get; set; } = null!;

        [Input("gcps")]
        private InputList<Inputs.NetworkGcpArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkGcpArgs> Gcps
        {
            get => _gcps ?? (_gcps = new InputList<Inputs.NetworkGcpArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The cloud provider region where the network exists.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
        /// </summary>
        [Input("reservedCidr")]
        public Input<string>? ReservedCidr { get; set; }

        [Input("zoneInfos")]
        private InputList<Inputs.NetworkZoneInfoArgs>? _zoneInfos;

        /// <summary>
        /// Each item represents information related to a single zone.
        /// </summary>
        public InputList<Inputs.NetworkZoneInfoArgs> ZoneInfos
        {
            get => _zoneInfos ?? (_zoneInfos = new InputList<Inputs.NetworkZoneInfoArgs>());
            set => _zoneInfos = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// The 3 availability zones for this network. They can optionally be specified for AWS networks
        /// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
        /// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public NetworkArgs()
        {
        }
        public static new NetworkArgs Empty => new NetworkArgs();
    }

    public sealed class NetworkState : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        private InputList<Inputs.NetworkAwGetArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkAwGetArgs> Aws
        {
            get => _aws ?? (_aws = new InputList<Inputs.NetworkAwGetArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private InputList<Inputs.NetworkAzureGetArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkAzureGetArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.NetworkAzureGetArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        [Input("connectionTypes")]
        private InputList<string>? _connectionTypes;

        /// <summary>
        /// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        /// </summary>
        public InputList<string> ConnectionTypes
        {
            get => _connectionTypes ?? (_connectionTypes = new InputList<string>());
            set => _connectionTypes = value;
        }

        /// <summary>
        /// The name of the Network.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Network DNS config. It applies only to the PRIVATELINK network connection type.
        /// </summary>
        [Input("dnsConfig")]
        public Input<Inputs.NetworkDnsConfigGetArgs>? DnsConfig { get; set; }

        /// <summary>
        /// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
        /// </summary>
        [Input("dnsDomain")]
        public Input<string>? DnsDomain { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.NetworkEnvironmentGetArgs>? Environment { get; set; }

        [Input("gcps")]
        private InputList<Inputs.NetworkGcpGetArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.NetworkGcpGetArgs> Gcps
        {
            get => _gcps ?? (_gcps = new InputList<Inputs.NetworkGcpGetArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The cloud provider region where the network exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
        /// </summary>
        [Input("reservedCidr")]
        public Input<string>? ReservedCidr { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        [Input("zonalSubdomains")]
        private InputMap<string>? _zonalSubdomains;

        /// <summary>
        /// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
        /// </summary>
        public InputMap<string> ZonalSubdomains
        {
            get => _zonalSubdomains ?? (_zonalSubdomains = new InputMap<string>());
            set => _zonalSubdomains = value;
        }

        [Input("zoneInfos")]
        private InputList<Inputs.NetworkZoneInfoGetArgs>? _zoneInfos;

        /// <summary>
        /// Each item represents information related to a single zone.
        /// </summary>
        public InputList<Inputs.NetworkZoneInfoGetArgs> ZoneInfos
        {
            get => _zoneInfos ?? (_zoneInfos = new InputList<Inputs.NetworkZoneInfoGetArgs>());
            set => _zoneInfos = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// The 3 availability zones for this network. They can optionally be specified for AWS networks
        /// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
        /// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public NetworkState()
        {
        }
        public static new NetworkState Empty => new NetworkState();
    }
}
