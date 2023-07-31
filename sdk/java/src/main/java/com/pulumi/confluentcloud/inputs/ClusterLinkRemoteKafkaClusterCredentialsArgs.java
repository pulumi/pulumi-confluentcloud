// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterLinkRemoteKafkaClusterCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLinkRemoteKafkaClusterCredentialsArgs Empty = new ClusterLinkRemoteKafkaClusterCredentialsArgs();

    /**
     * The Kafka API Key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The Kafka API Key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The Kafka API Secret.
     * 
     * &gt; **Note:** The `local_kafka_cluster`, `remote_kafka_cluster` configuration block and `link_mode = BIDIRECTIONAL` are in a [Preview lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy).
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Kafka API Secret.
     * 
     * &gt; **Note:** The `local_kafka_cluster`, `remote_kafka_cluster` configuration block and `link_mode = BIDIRECTIONAL` are in a [Preview lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy).
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private ClusterLinkRemoteKafkaClusterCredentialsArgs() {}

    private ClusterLinkRemoteKafkaClusterCredentialsArgs(ClusterLinkRemoteKafkaClusterCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLinkRemoteKafkaClusterCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLinkRemoteKafkaClusterCredentialsArgs $;

        public Builder() {
            $ = new ClusterLinkRemoteKafkaClusterCredentialsArgs();
        }

        public Builder(ClusterLinkRemoteKafkaClusterCredentialsArgs defaults) {
            $ = new ClusterLinkRemoteKafkaClusterCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Kafka API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The Kafka API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param secret The Kafka API Secret.
         * 
         * &gt; **Note:** The `local_kafka_cluster`, `remote_kafka_cluster` configuration block and `link_mode = BIDIRECTIONAL` are in a [Preview lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy).
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Kafka API Secret.
         * 
         * &gt; **Note:** The `local_kafka_cluster`, `remote_kafka_cluster` configuration block and `link_mode = BIDIRECTIONAL` are in a [Preview lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy).
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ClusterLinkRemoteKafkaClusterCredentialsArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}