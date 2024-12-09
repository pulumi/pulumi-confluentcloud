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
    public sealed class GetSchemasSchemaSchemaReferenceResult
    {
        /// <summary>
        /// (Required String) The name of the subject, representing the subject under which the referenced schema is registered.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
        /// </summary>
        public readonly string SubjectName;
        /// <summary>
        /// (Required Integer) The version of the Schema, for example, `4`.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSchemasSchemaSchemaReferenceResult(
            string name,

            string subjectName,

            int version)
        {
            Name = name;
            SubjectName = subjectName;
            Version = version;
        }
    }
}