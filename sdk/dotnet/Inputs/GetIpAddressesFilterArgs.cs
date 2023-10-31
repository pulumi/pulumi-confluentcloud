// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetIpAddressesFilterInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("addressTypes")]
        private InputList<string>? _addressTypes;

        /// <summary>
        /// A list of address types to filter by. Accepted values are: `EGRESS`, `INGRESS`.
        /// </summary>
        public InputList<string> AddressTypes
        {
            get => _addressTypes ?? (_addressTypes = new InputList<string>());
            set => _addressTypes = value;
        }

        [Input("clouds")]
        private InputList<string>? _clouds;

        /// <summary>
        /// A list of clouds to filter by. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        public InputList<string> Clouds
        {
            get => _clouds ?? (_clouds = new InputList<string>());
            set => _clouds = value;
        }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// A list of regions to filter by.
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public GetIpAddressesFilterInputArgs()
        {
        }
        public static new GetIpAddressesFilterInputArgs Empty => new GetIpAddressesFilterInputArgs();
    }
}
