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
    /// [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    /// 
    /// `confluentcloud.CertificateAuthority` provides a Certificate Authority resource that enables creating, editing, and deleting Certificate Authorities on Confluent Cloud.
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
    ///     var main = new ConfluentCloud.CertificateAuthority("main", new()
    ///     {
    ///         DisplayName = "my_certificate_authority",
    ///         Description = "description",
    ///         CertificateChainFilename = "certificate.pem",
    ///         CertificateChain = "***REDACTED***",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Certificate Authority by using Certificate Authority ID, for example:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/certificateAuthority:CertificateAuthority main op-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/certificateAuthority:CertificateAuthority")]
    public partial class CertificateAuthority : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A base64 encoded string containing the signing certificate chain.
        /// </summary>
        [Output("certificateChain")]
        public Output<string> CertificateChain { get; private set; } = null!;

        /// <summary>
        /// The name of the certificate file.
        /// </summary>
        [Output("certificateChainFilename")]
        public Output<string> CertificateChainFilename { get; private set; } = null!;

        /// <summary>
        /// A base64 encoded string containing the CRL for this certificate authority.
        /// </summary>
        [Output("crlChain")]
        public Output<string?> CrlChain { get; private set; } = null!;

        /// <summary>
        /// (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        /// </summary>
        [Output("crlSource")]
        public Output<string> CrlSource { get; private set; } = null!;

        /// <summary>
        /// (Optional String) The timestamp for when CRL was last updated.
        /// </summary>
        [Output("crlUpdatedAt")]
        public Output<string> CrlUpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The url from which to fetch the CRL for the certificate authority.
        /// </summary>
        [Output("crlUrl")]
        public Output<string?> CrlUrl { get; private set; } = null!;

        /// <summary>
        /// A description of the Certificate Authority.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the Certificate Authority.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// (Required List of Strings) The expiration dates of certificates in the chain.
        /// </summary>
        [Output("expirationDates")]
        public Output<ImmutableArray<string>> ExpirationDates { get; private set; } = null!;

        /// <summary>
        /// (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        /// </summary>
        [Output("fingerprints")]
        public Output<ImmutableArray<string>> Fingerprints { get; private set; } = null!;

        /// <summary>
        /// (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        /// </summary>
        [Output("serialNumbers")]
        public Output<ImmutableArray<string>> SerialNumbers { get; private set; } = null!;


        /// <summary>
        /// Create a CertificateAuthority resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertificateAuthority(string name, CertificateAuthorityArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/certificateAuthority:CertificateAuthority", name, args ?? new CertificateAuthorityArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertificateAuthority(string name, Input<string> id, CertificateAuthorityState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/certificateAuthority:CertificateAuthority", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "certificateChain",
                    "crlChain",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertificateAuthority Get(string name, Input<string> id, CertificateAuthorityState? state = null, CustomResourceOptions? options = null)
        {
            return new CertificateAuthority(name, id, state, options);
        }
    }

    public sealed class CertificateAuthorityArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateChain", required: true)]
        private Input<string>? _certificateChain;

        /// <summary>
        /// A base64 encoded string containing the signing certificate chain.
        /// </summary>
        public Input<string>? CertificateChain
        {
            get => _certificateChain;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificateChain = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the certificate file.
        /// </summary>
        [Input("certificateChainFilename", required: true)]
        public Input<string> CertificateChainFilename { get; set; } = null!;

        [Input("crlChain")]
        private Input<string>? _crlChain;

        /// <summary>
        /// A base64 encoded string containing the CRL for this certificate authority.
        /// </summary>
        public Input<string>? CrlChain
        {
            get => _crlChain;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _crlChain = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The url from which to fetch the CRL for the certificate authority.
        /// </summary>
        [Input("crlUrl")]
        public Input<string>? CrlUrl { get; set; }

        /// <summary>
        /// A description of the Certificate Authority.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The name of the Certificate Authority.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        public CertificateAuthorityArgs()
        {
        }
        public static new CertificateAuthorityArgs Empty => new CertificateAuthorityArgs();
    }

    public sealed class CertificateAuthorityState : global::Pulumi.ResourceArgs
    {
        [Input("certificateChain")]
        private Input<string>? _certificateChain;

        /// <summary>
        /// A base64 encoded string containing the signing certificate chain.
        /// </summary>
        public Input<string>? CertificateChain
        {
            get => _certificateChain;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificateChain = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the certificate file.
        /// </summary>
        [Input("certificateChainFilename")]
        public Input<string>? CertificateChainFilename { get; set; }

        [Input("crlChain")]
        private Input<string>? _crlChain;

        /// <summary>
        /// A base64 encoded string containing the CRL for this certificate authority.
        /// </summary>
        public Input<string>? CrlChain
        {
            get => _crlChain;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _crlChain = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
        /// </summary>
        [Input("crlSource")]
        public Input<string>? CrlSource { get; set; }

        /// <summary>
        /// (Optional String) The timestamp for when CRL was last updated.
        /// </summary>
        [Input("crlUpdatedAt")]
        public Input<string>? CrlUpdatedAt { get; set; }

        /// <summary>
        /// The url from which to fetch the CRL for the certificate authority.
        /// </summary>
        [Input("crlUrl")]
        public Input<string>? CrlUrl { get; set; }

        /// <summary>
        /// A description of the Certificate Authority.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Certificate Authority.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("expirationDates")]
        private InputList<string>? _expirationDates;

        /// <summary>
        /// (Required List of Strings) The expiration dates of certificates in the chain.
        /// </summary>
        public InputList<string> ExpirationDates
        {
            get => _expirationDates ?? (_expirationDates = new InputList<string>());
            set => _expirationDates = value;
        }

        [Input("fingerprints")]
        private InputList<string>? _fingerprints;

        /// <summary>
        /// (Required List of Strings) The fingerprints for each certificate in the certificate chain.
        /// </summary>
        public InputList<string> Fingerprints
        {
            get => _fingerprints ?? (_fingerprints = new InputList<string>());
            set => _fingerprints = value;
        }

        [Input("serialNumbers")]
        private InputList<string>? _serialNumbers;

        /// <summary>
        /// (Required List of Strings) The serial numbers for each certificate in the certificate chain.
        /// </summary>
        public InputList<string> SerialNumbers
        {
            get => _serialNumbers ?? (_serialNumbers = new InputList<string>());
            set => _serialNumbers = value;
        }

        public CertificateAuthorityState()
        {
        }
        public static new CertificateAuthorityState Empty => new CertificateAuthorityState();
    }
}
