// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessPointGcpEgressPrivateServiceConnectEndpoint {
    /**
     * @return (Required String) Connection ID of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    private String privateServiceConnectEndpointConnectionId;
    /**
     * @return (Required String) IP address of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    private String privateServiceConnectEndpointIpAddress;
    /**
     * @return (Required String) Name of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    private String privateServiceConnectEndpointName;
    /**
     * @return (Required String) URI of the service attachment for the published service that the Private Service Connect Endpoint connects to, or &#34;ALL_GOOGLE_APIS&#34; or &#34;all-google-apis&#34; for global Google APIs.
     * 
     */
    private String privateServiceConnectEndpointTarget;

    private GetAccessPointGcpEgressPrivateServiceConnectEndpoint() {}
    /**
     * @return (Required String) Connection ID of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    public String privateServiceConnectEndpointConnectionId() {
        return this.privateServiceConnectEndpointConnectionId;
    }
    /**
     * @return (Required String) IP address of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    public String privateServiceConnectEndpointIpAddress() {
        return this.privateServiceConnectEndpointIpAddress;
    }
    /**
     * @return (Required String) Name of the Private Service Connect Endpoint that is connected to the endpoint target.
     * 
     */
    public String privateServiceConnectEndpointName() {
        return this.privateServiceConnectEndpointName;
    }
    /**
     * @return (Required String) URI of the service attachment for the published service that the Private Service Connect Endpoint connects to, or &#34;ALL_GOOGLE_APIS&#34; or &#34;all-google-apis&#34; for global Google APIs.
     * 
     */
    public String privateServiceConnectEndpointTarget() {
        return this.privateServiceConnectEndpointTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointGcpEgressPrivateServiceConnectEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateServiceConnectEndpointConnectionId;
        private String privateServiceConnectEndpointIpAddress;
        private String privateServiceConnectEndpointName;
        private String privateServiceConnectEndpointTarget;
        public Builder() {}
        public Builder(GetAccessPointGcpEgressPrivateServiceConnectEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateServiceConnectEndpointConnectionId = defaults.privateServiceConnectEndpointConnectionId;
    	      this.privateServiceConnectEndpointIpAddress = defaults.privateServiceConnectEndpointIpAddress;
    	      this.privateServiceConnectEndpointName = defaults.privateServiceConnectEndpointName;
    	      this.privateServiceConnectEndpointTarget = defaults.privateServiceConnectEndpointTarget;
        }

        @CustomType.Setter
        public Builder privateServiceConnectEndpointConnectionId(String privateServiceConnectEndpointConnectionId) {
            if (privateServiceConnectEndpointConnectionId == null) {
              throw new MissingRequiredPropertyException("GetAccessPointGcpEgressPrivateServiceConnectEndpoint", "privateServiceConnectEndpointConnectionId");
            }
            this.privateServiceConnectEndpointConnectionId = privateServiceConnectEndpointConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder privateServiceConnectEndpointIpAddress(String privateServiceConnectEndpointIpAddress) {
            if (privateServiceConnectEndpointIpAddress == null) {
              throw new MissingRequiredPropertyException("GetAccessPointGcpEgressPrivateServiceConnectEndpoint", "privateServiceConnectEndpointIpAddress");
            }
            this.privateServiceConnectEndpointIpAddress = privateServiceConnectEndpointIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateServiceConnectEndpointName(String privateServiceConnectEndpointName) {
            if (privateServiceConnectEndpointName == null) {
              throw new MissingRequiredPropertyException("GetAccessPointGcpEgressPrivateServiceConnectEndpoint", "privateServiceConnectEndpointName");
            }
            this.privateServiceConnectEndpointName = privateServiceConnectEndpointName;
            return this;
        }
        @CustomType.Setter
        public Builder privateServiceConnectEndpointTarget(String privateServiceConnectEndpointTarget) {
            if (privateServiceConnectEndpointTarget == null) {
              throw new MissingRequiredPropertyException("GetAccessPointGcpEgressPrivateServiceConnectEndpoint", "privateServiceConnectEndpointTarget");
            }
            this.privateServiceConnectEndpointTarget = privateServiceConnectEndpointTarget;
            return this;
        }
        public GetAccessPointGcpEgressPrivateServiceConnectEndpoint build() {
            final var _resultValue = new GetAccessPointGcpEgressPrivateServiceConnectEndpoint();
            _resultValue.privateServiceConnectEndpointConnectionId = privateServiceConnectEndpointConnectionId;
            _resultValue.privateServiceConnectEndpointIpAddress = privateServiceConnectEndpointIpAddress;
            _resultValue.privateServiceConnectEndpointName = privateServiceConnectEndpointName;
            _resultValue.privateServiceConnectEndpointTarget = privateServiceConnectEndpointTarget;
            return _resultValue;
        }
    }
}
