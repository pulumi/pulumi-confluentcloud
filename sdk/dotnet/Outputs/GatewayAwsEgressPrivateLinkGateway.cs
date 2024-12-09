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
    public sealed class GatewayAwsEgressPrivateLinkGateway
    {
        /// <summary>
        /// (Required String) The principal ARN used by the AWS Egress Private Link Gateway, for example, `arn:aws:iam::123456789012:tenant-1-role`.
        /// </summary>
        public readonly string? PrincipalArn;
        /// <summary>
        /// AWS region of the Gateway, for example, `us-east-1`.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GatewayAwsEgressPrivateLinkGateway(
            string? principalArn,

            string region)
        {
            PrincipalArn = principalArn;
            Region = region;
        }
    }
}