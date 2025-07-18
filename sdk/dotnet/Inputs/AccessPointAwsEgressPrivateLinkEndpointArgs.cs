// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class AccessPointAwsEgressPrivateLinkEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
        /// </summary>
        [Input("enableHighAvailability")]
        public Input<bool>? EnableHighAvailability { get; set; }

        /// <summary>
        /// (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
        /// </summary>
        [Input("vpcEndpointDnsName")]
        public Input<string>? VpcEndpointDnsName { get; set; }

        /// <summary>
        /// (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
        /// </summary>
        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        /// <summary>
        /// AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
        /// </summary>
        [Input("vpcEndpointServiceName", required: true)]
        public Input<string> VpcEndpointServiceName { get; set; } = null!;

        public AccessPointAwsEgressPrivateLinkEndpointArgs()
        {
        }
        public static new AccessPointAwsEgressPrivateLinkEndpointArgs Empty => new AccessPointAwsEgressPrivateLinkEndpointArgs();
    }
}
