// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KafkaAclCredentials {
    /**
     * @return The Kafka API Key.
     * 
     */
    private String key;
    /**
     * @return The Kafka API Secret.
     * 
     */
    private String secret;

    private KafkaAclCredentials() {}
    /**
     * @return The Kafka API Key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The Kafka API Secret.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaAclCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String secret;
        public Builder() {}
        public Builder(KafkaAclCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public KafkaAclCredentials build() {
            final var _resultValue = new KafkaAclCredentials();
            _resultValue.key = key;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
