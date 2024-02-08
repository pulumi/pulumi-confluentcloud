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
    /// ### Example Peering on AWS
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var development = new ConfluentCloud.Environment("development");
    /// 
    ///     var aws_peering = new ConfluentCloud.Network("aws-peering", new()
    ///     {
    ///         DisplayName = "AWS Peering Network",
    ///         Cloud = "AWS",
    ///         Region = "us-east-2",
    ///         Cidr = "10.10.0.0/16",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "PEERING",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var aws = new ConfluentCloud.Peering("aws", new()
    ///     {
    ///         DisplayName = "AWS Peering",
    ///         Aws = new ConfluentCloud.Inputs.PeeringAwsArgs
    ///         {
    ///             Account = "012345678901",
    ///             Vpc = "vpc-abcdef0123456789a",
    ///             Routes = new[]
    ///             {
    ///                 "172.31.0.0/16",
    ///             },
    ///             CustomerRegion = "us-east-2",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.PeeringEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.PeeringNetworkArgs
    ///         {
    ///             Id = aws_peering.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Peering on Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var development = new ConfluentCloud.Environment("development");
    /// 
    ///     var azure_peering = new ConfluentCloud.Network("azure-peering", new()
    ///     {
    ///         DisplayName = "Azure Peering Network",
    ///         Cloud = "AZURE",
    ///         Region = "centralus",
    ///         Cidr = "10.10.0.0/16",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "PEERING",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var azure = new ConfluentCloud.Peering("azure", new()
    ///     {
    ///         DisplayName = "Azure Peering",
    ///         Azure = new ConfluentCloud.Inputs.PeeringAzureArgs
    ///         {
    ///             Tenant = "1111tttt-1111-1111-1111-111111tttttt",
    ///             Vnet = "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/my-rg/providers/Microsoft.Network/virtualNetworks/my-vnet",
    ///             CustomerRegion = "centralus",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.PeeringEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.PeeringNetworkArgs
    ///         {
    ///             Id = azure_peering.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.Peering` resource:
    ///   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
    ///   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    /// 
    /// ## Import
    /// 
    /// You can import a Peering by using Environment ID and Peering ID, in the format `&lt;Environment ID&gt;/&lt;Peering ID&gt;`. The following example shows how to import a Peering:
    /// 
    ///  $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    ///  $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/peering:Peering my_peer env-abc123/peer-abc123
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/peering:Peering")]
    public partial class Peering : global::Pulumi.CustomResource
    {
        [Output("aws")]
        public Output<Outputs.PeeringAws?> Aws { get; private set; } = null!;

        [Output("azure")]
        public Output<Outputs.PeeringAzure?> Azure { get; private set; } = null!;

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.PeeringEnvironment> Environment { get; private set; } = null!;

        [Output("gcp")]
        public Output<Outputs.PeeringGcp?> Gcp { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.PeeringNetwork> Network { get; private set; } = null!;


        /// <summary>
        /// Create a Peering resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Peering(string name, PeeringArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/peering:Peering", name, args ?? new PeeringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Peering(string name, Input<string> id, PeeringState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/peering:Peering", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Peering resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Peering Get(string name, Input<string> id, PeeringState? state = null, CustomResourceOptions? options = null)
        {
            return new Peering(name, id, state, options);
        }
    }

    public sealed class PeeringArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PeeringAwsArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PeeringAzureArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.PeeringEnvironmentArgs> Environment { get; set; } = null!;

        [Input("gcp")]
        public Input<Inputs.PeeringGcpArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.PeeringNetworkArgs> Network { get; set; } = null!;

        public PeeringArgs()
        {
        }
        public static new PeeringArgs Empty => new PeeringArgs();
    }

    public sealed class PeeringState : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PeeringAwsGetArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PeeringAzureGetArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.PeeringEnvironmentGetArgs>? Environment { get; set; }

        [Input("gcp")]
        public Input<Inputs.PeeringGcpGetArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.PeeringNetworkGetArgs>? Network { get; set; }

        public PeeringState()
        {
        }
        public static new PeeringState Empty => new PeeringState();
    }
}
