// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaClientQuotaKafkaClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public KafkaClientQuotaKafkaClusterArgs()
        {
        }
        public static new KafkaClientQuotaKafkaClusterArgs Empty => new KafkaClientQuotaKafkaClusterArgs();
    }
}
