// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentStreamGovernance {
    /**
     * @return The [stream governance package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages) for the Environment. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    private String package_;

    private EnvironmentStreamGovernance() {}
    /**
     * @return The [stream governance package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages) for the Environment. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    public String package_() {
        return this.package_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStreamGovernance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String package_;
        public Builder() {}
        public Builder(EnvironmentStreamGovernance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.package_ = defaults.package_;
        }

        @CustomType.Setter("package")
        public Builder package_(String package_) {
            if (package_ == null) {
              throw new MissingRequiredPropertyException("EnvironmentStreamGovernance", "package_");
            }
            this.package_ = package_;
            return this;
        }
        public EnvironmentStreamGovernance build() {
            final var _resultValue = new EnvironmentStreamGovernance();
            _resultValue.package_ = package_;
            return _resultValue;
        }
    }
}