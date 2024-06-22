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
    /// ### Example Transit Gateway Attachment on AWS
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
    ///     var aws_transit_gateway_attachment = new ConfluentCloud.Network("aws-transit-gateway-attachment", new()
    ///     {
    ///         DisplayName = "AWS Transit Gateway Attachment Network",
    ///         Cloud = "AWS",
    ///         Region = "us-east-2",
    ///         Cidr = "10.10.0.0/16",
    ///         ConnectionTypes = new[]
    ///         {
    ///             "TRANSITGATEWAY",
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.NetworkEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///     });
    /// 
    ///     var aws = new ConfluentCloud.TransitGatewayAttachment("aws", new()
    ///     {
    ///         DisplayName = "AWS Transit Gateway Attachment",
    ///         Aws = new ConfluentCloud.Inputs.TransitGatewayAttachmentAwsArgs
    ///         {
    ///             RamResourceShareArn = "arn:aws:ram:us-east-2:000000000000:resource-share/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx",
    ///             TransitGatewayId = "tgw-xxxxxxxxxxxxxxxxx",
    ///             Routes = new[]
    ///             {
    ///                 "192.168.0.0/16",
    ///                 "172.16.0.0/12",
    ///                 "100.64.0.0/10",
    ///                 "10.0.0.0/8",
    ///             },
    ///         },
    ///         Environment = new ConfluentCloud.Inputs.TransitGatewayAttachmentEnvironmentArgs
    ///         {
    ///             Id = development.Id,
    ///         },
    ///         Network = new ConfluentCloud.Inputs.TransitGatewayAttachmentNetworkArgs
    ///         {
    ///             Id = aws_transit_gateway_attachment.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.TransitGatewayAttachment` resource:
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
    ///   * enterprise-privatelinkattachment-aws-kafka-acls
    /// 
    /// ## Import
    /// 
    /// You can import a Transit Gateway Attachment by using Environment ID and Transit Gateway Attachment ID, in the format `&lt;Environment ID&gt;/&lt;Transit Gateway Attachment ID&gt;`. The following example shows how to import a Transit Gateway Attachment:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment my_tgwa env-abc123/tgwa-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment")]
    public partial class TransitGatewayAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        /// </summary>
        [Output("aws")]
        public Output<Outputs.TransitGatewayAttachmentAws?> Aws { get; private set; } = null!;

        /// <summary>
        /// The name of the Transit Gateway Attachment.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.TransitGatewayAttachmentEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.TransitGatewayAttachmentNetwork> Network { get; private set; } = null!;


        /// <summary>
        /// Create a TransitGatewayAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitGatewayAttachment(string name, TransitGatewayAttachmentArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, args ?? new TransitGatewayAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitGatewayAttachment(string name, Input<string> id, TransitGatewayAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitGatewayAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitGatewayAttachment Get(string name, Input<string> id, TransitGatewayAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitGatewayAttachment(name, id, state, options);
        }
    }

    public sealed class TransitGatewayAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.TransitGatewayAttachmentAwsArgs>? Aws { get; set; }

        /// <summary>
        /// The name of the Transit Gateway Attachment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.TransitGatewayAttachmentEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.TransitGatewayAttachmentNetworkArgs> Network { get; set; } = null!;

        public TransitGatewayAttachmentArgs()
        {
        }
        public static new TransitGatewayAttachmentArgs Empty => new TransitGatewayAttachmentArgs();
    }

    public sealed class TransitGatewayAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.TransitGatewayAttachmentAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// The name of the Transit Gateway Attachment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.TransitGatewayAttachmentEnvironmentGetArgs>? Environment { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.TransitGatewayAttachmentNetworkGetArgs>? Network { get; set; }

        public TransitGatewayAttachmentState()
        {
        }
        public static new TransitGatewayAttachmentState Empty => new TransitGatewayAttachmentState();
    }
}