// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class SchemaRulesetMigrationRule
    {
        /// <summary>
        /// The boolean flag to control whether the rule should be disabled. Defaults to `false`.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// An optional description of the rule. Defaults to "".
        /// </summary>
        public readonly string? Doc;
        /// <summary>
        /// The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to "".
        /// </summary>
        public readonly string? Expr;
        /// <summary>
        /// The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
        /// </summary>
        public readonly string Mode;
        public readonly string Name;
        /// <summary>
        /// An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
        /// </summary>
        public readonly string? OnFailure;
        /// <summary>
        /// An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
        /// </summary>
        public readonly string? OnSuccess;
        /// <summary>
        /// A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
        /// 
        /// &gt; **Note:** Schema rules (`ruleset`) are only available with the [Stream Governance Advanced package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages).
        /// 
        /// &gt; **Note:** The Confluent Cloud Console uses the following default values: `on_success = "NONE"` and `on_failure = "ERROR"`. However, the TF Provider sets its defaults to `on_success = "NONE,NONE"` and `on_failure = "ERROR,ERROR"`.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Params;
        /// <summary>
        /// The tags to which the rule applies, if any.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SchemaRulesetMigrationRule(
            bool? disabled,

            string? doc,

            string? expr,

            string kind,

            string mode,

            string name,

            string? onFailure,

            string? onSuccess,

            ImmutableDictionary<string, string>? @params,

            ImmutableArray<string> tags,

            string type)
        {
            Disabled = disabled;
            Doc = doc;
            Expr = expr;
            Kind = kind;
            Mode = mode;
            Name = name;
            OnFailure = onFailure;
            OnSuccess = onSuccess;
            Params = @params;
            Tags = tags;
            Type = type;
        }
    }
}
