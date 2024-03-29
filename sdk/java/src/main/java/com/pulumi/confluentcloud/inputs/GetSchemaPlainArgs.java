// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaCredentials;
import com.pulumi.confluentcloud.inputs.GetSchemaMetadata;
import com.pulumi.confluentcloud.inputs.GetSchemaRuleset;
import com.pulumi.confluentcloud.inputs.GetSchemaSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaPlainArgs Empty = new GetSchemaPlainArgs();

    @Import(name="credentials")
    private @Nullable GetSchemaCredentials credentials;

    public Optional<GetSchemaCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     * 
     */
    @Import(name="metadata")
    private @Nullable GetSchemaMetadata metadata;

    /**
     * @return (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     * 
     */
    public Optional<GetSchemaMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable String restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     * 
     */
    @Import(name="ruleset")
    private @Nullable GetSchemaRuleset ruleset;

    /**
     * @return (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     * 
     */
    public Optional<GetSchemaRuleset> ruleset() {
        return Optional.ofNullable(this.ruleset);
    }

    /**
     * The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    @Import(name="schemaIdentifier", required=true)
    private Integer schemaIdentifier;

    /**
     * @return The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public Integer schemaIdentifier() {
        return this.schemaIdentifier;
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable GetSchemaSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetSchemaSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    @Import(name="subjectName", required=true)
    private String subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }

    private GetSchemaPlainArgs() {}

    private GetSchemaPlainArgs(GetSchemaPlainArgs $) {
        this.credentials = $.credentials;
        this.metadata = $.metadata;
        this.restEndpoint = $.restEndpoint;
        this.ruleset = $.ruleset;
        this.schemaIdentifier = $.schemaIdentifier;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaPlainArgs $;

        public Builder() {
            $ = new GetSchemaPlainArgs();
        }

        public Builder(GetSchemaPlainArgs defaults) {
            $ = new GetSchemaPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetSchemaCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param metadata (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable GetSchemaMetadata metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable String restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param ruleset (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
         * 
         * @return builder
         * 
         */
        public Builder ruleset(@Nullable GetSchemaRuleset ruleset) {
            $.ruleset = ruleset;
            return this;
        }

        /**
         * @param schemaIdentifier The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder schemaIdentifier(Integer schemaIdentifier) {
            $.schemaIdentifier = schemaIdentifier;
            return this;
        }

        public Builder schemaRegistryCluster(@Nullable GetSchemaSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        public GetSchemaPlainArgs build() {
            if ($.schemaIdentifier == null) {
                throw new MissingRequiredPropertyException("GetSchemaPlainArgs", "schemaIdentifier");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSchemaPlainArgs", "subjectName");
            }
            return $;
        }
    }

}
