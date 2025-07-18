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
    public sealed class SchemaExporterCredentials
    {
        /// <summary>
        /// The Schema Registry API Key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The Schema Registry API Secret.
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private SchemaExporterCredentials(
            string key,

            string secret)
        {
            Key = key;
            Secret = secret;
        }
    }
}
