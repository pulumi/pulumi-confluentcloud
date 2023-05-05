// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetTag
    {
        public static Task<GetTagResult> InvokeAsync(GetTagArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTagResult>("confluentcloud:index/getTag:getTag", args ?? new GetTagArgs(), options.WithDefaults());

        public static Output<GetTagResult> Invoke(GetTagInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagResult>("confluentcloud:index/getTag:getTag", args ?? new GetTagInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTagArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetTagCredentialsArgs? _credentials;
        public Inputs.GetTagCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The name of the tag, for example, `PII`.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetTagSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        public GetTagArgs()
        {
        }
        public static new GetTagArgs Empty => new GetTagArgs();
    }

    public sealed class GetTagInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetTagCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetTagCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetTagCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the tag, for example, `PII`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetTagSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        public GetTagInvokeArgs()
        {
        }
        public static new GetTagInvokeArgs Empty => new GetTagInvokeArgs();
    }


    [OutputType]
    public sealed class GetTagResult
    {
        public readonly Outputs.GetTagCredentialsResult? Credentials;
        /// <summary>
        /// (Optional String) The description of the tag.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Optional List of String) The entity types of the tag, this always returns `["cf_entity"]`.
        /// </summary>
        public readonly ImmutableArray<string> EntityTypes;
        /// <summary>
        /// (Required String) The ID of the Tag, in the format `&lt;Schema Registry cluster ID&gt;/&lt;Tag name&gt;`, for example, `lsrc-8wrx70/PII`.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetTagSchemaRegistryClusterResult? SchemaRegistryCluster;
        /// <summary>
        /// (Optional Integer) The version, for example, `1`.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetTagResult(
            Outputs.GetTagCredentialsResult? credentials,

            string description,

            ImmutableArray<string> entityTypes,

            string id,

            string name,

            string? restEndpoint,

            Outputs.GetTagSchemaRegistryClusterResult? schemaRegistryCluster,

            int version)
        {
            Credentials = credentials;
            Description = description;
            EntityTypes = entityTypes;
            Id = id;
            Name = name;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
            Version = version;
        }
    }
}
