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
    /// `confluentcloud.IdentityPool` provides an Identity Pool resource that enables creating, editing, and deleting identity pools on Confluent Cloud.
    /// 
    /// ## Example Usage
    /// ### Example Identity Pool to be used with Azure AD
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
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
    ///     var example = new ConfluentCloud.IdentityPool("example", new()
    ///     {
    ///         IdentityProvider = new ConfluentCloud.Inputs.IdentityPoolIdentityProviderArgs
    ///         {
    ///             Id = azure.Id,
    ///         },
    ///         DisplayName = "My Identity Pool",
    ///         Description = "Prod Access to Kafka clusters to Release Engineering",
    ///         IdentityClaim = "claims.sub",
    ///         Filter = "claims.aud==\"confluent\" &amp;&amp; claims.group!=\"invalid_group\"",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Identity Pool to be used with Okta
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
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
    ///     var example = new ConfluentCloud.IdentityPool("example", new()
    ///     {
    ///         IdentityProvider = new ConfluentCloud.Inputs.IdentityPoolIdentityProviderArgs
    ///         {
    ///             Id = okta.Id,
    ///         },
    ///         DisplayName = "My Identity Pool",
    ///         Description = "Prod Access to Kafka clusters to Release Engineering",
    ///         IdentityClaim = "claims.sub",
    ///         Filter = "claims.aud==\"confluent\" &amp;&amp; claims.group!=\"invalid_group\"",
    ///     });
    /// 
    /// });
    /// ```
    /// ## External Documentation
    /// 
    /// * [Use identity pools with your OAuth provider](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html).
    /// 
    /// ## Import
    /// 
    /// You can import an Identity Pool by using Identity Provider ID and Identity Pool ID, in the format `&lt;Identity Provider ID&gt;/&lt;Identity Pool ID&gt;`. The following example shows how to import an Identity Pool$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/identityPool:IdentityPool example op-abc123/pool-xyz456
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/identityPool:IdentityPool")]
    public partial class IdentityPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A description for the Identity Pool.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A human-readable name for the Identity Pool.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
        /// </summary>
        [Output("filter")]
        public Output<string> Filter { get; private set; } = null!;

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
        /// </summary>
        [Output("identityClaim")]
        public Output<string> IdentityClaim { get; private set; } = null!;

        /// <summary>
        /// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
        /// </summary>
        [Output("identityProvider")]
        public Output<Outputs.IdentityPoolIdentityProvider> IdentityProvider { get; private set; } = null!;


        /// <summary>
        /// Create a IdentityPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IdentityPool(string name, IdentityPoolArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/identityPool:IdentityPool", name, args ?? new IdentityPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IdentityPool(string name, Input<string> id, IdentityPoolState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/identityPool:IdentityPool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IdentityPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IdentityPool Get(string name, Input<string> id, IdentityPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new IdentityPool(name, id, state, options);
        }
    }

    public sealed class IdentityPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the Identity Pool.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// A human-readable name for the Identity Pool.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
        /// </summary>
        [Input("identityClaim", required: true)]
        public Input<string> IdentityClaim { get; set; } = null!;

        /// <summary>
        /// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
        /// </summary>
        [Input("identityProvider", required: true)]
        public Input<Inputs.IdentityPoolIdentityProviderArgs> IdentityProvider { get; set; } = null!;

        public IdentityPoolArgs()
        {
        }
        public static new IdentityPoolArgs Empty => new IdentityPoolArgs();
    }

    public sealed class IdentityPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the Identity Pool.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A human-readable name for the Identity Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
        /// </summary>
        [Input("identityClaim")]
        public Input<string>? IdentityClaim { get; set; }

        /// <summary>
        /// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
        /// </summary>
        [Input("identityProvider")]
        public Input<Inputs.IdentityPoolIdentityProviderGetArgs>? IdentityProvider { get; set; }

        public IdentityPoolState()
        {
        }
        public static new IdentityPoolState Empty => new IdentityPoolState();
    }
}
