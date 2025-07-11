// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ConnectorOffsetArgs : global::Pulumi.ResourceArgs
    {
        [Input("offset", required: true)]
        private InputMap<string>? _offset;

        /// <summary>
        /// Block with offset information that supports different keys depending on the connector type. For sink connectors, use `kafka_offset`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys. Alternatively, use the [Manage custom offsets section](https://docs.confluent.io/cloud/current/connectors/cc-github-source.html#manage-custom-offsets) on the homepage of the target source connector.
        /// </summary>
        public InputMap<string> Offset
        {
            get => _offset ?? (_offset = new InputMap<string>());
            set => _offset = value;
        }

        [Input("partition", required: true)]
        private InputMap<string>? _partition;

        /// <summary>
        /// Block with partition information that supports different keys depending on the connector type. For sink connectors, use `kafka_partition` and `kafka_topic`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys.
        /// </summary>
        public InputMap<string> Partition
        {
            get => _partition ?? (_partition = new InputMap<string>());
            set => _partition = value;
        }

        public ConnectorOffsetArgs()
        {
        }
        public static new ConnectorOffsetArgs Empty => new ConnectorOffsetArgs();
    }
}
