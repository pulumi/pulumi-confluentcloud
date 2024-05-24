// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ClusterLinkSourceKafkaClusterCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        private Input<string>? _key;

        /// <summary>
        /// The Kafka API Key.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// The Kafka API Secret.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClusterLinkSourceKafkaClusterCredentialsGetArgs()
        {
        }
        public static new ClusterLinkSourceKafkaClusterCredentialsGetArgs Empty => new ClusterLinkSourceKafkaClusterCredentialsGetArgs();
    }
}
