// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class SchemaRulesetMigrationRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The boolean flag to control whether the rule should be disabled. Defaults to `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// An optional description of the rule. Defaults to "".
        /// </summary>
        [Input("doc")]
        public Input<string>? Doc { get; set; }

        /// <summary>
        /// The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to "".
        /// </summary>
        [Input("expr")]
        public Input<string>? Expr { get; set; }

        /// <summary>
        /// The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
        /// </summary>
        [Input("onFailure")]
        public Input<string>? OnFailure { get; set; }

        /// <summary>
        /// An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
        /// </summary>
        [Input("onSuccess")]
        public Input<string>? OnSuccess { get; set; }

        [Input("params")]
        private InputMap<string>? _params;

        /// <summary>
        /// A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
        /// 
        /// &gt; **Note:** Schema rules (`ruleset`) are only available with the [Stream Governance Advanced package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages).
        /// 
        /// &gt; **Note:** The Confluent Cloud Console uses the following default values: `on_success = "NONE"` and `on_failure = "ERROR"`. However, the TF Provider sets its defaults to `on_success = "NONE,NONE"` and `on_failure = "ERROR,ERROR"`.
        /// </summary>
        public InputMap<string> Params
        {
            get => _params ?? (_params = new InputMap<string>());
            set => _params = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags to which the rule applies, if any.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SchemaRulesetMigrationRuleGetArgs()
        {
        }
        public static new SchemaRulesetMigrationRuleGetArgs Empty => new SchemaRulesetMigrationRuleGetArgs();
    }
}
