// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
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
    ///     var example = new ConfluentCloud.SchemaRegistryClusterConfig("example", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.SchemaRegistryClusterConfigSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         CompatibilityLevel = "FULL",
    ///         Credentials = new ConfluentCloud.Inputs.SchemaRegistryClusterConfigCredentialsArgs
    ///         {
    ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
    ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
    ///         },
    ///     });
    /// 
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
    ///     var example = new ConfluentCloud.SchemaRegistryClusterConfig("example", new()
    ///     {
    ///         CompatibilityLevel = "FULL",
    ///         CompatibilityGroup = "abc.cg.version",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Schema Registry Cluster Config by using the Schema Registry cluster ID, Subject name in the format `&lt;Schema Registry cluster ID&gt;`, for example:
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig example lsrc-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig")]
    public partial class SchemaRegistryClusterConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The global Schema Registry compatibility group.
        /// </summary>
        [Output("compatibilityGroup")]
        public Output<string> CompatibilityGroup { get; private set; } = null!;

        /// <summary>
        /// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        /// </summary>
        [Output("compatibilityLevel")]
        public Output<string> CompatibilityLevel { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.SchemaRegistryClusterConfigCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.SchemaRegistryClusterConfigSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;


        /// <summary>
        /// Create a SchemaRegistryClusterConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchemaRegistryClusterConfig(string name, SchemaRegistryClusterConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig", name, args ?? new SchemaRegistryClusterConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchemaRegistryClusterConfig(string name, Input<string> id, SchemaRegistryClusterConfigState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "credentials",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SchemaRegistryClusterConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchemaRegistryClusterConfig Get(string name, Input<string> id, SchemaRegistryClusterConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new SchemaRegistryClusterConfig(name, id, state, options);
        }
    }

    public sealed class SchemaRegistryClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The global Schema Registry compatibility group.
        /// </summary>
        [Input("compatibilityGroup")]
        public Input<string>? CompatibilityGroup { get; set; }

        /// <summary>
        /// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        /// </summary>
        [Input("compatibilityLevel")]
        public Input<string>? CompatibilityLevel { get; set; }

        [Input("credentials")]
        private Input<Inputs.SchemaRegistryClusterConfigCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryClusterConfigCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryClusterConfigCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryClusterConfigSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        public SchemaRegistryClusterConfigArgs()
        {
        }
        public static new SchemaRegistryClusterConfigArgs Empty => new SchemaRegistryClusterConfigArgs();
    }

    public sealed class SchemaRegistryClusterConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The global Schema Registry compatibility group.
        /// </summary>
        [Input("compatibilityGroup")]
        public Input<string>? CompatibilityGroup { get; set; }

        /// <summary>
        /// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        /// </summary>
        [Input("compatibilityLevel")]
        public Input<string>? CompatibilityLevel { get; set; }

        [Input("credentials")]
        private Input<Inputs.SchemaRegistryClusterConfigCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryClusterConfigCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryClusterConfigCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryClusterConfigSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        public SchemaRegistryClusterConfigState()
        {
        }
        public static new SchemaRegistryClusterConfigState Empty => new SchemaRegistryClusterConfigState();
    }
}
