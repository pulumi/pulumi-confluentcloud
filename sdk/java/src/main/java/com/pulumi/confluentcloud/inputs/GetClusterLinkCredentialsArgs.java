// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterLinkCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetClusterLinkCredentialsArgs Empty = new GetClusterLinkCredentialsArgs();

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
     * The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private GetClusterLinkCredentialsArgs() {}

    private GetClusterLinkCredentialsArgs(GetClusterLinkCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterLinkCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterLinkCredentialsArgs $;

        public Builder() {
            $ = new GetClusterLinkCredentialsArgs();
        }

        public Builder(GetClusterLinkCredentialsArgs defaults) {
            $ = new GetClusterLinkCredentialsArgs(Objects.requireNonNull(defaults));
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
         * @param secret The Cluster API Secret for your Confluent Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Cluster API Secret for your Confluent Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public GetClusterLinkCredentialsArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetClusterLinkCredentialsArgs", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetClusterLinkCredentialsArgs", "secret");
            }
            return $;
        }
    }

}
