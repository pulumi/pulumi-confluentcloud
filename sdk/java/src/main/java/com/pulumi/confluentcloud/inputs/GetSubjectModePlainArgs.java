// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSubjectModeCredentials;
import com.pulumi.confluentcloud.inputs.GetSubjectModeSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubjectModePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubjectModePlainArgs Empty = new GetSubjectModePlainArgs();

    @Import(name="credentials")
    private @Nullable GetSubjectModeCredentials credentials;

    public Optional<GetSubjectModeCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
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

    @Import(name="schemaRegistryCluster")
    private @Nullable GetSubjectModeSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetSubjectModeSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    @Import(name="subjectName", required=true)
    private String subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }

    private GetSubjectModePlainArgs() {}

    private GetSubjectModePlainArgs(GetSubjectModePlainArgs $) {
        this.credentials = $.credentials;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubjectModePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubjectModePlainArgs $;

        public Builder() {
            $ = new GetSubjectModePlainArgs();
        }

        public Builder(GetSubjectModePlainArgs defaults) {
            $ = new GetSubjectModePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetSubjectModeCredentials credentials) {
            $.credentials = credentials;
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

        public Builder schemaRegistryCluster(@Nullable GetSubjectModeSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        public GetSubjectModePlainArgs build() {
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSubjectModePlainArgs", "subjectName");
            }
            return $;
        }
    }

}
