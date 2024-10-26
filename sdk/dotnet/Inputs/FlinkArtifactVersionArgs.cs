// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class FlinkArtifactVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The version of this Flink Artifact.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public FlinkArtifactVersionArgs()
        {
        }
        public static new FlinkArtifactVersionArgs Empty => new FlinkArtifactVersionArgs();
    }
}
