// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkLinkEndpointNetwork {
    /**
     * @return The ID of the Network that the Network Link Endpoint belongs to, for example, `n-abc123`.
     * 
     */
    private String id;

    private NetworkLinkEndpointNetwork() {}
    /**
     * @return The ID of the Network that the Network Link Endpoint belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkLinkEndpointNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(NetworkLinkEndpointNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("NetworkLinkEndpointNetwork", "id");
            }
            this.id = id;
            return this;
        }
        public NetworkLinkEndpointNetwork build() {
            final var _resultValue = new NetworkLinkEndpointNetwork();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
