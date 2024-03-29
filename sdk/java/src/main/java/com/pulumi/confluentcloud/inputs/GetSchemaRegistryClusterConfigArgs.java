// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaRegistryClusterConfigCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRegistryClusterConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryClusterConfigArgs Empty = new GetSchemaRegistryClusterConfigArgs();

    @Import(name="credentials")
    private @Nullable Output<GetSchemaRegistryClusterConfigCredentialsArgs> credentials;

    public Optional<Output<GetSchemaRegistryClusterConfigCredentialsArgs>> credentials() {
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
    private @Nullable Output<GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetSchemaRegistryClusterConfigArgs() {}

    private GetSchemaRegistryClusterConfigArgs(GetSchemaRegistryClusterConfigArgs $) {
        this.credentials = $.credentials;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryClusterConfigArgs $;

        public Builder() {
            $ = new GetSchemaRegistryClusterConfigArgs();
        }

        public Builder(GetSchemaRegistryClusterConfigArgs defaults) {
            $ = new GetSchemaRegistryClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<GetSchemaRegistryClusterConfigCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetSchemaRegistryClusterConfigCredentialsArgs credentials) {
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

        public Builder schemaRegistryCluster(@Nullable Output<GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetSchemaRegistryClusterConfigSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public GetSchemaRegistryClusterConfigArgs build() {
            return $;
        }
    }

}
