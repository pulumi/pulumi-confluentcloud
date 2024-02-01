// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PrivateLinkAttachmentGcpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Id of a Private Service Connect Service Attachment in Confluent Cloud.
        /// </summary>
        [Input("privateServiceConnectServiceAttachment")]
        public Input<string>? PrivateServiceConnectServiceAttachment { get; set; }

        /// <summary>
        /// Zone associated with the PSC Service attachment.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public PrivateLinkAttachmentGcpGetArgs()
        {
        }
        public static new PrivateLinkAttachmentGcpGetArgs Empty => new PrivateLinkAttachmentGcpGetArgs();
    }
}
