// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class KafkaMirrorTopicKafkaCluster
    {
        public readonly Outputs.KafkaMirrorTopicKafkaClusterCredentials? Credentials;
        /// <summary>
        /// The ID of the destination Kafka cluster, for example, `lkc-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The REST endpoint of the destination Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        public readonly string? RestEndpoint;

        [OutputConstructor]
        private KafkaMirrorTopicKafkaCluster(
            Outputs.KafkaMirrorTopicKafkaClusterCredentials? credentials,

            string id,

            string? restEndpoint)
        {
            Credentials = credentials;
            Id = id;
            RestEndpoint = restEndpoint;
        }
    }
}
