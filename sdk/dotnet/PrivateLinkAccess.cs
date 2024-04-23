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
    /// ### Example Private Link Access on AWS
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
    ///     var aws = new ConfluentCloud.PrivateLinkAccess("aws", new()
    ///     {
    ///         DisplayName = "AWS Private Link Access",
    ///         Aws = new ConfluentCloud.Inputs.PrivateLinkAccessAwsArgs
    ///         {
    ///             Account = "012345678901",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.PrivateLinkAccessEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.PrivateLinkAccessNetworkArgs
    ///         {
    ///             Id = aws_private_link.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Private Link Access on Azure
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
    ///     var azure_private_link = new ConfluentCloud.Network("azure-private-link", new()
    ///     {
    ///         DisplayName = "Azure Private Link Network",
    ///         Cloud = "AZURE",
    ///         Region = "centralus",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "PRIVATELINK",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var azure = new ConfluentCloud.PrivateLinkAccess("azure", new()
    ///     {
    ///         DisplayName = "Azure Private Link Access",
    ///         Azure = new ConfluentCloud.Inputs.PrivateLinkAccessAzureArgs
    ///         {
    ///             Subscription = "1234abcd-12ab-34cd-1234-123456abcdef",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.PrivateLinkAccessEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.PrivateLinkAccessNetworkArgs
    ///         {
    ///             Id = azure_private_link.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Private Service Connect on GCP
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
    ///     var gcp_private_service_connect = new ConfluentCloud.Network("gcp-private-service-connect", new()
    ///     {
    ///         DisplayName = "GCP Private Service Connect Network",
    ///         Cloud = "GCP",
    ///         Region = "us-central1",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "PRIVATELINK",
    ///         },
    ///         Zones = new[]
    ///         {
    ///             "us-central1-a",
    ///             "us-central1-b",
    ///             "us-central1-c",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var gcp = new ConfluentCloud.PrivateLinkAccess("gcp", new()
    ///     {
    ///         DisplayName = "GCP Private Service Connect",
    ///         Gcp = new ConfluentCloud.Inputs.PrivateLinkAccessGcpArgs
    ///         {
    ///             Project = "temp-gear-123456",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.PrivateLinkAccessEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.PrivateLinkAccessNetworkArgs
    ///         {
    ///             Id = gcp_private_service_connect.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAccess` resource:
    ///   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
    /// 
    /// ## Import
    /// 
    /// You can import a Private Link Access by using Environment ID and Private Link Access ID, in the format `&lt;Environment ID&gt;/&lt;Private Link Access ID&gt;`. The following example shows how to import a Private Link Access:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/privateLinkAccess:PrivateLinkAccess my_pla env-abc123/pla-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/privateLinkAccess:PrivateLinkAccess")]
    public partial class PrivateLinkAccess : global::Pulumi.CustomResource
    {
        [Output("aws")]
        public Output<Outputs.PrivateLinkAccessAws?> Aws { get; private set; } = null!;

        [Output("azure")]
        public Output<Outputs.PrivateLinkAccessAzure?> Azure { get; private set; } = null!;

        /// <summary>
        /// The name of the Private Link Access.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.PrivateLinkAccessEnvironment> Environment { get; private set; } = null!;

        [Output("gcp")]
        public Output<Outputs.PrivateLinkAccessGcp?> Gcp { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.PrivateLinkAccessNetwork> Network { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateLinkAccess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateLinkAccess(string name, PrivateLinkAccessArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/privateLinkAccess:PrivateLinkAccess", name, args ?? new PrivateLinkAccessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateLinkAccess(string name, Input<string> id, PrivateLinkAccessState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/privateLinkAccess:PrivateLinkAccess", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateLinkAccess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateLinkAccess Get(string name, Input<string> id, PrivateLinkAccessState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateLinkAccess(name, id, state, options);
        }
    }

    public sealed class PrivateLinkAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PrivateLinkAccessAwsArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PrivateLinkAccessAzureArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.PrivateLinkAccessEnvironmentArgs> Environment { get; set; } = null!;

        [Input("gcp")]
        public Input<Inputs.PrivateLinkAccessGcpArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.PrivateLinkAccessNetworkArgs> Network { get; set; } = null!;

        public PrivateLinkAccessArgs()
        {
        }
        public static new PrivateLinkAccessArgs Empty => new PrivateLinkAccessArgs();
    }

    public sealed class PrivateLinkAccessState : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PrivateLinkAccessAwsGetArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PrivateLinkAccessAzureGetArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Private Link Access.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.PrivateLinkAccessEnvironmentGetArgs>? Environment { get; set; }

        [Input("gcp")]
        public Input<Inputs.PrivateLinkAccessGcpGetArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.PrivateLinkAccessNetworkGetArgs>? Network { get; set; }

        public PrivateLinkAccessState()
        {
        }
        public static new PrivateLinkAccessState Empty => new PrivateLinkAccessState();
    }
}
