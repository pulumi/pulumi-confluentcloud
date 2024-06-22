// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSubjectMode
    {
        public static Task<GetSubjectModeResult> InvokeAsync(GetSubjectModeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubjectModeResult>("confluentcloud:index/getSubjectMode:getSubjectMode", args ?? new GetSubjectModeArgs(), options.WithDefaults());

        public static Output<GetSubjectModeResult> Invoke(GetSubjectModeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubjectModeResult>("confluentcloud:index/getSubjectMode:getSubjectMode", args ?? new GetSubjectModeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubjectModeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetSubjectModeCredentialsArgs? _credentials;
        public Inputs.GetSubjectModeCredentialsArgs? Credentials
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
        public Inputs.GetSubjectModeSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("subjectName", required: true)]
        public string SubjectName { get; set; } = null!;

        public GetSubjectModeArgs()
        {
        }
        public static new GetSubjectModeArgs Empty => new GetSubjectModeArgs();
    }

    public sealed class GetSubjectModeInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetSubjectModeCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetSubjectModeCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetSubjectModeCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetSubjectModeSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("subjectName", required: true)]
        public Input<string> SubjectName { get; set; } = null!;

        public GetSubjectModeInvokeArgs()
        {
        }
        public static new GetSubjectModeInvokeArgs Empty => new GetSubjectModeInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubjectModeResult
    {
        public readonly Outputs.GetSubjectModeCredentialsResult? Credentials;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        /// </summary>
        public readonly string Mode;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetSubjectModeSchemaRegistryClusterResult? SchemaRegistryCluster;
        public readonly string SubjectName;

        [OutputConstructor]
        private GetSubjectModeResult(
            Outputs.GetSubjectModeCredentialsResult? credentials,

            string id,

            string mode,

            string? restEndpoint,

            Outputs.GetSubjectModeSchemaRegistryClusterResult? schemaRegistryCluster,

            string subjectName)
        {
            Credentials = credentials;
            Id = id;
            Mode = mode;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
            SubjectName = subjectName;
        }
    }
}