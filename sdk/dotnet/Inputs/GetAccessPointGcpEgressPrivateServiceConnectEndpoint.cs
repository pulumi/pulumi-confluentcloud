// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetAccessPointGcpEgressPrivateServiceConnectEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Required String) Connection ID of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointConnectionId", required: true)]
        public string PrivateServiceConnectEndpointConnectionId { get; set; } = null!;

        /// <summary>
        /// (Required String) IP address of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointIpAddress", required: true)]
        public string PrivateServiceConnectEndpointIpAddress { get; set; } = null!;

        /// <summary>
        /// (Required String) Name of the Private Service Connect Endpoint that is connected to the endpoint target.
        /// </summary>
        [Input("privateServiceConnectEndpointName", required: true)]
        public string PrivateServiceConnectEndpointName { get; set; } = null!;

        /// <summary>
        /// (Required String) URI of the service attachment for the published service that the Private Service Connect Endpoint connects to, or "ALL_GOOGLE_APIS" or "all-google-apis" for global Google APIs.
        /// </summary>
        [Input("privateServiceConnectEndpointTarget", required: true)]
        public string PrivateServiceConnectEndpointTarget { get; set; } = null!;

        public GetAccessPointGcpEgressPrivateServiceConnectEndpointArgs()
        {
        }
        public static new GetAccessPointGcpEgressPrivateServiceConnectEndpointArgs Empty => new GetAccessPointGcpEgressPrivateServiceConnectEndpointArgs();
    }
}
