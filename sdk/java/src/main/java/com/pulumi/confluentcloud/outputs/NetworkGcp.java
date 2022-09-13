// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkGcp {
    /**
     * @return (Required String) The GCP project.
     * 
     */
    private @Nullable String project;
    /**
     * @return (Required String) The GCP VPC network name.
     * 
     */
    private @Nullable String vpcNetwork;

    private NetworkGcp() {}
    /**
     * @return (Required String) The GCP project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return (Required String) The GCP VPC network name.
     * 
     */
    public Optional<String> vpcNetwork() {
        return Optional.ofNullable(this.vpcNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkGcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String project;
        private @Nullable String vpcNetwork;
        public Builder() {}
        public Builder(NetworkGcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.vpcNetwork = defaults.vpcNetwork;
        }

        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder vpcNetwork(@Nullable String vpcNetwork) {
            this.vpcNetwork = vpcNetwork;
            return this;
        }
        public NetworkGcp build() {
            final var o = new NetworkGcp();
            o.project = project;
            o.vpcNetwork = vpcNetwork;
            return o;
        }
    }
}
