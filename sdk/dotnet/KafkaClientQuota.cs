// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new ConfluentCloud.KafkaClientQuota("example", new()
    ///     {
    ///         DisplayName = "test-quota",
    ///         Description = "Test Quota",
    ///         Throughput = new ConfluentCloud.Inputs.KafkaClientQuotaThroughputArgs
    ///         {
    ///             IngressByteRate = "100",
    ///             EgressByteRate = "200",
    ///         },
    ///         Principals = new[]
    ///         {
    ///             appManager.Id,
    ///             appManager2.Id,
    ///         },
    ///         KafkaCluster = new ConfluentCloud.Inputs.KafkaClientQuotaKafkaClusterArgs
    ///         {
    ///             Id = dedicated.Id,
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.KafkaClientQuotaEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Kafka Client Quota by using Kafka Client Quota ID. The following example shows how to import a Kafka Client Quota ID:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/kafkaClientQuota:KafkaClientQuota example cq-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/kafkaClientQuota:KafkaClientQuota")]
    public partial class KafkaClientQuota : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Kafka Client Quota.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the Kafka Client Quota.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.KafkaClientQuotaEnvironment> Environment { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.KafkaClientQuotaKafkaCluster> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, `"&lt;default&gt;"`, to represent the default quota for all users and service accounts.
        /// </summary>
        [Output("principals")]
        public Output<ImmutableArray<string>> Principals { get; private set; } = null!;

        /// <summary>
        /// Block for representing a Kafka Quota.
        /// </summary>
        [Output("throughput")]
        public Output<Outputs.KafkaClientQuotaThroughput> Throughput { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaClientQuota resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaClientQuota(string name, KafkaClientQuotaArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, args ?? new KafkaClientQuotaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaClientQuota(string name, Input<string> id, KafkaClientQuotaState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaClientQuota resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaClientQuota Get(string name, Input<string> id, KafkaClientQuotaState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaClientQuota(name, id, state, options);
        }
    }

    public sealed class KafkaClientQuotaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Kafka Client Quota.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Kafka Client Quota.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.KafkaClientQuotaEnvironmentArgs> Environment { get; set; } = null!;

        [Input("kafkaCluster", required: true)]
        public Input<Inputs.KafkaClientQuotaKafkaClusterArgs> KafkaCluster { get; set; } = null!;

        [Input("principals", required: true)]
        private InputList<string>? _principals;

        /// <summary>
        /// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, `"&lt;default&gt;"`, to represent the default quota for all users and service accounts.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// Block for representing a Kafka Quota.
        /// </summary>
        [Input("throughput", required: true)]
        public Input<Inputs.KafkaClientQuotaThroughputArgs> Throughput { get; set; } = null!;

        public KafkaClientQuotaArgs()
        {
        }
        public static new KafkaClientQuotaArgs Empty => new KafkaClientQuotaArgs();
    }

    public sealed class KafkaClientQuotaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Kafka Client Quota.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Kafka Client Quota.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.KafkaClientQuotaEnvironmentGetArgs>? Environment { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.KafkaClientQuotaKafkaClusterGetArgs>? KafkaCluster { get; set; }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, `"&lt;default&gt;"`, to represent the default quota for all users and service accounts.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// Block for representing a Kafka Quota.
        /// </summary>
        [Input("throughput")]
        public Input<Inputs.KafkaClientQuotaThroughputGetArgs>? Throughput { get; set; }

        public KafkaClientQuotaState()
        {
        }
        public static new KafkaClientQuotaState Empty => new KafkaClientQuotaState();
    }
}
