// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Kafka API Secret.
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
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ClusterLinkRemoteKafkaClusterCredentialsArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ClusterLinkRemoteKafkaClusterCredentialsArgs", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("ClusterLinkRemoteKafkaClusterCredentialsArgs", "secret");
            }
            return $;
        }
    }

}
