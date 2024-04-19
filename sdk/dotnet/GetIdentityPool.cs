// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetIdentityPool
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.IdentityPool` describes an Identity Pool data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetIdentityPool.Invoke(new()
        ///     {
        ///         Id = "pool-xyz456",
        ///         IdentityProvider = new ConfluentCloud.Inputs.GetIdentityPoolIdentityProviderInputArgs
        ///         {
        ///             Id = "op-abc123",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetIdentityPool.Invoke(new()
        ///     {
        ///         DisplayName = "My Identity Pool",
        ///         IdentityProvider = new ConfluentCloud.Inputs.GetIdentityPoolIdentityProviderInputArgs
        ///         {
        ///             Id = "op-abc123",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetIdentityPoolResult> InvokeAsync(GetIdentityPoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIdentityPoolResult>("confluentcloud:index/getIdentityPool:getIdentityPool", args ?? new GetIdentityPoolArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.IdentityPool` describes an Identity Pool data source.
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
        ///     var exampleUsingId = ConfluentCloud.GetIdentityPool.Invoke(new()
        ///     {
        ///         Id = "pool-xyz456",
        ///         IdentityProvider = new ConfluentCloud.Inputs.GetIdentityPoolIdentityProviderInputArgs
        ///         {
        ///             Id = "op-abc123",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetIdentityPool.Invoke(new()
        ///     {
        ///         DisplayName = "My Identity Pool",
        ///         IdentityProvider = new ConfluentCloud.Inputs.GetIdentityPoolIdentityProviderInputArgs
        ///         {
        ///             Id = "op-abc123",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetIdentityPoolResult> Invoke(GetIdentityPoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIdentityPoolResult>("confluentcloud:index/getIdentityPool:getIdentityPool", args ?? new GetIdentityPoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIdentityPoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Identity Pool.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("identityProvider", required: true)]
        public Inputs.GetIdentityPoolIdentityProviderArgs IdentityProvider { get; set; } = null!;

        public GetIdentityPoolArgs()
        {
        }
        public static new GetIdentityPoolArgs Empty => new GetIdentityPoolArgs();
    }

    public sealed class GetIdentityPoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Identity Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Input("identityProvider", required: true)]
        public Input<Inputs.GetIdentityPoolIdentityProviderInputArgs> IdentityProvider { get; set; } = null!;

        public GetIdentityPoolInvokeArgs()
        {
        }
        public static new GetIdentityPoolInvokeArgs Empty => new GetIdentityPoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetIdentityPoolResult
    {
        /// <summary>
        /// (Required String) A description for the Identity Pool.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Required String) A human-readable name for the Identity Pool.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
        /// </summary>
        public readonly string Filter;
        /// <summary>
        /// (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
        /// </summary>
        public readonly string IdentityClaim;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly Outputs.GetIdentityPoolIdentityProviderResult IdentityProvider;

        [OutputConstructor]
        private GetIdentityPoolResult(
            string description,

            string displayName,

            string filter,

            string id,

            string identityClaim,

            Outputs.GetIdentityPoolIdentityProviderResult identityProvider)
        {
            Description = description;
            DisplayName = displayName;
            Filter = filter;
            Id = id;
            IdentityClaim = identityClaim;
            IdentityProvider = identityProvider;
        }
    }
}
