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
    /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
    /// 
    /// `confluentcloud.ByokKey` provides a BYOK Key resource that enables creating, editing, and deleting BYOK Key on Confluent Cloud.
    /// 
    /// ## Example Usage
    /// ### Example BYOK Key on Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var azureKey = new ConfluentCloud.ByokKey("azureKey", new()
    ///     {
    ///         Azure = new ConfluentCloud.Inputs.ByokKeyAzureArgs
    ///         {
    ///             KeyIdentifier = "https://test-vault.vault.azure.net/keys/test-key",
    ///             KeyVaultId = "/subscriptions/11111111-1111-1111-1111-111111111111/resourceGroups/test-vault/providers/Microsoft.KeyVault/vaults/test-vault",
    ///             TenantId = "11111111-1111-1111-1111-111111111111",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example BYOK Key on GCP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var gcpKey = new ConfluentCloud.ByokKey("gcpKey", new()
    ///     {
    ///         Gcp = new ConfluentCloud.Inputs.ByokKeyGcpArgs
    ///         {
    ///             KeyId = "projects/temp-gear-123456/locations/us-central1/keyRings/byok-test/cryptoKeys/byok-test",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.ByokKey` resource:
    ///   * dedicated-public-aws-byok-kafka-acls: An example of Encrypting Confluent Cloud Dedicated Kafka Clusters using Self-Managed Keys on AWS.
    ///   * dedicated-public-azure-byok-kafka-acls: An example of Encrypting Confluent Cloud Dedicated Kafka Clusters using Self-Managed Keys on Azure.
    /// 
    /// See [Confluent Cloud Bring Your Own Key (BYOK) Management API](https://docs.confluent.io/cloud/current/clusters/byok/index.html) to learn more about Encrypting Confluent Cloud Kafka Clusters using Self-Managed Keys.
    /// 
    /// ## Import
    /// 
    /// You can import a BYOK Key by using BYOK Key ID. The following example shows how to import a BYOK Key$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/byokKey:ByokKey aws_key cck-abcde
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/byokKey:ByokKey")]
    public partial class ByokKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("aws")]
        public Output<Outputs.ByokKeyAws> Aws { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("azure")]
        public Output<Outputs.ByokKeyAzure> Azure { get; private set; } = null!;

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Output("gcp")]
        public Output<Outputs.ByokKeyGcp> Gcp { get; private set; } = null!;


        /// <summary>
        /// Create a ByokKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ByokKey(string name, ByokKeyArgs? args = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/byokKey:ByokKey", name, args ?? new ByokKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ByokKey(string name, Input<string> id, ByokKeyState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/byokKey:ByokKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ByokKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ByokKey Get(string name, Input<string> id, ByokKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ByokKey(name, id, state, options);
        }
    }

    public sealed class ByokKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.ByokKeyAwsArgs>? Aws { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("azure")]
        public Input<Inputs.ByokKeyAzureArgs>? Azure { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("gcp")]
        public Input<Inputs.ByokKeyGcpArgs>? Gcp { get; set; }

        public ByokKeyArgs()
        {
        }
        public static new ByokKeyArgs Empty => new ByokKeyArgs();
    }

    public sealed class ByokKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.ByokKeyAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("azure")]
        public Input<Inputs.ByokKeyAzureGetArgs>? Azure { get; set; }

        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        [Input("gcp")]
        public Input<Inputs.ByokKeyGcpGetArgs>? Gcp { get; set; }

        public ByokKeyState()
        {
        }
        public static new ByokKeyState Empty => new ByokKeyState();
    }
}
