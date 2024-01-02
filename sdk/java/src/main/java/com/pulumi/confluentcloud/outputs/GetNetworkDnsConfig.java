// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkDnsConfig {
    /**
     * @return (Required String) Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     * 
     */
    private String resolution;

    private GetNetworkDnsConfig() {}
    /**
     * @return (Required String) Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     * 
     */
    public String resolution() {
        return this.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkDnsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resolution;
        public Builder() {}
        public Builder(GetNetworkDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolution = defaults.resolution;
        }

        @CustomType.Setter
        public Builder resolution(String resolution) {
            if (resolution == null) {
              throw new MissingRequiredPropertyException("GetNetworkDnsConfig", "resolution");
            }
            this.resolution = resolution;
            return this;
        }
        public GetNetworkDnsConfig build() {
            final var _resultValue = new GetNetworkDnsConfig();
            _resultValue.resolution = resolution;
            return _resultValue;
        }
    }
}
