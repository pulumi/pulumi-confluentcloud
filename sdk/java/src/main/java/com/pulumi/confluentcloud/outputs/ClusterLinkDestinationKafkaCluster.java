// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.ClusterLinkDestinationKafkaClusterCredentials;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLinkDestinationKafkaCluster {
    /**
     * @return The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    private @Nullable String bootstrapEndpoint;
    private @Nullable ClusterLinkDestinationKafkaClusterCredentials credentials;
    /**
     * @return The ID of the remote Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    private String id;
    /**
     * @return The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    private @Nullable String restEndpoint;

    private ClusterLinkDestinationKafkaCluster() {}
    /**
     * @return The bootstrap endpoint of the remote Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    public Optional<String> bootstrapEndpoint() {
        return Optional.ofNullable(this.bootstrapEndpoint);
    }
    public Optional<ClusterLinkDestinationKafkaClusterCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The ID of the remote Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The REST endpoint of the remote Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLinkDestinationKafkaCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bootstrapEndpoint;
        private @Nullable ClusterLinkDestinationKafkaClusterCredentials credentials;
        private String id;
        private @Nullable String restEndpoint;
        public Builder() {}
        public Builder(ClusterLinkDestinationKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapEndpoint = defaults.bootstrapEndpoint;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.restEndpoint = defaults.restEndpoint;
        }

        @CustomType.Setter
        public Builder bootstrapEndpoint(@Nullable String bootstrapEndpoint) {
            this.bootstrapEndpoint = bootstrapEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(@Nullable ClusterLinkDestinationKafkaClusterCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {
            this.restEndpoint = restEndpoint;
            return this;
        }
        public ClusterLinkDestinationKafkaCluster build() {
            final var _resultValue = new ClusterLinkDestinationKafkaCluster();
            _resultValue.bootstrapEndpoint = bootstrapEndpoint;
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.restEndpoint = restEndpoint;
            return _resultValue;
        }
    }
}
