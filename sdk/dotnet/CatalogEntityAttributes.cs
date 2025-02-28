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
    ///     var environment = new ConfluentCloud.CatalogEntityAttributes("environment", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.CatalogEntityAttributesSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         Credentials = new ConfluentCloud.Inputs.CatalogEntityAttributesCredentialsArgs
    ///         {
    ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
    ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
    ///         },
    ///         EntityName = main.Id,
    ///         EntityType = "cf_environment",
    ///         Attributes = 
    ///         {
    ///             { "description", "Environment description" },
    ///         },
    ///     });
    /// 
    ///     var kafka_cluster = new ConfluentCloud.CatalogEntityAttributes("kafka-cluster", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.CatalogEntityAttributesSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         Credentials = new ConfluentCloud.Inputs.CatalogEntityAttributesCredentialsArgs
    ///         {
    ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
    ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
    ///         },
    ///         EntityName = basic.Id,
    ///         EntityType = "kafka_logical_cluster",
    ///         Attributes = 
    ///         {
    ///             { "description", "Kafka Cluster description" },
    ///         },
    ///     });
    /// 
    ///     var topic = new ConfluentCloud.CatalogEntityAttributes("topic", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.CatalogEntityAttributesSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         Credentials = new ConfluentCloud.Inputs.CatalogEntityAttributesCredentialsArgs
    ///         {
    ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
    ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
    ///         },
    ///         EntityName = $"{basic.Id}:{purchase.TopicName}",
    ///         EntityType = "kafka_topic",
    ///         Attributes = 
    ///         {
    ///             { "owner", "dev" },
    ///             { "description", "Kafka topic for orders" },
    ///             { "ownerEmail", "dev@gmail.com" },
    ///         },
    ///     });
    /// 
    ///     var schema = new ConfluentCloud.CatalogEntityAttributes("schema", new()
    ///     {
    ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.CatalogEntityAttributesSchemaRegistryClusterArgs
    ///         {
    ///             Id = essentials.Id,
    ///         },
    ///         RestEndpoint = essentials.RestEndpoint,
    ///         Credentials = new ConfluentCloud.Inputs.CatalogEntityAttributesCredentialsArgs
    ///         {
    ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
    ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
    ///         },
    ///         EntityName = $"{essentials.Id}:.:{purchaseConfluentSchema.SchemaIdentifier}",
    ///         EntityType = "sr_schema",
    ///         Attributes = 
    ///         {
    ///             { "description", "Schema description" },
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
    ///     var environment = new ConfluentCloud.CatalogEntityAttributes("environment", new()
    ///     {
    ///         EntityName = environmentId,
    ///         EntityType = "cf_environment",
    ///         Attributes = 
    ///         {
    ///             { "description", "Environment description" },
    ///         },
    ///     });
    /// 
    ///     var kafka_cluster = new ConfluentCloud.CatalogEntityAttributes("kafka-cluster", new()
    ///     {
    ///         EntityName = kafkaClusterId,
    ///         EntityType = "kafka_logical_cluster",
    ///         Attributes = 
    ///         {
    ///             { "description", "Kafka Cluster description" },
    ///         },
    ///     });
    /// 
    ///     var topic = new ConfluentCloud.CatalogEntityAttributes("topic", new()
    ///     {
    ///         EntityName = $"{kafkaClusterId}:{kafkaTopicName}",
    ///         EntityType = "kafka_topic",
    ///         Attributes = 
    ///         {
    ///             { "owner", "dev" },
    ///             { "description", "Kafka topic for orders" },
    ///             { "ownerEmail", "dev@gmail.com" },
    ///         },
    ///     });
    /// 
    ///     var schema = new ConfluentCloud.CatalogEntityAttributes("schema", new()
    ///     {
    ///         EntityName = $"{schemaRegistryClusterId}:.:{purchase.SchemaIdentifier}",
    ///         EntityType = "sr_schema",
    ///         Attributes = 
    ///         {
    ///             { "description", "Schema description" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &gt; **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes")]
    public partial class CatalogEntityAttributes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The attributes.
        /// </summary>
        [Output("attributes")]
        public Output<ImmutableDictionary<string, string>?> Attributes { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.CatalogEntityAttributesCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        /// </summary>
        [Output("entityName")]
        public Output<string> EntityName { get; private set; } = null!;

        /// <summary>
        /// The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        /// </summary>
        [Output("entityType")]
        public Output<string> EntityType { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.CatalogEntityAttributesSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;


        /// <summary>
        /// Create a CatalogEntityAttributes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CatalogEntityAttributes(string name, CatalogEntityAttributesArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes", name, args ?? new CatalogEntityAttributesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CatalogEntityAttributes(string name, Input<string> id, CatalogEntityAttributesState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CatalogEntityAttributes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CatalogEntityAttributes Get(string name, Input<string> id, CatalogEntityAttributesState? state = null, CustomResourceOptions? options = null)
        {
            return new CatalogEntityAttributes(name, id, state, options);
        }
    }

    public sealed class CatalogEntityAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputMap<string>? _attributes;

        /// <summary>
        /// The attributes.
        /// </summary>
        public InputMap<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputMap<string>());
            set => _attributes = value;
        }

        [Input("credentials")]
        private Input<Inputs.CatalogEntityAttributesCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.CatalogEntityAttributesCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.CatalogEntityAttributesCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        /// </summary>
        [Input("entityName", required: true)]
        public Input<string> EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.CatalogEntityAttributesSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        public CatalogEntityAttributesArgs()
        {
        }
        public static new CatalogEntityAttributesArgs Empty => new CatalogEntityAttributesArgs();
    }

    public sealed class CatalogEntityAttributesState : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputMap<string>? _attributes;

        /// <summary>
        /// The attributes.
        /// </summary>
        public InputMap<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputMap<string>());
            set => _attributes = value;
        }

        [Input("credentials")]
        private Input<Inputs.CatalogEntityAttributesCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.CatalogEntityAttributesCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.CatalogEntityAttributesCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
        /// </summary>
        [Input("entityName")]
        public Input<string>? EntityName { get; set; }

        /// <summary>
        /// The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to see the full list of supported values for the `entity_type` attribute.
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.CatalogEntityAttributesSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        public CatalogEntityAttributesState()
        {
        }
        public static new CatalogEntityAttributesState Empty => new CatalogEntityAttributesState();
    }
}
