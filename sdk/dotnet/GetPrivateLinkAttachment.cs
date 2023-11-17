// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetPrivateLinkAttachment
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAttachment` describes a Private Link Attachment data source.
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
        ///     var main = ConfluentCloud.GetPrivateLinkAttachment.Invoke(new()
        ///     {
        ///         Id = "platt-abcde",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["platt"] = main,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivateLinkAttachmentResult> InvokeAsync(GetPrivateLinkAttachmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLinkAttachmentResult>("confluentcloud:index/getPrivateLinkAttachment:getPrivateLinkAttachment", args ?? new GetPrivateLinkAttachmentArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAttachment` describes a Private Link Attachment data source.
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
        ///     var main = ConfluentCloud.GetPrivateLinkAttachment.Invoke(new()
        ///     {
        ///         Id = "platt-abcde",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAttachmentEnvironmentInputArgs
        ///         {
        ///             Id = "env-1234",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["platt"] = main,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrivateLinkAttachmentResult> Invoke(GetPrivateLinkAttachmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLinkAttachmentResult>("confluentcloud:index/getPrivateLinkAttachment:getPrivateLinkAttachment", args ?? new GetPrivateLinkAttachmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLinkAttachmentArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Inputs.GetPrivateLinkAttachmentEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Private Link Attachment, for example, `platt-61ovvd`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetPrivateLinkAttachmentArgs()
        {
        }
        public static new GetPrivateLinkAttachmentArgs Empty => new GetPrivateLinkAttachmentArgs();
    }

    public sealed class GetPrivateLinkAttachmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Input<Inputs.GetPrivateLinkAttachmentEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Private Link Attachment, for example, `platt-61ovvd`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetPrivateLinkAttachmentInvokeArgs()
        {
        }
        public static new GetPrivateLinkAttachmentInvokeArgs Empty => new GetPrivateLinkAttachmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivateLinkAttachmentResult
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentAwResult> Aws;
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentAzureResult> Azures;
        /// <summary>
        /// (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Optional String) The name of the Private Link Attachment.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
        /// </summary>
        public readonly string DnsDomain;
        public readonly Outputs.GetPrivateLinkAttachmentEnvironmentResult Environment;
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentGcpResult> Gcps;
        public readonly string Id;
        /// <summary>
        /// (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetPrivateLinkAttachmentResult(
            ImmutableArray<Outputs.GetPrivateLinkAttachmentAwResult> aws,

            ImmutableArray<Outputs.GetPrivateLinkAttachmentAzureResult> azures,

            string cloud,

            string displayName,

            string dnsDomain,

            Outputs.GetPrivateLinkAttachmentEnvironmentResult environment,

            ImmutableArray<Outputs.GetPrivateLinkAttachmentGcpResult> gcps,

            string id,

            string region,

            string resourceName)
        {
            Aws = aws;
            Azures = azures;
            Cloud = cloud;
            DisplayName = displayName;
            DnsDomain = dnsDomain;
            Environment = environment;
            Gcps = gcps;
            Id = id;
            Region = region;
            ResourceName = resourceName;
        }
    }
}
