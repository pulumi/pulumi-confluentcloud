// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KafkaClusterEnvironment {
    /**
     * @return The ID of the Network that the Kafka cluster belongs to, for example, `n-abc123`.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private KafkaClusterEnvironment(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return The ID of the Network that the Kafka cluster belongs to, for example, `n-abc123`.
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

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaClusterEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public KafkaClusterEnvironment build() {
            return new KafkaClusterEnvironment(id);
        }
    }
}
