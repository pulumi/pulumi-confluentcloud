// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetBusinessMetadataCredentials;
import com.pulumi.confluentcloud.inputs.GetBusinessMetadataSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBusinessMetadataPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessMetadataPlainArgs Empty = new GetBusinessMetadataPlainArgs();

    @Import(name="credentials")
    private @Nullable GetBusinessMetadataCredentials credentials;

    public Optional<GetBusinessMetadataCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The name of the Business Metadata, for example, `PII`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Business Metadata, for example, `PII`.
     * 
     */
    public String name() {
        return this.name;
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
    private @Nullable GetBusinessMetadataSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetBusinessMetadataSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetBusinessMetadataPlainArgs() {}

    private GetBusinessMetadataPlainArgs(GetBusinessMetadataPlainArgs $) {
        this.credentials = $.credentials;
        this.name = $.name;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessMetadataPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessMetadataPlainArgs $;

        public Builder() {
            $ = new GetBusinessMetadataPlainArgs();
        }

        public Builder(GetBusinessMetadataPlainArgs defaults) {
            $ = new GetBusinessMetadataPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetBusinessMetadataCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param name The name of the Business Metadata, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
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

        public Builder schemaRegistryCluster(@Nullable GetBusinessMetadataSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public GetBusinessMetadataPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
