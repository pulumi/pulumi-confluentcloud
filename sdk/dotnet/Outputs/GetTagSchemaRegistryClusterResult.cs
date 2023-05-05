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
    public sealed class GetTagSchemaRegistryClusterResult
    {
        /// <summary>
        /// The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetTagSchemaRegistryClusterResult(string id)
        {
            Id = id;
        }
    }
}
