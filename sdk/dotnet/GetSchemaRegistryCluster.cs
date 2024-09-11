// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryCluster
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
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
        ///     // Loads the only Schema Registry cluster in the target environment
        ///     var exampleUsingEnvId = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingId = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         Id = "lsrc-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         DisplayName = "Stream Governance Package",
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingEnvId"] = exampleUsingEnvId,
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSchemaRegistryClusterResult> InvokeAsync(GetSchemaRegistryClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryClusterResult>("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", args ?? new GetSchemaRegistryClusterArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
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
        ///     // Loads the only Schema Registry cluster in the target environment
        ///     var exampleUsingEnvId = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingId = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         Id = "lsrc-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var exampleUsingName = ConfluentCloud.GetSchemaRegistryCluster.Invoke(new()
        ///     {
        ///         DisplayName = "Stream Governance Package",
        ///         Environment = new ConfluentCloud.Inputs.GetSchemaRegistryClusterEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingEnvId"] = exampleUsingEnvId,
        ///         ["exampleUsingId"] = exampleUsingId,
        ///         ["exampleUsingName"] = exampleUsingName,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSchemaRegistryClusterResult> Invoke(GetSchemaRegistryClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryClusterResult>("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", args ?? new GetSchemaRegistryClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaRegistryClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name for the Schema Registry cluster.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Inputs.GetSchemaRegistryClusterEnvironmentArgs Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetSchemaRegistryClusterArgs()
        {
        }
        public static new GetSchemaRegistryClusterArgs Empty => new GetSchemaRegistryClusterArgs();
    }

    public sealed class GetSchemaRegistryClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name for the Schema Registry cluster.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Input<Inputs.GetSchemaRegistryClusterEnvironmentInputArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetSchemaRegistryClusterInvokeArgs()
        {
        }
        public static new GetSchemaRegistryClusterInvokeArgs Empty => new GetSchemaRegistryClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaRegistryClusterResult
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The Catalog endpoint of the Schema Registry cluster, for example, `https://psrc-y1113.us-west-2.aws.confluent.cloud`.
        /// </summary>
        public readonly string CatalogEndpoint;
        /// <summary>
        /// (Required String) The cloud service provider that that the Schema Registry cluster belongs to, for example, `AWS`.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        /// </summary>
        public readonly string DisplayName;
        public readonly Outputs.GetSchemaRegistryClusterEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// </summary>
        public readonly string Package;
        /// <summary>
        /// (Required String) The private HTTP endpoint of the Schema Registry cluster, for example, `https://lsrc.us-west-2.aws.private.confluent.cloud`.
        /// </summary>
        public readonly string PrivateRestEndpoint;
        /// <summary>
        /// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `us-east4`.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        /// </summary>
        public readonly string ResourceName;
        /// <summary>
        /// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        /// </summary>
        public readonly string RestEndpoint;

        [OutputConstructor]
        private GetSchemaRegistryClusterResult(
            string apiVersion,

            string catalogEndpoint,

            string cloud,

            string displayName,

            Outputs.GetSchemaRegistryClusterEnvironmentResult environment,

            string id,

            string kind,

            string package,

            string privateRestEndpoint,

            string region,

            string resourceName,

            string restEndpoint)
        {
            ApiVersion = apiVersion;
            CatalogEndpoint = catalogEndpoint;
            Cloud = cloud;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Kind = kind;
            Package = package;
            PrivateRestEndpoint = privateRestEndpoint;
            Region = region;
            ResourceName = resourceName;
            RestEndpoint = restEndpoint;
        }
    }
}
