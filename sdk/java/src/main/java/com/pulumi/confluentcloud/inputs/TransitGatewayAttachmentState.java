// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentAwsArgs;
import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayAttachmentState Empty = new TransitGatewayAttachmentState();

    /**
     * (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    @Import(name="aws")
    private @Nullable Output<TransitGatewayAttachmentAwsArgs> aws;

    /**
     * @return (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    public Optional<Output<TransitGatewayAttachmentAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * The name of the Transit Gateway Attachment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Transit Gateway Attachment.
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
    private @Nullable Output<TransitGatewayAttachmentEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<TransitGatewayAttachmentEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network")
    private @Nullable Output<TransitGatewayAttachmentNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Optional<Output<TransitGatewayAttachmentNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    private TransitGatewayAttachmentState() {}

    private TransitGatewayAttachmentState(TransitGatewayAttachmentState $) {
        this.aws = $.aws;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayAttachmentState $;

        public Builder() {
            $ = new TransitGatewayAttachmentState();
        }

        public Builder(TransitGatewayAttachmentState defaults) {
            $ = new TransitGatewayAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<TransitGatewayAttachmentAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(TransitGatewayAttachmentAwsArgs aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param displayName The name of the Transit Gateway Attachment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Transit Gateway Attachment.
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
        public Builder environment(@Nullable Output<TransitGatewayAttachmentEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(TransitGatewayAttachmentEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<TransitGatewayAttachmentNetworkArgs> network) {
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
        public Builder network(TransitGatewayAttachmentNetworkArgs network) {
            return network(Output.of(network));
        }

        public TransitGatewayAttachmentState build() {
            return $;
        }
    }

}
