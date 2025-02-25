// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class AccessPointGcpEgressPrivateServiceConnectEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) Connection ID of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointConnectionId")]
        public Input<string>? PrivateServiceConnectEndpointConnectionId { get; set; }

        /// <summary>
        /// (Required String) IP address of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointIpAddress")]
        public Input<string>? PrivateServiceConnectEndpointIpAddress { get; set; }

        /// <summary>
        /// (Required String) Name of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointName")]
        public Input<string>? PrivateServiceConnectEndpointName { get; set; }

        /// <summary>
        /// URI of the service attachment for the published service that the Private Service Connect Endpoint connects to, or "all-google-apis" for global Google APIs.
        /// </summary>
        [Input("privateServiceConnectEndpointTarget", required: true)]
        public Input<string> PrivateServiceConnectEndpointTarget { get; set; } = null!;

        public AccessPointGcpEgressPrivateServiceConnectEndpointGetArgs()
        {
        }
        public static new AccessPointGcpEgressPrivateServiceConnectEndpointGetArgs Empty => new AccessPointGcpEgressPrivateServiceConnectEndpointGetArgs();
    }
}
