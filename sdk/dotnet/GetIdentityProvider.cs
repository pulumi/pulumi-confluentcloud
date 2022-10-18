// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetIdentityProvider
    {
        /// <summary>
        /// [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To OAuth API](https://img.shields.io/badge/-Request%20Access%20To%20OAuth%20API-%23bc8540)](mailto:ccloud-api-access+iam-v2-closed-preview@confluent.io?subject=Request%20to%20join%20OAuth%20API%20Closed%20Preview&amp;body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Closed%20Preview%20for%20iam/v2%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
        /// 
        /// `confluentcloud.IdentityProvider` describes an Identity Provider data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingIdIdentityProvider = ConfluentCloud.GetIdentityProvider.Invoke(new()
        ///     {
        ///         Id = "op-abc123",
        ///     });
        /// 
        ///     var exampleUsingNameIdentityProvider = ConfluentCloud.GetIdentityProvider.Invoke(new()
        ///     {
        ///         DisplayName = "My OIDC Provider: Azure AD",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdIdentityProvider.Apply(getIdentityProviderResult =&gt; getIdentityProviderResult),
        ///         ["exampleUsingName"] = exampleUsingNameIdentityProvider.Apply(getIdentityProviderResult =&gt; getIdentityProviderResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIdentityProviderResult> InvokeAsync(GetIdentityProviderArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIdentityProviderResult>("confluentcloud:index/getIdentityProvider:getIdentityProvider", args ?? new GetIdentityProviderArgs(), options.WithDefaults());

        /// <summary>
        /// [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To OAuth API](https://img.shields.io/badge/-Request%20Access%20To%20OAuth%20API-%23bc8540)](mailto:ccloud-api-access+iam-v2-closed-preview@confluent.io?subject=Request%20to%20join%20OAuth%20API%20Closed%20Preview&amp;body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Closed%20Preview%20for%20iam/v2%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
        /// 
        /// `confluentcloud.IdentityProvider` describes an Identity Provider data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingIdIdentityProvider = ConfluentCloud.GetIdentityProvider.Invoke(new()
        ///     {
        ///         Id = "op-abc123",
        ///     });
        /// 
        ///     var exampleUsingNameIdentityProvider = ConfluentCloud.GetIdentityProvider.Invoke(new()
        ///     {
        ///         DisplayName = "My OIDC Provider: Azure AD",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdIdentityProvider.Apply(getIdentityProviderResult =&gt; getIdentityProviderResult),
        ///         ["exampleUsingName"] = exampleUsingNameIdentityProvider.Apply(getIdentityProviderResult =&gt; getIdentityProviderResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIdentityProviderResult> Invoke(GetIdentityProviderInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIdentityProviderResult>("confluentcloud:index/getIdentityProvider:getIdentityProvider", args ?? new GetIdentityProviderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIdentityProviderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Identity Provider.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Identity Provider, for example, `op-abc123`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetIdentityProviderArgs()
        {
        }
        public static new GetIdentityProviderArgs Empty => new GetIdentityProviderArgs();
    }

    public sealed class GetIdentityProviderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Identity Provider.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Identity Provider, for example, `op-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetIdentityProviderInvokeArgs()
        {
        }
        public static new GetIdentityProviderInvokeArgs Empty => new GetIdentityProviderInvokeArgs();
    }


    [OutputType]
    public sealed class GetIdentityProviderResult
    {
        /// <summary>
        /// (Required String) A description for the Identity Provider.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Required String) A human-readable name for the Identity Provider.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) The ID of the Identity Provider, for example, `op-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
        /// </summary>
        public readonly string Issuer;
        /// <summary>
        /// (Required String) A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
        /// </summary>
        public readonly string JwksUri;

        [OutputConstructor]
        private GetIdentityProviderResult(
            string description,

            string displayName,

            string id,

            string issuer,

            string jwksUri)
        {
            Description = description;
            DisplayName = displayName;
            Id = id;
            Issuer = issuer;
            JwksUri = jwksUri;
        }
    }
}
