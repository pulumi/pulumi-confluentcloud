// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.NetworkLinkEndpointEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.NetworkLinkEndpointNetworkArgs;
import com.pulumi.confluentcloud.inputs.NetworkLinkEndpointNetworkLinkServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkLinkEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkLinkEndpointState Empty = new NetworkLinkEndpointState();

    /**
     * The description of the Network Link Endpoint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Network Link Endpoint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Network Link Endpoint.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Network Link Endpoint.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<NetworkLinkEndpointEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<NetworkLinkEndpointEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network")
    private @Nullable Output<NetworkLinkEndpointNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Optional<Output<NetworkLinkEndpointNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="networkLinkService")
    private @Nullable Output<NetworkLinkEndpointNetworkLinkServiceArgs> networkLinkService;

    public Optional<Output<NetworkLinkEndpointNetworkLinkServiceArgs>> networkLinkService() {
        return Optional.ofNullable(this.networkLinkService);
    }

    /**
     * (Required String) The Confluent Resource Name of the Network Link Endpoint.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Network Link Endpoint.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    private NetworkLinkEndpointState() {}

    private NetworkLinkEndpointState(NetworkLinkEndpointState $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.network = $.network;
        this.networkLinkService = $.networkLinkService;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkLinkEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkLinkEndpointState $;

        public Builder() {
            $ = new NetworkLinkEndpointState();
        }

        public Builder(NetworkLinkEndpointState defaults) {
            $ = new NetworkLinkEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<NetworkLinkEndpointEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(NetworkLinkEndpointEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<NetworkLinkEndpointNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(NetworkLinkEndpointNetworkArgs network) {
            return network(Output.of(network));
        }

        public Builder networkLinkService(@Nullable Output<NetworkLinkEndpointNetworkLinkServiceArgs> networkLinkService) {
            $.networkLinkService = networkLinkService;
            return this;
        }

        public Builder networkLinkService(NetworkLinkEndpointNetworkLinkServiceArgs networkLinkService) {
            return networkLinkService(Output.of(networkLinkService));
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Network Link Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public NetworkLinkEndpointState build() {
            return $;
        }
    }

}