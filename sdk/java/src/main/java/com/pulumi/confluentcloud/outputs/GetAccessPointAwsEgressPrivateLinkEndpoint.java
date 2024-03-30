// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessPointAwsEgressPrivateLinkEndpoint {
    /**
     * @return (Required Boolean) Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
     * 
     */
    private Boolean enableHighAvailability;
    /**
     * @return (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
     * 
     */
    private String vpcEndpointDnsName;
    /**
     * @return (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
     * 
     */
    private String vpcEndpointId;
    /**
     * @return (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    private String vpcEndpointServiceName;

    private GetAccessPointAwsEgressPrivateLinkEndpoint() {}
    /**
     * @return (Required Boolean) Whether a resource should be provisioned with high availability. Endpoints deployed with high availability have network interfaces deployed in multiple AZs. Defaults to `false`.
     * 
     */
    public Boolean enableHighAvailability() {
        return this.enableHighAvailability;
    }
    /**
     * @return (Required String) The DNS name of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `*.vpce-00000000000000000-abcd1234.s3.us-west-2.vpce.amazonaws.com`.
     * 
     */
    public String vpcEndpointDnsName() {
        return this.vpcEndpointDnsName;
    }
    /**
     * @return (Required String) The ID of a VPC Endpoint (if any) that is connected to the VPC Endpoint service, for example, `vpce-00000000000000000`.
     * 
     */
    public String vpcEndpointId() {
        return this.vpcEndpointId;
    }
    /**
     * @return (Required String) AWS VPC Endpoint Service that can be used to establish connections for all zones, for example `com.amazonaws.vpce.us-west-2.vpce-svc-0d3be37e21708ecd3`.
     * 
     */
    public String vpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointAwsEgressPrivateLinkEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableHighAvailability;
        private String vpcEndpointDnsName;
        private String vpcEndpointId;
        private String vpcEndpointServiceName;
        public Builder() {}
        public Builder(GetAccessPointAwsEgressPrivateLinkEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHighAvailability = defaults.enableHighAvailability;
    	      this.vpcEndpointDnsName = defaults.vpcEndpointDnsName;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcEndpointServiceName = defaults.vpcEndpointServiceName;
        }

        @CustomType.Setter
        public Builder enableHighAvailability(Boolean enableHighAvailability) {
            if (enableHighAvailability == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsEgressPrivateLinkEndpoint", "enableHighAvailability");
            }
            this.enableHighAvailability = enableHighAvailability;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpointDnsName(String vpcEndpointDnsName) {
            if (vpcEndpointDnsName == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsEgressPrivateLinkEndpoint", "vpcEndpointDnsName");
            }
            this.vpcEndpointDnsName = vpcEndpointDnsName;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpointId(String vpcEndpointId) {
            if (vpcEndpointId == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsEgressPrivateLinkEndpoint", "vpcEndpointId");
            }
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpointServiceName(String vpcEndpointServiceName) {
            if (vpcEndpointServiceName == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsEgressPrivateLinkEndpoint", "vpcEndpointServiceName");
            }
            this.vpcEndpointServiceName = vpcEndpointServiceName;
            return this;
        }
        public GetAccessPointAwsEgressPrivateLinkEndpoint build() {
            final var _resultValue = new GetAccessPointAwsEgressPrivateLinkEndpoint();
            _resultValue.enableHighAvailability = enableHighAvailability;
            _resultValue.vpcEndpointDnsName = vpcEndpointDnsName;
            _resultValue.vpcEndpointId = vpcEndpointId;
            _resultValue.vpcEndpointServiceName = vpcEndpointServiceName;
            return _resultValue;
        }
    }
}
