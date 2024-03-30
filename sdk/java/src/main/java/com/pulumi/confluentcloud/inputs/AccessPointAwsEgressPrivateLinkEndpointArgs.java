// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointAwsEgressPrivateLinkEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointAwsEgressPrivateLinkEndpointArgs Empty = new AccessPointAwsEgressPrivateLinkEndpointArgs();

    /**
     * Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
     * 
     */
    @Import(name="enableHighAvailability")
    private @Nullable Output<Boolean> enableHighAvailability;

    /**
     * @return Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableHighAvailability() {
        return Optional.ofNullable(this.enableHighAvailability);
    }

    /**
     * (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
     * 
     */
    @Import(name="vpcEndpointDnsName")
    private @Nullable Output<String> vpcEndpointDnsName;

    /**
     * @return (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
     * 
     */
    public Optional<Output<String>> vpcEndpointDnsName() {
        return Optional.ofNullable(this.vpcEndpointDnsName);
    }

    /**
     * (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
     * 
     */
    @Import(name="vpcEndpointId")
    private @Nullable Output<String> vpcEndpointId;

    /**
     * @return (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
     * 
     */
    public Optional<Output<String>> vpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }

    /**
     * AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    @Import(name="vpcEndpointServiceName", required=true)
    private Output<String> vpcEndpointServiceName;

    /**
     * @return AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    public Output<String> vpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    private AccessPointAwsEgressPrivateLinkEndpointArgs() {}

    private AccessPointAwsEgressPrivateLinkEndpointArgs(AccessPointAwsEgressPrivateLinkEndpointArgs $) {
        this.enableHighAvailability = $.enableHighAvailability;
        this.vpcEndpointDnsName = $.vpcEndpointDnsName;
        this.vpcEndpointId = $.vpcEndpointId;
        this.vpcEndpointServiceName = $.vpcEndpointServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointAwsEgressPrivateLinkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointAwsEgressPrivateLinkEndpointArgs $;

        public Builder() {
            $ = new AccessPointAwsEgressPrivateLinkEndpointArgs();
        }

        public Builder(AccessPointAwsEgressPrivateLinkEndpointArgs defaults) {
            $ = new AccessPointAwsEgressPrivateLinkEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableHighAvailability Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableHighAvailability(@Nullable Output<Boolean> enableHighAvailability) {
            $.enableHighAvailability = enableHighAvailability;
            return this;
        }

        /**
         * @param enableHighAvailability Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableHighAvailability(Boolean enableHighAvailability) {
            return enableHighAvailability(Output.of(enableHighAvailability));
        }

        /**
         * @param vpcEndpointDnsName (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointDnsName(@Nullable Output<String> vpcEndpointDnsName) {
            $.vpcEndpointDnsName = vpcEndpointDnsName;
            return this;
        }

        /**
         * @param vpcEndpointDnsName (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointDnsName(String vpcEndpointDnsName) {
            return vpcEndpointDnsName(Output.of(vpcEndpointDnsName));
        }

        /**
         * @param vpcEndpointId (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * @param vpcEndpointId (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            return vpcEndpointId(Output.of(vpcEndpointId));
        }

        /**
         * @param vpcEndpointServiceName AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceName(Output<String> vpcEndpointServiceName) {
            $.vpcEndpointServiceName = vpcEndpointServiceName;
            return this;
        }

        /**
         * @param vpcEndpointServiceName AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointServiceName(String vpcEndpointServiceName) {
            return vpcEndpointServiceName(Output.of(vpcEndpointServiceName));
        }

        public AccessPointAwsEgressPrivateLinkEndpointArgs build() {
            if ($.vpcEndpointServiceName == null) {
                throw new MissingRequiredPropertyException("AccessPointAwsEgressPrivateLinkEndpointArgs", "vpcEndpointServiceName");
            }
            return $;
        }
    }

}
