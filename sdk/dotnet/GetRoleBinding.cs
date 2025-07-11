// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetRoleBinding
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.RoleBinding` describes a Role Binding.
        /// 
        /// &gt; **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).
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
        ///     var example = ConfluentCloud.GetRoleBinding.Invoke(new()
        ///     {
        ///         Id = "rb-abc123",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRoleBindingResult> InvokeAsync(GetRoleBindingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRoleBindingResult>("confluentcloud:index/getRoleBinding:getRoleBinding", args ?? new GetRoleBindingArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.RoleBinding` describes a Role Binding.
        /// 
        /// &gt; **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).
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
        ///     var example = ConfluentCloud.GetRoleBinding.Invoke(new()
        ///     {
        ///         Id = "rb-abc123",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRoleBindingResult> Invoke(GetRoleBindingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRoleBindingResult>("confluentcloud:index/getRoleBinding:getRoleBinding", args ?? new GetRoleBindingInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.RoleBinding` describes a Role Binding.
        /// 
        /// &gt; **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).
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
        ///     var example = ConfluentCloud.GetRoleBinding.Invoke(new()
        ///     {
        ///         Id = "rb-abc123",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRoleBindingResult> Invoke(GetRoleBindingInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRoleBindingResult>("confluentcloud:index/getRoleBinding:getRoleBinding", args ?? new GetRoleBindingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRoleBindingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Role Binding (for example, `rb-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetRoleBindingArgs()
        {
        }
        public static new GetRoleBindingArgs Empty => new GetRoleBindingArgs();
    }

    public sealed class GetRoleBindingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Role Binding (for example, `rb-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetRoleBindingInvokeArgs()
        {
        }
        public static new GetRoleBindingInvokeArgs Empty => new GetRoleBindingInvokeArgs();
    }


    [OutputType]
    public sealed class GetRoleBindingResult
    {
        /// <summary>
        /// (Required String) A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
        /// </summary>
        public readonly string CrnPattern;
        public readonly string Id;
        /// <summary>
        /// (Required String) A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
        /// </summary>
        public readonly string Principal;
        /// <summary>
        /// (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
        /// </summary>
        public readonly string RoleName;

        [OutputConstructor]
        private GetRoleBindingResult(
            string crnPattern,

            string id,

            string principal,

            string roleName)
        {
            CrnPattern = crnPattern;
            Id = id;
            Principal = principal;
            RoleName = roleName;
        }
    }
}
