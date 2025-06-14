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
    public sealed class ByokKeyAzure
    {
        /// <summary>
        /// (Optional String) The Application ID created for this key-environment combination.
        /// </summary>
        public readonly string? ApplicationId;
        /// <summary>
        /// The unique Key Object Identifier URL of an Azure Key Vault key.
        /// </summary>
        public readonly string KeyIdentifier;
        /// <summary>
        /// Key Vault ID containing the key.
        /// </summary>
        public readonly string KeyVaultId;
        /// <summary>
        /// Tenant ID (uuid) hosting the Key Vault containing the key.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private ByokKeyAzure(
            string? applicationId,

            string keyIdentifier,

            string keyVaultId,

            string tenantId)
        {
            ApplicationId = applicationId;
            KeyIdentifier = keyIdentifier;
            KeyVaultId = keyVaultId;
            TenantId = tenantId;
        }
    }
}
