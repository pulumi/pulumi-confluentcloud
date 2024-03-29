// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemas
    {
        public static Task<GetSchemasResult> InvokeAsync(GetSchemasArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemasResult>("confluentcloud:index/getSchemas:getSchemas", args ?? new GetSchemasArgs(), options.WithDefaults());

        public static Output<GetSchemasResult> Invoke(GetSchemasInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemasResult>("confluentcloud:index/getSchemas:getSchemas", args ?? new GetSchemasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemasArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetSchemasCredentialsArgs? _credentials;
        public Inputs.GetSchemasCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        [Input("filter")]
        public Inputs.GetSchemasFilterArgs? Filter { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetSchemasSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        public GetSchemasArgs()
        {
        }
        public static new GetSchemasArgs Empty => new GetSchemasArgs();
    }

    public sealed class GetSchemasInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetSchemasCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetSchemasCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetSchemasCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("filter")]
        public Input<Inputs.GetSchemasFilterInputArgs>? Filter { get; set; }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetSchemasSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        public GetSchemasInvokeArgs()
        {
        }
        public static new GetSchemasInvokeArgs Empty => new GetSchemasInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemasResult
    {
        public readonly Outputs.GetSchemasCredentialsResult? Credentials;
        public readonly Outputs.GetSchemasFilterResult? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetSchemasSchemaRegistryClusterResult? SchemaRegistryCluster;
        /// <summary>
        /// (List of Object) List of schemas. Each schema object exports the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemasSchemaResult> Schemas;

        [OutputConstructor]
        private GetSchemasResult(
            Outputs.GetSchemasCredentialsResult? credentials,

            Outputs.GetSchemasFilterResult? filter,

            string id,

            string? restEndpoint,

            Outputs.GetSchemasSchemaRegistryClusterResult? schemaRegistryCluster,

            ImmutableArray<Outputs.GetSchemasSchemaResult> schemas)
        {
            Credentials = credentials;
            Filter = filter;
            Id = id;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
            Schemas = schemas;
        }
    }
}
