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
    public sealed class GetKafkaClientQuotaKafkaClusterResult
    {
        /// <summary>
        /// The ID of the Kafka Client Quota (for example, `cq-abc123`).
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetKafkaClientQuotaKafkaClusterResult(string id)
        {
            Id = id;
        }
    }
}
