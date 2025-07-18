// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class NetworkLinkServiceAcceptGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("environments")]
        private InputList<string>? _environments;

        /// <summary>
        /// List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
        /// </summary>
        public InputList<string> Environments
        {
            get => _environments ?? (_environments = new InputList<string>());
            set => _environments = value;
        }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// List of network ids from which connections can be accepted.
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        public NetworkLinkServiceAcceptGetArgs()
        {
        }
        public static new NetworkLinkServiceAcceptGetArgs Empty => new NetworkLinkServiceAcceptGetArgs();
    }
}
