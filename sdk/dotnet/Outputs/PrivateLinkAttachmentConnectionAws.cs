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
    public sealed class PrivateLinkAttachmentConnectionAws
    {
        /// <summary>
        /// ID of a VPC Endpoint that is connected to the VPC Endpoint service.
        /// </summary>
        public readonly string VpcEndpointId;

        [OutputConstructor]
        private PrivateLinkAttachmentConnectionAws(string vpcEndpointId)
        {
            VpcEndpointId = vpcEndpointId;
        }
    }
}
