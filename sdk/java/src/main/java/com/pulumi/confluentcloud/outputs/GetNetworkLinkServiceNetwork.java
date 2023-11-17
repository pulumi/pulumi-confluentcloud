// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkLinkServiceNetwork {
    /**
     * @return The ID of the Network Link Service, for example, `nls-zyw30`.
     * 
     */
    private String id;

    private GetNetworkLinkServiceNetwork() {}
    /**
     * @return The ID of the Network Link Service, for example, `nls-zyw30`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkLinkServiceNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetNetworkLinkServiceNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetNetworkLinkServiceNetwork build() {
            final var o = new GetNetworkLinkServiceNetwork();
            o.id = id;
            return o;
        }
    }
}
