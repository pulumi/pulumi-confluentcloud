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
    /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    /// 
    /// `confluentcloud.Gateway` provides a Gateway resource that enables creating, editing, and deleting Gateways on Confluent Cloud.
    /// 
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
    ///     var development = new ConfluentCloud.Environment("development", new()
    ///     {
    ///         DisplayName = "Development",
    ///     });
    /// 
    ///     var main = new ConfluentCloud.Gateway("main", new()
    ///     {
    ///         DisplayName = "my_gateway",
    ///         Environment = new ConfluentCloud.Inputs.GatewayEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         AwsEgressPrivateLinkGateway = new ConfluentCloud.Inputs.GatewayAwsEgressPrivateLinkGatewayArgs
    ///         {
    ///             Region = "us-west-2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Gateway by using Environment ID and Gateway ID, in the format `&lt;Environment ID&gt;/&lt;Gateway ID&gt;`. The following example shows how to import a Gateway:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/gateway:Gateway main env-abc123/gw-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/gateway:Gateway")]
    public partial class Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("awsEgressPrivateLinkGateway")]
        public Output<Outputs.GatewayAwsEgressPrivateLinkGateway> AwsEgressPrivateLinkGateway { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("azureEgressPrivateLinkGateway")]
        public Output<Outputs.GatewayAzureEgressPrivateLinkGateway> AzureEgressPrivateLinkGateway { get; private set; } = null!;

        /// <summary>
        /// The name of the Gateway.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.GatewayEnvironment> Environment { get; private set; } = null!;


        /// <summary>
        /// Create a Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gateway(string name, GatewayArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/gateway:Gateway", name, args ?? new GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gateway(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/gateway:Gateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gateway Get(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Gateway(name, id, state, options);
        }
    }

    public sealed class GatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("awsEgressPrivateLinkGateway")]
        public Input<Inputs.GatewayAwsEgressPrivateLinkGatewayArgs>? AwsEgressPrivateLinkGateway { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("azureEgressPrivateLinkGateway")]
        public Input<Inputs.GatewayAzureEgressPrivateLinkGatewayArgs>? AzureEgressPrivateLinkGateway { get; set; }

        /// <summary>
        /// The name of the Gateway.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.GatewayEnvironmentArgs> Environment { get; set; } = null!;

        public GatewayArgs()
        {
        }
        public static new GatewayArgs Empty => new GatewayArgs();
    }

    public sealed class GatewayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("awsEgressPrivateLinkGateway")]
        public Input<Inputs.GatewayAwsEgressPrivateLinkGatewayGetArgs>? AwsEgressPrivateLinkGateway { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("azureEgressPrivateLinkGateway")]
        public Input<Inputs.GatewayAzureEgressPrivateLinkGatewayGetArgs>? AzureEgressPrivateLinkGateway { get; set; }

        /// <summary>
        /// The name of the Gateway.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.GatewayEnvironmentGetArgs>? Environment { get; set; }

        public GatewayState()
        {
        }
        public static new GatewayState Empty => new GatewayState();
    }
}
