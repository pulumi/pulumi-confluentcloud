// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.SchemaCredentialsArgs;
import com.pulumi.confluentcloud.inputs.SchemaMetadataArgs;
import com.pulumi.confluentcloud.inputs.SchemaRulesetArgs;
import com.pulumi.confluentcloud.inputs.SchemaSchemaReferenceArgs;
import com.pulumi.confluentcloud.inputs.SchemaSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<SchemaCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<SchemaCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The format of the Schema.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The format of the Schema.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * Controls whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on
     * destroy. Defaults to `false` (soft delete).
     * 
     */
    @Import(name="hardDelete")
    private @Nullable Output<Boolean> hardDelete;

    /**
     * @return Controls whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on
     * destroy. Defaults to `false` (soft delete).
     * 
     */
    public Optional<Output<Boolean>> hardDelete() {
        return Optional.ofNullable(this.hardDelete);
    }

    @Import(name="metadata")
    private @Nullable Output<SchemaMetadataArgs> metadata;

    public Optional<Output<SchemaMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Controls whether a schema should be recreated on update.
     * 
     */
    @Import(name="recreateOnUpdate")
    private @Nullable Output<Boolean> recreateOnUpdate;

    /**
     * @return Controls whether a schema should be recreated on update.
     * 
     */
    public Optional<Output<Boolean>> recreateOnUpdate() {
        return Optional.ofNullable(this.recreateOnUpdate);
    }

    /**
     * The REST endpoint of the Schema Registry cluster. For example, for public networking: `https://psrc-00000.us-central1.gcp.confluent.cloud`. In the case of private networking, the endpoint might look like `https://lsrc-abc123.pr1jy6.us-east-2.aws.confluent.cloud`. You can construct it using either:
     * - `data.confluent_schema_registry_cluster.essentials.private_regional_rest_endpoints[&#34;us-east-2&#34;]`, or
     * - `https://${data.confluent_schema_registry_cluster.essentials.id}${data.confluent_network.main.endpoint_suffix}`
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster. For example, for public networking: `https://psrc-00000.us-central1.gcp.confluent.cloud`. In the case of private networking, the endpoint might look like `https://lsrc-abc123.pr1jy6.us-east-2.aws.confluent.cloud`. You can construct it using either:
     * - `data.confluent_schema_registry_cluster.essentials.private_regional_rest_endpoints[&#34;us-east-2&#34;]`, or
     * - `https://${data.confluent_schema_registry_cluster.essentials.id}${data.confluent_network.main.endpoint_suffix}`
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="ruleset")
    private @Nullable Output<SchemaRulesetArgs> ruleset;

    public Optional<Output<SchemaRulesetArgs>> ruleset() {
        return Optional.ofNullable(this.ruleset);
    }

    /**
     * The definition of the Schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The definition of the Schema.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The list of references to other Schemas.
     * 
     */
    @Import(name="schemaReferences")
    private @Nullable Output<List<SchemaSchemaReferenceArgs>> schemaReferences;

    /**
     * @return The list of references to other Schemas.
     * 
     */
    public Optional<Output<List<SchemaSchemaReferenceArgs>>> schemaReferences() {
        return Optional.ofNullable(this.schemaReferences);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable Output<SchemaSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<SchemaSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    @Import(name="skipValidationDuringPlan")
    private @Nullable Output<Boolean> skipValidationDuringPlan;

    public Optional<Output<Boolean>> skipValidationDuringPlan() {
        return Optional.ofNullable(this.skipValidationDuringPlan);
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

    private SchemaArgs() {}

    private SchemaArgs(SchemaArgs $) {
        this.credentials = $.credentials;
        this.format = $.format;
        this.hardDelete = $.hardDelete;
        this.metadata = $.metadata;
        this.recreateOnUpdate = $.recreateOnUpdate;
        this.restEndpoint = $.restEndpoint;
        this.ruleset = $.ruleset;
        this.schema = $.schema;
        this.schemaReferences = $.schemaReferences;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.skipValidationDuringPlan = $.skipValidationDuringPlan;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaArgs $;

        public Builder() {
            $ = new SchemaArgs();
        }

        public Builder(SchemaArgs defaults) {
            $ = new SchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<SchemaCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(SchemaCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param format The format of the Schema.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the Schema.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param hardDelete Controls whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on
         * destroy. Defaults to `false` (soft delete).
         * 
         * @return builder
         * 
         */
        public Builder hardDelete(@Nullable Output<Boolean> hardDelete) {
            $.hardDelete = hardDelete;
            return this;
        }

        /**
         * @param hardDelete Controls whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on
         * destroy. Defaults to `false` (soft delete).
         * 
         * @return builder
         * 
         */
        public Builder hardDelete(Boolean hardDelete) {
            return hardDelete(Output.of(hardDelete));
        }

        public Builder metadata(@Nullable Output<SchemaMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(SchemaMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param recreateOnUpdate Controls whether a schema should be recreated on update.
         * 
         * @return builder
         * 
         */
        public Builder recreateOnUpdate(@Nullable Output<Boolean> recreateOnUpdate) {
            $.recreateOnUpdate = recreateOnUpdate;
            return this;
        }

        /**
         * @param recreateOnUpdate Controls whether a schema should be recreated on update.
         * 
         * @return builder
         * 
         */
        public Builder recreateOnUpdate(Boolean recreateOnUpdate) {
            return recreateOnUpdate(Output.of(recreateOnUpdate));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster. For example, for public networking: `https://psrc-00000.us-central1.gcp.confluent.cloud`. In the case of private networking, the endpoint might look like `https://lsrc-abc123.pr1jy6.us-east-2.aws.confluent.cloud`. You can construct it using either:
         * - `data.confluent_schema_registry_cluster.essentials.private_regional_rest_endpoints[&#34;us-east-2&#34;]`, or
         * - `https://${data.confluent_schema_registry_cluster.essentials.id}${data.confluent_network.main.endpoint_suffix}`
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster. For example, for public networking: `https://psrc-00000.us-central1.gcp.confluent.cloud`. In the case of private networking, the endpoint might look like `https://lsrc-abc123.pr1jy6.us-east-2.aws.confluent.cloud`. You can construct it using either:
         * - `data.confluent_schema_registry_cluster.essentials.private_regional_rest_endpoints[&#34;us-east-2&#34;]`, or
         * - `https://${data.confluent_schema_registry_cluster.essentials.id}${data.confluent_network.main.endpoint_suffix}`
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public Builder ruleset(@Nullable Output<SchemaRulesetArgs> ruleset) {
            $.ruleset = ruleset;
            return this;
        }

        public Builder ruleset(SchemaRulesetArgs ruleset) {
            return ruleset(Output.of(ruleset));
        }

        /**
         * @param schema The definition of the Schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The definition of the Schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param schemaReferences The list of references to other Schemas.
         * 
         * @return builder
         * 
         */
        public Builder schemaReferences(@Nullable Output<List<SchemaSchemaReferenceArgs>> schemaReferences) {
            $.schemaReferences = schemaReferences;
            return this;
        }

        /**
         * @param schemaReferences The list of references to other Schemas.
         * 
         * @return builder
         * 
         */
        public Builder schemaReferences(List<SchemaSchemaReferenceArgs> schemaReferences) {
            return schemaReferences(Output.of(schemaReferences));
        }

        /**
         * @param schemaReferences The list of references to other Schemas.
         * 
         * @return builder
         * 
         */
        public Builder schemaReferences(SchemaSchemaReferenceArgs... schemaReferences) {
            return schemaReferences(List.of(schemaReferences));
        }

        public Builder schemaRegistryCluster(@Nullable Output<SchemaSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(SchemaSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public Builder skipValidationDuringPlan(@Nullable Output<Boolean> skipValidationDuringPlan) {
            $.skipValidationDuringPlan = skipValidationDuringPlan;
            return this;
        }

        public Builder skipValidationDuringPlan(Boolean skipValidationDuringPlan) {
            return skipValidationDuringPlan(Output.of(skipValidationDuringPlan));
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

        public SchemaArgs build() {
            if ($.format == null) {
                throw new MissingRequiredPropertyException("SchemaArgs", "format");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("SchemaArgs", "subjectName");
            }
            return $;
        }
    }

}
