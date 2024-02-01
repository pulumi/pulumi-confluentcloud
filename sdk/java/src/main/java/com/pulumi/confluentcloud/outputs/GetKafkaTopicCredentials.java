// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKafkaTopicCredentials {
    /**
     * @return The Kafka API Key.
     * 
     */
    private String key;
    /**
     * @return The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    private String secret;

    private GetKafkaTopicCredentials() {}
    /**
     * @return The Kafka API Key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaTopicCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String secret;
        public Builder() {}
        public Builder(GetKafkaTopicCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicCredentials", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetKafkaTopicCredentials", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetKafkaTopicCredentials build() {
            final var _resultValue = new GetKafkaTopicCredentials();
            _resultValue.key = key;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
