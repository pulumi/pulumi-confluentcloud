// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetSchemaRegistryKekCredentialsArgs : global::Pulumi.InvokeArgs
    {
        [Input("key", required: true)]
        private string? _key;

        /// <summary>
        /// The Cluster API Key for your Confluent Cloud cluster.
        /// </summary>
        public string? Key
        {
            get => _key;
            set => _key = value;
        }

        [Input("secret", required: true)]
        private string? _secret;

        /// <summary>
        /// The Cluster API Secret for your Confluent Cloud cluster.
        /// </summary>
        public string? Secret
        {
            get => _secret;
            set => _secret = value;
        }

        public GetSchemaRegistryKekCredentialsArgs()
        {
        }
        public static new GetSchemaRegistryKekCredentialsArgs Empty => new GetSchemaRegistryKekCredentialsArgs();
    }
}
