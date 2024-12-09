// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.PeeringAwsArgs;
import com.pulumi.confluentcloud.inputs.PeeringAzureArgs;
import com.pulumi.confluentcloud.inputs.PeeringEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.PeeringGcpArgs;
import com.pulumi.confluentcloud.inputs.PeeringNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringState extends com.pulumi.resources.ResourceArgs {

    public static final PeeringState Empty = new PeeringState();

    @Import(name="aws")
    private @Nullable Output<PeeringAwsArgs> aws;

    public Optional<Output<PeeringAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    @Import(name="azure")
    private @Nullable Output<PeeringAzureArgs> azure;

    public Optional<Output<PeeringAzureArgs>> azure() {
        return Optional.ofNullable(this.azure);
    }

    /**
     * The name of the Peering.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Peering.
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
    private @Nullable Output<PeeringEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<PeeringEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="gcp")
    private @Nullable Output<PeeringGcpArgs> gcp;

    public Optional<Output<PeeringGcpArgs>> gcp() {
        return Optional.ofNullable(this.gcp);
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network")
    private @Nullable Output<PeeringNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Optional<Output<PeeringNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    private PeeringState() {}

    private PeeringState(PeeringState $) {
        this.aws = $.aws;
        this.azure = $.azure;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.gcp = $.gcp;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringState $;

        public Builder() {
            $ = new PeeringState();
        }

        public Builder(PeeringState defaults) {
            $ = new PeeringState(Objects.requireNonNull(defaults));
        }

        public Builder aws(@Nullable Output<PeeringAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(PeeringAwsArgs aws) {
            return aws(Output.of(aws));
        }

        public Builder azure(@Nullable Output<PeeringAzureArgs> azure) {
            $.azure = azure;
            return this;
        }

        public Builder azure(PeeringAzureArgs azure) {
            return azure(Output.of(azure));
        }

        /**
         * @param displayName The name of the Peering.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Peering.
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
        public Builder environment(@Nullable Output<PeeringEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(PeeringEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder gcp(@Nullable Output<PeeringGcpArgs> gcp) {
            $.gcp = gcp;
            return this;
        }

        public Builder gcp(PeeringGcpArgs gcp) {
            return gcp(Output.of(gcp));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<PeeringNetworkArgs> network) {
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
        public Builder network(PeeringNetworkArgs network) {
            return network(Output.of(network));
        }

        public PeeringState build() {
            return $;
        }
    }

}