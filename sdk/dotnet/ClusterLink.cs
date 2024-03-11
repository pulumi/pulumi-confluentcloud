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
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode
    ///     var east_to_west = new ConfluentCloud.ClusterLink("east-to-west", new()
    ///     {
    ///         LinkMode = "BIDIRECTIONAL",
    ///         LocalKafkaCluster = new ConfluentCloud.Inputs.ClusterLinkLocalKafkaClusterArgs
    ///         {
    ///             Id = data.Confluent_kafka_cluster.East.Id,
    ///             RestEndpoint = data.Confluent_kafka_cluster.East.Rest_endpoint,
    ///             Credentials = new ConfluentCloud.Inputs.ClusterLinkLocalKafkaClusterCredentialsArgs
    ///             {
    ///                 Key = confluent_api_key.App_manager_east_cluster_api_key.Id,
    ///                 Secret = confluent_api_key.App_manager_east_cluster_api_key.Secret,
    ///             },
    ///         },
    ///         RemoteKafkaCluster = new ConfluentCloud.Inputs.ClusterLinkRemoteKafkaClusterArgs
    ///         {
    ///             Id = data.Confluent_kafka_cluster.West.Id,
    ///             BootstrapEndpoint = data.Confluent_kafka_cluster.West.Bootstrap_endpoint,
    ///             Credentials = new ConfluentCloud.Inputs.ClusterLinkRemoteKafkaClusterCredentialsArgs
    ///             {
    ///                 Key = confluent_api_key.App_manager_west_cluster_api_key.Id,
    ///                 Secret = confluent_api_key.App_manager_west_cluster_api_key.Secret,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var west_to_east = new ConfluentCloud.ClusterLink("west-to-east", new()
    ///     {
    ///         LinkMode = "BIDIRECTIONAL",
    ///         LocalKafkaCluster = new ConfluentCloud.Inputs.ClusterLinkLocalKafkaClusterArgs
    ///         {
    ///             Id = data.Confluent_kafka_cluster.West.Id,
    ///             RestEndpoint = data.Confluent_kafka_cluster.West.Rest_endpoint,
    ///             Credentials = new ConfluentCloud.Inputs.ClusterLinkLocalKafkaClusterCredentialsArgs
    ///             {
    ///                 Key = confluent_api_key.App_manager_west_cluster_api_key.Id,
    ///                 Secret = confluent_api_key.App_manager_west_cluster_api_key.Secret,
    ///             },
    ///         },
    ///         RemoteKafkaCluster = new ConfluentCloud.Inputs.ClusterLinkRemoteKafkaClusterArgs
    ///         {
    ///             Id = data.Confluent_kafka_cluster.East.Id,
    ///             BootstrapEndpoint = data.Confluent_kafka_cluster.East.Bootstrap_endpoint,
    ///             Credentials = new ConfluentCloud.Inputs.ClusterLinkRemoteKafkaClusterCredentialsArgs
    ///             {
    ///                 Key = confluent_api_key.App_manager_east_cluster_api_key.Id,
    ///                 Secret = confluent_api_key.App_manager_east_cluster_api_key.Secret,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.ClusterLink` resource:
    ///   * `destination-initiated-cluster-link-rbac`: An example of setting up a _destination_ initiated cluster link with a mirror topic
    ///   * `source-initiated-cluster-link-rbac`: An example of setting up a _source_ initiated cluster link with a mirror topic
    ///   * `regular-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics
    ///   * `advanced-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics ([advanced option](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode))
    /// 
    /// See [Cluster Linking on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/index.html) to learn more about Cluster Linking on Confluent Cloud.
    /// 
    /// ## Import
    /// 
    /// You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode,
    /// 
    /// source (or local for bidirectional cluster links) Kafka cluster ID, and destination (or remote  for bidirectional cluster links) Kafka cluster ID, in the format `&lt;Cluster link name&gt;/&lt;Cluster link mode&gt;/&lt;Cluster connection mode&gt;/&lt;Source (Local) Kafka cluster ID&gt;/&lt;Destination (Remote) Kafka cluster ID&gt;`, for example:
    /// 
    /// Option #1 when using source-initiated or destination-initiated cluster links
    /// 
    /// $ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="&lt;source_kafka_bootstrap_endpoint&gt;"
    /// 
    /// $ export IMPORT_SOURCE_KAFKA_API_KEY="&lt;source_kafka_api_key&gt;"
    /// 
    /// $ export IMPORT_SOURCE_KAFKA_API_SECRET="&lt;source_kafka_api_secret&gt;"
    /// 
    /// $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="&lt;destination_kafka_rest_endpoint&gt;"
    /// 
    /// $ export IMPORT_DESTINATION_KAFKA_API_KEY="&lt;destination_kafka_api_key&gt;"
    /// 
    /// $ export IMPORT_DESTINATION_KAFKA_API_SECRET="&lt;destination_kafka_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
    /// ```
    /// 
    /// Option #2 when using bidirectional cluster links
    /// 
    /// $ export IMPORT_LOCAL_KAFKA_BOOTSTRAP_ENDPOINT="&lt;local_kafka_bootstrap_endpoint&gt;"
    /// 
    /// $ export IMPORT_LOCAL_KAFKA_API_KEY="&lt;local_kafka_api_key&gt;"
    /// 
    /// $ export IMPORT_LOCAL_KAFKA_API_SECRET="&lt;local_kafka_api_secret&gt;"
    /// 
    /// $ export IMPORT_REMOTE_KAFKA_REST_ENDPOINT="&lt;remote_kafka_rest_endpoint&gt;"
    /// 
    /// $ export IMPORT_REMOTE_KAFKA_API_KEY="&lt;remote_kafka_api_key&gt;"
    /// 
    /// $ export IMPORT_REMOTE_KAFKA_API_SECRET="&lt;remote_kafka_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/BIDIRECTIONAL/OUTBOUND/lkc-abc123/lkc-xyz456
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
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
        public Output<Outputs.ClusterLinkDestinationKafkaCluster?> DestinationKafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The name of the cluster link, for example, `my-cluster-link`.
        /// </summary>
        [Output("link")]
        public Output<string> Link { get; private set; } = null!;

        /// <summary>
        /// The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Output("linkMode")]
        public Output<string?> LinkMode { get; private set; } = null!;

        [Output("localKafkaCluster")]
        public Output<Outputs.ClusterLinkLocalKafkaCluster?> LocalKafkaCluster { get; private set; } = null!;

        [Output("remoteKafkaCluster")]
        public Output<Outputs.ClusterLinkRemoteKafkaCluster?> RemoteKafkaCluster { get; private set; } = null!;

        [Output("sourceKafkaCluster")]
        public Output<Outputs.ClusterLinkSourceKafkaCluster?> SourceKafkaCluster { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterLink(string name, ClusterLinkArgs? args = null, CustomResourceOptions? options = null)
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

        [Input("destinationKafkaCluster")]
        public Input<Inputs.ClusterLinkDestinationKafkaClusterArgs>? DestinationKafkaCluster { get; set; }

        /// <summary>
        /// The name of the cluster link, for example, `my-cluster-link`.
        /// </summary>
        [Input("link")]
        public Input<string>? Link { get; set; }

        /// <summary>
        /// The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Input("linkMode")]
        public Input<string>? LinkMode { get; set; }

        [Input("localKafkaCluster")]
        public Input<Inputs.ClusterLinkLocalKafkaClusterArgs>? LocalKafkaCluster { get; set; }

        [Input("remoteKafkaCluster")]
        public Input<Inputs.ClusterLinkRemoteKafkaClusterArgs>? RemoteKafkaCluster { get; set; }

        [Input("sourceKafkaCluster")]
        public Input<Inputs.ClusterLinkSourceKafkaClusterArgs>? SourceKafkaCluster { get; set; }

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
        /// The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
        /// </summary>
        [Input("linkMode")]
        public Input<string>? LinkMode { get; set; }

        [Input("localKafkaCluster")]
        public Input<Inputs.ClusterLinkLocalKafkaClusterGetArgs>? LocalKafkaCluster { get; set; }

        [Input("remoteKafkaCluster")]
        public Input<Inputs.ClusterLinkRemoteKafkaClusterGetArgs>? RemoteKafkaCluster { get; set; }

        [Input("sourceKafkaCluster")]
        public Input<Inputs.ClusterLinkSourceKafkaClusterGetArgs>? SourceKafkaCluster { get; set; }

        public ClusterLinkState()
        {
        }
        public static new ClusterLinkState Empty => new ClusterLinkState();
    }
}
