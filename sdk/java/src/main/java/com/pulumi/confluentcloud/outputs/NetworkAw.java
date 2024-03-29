// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkAw {
    /**
     * @return (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     * 
     */
    private @Nullable String account;
    /**
     * @return (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     * 
     */
    private @Nullable String privateLinkEndpointService;
    /**
     * @return (Required String) The Confluent Cloud VPC ID.
     * 
     */
    private @Nullable String vpc;

    private NetworkAw() {}
    /**
     * @return (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     * 
     */
    public Optional<String> account() {
        return Optional.ofNullable(this.account);
    }
    /**
     * @return (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     * 
     */
    public Optional<String> privateLinkEndpointService() {
        return Optional.ofNullable(this.privateLinkEndpointService);
    }
    /**
     * @return (Required String) The Confluent Cloud VPC ID.
     * 
     */
    public Optional<String> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAw defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String account;
        private @Nullable String privateLinkEndpointService;
        private @Nullable String vpc;
        public Builder() {}
        public Builder(NetworkAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.privateLinkEndpointService = defaults.privateLinkEndpointService;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder account(@Nullable String account) {

            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkEndpointService(@Nullable String privateLinkEndpointService) {

            this.privateLinkEndpointService = privateLinkEndpointService;
            return this;
        }
        @CustomType.Setter
        public Builder vpc(@Nullable String vpc) {

            this.vpc = vpc;
            return this;
        }
        public NetworkAw build() {
            final var _resultValue = new NetworkAw();
            _resultValue.account = account;
            _resultValue.privateLinkEndpointService = privateLinkEndpointService;
            _resultValue.vpc = vpc;
            return _resultValue;
        }
    }
}
