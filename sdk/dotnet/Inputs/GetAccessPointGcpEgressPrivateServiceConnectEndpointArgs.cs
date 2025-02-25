// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetAccessPointGcpEgressPrivateServiceConnectEndpointInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) Connection ID of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointConnectionId", required: true)]
        public Input<string> PrivateServiceConnectEndpointConnectionId { get; set; } = null!;

        /// <summary>
        /// (Required String) IP address of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointIpAddress", required: true)]
        public Input<string> PrivateServiceConnectEndpointIpAddress { get; set; } = null!;

        /// <summary>
        /// (Required String) Name of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointName", required: true)]
        public Input<string> PrivateServiceConnectEndpointName { get; set; } = null!;

        /// <summary>
        /// (Required String) URI of the service attachment for the published service that the Private Service Connect Endpoint connects to, or "all-google-apis" for global Google APIs.
        /// </summary>
        [Input("privateServiceConnectEndpointTarget", required: true)]
        public Input<string> PrivateServiceConnectEndpointTarget { get; set; } = null!;

        public GetAccessPointGcpEgressPrivateServiceConnectEndpointInputArgs()
        {
        }
        public static new GetAccessPointGcpEgressPrivateServiceConnectEndpointInputArgs Empty => new GetAccessPointGcpEgressPrivateServiceConnectEndpointInputArgs();
    }
}
