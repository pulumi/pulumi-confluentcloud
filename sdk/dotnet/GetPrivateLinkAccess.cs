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
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAccess` describes a Private Link Access data source.
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
        ///     var exampleUsingIdPrivateLinkAccess = ConfluentCloud.GetPrivateLinkAccess.Invoke(new()
        ///     {
        ///         Id = "pla-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingNamePrivateLinkAccess = ConfluentCloud.GetPrivateLinkAccess.Invoke(new()
        ///     {
        ///         DisplayName = "my_pla",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdPrivateLinkAccess,
        ///         ["exampleUsingName"] = exampleUsingNamePrivateLinkAccess,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivateLinkAccessResult> InvokeAsync(GetPrivateLinkAccessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLinkAccessResult>("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", args ?? new GetPrivateLinkAccessArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAccess` describes a Private Link Access data source.
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
        ///     var exampleUsingIdPrivateLinkAccess = ConfluentCloud.GetPrivateLinkAccess.Invoke(new()
        ///     {
        ///         Id = "pla-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingNamePrivateLinkAccess = ConfluentCloud.GetPrivateLinkAccess.Invoke(new()
        ///     {
        ///         DisplayName = "my_pla",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAccessEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdPrivateLinkAccess,
        ///         ["exampleUsingName"] = exampleUsingNamePrivateLinkAccess,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrivateLinkAccessResult> Invoke(GetPrivateLinkAccessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLinkAccessResult>("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", args ?? new GetPrivateLinkAccessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLinkAccessArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Inputs.GetPrivateLinkAccessEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetPrivateLinkAccessArgs()
        {
        }
        public static new GetPrivateLinkAccessArgs Empty => new GetPrivateLinkAccessArgs();
    }

    public sealed class GetPrivateLinkAccessInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.GetPrivateLinkAccessEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetPrivateLinkAccessInvokeArgs()
        {
        }
        public static new GetPrivateLinkAccessInvokeArgs Empty => new GetPrivateLinkAccessInvokeArgs();
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
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetPrivateLinkAccessEnvironmentResult Environment;
        /// <summary>
        /// (Optional Configuration Block) The GCP-specific Private Service Connect details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAccessGcpResult> Gcps;
        /// <summary>
        /// (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAccessNetworkResult> Networks;

        [OutputConstructor]
        private GetPrivateLinkAccessResult(
            ImmutableArray<Outputs.GetPrivateLinkAccessAwResult> aws,

            ImmutableArray<Outputs.GetPrivateLinkAccessAzureResult> azures,

            string displayName,

            Outputs.GetPrivateLinkAccessEnvironmentResult environment,

            ImmutableArray<Outputs.GetPrivateLinkAccessGcpResult> gcps,

            string id,

            ImmutableArray<Outputs.GetPrivateLinkAccessNetworkResult> networks)
        {
            Aws = aws;
            Azures = azures;
            DisplayName = displayName;
            Environment = environment;
            Gcps = gcps;
            Id = id;
            Networks = networks;
        }
    }
}
