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
    public sealed class StreamGovernanceClusterEnvironment
    {
        /// <summary>
        /// The ID of the Stream Governance region that the Stream Governance cluster belongs to, for example, `sgreg-1`. See [Stream Governance Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private StreamGovernanceClusterEnvironment(string id)
        {
            Id = id;
        }
    }
}
