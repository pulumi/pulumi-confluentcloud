// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.ClusterLinkDestinationKafkaClusterCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLinkDestinationKafkaClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLinkDestinationKafkaClusterArgs Empty = new ClusterLinkDestinationKafkaClusterArgs();

    /**
     * The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    @Import(name="bootstrapEndpoint")
    private @Nullable Output<String> bootstrapEndpoint;

    /**
     * @return The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    public Optional<Output<String>> bootstrapEndpoint() {
        return Optional.ofNullable(this.bootstrapEndpoint);
    }

    /**
     * The Kafka API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<ClusterLinkDestinationKafkaClusterCredentialsArgs> credentials;

    /**
     * @return The Kafka API Credentials.
     * 
     */
    public Optional<Output<ClusterLinkDestinationKafkaClusterCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The ID of the remote Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the remote Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    private ClusterLinkDestinationKafkaClusterArgs() {}

    private ClusterLinkDestinationKafkaClusterArgs(ClusterLinkDestinationKafkaClusterArgs $) {
        this.bootstrapEndpoint = $.bootstrapEndpoint;
        this.credentials = $.credentials;
        this.id = $.id;
        this.restEndpoint = $.restEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLinkDestinationKafkaClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLinkDestinationKafkaClusterArgs $;

        public Builder() {
            $ = new ClusterLinkDestinationKafkaClusterArgs();
        }

        public Builder(ClusterLinkDestinationKafkaClusterArgs defaults) {
            $ = new ClusterLinkDestinationKafkaClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootstrapEndpoint The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
         * 
         * @return builder
         * 
         */
        public Builder bootstrapEndpoint(@Nullable Output<String> bootstrapEndpoint) {
            $.bootstrapEndpoint = bootstrapEndpoint;
            return this;
        }

        /**
         * @param bootstrapEndpoint The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
         * 
         * @return builder
         * 
         */
        public Builder bootstrapEndpoint(String bootstrapEndpoint) {
            return bootstrapEndpoint(Output.of(bootstrapEndpoint));
        }

        /**
         * @param credentials The Kafka API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<ClusterLinkDestinationKafkaClusterCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Kafka API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(ClusterLinkDestinationKafkaClusterCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param id The ID of the remote Kafka cluster, for example, `lkc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the remote Kafka cluster, for example, `lkc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param restEndpoint The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public ClusterLinkDestinationKafkaClusterArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ClusterLinkDestinationKafkaClusterArgs", "id");
            }
            return $;
        }
    }

}
