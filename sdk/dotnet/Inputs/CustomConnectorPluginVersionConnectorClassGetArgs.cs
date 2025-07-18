// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class CustomConnectorPluginVersionConnectorClassGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the connector class.
        /// </summary>
        [Input("connectorClassName", required: true)]
        public Input<string> ConnectorClassName { get; set; } = null!;

        /// <summary>
        /// The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
        /// </summary>
        [Input("connectorType", required: true)]
        public Input<string> ConnectorType { get; set; } = null!;

        public CustomConnectorPluginVersionConnectorClassGetArgs()
        {
        }
        public static new CustomConnectorPluginVersionConnectorClassGetArgs Empty => new CustomConnectorPluginVersionConnectorClassGetArgs();
    }
}
