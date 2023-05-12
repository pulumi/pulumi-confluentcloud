// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetPeeringEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetPeeringEnvironmentArgs()
        {
        }
        public static new GetPeeringEnvironmentArgs Empty => new GetPeeringEnvironmentArgs();
    }
}
