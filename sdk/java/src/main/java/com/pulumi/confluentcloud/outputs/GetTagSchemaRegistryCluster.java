// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagSchemaRegistryCluster {
    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    private String id;

    private GetTagSchemaRegistryCluster() {}
    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetTagSchemaRegistryCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetTagSchemaRegistryCluster build() {
            final var _resultValue = new GetTagSchemaRegistryCluster();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
