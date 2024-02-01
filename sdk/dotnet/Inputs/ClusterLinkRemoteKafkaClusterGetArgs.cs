// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ClusterLinkRemoteKafkaClusterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
        /// </summary>
        [Input("bootstrapEndpoint")]
        public Input<string>? BootstrapEndpoint { get; set; }

        [Input("credentials")]
        private Input<Inputs.ClusterLinkRemoteKafkaClusterCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Kafka API Credentials.
        /// </summary>
        public Input<Inputs.ClusterLinkRemoteKafkaClusterCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.ClusterLinkRemoteKafkaClusterCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the remote Kafka cluster, for example, `lkc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        public ClusterLinkRemoteKafkaClusterGetArgs()
        {
        }
        public static new ClusterLinkRemoteKafkaClusterGetArgs Empty => new ClusterLinkRemoteKafkaClusterGetArgs();
    }
}
