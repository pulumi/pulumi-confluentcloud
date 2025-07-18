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
    /// ### Example Network Link Service on AWS
    /// 
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
    ///     var aws_private_link = new ConfluentCloud.Network("aws-private-link", new()
    ///     {
    ///         DisplayName = "AWS Private Link Network",
    ///         Cloud = "AWS",
    ///         Region = "us-east-1",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "PRIVATELINK",
    ///         },
    ///         Zones = new[]
    ///         {
    ///             "use1-az1",
    ///             "use1-az2",
    ///             "use1-az6",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var awsNls = new ConfluentCloud.NetworkLinkService("aws_nls", new()
    ///     {
    ///         DisplayName = "AWS Private Link network link service",
    ///         Environment = new ConfluentCloud.Inputs.NetworkLinkServiceEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.NetworkLinkServiceNetworkArgs
    ///         {
    ///             Id = aws_private_link.Id,
    ///         },
    ///         Description = "Test NL service",
    ///         Accept = new ConfluentCloud.Inputs.NetworkLinkServiceAcceptArgs
    ///         {
    ///             Environments = new[]
    ///             {
    ///                 "env-5678",
    ///                 "env-0923",
    ///             },
    ///             Networks = new[]
    ///             {
    ///                 "n-1234",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.NetworkLinkService` resource:
    /// * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks
    /// 
    /// ## Import
    /// 
    /// You can import a Network Link Service by using Environment ID and Network Link Service ID, in the format `&lt;Environment ID&gt;/&lt;Network Link Service ID&gt;`. The following example shows how to import a Network Link Service:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/networkLinkService:NetworkLinkService my_nls env-abc123/nls-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/networkLinkService:NetworkLinkService")]
    public partial class NetworkLinkService : global::Pulumi.CustomResource
    {
        [Output("accept")]
        public Output<Outputs.NetworkLinkServiceAccept> Accept { get; private set; } = null!;

        /// <summary>
        /// The description of the Network Link Service.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the Network Link Service.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.NetworkLinkServiceEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.NetworkLinkServiceNetwork> Network { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network Link Service.
        /// </summary>
        [Output("resourceName")]
        public Output<string> ResourceName { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkLinkService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkLinkService(string name, NetworkLinkServiceArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/networkLinkService:NetworkLinkService", name, args ?? new NetworkLinkServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkLinkService(string name, Input<string> id, NetworkLinkServiceState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/networkLinkService:NetworkLinkService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkLinkService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkLinkService Get(string name, Input<string> id, NetworkLinkServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkLinkService(name, id, state, options);
        }
    }

    public sealed class NetworkLinkServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("accept")]
        public Input<Inputs.NetworkLinkServiceAcceptArgs>? Accept { get; set; }

        /// <summary>
        /// The description of the Network Link Service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Network Link Service.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.NetworkLinkServiceEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.NetworkLinkServiceNetworkArgs> Network { get; set; } = null!;

        public NetworkLinkServiceArgs()
        {
        }
        public static new NetworkLinkServiceArgs Empty => new NetworkLinkServiceArgs();
    }

    public sealed class NetworkLinkServiceState : global::Pulumi.ResourceArgs
    {
        [Input("accept")]
        public Input<Inputs.NetworkLinkServiceAcceptGetArgs>? Accept { get; set; }

        /// <summary>
        /// The description of the Network Link Service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Network Link Service.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.NetworkLinkServiceEnvironmentGetArgs>? Environment { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.NetworkLinkServiceNetworkGetArgs>? Network { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network Link Service.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        public NetworkLinkServiceState()
        {
        }
        public static new NetworkLinkServiceState Empty => new NetworkLinkServiceState();
    }
}
