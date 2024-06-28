// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// You can import a Schema Registry cluster by using Environment ID and Schema Registry cluster ID, in the format `&lt;Environment ID&gt;/&lt;Schema Registry cluster ID&gt;`, for example:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster example env-abc123/lsrc-abc123
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster")]
    public partial class SchemaRegistryCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        /// <summary>
        /// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.SchemaRegistryClusterEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// </summary>
        [Output("package")]
        public Output<string> Package { get; private set; } = null!;

        [Output("region")]
        public Output<Outputs.SchemaRegistryClusterRegion> Region { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        /// </summary>
        [Output("resourceName")]
        public Output<string> ResourceName { get; private set; } = null!;

        /// <summary>
        /// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        /// </summary>
        [Output("restEndpoint")]
        public Output<string> RestEndpoint { get; private set; } = null!;


        /// <summary>
        /// Create a SchemaRegistryCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchemaRegistryCluster(string name, SchemaRegistryClusterArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster", name, args ?? new SchemaRegistryClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchemaRegistryCluster(string name, Input<string> id, SchemaRegistryClusterState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SchemaRegistryCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchemaRegistryCluster Get(string name, Input<string> id, SchemaRegistryClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new SchemaRegistryCluster(name, id, state, options);
        }
    }

    public sealed class SchemaRegistryClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.SchemaRegistryClusterEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// </summary>
        [Input("package", required: true)]
        public Input<string> Package { get; set; } = null!;

        [Input("region", required: true)]
        public Input<Inputs.SchemaRegistryClusterRegionArgs> Region { get; set; } = null!;

        public SchemaRegistryClusterArgs()
        {
        }
        public static new SchemaRegistryClusterArgs Empty => new SchemaRegistryClusterArgs();
    }

    public sealed class SchemaRegistryClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.SchemaRegistryClusterEnvironmentGetArgs>? Environment { get; set; }

        /// <summary>
        /// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// </summary>
        [Input("package")]
        public Input<string>? Package { get; set; }

        [Input("region")]
        public Input<Inputs.SchemaRegistryClusterRegionGetArgs>? Region { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        /// <summary>
        /// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        public SchemaRegistryClusterState()
        {
        }
        public static new SchemaRegistryClusterState Empty => new SchemaRegistryClusterState();
    }
}
