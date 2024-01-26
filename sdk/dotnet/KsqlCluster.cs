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
    /// ## # confluentcloud.KsqlCluster Resource
    /// 
    /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    /// 
    /// !&gt; **Warning:**  It is strongly recommended that you provision a `confluentcloud.SchemaRegistryCluster` resource before you provision a `confluentcloud.KsqlCluster` resource in a given environment. If you're provisioning the `confluentcloud.SchemaRegistryCluster` and the `confluentcloud.KsqlCluster` resource in the same pulumi up command, reference the `confluentcloud.SchemaRegistryCluster` from the `depends_on` argument inside the `confluentcloud.KsqlCluster` resource. This ensures that the `confluentcloud.SchemaRegistryCluster` resource is created before the `confluentcloud.KsqlCluster` resource. If you provision a `confluentcloud.KsqlCluster` resource without a `confluentcloud.SchemaRegistryCluster` resource, and later, you want to add a `confluentcloud.SchemaRegistryCluster` resource, you must destroy and re-create your `confluentcloud.KsqlCluster` resource after provisioning a `confluentcloud.SchemaRegistryCluster` resource.
    /// 
    /// `confluentcloud.KsqlCluster` provides a ksqlDB cluster resource that enables creating, editing, and deleting ksqlDB clusters on Confluent Cloud.
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.KsqlCluster` resource:
    /// * `ksql-acls`
    /// * `ksql-rbac`
    /// 
    /// ## Import
    /// 
    /// You can import a ksqlDB cluster by using Environment ID and ksqlDB cluster ID, in the format `&lt;Environment ID&gt;/&lt;ksqlDB cluster ID&gt;`, for example$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/ksqlCluster:KsqlCluster example env-abc123/lksqlc-abc123
    /// ```
    /// 
    ///  !&gt; **Warning:**
    /// 
    /// Do not forget to delete the terminal's command history afterward for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/ksqlCluster:KsqlCluster")]
    public partial class KsqlCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        [Output("credentialIdentity")]
        public Output<Outputs.KsqlClusterCredentialIdentity> CredentialIdentity { get; private set; } = null!;

        /// <summary>
        /// The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        /// </summary>
        [Output("csu")]
        public Output<int> Csu { get; private set; } = null!;

        /// <summary>
        /// The name of the ksqlDB cluster.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.KsqlClusterEnvironment> Environment { get; private set; } = null!;

        [Output("kafkaCluster")]
        public Output<Outputs.KsqlClusterKafkaCluster> KafkaCluster { get; private set; } = null!;

        /// <summary>
        /// (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// (Required String) The Confluent Resource Name of the ksqlDB cluster.
        /// </summary>
        [Output("resourceName")]
        public Output<string> ResourceName { get; private set; } = null!;

        /// <summary>
        /// (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        /// </summary>
        [Output("restEndpoint")]
        public Output<string> RestEndpoint { get; private set; } = null!;

        /// <summary>
        /// (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        /// </summary>
        [Output("storage")]
        public Output<int> Storage { get; private set; } = null!;

        /// <summary>
        /// (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        /// </summary>
        [Output("topicPrefix")]
        public Output<string> TopicPrefix { get; private set; } = null!;

        /// <summary>
        /// Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        /// </summary>
        [Output("useDetailedProcessingLog")]
        public Output<bool?> UseDetailedProcessingLog { get; private set; } = null!;


        /// <summary>
        /// Create a KsqlCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KsqlCluster(string name, KsqlClusterArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/ksqlCluster:KsqlCluster", name, args ?? new KsqlClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KsqlCluster(string name, Input<string> id, KsqlClusterState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/ksqlCluster:KsqlCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KsqlCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KsqlCluster Get(string name, Input<string> id, KsqlClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KsqlCluster(name, id, state, options);
        }
    }

    public sealed class KsqlClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentialIdentity", required: true)]
        public Input<Inputs.KsqlClusterCredentialIdentityArgs> CredentialIdentity { get; set; } = null!;

        /// <summary>
        /// The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        /// </summary>
        [Input("csu", required: true)]
        public Input<int> Csu { get; set; } = null!;

        /// <summary>
        /// The name of the ksqlDB cluster.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.KsqlClusterEnvironmentArgs> Environment { get; set; } = null!;

        [Input("kafkaCluster", required: true)]
        public Input<Inputs.KsqlClusterKafkaClusterArgs> KafkaCluster { get; set; } = null!;

        /// <summary>
        /// Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        /// </summary>
        [Input("useDetailedProcessingLog")]
        public Input<bool>? UseDetailedProcessingLog { get; set; }

        public KsqlClusterArgs()
        {
        }
        public static new KsqlClusterArgs Empty => new KsqlClusterArgs();
    }

    public sealed class KsqlClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        [Input("credentialIdentity")]
        public Input<Inputs.KsqlClusterCredentialIdentityGetArgs>? CredentialIdentity { get; set; }

        /// <summary>
        /// The number of Confluent Streaming Units (CSUs) for the ksqlDB cluster.
        /// </summary>
        [Input("csu")]
        public Input<int>? Csu { get; set; }

        /// <summary>
        /// The name of the ksqlDB cluster.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.KsqlClusterEnvironmentGetArgs>? Environment { get; set; }

        [Input("kafkaCluster")]
        public Input<Inputs.KsqlClusterKafkaClusterGetArgs>? KafkaCluster { get; set; }

        /// <summary>
        /// (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// (Required String) The Confluent Resource Name of the ksqlDB cluster.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        /// <summary>
        /// (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// (Required Integer) The amount of storage (in GB) provisioned to the ksqlDB cluster.
        /// </summary>
        [Input("storage")]
        public Input<int>? Storage { get; set; }

        /// <summary>
        /// (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
        /// </summary>
        [Input("topicPrefix")]
        public Input<string>? TopicPrefix { get; set; }

        /// <summary>
        /// Controls whether the row data should be included in the processing log topic. Set it to `false` if you don't want to emit sensitive information to the processing log. Defaults to `true`.
        /// </summary>
        [Input("useDetailedProcessingLog")]
        public Input<bool>? UseDetailedProcessingLog { get; set; }

        public KsqlClusterState()
        {
        }
        public static new KsqlClusterState Empty => new KsqlClusterState();
    }
}
