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
    public sealed class GatewayAzureEgressPrivateLinkGateway
    {
        /// <summary>
        /// Azure region of the Gateway, for example, `eastus`.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The Azure Subscription ID associated with the Confluent Cloud VPC, for example, `00000000-0000-0000-0000-000000000000`.
        /// </summary>
        public readonly string? Subscription;

        [OutputConstructor]
        private GatewayAzureEgressPrivateLinkGateway(
            string region,

            string? subscription)
        {
            Region = region;
            Subscription = subscription;
        }
    }
}
