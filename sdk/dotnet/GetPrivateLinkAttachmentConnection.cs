// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetPrivateLinkAttachmentConnection
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.
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
        ///     var main = ConfluentCloud.GetPrivateLinkAttachmentConnection.Invoke(new()
        ///     {
        ///         Id = "plattc-p5j3ov",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAttachmentConnectionEnvironmentInputArgs
        ///         {
        ///             Id = "env-8gv0v5",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["plattc"] = main,
        ///     };
        /// });
        /// ```
        /// 
        /// 
        /// ## Getting Started
        /// 
        /// The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAttachmentConnection` data source:
        /// * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        /// * `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
        /// </summary>
        public static Task<GetPrivateLinkAttachmentConnectionResult> InvokeAsync(GetPrivateLinkAttachmentConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateLinkAttachmentConnectionResult>("confluentcloud:index/getPrivateLinkAttachmentConnection:getPrivateLinkAttachmentConnection", args ?? new GetPrivateLinkAttachmentConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.
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
        ///     var main = ConfluentCloud.GetPrivateLinkAttachmentConnection.Invoke(new()
        ///     {
        ///         Id = "plattc-p5j3ov",
        ///         Environment = new ConfluentCloud.Inputs.GetPrivateLinkAttachmentConnectionEnvironmentInputArgs
        ///         {
        ///             Id = "env-8gv0v5",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["plattc"] = main,
        ///     };
        /// });
        /// ```
        /// 
        /// 
        /// ## Getting Started
        /// 
        /// The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAttachmentConnection` data source:
        /// * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
        /// * `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
        /// </summary>
        public static Output<GetPrivateLinkAttachmentConnectionResult> Invoke(GetPrivateLinkAttachmentConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateLinkAttachmentConnectionResult>("confluentcloud:index/getPrivateLinkAttachmentConnection:getPrivateLinkAttachmentConnection", args ?? new GetPrivateLinkAttachmentConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateLinkAttachmentConnectionArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Inputs.GetPrivateLinkAttachmentConnectionEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetPrivateLinkAttachmentConnectionArgs()
        {
        }
        public static new GetPrivateLinkAttachmentConnectionArgs Empty => new GetPrivateLinkAttachmentConnectionArgs();
    }

    public sealed class GetPrivateLinkAttachmentConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("environment", required: true)]
        public Input<Inputs.GetPrivateLinkAttachmentConnectionEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetPrivateLinkAttachmentConnectionInvokeArgs()
        {
        }
        public static new GetPrivateLinkAttachmentConnectionInvokeArgs Empty => new GetPrivateLinkAttachmentConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivateLinkAttachmentConnectionResult
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionAwResult> Aws;
        /// <summary>
        /// (Optional Configuration Blocks) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionAzureResult> Azures;
        /// <summary>
        /// (Optional String) The name of the Private Link Attachment Connection.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetPrivateLinkAttachmentConnectionEnvironmentResult Environment;
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionGcpResult> Gcps;
        /// <summary>
        /// (Required String) The unique identifier for the private link attachment.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentResult> PrivateLinkAttachments;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetPrivateLinkAttachmentConnectionResult(
            ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionAwResult> aws,

            ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionAzureResult> azures,

            string displayName,

            Outputs.GetPrivateLinkAttachmentConnectionEnvironmentResult environment,

            ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionGcpResult> gcps,

            string id,

            ImmutableArray<Outputs.GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentResult> privateLinkAttachments,

            string resourceName)
        {
            Aws = aws;
            Azures = azures;
            DisplayName = displayName;
            Environment = environment;
            Gcps = gcps;
            Id = id;
            PrivateLinkAttachments = privateLinkAttachments;
            ResourceName = resourceName;
        }
    }
}
