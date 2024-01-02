// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.KafkaTopicCredentialsArgs;
import com.pulumi.confluentcloud.inputs.KafkaTopicKafkaClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaTopicArgs Empty = new KafkaTopicArgs();

    /**
     * The custom topic settings to set:
     * 
     */
    @Import(name="config")
    private @Nullable Output<Map<String,String>> config;

    /**
     * @return The custom topic settings to set:
     * 
     */
    public Optional<Output<Map<String,String>>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<KafkaTopicCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<KafkaTopicCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * @deprecated
     * This property has been deprecated. Please use &#34;restEndpoint&#34; instead.
     * 
     */
    @Deprecated /* This property has been deprecated. Please use ""restEndpoint"" instead. */
    @Import(name="httpEndpoint")
    private @Nullable Output<String> httpEndpoint;

    /**
     * @deprecated
     * This property has been deprecated. Please use &#34;restEndpoint&#34; instead.
     * 
     */
    @Deprecated /* This property has been deprecated. Please use ""restEndpoint"" instead. */
    public Optional<Output<String>> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    @Import(name="kafkaCluster")
    private @Nullable Output<KafkaTopicKafkaClusterArgs> kafkaCluster;

    public Optional<Output<KafkaTopicKafkaClusterArgs>> kafkaCluster() {
        return Optional.ofNullable(this.kafkaCluster);
    }

    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    @Import(name="partitionsCount")
    private @Nullable Output<Integer> partitionsCount;

    /**
     * @return The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    public Optional<Output<Integer>> partitionsCount() {
        return Optional.ofNullable(this.partitionsCount);
    }

    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     * 
     */
    @Import(name="topicName", required=true)
    private Output<String> topicName;

    /**
     * @return The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    private KafkaTopicArgs() {}

    private KafkaTopicArgs(KafkaTopicArgs $) {
        this.config = $.config;
        this.credentials = $.credentials;
        this.httpEndpoint = $.httpEndpoint;
        this.kafkaCluster = $.kafkaCluster;
        this.partitionsCount = $.partitionsCount;
        this.restEndpoint = $.restEndpoint;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaTopicArgs $;

        public Builder() {
            $ = new KafkaTopicArgs();
        }

        public Builder(KafkaTopicArgs defaults) {
            $ = new KafkaTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The custom topic settings to set:
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<Map<String,String>> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The custom topic settings to set:
         * 
         * @return builder
         * 
         */
        public Builder config(Map<String,String> config) {
            return config(Output.of(config));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<KafkaTopicCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(KafkaTopicCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * This property has been deprecated. Please use &#34;restEndpoint&#34; instead.
         * 
         */
        @Deprecated /* This property has been deprecated. Please use ""restEndpoint"" instead. */
        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * This property has been deprecated. Please use &#34;restEndpoint&#34; instead.
         * 
         */
        @Deprecated /* This property has been deprecated. Please use ""restEndpoint"" instead. */
        public Builder httpEndpoint(String httpEndpoint) {
            return httpEndpoint(Output.of(httpEndpoint));
        }

        public Builder kafkaCluster(@Nullable Output<KafkaTopicKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(KafkaTopicKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param partitionsCount The number of partitions to create in the topic. Defaults to `6`.
         * 
         * @return builder
         * 
         */
        public Builder partitionsCount(@Nullable Output<Integer> partitionsCount) {
            $.partitionsCount = partitionsCount;
            return this;
        }

        /**
         * @param partitionsCount The number of partitions to create in the topic. Defaults to `6`.
         * 
         * @return builder
         * 
         */
        public Builder partitionsCount(Integer partitionsCount) {
            return partitionsCount(Output.of(partitionsCount));
        }

        /**
         * @param restEndpoint The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        /**
         * @param topicName The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public KafkaTopicArgs build() {
            if ($.topicName == null) {
                throw new MissingRequiredPropertyException("KafkaTopicArgs", "topicName");
            }
            return $;
        }
    }

}
