// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CatalogEntityAttributesSchemaRegistryCluster {
    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    private String id;

    private CatalogEntityAttributesSchemaRegistryCluster() {}
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

    public static Builder builder(CatalogEntityAttributesSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(CatalogEntityAttributesSchemaRegistryCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("CatalogEntityAttributesSchemaRegistryCluster", "id");
            }
            this.id = id;
            return this;
        }
        public CatalogEntityAttributesSchemaRegistryCluster build() {
            final var _resultValue = new CatalogEntityAttributesSchemaRegistryCluster();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
