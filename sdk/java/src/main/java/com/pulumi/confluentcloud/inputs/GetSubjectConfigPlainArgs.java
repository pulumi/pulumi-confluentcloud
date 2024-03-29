// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSubjectConfigCredentials;
import com.pulumi.confluentcloud.inputs.GetSubjectConfigSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubjectConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubjectConfigPlainArgs Empty = new GetSubjectConfigPlainArgs();

    @Import(name="credentials")
    private @Nullable GetSubjectConfigCredentials credentials;

    public Optional<GetSubjectConfigCredentials> credentials() {
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
    private @Nullable GetSubjectConfigSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetSubjectConfigSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     */
    @Import(name="subjectName", required=true)
    private String subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }

    private GetSubjectConfigPlainArgs() {}

    private GetSubjectConfigPlainArgs(GetSubjectConfigPlainArgs $) {
        this.credentials = $.credentials;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubjectConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubjectConfigPlainArgs $;

        public Builder() {
            $ = new GetSubjectConfigPlainArgs();
        }

        public Builder(GetSubjectConfigPlainArgs defaults) {
            $ = new GetSubjectConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetSubjectConfigCredentials credentials) {
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

        public Builder schemaRegistryCluster(@Nullable GetSubjectConfigSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        public GetSubjectConfigPlainArgs build() {
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSubjectConfigPlainArgs", "subjectName");
            }
            return $;
        }
    }

}
