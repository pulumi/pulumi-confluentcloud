// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetKafkaTopicCredentials;
import com.pulumi.confluentcloud.inputs.GetKafkaTopicKafkaCluster;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKafkaTopicPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKafkaTopicPlainArgs Empty = new GetKafkaTopicPlainArgs();

    @Import(name="credentials")
    private @Nullable GetKafkaTopicCredentials credentials;

    public Optional<GetKafkaTopicCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * @deprecated
     * This parameter has been deprecated in favour of Rest Endpoint
     * 
     */
    @Deprecated /* This parameter has been deprecated in favour of Rest Endpoint */
    @Import(name="httpEndpoint")
    private @Nullable String httpEndpoint;

    /**
     * @deprecated
     * This parameter has been deprecated in favour of Rest Endpoint
     * 
     */
    @Deprecated /* This parameter has been deprecated in favour of Rest Endpoint */
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    @Import(name="kafkaCluster")
    private @Nullable GetKafkaTopicKafkaCluster kafkaCluster;

    public Optional<GetKafkaTopicKafkaCluster> kafkaCluster() {
        return Optional.ofNullable(this.kafkaCluster);
    }

    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint", required=true)
    private String restEndpoint;

    /**
     * @return The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public String restEndpoint() {
        return this.restEndpoint;
    }

    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
     * 
     */
    @Import(name="topicName", required=true)
    private String topicName;

    /**
     * @return The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    private GetKafkaTopicPlainArgs() {}

    private GetKafkaTopicPlainArgs(GetKafkaTopicPlainArgs $) {
        this.credentials = $.credentials;
        this.httpEndpoint = $.httpEndpoint;
        this.kafkaCluster = $.kafkaCluster;
        this.restEndpoint = $.restEndpoint;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaTopicPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaTopicPlainArgs $;

        public Builder() {
            $ = new GetKafkaTopicPlainArgs();
        }

        public Builder(GetKafkaTopicPlainArgs defaults) {
            $ = new GetKafkaTopicPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetKafkaTopicCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * This parameter has been deprecated in favour of Rest Endpoint
         * 
         */
        @Deprecated /* This parameter has been deprecated in favour of Rest Endpoint */
        public Builder httpEndpoint(@Nullable String httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder kafkaCluster(@Nullable GetKafkaTopicKafkaCluster kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param topicName The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            $.topicName = topicName;
            return this;
        }

        public GetKafkaTopicPlainArgs build() {
            $.restEndpoint = Objects.requireNonNull($.restEndpoint, "expected parameter 'restEndpoint' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
