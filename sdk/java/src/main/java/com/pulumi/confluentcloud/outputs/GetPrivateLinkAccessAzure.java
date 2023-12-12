// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAccessAzure {
    /**
     * @return (Required String) The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal](https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     * 
     */
    private String subscription;

    private GetPrivateLinkAccessAzure() {}
    /**
     * @return (Required String) The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal](https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     * 
     */
    public String subscription() {
        return this.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAccessAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String subscription;
        public Builder() {}
        public Builder(GetPrivateLinkAccessAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
        }

        @CustomType.Setter
        public Builder subscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }
        public GetPrivateLinkAccessAzure build() {
            final var _resultValue = new GetPrivateLinkAccessAzure();
            _resultValue.subscription = subscription;
            return _resultValue;
        }
    }
}
