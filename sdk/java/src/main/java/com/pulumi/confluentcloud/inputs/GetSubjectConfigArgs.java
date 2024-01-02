// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSubjectConfigCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetSubjectConfigSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubjectConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubjectConfigArgs Empty = new GetSubjectConfigArgs();

    @Import(name="credentials")
    private @Nullable Output<GetSubjectConfigCredentialsArgs> credentials;

    public Optional<Output<GetSubjectConfigCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable Output<GetSubjectConfigSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetSubjectConfigSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     */
    @Import(name="subjectName", required=true)
    private Output<String> subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     * 
     */
    public Output<String> subjectName() {
        return this.subjectName;
    }

    private GetSubjectConfigArgs() {}

    private GetSubjectConfigArgs(GetSubjectConfigArgs $) {
        this.credentials = $.credentials;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubjectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubjectConfigArgs $;

        public Builder() {
            $ = new GetSubjectConfigArgs();
        }

        public Builder(GetSubjectConfigArgs defaults) {
            $ = new GetSubjectConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<GetSubjectConfigCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetSubjectConfigCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public Builder schemaRegistryCluster(@Nullable Output<GetSubjectConfigSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetSubjectConfigSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        public GetSubjectConfigArgs build() {
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSubjectConfigArgs", "subjectName");
            }
            return $;
        }
    }

}
