// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GatewayAwsPrivateNetworkInterfaceGatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) The AWS account ID associated with the Private Network Interface Gateway.
        /// </summary>
        [Input("account")]
        public Input<string>? Account { get; set; }

        /// <summary>
        /// AWS region of the Private Network Interface Gateway.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("zones", required: true)]
        private InputList<string>? _zones;

        /// <summary>
        /// AWS availability zone ids of the Private Network Interface Gateway.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public GatewayAwsPrivateNetworkInterfaceGatewayArgs()
        {
        }
        public static new GatewayAwsPrivateNetworkInterfaceGatewayArgs Empty => new GatewayAwsPrivateNetworkInterfaceGatewayArgs();
    }
}
