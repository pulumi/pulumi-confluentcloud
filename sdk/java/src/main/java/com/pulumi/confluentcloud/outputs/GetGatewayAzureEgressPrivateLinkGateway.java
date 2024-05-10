// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayAzureEgressPrivateLinkGateway {
    /**
     * @return (Required String) Azure region of the Peering Gateway.
     * 
     */
    private String region;
    /**
     * @return (Required String) The Azure Subscription ID associated with the Confluent Cloud VPC.
     * 
     */
    private String subscription;

    private GetGatewayAzureEgressPrivateLinkGateway() {}
    /**
     * @return (Required String) Azure region of the Peering Gateway.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return (Required String) The Azure Subscription ID associated with the Confluent Cloud VPC.
     * 
     */
    public String subscription() {
        return this.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayAzureEgressPrivateLinkGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String region;
        private String subscription;
        public Builder() {}
        public Builder(GetGatewayAzureEgressPrivateLinkGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.subscription = defaults.subscription;
        }

        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetGatewayAzureEgressPrivateLinkGateway", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder subscription(String subscription) {
            if (subscription == null) {
              throw new MissingRequiredPropertyException("GetGatewayAzureEgressPrivateLinkGateway", "subscription");
            }
            this.subscription = subscription;
            return this;
        }
        public GetGatewayAzureEgressPrivateLinkGateway build() {
            final var _resultValue = new GetGatewayAzureEgressPrivateLinkGateway();
            _resultValue.region = region;
            _resultValue.subscription = subscription;
            return _resultValue;
        }
    }
}
