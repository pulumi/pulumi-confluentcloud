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
    public sealed class InvitationCreator
    {
        /// <summary>
        /// (Required String) The id of invitation creator.
        /// </summary>
        public readonly string? Id;

        [OutputConstructor]
        private InvitationCreator(string? id)
        {
            Id = id;
        }
    }
}
