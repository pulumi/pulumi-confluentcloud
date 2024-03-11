// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetUsers
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getUsers` describes a data source for Users.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var main = ConfluentCloud.GetUsers.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["users"] = main.Apply(getUsersResult =&gt; getUsersResult.Ids),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("confluentcloud:index/getUsers:getUsers", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getUsers` describes a data source for Users.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var main = ConfluentCloud.GetUsers.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["users"] = main.Apply(getUsersResult =&gt; getUsersResult.Ids),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetUsersResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("confluentcloud:index/getUsers:getUsers", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required List of Strings) The list of User IDs, for example: `["u-abc123", "u-abc124"]`.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private GetUsersResult(
            string id,

            ImmutableArray<string> ids)
        {
            Id = id;
            Ids = ids;
        }
    }
}
