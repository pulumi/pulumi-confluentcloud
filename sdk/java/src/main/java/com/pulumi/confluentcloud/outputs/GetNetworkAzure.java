// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkAzure {
    /**
     * @return (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
     * 
     */
    private Map<String,String> privateLinkServiceAliases;

    private GetNetworkAzure() {}
    /**
     * @return (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
     * 
     */
    public Map<String,String> privateLinkServiceAliases() {
        return this.privateLinkServiceAliases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> privateLinkServiceAliases;
        public Builder() {}
        public Builder(GetNetworkAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceAliases = defaults.privateLinkServiceAliases;
        }

        @CustomType.Setter
        public Builder privateLinkServiceAliases(Map<String,String> privateLinkServiceAliases) {
            if (privateLinkServiceAliases == null) {
              throw new MissingRequiredPropertyException("GetNetworkAzure", "privateLinkServiceAliases");
            }
            this.privateLinkServiceAliases = privateLinkServiceAliases;
            return this;
        }
        public GetNetworkAzure build() {
            final var _resultValue = new GetNetworkAzure();
            _resultValue.privateLinkServiceAliases = privateLinkServiceAliases;
            return _resultValue;
        }
    }
}
