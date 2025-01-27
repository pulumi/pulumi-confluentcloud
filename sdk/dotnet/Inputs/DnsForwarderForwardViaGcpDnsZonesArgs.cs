// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class DnsForwarderForwardViaGcpDnsZonesArgs : global::Pulumi.ResourceArgs
    {
        [Input("domainMappings")]
        private InputMap<string>? _domainMappings;

        /// <summary>
        /// List of Maps which contains the domain to zone and project mapping.
        /// 
        /// &gt; **Note:** The `forward_via_gcp_zones` and `forward_via_ip` blocks are mutually exclusive, and one of them must be provided.
        /// 
        /// &gt; **Note:** The zone and project must be specified in the correct order, separated by a comma, to ensure accurate `domain_mappings`.
        /// </summary>
        public InputMap<string> DomainMappings
        {
            get => _domainMappings ?? (_domainMappings = new InputMap<string>());
            set => _domainMappings = value;
        }

        public DnsForwarderForwardViaGcpDnsZonesArgs()
        {
        }
        public static new DnsForwarderForwardViaGcpDnsZonesArgs Empty => new DnsForwarderForwardViaGcpDnsZonesArgs();
    }
}
