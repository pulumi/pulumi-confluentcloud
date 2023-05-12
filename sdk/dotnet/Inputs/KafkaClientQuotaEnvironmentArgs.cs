// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaClientQuotaEnvironmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
        /// 
        /// &gt; **Note:** Each principal assigned to a quota receives the full amount of the quota, meaning the quota is not shared by the principals it is assigned. For example, if a 10 MBps ingress quota is applied to Principals 1 and 2, Principal 1 can produce at most 10 MBps, independently of Principal 2.
        /// 
        /// &gt; **Note:** Define a throughput maximum, but do not guarantee a throughput floor. Applications are rate-limited through the use of the Kafka throttling mechanism. Kafka asks the client to wait before sending more data and mutes the channel, which appears as latency to the client application.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public KafkaClientQuotaEnvironmentArgs()
        {
        }
        public static new KafkaClientQuotaEnvironmentArgs Empty => new KafkaClientQuotaEnvironmentArgs();
    }
}
