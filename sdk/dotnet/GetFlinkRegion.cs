// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetFlinkRegion
    {
        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-Preview-%!a(MISSING)fba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.getFlinkRegion` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.getFlinkRegion` describes a Flink cluster data source.
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
        ///     var exampleFlinkRegion = ConfluentCloud.GetFlinkRegion.Invoke(new()
        ///     {
        ///         Cloud = "AWS",
        ///         Region = "us-east-1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = exampleFlinkRegion,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetFlinkRegionResult> InvokeAsync(GetFlinkRegionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlinkRegionResult>("confluentcloud:index/getFlinkRegion:getFlinkRegion", args ?? new GetFlinkRegionArgs(), options.WithDefaults());

        /// <summary>
        /// [![Preview](https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-Preview-%!a(MISSING)fba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// &gt; **Note:** `confluentcloud.getFlinkRegion` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.  
        /// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Preview releases of the Preview features at any time in Confluent’s sole discretion.
        /// 
        /// `confluentcloud.getFlinkRegion` describes a Flink cluster data source.
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
        ///     var exampleFlinkRegion = ConfluentCloud.GetFlinkRegion.Invoke(new()
        ///     {
        ///         Cloud = "AWS",
        ///         Region = "us-east-1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = exampleFlinkRegion,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetFlinkRegionResult> Invoke(GetFlinkRegionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlinkRegionResult>("confluentcloud:index/getFlinkRegion:getFlinkRegion", args ?? new GetFlinkRegionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlinkRegionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public string Cloud { get; set; } = null!;

        /// <summary>
        /// The cloud service provider region, for example, `us-east-1`.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetFlinkRegionArgs()
        {
        }
        public static new GetFlinkRegionArgs Empty => new GetFlinkRegionArgs();
    }

    public sealed class GetFlinkRegionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public Input<string> Cloud { get; set; } = null!;

        /// <summary>
        /// The cloud service provider region, for example, `us-east-1`.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetFlinkRegionInvokeArgs()
        {
        }
        public static new GetFlinkRegionInvokeArgs Empty => new GetFlinkRegionInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlinkRegionResult
    {
        /// <summary>
        /// (Required String) An API Version of the Flink region, for example, `fcpm/v2`.
        /// </summary>
        public readonly string ApiVersion;
        public readonly string Cloud;
        /// <summary>
        /// (Required String) The ID of the Flink region, for example, `aws.us-east-1`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A kind of the Flink region, for example, `Region`.
        /// </summary>
        public readonly string Kind;
        public readonly string Region;
        /// <summary>
        /// (Required String) The HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`.
        /// </summary>
        public readonly string RestEndpoint;

        [OutputConstructor]
        private GetFlinkRegionResult(
            string apiVersion,

            string cloud,

            string id,

            string kind,

            string region,

            string restEndpoint)
        {
            ApiVersion = apiVersion;
            Cloud = cloud;
            Id = id;
            Kind = kind;
            Region = region;
            RestEndpoint = restEndpoint;
        }
    }
}
