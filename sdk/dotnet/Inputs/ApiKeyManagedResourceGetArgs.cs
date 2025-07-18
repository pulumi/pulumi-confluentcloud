// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ApiKeyManagedResourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
        /// </summary>
        [Input("apiVersion", required: true)]
        public Input<string> ApiVersion { get; set; } = null!;

        [Input("environment")]
        public Input<Inputs.ApiKeyManagedResourceEnvironmentGetArgs>? Environment { get; set; }

        /// <summary>
        /// The ID of the managed resource that the API Key associated with, for example, `lkc-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The kind of the managed resource that the API Key associated with, for example, `Cluster`.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        public ApiKeyManagedResourceGetArgs()
        {
        }
        public static new ApiKeyManagedResourceGetArgs Empty => new ApiKeyManagedResourceGetArgs();
    }
}
