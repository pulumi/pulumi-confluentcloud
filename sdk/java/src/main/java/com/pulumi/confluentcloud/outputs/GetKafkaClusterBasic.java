// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetKafkaClusterBasic {
    private GetKafkaClusterBasic() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaClusterBasic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetKafkaClusterBasic defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetKafkaClusterBasic build() {
            final var o = new GetKafkaClusterBasic();
            return o;
        }
    }
}
