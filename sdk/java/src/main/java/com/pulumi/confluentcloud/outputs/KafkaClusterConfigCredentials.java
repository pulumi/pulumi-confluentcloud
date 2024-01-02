// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KafkaClusterConfigCredentials {
    /**
     * @return The Kafka API Key.
     * 
     */
    private String key;
    /**
     * @return The Kafka API Secret.
     * 
     * &gt; **Note:** A Kafka API key consists of a key and a secret. Kafka API keys are required to interact with Kafka clusters in Confluent Cloud. Each Kafka API key is valid for one specific Kafka cluster.
     * 
     * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Kafka API key, create a new Kafka API key, update the `credentials` block in all configuration files to use the new Kafka API key, run `pulumi up -target=&#34;confluent_kafka_cluster_config.orders&#34;`, and remove the old Kafka API key. Alternatively, in case the old Kafka API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_kafka_cluster_config.orders&#34; -out=rotate-kafka-api-key` and `pulumi up rotate-kafka-api-key` instead.
     * 
     */
    private String secret;

    private KafkaClusterConfigCredentials() {}
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
     * &gt; **Note:** A Kafka API key consists of a key and a secret. Kafka API keys are required to interact with Kafka clusters in Confluent Cloud. Each Kafka API key is valid for one specific Kafka cluster.
     * 
     * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Kafka API key, create a new Kafka API key, update the `credentials` block in all configuration files to use the new Kafka API key, run `pulumi up -target=&#34;confluent_kafka_cluster_config.orders&#34;`, and remove the old Kafka API key. Alternatively, in case the old Kafka API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_kafka_cluster_config.orders&#34; -out=rotate-kafka-api-key` and `pulumi up rotate-kafka-api-key` instead.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaClusterConfigCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String secret;
        public Builder() {}
        public Builder(KafkaClusterConfigCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("KafkaClusterConfigCredentials", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("KafkaClusterConfigCredentials", "secret");
            }
            this.secret = secret;
            return this;
        }
        public KafkaClusterConfigCredentials build() {
            final var _resultValue = new KafkaClusterConfigCredentials();
            _resultValue.key = key;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
