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
    /// ### Example Kafka API Key
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var app_manager_kafka_api_key = new ConfluentCloud.ApiKey("app-manager-kafka-api-key", new()
    ///     {
    ///         Description = "Kafka API Key that is owned by 'app-manager' service account",
    ///         Owner = new ConfluentCloud.Inputs.ApiKeyOwnerArgs
    ///         {
    ///             Id = confluent_service_account.App_manager.Id,
    ///             ApiVersion = confluent_service_account.App_manager.Api_version,
    ///             Kind = confluent_service_account.App_manager.Kind,
    ///         },
    ///         ManagedResource = new ConfluentCloud.Inputs.ApiKeyManagedResourceArgs
    ///         {
    ///             Id = confluent_kafka_cluster.Basic.Id,
    ///             ApiVersion = confluent_kafka_cluster.Basic.Api_version,
    ///             Kind = confluent_kafka_cluster.Basic.Kind,
    ///             Environment = new ConfluentCloud.Inputs.ApiKeyManagedResourceEnvironmentArgs
    ///             {
    ///                 Id = confluent_environment.Staging.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example ksqlDB API Key
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ksqldb_api_key = new ConfluentCloud.ApiKey("ksqldb-api-key", new()
    ///     {
    ///         Description = "KsqlDB API Key that is owned by 'app-manager' service account",
    ///         Owner = new ConfluentCloud.Inputs.ApiKeyOwnerArgs
    ///         {
    ///             Id = confluent_service_account.App_manager.Id,
    ///             ApiVersion = confluent_service_account.App_manager.Api_version,
    ///             Kind = confluent_service_account.App_manager.Kind,
    ///         },
    ///         ManagedResource = new ConfluentCloud.Inputs.ApiKeyManagedResourceArgs
    ///         {
    ///             Id = confluent_ksql_cluster.Main.Id,
    ///             ApiVersion = confluent_ksql_cluster.Main.Api_version,
    ///             Kind = confluent_ksql_cluster.Main.Kind,
    ///             Environment = new ConfluentCloud.Inputs.ApiKeyManagedResourceEnvironmentArgs
    ///             {
    ///                 Id = confluent_environment.Staging.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Schema Registry API Key
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var env_manager_schema_registry_api_key = new ConfluentCloud.ApiKey("env-manager-schema-registry-api-key", new()
    ///     {
    ///         Description = "Schema Registry API Key that is owned by 'env-manager' service account",
    ///         Owner = new ConfluentCloud.Inputs.ApiKeyOwnerArgs
    ///         {
    ///             Id = confluent_service_account.Env_manager.Id,
    ///             ApiVersion = confluent_service_account.Env_manager.Api_version,
    ///             Kind = confluent_service_account.Env_manager.Kind,
    ///         },
    ///         ManagedResource = new ConfluentCloud.Inputs.ApiKeyManagedResourceArgs
    ///         {
    ///             Id = confluent_schema_registry_cluster.Essentials.Id,
    ///             ApiVersion = confluent_schema_registry_cluster.Essentials.Api_version,
    ///             Kind = confluent_schema_registry_cluster.Essentials.Kind,
    ///             Environment = new ConfluentCloud.Inputs.ApiKeyManagedResourceEnvironmentArgs
    ///             {
    ///                 Id = confluent_environment.Staging.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Flink API Key
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var env_manager_flink_api_key = new ConfluentCloud.ApiKey("env-manager-flink-api-key", new()
    ///     {
    ///         Description = "Flink API Key that is owned by 'env-manager' service account",
    ///         Owner = new ConfluentCloud.Inputs.ApiKeyOwnerArgs
    ///         {
    ///             Id = confluent_service_account.Env_manager.Id,
    ///             ApiVersion = confluent_service_account.Env_manager.Api_version,
    ///             Kind = confluent_service_account.Env_manager.Kind,
    ///         },
    ///         ManagedResource = new ConfluentCloud.Inputs.ApiKeyManagedResourceArgs
    ///         {
    ///             Id = data.Confluent_flink_region.Example.Id,
    ///             ApiVersion = data.Confluent_flink_region.Example.Api_version,
    ///             Kind = data.Confluent_flink_region.Example.Kind,
    ///             Environment = new ConfluentCloud.Inputs.ApiKeyManagedResourceEnvironmentArgs
    ///             {
    ///                 Id = confluent_environment.Staging.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Cloud API Key
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var env_manager_cloud_api_key = new ConfluentCloud.ApiKey("env-manager-cloud-api-key", new()
    ///     {
    ///         Description = "Cloud API Key that is owned by 'env-manager' service account",
    ///         Owner = new ConfluentCloud.Inputs.ApiKeyOwnerArgs
    ///         {
    ///             Id = confluent_service_account.Env_manager.Id,
    ///             ApiVersion = confluent_service_account.Env_manager.Api_version,
    ///             Kind = confluent_service_account.Env_manager.Kind,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.ApiKey` resource:
    ///   * `basic-kafka-acls`: _Basic_ Kafka cluster with authorization using ACLs
    ///   * `basic-kafka-acls-with-alias`: _Basic_ Kafka cluster with authorization using ACLs
    ///   * `standard-kafka-acls`: _Standard_ Kafka cluster with authorization using ACLs
    ///   * `standard-kafka-rbac`: _Standard_ Kafka cluster with authorization using RBAC
    ///   * `dedicated-public-kafka-acls`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
    ///   * `dedicated-public-kafka-rbac`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
    ///   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
    ///   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
    ///   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
    ///   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
    ///   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
    ///   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
    ///   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
    /// 
    /// ## Import
    /// 
    /// You can import a Cluster API Key by using the Environment ID and Cluster API Key ID in the format `&lt;Environment ID&gt;/&lt;Cluster API Key ID&gt;`, for example$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;" $ export API_KEY_SECRET="&lt;api_key_secret&gt;" Option #1Cluster API Key
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key "env-abc123/UTT6WDRXX7FHD2GV"
    /// ```
    /// 
    ///  You can import a Cloud API Key by using Cloud API Key ID, for example$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;" $ export API_KEY_SECRET="&lt;api_key_secret&gt;" Option #2Cloud API Key
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key "4UEXOMMWIBE5KZQG"
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/apiKey:ApiKey")]
    public partial class ApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A free-form description of the API Account.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        /// </summary>
        [Output("disableWaitForReady")]
        public Output<bool?> DisableWaitForReady { get; private set; } = null!;

        /// <summary>
        /// A human-readable name for the API Key.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster'.
        /// </summary>
        [Output("managedResource")]
        public Output<Outputs.ApiKeyManagedResource?> ManagedResource { get; private set; } = null!;

        /// <summary>
        /// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        /// </summary>
        [Output("owner")]
        public Output<Outputs.ApiKeyOwner> Owner { get; private set; } = null!;

        /// <summary>
        /// (Required String, Sensitive) The secret of the API Key.
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;


        /// <summary>
        /// Create a ApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiKey(string name, ApiKeyArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/apiKey:ApiKey", name, args ?? new ApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiKey(string name, Input<string> id, ApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/apiKey:ApiKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiKey Get(string name, Input<string> id, ApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiKey(name, id, state, options);
        }
    }

    public sealed class ApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free-form description of the API Account.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        /// </summary>
        [Input("disableWaitForReady")]
        public Input<bool>? DisableWaitForReady { get; set; }

        /// <summary>
        /// A human-readable name for the API Key.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster'.
        /// </summary>
        [Input("managedResource")]
        public Input<Inputs.ApiKeyManagedResourceArgs>? ManagedResource { get; set; }

        /// <summary>
        /// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        /// </summary>
        [Input("owner", required: true)]
        public Input<Inputs.ApiKeyOwnerArgs> Owner { get; set; } = null!;

        public ApiKeyArgs()
        {
        }
        public static new ApiKeyArgs Empty => new ApiKeyArgs();
    }

    public sealed class ApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free-form description of the API Account.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
        /// </summary>
        [Input("disableWaitForReady")]
        public Input<bool>? DisableWaitForReady { get; set; }

        /// <summary>
        /// A human-readable name for the API Key.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The resource associated with this object. The only resource that is supported is 'cmk.v2.Cluster', 'srcm.v2.Cluster'.
        /// </summary>
        [Input("managedResource")]
        public Input<Inputs.ApiKeyManagedResourceGetArgs>? ManagedResource { get; set; }

        /// <summary>
        /// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
        /// </summary>
        [Input("owner")]
        public Input<Inputs.ApiKeyOwnerGetArgs>? Owner { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// (Required String, Sensitive) The secret of the API Key.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ApiKeyState()
        {
        }
        public static new ApiKeyState Empty => new ApiKeyState();
    }
}
