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
    /// ### Example Managed [Datagen Source Connector](https://docs.confluent.io/cloud/current/connectors/cc-datagen-source.html) that uses a service account to communicate with your Kafka cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var source = new ConfluentCloud.Connector("source", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.ConnectorEnvironmentArgs
    ///         {
    ///             Id = confluent_environment.Staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.ConnectorKafkaClusterArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Basic.Id,
    ///         },
    ///         ConfigSensitive = null,
    ///         ConfigNonsensitive = 
    ///         {
    ///             { "connector.class", "DatagenSource" },
    ///             { "name", "DatagenSourceConnector_0" },
    ///             { "kafka.auth.mode", "SERVICE_ACCOUNT" },
    ///             { "kafka.service.account.id", confluent_service_account.App_connector.Id },
    ///             { "kafka.topic", confluent_kafka_topic.Orders.Topic_name },
    ///             { "output.data.format", "JSON" },
    ///             { "quickstart", "ORDERS" },
    ///             { "tasks.max", "1" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             confluent_kafka_acl.App_connector_describe_on_cluster,
    ///             confluent_kafka_acl.App_connector_write_on_target_topic,
    ///             confluent_kafka_acl.App_connector_create_on_data_preview_topics,
    ///             confluent_kafka_acl.App_connector_write_on_data_preview_topics,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Managed [Amazon S3 Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-s3-sink.html) that uses a service account to communicate with your Kafka cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sink = new ConfluentCloud.Connector("sink", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.ConnectorEnvironmentArgs
    ///         {
    ///             Id = confluent_environment.Staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.ConnectorKafkaClusterArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Basic.Id,
    ///         },
    ///         ConfigSensitive = 
    ///         {
    ///             { "aws.access.key.id", "***REDACTED***" },
    ///             { "aws.secret.access.key", "***REDACTED***" },
    ///         },
    ///         ConfigNonsensitive = 
    ///         {
    ///             { "topics", confluent_kafka_topic.Orders.Topic_name },
    ///             { "input.data.format", "JSON" },
    ///             { "connector.class", "S3_SINK" },
    ///             { "name", "S3_SINKConnector_0" },
    ///             { "kafka.auth.mode", "SERVICE_ACCOUNT" },
    ///             { "kafka.service.account.id", confluent_service_account.App_connector.Id },
    ///             { "s3.bucket.name", "&lt;s3-bucket-name&gt;" },
    ///             { "output.data.format", "JSON" },
    ///             { "time.interval", "DAILY" },
    ///             { "flush.size", "1000" },
    ///             { "tasks.max", "1" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             confluent_kafka_acl.App_connector_describe_on_cluster,
    ///             confluent_kafka_acl.App_connector_read_on_target_topic,
    ///             confluent_kafka_acl.App_connector_create_on_dlq_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_dlq_lcc_topics,
    ///             confluent_kafka_acl.App_connector_create_on_success_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_success_lcc_topics,
    ///             confluent_kafka_acl.App_connector_create_on_error_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_error_lcc_topics,
    ///             confluent_kafka_acl.App_connector_read_on_connect_lcc_group,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Managed [Amazon DynamoDB Connector](https://docs.confluent.io/cloud/current/connectors/cc-amazon-dynamo-db-sink.html) that uses a service account to communicate with your Kafka cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sink = new ConfluentCloud.Connector("sink", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.ConnectorEnvironmentArgs
    ///         {
    ///             Id = confluent_environment.Staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.ConnectorKafkaClusterArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Basic.Id,
    ///         },
    ///         ConfigSensitive = 
    ///         {
    ///             { "aws.access.key.id", "***REDACTED***" },
    ///             { "aws.secret.access.key", "***REDACTED***" },
    ///         },
    ///         ConfigNonsensitive = 
    ///         {
    ///             { "topics", confluent_kafka_topic.Orders.Topic_name },
    ///             { "input.data.format", "JSON" },
    ///             { "connector.class", "DynamoDbSink" },
    ///             { "name", "DynamoDbSinkConnector_0" },
    ///             { "kafka.auth.mode", "SERVICE_ACCOUNT" },
    ///             { "kafka.service.account.id", confluent_service_account.App_connector.Id },
    ///             { "aws.dynamodb.pk.hash", "value.userid" },
    ///             { "aws.dynamodb.pk.sort", "value.pageid" },
    ///             { "tasks.max", "1" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             confluent_kafka_acl.App_connector_describe_on_cluster,
    ///             confluent_kafka_acl.App_connector_read_on_target_topic,
    ///             confluent_kafka_acl.App_connector_create_on_dlq_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_dlq_lcc_topics,
    ///             confluent_kafka_acl.App_connector_create_on_success_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_success_lcc_topics,
    ///             confluent_kafka_acl.App_connector_create_on_error_lcc_topics,
    ///             confluent_kafka_acl.App_connector_write_on_error_lcc_topics,
    ///             confluent_kafka_acl.App_connector_read_on_connect_lcc_group,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Custom [Datagen Source Connector](https://www.confluent.io/hub/confluentinc/kafka-connect-datagen) that uses a Kafka API Key to communicate with your Kafka cluster
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var source = new ConfluentCloud.Connector("source", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.ConnectorEnvironmentArgs
    ///         {
    ///             Id = confluent_environment.Staging.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.ConnectorKafkaClusterArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Basic.Id,
    ///         },
    ///         ConfigSensitive = 
    ///         {
    ///             { "kafka.api.key", "***REDACTED***" },
    ///             { "kafka.api.secret", "***REDACTED***" },
    ///         },
    ///         ConfigNonsensitive = 
    ///         {
    ///             { "confluent.connector.type", "CUSTOM" },
    ///             { "connector.class", confluent_custom_connector_plugin.Source.Connector_class },
    ///             { "name", "DatagenConnectorExampleName" },
    ///             { "kafka.auth.mode", "KAFKA_API_KEY" },
    ///             { "kafka.topic", confluent_kafka_topic.Orders.Topic_name },
    ///             { "output.data.format", "JSON" },
    ///             { "quickstart", "ORDERS" },
    ///             { "confluent.custom.plugin.id", confluent_custom_connector_plugin.Source.Id },
    ///             { "min.interval", "1000" },
    ///             { "max.interval", "2000" },
    ///             { "tasks.max", "1" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             confluent_role_binding.App_manager_kafka_cluster_admin,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **Note:** Custom connectors are available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
    /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.Connector` resource:
    /// * `s3-sink-connector`
    /// * `snowflake-sink-connector`
    /// * `managed-datagen-source-connector`
    /// * `elasticsearch-sink-connector`
    /// * `dynamo-db-sink-connector`
    /// * `mongo-db-source-connector`
    /// * `mongo-db-sink-connector`
    /// * `sql-server-cdc-debezium-source-connector`
    /// * `postgre-sql-cdc-debezium-source-connector`
    /// * `custom-datagen-source-connector`
    /// 
    /// &gt; **Note:** Certain connectors require additional ACL entries. See [Additional ACL entries](https://docs.confluent.io/cloud/current/connectors/service-account.html#additional-acl-entries) for more details.
    /// 
    /// ## Import
    /// 
    /// You can import a connector by using Environment ID, Kafka cluster ID, and connector's name, in the format `&lt;Environment ID&gt;/&lt;Kafka cluster ID&gt;/&lt;Connector name&gt;`, for example:
    /// 
    ///  $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    ///  $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/connector:Connector my_connector "env-abc123/lkc-abc123/S3_SINKConnector_0"
    /// ```
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/connector:Connector")]
    public partial class Connector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        [Output("configNonsensitive")]
        public Output<ImmutableDictionary<string, string>> ConfigNonsensitive { get; private set; } = null!;

        /// <summary>
        /// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        [Output("configSensitive")]
        public Output<ImmutableDictionary<string, string>> ConfigSensitive { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.ConnectorEnvironment> Environment { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.ConnectorKafkaCluster> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" &gt; "PAUSED"`) and resuming (`"PAUSED" &gt; "RUNNING"`) a connector is supported via an update operation.
        /// 
        /// &gt; **Note:** If there are no _sensitive_ configuration settings for your connector, set `config_sensitive = {}` explicitly.
        /// 
        /// &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Connector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connector(string name, ConnectorArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/connector:Connector", name, args ?? new ConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connector(string name, Input<string> id, ConnectorState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/connector:Connector", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "configSensitive",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Connector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connector Get(string name, Input<string> id, ConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new Connector(name, id, state, options);
        }
    }

    public sealed class ConnectorArgs : global::Pulumi.ResourceArgs
    {
        [Input("configNonsensitive", required: true)]
        private InputMap<string>? _configNonsensitive;

        /// <summary>
        /// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        public InputMap<string> ConfigNonsensitive
        {
            get => _configNonsensitive ?? (_configNonsensitive = new InputMap<string>());
            set => _configNonsensitive = value;
        }

        [Input("configSensitive")]
        private InputMap<string>? _configSensitive;

        /// <summary>
        /// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        public InputMap<string> ConfigSensitive
        {
            get => _configSensitive ?? (_configSensitive = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _configSensitive = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.ConnectorEnvironmentArgs> Environment { get; set; } = null!;

        [Input("kafkaCluster", required: true)]
        public Input<Inputs.ConnectorKafkaClusterArgs> KafkaCluster { get; set; } = null!;

        /// <summary>
        /// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" &gt; "PAUSED"`) and resuming (`"PAUSED" &gt; "RUNNING"`) a connector is supported via an update operation.
        /// 
        /// &gt; **Note:** If there are no _sensitive_ configuration settings for your connector, set `config_sensitive = {}` explicitly.
        /// 
        /// &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ConnectorArgs()
        {
        }
        public static new ConnectorArgs Empty => new ConnectorArgs();
    }

    public sealed class ConnectorState : global::Pulumi.ResourceArgs
    {
        [Input("configNonsensitive")]
        private InputMap<string>? _configNonsensitive;

        /// <summary>
        /// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        public InputMap<string> ConfigNonsensitive
        {
            get => _configNonsensitive ?? (_configNonsensitive = new InputMap<string>());
            set => _configNonsensitive = value;
        }

        [Input("configSensitive")]
        private InputMap<string>? _configSensitive;

        /// <summary>
        /// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
        /// </summary>
        public InputMap<string> ConfigSensitive
        {
            get => _configSensitive ?? (_configSensitive = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _configSensitive = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.ConnectorEnvironmentGetArgs>? Environment { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.ConnectorKafkaClusterGetArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" &gt; "PAUSED"`) and resuming (`"PAUSED" &gt; "RUNNING"`) a connector is supported via an update operation.
        /// 
        /// &gt; **Note:** If there are no _sensitive_ configuration settings for your connector, set `config_sensitive = {}` explicitly.
        /// 
        /// &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ConnectorState()
        {
        }
        public static new ConnectorState Empty => new ConnectorState();
    }
}
