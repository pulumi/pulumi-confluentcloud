// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetNetworkLinkServiceAccept;
import com.pulumi.confluentcloud.inputs.GetNetworkLinkServiceEnvironment;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkLinkServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkLinkServicePlainArgs Empty = new GetNetworkLinkServicePlainArgs();

    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Import(name="accept")
    private @Nullable GetNetworkLinkServiceAccept accept;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Optional<GetNetworkLinkServiceAccept> accept() {
        return Optional.ofNullable(this.accept);
    }

    @Import(name="environment", required=true)
    private GetNetworkLinkServiceEnvironment environment;

    public GetNetworkLinkServiceEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetNetworkLinkServicePlainArgs() {}

    private GetNetworkLinkServicePlainArgs(GetNetworkLinkServicePlainArgs $) {
        this.accept = $.accept;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLinkServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLinkServicePlainArgs $;

        public Builder() {
            $ = new GetNetworkLinkServicePlainArgs();
        }

        public Builder(GetNetworkLinkServicePlainArgs defaults) {
            $ = new GetNetworkLinkServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accept (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder accept(@Nullable GetNetworkLinkServiceAccept accept) {
            $.accept = accept;
            return this;
        }

        public Builder environment(GetNetworkLinkServiceEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNetworkLinkServicePlainArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
