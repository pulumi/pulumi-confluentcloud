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
    public sealed class GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentResult
    {
        /// <summary>
        /// The ID of the Private Link Attachment Connection, for example, `plattc-p5j3ov`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentResult(string id)
        {
            Id = id;
        }
    }
}
