// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ConnectorKafkaClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Kafka cluster that the connector belongs to, for example, `lkc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public ConnectorKafkaClusterArgs()
        {
        }
        public static new ConnectorKafkaClusterArgs Empty => new ConnectorKafkaClusterArgs();
    }
}
