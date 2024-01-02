// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkLinkEndpointEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetNetworkLinkEndpointEnvironmentArgs Empty = new GetNetworkLinkEndpointEnvironmentArgs();

    /**
     * The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetNetworkLinkEndpointEnvironmentArgs() {}

    private GetNetworkLinkEndpointEnvironmentArgs(GetNetworkLinkEndpointEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLinkEndpointEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLinkEndpointEnvironmentArgs $;

        public Builder() {
            $ = new GetNetworkLinkEndpointEnvironmentArgs();
        }

        public Builder(GetNetworkLinkEndpointEnvironmentArgs defaults) {
            $ = new GetNetworkLinkEndpointEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetNetworkLinkEndpointEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkEndpointEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
