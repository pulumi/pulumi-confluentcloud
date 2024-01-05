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
    /// You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `&lt;Kafka cluster ID&gt;/&lt;Kafka topic name&gt;`, for exampleOption #1Manage multiple Kafka clusters in the same Terraform workspace $ export IMPORT_KAFKA_API_KEY="&lt;kafka_api_key&gt;" $ export IMPORT_KAFKA_API_SECRET="&lt;kafka_api_secret&gt;" $ export IMPORT_KAFKA_REST_ENDPOINT="&lt;kafka_rest_endpoint&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
    /// ```
    /// 
    ///  Option #2Manage a single Kafka cluster in the same Terraform workspace
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
    /// ```
    /// 
    ///  resource "confluent_kafka_topic" "orders" {
    /// 
    ///  kafka_cluster {
    /// 
    ///  id = confluent_kafka_cluster.basic-cluster.id
    /// 
    ///  }
    /// 
    ///  topic_name
    /// 
    ///  = "orders"
    /// 
    ///  partitions_count
    /// 
    ///  = 4
    /// 
    ///  rest_endpoint
    /// 
    /// = confluent_kafka_cluster.basic-cluster.rest_endpoint
    /// 
    /// # https://docs.confluent.io/cloud/current/client-apps/topics/manage.html#ak-topic-configurations-for-all-ccloud-cluster-types
    /// 
    ///  config = {
    /// 
    ///  "cleanup.policy"
    /// 
    /// = "delete"
    /// 
    ///  "delete.retention.ms"
    /// 
    ///  = "86400000"
    /// 
    ///  "max.compaction.lag.ms"
    /// 
    ///  = "9223372036854775807"
    /// 
    ///  "max.message.bytes"
    /// 
    ///  = "2097164"
    /// 
    ///  "message.timestamp.difference.max.ms" = "9223372036854775807"
    /// 
    ///  "message.timestamp.type"
    /// 
    /// = "CreateTime"
    /// 
    ///  "min.compaction.lag.ms"
    /// 
    ///  = "0"
    /// 
    ///  "min.insync.replicas"
    /// 
    ///  = "2"
    /// 
    ///  "retention.bytes"
    /// 
    ///  = "-1"
    /// 
    ///  "retention.ms"
    /// 
    /// = "604800000"
    /// 
    ///  "segment.bytes"
    /// 
    ///  = "104857600"
    /// 
    ///  "segment.ms"
    /// 
    /// = "604800000"
    /// 
    ///  }
    /// 
    ///  credentials {
    /// 
    ///  key
    /// 
    /// = confluent_api_key.app-manager-kafka-api-key.id
    /// 
    ///  secret = confluent_api_key.app-manager-kafka-api-key.secret
    /// 
    ///  } } !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/kafkaTopic:KafkaTopic")]
    public partial class KafkaTopic : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        [Output("config")]
        public Output<ImmutableDictionary<string, string>> Config { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.KafkaTopicCredentials?> Credentials { get; private set; } = null!;

        [Output("httpEndpoint")]
        public Output<string> HttpEndpoint { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.KafkaTopicKafkaCluster?> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The number of partitions to create in the topic. Defaults to `6`.
        /// </summary>
        [Output("partitionsCount")]
        public Output<int?> PartitionsCount { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        /// <summary>
        /// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        /// </summary>
        [Output("topicName")]
        public Output<string> TopicName { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaTopic resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaTopic(string name, KafkaTopicArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaTopic:KafkaTopic", name, args ?? new KafkaTopicArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaTopic(string name, Input<string> id, KafkaTopicState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaTopic:KafkaTopic", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "credentials",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KafkaTopic resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaTopic Get(string name, Input<string> id, KafkaTopicState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaTopic(name, id, state, options);
        }
    }

    public sealed class KafkaTopicArgs : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        [Input("credentials")]
        private Input<Inputs.KafkaTopicCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.KafkaTopicCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.KafkaTopicCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.KafkaTopicKafkaClusterArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// The number of partitions to create in the topic. Defaults to `6`.
        /// </summary>
        [Input("partitionsCount")]
        public Input<int>? PartitionsCount { get; set; }

        /// <summary>
        /// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        /// </summary>
        [Input("topicName", required: true)]
        public Input<string> TopicName { get; set; } = null!;

        public KafkaTopicArgs()
        {
        }
        public static new KafkaTopicArgs Empty => new KafkaTopicArgs();
    }

    public sealed class KafkaTopicState : global::Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        [Input("credentials")]
        private Input<Inputs.KafkaTopicCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.KafkaTopicCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.KafkaTopicCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.KafkaTopicKafkaClusterGetArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// The number of partitions to create in the topic. Defaults to `6`.
        /// </summary>
        [Input("partitionsCount")]
        public Input<int>? PartitionsCount { get; set; }

        /// <summary>
        /// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
        /// </summary>
        [Input("topicName")]
        public Input<string>? TopicName { get; set; }

        public KafkaTopicState()
        {
        }
        public static new KafkaTopicState Empty => new KafkaTopicState();
    }
}
