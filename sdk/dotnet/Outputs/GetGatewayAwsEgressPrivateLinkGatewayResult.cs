// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetGatewayAwsEgressPrivateLinkGatewayResult
    {
        /// <summary>
        /// (Required String) The principal ARN used by the AWS Egress Private Link Gateway.
        /// </summary>
        public readonly string PrincipalArn;
        /// <summary>
        /// (Required String) Azure region of the Peering Gateway.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GetGatewayAwsEgressPrivateLinkGatewayResult(
            string principalArn,

            string region)
        {
            PrincipalArn = principalArn;
            Region = region;
        }
    }
}