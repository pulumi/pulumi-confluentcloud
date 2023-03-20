// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemasSchemaSchemaReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSchemasSchema {
    /**
     * @return (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     * 
     */
    private String format;
    /**
     * @return (Required String) The schema string.
     * 
     */
    private String schema;
    /**
     * @return (Required String) The ID of the Schema, for example: `lsrc-abc123/test-subject/100003`.
     * 
     */
    private Integer schemaIdentifier;
    /**
     * @return (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     * 
     */
    private List<GetSchemasSchemaSchemaReference> schemaReferences;
    /**
     * @return (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     * 
     */
    private String subjectName;
    /**
     * @return (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    private Integer version;

    private GetSchemasSchema() {}
    /**
     * @return (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return (Required String) The schema string.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return (Required String) The ID of the Schema, for example: `lsrc-abc123/test-subject/100003`.
     * 
     */
    public Integer schemaIdentifier() {
        return this.schemaIdentifier;
    }
    /**
     * @return (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     * 
     */
    public List<GetSchemasSchemaSchemaReference> schemaReferences() {
        return this.schemaReferences;
    }
    /**
     * @return (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }
    /**
     * @return (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String format;
        private String schema;
        private Integer schemaIdentifier;
        private List<GetSchemasSchemaSchemaReference> schemaReferences;
        private String subjectName;
        private Integer version;
        public Builder() {}
        public Builder(GetSchemasSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.schema = defaults.schema;
    	      this.schemaIdentifier = defaults.schemaIdentifier;
    	      this.schemaReferences = defaults.schemaReferences;
    	      this.subjectName = defaults.subjectName;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder schemaIdentifier(Integer schemaIdentifier) {
            this.schemaIdentifier = Objects.requireNonNull(schemaIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder schemaReferences(List<GetSchemasSchemaSchemaReference> schemaReferences) {
            this.schemaReferences = Objects.requireNonNull(schemaReferences);
            return this;
        }
        public Builder schemaReferences(GetSchemasSchemaSchemaReference... schemaReferences) {
            return schemaReferences(List.of(schemaReferences));
        }
        @CustomType.Setter
        public Builder subjectName(String subjectName) {
            this.subjectName = Objects.requireNonNull(subjectName);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetSchemasSchema build() {
            final var o = new GetSchemasSchema();
            o.format = format;
            o.schema = schema;
            o.schemaIdentifier = schemaIdentifier;
            o.schemaReferences = schemaReferences;
            o.subjectName = subjectName;
            o.version = version;
            return o;
        }
    }
}
