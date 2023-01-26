// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryClusterMode
    {
        public static Task<GetSchemaRegistryClusterModeResult> InvokeAsync(GetSchemaRegistryClusterModeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryClusterModeResult>("confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode", args ?? new GetSchemaRegistryClusterModeArgs(), options.WithDefaults());

        public static Output<GetSchemaRegistryClusterModeResult> Invoke(GetSchemaRegistryClusterModeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryClusterModeResult>("confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode", args ?? new GetSchemaRegistryClusterModeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaRegistryClusterModeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetSchemaRegistryClusterModeCredentialsArgs? _credentials;
        public Inputs.GetSchemaRegistryClusterModeCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetSchemaRegistryClusterModeSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        public GetSchemaRegistryClusterModeArgs()
        {
        }
        public static new GetSchemaRegistryClusterModeArgs Empty => new GetSchemaRegistryClusterModeArgs();
    }

    public sealed class GetSchemaRegistryClusterModeInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetSchemaRegistryClusterModeCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetSchemaRegistryClusterModeCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetSchemaRegistryClusterModeCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetSchemaRegistryClusterModeSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        public GetSchemaRegistryClusterModeInvokeArgs()
        {
        }
        public static new GetSchemaRegistryClusterModeInvokeArgs Empty => new GetSchemaRegistryClusterModeInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaRegistryClusterModeResult
    {
        public readonly Outputs.GetSchemaRegistryClusterModeCredentialsResult? Credentials;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        public readonly string Mode;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetSchemaRegistryClusterModeSchemaRegistryClusterResult? SchemaRegistryCluster;

        [OutputConstructor]
        private GetSchemaRegistryClusterModeResult(
            Outputs.GetSchemaRegistryClusterModeCredentialsResult? credentials,

            string id,

            string mode,

            string? restEndpoint,

            Outputs.GetSchemaRegistryClusterModeSchemaRegistryClusterResult? schemaRegistryCluster)
        {
            Credentials = credentials;
            Id = id;
            Mode = mode;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
        }
    }
}
