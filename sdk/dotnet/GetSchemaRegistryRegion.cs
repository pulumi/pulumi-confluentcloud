// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryRegion
    {
        /// <summary>
        /// [![Deprecated](https://img.shields.io/badge/Lifecycle%20Stage-Deprecated-yellow)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getSchemaRegistryRegion` describes a Schema Registry cluster data source.
        /// 
        /// !&gt; **Warning:** The `confluentcloud.getSchemaRegistryRegion` data source has been deprecated and will be removed in the next major version of the provider (2.0.0). 
        /// Refer to the Upgrade Guide for more details. 
        /// The guide will be published once version 2.0.0 is released.
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
        ///     var example = ConfluentCloud.GetSchemaRegistryRegion.Invoke(new()
        ///     {
        ///         Cloud = "AWS",
        ///         Region = "us-east-2",
        ///         Package = "ESSENTIALS",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSchemaRegistryRegionResult> InvokeAsync(GetSchemaRegistryRegionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryRegionResult>("confluentcloud:index/getSchemaRegistryRegion:getSchemaRegistryRegion", args ?? new GetSchemaRegistryRegionArgs(), options.WithDefaults());

        /// <summary>
        /// [![Deprecated](https://img.shields.io/badge/Lifecycle%20Stage-Deprecated-yellow)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.getSchemaRegistryRegion` describes a Schema Registry cluster data source.
        /// 
        /// !&gt; **Warning:** The `confluentcloud.getSchemaRegistryRegion` data source has been deprecated and will be removed in the next major version of the provider (2.0.0). 
        /// Refer to the Upgrade Guide for more details. 
        /// The guide will be published once version 2.0.0 is released.
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
        ///     var example = ConfluentCloud.GetSchemaRegistryRegion.Invoke(new()
        ///     {
        ///         Cloud = "AWS",
        ///         Region = "us-east-2",
        ///         Package = "ESSENTIALS",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["example"] = example,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSchemaRegistryRegionResult> Invoke(GetSchemaRegistryRegionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryRegionResult>("confluentcloud:index/getSchemaRegistryRegion:getSchemaRegistryRegion", args ?? new GetSchemaRegistryRegionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaRegistryRegionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public string Cloud { get; set; } = null!;

        /// <summary>
        /// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// 
        /// &gt; **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
        /// </summary>
        [Input("package", required: true)]
        public string Package { get; set; } = null!;

        /// <summary>
        /// The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetSchemaRegistryRegionArgs()
        {
        }
        public static new GetSchemaRegistryRegionArgs Empty => new GetSchemaRegistryRegionArgs();
    }

    public sealed class GetSchemaRegistryRegionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        [Input("cloud", required: true)]
        public Input<string> Cloud { get; set; } = null!;

        /// <summary>
        /// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// 
        /// &gt; **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
        /// </summary>
        [Input("package", required: true)]
        public Input<string> Package { get; set; } = null!;

        /// <summary>
        /// The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetSchemaRegistryRegionInvokeArgs()
        {
        }
        public static new GetSchemaRegistryRegionInvokeArgs Empty => new GetSchemaRegistryRegionInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaRegistryRegionResult
    {
        public readonly string Cloud;
        /// <summary>
        /// (Required String) The ID of the Schema Registry region, for example, `sgreg-1`.
        /// </summary>
        public readonly string Id;
        public readonly string Package;
        public readonly string Region;

        [OutputConstructor]
        private GetSchemaRegistryRegionResult(
            string cloud,

            string id,

            string package,

            string region)
        {
            Cloud = cloud;
            Id = id;
            Package = package;
            Region = region;
        }
    }
}
