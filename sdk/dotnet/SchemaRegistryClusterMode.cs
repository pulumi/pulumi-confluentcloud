// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
    /// ## Import
    /// 
    /// You can import a Mode by using the Schema Registry cluster ID, Subject name in the format `&lt;Schema Registry cluster ID&gt;`, for example:
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode example lsrc-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode")]
    public partial class SchemaRegistryClusterMode : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.SchemaRegistryClusterModeCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.SchemaRegistryClusterModeSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;


        /// <summary>
        /// Create a SchemaRegistryClusterMode resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchemaRegistryClusterMode(string name, SchemaRegistryClusterModeArgs? args = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, args ?? new SchemaRegistryClusterModeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchemaRegistryClusterMode(string name, Input<string> id, SchemaRegistryClusterModeState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SchemaRegistryClusterMode resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchemaRegistryClusterMode Get(string name, Input<string> id, SchemaRegistryClusterModeState? state = null, CustomResourceOptions? options = null)
        {
            return new SchemaRegistryClusterMode(name, id, state, options);
        }
    }

    public sealed class SchemaRegistryClusterModeArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaRegistryClusterModeCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryClusterModeCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryClusterModeCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryClusterModeSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        public SchemaRegistryClusterModeArgs()
        {
        }
        public static new SchemaRegistryClusterModeArgs Empty => new SchemaRegistryClusterModeArgs();
    }

    public sealed class SchemaRegistryClusterModeState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaRegistryClusterModeCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryClusterModeCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryClusterModeCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryClusterModeSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        public SchemaRegistryClusterModeState()
        {
        }
        public static new SchemaRegistryClusterModeState Empty => new SchemaRegistryClusterModeState();
    }
}
