// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetSchemaRegistryClusterModeCredentialsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        private Input<string>? _key;

        /// <summary>
        /// The Schema Registry API Key.
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
        /// The Schema Registry API Secret.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
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

        public GetSchemaRegistryClusterModeCredentialsInputArgs()
        {
        }
        public static new GetSchemaRegistryClusterModeCredentialsInputArgs Empty => new GetSchemaRegistryClusterModeCredentialsInputArgs();
    }
}
