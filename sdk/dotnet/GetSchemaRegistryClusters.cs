// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryClusters
    {
        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.getSchemaRegistryClusters` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.getSchemaRegistryClusters` describes a data source for Schema Registry Clusters.
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
        ///     var main = ConfluentCloud.GetSchemaRegistryClusters.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSchemaRegistryClustersResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryClustersResult>("confluentcloud:index/getSchemaRegistryClusters:getSchemaRegistryClusters", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.getSchemaRegistryClusters` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.getSchemaRegistryClusters` describes a data source for Schema Registry Clusters.
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
        ///     var main = ConfluentCloud.GetSchemaRegistryClusters.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSchemaRegistryClustersResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryClustersResult>("confluentcloud:index/getSchemaRegistryClusters:getSchemaRegistryClusters", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetSchemaRegistryClustersResult
    {
        /// <summary>
        /// (Required List of Object) List of Schema Registry clusters. Each Schema Registry cluster object exports the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemaRegistryClustersClusterResult> Clusters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSchemaRegistryClustersResult(
            ImmutableArray<Outputs.GetSchemaRegistryClustersClusterResult> clusters,

            string id)
        {
            Clusters = clusters;
            Id = id;
        }
    }
}
