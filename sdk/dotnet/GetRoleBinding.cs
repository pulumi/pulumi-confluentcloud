// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.RoleBinding` describes a Role Binding.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleRoleBinding = Output.Create(ConfluentCloud.GetRoleBinding.InvokeAsync(new ConfluentCloud.GetRoleBindingArgs
        ///         {
        ///             Id = "rb-abc123",
        ///         }));
        ///         this.Example = exampleRoleBinding;
        ///     }
        /// 
        ///     [Output("example")]
        ///     public Output&lt;string&gt; Example { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRoleBindingResult> InvokeAsync(GetRoleBindingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRoleBindingResult>("confluentcloud:index/getRoleBinding:getRoleBinding", args ?? new GetRoleBindingArgs(), options.WithDefaults());

        /// <summary>
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.RoleBinding` describes a Role Binding.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleRoleBinding = Output.Create(ConfluentCloud.GetRoleBinding.InvokeAsync(new ConfluentCloud.GetRoleBindingArgs
        ///         {
        ///             Id = "rb-abc123",
        ///         }));
        ///         this.Example = exampleRoleBinding;
        ///     }
        /// 
        ///     [Output("example")]
        ///     public Output&lt;string&gt; Example { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRoleBindingResult> Invoke(GetRoleBindingInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRoleBindingResult>("confluentcloud:index/getRoleBinding:getRoleBinding", args ?? new GetRoleBindingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRoleBindingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Role Binding (for example, `rb-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetRoleBindingArgs()
        {
        }
    }

    public sealed class GetRoleBindingInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Role Binding (for example, `rb-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetRoleBindingInvokeArgs()
        {
        }
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
