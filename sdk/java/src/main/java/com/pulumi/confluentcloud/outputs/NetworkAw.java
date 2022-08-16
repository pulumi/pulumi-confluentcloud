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
     * @return (Optional String) The AWS VPC endpoint service for the network (used for Private Link) if available.
     * 
     */
    private final @Nullable String privateLinkEndpointService;
    /**
     * @return (Required String) The AWS VPC ID for the network.
     * 
     */
    private final @Nullable String vpc;

    @CustomType.Constructor
    private NetworkAw(
        @CustomType.Parameter("privateLinkEndpointService") @Nullable String privateLinkEndpointService,
        @CustomType.Parameter("vpc") @Nullable String vpc) {
        this.privateLinkEndpointService = privateLinkEndpointService;
        this.vpc = vpc;
    }

    /**
     * @return (Optional String) The AWS VPC endpoint service for the network (used for Private Link) if available.
     * 
     */
    public Optional<String> privateLinkEndpointService() {
        return Optional.ofNullable(this.privateLinkEndpointService);
    }
    /**
     * @return (Required String) The AWS VPC ID for the network.
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

    public static final class Builder {
        private @Nullable String privateLinkEndpointService;
        private @Nullable String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkEndpointService = defaults.privateLinkEndpointService;
    	      this.vpc = defaults.vpc;
        }

        public Builder privateLinkEndpointService(@Nullable String privateLinkEndpointService) {
            this.privateLinkEndpointService = privateLinkEndpointService;
            return this;
        }
        public Builder vpc(@Nullable String vpc) {
            this.vpc = vpc;
            return this;
        }        public NetworkAw build() {
            return new NetworkAw(privateLinkEndpointService, vpc);
        }
    }
}
