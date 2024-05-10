// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayAwsEgressPrivateLinkGateway {
    /**
     * @return (Required String) The principal ARN used by the AWS Egress Private Link Gateway.
     * 
     */
    private String principalArn;
    /**
     * @return (Required String) Azure region of the Peering Gateway.
     * 
     */
    private String region;

    private GetGatewayAwsEgressPrivateLinkGateway() {}
    /**
     * @return (Required String) The principal ARN used by the AWS Egress Private Link Gateway.
     * 
     */
    public String principalArn() {
        return this.principalArn;
    }
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

    public static Builder builder(GetGatewayAwsEgressPrivateLinkGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String principalArn;
        private String region;
        public Builder() {}
        public Builder(GetGatewayAwsEgressPrivateLinkGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalArn = defaults.principalArn;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder principalArn(String principalArn) {
            if (principalArn == null) {
              throw new MissingRequiredPropertyException("GetGatewayAwsEgressPrivateLinkGateway", "principalArn");
            }
            this.principalArn = principalArn;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetGatewayAwsEgressPrivateLinkGateway", "region");
            }
            this.region = region;
            return this;
        }
        public GetGatewayAwsEgressPrivateLinkGateway build() {
            final var _resultValue = new GetGatewayAwsEgressPrivateLinkGateway();
            _resultValue.principalArn = principalArn;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
