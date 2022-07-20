// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetPrivateLinkAccess
    {
        /// <summary>
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.PrivateLinkAccess` describes a Network data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleUsingIdPrivateLinkAccess = Output.Create(ConfluentCloud.GetPrivateLinkAccess.InvokeAsync(new ConfluentCloud.GetPrivateLinkAccessArgs
        ///         {
        ///             Id = "pla-abc123",
        ///             Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentArgs
        ///             {
        ///                 Id = "env-xyz456",
        ///             },
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdPrivateLinkAccess;
        ///         var exampleUsingNamePrivateLinkAccess = Output.Create(ConfluentCloud.GetPrivateLinkAccess.InvokeAsync(new ConfluentCloud.GetPrivateLinkAccessArgs
        ///         {
        ///             DisplayName = "my_pla",
        ///             Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentArgs
        ///             {
        ///                 Id = "env-xyz456",
        ///             },
        ///         }));
        ///         this.ExampleUsingName = exampleUsingNamePrivateLinkAccess;
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        ///     [Output("exampleUsingName")]
        ///     public Output&lt;string&gt; ExampleUsingName { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivateLinkAccessResult> InvokeAsync(GetPrivateLinkAccessArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLinkAccessResult>("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", args ?? new GetPrivateLinkAccessArgs(), options.WithDefaults());

        /// <summary>
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.PrivateLinkAccess` describes a Network data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleUsingIdPrivateLinkAccess = Output.Create(ConfluentCloud.GetPrivateLinkAccess.InvokeAsync(new ConfluentCloud.GetPrivateLinkAccessArgs
        ///         {
        ///             Id = "pla-abc123",
        ///             Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentArgs
        ///             {
        ///                 Id = "env-xyz456",
        ///             },
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdPrivateLinkAccess;
        ///         var exampleUsingNamePrivateLinkAccess = Output.Create(ConfluentCloud.GetPrivateLinkAccess.InvokeAsync(new ConfluentCloud.GetPrivateLinkAccessArgs
        ///         {
        ///             DisplayName = "my_pla",
        ///             Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentArgs
        ///             {
        ///                 Id = "env-xyz456",
        ///             },
        ///         }));
        ///         this.ExampleUsingName = exampleUsingNamePrivateLinkAccess;
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        ///     [Output("exampleUsingName")]
        ///     public Output&lt;string&gt; ExampleUsingName { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrivateLinkAccessResult> Invoke(GetPrivateLinkAccessInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetPrivateLinkAccessResult>("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", args ?? new GetPrivateLinkAccessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLinkAccessArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Inputs.GetPrivateLinkAccessEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetPrivateLinkAccessArgs()
        {
        }
    }

    public sealed class GetPrivateLinkAccessInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Input<Inputs.GetPrivateLinkAccessEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetPrivateLinkAccessInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPrivateLinkAccessResult
    {
        /// <summary>
        /// (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAccessAwResult> Aws;
        /// <summary>
        /// (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAccessAzureResult> Azures;
        /// <summary>
        /// (Optional String) The name of the Private Link Access.
        /// - `environment` (Required Configuration Block) supports the following:
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetPrivateLinkAccessEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetPrivateLinkAccessNetworkResult> Networks;

        [OutputConstructor]
        private GetPrivateLinkAccessResult(
            ImmutableArray<Outputs.GetPrivateLinkAccessAwResult> aws,

            ImmutableArray<Outputs.GetPrivateLinkAccessAzureResult> azures,

            string displayName,

            Outputs.GetPrivateLinkAccessEnvironmentResult environment,

            string id,

            ImmutableArray<Outputs.GetPrivateLinkAccessNetworkResult> networks)
        {
            Aws = aws;
            Azures = azures;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Networks = networks;
        }
    }
}
