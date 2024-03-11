// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetTransitGatewayAttachment
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
        /// 
        /// ## Example Usage
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
        ///     var exampleUsingIdTransitGatewayAttachment = ConfluentCloud.GetTransitGatewayAttachment.Invoke(new()
        ///     {
        ///         Id = "tgwa-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetTransitGatewayAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingNameTransitGatewayAttachment = ConfluentCloud.GetTransitGatewayAttachment.Invoke(new()
        ///     {
        ///         DisplayName = "my_tgwa",
        ///         Environment = new ConfluentCloud.Inputs.GetTransitGatewayAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdTransitGatewayAttachment,
        ///         ["exampleUsingName"] = exampleUsingNameTransitGatewayAttachment,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetTransitGatewayAttachmentResult> InvokeAsync(GetTransitGatewayAttachmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransitGatewayAttachmentResult>("confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment", args ?? new GetTransitGatewayAttachmentArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
        /// 
        /// ## Example Usage
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
        ///     var exampleUsingIdTransitGatewayAttachment = ConfluentCloud.GetTransitGatewayAttachment.Invoke(new()
        ///     {
        ///         Id = "tgwa-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetTransitGatewayAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingNameTransitGatewayAttachment = ConfluentCloud.GetTransitGatewayAttachment.Invoke(new()
        ///     {
        ///         DisplayName = "my_tgwa",
        ///         Environment = new ConfluentCloud.Inputs.GetTransitGatewayAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdTransitGatewayAttachment,
        ///         ["exampleUsingName"] = exampleUsingNameTransitGatewayAttachment,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetTransitGatewayAttachmentResult> Invoke(GetTransitGatewayAttachmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitGatewayAttachmentResult>("confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment", args ?? new GetTransitGatewayAttachmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitGatewayAttachmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Transit Gateway Attachment.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Inputs.GetTransitGatewayAttachmentEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetTransitGatewayAttachmentArgs()
        {
        }
        public static new GetTransitGatewayAttachmentArgs Empty => new GetTransitGatewayAttachmentArgs();
    }

    public sealed class GetTransitGatewayAttachmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Transit Gateway Attachment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.GetTransitGatewayAttachmentEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetTransitGatewayAttachmentInvokeArgs()
        {
        }
        public static new GetTransitGatewayAttachmentInvokeArgs Empty => new GetTransitGatewayAttachmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransitGatewayAttachmentResult
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransitGatewayAttachmentAwResult> Aws;
        /// <summary>
        /// (Required String) The name of the Transit Gateway Attachment.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetTransitGatewayAttachmentEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransitGatewayAttachmentNetworkResult> Networks;

        [OutputConstructor]
        private GetTransitGatewayAttachmentResult(
            ImmutableArray<Outputs.GetTransitGatewayAttachmentAwResult> aws,

            string displayName,

            Outputs.GetTransitGatewayAttachmentEnvironmentResult environment,

            string id,

            ImmutableArray<Outputs.GetTransitGatewayAttachmentNetworkResult> networks)
        {
            Aws = aws;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Networks = networks;
        }
    }
}
