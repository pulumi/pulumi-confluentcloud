// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
    /// ## Import
    /// 
    /// You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode, source Kafka cluster ID, and destination Kafka cluster ID, in the format `&lt;Cluster link name&gt;/&lt;Cluster link mode&gt;/&lt;Cluster connection mode&gt;/&lt;Source Kafka cluster ID&gt;/&lt;Destination Kafka cluster ID&gt;`, for example$ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="&lt;source_kafka_bootstrap_endpoint&gt;" $ export IMPORT_SOURCE_KAFKA_API_KEY="&lt;source_kafka_api_key&gt;" $ export IMPORT_SOURCE_KAFKA_API_SECRET="&lt;source_kafka_api_secret&gt;" $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="&lt;destination_kafka_rest_endpoint&gt;" $ export IMPORT_DESTINATION_KAFKA_API_KEY="&lt;destination_kafka_api_key&gt;" $ export IMPORT_DESTINATION_KAFKA_API_SECRET="&lt;destination_kafka_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/clusterLink:ClusterLink")]
    public partial class ClusterLink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The custom cluster link settings to set:
        /// </summary>
        [Output("config")]
        public Output<ImmutableDictionary<string, string>> Config { get; private set; } = null!;

        /// <summary>
        /// The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        /// </summary>
        [Output("connectionMode")]
        public Output<string?> ConnectionMode { get; private set; } = null!;

        [Output("destinationKafkaCluster")]
        public Output<Outputs.ClusterLinkDestinationKafkaCluster> DestinationKafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The name of the cluster link, for example, `my-cluster-link`.
        /// </summary>
        [Output("link")]
        public Output<string> Link { get; private set; } = null!;

        /// <summary>
        /// The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Output("linkMode")]
        public Output<string?> LinkMode { get; private set; } = null!;

        [Output("sourceKafkaCluster")]
        public Output<Outputs.ClusterLinkSourceKafkaCluster> SourceKafkaCluster { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterLink(string name, ClusterLinkArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/clusterLink:ClusterLink", name, args ?? new ClusterLinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterLink(string name, Input<string> id, ClusterLinkState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/clusterLink:ClusterLink", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClusterLink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterLink Get(string name, Input<string> id, ClusterLinkState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterLink(name, id, state, options);
        }
    }

    public sealed class ClusterLinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom cluster link settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        /// </summary>
        [Input("connectionMode")]
        public Input<string>? ConnectionMode { get; set; }

        [Input("destinationKafkaCluster", required: true)]
        public Input<Inputs.ClusterLinkDestinationKafkaClusterArgs> DestinationKafkaCluster { get; set; } = null!;

        /// <summary>
        /// The name of the cluster link, for example, `my-cluster-link`.
        /// </summary>
        [Input("link")]
        public Input<string>? Link { get; set; }

        /// <summary>
        /// The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Input("linkMode")]
        public Input<string>? LinkMode { get; set; }

        [Input("sourceKafkaCluster", required: true)]
        public Input<Inputs.ClusterLinkSourceKafkaClusterArgs> SourceKafkaCluster { get; set; } = null!;

        public ClusterLinkArgs()
        {
        }
        public static new ClusterLinkArgs Empty => new ClusterLinkArgs();
    }

    public sealed class ClusterLinkState : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom cluster link settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
        /// </summary>
        [Input("connectionMode")]
        public Input<string>? ConnectionMode { get; set; }

        [Input("destinationKafkaCluster")]
        public Input<Inputs.ClusterLinkDestinationKafkaClusterGetArgs>? DestinationKafkaCluster { get; set; }

        /// <summary>
        /// The name of the cluster link, for example, `my-cluster-link`.
        /// </summary>
        [Input("link")]
        public Input<string>? Link { get; set; }

        /// <summary>
        /// The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Input("linkMode")]
        public Input<string>? LinkMode { get; set; }

        [Input("sourceKafkaCluster")]
        public Input<Inputs.ClusterLinkSourceKafkaClusterGetArgs>? SourceKafkaCluster { get; set; }

        public ClusterLinkState()
        {
        }
        public static new ClusterLinkState Empty => new ClusterLinkState();
    }
}
