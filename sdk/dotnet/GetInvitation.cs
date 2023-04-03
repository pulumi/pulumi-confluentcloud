// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetInvitation
    {
        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.Invitation` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.Invitation` describes an Invitation data source.
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
        ///     var main = ConfluentCloud.GetInvitation.Invoke(new()
        ///     {
        ///         Id = "i-gxxn1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["invitation"] = main,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInvitationResult> InvokeAsync(GetInvitationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInvitationResult>("confluentcloud:index/getInvitation:getInvitation", args ?? new GetInvitationArgs(), options.WithDefaults());

        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.Invitation` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.Invitation` describes an Invitation data source.
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
        ///     var main = ConfluentCloud.GetInvitation.Invoke(new()
        ///     {
        ///         Id = "i-gxxn1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["invitation"] = main,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInvitationResult> Invoke(GetInvitationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInvitationResult>("confluentcloud:index/getInvitation:getInvitation", args ?? new GetInvitationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInvitationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Invitation, for example, `i-zyw30`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetInvitationArgs()
        {
        }
        public static new GetInvitationArgs Empty => new GetInvitationArgs();
    }

    public sealed class GetInvitationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Invitation, for example, `i-zyw30`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetInvitationInvokeArgs()
        {
        }
        public static new GetInvitationInvokeArgs Empty => new GetInvitationInvokeArgs();
    }


    [OutputType]
    public sealed class GetInvitationResult
    {
        /// <summary>
        /// (Optional String) The timestamp that the invitation was accepted.
        /// </summary>
        public readonly string AcceptedAt;
        /// <summary>
        /// (Optional String) Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite AUTH_TYPE_LOCAL users to SSO organizations. The user's auth_type is set as AUTH_TYPE_SSO by default if the organization has SSO enabled. Otherwise, the user's auth_type is AUTH_TYPE_LOCAL by default.
        /// </summary>
        public readonly string AuthType;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInvitationCreatorResult> Creators;
        /// <summary>
        /// (Required String) The user/invitee's email address.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// (Optional String) The timestamp that the invitation will expire.
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// (Required String) The id of invitation creator.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInvitationUserResult> Users;

        [OutputConstructor]
        private GetInvitationResult(
            string acceptedAt,

            string authType,

            ImmutableArray<Outputs.GetInvitationCreatorResult> creators,

            string email,

            string expiresAt,

            string id,

            string status,

            ImmutableArray<Outputs.GetInvitationUserResult> users)
        {
            AcceptedAt = acceptedAt;
            AuthType = authType;
            Creators = creators;
            Email = email;
            ExpiresAt = expiresAt;
            Id = id;
            Status = status;
            Users = users;
        }
    }
}