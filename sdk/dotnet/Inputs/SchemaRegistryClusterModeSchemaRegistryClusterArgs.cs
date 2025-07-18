// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class SchemaRegistryClusterModeSchemaRegistryClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public SchemaRegistryClusterModeSchemaRegistryClusterArgs()
        {
        }
        public static new SchemaRegistryClusterModeSchemaRegistryClusterArgs Empty => new SchemaRegistryClusterModeSchemaRegistryClusterArgs();
    }
}
