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
    /// [![Open Preview](https://img.shields.io/badge/Lifecycle%20Stage-Open%20Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    /// 
    /// `confluentcloud.KafkaClusterConfig` provides a Kafka cluster config resource that enables updating configs on a Dedicated Kafka cluster on Confluent Cloud.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var orders = new ConfluentCloud.KafkaClusterConfig("orders", new()
    ///     {
    ///         KafkaCluster = new ConfluentCloud.Inputs.KafkaClusterConfigKafkaClusterArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Dedicated.Id,
    ///         },
    ///         RestEndpoint = confluent_kafka_cluster.Dedicated.Rest_endpoint,
    ///         Config = 
    ///         {
    ///             { "auto.create.topics.enable", "true" },
    ///             { "log.retention.ms", "604800123" },
    ///         },
    ///         Credentials = new ConfluentCloud.Inputs.KafkaClusterConfigCredentialsArgs
    ///         {
    ///             Key = confluent_api_key.App_manager_kafka_api_key.Id,
    ///             Secret = confluent_api_key.App_manager_kafka_api_key.Secret,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Kafka cluster config by using the Kafka cluster ID, for example$ export IMPORT_KAFKA_API_KEY="&lt;kafka_api_key&gt;" $ export IMPORT_KAFKA_API_SECRET="&lt;kafka_api_secret&gt;" $ export IMPORT_KAFKA_REST_ENDPOINT="&lt;kafka_rest_endpoint&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig test lkc-abc123
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig")]
    public partial class KafkaClusterConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The custom cluster settings to set:
        /// </summary>
        [Output("config")]
        public Output<ImmutableDictionary<string, string>> Config { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.KafkaClusterConfigCredentials?> Credentials { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.KafkaClusterConfigKafkaCluster> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaClusterConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaClusterConfig(string name, KafkaClusterConfigArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig", name, args ?? new KafkaClusterConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaClusterConfig(string name, Input<string> id, KafkaClusterConfigState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaClusterConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaClusterConfig Get(string name, Input<string> id, KafkaClusterConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaClusterConfig(name, id, state, options);
        }
    }

    public sealed class KafkaClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("config", required: true)]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom cluster settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.KafkaClusterConfigCredentialsArgs>? Credentials { get; set; }

        [Input("kafkaCluster", required: true)]
        public Input<Inputs.KafkaClusterConfigKafkaClusterArgs> KafkaCluster { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        public KafkaClusterConfigArgs()
        {
        }
        public static new KafkaClusterConfigArgs Empty => new KafkaClusterConfigArgs();
    }

    public sealed class KafkaClusterConfigState : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom cluster settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.KafkaClusterConfigCredentialsGetArgs>? Credentials { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.KafkaClusterConfigKafkaClusterGetArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        public KafkaClusterConfigState()
        {
        }
        public static new KafkaClusterConfigState Empty => new KafkaClusterConfigState();
    }
}
