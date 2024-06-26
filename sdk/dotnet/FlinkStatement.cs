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
    /// ## Import
    /// 
    /// You can import a Flink statement by using the Flink Statement name, for example:
    /// 
    /// Option #1: Manage multiple Flink Compute Pools in the same Terraform workspace
    /// 
    /// $ export IMPORT_CONFLUENT_ORGANIZATION_ID="&lt;organization_id&gt;"
    /// 
    /// $ export IMPORT_CONFLUENT_ENVIRONMENT_ID="&lt;environment_id&gt;"
    /// 
    /// $ export IMPORT_FLINK_COMPUTE_POOL_ID="&lt;flink_compute_pool_id&gt;"
    /// 
    /// $ export IMPORT_FLINK_API_KEY="&lt;flink_api_key&gt;"
    /// 
    /// $ export IMPORT_FLINK_API_SECRET="&lt;flink_api_secret&gt;"
    /// 
    /// $ export IMPORT_FLINK_REST_ENDPOINT="&lt;flink_rest_endpoint&gt;"
    /// 
    /// $ export IMPORT_FLINK_PRINCIPAL_ID="&lt;flink_rest_endpoint&gt;"
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
    /// ```
    /// 
    /// Option #2: Manage a single Flink Compute Pool in the same Terraform workspace
    /// 
    /// ```sh
    /// $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
    /// ```
    /// 
    /// !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/flinkStatement:FlinkStatement")]
    public partial class FlinkStatement : global::Pulumi.CustomResource
    {
        [Output("computePool")]
        public Output<Outputs.FlinkStatementComputePool> ComputePool { get; private set; } = null!;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.FlinkStatementCredentials?> Credentials { get; private set; } = null!;

        [Output("environment")]
        public Output<Outputs.FlinkStatementEnvironment> Environment { get; private set; } = null!;

        [Output("organization")]
        public Output<Outputs.FlinkStatementOrganization> Organization { get; private set; } = null!;

        [Output("principal")]
        public Output<Outputs.FlinkStatementPrincipal> Principal { get; private set; } = null!;

        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, string>> Properties { get; private set; } = null!;

        /// <summary>
        /// The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
        /// </summary>
        [Output("restEndpoint")]
        public Output<string?> RestEndpoint { get; private set; } = null!;

        /// <summary>
        /// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;

        /// <summary>
        /// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
        /// </summary>
        [Output("statementName")]
        public Output<string> StatementName { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the statement should be stopped.
        /// </summary>
        [Output("stopped")]
        public Output<bool> Stopped { get; private set; } = null!;


        /// <summary>
        /// Create a FlinkStatement resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlinkStatement(string name, FlinkStatementArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/flinkStatement:FlinkStatement", name, args ?? new FlinkStatementArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlinkStatement(string name, Input<string> id, FlinkStatementState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/flinkStatement:FlinkStatement", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FlinkStatement resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlinkStatement Get(string name, Input<string> id, FlinkStatementState? state = null, CustomResourceOptions? options = null)
        {
            return new FlinkStatement(name, id, state, options);
        }
    }

    public sealed class FlinkStatementArgs : global::Pulumi.ResourceArgs
    {
        [Input("computePool")]
        public Input<Inputs.FlinkStatementComputePoolArgs>? ComputePool { get; set; }

        [Input("credentials")]
        private Input<Inputs.FlinkStatementCredentialsArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.FlinkStatementCredentialsArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.FlinkStatementCredentialsArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("environment")]
        public Input<Inputs.FlinkStatementEnvironmentArgs>? Environment { get; set; }

        [Input("organization")]
        public Input<Inputs.FlinkStatementOrganizationArgs>? Organization { get; set; }

        [Input("principal")]
        public Input<Inputs.FlinkStatementPrincipalArgs>? Principal { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        /// <summary>
        /// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
        /// </summary>
        [Input("statementName")]
        public Input<string>? StatementName { get; set; }

        /// <summary>
        /// Indicates whether the statement should be stopped.
        /// </summary>
        [Input("stopped")]
        public Input<bool>? Stopped { get; set; }

        public FlinkStatementArgs()
        {
        }
        public static new FlinkStatementArgs Empty => new FlinkStatementArgs();
    }

    public sealed class FlinkStatementState : global::Pulumi.ResourceArgs
    {
        [Input("computePool")]
        public Input<Inputs.FlinkStatementComputePoolGetArgs>? ComputePool { get; set; }

        [Input("credentials")]
        private Input<Inputs.FlinkStatementCredentialsGetArgs>? _credentials;

        /// <summary>
        /// The Cluster API Credentials.
        /// </summary>
        public Input<Inputs.FlinkStatementCredentialsGetArgs>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<Inputs.FlinkStatementCredentialsGetArgs>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("environment")]
        public Input<Inputs.FlinkStatementEnvironmentGetArgs>? Environment { get; set; }

        [Input("organization")]
        public Input<Inputs.FlinkStatementOrganizationGetArgs>? Organization { get; set; }

        [Input("principal")]
        public Input<Inputs.FlinkStatementPrincipalGetArgs>? Principal { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// The custom topic settings to set:
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
        /// </summary>
        [Input("restEndpoint")]
        public Input<string>? RestEndpoint { get; set; }

        /// <summary>
        /// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        /// <summary>
        /// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
        /// </summary>
        [Input("statementName")]
        public Input<string>? StatementName { get; set; }

        /// <summary>
        /// Indicates whether the statement should be stopped.
        /// </summary>
        [Input("stopped")]
        public Input<bool>? Stopped { get; set; }

        public FlinkStatementState()
        {
        }
        public static new FlinkStatementState Empty => new FlinkStatementState();
    }
}
