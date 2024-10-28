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
    public sealed class FlinkArtifactVersion
    {
        /// <summary>
        /// The version of this Flink Artifact.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private FlinkArtifactVersion(string version)
        {
            Version = version;
        }
    }
}
