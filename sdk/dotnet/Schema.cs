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
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// You can import a Schema by using the Schema Registry cluster ID, Subject name, and unique identifier (or `latest` when `recreate_on_update = false`) of the Schema in the format `&lt;Schema Registry cluster ID&gt;/&lt;Subject name&gt;/&lt;Schema identifier&gt;`, for example:
    /// 
    /// Option A: recreate_on_update = false (by default)
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/latest
    /// ```
    /// 
    /// Option B: recreate_on_update = true
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="&lt;schema_registry_api_key&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="&lt;schema_registry_api_secret&gt;"
    /// 
    /// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="&lt;schema_registry_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/100003
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/schema:Schema")]
    public partial class Schema : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.SchemaCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
        /// </summary>
        [Output("format")]
        public Output<string> Format { get; private set; } = null!;

        /// <summary>
        /// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
        /// </summary>
        [Output("hardDelete")]
        public Output<bool?> HardDelete { get; private set; } = null!;

        /// <summary>
        /// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
        /// </summary>
        [Output("metadata")]
        public Output<Outputs.SchemaMetadata> Metadata { get; private set; } = null!;

        /// <summary>
        /// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
        /// </summary>
        [Output("recreateOnUpdate")]
        public Output<bool?> RecreateOnUpdate { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        /// <summary>
        /// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
        /// </summary>
        [Output("ruleset")]
        public Output<Outputs.SchemaRuleset> Ruleset { get; private set; } = null!;

        /// <summary>
        /// The schema string, for example, `file("./schema_version_1.avsc")`.
        /// </summary>
        [Output("schema")]
        public Output<string> SchemaDetails { get; private set; } = null!;

        /// <summary>
        /// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
        /// </summary>
        [Output("schemaIdentifier")]
        public Output<int> SchemaIdentifier { get; private set; } = null!;

        /// <summary>
        /// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
        /// </summary>
        [Output("schemaReferences")]
        public Output<ImmutableArray<Outputs.SchemaSchemaReference>> SchemaReferences { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.SchemaSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;

        /// <summary>
        /// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
        /// </summary>
        [Output("skipValidationDuringPlan")]
        public Output<bool?> SkipValidationDuringPlan { get; private set; } = null!;

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
        /// </summary>
        [Output("subjectName")]
        public Output<string> SubjectName { get; private set; } = null!;

        /// <summary>
        /// (Required Integer) The version of the Schema, for example, `4`.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Schema resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Schema(string name, SchemaArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schema:Schema", name, args ?? new SchemaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Schema(string name, Input<string> id, SchemaState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schema:Schema", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Schema resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Schema Get(string name, Input<string> id, SchemaState? state = null, CustomResourceOptions? options = null)
        {
            return new Schema(name, id, state, options);
        }
    }

    public sealed class SchemaArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        /// <summary>
        /// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
        /// </summary>
        [Input("hardDelete")]
        public Input<bool>? HardDelete { get; set; }

        /// <summary>
        /// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.SchemaMetadataArgs>? Metadata { get; set; }

        /// <summary>
        /// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
        /// </summary>
        [Input("recreateOnUpdate")]
        public Input<bool>? RecreateOnUpdate { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
        /// </summary>
        [Input("ruleset")]
        public Input<Inputs.SchemaRulesetArgs>? Ruleset { get; set; }

        /// <summary>
        /// The schema string, for example, `file("./schema_version_1.avsc")`.
        /// </summary>
        [Input("schema")]
        public Input<string>? SchemaDetails { get; set; }

        [Input("schemaReferences")]
        private InputList<Inputs.SchemaSchemaReferenceArgs>? _schemaReferences;

        /// <summary>
        /// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
        /// </summary>
        public InputList<Inputs.SchemaSchemaReferenceArgs> SchemaReferences
        {
            get => _schemaReferences ?? (_schemaReferences = new InputList<Inputs.SchemaSchemaReferenceArgs>());
            set => _schemaReferences = value;
        }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
        /// </summary>
        [Input("skipValidationDuringPlan")]
        public Input<bool>? SkipValidationDuringPlan { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
        /// </summary>
        [Input("subjectName", required: true)]
        public Input<string> SubjectName { get; set; } = null!;

        public SchemaArgs()
        {
        }
        public static new SchemaArgs Empty => new SchemaArgs();
    }

    public sealed class SchemaState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
        /// </summary>
        [Input("hardDelete")]
        public Input<bool>? HardDelete { get; set; }

        /// <summary>
        /// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.SchemaMetadataGetArgs>? Metadata { get; set; }

        /// <summary>
        /// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
        /// </summary>
        [Input("recreateOnUpdate")]
        public Input<bool>? RecreateOnUpdate { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
        /// </summary>
        [Input("ruleset")]
        public Input<Inputs.SchemaRulesetGetArgs>? Ruleset { get; set; }

        /// <summary>
        /// The schema string, for example, `file("./schema_version_1.avsc")`.
        /// </summary>
        [Input("schema")]
        public Input<string>? SchemaDetails { get; set; }

        /// <summary>
        /// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
        /// </summary>
        [Input("schemaIdentifier")]
        public Input<int>? SchemaIdentifier { get; set; }

        [Input("schemaReferences")]
        private InputList<Inputs.SchemaSchemaReferenceGetArgs>? _schemaReferences;

        /// <summary>
        /// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
        /// </summary>
        public InputList<Inputs.SchemaSchemaReferenceGetArgs> SchemaReferences
        {
            get => _schemaReferences ?? (_schemaReferences = new InputList<Inputs.SchemaSchemaReferenceGetArgs>());
            set => _schemaReferences = value;
        }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
        /// </summary>
        [Input("skipValidationDuringPlan")]
        public Input<bool>? SkipValidationDuringPlan { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
        /// </summary>
        [Input("subjectName")]
        public Input<string>? SubjectName { get; set; }

        /// <summary>
        /// (Required Integer) The version of the Schema, for example, `4`.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public SchemaState()
        {
        }
        public static new SchemaState Empty => new SchemaState();
    }
}
