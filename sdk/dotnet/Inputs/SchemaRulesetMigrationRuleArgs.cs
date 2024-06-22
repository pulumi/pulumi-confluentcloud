// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class SchemaRulesetMigrationRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("doc")]
        public Input<string>? Doc { get; set; }

        [Input("expr")]
        public Input<string>? Expr { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

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

        [Input("type")]
        public Input<string>? Type { get; set; }

        public SchemaRulesetMigrationRuleArgs()
        {
        }
        public static new SchemaRulesetMigrationRuleArgs Empty => new SchemaRulesetMigrationRuleArgs();
    }
}