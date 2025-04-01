// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetNetwork
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         Id = "n-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         DisplayName = "test_sa",
        ///         Description = $"test_sa for {exampleUsingId.Apply(getNetworkResult =&gt; getNetworkResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         DisplayName = "my_network",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetNetworkResult> InvokeAsync(GetNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkResult>("confluentcloud:index/getNetwork:getNetwork", args ?? new GetNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         Id = "n-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         DisplayName = "test_sa",
        ///         Description = $"test_sa for {exampleUsingId.Apply(getNetworkResult =&gt; getNetworkResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         DisplayName = "my_network",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("confluentcloud:index/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         Id = "n-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         DisplayName = "test_sa",
        ///         Description = $"test_sa for {exampleUsingId.Apply(getNetworkResult =&gt; getNetworkResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         DisplayName = "my_network",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("confluentcloud:index/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkArgs : global::Pulumi.InvokeArgs
    {
        [Input("aws")]
        private List<Inputs.GetNetworkAwArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkAwArgs> Aws
        {
            get => _aws ?? (_aws = new List<Inputs.GetNetworkAwArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private List<Inputs.GetNetworkAzureArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkAzureArgs> Azures
        {
            get => _azures ?? (_azures = new List<Inputs.GetNetworkAzureArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// A human-readable name for the Network.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        [Input("dnsConfigs")]
        private List<Inputs.GetNetworkDnsConfigArgs>? _dnsConfigs;

        /// <summary>
        /// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkDnsConfigArgs> DnsConfigs
        {
            get => _dnsConfigs ?? (_dnsConfigs = new List<Inputs.GetNetworkDnsConfigArgs>());
            set => _dnsConfigs = value;
        }

        [Input("environment", required: true)]
        public Inputs.GetNetworkEnvironmentArgs Environment { get; set; } = null!;

        [Input("gcps")]
        private List<Inputs.GetNetworkGcpArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkGcpArgs> Gcps
        {
            get => _gcps ?? (_gcps = new List<Inputs.GetNetworkGcpArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The ID of the Network, for example, `n-abc123`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetNetworkArgs()
        {
        }
        public static new GetNetworkArgs Empty => new GetNetworkArgs();
    }

    public sealed class GetNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("aws")]
        private InputList<Inputs.GetNetworkAwInputArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkAwInputArgs> Aws
        {
            get => _aws ?? (_aws = new InputList<Inputs.GetNetworkAwInputArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private InputList<Inputs.GetNetworkAzureInputArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkAzureInputArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.GetNetworkAzureInputArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// A human-readable name for the Network.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("dnsConfigs")]
        private InputList<Inputs.GetNetworkDnsConfigInputArgs>? _dnsConfigs;

        /// <summary>
        /// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkDnsConfigInputArgs> DnsConfigs
        {
            get => _dnsConfigs ?? (_dnsConfigs = new InputList<Inputs.GetNetworkDnsConfigInputArgs>());
            set => _dnsConfigs = value;
        }

        [Input("environment", required: true)]
        public Input<Inputs.GetNetworkEnvironmentInputArgs> Environment { get; set; } = null!;

        [Input("gcps")]
        private InputList<Inputs.GetNetworkGcpInputArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkGcpInputArgs> Gcps
        {
            get => _gcps ?? (_gcps = new InputList<Inputs.GetNetworkGcpInputArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The ID of the Network, for example, `n-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetNetworkInvokeArgs()
        {
        }
        public static new GetNetworkInvokeArgs Empty => new GetNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkResult
    {
        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkAwResult> Aws;
        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkAzureResult> Azures;
        /// <summary>
        /// (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        /// </summary>
        public readonly ImmutableArray<string> ConnectionTypes;
        /// <summary>
        /// (Required String) The name of the Network.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkDnsConfigResult> DnsConfigs;
        public readonly string DnsDomain;
        /// <summary>
        /// (Optional String) The endpoint suffix for the network, if applicable. It can take various forms (for example, `.pr1jy6.us-east-2.aws.confluent.cloud` or `-pr1jy6.us-east-2.aws.confluent.cloud`). Full service endpoints can be constructed by appending the service identifier to the beginning of the endpoint suffix. For example, the Flink REST endpoint can be constructed by adding `flink` — that is, `https://flink` + `endpoint_suffix`; namely, `https://flink.pr1jy6.us-east-2.aws.confluent.cloud`.
        /// </summary>
        public readonly string EndpointSuffix;
        public readonly Outputs.GetNetworkEnvironmentResult Environment;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkGatewayResult> Gateways;
        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkGcpResult> Gcps;
        /// <summary>
        /// (Optional String) The ID of the Gateway, for example, `gw-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The cloud provider region where the network exists.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
        /// </summary>
        public readonly string ReservedCidr;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network.
        /// </summary>
        public readonly string ResourceName;
        public readonly ImmutableDictionary<string, string> ZonalSubdomains;
        /// <summary>
        /// (Required Configuration Blocks) Each item represents information related to a single zone. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkZoneInfoResult> ZoneInfos;
        /// <summary>
        /// (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
        /// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
        /// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetNetworkResult(
            ImmutableArray<Outputs.GetNetworkAwResult> aws,

            ImmutableArray<Outputs.GetNetworkAzureResult> azures,

            string cidr,

            string cloud,

            ImmutableArray<string> connectionTypes,

            string displayName,

            ImmutableArray<Outputs.GetNetworkDnsConfigResult> dnsConfigs,

            string dnsDomain,

            string endpointSuffix,

            Outputs.GetNetworkEnvironmentResult environment,

            ImmutableArray<Outputs.GetNetworkGatewayResult> gateways,

            ImmutableArray<Outputs.GetNetworkGcpResult> gcps,

            string id,

            string region,

            string reservedCidr,

            string resourceName,

            ImmutableDictionary<string, string> zonalSubdomains,

            ImmutableArray<Outputs.GetNetworkZoneInfoResult> zoneInfos,

            ImmutableArray<string> zones)
        {
            Aws = aws;
            Azures = azures;
            Cidr = cidr;
            Cloud = cloud;
            ConnectionTypes = connectionTypes;
            DisplayName = displayName;
            DnsConfigs = dnsConfigs;
            DnsDomain = dnsDomain;
            EndpointSuffix = endpointSuffix;
            Environment = environment;
            Gateways = gateways;
            Gcps = gcps;
            Id = id;
            Region = region;
            ReservedCidr = reservedCidr;
            ResourceName = resourceName;
            ZonalSubdomains = zonalSubdomains;
            ZoneInfos = zoneInfos;
            Zones = zones;
        }
    }
}
