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
    public sealed class GetIpAddressesIpAddressResult
    {
        /// <summary>
        /// (Required Integer) Whether the address is used for egress or ingress.
        /// </summary>
        public readonly string AddressType;
        /// <summary>
        /// (Required String) An API Version of the schema version of the IP Address, for example, `networking/v1`.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The cloud service provider in which the address exists.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Required String) The IP Address range.
        /// </summary>
        public readonly string IpPrefix;
        /// <summary>
        /// (Required String) A kind of the Kafka cluster, for example, `IpAddress`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Required Integer) The region/location where the IP Address is in use.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required List of Strings) The service types that will use the address.
        /// </summary>
        public readonly ImmutableArray<string> Services;

        [OutputConstructor]
        private GetIpAddressesIpAddressResult(
            string addressType,

            string apiVersion,

            string cloud,

            string ipPrefix,

            string kind,

            string region,

            ImmutableArray<string> services)
        {
            AddressType = addressType;
            ApiVersion = apiVersion;
            Cloud = cloud;
            IpPrefix = ipPrefix;
            Kind = kind;
            Region = region;
            Services = services;
        }
    }
}