// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetNetworkLinkEndpointEnvironment;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkLinkEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkLinkEndpointPlainArgs Empty = new GetNetworkLinkEndpointPlainArgs();

    @Import(name="environment", required=true)
    private GetNetworkLinkEndpointEnvironment environment;

    public GetNetworkLinkEndpointEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Network Link Endpoint, for example, `nle-zyw30`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Network Link Endpoint, for example, `nle-zyw30`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetNetworkLinkEndpointPlainArgs() {}

    private GetNetworkLinkEndpointPlainArgs(GetNetworkLinkEndpointPlainArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLinkEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLinkEndpointPlainArgs $;

        public Builder() {
            $ = new GetNetworkLinkEndpointPlainArgs();
        }

        public Builder(GetNetworkLinkEndpointPlainArgs defaults) {
            $ = new GetNetworkLinkEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(GetNetworkLinkEndpointEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Network Link Endpoint, for example, `nle-zyw30`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNetworkLinkEndpointPlainArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkEndpointPlainArgs", "environment");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkEndpointPlainArgs", "id");
            }
            return $;
        }
    }

}
