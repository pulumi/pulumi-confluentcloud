// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetSchemaRegistryDek
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.SchemaRegistryDek` describes a Schema Registry Data Encryption Key (DEK) data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myKey = ConfluentCloud.GetSchemaRegistryDek.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetSchemaRegistryDekSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetSchemaRegistryDekCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///         KekName = "my_kek",
        ///         SubjectName = "my_subject",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myKey = ConfluentCloud.GetSchemaRegistryDek.Invoke(new()
        ///     {
        ///         KekName = "my_kek",
        ///         SubjectName = "my_subject",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSchemaRegistryDekResult> InvokeAsync(GetSchemaRegistryDekArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaRegistryDekResult>("confluentcloud:index/getSchemaRegistryDek:getSchemaRegistryDek", args ?? new GetSchemaRegistryDekArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.SchemaRegistryDek` describes a Schema Registry Data Encryption Key (DEK) data source.
        /// 
        /// ## Example Usage
        /// 
        /// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myKey = ConfluentCloud.GetSchemaRegistryDek.Invoke(new()
        ///     {
        ///         SchemaRegistryCluster = new ConfluentCloud.Inputs.GetSchemaRegistryDekSchemaRegistryClusterInputArgs
        ///         {
        ///             Id = essentials.Id,
        ///         },
        ///         RestEndpoint = essentials.RestEndpoint,
        ///         Credentials = new ConfluentCloud.Inputs.GetSchemaRegistryDekCredentialsInputArgs
        ///         {
        ///             Key = "&lt;Schema Registry API Key for data.confluent_schema_registry_cluster.essentials&gt;",
        ///             Secret = "&lt;Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials&gt;",
        ///         },
        ///         KekName = "my_kek",
        ///         SubjectName = "my_subject",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myKey = ConfluentCloud.GetSchemaRegistryDek.Invoke(new()
        ///     {
        ///         KekName = "my_kek",
        ///         SubjectName = "my_subject",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSchemaRegistryDekResult> Invoke(GetSchemaRegistryDekInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaRegistryDekResult>("confluentcloud:index/getSchemaRegistryDek:getSchemaRegistryDek", args ?? new GetSchemaRegistryDekInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaRegistryDekArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("algorithm")]
        public string? Algorithm { get; set; }

        [Input("credentials")]
        private Inputs.GetSchemaRegistryDekCredentialsArgs? _credentials;
        public Inputs.GetSchemaRegistryDekCredentialsArgs? Credentials
        {
            get => _credentials;
            set => _credentials = value;
        }

        /// <summary>
        /// The name of the KEK used to encrypt this DEK.
        /// </summary>
        [Input("kekName", required: true)]
        public string KekName { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public string? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Inputs.GetSchemaRegistryDekSchemaRegistryClusterArgs? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The subject for this DEK.
        /// </summary>
        [Input("subjectName", required: true)]
        public string SubjectName { get; set; } = null!;

        /// <summary>
        /// The version of this DEK. Defaults to `1`.
        /// </summary>
        [Input("version")]
        public int? Version { get; set; }

        public GetSchemaRegistryDekArgs()
        {
        }
        public static new GetSchemaRegistryDekArgs Empty => new GetSchemaRegistryDekArgs();
    }

    public sealed class GetSchemaRegistryDekInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
        /// 
        /// &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("credentials")]
        private Input<Inputs.GetSchemaRegistryDekCredentialsInputArgs>? _credentials;
        public Input<Inputs.GetSchemaRegistryDekCredentialsInputArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.GetSchemaRegistryDekCredentialsInputArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the KEK used to encrypt this DEK.
        /// </summary>
        [Input("kekName", required: true)]
        public Input<string> KekName { get; set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.GetSchemaRegistryDekSchemaRegistryClusterInputArgs>? SchemaRegistryCluster { get; set; }

        /// <summary>
        /// The subject for this DEK.
        /// </summary>
        [Input("subjectName", required: true)]
        public Input<string> SubjectName { get; set; } = null!;

        /// <summary>
        /// The version of this DEK. Defaults to `1`.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public GetSchemaRegistryDekInvokeArgs()
        {
        }
        public static new GetSchemaRegistryDekInvokeArgs Empty => new GetSchemaRegistryDekInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaRegistryDekResult
    {
        public readonly string? Algorithm;
        public readonly Outputs.GetSchemaRegistryDekCredentialsResult? Credentials;
        /// <summary>
        /// (Optional String) The encrypted key material for the DEK.
        /// </summary>
        public readonly string EncryptedKeyMaterial;
        /// <summary>
        /// (Optional Boolean) An optional flag to control whether a dek should be soft or hard deleted.
        /// </summary>
        public readonly bool HardDelete;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string KekName;
        /// <summary>
        /// (Optional String) The decrypted version of encrypted key material.
        /// </summary>
        public readonly string KeyMaterial;
        public readonly string? RestEndpoint;
        public readonly Outputs.GetSchemaRegistryDekSchemaRegistryClusterResult? SchemaRegistryCluster;
        public readonly string SubjectName;
        public readonly int? Version;

        [OutputConstructor]
        private GetSchemaRegistryDekResult(
            string? algorithm,

            Outputs.GetSchemaRegistryDekCredentialsResult? credentials,

            string encryptedKeyMaterial,

            bool hardDelete,

            string id,

            string kekName,

            string keyMaterial,

            string? restEndpoint,

            Outputs.GetSchemaRegistryDekSchemaRegistryClusterResult? schemaRegistryCluster,

            string subjectName,

            int? version)
        {
            Algorithm = algorithm;
            Credentials = credentials;
            EncryptedKeyMaterial = encryptedKeyMaterial;
            HardDelete = hardDelete;
            Id = id;
            KekName = kekName;
            KeyMaterial = keyMaterial;
            RestEndpoint = restEndpoint;
            SchemaRegistryCluster = schemaRegistryCluster;
            SubjectName = subjectName;
            Version = version;
        }
    }
}