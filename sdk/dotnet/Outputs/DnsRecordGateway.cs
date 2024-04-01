// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class DnsRecordGateway
    {
        /// <summary>
        /// The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private DnsRecordGateway(string id)
        {
            Id = id;
        }
    }
}
