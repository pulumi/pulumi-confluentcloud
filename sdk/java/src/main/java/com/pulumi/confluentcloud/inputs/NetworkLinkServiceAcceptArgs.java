// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkLinkServiceAcceptArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkLinkServiceAcceptArgs Empty = new NetworkLinkServiceAcceptArgs();

    /**
     * List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    @Import(name="environments")
    private @Nullable Output<List<String>> environments;

    /**
     * @return List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    public Optional<Output<List<String>>> environments() {
        return Optional.ofNullable(this.environments);
    }

    /**
     * List of network ids from which connections can be accepted.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    /**
     * @return List of network ids from which connections can be accepted.
     * 
     */
    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    private NetworkLinkServiceAcceptArgs() {}

    private NetworkLinkServiceAcceptArgs(NetworkLinkServiceAcceptArgs $) {
        this.environments = $.environments;
        this.networks = $.networks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkLinkServiceAcceptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkLinkServiceAcceptArgs $;

        public Builder() {
            $ = new NetworkLinkServiceAcceptArgs();
        }

        public Builder(NetworkLinkServiceAcceptArgs defaults) {
            $ = new NetworkLinkServiceAcceptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environments List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder environments(@Nullable Output<List<String>> environments) {
            $.environments = environments;
            return this;
        }

        /**
         * @param environments List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder environments(List<String> environments) {
            return environments(Output.of(environments));
        }

        /**
         * @param environments List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder environments(String... environments) {
            return environments(List.of(environments));
        }

        /**
         * @param networks List of network ids from which connections can be accepted.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks List of network ids from which connections can be accepted.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks List of network ids from which connections can be accepted.
         * 
         * @return builder
         * 
         */
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        public NetworkLinkServiceAcceptArgs build() {
            return $;
        }
    }

}
