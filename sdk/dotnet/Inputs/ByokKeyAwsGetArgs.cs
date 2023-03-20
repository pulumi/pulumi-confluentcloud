// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ByokKeyAwsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of an AWS KMS key.
        /// </summary>
        [Input("keyArn", required: true)]
        public Input<string> KeyArn { get; set; } = null!;

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        public ByokKeyAwsGetArgs()
        {
        }
        public static new ByokKeyAwsGetArgs Empty => new ByokKeyAwsGetArgs();
    }
}
