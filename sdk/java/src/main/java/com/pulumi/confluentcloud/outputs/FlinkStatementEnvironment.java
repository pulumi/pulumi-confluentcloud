// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlinkStatementEnvironment {
    /**
     * @return The ID of the Environment, for example, `env-abc123`.
     * 
     */
    private String id;

    private FlinkStatementEnvironment() {}
    /**
     * @return The ID of the Environment, for example, `env-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlinkStatementEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(FlinkStatementEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("FlinkStatementEnvironment", "id");
            }
            this.id = id;
            return this;
        }
        public FlinkStatementEnvironment build() {
            final var _resultValue = new FlinkStatementEnvironment();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}