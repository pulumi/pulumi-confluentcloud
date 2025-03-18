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
    ///     var staging = new ConfluentCloud.Environment("staging", new()
    ///     {
    ///         DisplayName = "Staging",
    ///         StreamGovernance = new ConfluentCloud.Inputs.EnvironmentStreamGovernanceArgs
    ///         {
    ///             Package = "ESSENTIALS",
    ///         },
    ///     });
    /// 
    ///     var main = new ConfluentCloud.ProviderIntegration("main", new()
    ///     {
    ///         Environment = new ConfluentCloud.Inputs.ProviderIntegrationEnvironmentArgs
    ///         {
    ///             Id = staging.Id,
    ///         },
    ///         Aws = new ConfluentCloud.Inputs.ProviderIntegrationAwsArgs
    ///         {
    ///             CustomerRoleArn = customerRoleArn,
    ///         },
    ///         DisplayName = "provider_integration_main",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Getting Started
    /// 
    /// The following end-to-end examples might help to get started with `confluentcloud.ProviderIntegration` resource:
    /// * `s3-sink-connector-assume-role`: Amazon S3 Sink Connector with IAM role-based authorization using a Provider Integration
    /// 
    /// ## Import
    /// 
    /// You can import a Provider Integration by using Environment ID and Provider Integration ID, in the format `&lt;Environment ID&gt;/&lt;Provider Integration ID&gt;`. The following example shows how to import a Provider Integration:
    /// 
    /// $ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;"
    /// 
    /// $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/providerIntegration:ProviderIntegration main env-abc123/cspi-4xg0q
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/providerIntegration:ProviderIntegration")]
    public partial class ProviderIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        /// </summary>
        [Output("aws")]
        public Output<Outputs.ProviderIntegrationAws?> Aws { get; private set; } = null!;

        /// <summary>
        /// The name of the Provider Integration.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.ProviderIntegrationEnvironment> Environment { get; private set; } = null!;

        /// <summary>
        /// (Required List of Strings) List of resource CRNs where this provider integration is being used.
        /// </summary>
        [Output("usages")]
        public Output<ImmutableArray<string>> Usages { get; private set; } = null!;


        /// <summary>
        /// Create a ProviderIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProviderIntegration(string name, ProviderIntegrationArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/providerIntegration:ProviderIntegration", name, args ?? new ProviderIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProviderIntegration(string name, Input<string> id, ProviderIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/providerIntegration:ProviderIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProviderIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProviderIntegration Get(string name, Input<string> id, ProviderIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ProviderIntegration(name, id, state, options);
        }
    }

    public sealed class ProviderIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.ProviderIntegrationAwsArgs>? Aws { get; set; }

        /// <summary>
        /// The name of the Provider Integration.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.ProviderIntegrationEnvironmentArgs> Environment { get; set; } = null!;

        public ProviderIntegrationArgs()
        {
        }
        public static new ProviderIntegrationArgs Empty => new ProviderIntegrationArgs();
    }

    public sealed class ProviderIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
        /// </summary>
        [Input("aws")]
        public Input<Inputs.ProviderIntegrationAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// The name of the Provider Integration.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.ProviderIntegrationEnvironmentGetArgs>? Environment { get; set; }

        [Input("usages")]
        private InputList<string>? _usages;

        /// <summary>
        /// (Required List of Strings) List of resource CRNs where this provider integration is being used.
        /// </summary>
        public InputList<string> Usages
        {
            get => _usages ?? (_usages = new InputList<string>());
            set => _usages = value;
        }

        public ProviderIntegrationState()
        {
        }
        public static new ProviderIntegrationState Empty => new ProviderIntegrationState();
    }
}
