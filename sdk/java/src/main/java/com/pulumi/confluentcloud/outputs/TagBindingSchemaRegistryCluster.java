// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TagBindingSchemaRegistryCluster {
    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    private String id;

    private TagBindingSchemaRegistryCluster() {}
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

    public static Builder builder(TagBindingSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(TagBindingSchemaRegistryCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("TagBindingSchemaRegistryCluster", "id");
            }
            this.id = id;
            return this;
        }
        public TagBindingSchemaRegistryCluster build() {
            final var _resultValue = new TagBindingSchemaRegistryCluster();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
