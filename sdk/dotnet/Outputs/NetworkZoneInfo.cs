// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class NetworkZoneInfo
    {
        /// <summary>
        /// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        public readonly string? Cidr;
        /// <summary>
        /// Cloud provider zone ID.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private NetworkZoneInfo(
            string? cidr,

            string? zoneId)
        {
            Cidr = cidr;
            ZoneId = zoneId;
        }
    }
}
