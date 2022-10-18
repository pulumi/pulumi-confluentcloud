// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetEnvironment
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.Environment` describes an Environment data source.
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
        ///     var exampleUsingIdEnvironment = ConfluentCloud.GetEnvironment.Invoke(new()
        ///     {
        ///         Id = "env-abc123",
        ///     });
        /// 
        ///     var exampleUsingNameEnvironment = ConfluentCloud.GetEnvironment.Invoke(new()
        ///     {
        ///         DisplayName = "stag",
        ///     });
        /// 
        ///     var exampleUsingNameServiceAccount = ConfluentCloud.GetServiceAccount.Invoke(new()
        ///     {
        ///         DisplayName = "test_sa",
        ///     });
        /// 
        ///     var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new()
        ///     {
        ///         Principal = $"User:{exampleUsingNameServiceAccount.Apply(getServiceAccountResult =&gt; getServiceAccountResult.Id)}",
        ///         RoleName = "EnvironmentAdmin",
        ///         CrnPattern = exampleUsingNameEnvironment.Apply(getEnvironmentResult =&gt; getEnvironmentResult.ResourceName),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdEnvironment.Apply(getEnvironmentResult =&gt; getEnvironmentResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("confluentcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.Environment` describes an Environment data source.
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
        ///     var exampleUsingIdEnvironment = ConfluentCloud.GetEnvironment.Invoke(new()
        ///     {
        ///         Id = "env-abc123",
        ///     });
        /// 
        ///     var exampleUsingNameEnvironment = ConfluentCloud.GetEnvironment.Invoke(new()
        ///     {
        ///         DisplayName = "stag",
        ///     });
        /// 
        ///     var exampleUsingNameServiceAccount = ConfluentCloud.GetServiceAccount.Invoke(new()
        ///     {
        ///         DisplayName = "test_sa",
        ///     });
        /// 
        ///     var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new()
        ///     {
        ///         Principal = $"User:{exampleUsingNameServiceAccount.Apply(getServiceAccountResult =&gt; getServiceAccountResult.Id)}",
        ///         RoleName = "EnvironmentAdmin",
        ///         CrnPattern = exampleUsingNameEnvironment.Apply(getEnvironmentResult =&gt; getEnvironmentResult.ResourceName),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingId"] = exampleUsingIdEnvironment.Apply(getEnvironmentResult =&gt; getEnvironmentResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("confluentcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Environment.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetEnvironmentArgs()
        {
        }
        public static new GetEnvironmentArgs Empty => new GetEnvironmentArgs();
    }

    public sealed class GetEnvironmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Environment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetEnvironmentInvokeArgs()
        {
        }
        public static new GetEnvironmentInvokeArgs Empty => new GetEnvironmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        /// <summary>
        /// (Required String) A human-readable name for the Environment.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetEnvironmentResult(
            string displayName,

            string id,

            string resourceName)
        {
            DisplayName = displayName;
            Id = id;
            ResourceName = resourceName;
        }
    }
}
