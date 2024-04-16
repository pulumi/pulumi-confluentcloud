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
    /// ### Example Kafka clusters on AWS
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
    ///     var development = new ConfluentCloud.Environment("development", new()
    ///     {
    ///         DisplayName = "Development",
    ///     });
    /// 
    ///     var basic = new ConfluentCloud.KafkaCluster("basic", new()
    ///     {
    ///         DisplayName = "basic_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "AWS",
    ///         Region = "us-east-2",
    ///         Basic = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var standard = new ConfluentCloud.KafkaCluster("standard", new()
    ///     {
    ///         DisplayName = "standard_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "AWS",
    ///         Region = "us-east-2",
    ///         Standard = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var dedicated = new ConfluentCloud.KafkaCluster("dedicated", new()
    ///     {
    ///         DisplayName = "dedicated_kafka_cluster",
    ///         Availability = "MULTI_ZONE",
    ///         Cloud = "AWS",
    ///         Region = "us-east-2",
    ///         Dedicated = new ConfluentCloud.Inputs.KafkaClusterDedicatedArgs
    ///         {
    ///             Cku = 2,
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Example Kafka clusters on Azure
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
    ///     var development = new ConfluentCloud.Environment("development", new()
    ///     {
    ///         DisplayName = "Development",
    ///     });
    /// 
    ///     var basic = new ConfluentCloud.KafkaCluster("basic", new()
    ///     {
    ///         DisplayName = "basic_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "AZURE",
    ///         Region = "centralus",
    ///         Basic = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var standard = new ConfluentCloud.KafkaCluster("standard", new()
    ///     {
    ///         DisplayName = "standard_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "AZURE",
    ///         Region = "centralus",
    ///         Standard = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var dedicated = new ConfluentCloud.KafkaCluster("dedicated", new()
    ///     {
    ///         DisplayName = "dedicated_kafka_cluster",
    ///         Availability = "MULTI_ZONE",
    ///         Cloud = "AZURE",
    ///         Region = "centralus",
    ///         Dedicated = new ConfluentCloud.Inputs.KafkaClusterDedicatedArgs
    ///         {
    ///             Cku = 2,
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Example Kafka clusters on GCP
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
    ///     var development = new ConfluentCloud.Environment("development", new()
    ///     {
    ///         DisplayName = "Development",
    ///     });
    /// 
    ///     var basic = new ConfluentCloud.KafkaCluster("basic", new()
    ///     {
    ///         DisplayName = "basic_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "GCP",
    ///         Region = "us-central1",
    ///         Basic = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var standard = new ConfluentCloud.KafkaCluster("standard", new()
    ///     {
    ///         DisplayName = "standard_kafka_cluster",
    ///         Availability = "SINGLE_ZONE",
    ///         Cloud = "GCP",
    ///         Region = "us-central1",
    ///         Standard = null,
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var dedicated = new ConfluentCloud.KafkaCluster("dedicated", new()
    ///     {
    ///         DisplayName = "dedicated_kafka_cluster",
    ///         Availability = "MULTI_ZONE",
    ///         Cloud = "GCP",
    ///         Region = "us-central1",
    ///         Dedicated = new ConfluentCloud.Inputs.KafkaClusterDedicatedArgs
    ///         {
    ///             Cku = 2,
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.KafkaCluster` resource:
    ///   * `basic-kafka-acls`: _Basic_ Kafka cluster with authorization using ACLs
    ///   * `basic-kafka-acls-with-alias`: _Basic_ Kafka cluster with authorization using ACLs
    ///   * `standard-kafka-acls`: _Standard_ Kafka cluster with authorization using ACLs
    ///   * `standard-kafka-rbac`: _Standard_ Kafka cluster with authorization using RBAC
    ///   * `dedicated-public-kafka-acls`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
    ///   * `dedicated-public-kafka-rbac`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
    ///   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
    ///   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
    ///   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
    /// 
    /// ## Import
    /// 
    /// You can import a Kafka cluster by using Environment ID and Kafka cluster ID, in the format `&lt;Environment ID&gt;/&lt;Kafka cluster ID&gt;`, e.g.
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/kafkaCluster:KafkaCluster my_kafka env-abc123/lkc-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/kafkaCluster:KafkaCluster")]
    public partial class KafkaCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        /// <summary>
        /// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
        /// </summary>
        [Output("availability")]
        public Output<string> Availability { get; private set; } = null!;

        /// <summary>
        /// The configuration of the Basic Kafka cluster.
        /// </summary>
        [Output("basic")]
        public Output<Outputs.KafkaClusterBasic?> Basic { get; private set; } = null!;

        /// <summary>
        /// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
        /// </summary>
        [Output("bootstrapEndpoint")]
        public Output<string> BootstrapEndpoint { get; private set; } = null!;

        [Output("byokKey")]
        public Output<Outputs.KafkaClusterByokKey> ByokKey { get; private set; } = null!;

        /// <summary>
        /// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        [Output("dedicated")]
        public Output<Outputs.KafkaClusterDedicated?> Dedicated { get; private set; } = null!;

        /// <summary>
        /// The name of the Kafka cluster.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The configuration of the Enterprise Kafka cluster.
        /// </summary>
        [Output("enterprises")]
        public Output<ImmutableArray<Outputs.KafkaClusterEnterprise>> Enterprises { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.KafkaClusterEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.KafkaClusterNetwork> Network { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
        /// </summary>
        [Output("rbacCrn")]
        public Output<string> RbacCrn { get; private set; } = null!;

        /// <summary>
        /// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string> RestEndpoint { get; private set; } = null!;

        /// <summary>
        /// The configuration of the Standard Kafka cluster.
        /// </summary>
        [Output("standard")]
        public Output<Outputs.KafkaClusterStandard?> Standard { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaCluster(string name, KafkaClusterArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaCluster:KafkaCluster", name, args ?? new KafkaClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaCluster(string name, Input<string> id, KafkaClusterState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/kafkaCluster:KafkaCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaCluster Get(string name, Input<string> id, KafkaClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaCluster(name, id, state, options);
        }
    }

    public sealed class KafkaClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
        /// </summary>
        [Input("availability", required: true)]
        public Input<string> Availability { get; set; } = null!;

        /// <summary>
        /// The configuration of the Basic Kafka cluster.
        /// </summary>
        [Input("basic")]
        public Input<Inputs.KafkaClusterBasicArgs>? Basic { get; set; }

        [Input("byokKey")]
        public Input<Inputs.KafkaClusterByokKeyArgs>? ByokKey { get; set; }

        /// <summary>
        /// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public Input<string> Cloud { get; set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        [Input("dedicated")]
        public Input<Inputs.KafkaClusterDedicatedArgs>? Dedicated { get; set; }

        /// <summary>
        /// The name of the Kafka cluster.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("enterprises")]
        private InputList<Inputs.KafkaClusterEnterpriseArgs>? _enterprises;

        /// <summary>
        /// The configuration of the Enterprise Kafka cluster.
        /// </summary>
        public InputList<Inputs.KafkaClusterEnterpriseArgs> Enterprises
        {
            get => _enterprises ?? (_enterprises = new InputList<Inputs.KafkaClusterEnterpriseArgs>());
            set => _enterprises = value;
        }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.KafkaClusterEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.KafkaClusterNetworkArgs>? Network { get; set; }

        /// <summary>
        /// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The configuration of the Standard Kafka cluster.
        /// </summary>
        [Input("standard")]
        public Input<Inputs.KafkaClusterStandardArgs>? Standard { get; set; }

        public KafkaClusterArgs()
        {
        }
        public static new KafkaClusterArgs Empty => new KafkaClusterArgs();
    }

    public sealed class KafkaClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
        /// </summary>
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        /// <summary>
        /// The configuration of the Basic Kafka cluster.
        /// </summary>
        [Input("basic")]
        public Input<Inputs.KafkaClusterBasicGetArgs>? Basic { get; set; }

        /// <summary>
        /// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
        /// </summary>
        [Input("bootstrapEndpoint")]
        public Input<string>? BootstrapEndpoint { get; set; }

        [Input("byokKey")]
        public Input<Inputs.KafkaClusterByokKeyGetArgs>? ByokKey { get; set; }

        /// <summary>
        /// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
        /// </summary>
        [Input("dedicated")]
        public Input<Inputs.KafkaClusterDedicatedGetArgs>? Dedicated { get; set; }

        /// <summary>
        /// The name of the Kafka cluster.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("enterprises")]
        private InputList<Inputs.KafkaClusterEnterpriseGetArgs>? _enterprises;

        /// <summary>
        /// The configuration of the Enterprise Kafka cluster.
        /// </summary>
        public InputList<Inputs.KafkaClusterEnterpriseGetArgs> Enterprises
        {
            get => _enterprises ?? (_enterprises = new InputList<Inputs.KafkaClusterEnterpriseGetArgs>());
            set => _enterprises = value;
        }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.KafkaClusterEnvironmentGetArgs>? Environment { get; set; }

        /// <summary>
        /// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.KafkaClusterNetworkGetArgs>? Network { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
        /// </summary>
        [Input("rbacCrn")]
        public Input<string>? RbacCrn { get; set; }

        /// <summary>
        /// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The configuration of the Standard Kafka cluster.
        /// </summary>
        [Input("standard")]
        public Input<Inputs.KafkaClusterStandardGetArgs>? Standard { get; set; }

        public KafkaClusterState()
        {
        }
        public static new KafkaClusterState Empty => new KafkaClusterState();
    }
}
