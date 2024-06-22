// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkLinkEndpointEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkLinkEndpointEnvironment Empty = new GetNetworkLinkEndpointEnvironment();

    /**
     * The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetNetworkLinkEndpointEnvironment() {}

    private GetNetworkLinkEndpointEnvironment(GetNetworkLinkEndpointEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLinkEndpointEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLinkEndpointEnvironment $;

        public Builder() {
            $ = new GetNetworkLinkEndpointEnvironment();
        }

        public Builder(GetNetworkLinkEndpointEnvironment defaults) {
            $ = new GetNetworkLinkEndpointEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Network Link Endpoint belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNetworkLinkEndpointEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkEndpointEnvironment", "id");
            }
            return $;
        }
    }

}