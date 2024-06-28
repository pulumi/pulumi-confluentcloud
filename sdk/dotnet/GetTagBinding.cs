// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetTagBinding
    {
        public static Task<GetTagBindingResult> InvokeAsync(GetTagBindingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTagBindingResult>("confluentcloud:index/getTagBinding:getTagBinding", args ?? new GetTagBindingArgs(), options.WithDefaults());

        public static Output<GetTagBindingResult> Invoke(GetTagBindingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagBindingResult>("confluentcloud:index/getTagBinding:getTagBinding", args ?? new GetTagBindingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTagBindingArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetTagBindingCredentialsArgs? _credentials;
        public Inputs.GetTagBindingCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${data..main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName", required: true)]
        public string EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type, for example, `sr_schema`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("entityType", required: true)]
        public string EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetTagBindingSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("tagName", required: true)]
        public string TagName { get; set; } = null!;

        public GetTagBindingArgs()
        {
        }
        public static new GetTagBindingArgs Empty => new GetTagBindingArgs();
    }

    public sealed class GetTagBindingInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetTagBindingCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetTagBindingCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetTagBindingCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The qualified name of the entity., for example, `${data..main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
        /// </summary>
        [Input("entityName", required: true)]
        public Input<string> EntityName { get; set; } = null!;

        /// <summary>
        /// The entity type, for example, `sr_schema`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetTagBindingSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
        /// </summary>
        [Input("tagName", required: true)]
        public Input<string> TagName { get; set; } = null!;

        public GetTagBindingInvokeArgs()
        {
        }
        public static new GetTagBindingInvokeArgs Empty => new GetTagBindingInvokeArgs();
    }


    [OutputType]
    public sealed class GetTagBindingResult
    {
        public readonly Outputs.GetTagBindingCredentialsResult? Credentials;
        public readonly string EntityName;
        public readonly string EntityType;
        /// <summary>
        /// (Required String) The ID of the Tag Binding, in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Tag Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
        /// </summary>
        public readonly string Id;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetTagBindingSchemaRegistryClusterResult? SchemaRegistryCluster;
        public readonly string TagName;

        [OutputConstructor]
        private GetTagBindingResult(
            Outputs.GetTagBindingCredentialsResult? credentials,

            string entityName,

            string entityType,

            string id,

            string? restEndpoint,

            Outputs.GetTagBindingSchemaRegistryClusterResult? schemaRegistryCluster,

            string tagName)
        {
            Credentials = credentials;
            EntityName = entityName;
            EntityType = entityType;
            Id = id;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
            TagName = tagName;
        }
    }
}
