// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PrivateLinkAttachmentConnectionGcpArgs : global::Pulumi.ResourceArgs
    {
        [Input("privateServiceConnectConnectionId", required: true)]
        public Input<string> PrivateServiceConnectConnectionId { get; set; } = null!;

        public PrivateLinkAttachmentConnectionGcpArgs()
        {
        }
        public static new PrivateLinkAttachmentConnectionGcpArgs Empty => new PrivateLinkAttachmentConnectionGcpArgs();
    }
}