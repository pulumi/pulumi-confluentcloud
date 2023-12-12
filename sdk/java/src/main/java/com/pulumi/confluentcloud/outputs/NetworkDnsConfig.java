// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkDnsConfig {
    /**
     * @return Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     * 
     */
    private String resolution;

    private NetworkDnsConfig() {}
    /**
     * @return Network DNS resolution.
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

    public static Builder builder(NetworkDnsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resolution;
        public Builder() {}
        public Builder(NetworkDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolution = defaults.resolution;
        }

        @CustomType.Setter
        public Builder resolution(String resolution) {
            this.resolution = Objects.requireNonNull(resolution);
            return this;
        }
        public NetworkDnsConfig build() {
            final var _resultValue = new NetworkDnsConfig();
            _resultValue.resolution = resolution;
            return _resultValue;
        }
    }
}
