// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKafkaClusterByokKey {
    /**
     * @return The ID of the Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    private String id;

    private GetKafkaClusterByokKey() {}
    /**
     * @return The ID of the Kafka cluster, for example, `lkc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaClusterByokKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetKafkaClusterByokKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetKafkaClusterByokKey build() {
            final var o = new GetKafkaClusterByokKey();
            o.id = id;
            return o;
        }
    }
}
