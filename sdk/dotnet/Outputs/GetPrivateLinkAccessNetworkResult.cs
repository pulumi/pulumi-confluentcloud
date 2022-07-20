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
    public sealed class GetPrivateLinkAccessNetworkResult
    {
        /// <summary>
        /// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetPrivateLinkAccessNetworkResult(string id)
        {
            Id = id;
        }
    }
}
