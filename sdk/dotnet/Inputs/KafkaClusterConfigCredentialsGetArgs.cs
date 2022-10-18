// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaClusterConfigCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Kafka API Key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The Kafka API Secret.
        /// </summary>
        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        public KafkaClusterConfigCredentialsGetArgs()
        {
        }
        public static new KafkaClusterConfigCredentialsGetArgs Empty => new KafkaClusterConfigCredentialsGetArgs();
    }
}
