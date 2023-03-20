// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KafkaClusterEnvironment {
    /**
     * @return The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     * 
     */
    private String id;

    private KafkaClusterEnvironment() {}
    /**
     * @return The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaClusterEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(KafkaClusterEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public KafkaClusterEnvironment build() {
            final var o = new KafkaClusterEnvironment();
            o.id = id;
            return o;
        }
    }
}
