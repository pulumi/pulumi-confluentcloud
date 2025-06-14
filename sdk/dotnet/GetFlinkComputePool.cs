// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetFlinkComputePool
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.FlinkComputePool` describes a Flink Compute Pool data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         Id = "lfcp-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         DisplayName = "my_compute_pool",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
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
        /// </summary>
        public static Task<GetFlinkComputePoolResult> InvokeAsync(GetFlinkComputePoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlinkComputePoolResult>("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", args ?? new GetFlinkComputePoolArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.FlinkComputePool` describes a Flink Compute Pool data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         Id = "lfcp-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         DisplayName = "my_compute_pool",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
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
        /// </summary>
        public static Output<GetFlinkComputePoolResult> Invoke(GetFlinkComputePoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlinkComputePoolResult>("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", args ?? new GetFlinkComputePoolInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.FlinkComputePool` describes a Flink Compute Pool data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         Id = "lfcp-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetFlinkComputePool.Invoke(new()
        ///     {
        ///         DisplayName = "my_compute_pool",
        ///         Environment = new ConfluentCloud.Inputs.GetFlinkComputePoolEnvironmentInputArgs
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
        /// </summary>
        public static Output<GetFlinkComputePoolResult> Invoke(GetFlinkComputePoolInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlinkComputePoolResult>("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", args ?? new GetFlinkComputePoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlinkComputePoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Flink Compute Pool.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Inputs.GetFlinkComputePoolEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Flink Compute Pool, for example, `lfcp-abc123`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetFlinkComputePoolArgs()
        {
        }
        public static new GetFlinkComputePoolArgs Empty => new GetFlinkComputePoolArgs();
    }

    public sealed class GetFlinkComputePoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Flink Compute Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.GetFlinkComputePoolEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Flink Compute Pool, for example, `lfcp-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetFlinkComputePoolInvokeArgs()
        {
        }
        public static new GetFlinkComputePoolInvokeArgs Empty => new GetFlinkComputePoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlinkComputePoolResult
    {
        /// <summary>
        /// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The cloud service provider that runs the Flink Compute Pool.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Required String) The name of the Flink Compute Pool.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetFlinkComputePoolEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Required Integer) Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to.
        /// </summary>
        public readonly int MaxCfu;
        /// <summary>
        /// (Required String) The cloud service provider region that hosts the Flink Compute Pool.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Flink Compute Pool.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetFlinkComputePoolResult(
            string apiVersion,

            string cloud,

            string displayName,

            Outputs.GetFlinkComputePoolEnvironmentResult environment,

            string id,

            string kind,

            int maxCfu,

            string region,

            string resourceName)
        {
            ApiVersion = apiVersion;
            Cloud = cloud;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Kind = kind;
            MaxCfu = maxCfu;
            Region = region;
            ResourceName = resourceName;
        }
    }
}
