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
    public sealed class GetNetworkAwResult
    {
        /// <summary>
        /// (Required String) The AWS account ID associated with the Confluent Cloud VPC.
        /// </summary>
        public readonly string Account;
        /// <summary>
        /// (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
        /// </summary>
        public readonly string PrivateLinkEndpointService;
        /// <summary>
        /// (Required String) The Confluent Cloud VPC ID.
        /// </summary>
        public readonly string Vpc;

        [OutputConstructor]
        private GetNetworkAwResult(
            string account,

            string privateLinkEndpointService,

            string vpc)
        {
            Account = account;
            PrivateLinkEndpointService = privateLinkEndpointService;
            Vpc = vpc;
        }
    }
}
