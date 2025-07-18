// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetSchemaRulesetMigrationRuleResult
    {
        /// <summary>
        /// (Optional Boolean) The boolean flag to control whether the rule should be disabled.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// (Optional String) An optional description of the rule.
        /// </summary>
        public readonly string? Doc;
        /// <summary>
        /// (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to "".
        /// </summary>
        public readonly string? Expr;
        /// <summary>
        /// (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// (Required String) A user-defined name that can be used to reference the rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
        /// </summary>
        public readonly string? OnFailure;
        /// <summary>
        /// (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
        /// </summary>
        public readonly string? OnSuccess;
        /// <summary>
        /// (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Params;
        /// <summary>
        /// (Optional String List) The tags to which the rule applies, if any.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetSchemaRulesetMigrationRuleResult(
            bool? disabled,

            string? doc,

            string? expr,

            string kind,

            string mode,

            string name,

            string? onFailure,

            string? onSuccess,

            ImmutableDictionary<string, string> @params,

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
