// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    [ConfluentCloudResourceType("confluentcloud:index/schemaRegistryKek:SchemaRegistryKek")]
    public partial class SchemaRegistryKek : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.SchemaRegistryKekCredentials?> Credentials { get; private set; } = null!;

        [Output("doc")]
        public Output<string> Doc { get; private set; } = null!;

        /// <summary>
        /// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
        /// on destroy. Defaults to `false` (soft delete).
        /// </summary>
        [Output("hardDelete")]
        public Output<bool?> HardDelete { get; private set; } = null!;

        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        [Output("kmsType")]
        public Output<string> KmsType { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("properties")]
        public Output<ImmutableDictionary<string, string>> Properties { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example,
        /// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        [Output("schemaRegistryCluster")]
        public Output<Outputs.SchemaRegistryKekSchemaRegistryCluster?> SchemaRegistryCluster { get; private set; } = null!;

        [Output("shared")]
        public Output<bool> Shared { get; private set; } = null!;


        /// <summary>
        /// Create a SchemaRegistryKek resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchemaRegistryKek(string name, SchemaRegistryKekArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryKek:SchemaRegistryKek", name, args ?? new SchemaRegistryKekArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchemaRegistryKek(string name, Input<string> id, SchemaRegistryKekState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/schemaRegistryKek:SchemaRegistryKek", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "credentials",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SchemaRegistryKek resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchemaRegistryKek Get(string name, Input<string> id, SchemaRegistryKekState? state = null, CustomResourceOptions? options = null)
        {
            return new SchemaRegistryKek(name, id, state, options);
        }
    }

    public sealed class SchemaRegistryKekArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaRegistryKekCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryKekCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryKekCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("doc")]
        public Input<string>? Doc { get; set; }

        /// <summary>
        /// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
        /// on destroy. Defaults to `false` (soft delete).
        /// </summary>
        [Input("hardDelete")]
        public Input<bool>? HardDelete { get; set; }

        [Input("kmsKeyId", required: true)]
        public Input<string> KmsKeyId { get; set; } = null!;

        [Input("kmsType", required: true)]
        public Input<string> KmsType { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example,
        /// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryKekSchemaRegistryClusterArgs>? SchemaRegistryCluster { get; set; }

        [Input("shared")]
        public Input<bool>? Shared { get; set; }

        public SchemaRegistryKekArgs()
        {
        }
        public static new SchemaRegistryKekArgs Empty => new SchemaRegistryKekArgs();
    }

    public sealed class SchemaRegistryKekState : global::Pulumi.ResourceArgs
    {
        [Input("credentials")]
        private Input<Inputs.SchemaRegistryKekCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.SchemaRegistryKekCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.SchemaRegistryKekCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("doc")]
        public Input<string>? Doc { get; set; }

        /// <summary>
        /// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
        /// on destroy. Defaults to `false` (soft delete).
        /// </summary>
        [Input("hardDelete")]
        public Input<bool>? HardDelete { get; set; }

        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("kmsType")]
        public Input<string>? KmsType { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The REST endpoint of the Schema Registry cluster, for example,
        /// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        [Input("schemaRegistryCluster")]
        public Input<Inputs.SchemaRegistryKekSchemaRegistryClusterGetArgs>? SchemaRegistryCluster { get; set; }

        [Input("shared")]
        public Input<bool>? Shared { get; set; }

        public SchemaRegistryKekState()
        {
        }
        public static new SchemaRegistryKekState Empty => new SchemaRegistryKekState();
    }
}