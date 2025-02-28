// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetBusinessMetadataBinding
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.BusinessMetadataBinding` describes a Business Metadata Binding data source.
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetBusinessMetadataBindingSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetBusinessMetadataBindingCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
        ///     });
        /// 
        /// });
        /// ```
        /// &gt; **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.
        /// </summary>
        public static Task<GetBusinessMetadataBindingResult> InvokeAsync(GetBusinessMetadataBindingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBusinessMetadataBindingResult>("confluentcloud:index/getBusinessMetadataBinding:getBusinessMetadataBinding", args ?? new GetBusinessMetadataBindingArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.BusinessMetadataBinding` describes a Business Metadata Binding data source.
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetBusinessMetadataBindingSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetBusinessMetadataBindingCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
        ///     });
        /// 
        /// });
        /// ```
        /// &gt; **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.
        /// </summary>
        public static Output<GetBusinessMetadataBindingResult> Invoke(GetBusinessMetadataBindingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBusinessMetadataBindingResult>("confluentcloud:index/getBusinessMetadataBinding:getBusinessMetadataBinding", args ?? new GetBusinessMetadataBindingInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.BusinessMetadataBinding` describes a Business Metadata Binding data source.
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetBusinessMetadataBindingSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetBusinessMetadataBindingCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
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
        ///     var main = ConfluentCloud.GetBusinessMetadataBinding.Invoke(new()
        ///     {
        ///         BusinessMetadataName = pii.Name,
        ///         EntityName = $"{schemaRegistryId}:{kafkaId}:{mainConfluentKafkaTopic.TopicName}",
        ///         EntityType = "kafka_topic",
        ///     });
        /// 
        /// });
        /// ```
        /// &gt; **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.
        /// </summary>
        public static Output<GetBusinessMetadataBindingResult> Invoke(GetBusinessMetadataBindingInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBusinessMetadataBindingResult>("confluentcloud:index/getBusinessMetadataBinding:getBusinessMetadataBinding", args ?? new GetBusinessMetadataBindingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBusinessMetadataBindingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("businessMetadataName", required: true)]
        public string BusinessMetadataName { get; set; } = null!;

        [Input("credentials")]
        private Inputs.GetBusinessMetadataBindingCredentialsArgs? _credentials;
        public Inputs.GetBusinessMetadataBindingCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName", required: true)]
        public string EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type, for example, `sr_schema`.
        /// </summary>
        [Input("entityType", required: true)]
        public string EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetBusinessMetadataBindingSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        public GetBusinessMetadataBindingArgs()
        {
        }
        public static new GetBusinessMetadataBindingArgs Empty => new GetBusinessMetadataBindingArgs();
    }

    public sealed class GetBusinessMetadataBindingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("businessMetadataName", required: true)]
        public Input<string> BusinessMetadataName { get; set; } = null!;

        [Input("credentials")]
        private Input<Inputs.GetBusinessMetadataBindingCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetBusinessMetadataBindingCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetBusinessMetadataBindingCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${data.confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName", required: true)]
        public Input<string> EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type, for example, `sr_schema`.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetBusinessMetadataBindingSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        public GetBusinessMetadataBindingInvokeArgs()
        {
        }
        public static new GetBusinessMetadataBindingInvokeArgs Empty => new GetBusinessMetadataBindingInvokeArgs();
    }


    [OutputType]
    public sealed class GetBusinessMetadataBindingResult
    {
        /// <summary>
        /// (Optional Map) The block of key-value pair attributes.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Attributes;
        public readonly string BusinessMetadataName;
        public readonly Outputs.GetBusinessMetadataBindingCredentialsResult? Credentials;
        public readonly string EntityName;
        public readonly string EntityType;
        /// <summary>
        /// (Required String) The ID of the Business Metadata Binding, in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Business Metadata Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
        /// </summary>
        public readonly string Id;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetBusinessMetadataBindingSchemaRegistryClusterResult? SchemaRegistryCluster;

        [OutputConstructor]
        private GetBusinessMetadataBindingResult(
            ImmutableDictionary<string, string> attributes,

            string businessMetadataName,

            Outputs.GetBusinessMetadataBindingCredentialsResult? credentials,

            string entityName,

            string entityType,

            string id,

            string? restEndpoint,

            Outputs.GetBusinessMetadataBindingSchemaRegistryClusterResult? schemaRegistryCluster)
        {
            Attributes = attributes;
            BusinessMetadataName = businessMetadataName;
            Credentials = credentials;
            EntityName = entityName;
            EntityType = entityType;
            Id = id;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
        }
    }
}
