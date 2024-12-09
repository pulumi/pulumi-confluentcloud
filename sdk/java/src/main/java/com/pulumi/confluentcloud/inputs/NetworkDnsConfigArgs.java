// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NetworkDnsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkDnsConfigArgs Empty = new NetworkDnsConfigArgs();

    /**
     * Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     * The Confluent Cloud Console uses `resolution = PRIVATE`.
     * 
     */
    @Import(name="resolution", required=true)
    private Output<String> resolution;

    /**
     * @return Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     * The Confluent Cloud Console uses `resolution = PRIVATE`.
     * 
     */
    public Output<String> resolution() {
        return this.resolution;
    }

    private NetworkDnsConfigArgs() {}

    private NetworkDnsConfigArgs(NetworkDnsConfigArgs $) {
        this.resolution = $.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkDnsConfigArgs $;

        public Builder() {
            $ = new NetworkDnsConfigArgs();
        }

        public Builder(NetworkDnsConfigArgs defaults) {
            $ = new NetworkDnsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resolution Network DNS resolution.
         * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
         * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
         * The Confluent Cloud Console uses `resolution = PRIVATE`.
         * 
         * @return builder
         * 
         */
        public Builder resolution(Output<String> resolution) {
            $.resolution = resolution;
            return this;
        }

        /**
         * @param resolution Network DNS resolution.
         * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
         * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
         * The Confluent Cloud Console uses `resolution = PRIVATE`.
         * 
         * @return builder
         * 
         */
        public Builder resolution(String resolution) {
            return resolution(Output.of(resolution));
        }

        public NetworkDnsConfigArgs build() {
            if ($.resolution == null) {
                throw new MissingRequiredPropertyException("NetworkDnsConfigArgs", "resolution");
            }
            return $;
        }
    }

}