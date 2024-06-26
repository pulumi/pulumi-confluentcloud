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
        public readonly string? Doc;
        public readonly string? Expr;
        public readonly string? Kind;
        public readonly string? Mode;
        public readonly string? Name;
        public readonly string? OnFailure;
        public readonly string? OnSuccess;
        public readonly ImmutableDictionary<string, string>? Params;
        public readonly ImmutableArray<string> Tags;
        public readonly string? Type;

        [OutputConstructor]
        private SchemaRulesetMigrationRule(
            string? doc,

            string? expr,

            string? kind,

            string? mode,

            string? name,

            string? onFailure,

            string? onSuccess,

            ImmutableDictionary<string, string>? @params,

            ImmutableArray<string> tags,

            string? type)
        {
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
