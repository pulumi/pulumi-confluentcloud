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
    /// `confluentcloud.PrivateLinkAttachment` provides a Private Link Attachment resource that enables creating, editing, and deleting Private Link Attachments on Confluent Cloud.
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
    ///     var main = new ConfluentCloud.PrivateLinkAttachment("main", new()
    ///     {
    ///         Cloud = "AWS",
    ///         Region = "us-west-2",
    ///         DisplayName = "staging-platt",
    ///         Environment = new ConfluentCloud.Inputs.PrivateLinkAttachmentEnvironmentArgs
    ///         {
    ///             Id = "env-3732nw",
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["privateLinkAttachment"] = main,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAttachment` resource:
    /// * `enterprise-privatelinkattachment-aws-kafka-acls`: *Enterprise* Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    /// * `enterprise-privatelinkattachment-azure-kafka-acls`: *Enterprise* Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
    /// 
    /// ## Import
    /// 
    /// You can import a Private Link Attachment by using Environment ID and Private Link Attachment ID, in the format `&lt;Environment ID&gt;/&lt;Private Link Attachment ID&gt;`. The following example shows how to import a Private Link Attachment:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment main env-abc123/platt-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment")]
    public partial class PrivateLinkAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("aws")]
        public Output<ImmutableArray<Outputs.PrivateLinkAttachmentAw>> Aws { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        /// </summary>
        [Output("azures")]
        public Output<ImmutableArray<Outputs.PrivateLinkAttachmentAzure>> Azures { get; private set; } = null!;

        /// <summary>
        /// The cloud service provider that hosts the resources to access with the Private Link Attachment.
        /// </summary>
        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// The name of the Private Link Attachment.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        /// </summary>
        [Output("dnsDomain")]
        public Output<string> DnsDomain { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.PrivateLinkAttachmentEnvironment> Environment { get; private set; } = null!;

        [Output("gcps")]
        public Output<ImmutableArray<Outputs.PrivateLinkAttachmentGcp>> Gcps { get; private set; } = null!;

        /// <summary>
        /// The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        /// </summary>
        [Output("resourceName")]
        public Output<string> ResourceName { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateLinkAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateLinkAttachment(string name, PrivateLinkAttachmentArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment", name, args ?? new PrivateLinkAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateLinkAttachment(string name, Input<string> id, PrivateLinkAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateLinkAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateLinkAttachment Get(string name, Input<string> id, PrivateLinkAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateLinkAttachment(name, id, state, options);
        }
    }

    public sealed class PrivateLinkAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloud service provider that hosts the resources to access with the Private Link Attachment.
        /// </summary>
        [Input("cloud", required: true)]
        public Input<string> Cloud { get; set; } = null!;

        /// <summary>
        /// The name of the Private Link Attachment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.PrivateLinkAttachmentEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public PrivateLinkAttachmentArgs()
        {
        }
        public static new PrivateLinkAttachmentArgs Empty => new PrivateLinkAttachmentArgs();
    }

    public sealed class PrivateLinkAttachmentState : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        private InputList<Inputs.PrivateLinkAttachmentAwGetArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public InputList<Inputs.PrivateLinkAttachmentAwGetArgs> Aws
        {
            get => _aws ?? (_aws = new InputList<Inputs.PrivateLinkAttachmentAwGetArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private InputList<Inputs.PrivateLinkAttachmentAzureGetArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// - `private_link_service_alias ` - (Required String) Azure Private Link service alias for the availability zone.
        /// </summary>
        public InputList<Inputs.PrivateLinkAttachmentAzureGetArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.PrivateLinkAttachmentAzureGetArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// The cloud service provider that hosts the resources to access with the Private Link Attachment.
        /// </summary>
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// The name of the Private Link Attachment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
        /// </summary>
        [Input("dnsDomain")]
        public Input<string>? DnsDomain { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.PrivateLinkAttachmentEnvironmentGetArgs>? Environment { get; set; }

        [Input("gcps")]
        private InputList<Inputs.PrivateLinkAttachmentGcpGetArgs>? _gcps;
        public InputList<Inputs.PrivateLinkAttachmentGcpGetArgs> Gcps
        {
            get => _gcps ?? (_gcps = new InputList<Inputs.PrivateLinkAttachmentGcpGetArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        public PrivateLinkAttachmentState()
        {
        }
        public static new PrivateLinkAttachmentState Empty => new PrivateLinkAttachmentState();
    }
}
