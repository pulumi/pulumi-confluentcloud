// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaMirrorTopicKafkaClusterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.KafkaMirrorTopicKafkaClusterCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Kafka API Credentials.
        /// </summary>
        public Input<Inputs.KafkaMirrorTopicKafkaClusterCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.KafkaMirrorTopicKafkaClusterCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the destination Kafka cluster, for example, `lkc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the destination Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        public KafkaMirrorTopicKafkaClusterGetArgs()
        {
        }
        public static new KafkaMirrorTopicKafkaClusterGetArgs Empty => new KafkaMirrorTopicKafkaClusterGetArgs();
    }
}
