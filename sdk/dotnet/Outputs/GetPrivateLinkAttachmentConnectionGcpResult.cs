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
    public sealed class GetPrivateLinkAttachmentConnectionGcpResult
    {
        /// <summary>
        /// (Required String) GCP Private Service Connect ID used to establish connections for all zones.
        /// </summary>
        public readonly string PrivateServiceConnectConnectionId;

        [OutputConstructor]
        private GetPrivateLinkAttachmentConnectionGcpResult(string privateServiceConnectConnectionId)
        {
            PrivateServiceConnectConnectionId = privateServiceConnectConnectionId;
        }
    }
}
