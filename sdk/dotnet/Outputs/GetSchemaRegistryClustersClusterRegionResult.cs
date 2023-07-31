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
    public sealed class GetSchemaRegistryClustersClusterRegionResult
    {
        /// <summary>
        /// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSchemaRegistryClustersClusterRegionResult(string id)
        {
            Id = id;
        }
    }
}