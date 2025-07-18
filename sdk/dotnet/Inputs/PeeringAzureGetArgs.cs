// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PeeringAzureGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The region of the Azure peer VNet.
        /// </summary>
        [Input("customerRegion", required: true)]
        public Input<string> CustomerRegion { get; set; } = null!;

        /// <summary>
        /// The Tenant ID that represents an organization in Azure Active Directory. You can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
        /// </summary>
        [Input("tenant", required: true)]
        public Input<string> Tenant { get; set; } = null!;

        /// <summary>
        /// The resource (composite) ID of the peer Virtual Network that you're peering with Confluent Cloud, in the format `/subscriptions/&lt;Subscription ID&gt;/resourceGroups/&lt;Resource Group Name&gt;/providers/Microsoft.Network/virtualNetworks/&lt;VNet name&gt;`. You can find Subscription ID, Resource Group Name and your VNet name under **Virtual Networks &gt; Target VNet &gt; Essentials** section of your [Microsoft Azure Portal](https://portal.azure.com/).
        /// </summary>
        [Input("vnet", required: true)]
        public Input<string> Vnet { get; set; } = null!;

        public PeeringAzureGetArgs()
        {
        }
        public static new PeeringAzureGetArgs Empty => new PeeringAzureGetArgs();
    }
}
