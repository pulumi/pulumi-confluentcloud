// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class BusinessMetadataAttributeDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default value of this attribute.
        /// </summary>
        [Input("defaultValue")]
        public Input<string>? DefaultValue { get; set; }

        /// <summary>
        /// The description of this attribute.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional flag to control whether the attribute should be optional or required. The default value is `false`.
        /// </summary>
        [Input("isOptional")]
        public Input<bool>? IsOptional { get; set; }

        /// <summary>
        /// The name of the attribute.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("options")]
        private InputMap<string>? _options;

        /// <summary>
        /// (Optional Map) Block for the attribute options:
        /// </summary>
        public InputMap<string> Options
        {
            get => _options ?? (_options = new InputMap<string>());
            set => _options = value;
        }

        /// <summary>
        /// (Required String) The type of the attribute, it always returns `string`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public BusinessMetadataAttributeDefinitionArgs()
        {
        }
        public static new BusinessMetadataAttributeDefinitionArgs Empty => new BusinessMetadataAttributeDefinitionArgs();
    }
}
