// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class FlinkArtifactVersionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The version of this Flink Artifact.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public FlinkArtifactVersionGetArgs()
        {
        }
        public static new FlinkArtifactVersionGetArgs Empty => new FlinkArtifactVersionGetArgs();
    }
}