// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaClusterDedicatedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cku", required: true)]
        public Input<int> Cku { get; set; } = null!;

        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// (Required List of String) The list of zones the cluster is in.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public KafkaClusterDedicatedGetArgs()
        {
        }
        public static new KafkaClusterDedicatedGetArgs Empty => new KafkaClusterDedicatedGetArgs();
    }
}
