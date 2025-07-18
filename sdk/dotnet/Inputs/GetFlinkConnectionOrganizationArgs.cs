// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetFlinkConnectionOrganizationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Organization, for example, `1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetFlinkConnectionOrganizationInputArgs()
        {
        }
        public static new GetFlinkConnectionOrganizationInputArgs Empty => new GetFlinkConnectionOrganizationInputArgs();
    }
}
