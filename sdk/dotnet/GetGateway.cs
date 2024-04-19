// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetGateway
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getGateway` describes a Gateway data source.
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
        ///     var main = ConfluentCloud.GetGateway.Invoke(new()
        ///     {
        ///         Id = "gw-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetGatewayEnvironmentInputArgs
        ///         {
        ///             Id = "env-123abc",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gateway"] = main,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetGatewayResult> InvokeAsync(GetGatewayArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGatewayResult>("confluentcloud:index/getGateway:getGateway", args ?? new GetGatewayArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getGateway` describes a Gateway data source.
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
        ///     var main = ConfluentCloud.GetGateway.Invoke(new()
        ///     {
        ///         Id = "gw-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetGatewayEnvironmentInputArgs
        ///         {
        ///             Id = "env-123abc",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gateway"] = main,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetGatewayResult> Invoke(GetGatewayInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGatewayResult>("confluentcloud:index/getGateway:getGateway", args ?? new GetGatewayInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGatewayArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Inputs.GetGatewayEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetGatewayArgs()
        {
        }
        public static new GetGatewayArgs Empty => new GetGatewayArgs();
    }

    public sealed class GetGatewayInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Input<Inputs.GetGatewayEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetGatewayInvokeArgs()
        {
        }
        public static new GetGatewayInvokeArgs Empty => new GetGatewayInvokeArgs();
    }


    [OutputType]
    public sealed class GetGatewayResult
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGatewayAwsEgressPrivateLinkGatewayResult> AwsEgressPrivateLinkGateways;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGatewayAwsPeeringGatewayResult> AwsPeeringGateways;
        /// <summary>
        /// (Required String) A human-readable name for the Gateway.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetGatewayEnvironmentResult Environment;
        public readonly string Id;

        [OutputConstructor]
        private GetGatewayResult(
            ImmutableArray<Outputs.GetGatewayAwsEgressPrivateLinkGatewayResult> awsEgressPrivateLinkGateways,

            ImmutableArray<Outputs.GetGatewayAwsPeeringGatewayResult> awsPeeringGateways,

            string displayName,

            Outputs.GetGatewayEnvironmentResult environment,

            string id)
        {
            AwsEgressPrivateLinkGateways = awsEgressPrivateLinkGateways;
            AwsPeeringGateways = awsPeeringGateways;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
        }
    }
}
