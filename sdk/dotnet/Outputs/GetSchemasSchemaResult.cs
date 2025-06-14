// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetSchemasSchemaResult
    {
        /// <summary>
        /// (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
        /// </summary>
        public readonly string Format;
        /// <summary>
        /// (Required String) The schema string.
        /// </summary>
        public readonly string Schema;
        /// <summary>
        /// (Required String) The ID of the Schema, for example: `lsrc-abc123/test-subject/100003`.
        /// </summary>
        public readonly int SchemaIdentifier;
        /// <summary>
        /// (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemasSchemaSchemaReferenceResult> SchemaReferences;
        /// <summary>
        /// (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
        /// </summary>
        public readonly string SubjectName;
        /// <summary>
        /// (Required Integer) The version of the Schema, for example, `4`.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetSchemasSchemaResult(
            string format,

            string schema,

            int schemaIdentifier,

            ImmutableArray<Outputs.GetSchemasSchemaSchemaReferenceResult> schemaReferences,

            string subjectName,

            int version)
        {
            Format = format;
            Schema = schema;
            SchemaIdentifier = schemaIdentifier;
            SchemaReferences = schemaReferences;
            SubjectName = subjectName;
            Version = version;
        }
    }
}
