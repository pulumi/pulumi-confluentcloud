// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetBusinessMetadataBindingSchemaRegistryClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetBusinessMetadataBindingSchemaRegistryClusterArgs()
        {
        }
        public static new GetBusinessMetadataBindingSchemaRegistryClusterArgs Empty => new GetBusinessMetadataBindingSchemaRegistryClusterArgs();
    }
}
