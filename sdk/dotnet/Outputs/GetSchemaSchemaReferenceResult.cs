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
    public sealed class GetSchemaSchemaReferenceResult
    {
        /// <summary>
        /// (Optional String) A user-defined name that can be used to reference the rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
        /// </summary>
        public readonly string SubjectName;
        /// <summary>
        /// (Required Integer) The version of the Schema, for example, `4`.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSchemaSchemaReferenceResult(
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
