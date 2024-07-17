// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class SchemaMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// The custom properties to set:
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("sensitives")]
        private InputList<string>? _sensitives;

        /// <summary>
        /// A list of metadata properties to be encrypted.
        /// </summary>
        public InputList<string> Sensitives
        {
            get => _sensitives ?? (_sensitives = new InputList<string>());
            set => _sensitives = value;
        }

        [Input("tags")]
        private InputList<Inputs.SchemaMetadataTagGetArgs>? _tags;

        /// <summary>
        /// The tags to which the rule applies, if any.
        /// </summary>
        public InputList<Inputs.SchemaMetadataTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SchemaMetadataTagGetArgs>());
            set => _tags = value;
        }

        public SchemaMetadataGetArgs()
        {
        }
        public static new SchemaMetadataGetArgs Empty => new SchemaMetadataGetArgs();
    }
}
