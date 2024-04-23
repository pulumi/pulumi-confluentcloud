// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ApiKeyManagedResourceEnvironmentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) The ID of the API Key, for example, `EGWX3S4BVNQIRBMJ`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public ApiKeyManagedResourceEnvironmentGetArgs()
        {
        }
        public static new ApiKeyManagedResourceEnvironmentGetArgs Empty => new ApiKeyManagedResourceEnvironmentGetArgs();
    }
}
