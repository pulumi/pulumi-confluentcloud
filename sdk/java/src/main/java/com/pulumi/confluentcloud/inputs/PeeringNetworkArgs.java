// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PeeringNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeringNetworkArgs Empty = new PeeringNetworkArgs();

    /**
     * The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private PeeringNetworkArgs() {}

    private PeeringNetworkArgs(PeeringNetworkArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringNetworkArgs $;

        public Builder() {
            $ = new PeeringNetworkArgs();
        }

        public Builder(PeeringNetworkArgs defaults) {
            $ = new PeeringNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Network that the Peering belongs to, for example, `n-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Network that the Peering belongs to, for example, `n-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public PeeringNetworkArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
