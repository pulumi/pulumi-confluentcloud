// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayAwsPrivateNetworkInterfaceGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayAwsPrivateNetworkInterfaceGatewayArgs Empty = new GatewayAwsPrivateNetworkInterfaceGatewayArgs();

    /**
     * (Required String) The AWS account ID associated with the Private Network Interface Gateway.
     * 
     */
    @Import(name="account")
    private @Nullable Output<String> account;

    /**
     * @return (Required String) The AWS account ID associated with the Private Network Interface Gateway.
     * 
     */
    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * AWS region of the Private Network Interface Gateway.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return AWS region of the Private Network Interface Gateway.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * AWS availability zone ids of the Private Network Interface Gateway.
     * 
     */
    @Import(name="zones", required=true)
    private Output<List<String>> zones;

    /**
     * @return AWS availability zone ids of the Private Network Interface Gateway.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    private GatewayAwsPrivateNetworkInterfaceGatewayArgs() {}

    private GatewayAwsPrivateNetworkInterfaceGatewayArgs(GatewayAwsPrivateNetworkInterfaceGatewayArgs $) {
        this.account = $.account;
        this.region = $.region;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayAwsPrivateNetworkInterfaceGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayAwsPrivateNetworkInterfaceGatewayArgs $;

        public Builder() {
            $ = new GatewayAwsPrivateNetworkInterfaceGatewayArgs();
        }

        public Builder(GatewayAwsPrivateNetworkInterfaceGatewayArgs defaults) {
            $ = new GatewayAwsPrivateNetworkInterfaceGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account (Required String) The AWS account ID associated with the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<String> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account (Required String) The AWS account ID associated with the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder account(String account) {
            return account(Output.of(account));
        }

        /**
         * @param region AWS region of the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region AWS region of the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param zones AWS availability zone ids of the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder zones(Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones AWS availability zone ids of the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones AWS availability zone ids of the Private Network Interface Gateway.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public GatewayAwsPrivateNetworkInterfaceGatewayArgs build() {
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GatewayAwsPrivateNetworkInterfaceGatewayArgs", "region");
            }
            if ($.zones == null) {
                throw new MissingRequiredPropertyException("GatewayAwsPrivateNetworkInterfaceGatewayArgs", "zones");
            }
            return $;
        }
    }

}