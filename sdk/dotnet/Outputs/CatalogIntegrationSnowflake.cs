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
    public sealed class CatalogIntegrationSnowflake
    {
        /// <summary>
        /// Allowed scope of the Snowflake Open Catalog.
        /// </summary>
        public readonly string AllowedScope;
        /// <summary>
        /// The client ID of the catalog integration.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The client secret of the catalog integration.
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// The catalog integration connection endpoint for Snowflake Open Catalog.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// Warehouse name of the Snowflake Open Catalog, for example, `catalog-name`.
        /// </summary>
        public readonly string Warehouse;

        [OutputConstructor]
        private CatalogIntegrationSnowflake(
            string allowedScope,

            string clientId,

            string clientSecret,

            string endpoint,

            string warehouse)
        {
            AllowedScope = allowedScope;
            ClientId = clientId;
            ClientSecret = clientSecret;
            Endpoint = endpoint;
            Warehouse = warehouse;
        }
    }
}
