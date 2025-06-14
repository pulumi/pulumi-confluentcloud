// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetKafkaTopic
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaTopic` describes a Kafka Topic data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         KafkaCluster = new ConfluentCloud.Inputs.GetKafkaTopicKafkaClusterInputArgs
        ///         {
        ///             Id = basic_cluster.Id,
        ///         },
        ///         TopicName = "orders",
        ///         RestEndpoint = basic_cluster.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetKafkaTopicCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Kafka API Key for confluent_kafka_cluster.basic-cluster&gt;",
        ///             Secret = "&lt;Kafka API Secret for confluent_kafka_cluster.basic-cluster&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         TopicName = "orders",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetKafkaTopicResult> InvokeAsync(GetKafkaTopicArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKafkaTopicResult>("confluentcloud:index/getKafkaTopic:getKafkaTopic", args ?? new GetKafkaTopicArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaTopic` describes a Kafka Topic data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         KafkaCluster = new ConfluentCloud.Inputs.GetKafkaTopicKafkaClusterInputArgs
        ///         {
        ///             Id = basic_cluster.Id,
        ///         },
        ///         TopicName = "orders",
        ///         RestEndpoint = basic_cluster.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetKafkaTopicCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Kafka API Key for confluent_kafka_cluster.basic-cluster&gt;",
        ///             Secret = "&lt;Kafka API Secret for confluent_kafka_cluster.basic-cluster&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         TopicName = "orders",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetKafkaTopicResult> Invoke(GetKafkaTopicInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKafkaTopicResult>("confluentcloud:index/getKafkaTopic:getKafkaTopic", args ?? new GetKafkaTopicInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaTopic` describes a Kafka Topic data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         KafkaCluster = new ConfluentCloud.Inputs.GetKafkaTopicKafkaClusterInputArgs
        ///         {
        ///             Id = basic_cluster.Id,
        ///         },
        ///         TopicName = "orders",
        ///         RestEndpoint = basic_cluster.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetKafkaTopicCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Kafka API Key for confluent_kafka_cluster.basic-cluster&gt;",
        ///             Secret = "&lt;Kafka API Secret for confluent_kafka_cluster.basic-cluster&gt;",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var orders = ConfluentCloud.GetKafkaTopic.Invoke(new()
        ///     {
        ///         TopicName = "orders",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["config"] = orders.Apply(getKafkaTopicResult =&gt; getKafkaTopicResult.Config),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetKafkaTopicResult> Invoke(GetKafkaTopicInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetKafkaTopicResult>("confluentcloud:index/getKafkaTopic:getKafkaTopic", args ?? new GetKafkaTopicInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKafkaTopicArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Inputs.GetKafkaTopicCredentialsArgs? _credentials;
        public Inputs.GetKafkaTopicCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        [Input("kafkaCluster")]
        public Inputs.GetKafkaTopicKafkaClusterArgs? KafkaCluster { get; set; }

        /// <summary>
        /// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint", required: true)]
        public string RestEndpoint { get; set; } = null!;

        /// <summary>
        /// The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
        /// </summary>
        [Input("topicName", required: true)]
        public string TopicName { get; set; } = null!;

        public GetKafkaTopicArgs()
        {
        }
        public static new GetKafkaTopicArgs Empty => new GetKafkaTopicArgs();
    }

    public sealed class GetKafkaTopicInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Input<Inputs.GetKafkaTopicCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetKafkaTopicCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetKafkaTopicCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("kafkaCluster")]
        public Input<Inputs.GetKafkaTopicKafkaClusterInputArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint", required: true)]
        public Input<string> RestEndpoint { get; set; } = null!;

        /// <summary>
        /// The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
        /// </summary>
        [Input("topicName", required: true)]
        public Input<string> TopicName { get; set; } = null!;

        public GetKafkaTopicInvokeArgs()
        {
        }
        public static new GetKafkaTopicInvokeArgs Empty => new GetKafkaTopicInvokeArgs();
    }


    [OutputType]
    public sealed class GetKafkaTopicResult
    {
        /// <summary>
        /// (Optional Map) The custom topic settings:
        /// </summary>
        public readonly ImmutableDictionary<string, string> Config;
        public readonly Outputs.GetKafkaTopicCredentialsResult? Credentials;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetKafkaTopicKafkaClusterResult? KafkaCluster;
        /// <summary>
        /// (Required Number) The number of partitions to create in the topic. Defaults to `6`.
        /// </summary>
        public readonly int PartitionsCount;
        public readonly string RestEndpoint;
        public readonly string TopicName;

        [OutputConstructor]
        private GetKafkaTopicResult(
            ImmutableDictionary<string, string> config,

            Outputs.GetKafkaTopicCredentialsResult? credentials,

            string id,

            Outputs.GetKafkaTopicKafkaClusterResult? kafkaCluster,

            int partitionsCount,

            string restEndpoint,

            string topicName)
        {
            Config = config;
            Credentials = credentials;
            Id = id;
            KafkaCluster = kafkaCluster;
            PartitionsCount = partitionsCount;
            RestEndpoint = restEndpoint;
            TopicName = topicName;
        }
    }
}
