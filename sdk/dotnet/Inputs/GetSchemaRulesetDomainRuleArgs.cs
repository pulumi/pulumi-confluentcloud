// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class GetSchemaRulesetDomainRuleInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional String) An optional description.
        /// </summary>
        [Input("doc", required: true)]
        public Input<string> Doc { get; set; } = null!;

        /// <summary>
        /// (Optional String) The body of the rule, which is optional.
        /// </summary>
        [Input("expr", required: true)]
        public Input<string> Expr { get; set; } = null!;

        /// <summary>
        /// (Optional String) Either `CONDITION` or `TRANSFORM`.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// (Optional String) The mode of the rule.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// (Optional String) A user-defined name that can be used to reference the rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
        /// </summary>
        [Input("onFailure", required: true)]
        public Input<string> OnFailure { get; set; } = null!;

        /// <summary>
        /// (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
        /// </summary>
        [Input("onSuccess", required: true)]
        public Input<string> OnSuccess { get; set; } = null!;

        [Input("params", required: true)]
        private InputMap<string>? _params;

        /// <summary>
        /// (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
        /// </summary>
        public InputMap<string> Params
        {
            get => _params ?? (_params = new InputMap<string>());
            set => _params = value;
        }

        [Input("tags", required: true)]
        private InputList<string>? _tags;

        /// <summary>
        /// (Optional String List) The tags to which the rule applies, if any.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetSchemaRulesetDomainRuleInputArgs()
        {
        }
        public static new GetSchemaRulesetDomainRuleInputArgs Empty => new GetSchemaRulesetDomainRuleInputArgs();
    }
}
