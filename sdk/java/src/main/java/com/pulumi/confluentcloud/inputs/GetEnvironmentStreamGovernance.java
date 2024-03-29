// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentStreamGovernance extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentStreamGovernance Empty = new GetEnvironmentStreamGovernance();

    /**
     * Stream Governance Package. &#39;ESSENTIALS&#39; or &#39;ADVANCED&#39;
     * 
     */
    @Import(name="package", required=true)
    private String package_;

    /**
     * @return Stream Governance Package. &#39;ESSENTIALS&#39; or &#39;ADVANCED&#39;
     * 
     */
    public String package_() {
        return this.package_;
    }

    private GetEnvironmentStreamGovernance() {}

    private GetEnvironmentStreamGovernance(GetEnvironmentStreamGovernance $) {
        this.package_ = $.package_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentStreamGovernance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentStreamGovernance $;

        public Builder() {
            $ = new GetEnvironmentStreamGovernance();
        }

        public Builder(GetEnvironmentStreamGovernance defaults) {
            $ = new GetEnvironmentStreamGovernance(Objects.requireNonNull(defaults));
        }

        /**
         * @param package_ Stream Governance Package. &#39;ESSENTIALS&#39; or &#39;ADVANCED&#39;
         * 
         * @return builder
         * 
         */
        public Builder package_(String package_) {
            $.package_ = package_;
            return this;
        }

        public GetEnvironmentStreamGovernance build() {
            if ($.package_ == null) {
                throw new MissingRequiredPropertyException("GetEnvironmentStreamGovernance", "package_");
            }
            return $;
        }
    }

}
