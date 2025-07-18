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
    ///     var example = new ConfluentCloud.SubjectMode("example", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.SubjectModeSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         SubjectName = "proto-purchase-value",
    ///         Mode = "READONLY",
    ///         Credentials = new ConfluentCloud.Inputs.SubjectModeCredentialsArgs
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
    ///     var example = new ConfluentCloud.SubjectMode("example", new()
    ///     {
    ///         SubjectName = "proto-purchase-value",
    ///         Mode = "READONLY",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Subject Mode by using the Schema Registry cluster ID, Subject name in the format `&lt;Schema Registry cluster ID&gt;/&lt;Subject name&gt;`, for example:
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/subjectMode:SubjectMode example lsrc-abc123/test-subject
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/subjectMode:SubjectMode")]
    public partial class SubjectMode : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.SubjectModeCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.SubjectModeSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        /// </summary>
        [Output("subjectName")]
        public Output<string> SubjectName { get; private set; } = null!;


        /// <summary>
        /// Create a SubjectMode resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SubjectMode(string name, SubjectModeArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/subjectMode:SubjectMode", name, args ?? new SubjectModeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SubjectMode(string name, Input<string> id, SubjectModeState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/subjectMode:SubjectMode", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SubjectMode resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SubjectMode Get(string name, Input<string> id, SubjectModeState? state = null, CustomResourceOptions? options = null)
        {
            return new SubjectMode(name, id, state, options);
        }
    }

    public sealed class SubjectModeArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SubjectModeCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SubjectModeCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SubjectModeCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SubjectModeSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        /// </summary>
        [Input("subjectName", required: true)]
        public Input<string> SubjectName { get; set; } = null!;

        public SubjectModeArgs()
        {
        }
        public static new SubjectModeArgs Empty => new SubjectModeArgs();
    }

    public sealed class SubjectModeState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SubjectModeCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SubjectModeCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SubjectModeCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// An optional flag to force a mode change even if the Schema Registry has existing schemas. This can be useful in disaster recovery (DR) scenarios using [Schema Linking](https://docs.confluent.io/cloud/current/sr/schema-linking.html). Defaults to `false`, which does not allow a mode change to `IMPORT` if Schema Registry has registered schemas. Must be unset when importing.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SubjectModeSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        /// </summary>
        [Input("subjectName")]
        public Input<string>? SubjectName { get; set; }

        public SubjectModeState()
        {
        }
        public static new SubjectModeState Empty => new SubjectModeState();
    }
}
