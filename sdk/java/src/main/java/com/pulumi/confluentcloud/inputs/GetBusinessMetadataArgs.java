// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetBusinessMetadataCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetBusinessMetadataSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBusinessMetadataArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessMetadataArgs Empty = new GetBusinessMetadataArgs();

    @Import(name="credentials")
    private @Nullable Output<GetBusinessMetadataCredentialsArgs> credentials;

    public Optional<Output<GetBusinessMetadataCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The name of the Business Metadata, for example, `PII`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Business Metadata, for example, `PII`.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    private @Nullable Output<GetBusinessMetadataSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetBusinessMetadataSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetBusinessMetadataArgs() {}

    private GetBusinessMetadataArgs(GetBusinessMetadataArgs $) {
        this.credentials = $.credentials;
        this.name = $.name;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessMetadataArgs $;

        public Builder() {
            $ = new GetBusinessMetadataArgs();
        }

        public Builder(GetBusinessMetadataArgs defaults) {
            $ = new GetBusinessMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<GetBusinessMetadataCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetBusinessMetadataCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param name The name of the Business Metadata, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Business Metadata, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public Builder schemaRegistryCluster(@Nullable Output<GetBusinessMetadataSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetBusinessMetadataSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public GetBusinessMetadataArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}