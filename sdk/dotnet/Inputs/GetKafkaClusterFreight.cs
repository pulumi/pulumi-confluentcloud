// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetKafkaClusterFreightArgs : global::Pulumi.InvokeArgs
    {
        [Input("zones", required: true)]
        private List<string>? _zones;

        /// <summary>
        /// (Required List of String) The list of zones the cluster is in.
        /// - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public List<string> Zones
        {
            get => _zones ?? (_zones = new List<string>());
            set => _zones = value;
        }

        public GetKafkaClusterFreightArgs()
        {
        }
        public static new GetKafkaClusterFreightArgs Empty => new GetKafkaClusterFreightArgs();
    }
}