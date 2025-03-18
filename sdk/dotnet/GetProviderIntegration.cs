// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetProviderIntegration
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.ProviderIntegration` describes a Confluent Provider Integration data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         Id = "cspi-4xg0q",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         DisplayName = "provider_integration_main",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// 
        /// 
        /// ## Getting Started
        /// 
        /// The following end-to-end examples might help to get started with `confluentcloud.ProviderIntegration` data source:
        /// * `s3-sink-connector-assume-role`: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration
        /// </summary>
        public static Task<GetProviderIntegrationResult> InvokeAsync(GetProviderIntegrationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProviderIntegrationResult>("confluentcloud:index/getProviderIntegration:getProviderIntegration", args ?? new GetProviderIntegrationArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.ProviderIntegration` describes a Confluent Provider Integration data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         Id = "cspi-4xg0q",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         DisplayName = "provider_integration_main",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// 
        /// 
        /// ## Getting Started
        /// 
        /// The following end-to-end examples might help to get started with `confluentcloud.ProviderIntegration` data source:
        /// * `s3-sink-connector-assume-role`: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration
        /// </summary>
        public static Output<GetProviderIntegrationResult> Invoke(GetProviderIntegrationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProviderIntegrationResult>("confluentcloud:index/getProviderIntegration:getProviderIntegration", args ?? new GetProviderIntegrationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.ProviderIntegration` describes a Confluent Provider Integration data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         Id = "cspi-4xg0q",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetProviderIntegration.Invoke(new()
        ///     {
        ///         DisplayName = "provider_integration_main",
        ///         Environment = new ConfluentCloud.Inputs.GetProviderIntegrationEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// 
        /// 
        /// ## Getting Started
        /// 
        /// The following end-to-end examples might help to get started with `confluentcloud.ProviderIntegration` data source:
        /// * `s3-sink-connector-assume-role`: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration
        /// </summary>
        public static Output<GetProviderIntegrationResult> Invoke(GetProviderIntegrationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProviderIntegrationResult>("confluentcloud:index/getProviderIntegration:getProviderIntegration", args ?? new GetProviderIntegrationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProviderIntegrationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Provider Integration.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Inputs.GetProviderIntegrationEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Provider Integration, for example, `cspi-4xg0q`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetProviderIntegrationArgs()
        {
        }
        public static new GetProviderIntegrationArgs Empty => new GetProviderIntegrationArgs();
    }

    public sealed class GetProviderIntegrationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Provider Integration.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.GetProviderIntegrationEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Provider Integration, for example, `cspi-4xg0q`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetProviderIntegrationInvokeArgs()
        {
        }
        public static new GetProviderIntegrationInvokeArgs Empty => new GetProviderIntegrationInvokeArgs();
    }


    [OutputType]
    public sealed class GetProviderIntegrationResult
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProviderIntegrationAwResult> Aws;
        /// <summary>
        /// (Required String) A human-readable name for the Provider Integration.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetProviderIntegrationEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Environment that the Provider Integration belongs to, for example, `env-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required List of Strings) List of resource CRNs where this provider integration is being used.
        /// </summary>
        public readonly ImmutableArray<string> Usages;

        [OutputConstructor]
        private GetProviderIntegrationResult(
            ImmutableArray<Outputs.GetProviderIntegrationAwResult> aws,

            string displayName,

            Outputs.GetProviderIntegrationEnvironmentResult environment,

            string id,

            ImmutableArray<string> usages)
        {
            Aws = aws;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Usages = usages;
        }
    }
}
