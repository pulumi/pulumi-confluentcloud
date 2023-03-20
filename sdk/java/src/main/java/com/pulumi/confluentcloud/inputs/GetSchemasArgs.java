// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemasCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetSchemasFilterArgs;
import com.pulumi.confluentcloud.inputs.GetSchemasSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemasArgs Empty = new GetSchemasArgs();

    @Import(name="credentials")
    private @Nullable Output<GetSchemasCredentialsArgs> credentials;

    public Optional<Output<GetSchemasCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    @Import(name="filter")
    private @Nullable Output<GetSchemasFilterArgs> filter;

    public Optional<Output<GetSchemasFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
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
    private @Nullable Output<GetSchemasSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetSchemasSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetSchemasArgs() {}

    private GetSchemasArgs(GetSchemasArgs $) {
        this.credentials = $.credentials;
        this.filter = $.filter;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemasArgs $;

        public Builder() {
            $ = new GetSchemasArgs();
        }

        public Builder(GetSchemasArgs defaults) {
            $ = new GetSchemasArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<GetSchemasCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetSchemasCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder filter(@Nullable Output<GetSchemasFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(GetSchemasFilterArgs filter) {
            return filter(Output.of(filter));
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

        public Builder schemaRegistryCluster(@Nullable Output<GetSchemasSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetSchemasSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public GetSchemasArgs build() {
            return $;
        }
    }

}
