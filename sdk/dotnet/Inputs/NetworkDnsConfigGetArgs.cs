// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class NetworkDnsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network DNS resolution.
        /// When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
        /// When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
        /// </summary>
        [Input("resolution", required: true)]
        public Input<string> Resolution { get; set; } = null!;

        public NetworkDnsConfigGetArgs()
        {
        }
        public static new NetworkDnsConfigGetArgs Empty => new NetworkDnsConfigGetArgs();
    }
}
