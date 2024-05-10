// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayAzurePeeringGateway {
    /**
     * @return (Required String) Azure region of the Peering Gateway.
     * 
     */
    private String region;

    private GetGatewayAzurePeeringGateway() {}
    /**
     * @return (Required String) Azure region of the Peering Gateway.
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayAzurePeeringGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String region;
        public Builder() {}
        public Builder(GetGatewayAzurePeeringGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetGatewayAzurePeeringGateway", "region");
            }
            this.region = region;
            return this;
        }
        public GetGatewayAzurePeeringGateway build() {
            final var _resultValue = new GetGatewayAzurePeeringGateway();
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
