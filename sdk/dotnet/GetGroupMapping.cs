// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetGroupMapping
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.GroupMapping` describes a Group Mapping data source.
        /// 
        /// &gt; **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingIdGroupMapping = ConfluentCloud.GetGroupMapping.Invoke(new()
        ///     {
        ///         Id = "group-abc123",
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetGroupMapping.Invoke(new()
        ///     {
        ///         DisplayName = "Default",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdGroupMapping,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGroupMappingResult> InvokeAsync(GetGroupMappingArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupMappingResult>("confluentcloud:index/getGroupMapping:getGroupMapping", args ?? new GetGroupMappingArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.GroupMapping` describes a Group Mapping data source.
        /// 
        /// &gt; **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingIdGroupMapping = ConfluentCloud.GetGroupMapping.Invoke(new()
        ///     {
        ///         Id = "group-abc123",
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetGroupMapping.Invoke(new()
        ///     {
        ///         DisplayName = "Default",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdGroupMapping,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGroupMappingResult> Invoke(GetGroupMappingInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGroupMappingResult>("confluentcloud:index/getGroupMapping:getGroupMapping", args ?? new GetGroupMappingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupMappingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Group Mapping.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Group Mapping.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetGroupMappingArgs()
        {
        }
        public static new GetGroupMappingArgs Empty => new GetGroupMappingArgs();
    }

    public sealed class GetGroupMappingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Group Mapping.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Group Mapping.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetGroupMappingInvokeArgs()
        {
        }
        public static new GetGroupMappingInvokeArgs Empty => new GetGroupMappingInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupMappingResult
    {
        /// <summary>
        /// (Required String) A description explaining the purpose and use of the group mapping.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Required String) The name of the Group Mapping.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
        /// </summary>
        public readonly string Filter;
        /// <summary>
        /// (Required String) The ID of the Group Mapping (for example, `group-abc123`).
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGroupMappingResult(
            string description,

            string displayName,

            string filter,

            string id)
        {
            Description = description;
            DisplayName = displayName;
            Filter = filter;
            Id = id;
        }
    }
}