// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlinkStatementOrganization {
    /**
     * @return The ID of the Principal the Flink Statement runs as, for example, `sa-abc123`.
     * 
     */
    private String id;

    private FlinkStatementOrganization() {}
    /**
     * @return The ID of the Principal the Flink Statement runs as, for example, `sa-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlinkStatementOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(FlinkStatementOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("FlinkStatementOrganization", "id");
            }
            this.id = id;
            return this;
        }
        public FlinkStatementOrganization build() {
            final var _resultValue = new FlinkStatementOrganization();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
