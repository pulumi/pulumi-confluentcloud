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
    public sealed class GetInvitationUserResult
    {
        /// <summary>
        /// The ID of the Invitation, for example, `i-zyw30`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetInvitationUserResult(string id)
        {
            Id = id;
        }
    }
}
