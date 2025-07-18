// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetPrivateLinkAttachmentEnvironmentInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetPrivateLinkAttachmentEnvironmentInputArgs()
        {
        }
        public static new GetPrivateLinkAttachmentEnvironmentInputArgs Empty => new GetPrivateLinkAttachmentEnvironmentInputArgs();
    }
}
