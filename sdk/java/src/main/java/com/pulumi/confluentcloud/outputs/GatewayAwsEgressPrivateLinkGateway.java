// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayAwsEgressPrivateLinkGateway {
    /**
     * @return (Required String) The principal ARN used by the AWS Egress Private Link Gateway, for example, `arn:aws:iam::123456789012:tenant-1-role`.
     * 
     */
    private @Nullable String principalArn;
    /**
     * @return AWS region of the Gateway, for example, `us-east-1`.
     * 
     */
    private String region;

    private GatewayAwsEgressPrivateLinkGateway() {}
    /**
     * @return (Required String) The principal ARN used by the AWS Egress Private Link Gateway, for example, `arn:aws:iam::123456789012:tenant-1-role`.
     * 
     */
    public Optional<String> principalArn() {
        return Optional.ofNullable(this.principalArn);
    }
    /**
     * @return AWS region of the Gateway, for example, `us-east-1`.
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayAwsEgressPrivateLinkGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String principalArn;
        private String region;
        public Builder() {}
        public Builder(GatewayAwsEgressPrivateLinkGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalArn = defaults.principalArn;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder principalArn(@Nullable String principalArn) {

            this.principalArn = principalArn;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GatewayAwsEgressPrivateLinkGateway", "region");
            }
            this.region = region;
            return this;
        }
        public GatewayAwsEgressPrivateLinkGateway build() {
            final var _resultValue = new GatewayAwsEgressPrivateLinkGateway();
            _resultValue.principalArn = principalArn;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
