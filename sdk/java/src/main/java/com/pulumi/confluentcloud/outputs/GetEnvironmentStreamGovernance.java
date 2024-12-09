// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentStreamGovernance {
    /**
     * @return Stream Governance Package. &#39;ESSENTIALS&#39; or &#39;ADVANCED&#39;
     * 
     */
    private String package_;

    private GetEnvironmentStreamGovernance() {}
    /**
     * @return Stream Governance Package. &#39;ESSENTIALS&#39; or &#39;ADVANCED&#39;
     * 
     */
    public String package_() {
        return this.package_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentStreamGovernance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String package_;
        public Builder() {}
        public Builder(GetEnvironmentStreamGovernance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.package_ = defaults.package_;
        }

        @CustomType.Setter("package")
        public Builder package_(String package_) {
            if (package_ == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentStreamGovernance", "package_");
            }
            this.package_ = package_;
            return this;
        }
        public GetEnvironmentStreamGovernance build() {
            final var _resultValue = new GetEnvironmentStreamGovernance();
            _resultValue.package_ = package_;
            return _resultValue;
        }
    }
}