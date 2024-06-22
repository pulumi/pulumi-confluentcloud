// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkLinkServiceAccept {
    /**
     * @return (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    private List<String> environments;
    /**
     * @return (Optional List of Strings) List of network ids from which connections can be accepted.
     * 
     */
    private List<String> networks;

    private GetNetworkLinkServiceAccept() {}
    /**
     * @return (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    public List<String> environments() {
        return this.environments;
    }
    /**
     * @return (Optional List of Strings) List of network ids from which connections can be accepted.
     * 
     */
    public List<String> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkLinkServiceAccept defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> environments;
        private List<String> networks;
        public Builder() {}
        public Builder(GetNetworkLinkServiceAccept defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environments = defaults.environments;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder environments(List<String> environments) {
            if (environments == null) {
              throw new MissingRequiredPropertyException("GetNetworkLinkServiceAccept", "environments");
            }
            this.environments = environments;
            return this;
        }
        public Builder environments(String... environments) {
            return environments(List.of(environments));
        }
        @CustomType.Setter
        public Builder networks(List<String> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetNetworkLinkServiceAccept", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        public GetNetworkLinkServiceAccept build() {
            final var _resultValue = new GetNetworkLinkServiceAccept();
            _resultValue.environments = environments;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}