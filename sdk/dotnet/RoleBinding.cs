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
    /// `confluentcloud.RoleBinding` provides a Role Binding resource that enables creating, reading, and deleting role bindings on Confluent Cloud.
    /// 
    /// &gt; **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).
    /// 
    /// ## Import
    /// 
    /// You can import a Role Binding by using Role Binding ID, for example:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/roleBinding:RoleBinding my_rb rb-f3a90de
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/roleBinding:RoleBinding")]
    public partial class RoleBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        /// </summary>
        [Output("crnPattern")]
        public Output<string> CrnPattern { get; private set; } = null!;

        /// <summary>
        /// A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        /// </summary>
        [Output("principal")]
        public Output<string> Principal { get; private set; } = null!;

        /// <summary>
        /// A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;


        /// <summary>
        /// Create a RoleBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleBinding(string name, RoleBindingArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/roleBinding:RoleBinding", name, args ?? new RoleBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleBinding(string name, Input<string> id, RoleBindingState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/roleBinding:RoleBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleBinding Get(string name, Input<string> id, RoleBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleBinding(name, id, state, options);
        }
    }

    public sealed class RoleBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        /// </summary>
        [Input("crnPattern", required: true)]
        public Input<string> CrnPattern { get; set; } = null!;

        /// <summary>
        /// A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        /// <summary>
        /// A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public RoleBindingArgs()
        {
        }
        public static new RoleBindingArgs Empty => new RoleBindingArgs();
    }

    public sealed class RoleBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        /// </summary>
        [Input("crnPattern")]
        public Input<string>? CrnPattern { get; set; }

        /// <summary>
        /// A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        /// <summary>
        /// A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        public RoleBindingState()
        {
        }
        public static new RoleBindingState Empty => new RoleBindingState();
    }
}
