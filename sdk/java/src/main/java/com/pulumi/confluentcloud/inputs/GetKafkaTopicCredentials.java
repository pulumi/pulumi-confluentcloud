// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKafkaTopicCredentials extends com.pulumi.resources.InvokeArgs {

    public static final GetKafkaTopicCredentials Empty = new GetKafkaTopicCredentials();

    /**
     * The Kafka API Key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The Kafka API Key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    @Import(name="secret", required=true)
    private String secret;

    /**
     * @return The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    public String secret() {
        return this.secret;
    }

    private GetKafkaTopicCredentials() {}

    private GetKafkaTopicCredentials(GetKafkaTopicCredentials $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaTopicCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaTopicCredentials $;

        public Builder() {
            $ = new GetKafkaTopicCredentials();
        }

        public Builder(GetKafkaTopicCredentials defaults) {
            $ = new GetKafkaTopicCredentials(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Kafka API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param secret The Cluster API Secret for your Confluent Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public GetKafkaTopicCredentials build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetKafkaTopicCredentials", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetKafkaTopicCredentials", "secret");
            }
            return $;
        }
    }

}
