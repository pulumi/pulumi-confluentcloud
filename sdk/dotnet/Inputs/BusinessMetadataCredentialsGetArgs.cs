// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class BusinessMetadataCredentialsGetArgs : global::Pulumi.ResourceArgs
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
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public BusinessMetadataCredentialsGetArgs()
        {
        }
        public static new BusinessMetadataCredentialsGetArgs Empty => new BusinessMetadataCredentialsGetArgs();
    }
}
