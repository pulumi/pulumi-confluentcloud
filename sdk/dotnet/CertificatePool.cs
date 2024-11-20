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
    /// `confluentcloud.CertificatePool` provides a Certificate Pool resource that enables creating, editing, and deleting Certificate Pools on Confluent Cloud.
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
    ///     var main = new ConfluentCloud.CertificatePool("main", new()
    ///     {
    ///         CertificateAuthority = new ConfluentCloud.Inputs.CertificatePoolCertificateAuthorityArgs
    ///         {
    ///             Id = mainConfluentCertificateAuthority.Id,
    ///         },
    ///         DisplayName = "my-certificate-pool",
    ///         Description = "example description",
    ///         ExternalIdentifier = "CN",
    ///         Filter = "CN == \"test\"",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Certificate Pool by using Certificate Authority ID and Certificate Pool ID, in the format `&lt;Certificate Authority ID&gt;/&lt;Certificate Pool ID&gt;`. The following example shows how to import a Certificate Pool:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/certificatePool:CertificatePool main op-abc123/pool-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/certificatePool:CertificatePool")]
    public partial class CertificatePool : global::Pulumi.CustomResource
    {
        [Output("certificateAuthority")]
        public Output<Outputs.CertificatePoolCertificateAuthority> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// A description of the Certificate Pool.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the Certificate Pool.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The certificate field that will be used to represent the pool's external identity for audit logging.
        /// </summary>
        [Output("externalIdentifier")]
        public Output<string> ExternalIdentifier { get; private set; } = null!;

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
        /// </summary>
        [Output("filter")]
        public Output<string> Filter { get; private set; } = null!;


        /// <summary>
        /// Create a CertificatePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertificatePool(string name, CertificatePoolArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/certificatePool:CertificatePool", name, args ?? new CertificatePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertificatePool(string name, Input<string> id, CertificatePoolState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/certificatePool:CertificatePool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CertificatePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertificatePool Get(string name, Input<string> id, CertificatePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new CertificatePool(name, id, state, options);
        }
    }

    public sealed class CertificatePoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateAuthority", required: true)]
        public Input<Inputs.CertificatePoolCertificateAuthorityArgs> CertificateAuthority { get; set; } = null!;

        /// <summary>
        /// A description of the Certificate Pool.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The name of the Certificate Pool.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The certificate field that will be used to represent the pool's external identity for audit logging.
        /// </summary>
        [Input("externalIdentifier", required: true)]
        public Input<string> ExternalIdentifier { get; set; } = null!;

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        public CertificatePoolArgs()
        {
        }
        public static new CertificatePoolArgs Empty => new CertificatePoolArgs();
    }

    public sealed class CertificatePoolState : global::Pulumi.ResourceArgs
    {
        [Input("certificateAuthority")]
        public Input<Inputs.CertificatePoolCertificateAuthorityGetArgs>? CertificateAuthority { get; set; }

        /// <summary>
        /// A description of the Certificate Pool.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Certificate Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The certificate field that will be used to represent the pool's external identity for audit logging.
        /// </summary>
        [Input("externalIdentifier")]
        public Input<string>? ExternalIdentifier { get; set; }

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        public CertificatePoolState()
        {
        }
        public static new CertificatePoolState Empty => new CertificatePoolState();
    }
}
