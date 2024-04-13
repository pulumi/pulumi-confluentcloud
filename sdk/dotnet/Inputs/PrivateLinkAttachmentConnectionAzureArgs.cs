// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PrivateLinkAttachmentConnectionAzureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource ID of the Private Endpoint that is connected to the Private Link service.
        /// </summary>
        [Input("privateEndpointResourceId", required: true)]
        public Input<string> PrivateEndpointResourceId { get; set; } = null!;

        public PrivateLinkAttachmentConnectionAzureArgs()
        {
        }
        public static new PrivateLinkAttachmentConnectionAzureArgs Empty => new PrivateLinkAttachmentConnectionAzureArgs();
    }
}
