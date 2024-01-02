// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetKafkaTopicCredentials;
import com.pulumi.confluentcloud.outputs.GetKafkaTopicKafkaCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKafkaTopicResult {
    /**
     * @return (Optional Map) The custom topic settings:
     * 
     */
    private Map<String,String> config;
    private @Nullable GetKafkaTopicCredentials credentials;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable GetKafkaTopicKafkaCluster kafkaCluster;
    /**
     * @return (Required Number) The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    private Integer partitionsCount;
    private String restEndpoint;
    private String topicName;

    private GetKafkaTopicResult() {}
    /**
     * @return (Optional Map) The custom topic settings:
     * 
     */
    public Map<String,String> config() {
        return this.config;
    }
    public Optional<GetKafkaTopicCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<GetKafkaTopicKafkaCluster> kafkaCluster() {
        return Optional.ofNullable(this.kafkaCluster);
    }
    /**
     * @return (Required Number) The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    public Integer partitionsCount() {
        return this.partitionsCount;
    }
    public String restEndpoint() {
        return this.restEndpoint;
    }
    public String topicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> config;
        private @Nullable GetKafkaTopicCredentials credentials;
        private String id;
        private @Nullable GetKafkaTopicKafkaCluster kafkaCluster;
        private Integer partitionsCount;
        private String restEndpoint;
        private String topicName;
        public Builder() {}
        public Builder(GetKafkaTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.kafkaCluster = defaults.kafkaCluster;
    	      this.partitionsCount = defaults.partitionsCount;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.topicName = defaults.topicName;
        }

        @CustomType.Setter
        public Builder config(Map<String,String> config) {
            if (config == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicResult", "config");
            }
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(@Nullable GetKafkaTopicCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaCluster(@Nullable GetKafkaTopicKafkaCluster kafkaCluster) {

            this.kafkaCluster = kafkaCluster;
            return this;
        }
        @CustomType.Setter
        public Builder partitionsCount(Integer partitionsCount) {
            if (partitionsCount == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicResult", "partitionsCount");
            }
            this.partitionsCount = partitionsCount;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(String restEndpoint) {
            if (restEndpoint == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicResult", "restEndpoint");
            }
            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder topicName(String topicName) {
            if (topicName == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicResult", "topicName");
            }
            this.topicName = topicName;
            return this;
        }
        public GetKafkaTopicResult build() {
            final var _resultValue = new GetKafkaTopicResult();
            _resultValue.config = config;
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.kafkaCluster = kafkaCluster;
            _resultValue.partitionsCount = partitionsCount;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.topicName = topicName;
            return _resultValue;
        }
    }
}
