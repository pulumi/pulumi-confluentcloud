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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ConfluentCloud = Pulumi.ConfluentCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var source = new ConfluentCloud.CustomConnectorPlugin("source", new()
    ///     {
    ///         ConnectorClass = "io.confluent.kafka.connect.datagen.DatagenConnector",
    ///         ConnectorType = "SOURCE",
    ///         DisplayName = "Datagen Source Connector Plugin",
    ///         DocumentationLink = "https://www.confluent.io/hub/confluentinc/kafka-connect-datagen",
    ///         Filename = "confluentinc-kafka-connect-datagen-0.6.2.zip",
    ///         SensitiveConfigProperties = new[] {},
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a Custom Connector Plugin by using a Custom Connector Plugin ID, in the format `&lt;Custom Connector Plugin&gt;`. The following example shows how to import a Custom Connector Plugin:
    /// 
    ///  $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    ///  $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin main ccp-abc123xyz
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin")]
    public partial class CustomConnectorPlugin : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
        /// </summary>
        [Output("connectorClass")]
        public Output<string> ConnectorClass { get; private set; } = null!;

        /// <summary>
        /// The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
        /// </summary>
        [Output("connectorType")]
        public Output<string> ConnectorType { get; private set; } = null!;

        /// <summary>
        /// The description of the Custom Connector Plugin.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the Custom Connector Plugin.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The documentation link of the Custom Connector Plugin.
        /// </summary>
        [Output("documentationLink")]
        public Output<string?> DocumentationLink { get; private set; } = null!;

        /// <summary>
        /// The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
        /// </summary>
        [Output("filename")]
        public Output<string> Filename { get; private set; } = null!;

        /// <summary>
        /// The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
        /// </summary>
        [Output("sensitiveConfigProperties")]
        public Output<ImmutableArray<string>> SensitiveConfigProperties { get; private set; } = null!;


        /// <summary>
        /// Create a CustomConnectorPlugin resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomConnectorPlugin(string name, CustomConnectorPluginArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin", name, args ?? new CustomConnectorPluginArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomConnectorPlugin(string name, Input<string> id, CustomConnectorPluginState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomConnectorPlugin resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomConnectorPlugin Get(string name, Input<string> id, CustomConnectorPluginState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomConnectorPlugin(name, id, state, options);
        }
    }

    public sealed class CustomConnectorPluginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
        /// </summary>
        [Input("connectorClass", required: true)]
        public Input<string> ConnectorClass { get; set; } = null!;

        /// <summary>
        /// The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
        /// </summary>
        [Input("connectorType", required: true)]
        public Input<string> ConnectorType { get; set; } = null!;

        /// <summary>
        /// The description of the Custom Connector Plugin.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Custom Connector Plugin.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The documentation link of the Custom Connector Plugin.
        /// </summary>
        [Input("documentationLink")]
        public Input<string>? DocumentationLink { get; set; }

        /// <summary>
        /// The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
        /// </summary>
        [Input("filename", required: true)]
        public Input<string> Filename { get; set; } = null!;

        [Input("sensitiveConfigProperties")]
        private InputList<string>? _sensitiveConfigProperties;

        /// <summary>
        /// The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
        /// </summary>
        public InputList<string> SensitiveConfigProperties
        {
            get => _sensitiveConfigProperties ?? (_sensitiveConfigProperties = new InputList<string>());
            set => _sensitiveConfigProperties = value;
        }

        public CustomConnectorPluginArgs()
        {
        }
        public static new CustomConnectorPluginArgs Empty => new CustomConnectorPluginArgs();
    }

    public sealed class CustomConnectorPluginState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
        /// </summary>
        [Input("connectorClass")]
        public Input<string>? ConnectorClass { get; set; }

        /// <summary>
        /// The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
        /// </summary>
        [Input("connectorType")]
        public Input<string>? ConnectorType { get; set; }

        /// <summary>
        /// The description of the Custom Connector Plugin.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the Custom Connector Plugin.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The documentation link of the Custom Connector Plugin.
        /// </summary>
        [Input("documentationLink")]
        public Input<string>? DocumentationLink { get; set; }

        /// <summary>
        /// The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        [Input("sensitiveConfigProperties")]
        private InputList<string>? _sensitiveConfigProperties;

        /// <summary>
        /// The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
        /// </summary>
        public InputList<string> SensitiveConfigProperties
        {
            get => _sensitiveConfigProperties ?? (_sensitiveConfigProperties = new InputList<string>());
            set => _sensitiveConfigProperties = value;
        }

        public CustomConnectorPluginState()
        {
        }
        public static new CustomConnectorPluginState Empty => new CustomConnectorPluginState();
    }
}
