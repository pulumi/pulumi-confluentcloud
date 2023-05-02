// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetNetworkLinkService
    {
        /// <summary>
        /// [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.NetworkLinkService` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.NetworkLinkService` describes a Network Link Service data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var nls = ConfluentCloud.GetNetworkLinkService.Invoke(new()
        ///     {
        ///         Id = "nls-zyw30",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkLinkServiceEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["networkLinkService"] = nls,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkLinkServiceResult> InvokeAsync(GetNetworkLinkServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkLinkServiceResult>("confluentcloud:index/getNetworkLinkService:getNetworkLinkService", args ?? new GetNetworkLinkServiceArgs(), options.WithDefaults());

        /// <summary>
        /// [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.NetworkLinkService` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.NetworkLinkService` describes a Network Link Service data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var nls = ConfluentCloud.GetNetworkLinkService.Invoke(new()
        ///     {
        ///         Id = "nls-zyw30",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkLinkServiceEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["networkLinkService"] = nls,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkLinkServiceResult> Invoke(GetNetworkLinkServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkLinkServiceResult>("confluentcloud:index/getNetworkLinkService:getNetworkLinkService", args ?? new GetNetworkLinkServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkLinkServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("accept")]
        public Inputs.GetNetworkLinkServiceAcceptArgs? Accept { get; set; }

        [Input("environment", required: true)]
        public Inputs.GetNetworkLinkServiceEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetNetworkLinkServiceArgs()
        {
        }
        public static new GetNetworkLinkServiceArgs Empty => new GetNetworkLinkServiceArgs();
    }

    public sealed class GetNetworkLinkServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("accept")]
        public Input<Inputs.GetNetworkLinkServiceAcceptInputArgs>? Accept { get; set; }

        [Input("environment", required: true)]
        public Input<Inputs.GetNetworkLinkServiceEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetNetworkLinkServiceInvokeArgs()
        {
        }
        public static new GetNetworkLinkServiceInvokeArgs Empty => new GetNetworkLinkServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkLinkServiceResult
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetNetworkLinkServiceAcceptResult Accept;
        /// <summary>
        /// (Optional String) The description of the Network Link Service.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Optional String) The name of the Network Link Service.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetNetworkLinkServiceEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Network that the Network Link Service belongs to, for example, `n-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkLinkServiceNetworkResult> Networks;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network Link Service.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetNetworkLinkServiceResult(
            Outputs.GetNetworkLinkServiceAcceptResult accept,

            string description,

            string displayName,

            Outputs.GetNetworkLinkServiceEnvironmentResult environment,

            string id,

            ImmutableArray<Outputs.GetNetworkLinkServiceNetworkResult> networks,

            string resourceName)
        {
            Accept = accept;
            Description = description;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Networks = networks;
            ResourceName = resourceName;
        }
    }
}