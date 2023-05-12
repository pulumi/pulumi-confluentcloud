// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetKafkaCluster
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaCluster` describes a Kafka cluster data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetKafkaCluster.Invoke(new()
        ///     {
        ///         Id = "lkc-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetKafkaClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         Description = $"app_mgr for {exampleUsingId.Apply(getKafkaClusterResult =&gt; getKafkaClusterResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingNameKafkaCluster = ConfluentCloud.GetKafkaCluster.Invoke(new()
        ///     {
        ///         DisplayName = "basic_kafka_cluster",
        ///         Environment = new ConfluentCloud.Inputs.GetKafkaClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingNameKafkaCluster,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKafkaClusterResult> InvokeAsync(GetKafkaClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKafkaClusterResult>("confluentcloud:index/getKafkaCluster:getKafkaCluster", args ?? new GetKafkaClusterArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaCluster` describes a Kafka cluster data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetKafkaCluster.Invoke(new()
        ///     {
        ///         Id = "lkc-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetKafkaClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         Description = $"app_mgr for {exampleUsingId.Apply(getKafkaClusterResult =&gt; getKafkaClusterResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingNameKafkaCluster = ConfluentCloud.GetKafkaCluster.Invoke(new()
        ///     {
        ///         DisplayName = "basic_kafka_cluster",
        ///         Environment = new ConfluentCloud.Inputs.GetKafkaClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingNameKafkaCluster,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKafkaClusterResult> Invoke(GetKafkaClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKafkaClusterResult>("confluentcloud:index/getKafkaCluster:getKafkaCluster", args ?? new GetKafkaClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKafkaClusterArgs : global::Pulumi.InvokeArgs
    {
        [Input("basics")]
        private List<Inputs.GetKafkaClusterBasicArgs>? _basics;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
        /// </summary>
        public List<Inputs.GetKafkaClusterBasicArgs> Basics
        {
            get => _basics ?? (_basics = new List<Inputs.GetKafkaClusterBasicArgs>());
            set => _basics = value;
        }

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        [Input("dedicated")]
        public Inputs.GetKafkaClusterDedicatedArgs? Dedicated { get; set; }

        /// <summary>
        /// A human-readable name for the Kafka cluster.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Inputs.GetKafkaClusterEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("standards")]
        private List<Inputs.GetKafkaClusterStandardArgs>? _standards;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
        /// </summary>
        public List<Inputs.GetKafkaClusterStandardArgs> Standards
        {
            get => _standards ?? (_standards = new List<Inputs.GetKafkaClusterStandardArgs>());
            set => _standards = value;
        }

        public GetKafkaClusterArgs()
        {
        }
        public static new GetKafkaClusterArgs Empty => new GetKafkaClusterArgs();
    }

    public sealed class GetKafkaClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("basics")]
        private InputList<Inputs.GetKafkaClusterBasicInputArgs>? _basics;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
        /// </summary>
        public InputList<Inputs.GetKafkaClusterBasicInputArgs> Basics
        {
            get => _basics ?? (_basics = new InputList<Inputs.GetKafkaClusterBasicInputArgs>());
            set => _basics = value;
        }

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        [Input("dedicated")]
        public Input<Inputs.GetKafkaClusterDedicatedInputArgs>? Dedicated { get; set; }

        /// <summary>
        /// A human-readable name for the Kafka cluster.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Input<Inputs.GetKafkaClusterEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("standards")]
        private InputList<Inputs.GetKafkaClusterStandardInputArgs>? _standards;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
        /// </summary>
        public InputList<Inputs.GetKafkaClusterStandardInputArgs> Standards
        {
            get => _standards ?? (_standards = new InputList<Inputs.GetKafkaClusterStandardInputArgs>());
            set => _standards = value;
        }

        public GetKafkaClusterInvokeArgs()
        {
        }
        public static new GetKafkaClusterInvokeArgs Empty => new GetKafkaClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetKafkaClusterResult
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
        /// </summary>
        public readonly string Availability;
        /// <summary>
        /// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClusterBasicResult> Basics;
        /// <summary>
        /// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
        /// </summary>
        public readonly string BootstrapEndpoint;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClusterByokKeyResult> ByokKeys;
        /// <summary>
        /// (Required String) The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        public readonly Outputs.GetKafkaClusterDedicatedResult? Dedicated;
        /// <summary>
        /// (Required String) The name of the Kafka cluster.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetKafkaClusterEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClusterNetworkResult> Networks;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
        /// </summary>
        public readonly string RbacCrn;
        /// <summary>
        /// (Required String) The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        public readonly string RestEndpoint;
        /// <summary>
        /// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClusterStandardResult> Standards;

        [OutputConstructor]
        private GetKafkaClusterResult(
            string apiVersion,

            string availability,

            ImmutableArray<Outputs.GetKafkaClusterBasicResult> basics,

            string bootstrapEndpoint,

            ImmutableArray<Outputs.GetKafkaClusterByokKeyResult> byokKeys,

            string cloud,

            Outputs.GetKafkaClusterDedicatedResult? dedicated,

            string displayName,

            Outputs.GetKafkaClusterEnvironmentResult environment,

            string id,

            string kind,

            ImmutableArray<Outputs.GetKafkaClusterNetworkResult> networks,

            string rbacCrn,

            string region,

            string restEndpoint,

            ImmutableArray<Outputs.GetKafkaClusterStandardResult> standards)
        {
            ApiVersion = apiVersion;
            Availability = availability;
            Basics = basics;
            BootstrapEndpoint = bootstrapEndpoint;
            ByokKeys = byokKeys;
            Cloud = cloud;
            Dedicated = dedicated;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Kind = kind;
            Networks = networks;
            RbacCrn = rbacCrn;
            Region = region;
            RestEndpoint = restEndpoint;
            Standards = standards;
        }
    }
}
