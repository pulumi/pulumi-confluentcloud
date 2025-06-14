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
    public sealed class GetSchemaMetadataResult
    {
        /// <summary>
        /// (Optional Map) The custom properties to set:
        /// </summary>
        public readonly ImmutableDictionary<string, string> Properties;
        /// <summary>
        /// (Optional List of Strings) A list of metadata properties to be encrypted.
        /// </summary>
        public readonly ImmutableArray<string> Sensitives;
        /// <summary>
        /// (Optional String List) The tags to which the rule applies, if any.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemaMetadataTagResult> Tags;

        [OutputConstructor]
        private GetSchemaMetadataResult(
            ImmutableDictionary<string, string> properties,

            ImmutableArray<string> sensitives,

            ImmutableArray<Outputs.GetSchemaMetadataTagResult> tags)
        {
            Properties = properties;
            Sensitives = sensitives;
            Tags = tags;
        }
    }
}
