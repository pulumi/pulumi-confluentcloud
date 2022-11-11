// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class NetworkAwGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) The AWS account ID associated with the Confluent Cloud VPC.
        /// </summary>
        [Input("account")]
        public Input<string>? Account { get; set; }

        /// <summary>
        /// (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
        /// </summary>
        [Input("privateLinkEndpointService")]
        public Input<string>? PrivateLinkEndpointService { get; set; }

        /// <summary>
        /// (Required String) The Confluent Cloud VPC ID.
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        public NetworkAwGetArgs()
        {
        }
        public static new NetworkAwGetArgs Empty => new NetworkAwGetArgs();
    }
}
