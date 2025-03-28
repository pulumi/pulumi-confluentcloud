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
    /// ### Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new ConfluentCloud.TableflowTopic("example", new()
    ///     {
    ///         ManagedStorages = new[]
    ///         {
    ///             null,
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.TableflowTopicEnvironmentArgs
    ///         {
    ///             Id = staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.TableflowTopicKafkaClusterArgs
    ///         {
    ///             Id = stagingConfluentKafkaCluster.Id,
    ///         },
    ///         DisplayName = orders.TopicName,
    ///         TableFormats = new[]
    ///         {
    ///             "ICEBERG",
    ///             "DELTA",
    ///         },
    ///         Credentials = new ConfluentCloud.Inputs.TableflowTopicCredentialsArgs
    ///         {
    ///             Key = env_admin_tableflow_api_key.Id,
    ///             Secret = env_admin_tableflow_api_key.Secret,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new ConfluentCloud.TableflowTopic("example", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.TableflowTopicEnvironmentArgs
    ///         {
    ///             Id = staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.TableflowTopicKafkaClusterArgs
    ///         {
    ///             Id = stagingConfluentKafkaCluster.Id,
    ///         },
    ///         DisplayName = orders.TopicName,
    ///         ByobAws = new ConfluentCloud.Inputs.TableflowTopicByobAwsArgs
    ///         {
    ///             BucketName = "bucket_1",
    ///             ProviderIntegrationId = main.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.TableflowTopic` resource:
    /// * `confluent-managed-storage`: Tableflow topic with Confluent-managed storage.
    /// * `byob-aws-storage`: Tableflow topic with custom (BYOB AWS) storage.
    /// 
    /// ## Import
    /// 
    /// You can import a Tableflow Topic by using the Tableflow Topic name, Environment ID, and Kafka Cluster ID, in the format `&lt;Environment ID&gt;/&lt;Kafka Cluster ID&gt;/&lt;Tableflow Topic name&gt;`, for example:
    /// 
    /// Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
    /// 
    /// $ export IMPORT_TABLEFLOW_API_KEY="&lt;tableflow_api_key&gt;"
    /// 
    /// $ export IMPORT_TABLEFLOW_API_SECRET="&lt;tableflow_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
    /// ```
    /// 
    /// Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/tableflowTopic:TableflowTopic")]
    public partial class TableflowTopic : global::Pulumi.CustomResource
    {
        /// <summary>
        /// supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
        /// </summary>
        [Output("byobAws")]
        public Output<Outputs.TableflowTopicByobAws?> ByobAws { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.TableflowTopicCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// The name of the Kafka topic for which Tableflow is enabled.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
        /// </summary>
        [Output("enableCompaction")]
        public Output<bool> EnableCompaction { get; private set; } = null!;

        /// <summary>
        /// (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
        /// </summary>
        [Output("enablePartitioning")]
        public Output<bool> EnablePartitioning { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.TableflowTopicEnvironment> Environment { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.TableflowTopicKafkaCluster> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
        /// </summary>
        [Output("managedStorages")]
        public Output<ImmutableArray<Outputs.TableflowTopicManagedStorage>> ManagedStorages { get; private set; } = null!;

        /// <summary>
        /// The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
        /// </summary>
        [Output("recordFailureStrategy")]
        public Output<string> RecordFailureStrategy { get; private set; } = null!;

        /// <summary>
        /// The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
        /// </summary>
        [Output("retentionMs")]
        public Output<string?> RetentionMs { get; private set; } = null!;

        /// <summary>
        /// (Optional Boolean) Indicates whether the Tableflow should be suspended.
        /// </summary>
        [Output("suspended")]
        public Output<bool> Suspended { get; private set; } = null!;

        /// <summary>
        /// The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
        /// </summary>
        [Output("tableFormats")]
        public Output<ImmutableArray<string>> TableFormats { get; private set; } = null!;


        /// <summary>
        /// Create a TableflowTopic resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TableflowTopic(string name, TableflowTopicArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tableflowTopic:TableflowTopic", name, args ?? new TableflowTopicArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TableflowTopic(string name, Input<string> id, TableflowTopicState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/tableflowTopic:TableflowTopic", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TableflowTopic resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TableflowTopic Get(string name, Input<string> id, TableflowTopicState? state = null, CustomResourceOptions? options = null)
        {
            return new TableflowTopic(name, id, state, options);
        }
    }

    public sealed class TableflowTopicArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
        /// </summary>
        [Input("byobAws")]
        public Input<Inputs.TableflowTopicByobAwsArgs>? ByobAws { get; set; }

        [Input("credentials")]
        private Input<Inputs.TableflowTopicCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TableflowTopicCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TableflowTopicCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the Kafka topic for which Tableflow is enabled.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.TableflowTopicEnvironmentArgs> Environment { get; set; } = null!;

        [Input("kafkaCluster", required: true)]
        public Input<Inputs.TableflowTopicKafkaClusterArgs> KafkaCluster { get; set; } = null!;

        [Input("managedStorages")]
        private InputList<Inputs.TableflowTopicManagedStorageArgs>? _managedStorages;

        /// <summary>
        /// The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
        /// </summary>
        public InputList<Inputs.TableflowTopicManagedStorageArgs> ManagedStorages
        {
            get => _managedStorages ?? (_managedStorages = new InputList<Inputs.TableflowTopicManagedStorageArgs>());
            set => _managedStorages = value;
        }

        /// <summary>
        /// The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
        /// </summary>
        [Input("recordFailureStrategy")]
        public Input<string>? RecordFailureStrategy { get; set; }

        /// <summary>
        /// The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
        /// </summary>
        [Input("retentionMs")]
        public Input<string>? RetentionMs { get; set; }

        [Input("tableFormats")]
        private InputList<string>? _tableFormats;

        /// <summary>
        /// The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
        /// </summary>
        public InputList<string> TableFormats
        {
            get => _tableFormats ?? (_tableFormats = new InputList<string>());
            set => _tableFormats = value;
        }

        public TableflowTopicArgs()
        {
        }
        public static new TableflowTopicArgs Empty => new TableflowTopicArgs();
    }

    public sealed class TableflowTopicState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
        /// </summary>
        [Input("byobAws")]
        public Input<Inputs.TableflowTopicByobAwsGetArgs>? ByobAws { get; set; }

        [Input("credentials")]
        private Input<Inputs.TableflowTopicCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.TableflowTopicCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.TableflowTopicCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the Kafka topic for which Tableflow is enabled.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
        /// </summary>
        [Input("enableCompaction")]
        public Input<bool>? EnableCompaction { get; set; }

        /// <summary>
        /// (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
        /// </summary>
        [Input("enablePartitioning")]
        public Input<bool>? EnablePartitioning { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.TableflowTopicEnvironmentGetArgs>? Environment { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.TableflowTopicKafkaClusterGetArgs>? KafkaCluster { get; set; }

        [Input("managedStorages")]
        private InputList<Inputs.TableflowTopicManagedStorageGetArgs>? _managedStorages;

        /// <summary>
        /// The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
        /// </summary>
        public InputList<Inputs.TableflowTopicManagedStorageGetArgs> ManagedStorages
        {
            get => _managedStorages ?? (_managedStorages = new InputList<Inputs.TableflowTopicManagedStorageGetArgs>());
            set => _managedStorages = value;
        }

        /// <summary>
        /// The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
        /// </summary>
        [Input("recordFailureStrategy")]
        public Input<string>? RecordFailureStrategy { get; set; }

        /// <summary>
        /// The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
        /// </summary>
        [Input("retentionMs")]
        public Input<string>? RetentionMs { get; set; }

        /// <summary>
        /// (Optional Boolean) Indicates whether the Tableflow should be suspended.
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        [Input("tableFormats")]
        private InputList<string>? _tableFormats;

        /// <summary>
        /// The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
        /// </summary>
        public InputList<string> TableFormats
        {
            get => _tableFormats ?? (_tableFormats = new InputList<string>());
            set => _tableFormats = value;
        }

        public TableflowTopicState()
        {
        }
        public static new TableflowTopicState Empty => new TableflowTopicState();
    }
}
