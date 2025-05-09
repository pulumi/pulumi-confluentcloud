// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SchemaSchemaReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaSchemaReferenceArgs Empty = new SchemaSchemaReferenceArgs();

    /**
     * The name of the Schema references (for example, &#34;io.confluent.kafka.example.User&#34;). For Avro, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf, it is the name of another Protobuf file.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Schema references (for example, &#34;io.confluent.kafka.example.User&#34;). For Avro, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf, it is the name of another Protobuf file.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    @Import(name="subjectName", required=true)
    private Output<String> subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    public Output<String> subjectName() {
        return this.subjectName;
    }

    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    @Import(name="version", required=true)
    private Output<Integer> version;

    /**
     * @return (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    private SchemaSchemaReferenceArgs() {}

    private SchemaSchemaReferenceArgs(SchemaSchemaReferenceArgs $) {
        this.name = $.name;
        this.subjectName = $.subjectName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaSchemaReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaSchemaReferenceArgs $;

        public Builder() {
            $ = new SchemaSchemaReferenceArgs();
        }

        public Builder(SchemaSchemaReferenceArgs defaults) {
            $ = new SchemaSchemaReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Schema references (for example, &#34;io.confluent.kafka.example.User&#34;). For Avro, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf, it is the name of another Protobuf file.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Schema references (for example, &#34;io.confluent.kafka.example.User&#34;). For Avro, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf, it is the name of another Protobuf file.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        /**
         * @param version (Required Integer) The version of the Schema, for example, `4`.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version (Required Integer) The version of the Schema, for example, `4`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public SchemaSchemaReferenceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SchemaSchemaReferenceArgs", "name");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("SchemaSchemaReferenceArgs", "subjectName");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("SchemaSchemaReferenceArgs", "version");
            }
            return $;
        }
    }

}
