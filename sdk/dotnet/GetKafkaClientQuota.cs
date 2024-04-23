// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetKafkaClientQuota
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaClientQuota` describes a Kafka Client Quota.
        /// 
        /// &gt; **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
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
        ///     var example = ConfluentCloud.GetKafkaClientQuota.Invoke(new()
        ///     {
        ///         Id = "cq-abc123",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetKafkaClientQuotaResult> InvokeAsync(GetKafkaClientQuotaArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKafkaClientQuotaResult>("confluentcloud:index/getKafkaClientQuota:getKafkaClientQuota", args ?? new GetKafkaClientQuotaArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.KafkaClientQuota` describes a Kafka Client Quota.
        /// 
        /// &gt; **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
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
        ///     var example = ConfluentCloud.GetKafkaClientQuota.Invoke(new()
        ///     {
        ///         Id = "cq-abc123",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetKafkaClientQuotaResult> Invoke(GetKafkaClientQuotaInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKafkaClientQuotaResult>("confluentcloud:index/getKafkaClientQuota:getKafkaClientQuota", args ?? new GetKafkaClientQuotaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKafkaClientQuotaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Kafka Client Quota (for example, `cq-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetKafkaClientQuotaArgs()
        {
        }
        public static new GetKafkaClientQuotaArgs Empty => new GetKafkaClientQuotaArgs();
    }

    public sealed class GetKafkaClientQuotaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Kafka Client Quota (for example, `cq-abc123`).
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetKafkaClientQuotaInvokeArgs()
        {
        }
        public static new GetKafkaClientQuotaInvokeArgs Empty => new GetKafkaClientQuotaInvokeArgs();
    }


    [OutputType]
    public sealed class GetKafkaClientQuotaResult
    {
        /// <summary>
        /// (Required String) The description of the Kafka Client Quota.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Required String) The name of the Kafka Client Quota.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClientQuotaEnvironmentResult> Environments;
        /// <summary>
        /// (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClientQuotaKafkaClusterResult> KafkaClusters;
        /// <summary>
        /// (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "&lt;default&gt;", to represent the default quota for all users and service accounts.
        /// </summary>
        public readonly ImmutableArray<string> Principals;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKafkaClientQuotaThroughputResult> Throughputs;

        [OutputConstructor]
        private GetKafkaClientQuotaResult(
            string description,

            string displayName,

            ImmutableArray<Outputs.GetKafkaClientQuotaEnvironmentResult> environments,

            string id,

            ImmutableArray<Outputs.GetKafkaClientQuotaKafkaClusterResult> kafkaClusters,

            ImmutableArray<string> principals,

            ImmutableArray<Outputs.GetKafkaClientQuotaThroughputResult> throughputs)
        {
            Description = description;
            DisplayName = displayName;
            Environments = environments;
            Id = id;
            KafkaClusters = kafkaClusters;
            Principals = principals;
            Throughputs = throughputs;
        }
    }
}
