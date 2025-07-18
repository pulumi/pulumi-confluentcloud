// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class NetworkZoneInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// Cloud provider zone ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public NetworkZoneInfoGetArgs()
        {
        }
        public static new NetworkZoneInfoGetArgs Empty => new NetworkZoneInfoGetArgs();
    }
}
