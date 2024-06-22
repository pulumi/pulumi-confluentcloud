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
    public sealed class GetPrivateLinkAccessAzureResult
    {
        /// <summary>
        /// (Required String) The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal](https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
        /// </summary>
        public readonly string Subscription;

        [OutputConstructor]
        private GetPrivateLinkAccessAzureResult(string subscription)
        {
            Subscription = subscription;
        }
    }
}