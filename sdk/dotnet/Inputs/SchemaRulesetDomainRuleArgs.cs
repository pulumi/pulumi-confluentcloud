// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class SchemaRulesetDomainRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("doc")]
        public Input<string>? Doc { get; set; }

        [Input("expr")]
        public Input<string>? Expr { get; set; }

        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("onFailure")]
        public Input<string>? OnFailure { get; set; }

        [Input("onSuccess")]
        public Input<string>? OnSuccess { get; set; }

        [Input("params")]
        private InputMap<string>? _params;
        public InputMap<string> Params
        {
            get => _params ?? (_params = new InputMap<string>());
            set => _params = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SchemaRulesetDomainRuleArgs()
        {
        }
        public static new SchemaRulesetDomainRuleArgs Empty => new SchemaRulesetDomainRuleArgs();
    }
}
