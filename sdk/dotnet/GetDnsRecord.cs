// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetDnsRecord
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.DnsRecord` describes a DNS Record data source.
        /// 
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
        ///     var main = ConfluentCloud.GetDnsRecord.Invoke(new()
        ///     {
        ///         Id = "dnsrec-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetDnsRecordEnvironmentInputArgs
        ///         {
        ///             Id = "env-123abc",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dnsRecord"] = main,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDnsRecordResult> InvokeAsync(GetDnsRecordArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDnsRecordResult>("confluentcloud:index/getDnsRecord:getDnsRecord", args ?? new GetDnsRecordArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.DnsRecord` describes a DNS Record data source.
        /// 
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
        ///     var main = ConfluentCloud.GetDnsRecord.Invoke(new()
        ///     {
        ///         Id = "dnsrec-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetDnsRecordEnvironmentInputArgs
        ///         {
        ///             Id = "env-123abc",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dnsRecord"] = main,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDnsRecordResult> Invoke(GetDnsRecordInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDnsRecordResult>("confluentcloud:index/getDnsRecord:getDnsRecord", args ?? new GetDnsRecordInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDnsRecordArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Inputs.GetDnsRecordEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the DNS Record, for example, `dnsrec-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDnsRecordArgs()
        {
        }
        public static new GetDnsRecordArgs Empty => new GetDnsRecordArgs();
    }

    public sealed class GetDnsRecordInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Input<Inputs.GetDnsRecordEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the DNS Record, for example, `dnsrec-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDnsRecordInvokeArgs()
        {
        }
        public static new GetDnsRecordInvokeArgs Empty => new GetDnsRecordInvokeArgs();
    }


    [OutputType]
    public sealed class GetDnsRecordResult
    {
        /// <summary>
        /// (Required String) A human-readable name for the DNS Record.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) The fully qualified domain name of the DNS Record.
        /// </summary>
        public readonly string Domain;
        public readonly Outputs.GetDnsRecordEnvironmentResult Environment;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDnsRecordGatewayResult> Gateways;
        /// <summary>
        /// (Required String) The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDnsRecordPrivateLinkAccessPointResult> PrivateLinkAccessPoints;

        [OutputConstructor]
        private GetDnsRecordResult(
            string displayName,

            string domain,

            Outputs.GetDnsRecordEnvironmentResult environment,

            ImmutableArray<Outputs.GetDnsRecordGatewayResult> gateways,

            string id,

            ImmutableArray<Outputs.GetDnsRecordPrivateLinkAccessPointResult> privateLinkAccessPoints)
        {
            DisplayName = displayName;
            Domain = domain;
            Environment = environment;
            Gateways = gateways;
            Id = id;
            PrivateLinkAccessPoints = privateLinkAccessPoints;
        }
    }
}