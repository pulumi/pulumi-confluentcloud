// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class TransitGatewayAttachmentAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Resource Access Manager (RAM) Resource Share of the transit gateway your Confluent Cloud network attaches to.
        /// </summary>
        [Input("ramResourceShareArn", required: true)]
        public Input<string> RamResourceShareArn { get; set; } = null!;

        [Input("routes", required: true)]
        private InputList<string>? _routes;

        /// <summary>
        /// List of destination routes for traffic from Confluent VPC to customer VPC via Transit Gateway.
        /// 
        /// &gt; **Note:** Learn more about Transit Gateway Attachment limitations on AWS [here](https://docs.confluent.io/cloud/current/networking/aws-transit-gateway.html#limitations).
        /// </summary>
        public InputList<string> Routes
        {
            get => _routes ?? (_routes = new InputList<string>());
            set => _routes = value;
        }

        /// <summary>
        /// (Required String) The ID of the AWS Transit Gateway VPC Attachment that attaches Confluent VPC to Transit Gateway.
        /// </summary>
        [Input("transitGatewayAttachmentId")]
        public Input<string>? TransitGatewayAttachmentId { get; set; }

        /// <summary>
        /// The ID of the AWS Transit Gateway that you want Confluent CLoud to be attached to. Must start with `tgw-`.
        /// </summary>
        [Input("transitGatewayId", required: true)]
        public Input<string> TransitGatewayId { get; set; } = null!;

        public TransitGatewayAttachmentAwsArgs()
        {
        }
        public static new TransitGatewayAttachmentAwsArgs Empty => new TransitGatewayAttachmentAwsArgs();
    }
}