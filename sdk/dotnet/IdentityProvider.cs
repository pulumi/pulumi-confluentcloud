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
    /// `confluentcloud.IdentityProvider` provides an Identity Provider resource that enables creating, editing, and deleting identity providers on Confluent Cloud.
    /// 
    /// ## Example Usage
    /// 
    /// ### Example Identity Provider: Azure AD
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var azure = new ConfluentCloud.IdentityProvider("azure", new()
    ///     {
    ///         DisplayName = "My OIDC Provider: Azure AD",
    ///         Description = "My description",
    ///         Issuer = "https://login.microsoftonline.com/{tenant_id}/v2.0",
    ///         JwksUri = "https://login.microsoftonline.com/common/discovery/v2.0/keys",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Identity Provider: Okta
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var okta = new ConfluentCloud.IdentityProvider("okta", new()
    ///     {
    ///         DisplayName = "My OIDC Provider: Okta",
    ///         Description = "My description",
    ///         Issuer = "https://mycompany.okta.com/oauth2/default",
    ///         JwksUri = "https://mycompany.okta.com/oauth2/default/v1/keys",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## External Documentation
    /// 
    /// * [Authenticating with OAuth](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/overview.html).
    /// 
    /// ## Import
    /// 
    /// You can import an Identity Provider by using Identity Provider ID, for example:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/identityProvider:IdentityProvider example op-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/identityProvider:IdentityProvider")]
    public partial class IdentityProvider : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A description for the Identity Provider.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A human-readable name for the Identity Provider.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
        /// 
        /// &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
        /// 
        /// &gt; **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
        /// </summary>
        [Output("identityClaim")]
        public Output<string?> IdentityClaim { get; private set; } = null!;

        /// <summary>
        /// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
        /// </summary>
        [Output("jwksUri")]
        public Output<string> JwksUri { get; private set; } = null!;


        /// <summary>
        /// Create a IdentityProvider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IdentityProvider(string name, IdentityProviderArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/identityProvider:IdentityProvider", name, args ?? new IdentityProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IdentityProvider(string name, Input<string> id, IdentityProviderState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/identityProvider:IdentityProvider", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IdentityProvider Get(string name, Input<string> id, IdentityProviderState? state = null, CustomResourceOptions? options = null)
        {
            return new IdentityProvider(name, id, state, options);
        }
    }

    public sealed class IdentityProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the Identity Provider.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// A human-readable name for the Identity Provider.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
        /// 
        /// &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
        /// 
        /// &gt; **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
        /// </summary>
        [Input("identityClaim")]
        public Input<string>? IdentityClaim { get; set; }

        /// <summary>
        /// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
        /// </summary>
        [Input("issuer", required: true)]
        public Input<string> Issuer { get; set; } = null!;

        /// <summary>
        /// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
        /// </summary>
        [Input("jwksUri", required: true)]
        public Input<string> JwksUri { get; set; } = null!;

        public IdentityProviderArgs()
        {
        }
        public static new IdentityProviderArgs Empty => new IdentityProviderArgs();
    }

    public sealed class IdentityProviderState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the Identity Provider.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A human-readable name for the Identity Provider.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
        /// 
        /// &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
        /// 
        /// &gt; **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
        /// </summary>
        [Input("identityClaim")]
        public Input<string>? IdentityClaim { get; set; }

        /// <summary>
        /// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
        /// </summary>
        [Input("jwksUri")]
        public Input<string>? JwksUri { get; set; }

        public IdentityProviderState()
        {
        }
        public static new IdentityProviderState Empty => new IdentityProviderState();
    }
}
