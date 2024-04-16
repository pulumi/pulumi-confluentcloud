// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class DnsRecordPrivateLinkAccessPointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public DnsRecordPrivateLinkAccessPointArgs()
        {
        }
        public static new DnsRecordPrivateLinkAccessPointArgs Empty => new DnsRecordPrivateLinkAccessPointArgs();
    }
}