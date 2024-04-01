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
    public sealed class GetPrivateLinkAttachmentConnectionAzureResult
    {
        /// <summary>
        /// (Required String) Resource ID of the Private Endpoint that is connected to the Private Link service.
        /// </summary>
        public readonly string PrivateEndpointResourceId;

        [OutputConstructor]
        private GetPrivateLinkAttachmentConnectionAzureResult(string privateEndpointResourceId)
        {
            PrivateEndpointResourceId = privateEndpointResourceId;
        }
    }
}
