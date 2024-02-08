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
    /// `confluentcloud.Invitation` provides an invitation resource that enables creating, reading, and deleting invitation on Confluent Cloud.
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
    ///     var main = new ConfluentCloud.Invitation("main", new()
    ///     {
    ///         Email = "",
    ///     });
    /// 
    ///     var main2 = new ConfluentCloud.Invitation("main2", new()
    ///     {
    ///         AuthType = "AUTH_TYPE_LOCAL",
    ///         Email = "",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import an Invitation by using Invitation ID, for example:
    /// 
    ///  $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    ///  $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/invitation:Invitation main i-gxxn1
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/invitation:Invitation")]
    public partial class Invitation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional String) The timestamp that the invitation was accepted.
        /// </summary>
        [Output("acceptedAt")]
        public Output<string> AcceptedAt { get; private set; } = null!;

        /// <summary>
        /// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's auth_type is `AUTH_TYPE_LOCAL` by default.
        /// </summary>
        [Output("authType")]
        public Output<string> AuthType { get; private set; } = null!;

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Output("creators")]
        public Output<ImmutableArray<Outputs.InvitationCreator>> Creators { get; private set; } = null!;

        /// <summary>
        /// The user/invitee's email address.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// (Optional String) The timestamp that the invitation will expire.
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<Outputs.InvitationUser>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a Invitation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Invitation(string name, InvitationArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/invitation:Invitation", name, args ?? new InvitationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Invitation(string name, Input<string> id, InvitationState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/invitation:Invitation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Invitation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Invitation Get(string name, Input<string> id, InvitationState? state = null, CustomResourceOptions? options = null)
        {
            return new Invitation(name, id, state, options);
        }
    }

    public sealed class InvitationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's auth_type is `AUTH_TYPE_LOCAL` by default.
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        /// <summary>
        /// The user/invitee's email address.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        public InvitationArgs()
        {
        }
        public static new InvitationArgs Empty => new InvitationArgs();
    }

    public sealed class InvitationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional String) The timestamp that the invitation was accepted.
        /// </summary>
        [Input("acceptedAt")]
        public Input<string>? AcceptedAt { get; set; }

        /// <summary>
        /// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's auth_type is `AUTH_TYPE_LOCAL` by default.
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("creators")]
        private InputList<Inputs.InvitationCreatorGetArgs>? _creators;

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public InputList<Inputs.InvitationCreatorGetArgs> Creators
        {
            get => _creators ?? (_creators = new InputList<Inputs.InvitationCreatorGetArgs>());
            set => _creators = value;
        }

        /// <summary>
        /// The user/invitee's email address.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// (Optional String) The timestamp that the invitation will expire.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("users")]
        private InputList<Inputs.InvitationUserGetArgs>? _users;

        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public InputList<Inputs.InvitationUserGetArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.InvitationUserGetArgs>());
            set => _users = value;
        }

        public InvitationState()
        {
        }
        public static new InvitationState Empty => new InvitationState();
    }
}
