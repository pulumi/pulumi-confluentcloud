// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class NetworkGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional String) The ID of the Gateway, for example, `gw-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public NetworkGatewayGetArgs()
        {
        }
        public static new NetworkGatewayGetArgs Empty => new NetworkGatewayGetArgs();
    }
}
