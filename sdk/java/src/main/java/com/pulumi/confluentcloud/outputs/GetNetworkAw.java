// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkAw {
    /**
     * @return (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     * 
     */
    private String account;
    /**
     * @return (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     * 
     */
    private String privateLinkEndpointService;
    /**
     * @return (Required String) The Confluent Cloud VPC ID.
     * 
     */
    private String vpc;

    private GetNetworkAw() {}
    /**
     * @return (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     * 
     */
    public String account() {
        return this.account;
    }
    /**
     * @return (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     * 
     */
    public String privateLinkEndpointService() {
        return this.privateLinkEndpointService;
    }
    /**
     * @return (Required String) The Confluent Cloud VPC ID.
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAw defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String account;
        private String privateLinkEndpointService;
        private String vpc;
        public Builder() {}
        public Builder(GetNetworkAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.privateLinkEndpointService = defaults.privateLinkEndpointService;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder account(String account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetNetworkAw", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkEndpointService(String privateLinkEndpointService) {
            if (privateLinkEndpointService == null) {
              throw new MissingRequiredPropertyException("GetNetworkAw", "privateLinkEndpointService");
            }
            this.privateLinkEndpointService = privateLinkEndpointService;
            return this;
        }
        @CustomType.Setter
        public Builder vpc(String vpc) {
            if (vpc == null) {
              throw new MissingRequiredPropertyException("GetNetworkAw", "vpc");
            }
            this.vpc = vpc;
            return this;
        }
        public GetNetworkAw build() {
            final var _resultValue = new GetNetworkAw();
            _resultValue.account = account;
            _resultValue.privateLinkEndpointService = privateLinkEndpointService;
            _resultValue.vpc = vpc;
            return _resultValue;
        }
    }
}
