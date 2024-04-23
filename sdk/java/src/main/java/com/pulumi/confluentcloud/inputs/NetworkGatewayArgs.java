// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkGatewayArgs Empty = new NetworkGatewayArgs();

    /**
     * (Optional String) The ID of the Gateway, for example, `gw-abc123`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return (Optional String) The ID of the Gateway, for example, `gw-abc123`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private NetworkGatewayArgs() {}

    private NetworkGatewayArgs(NetworkGatewayArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkGatewayArgs $;

        public Builder() {
            $ = new NetworkGatewayArgs();
        }

        public Builder(NetworkGatewayArgs defaults) {
            $ = new NetworkGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id (Optional String) The ID of the Gateway, for example, `gw-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Optional String) The ID of the Gateway, for example, `gw-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public NetworkGatewayArgs build() {
            return $;
        }
    }

}
