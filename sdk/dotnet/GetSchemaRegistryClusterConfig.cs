// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryClusterConfig
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.SchemaRegistryClusterConfig` describes a Schema Registry Cluster Config data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSchemaRegistryClusterConfigResult> InvokeAsync(GetSchemaRegistryClusterConfigArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryClusterConfigResult>("confluentcloud:index/getSchemaRegistryClusterConfig:getSchemaRegistryClusterConfig", args ?? new GetSchemaRegistryClusterConfigArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.SchemaRegistryClusterConfig` describes a Schema Registry Cluster Config data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSchemaRegistryClusterConfigResult> Invoke(GetSchemaRegistryClusterConfigInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryClusterConfigResult>("confluentcloud:index/getSchemaRegistryClusterConfig:getSchemaRegistryClusterConfig", args ?? new GetSchemaRegistryClusterConfigInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.SchemaRegistryClusterConfig` describes a Schema Registry Cluster Config data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ConfluentCloud.GetSchemaRegistryClusterConfig.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["compatibilityLevel"] = example.Apply(getSchemaRegistryClusterConfigResult =&gt; getSchemaRegistryClusterConfigResult.CompatibilityLevel),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSchemaRegistryClusterConfigResult> Invoke(GetSchemaRegistryClusterConfigInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryClusterConfigResult>("confluentcloud:index/getSchemaRegistryClusterConfig:getSchemaRegistryClusterConfig", args ?? new GetSchemaRegistryClusterConfigInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaRegistryClusterConfigArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetSchemaRegistryClusterConfigCredentialsArgs? _credentials;
        public Inputs.GetSchemaRegistryClusterConfigCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        public GetSchemaRegistryClusterConfigArgs()
        {
        }
        public static new GetSchemaRegistryClusterConfigArgs Empty => new GetSchemaRegistryClusterConfigArgs();
    }

    public sealed class GetSchemaRegistryClusterConfigInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetSchemaRegistryClusterConfigCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        public GetSchemaRegistryClusterConfigInvokeArgs()
        {
        }
        public static new GetSchemaRegistryClusterConfigInvokeArgs Empty => new GetSchemaRegistryClusterConfigInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaRegistryClusterConfigResult
    {
        /// <summary>
        /// (Required String) The global Schema Registry compatibility group.
        /// </summary>
        public readonly string CompatibilityGroup;
        /// <summary>
        /// (Required String) The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        /// </summary>
        public readonly string CompatibilityLevel;
        public readonly Outputs.GetSchemaRegistryClusterConfigCredentialsResult? Credentials;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterResult? SchemaRegistryCluster;

        [OutputConstructor]
        private GetSchemaRegistryClusterConfigResult(
            string compatibilityGroup,

            string compatibilityLevel,

            Outputs.GetSchemaRegistryClusterConfigCredentialsResult? credentials,

            string id,

            string? restEndpoint,

            Outputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterResult? schemaRegistryCluster)
        {
            CompatibilityGroup = compatibilityGroup;
            CompatibilityLevel = compatibilityLevel;
            Credentials = credentials;
            Id = id;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
        }
    }
}
