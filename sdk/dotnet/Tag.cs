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
    /// You can import a Tag by using the Schema Registry cluster ID, Tag name in the format `&lt;Schema Registry cluster ID&gt;/&lt;Tag name&gt;`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/tag:Tag pii lsrc-8wrx70/PII
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/tag:Tag")]
    public partial class Tag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.TagCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The description of the tag to be created.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        /// </summary>
        [Output("entityTypes")]
        public Output<ImmutableArray<string>> EntityTypes { get; private set; } = null!;

        /// <summary>
        /// The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.TagSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;

        /// <summary>
        /// (Optional Integer) The version, for example, `1`.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Tag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tag(string name, TagArgs? args = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tag:Tag", name, args ?? new TagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tag(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tag:Tag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tag Get(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
        {
            return new Tag(name, id, state, options);
        }
    }

    public sealed class TagArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.TagCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TagCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TagCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The description of the tag to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.TagSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        public TagArgs()
        {
        }
        public static new TagArgs Empty => new TagArgs();
    }

    public sealed class TagState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.TagCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TagCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TagCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The description of the tag to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entityTypes")]
        private InputList<string>? _entityTypes;

        /// <summary>
        /// (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
        /// </summary>
        public InputList<string> EntityTypes
        {
            get => _entityTypes ?? (_entityTypes = new InputList<string>());
            set => _entityTypes = value;
        }

        /// <summary>
        /// The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.TagSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// (Optional Integer) The version, for example, `1`.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public TagState()
        {
        }
        public static new TagState Empty => new TagState();
    }
}
