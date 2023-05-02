// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetNetworkLinkEndpoint
    {
        /// <summary>
        /// [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.NetworkLinkEndpoint` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
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
        ///     var nle = ConfluentCloud.GetNetworkLinkEndpoint.Invoke(new()
        ///     {
        ///         Id = "nle-1357",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkLinkEndpointEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["networkLinkEndpoint"] = nle,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkLinkEndpointResult> InvokeAsync(GetNetworkLinkEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkLinkEndpointResult>("confluentcloud:index/getNetworkLinkEndpoint:getNetworkLinkEndpoint", args ?? new GetNetworkLinkEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// [![Early Access](https://img.shields.io/badge/Lifecycle%20Stage-Early%20Access-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.NetworkLinkEndpoint` data source is available in **Early Access** for early adopters. Early Access features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Early Access** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Early Access features. Early Access features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Early Access releases of the Early Access features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.NetworkLinkEndpoint` describes a Network Link Endpoint data source.
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
        ///     var nle = ConfluentCloud.GetNetworkLinkEndpoint.Invoke(new()
        ///     {
        ///         Id = "nle-1357",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkLinkEndpointEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["networkLinkEndpoint"] = nle,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkLinkEndpointResult> Invoke(GetNetworkLinkEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkLinkEndpointResult>("confluentcloud:index/getNetworkLinkEndpoint:getNetworkLinkEndpoint", args ?? new GetNetworkLinkEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkLinkEndpointArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Inputs.GetNetworkLinkEndpointEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetNetworkLinkEndpointArgs()
        {
        }
        public static new GetNetworkLinkEndpointArgs Empty => new GetNetworkLinkEndpointArgs();
    }

    public sealed class GetNetworkLinkEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Input<Inputs.GetNetworkLinkEndpointEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetNetworkLinkEndpointInvokeArgs()
        {
        }
        public static new GetNetworkLinkEndpointInvokeArgs Empty => new GetNetworkLinkEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkLinkEndpointResult
    {
        /// <summary>
        /// (Optional String) The description of the Network Link Endpoint.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Optional String) The name of the Network Link Endpoint.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetNetworkLinkEndpointEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Network Link Service
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkLinkEndpointNetworkLinkServiceResult> NetworkLinkServices;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkLinkEndpointNetworkResult> Networks;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network Link Endpoint.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetNetworkLinkEndpointResult(
            string description,

            string displayName,

            Outputs.GetNetworkLinkEndpointEnvironmentResult environment,

            string id,

            ImmutableArray<Outputs.GetNetworkLinkEndpointNetworkLinkServiceResult> networkLinkServices,

            ImmutableArray<Outputs.GetNetworkLinkEndpointNetworkResult> networks,

            string resourceName)
        {
            Description = description;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            NetworkLinkServices = networkLinkServices;
            Networks = networks;
            ResourceName = resourceName;
        }
    }
}