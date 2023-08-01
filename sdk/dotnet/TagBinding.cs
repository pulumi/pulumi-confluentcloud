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
    /// You can import a Tag Binding by using the Schema Registry cluster ID, Tag name, entity name and entity type in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Tag Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/tagBinding:TagBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/tagBinding:TagBinding")]
    public partial class TagBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.TagBindingCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Output("entityName")]
        public Output<string> EntityName { get; private set; } = null!;

        /// <summary>
        /// The entity type.
        /// </summary>
        [Output("entityType")]
        public Output<string> EntityType { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.TagBindingSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;

        /// <summary>
        /// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Output("tagName")]
        public Output<string> TagName { get; private set; } = null!;


        /// <summary>
        /// Create a TagBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagBinding(string name, TagBindingArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tagBinding:TagBinding", name, args ?? new TagBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagBinding(string name, Input<string> id, TagBindingState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tagBinding:TagBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagBinding Get(string name, Input<string> id, TagBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new TagBinding(name, id, state, options);
        }
    }

    public sealed class TagBindingArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.TagBindingCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TagBindingCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TagBindingCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName", required: true)]
        public Input<string> EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.TagBindingSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("tagName", required: true)]
        public Input<string> TagName { get; set; } = null!;

        public TagBindingArgs()
        {
        }
        public static new TagBindingArgs Empty => new TagBindingArgs();
    }

    public sealed class TagBindingState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.TagBindingCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TagBindingCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TagBindingCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName")]
        public Input<string>? EntityName { get; set; }

        /// <summary>
        /// The entity type.
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.TagBindingSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("tagName")]
        public Input<string>? TagName { get; set; }

        public TagBindingState()
        {
        }
        public static new TagBindingState Empty => new TagBindingState();
    }
}
