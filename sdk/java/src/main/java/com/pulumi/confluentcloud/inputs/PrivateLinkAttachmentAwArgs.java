// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkAttachmentAwArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkAttachmentAwArgs Empty = new PrivateLinkAttachmentAwArgs();

    /**
     * (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    @Import(name="vpcEndpointServiceName")
    private @Nullable Output<String> vpcEndpointServiceName;

    /**
     * @return (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    public Optional<Output<String>> vpcEndpointServiceName() {
        return Optional.ofNullable(this.vpcEndpointServiceName);
    }

    private PrivateLinkAttachmentAwArgs() {}

    private PrivateLinkAttachmentAwArgs(PrivateLinkAttachmentAwArgs $) {
        this.vpcEndpointServiceName = $.vpcEndpointServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkAttachmentAwArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkAttachmentAwArgs $;

        public Builder() {
            $ = new PrivateLinkAttachmentAwArgs();
        }

        public Builder(PrivateLinkAttachmentAwArgs defaults) {
            $ = new PrivateLinkAttachmentAwArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpcEndpointServiceName (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceName(@Nullable Output<String> vpcEndpointServiceName) {
            $.vpcEndpointServiceName = vpcEndpointServiceName;
            return this;
        }

        /**
         * @param vpcEndpointServiceName (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceName(String vpcEndpointServiceName) {
            return vpcEndpointServiceName(Output.of(vpcEndpointServiceName));
        }

        public PrivateLinkAttachmentAwArgs build() {
            return $;
        }
    }

}