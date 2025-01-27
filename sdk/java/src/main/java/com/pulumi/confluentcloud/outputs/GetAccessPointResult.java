// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetAccessPointAwsEgressPrivateLinkEndpoint;
import com.pulumi.confluentcloud.outputs.GetAccessPointAwsPrivateNetworkInterface;
import com.pulumi.confluentcloud.outputs.GetAccessPointAzureEgressPrivateLinkEndpoint;
import com.pulumi.confluentcloud.outputs.GetAccessPointEnvironment;
import com.pulumi.confluentcloud.outputs.GetAccessPointGateway;
import com.pulumi.confluentcloud.outputs.GetAccessPointGcpEgressPrivateServiceConnectEndpoint;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPointResult {
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetAccessPointAwsEgressPrivateLinkEndpoint> awsEgressPrivateLinkEndpoints;
    /**
     * @return (Optional Configuration Block) Supports the following:
     * 
     */
    private List<GetAccessPointAwsPrivateNetworkInterface> awsPrivateNetworkInterfaces;
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetAccessPointAzureEgressPrivateLinkEndpoint> azureEgressPrivateLinkEndpoints;
    /**
     * @return (Required String) A human-readable name for the Access Point.
     * 
     */
    private String displayName;
    private GetAccessPointEnvironment environment;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetAccessPointGateway> gateways;
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private @Nullable List<GetAccessPointGcpEgressPrivateServiceConnectEndpoint> gcpEgressPrivateServiceConnectEndpoints;
    /**
     * @return (Required String) The ID of the gateway to which the Access Point belongs, for example, `gw-abc123`.
     * 
     */
    private String id;

    private GetAccessPointResult() {}
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetAccessPointAwsEgressPrivateLinkEndpoint> awsEgressPrivateLinkEndpoints() {
        return this.awsEgressPrivateLinkEndpoints;
    }
    /**
     * @return (Optional Configuration Block) Supports the following:
     * 
     */
    public List<GetAccessPointAwsPrivateNetworkInterface> awsPrivateNetworkInterfaces() {
        return this.awsPrivateNetworkInterfaces;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetAccessPointAzureEgressPrivateLinkEndpoint> azureEgressPrivateLinkEndpoints() {
        return this.azureEgressPrivateLinkEndpoints;
    }
    /**
     * @return (Required String) A human-readable name for the Access Point.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public GetAccessPointEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetAccessPointGateway> gateways() {
        return this.gateways;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetAccessPointGcpEgressPrivateServiceConnectEndpoint> gcpEgressPrivateServiceConnectEndpoints() {
        return this.gcpEgressPrivateServiceConnectEndpoints == null ? List.of() : this.gcpEgressPrivateServiceConnectEndpoints;
    }
    /**
     * @return (Required String) The ID of the gateway to which the Access Point belongs, for example, `gw-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAccessPointAwsEgressPrivateLinkEndpoint> awsEgressPrivateLinkEndpoints;
        private List<GetAccessPointAwsPrivateNetworkInterface> awsPrivateNetworkInterfaces;
        private List<GetAccessPointAzureEgressPrivateLinkEndpoint> azureEgressPrivateLinkEndpoints;
        private String displayName;
        private GetAccessPointEnvironment environment;
        private List<GetAccessPointGateway> gateways;
        private @Nullable List<GetAccessPointGcpEgressPrivateServiceConnectEndpoint> gcpEgressPrivateServiceConnectEndpoints;
        private String id;
        public Builder() {}
        public Builder(GetAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsEgressPrivateLinkEndpoints = defaults.awsEgressPrivateLinkEndpoints;
    	      this.awsPrivateNetworkInterfaces = defaults.awsPrivateNetworkInterfaces;
    	      this.azureEgressPrivateLinkEndpoints = defaults.azureEgressPrivateLinkEndpoints;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.gateways = defaults.gateways;
    	      this.gcpEgressPrivateServiceConnectEndpoints = defaults.gcpEgressPrivateServiceConnectEndpoints;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder awsEgressPrivateLinkEndpoints(List<GetAccessPointAwsEgressPrivateLinkEndpoint> awsEgressPrivateLinkEndpoints) {
            if (awsEgressPrivateLinkEndpoints == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "awsEgressPrivateLinkEndpoints");
            }
            this.awsEgressPrivateLinkEndpoints = awsEgressPrivateLinkEndpoints;
            return this;
        }
        public Builder awsEgressPrivateLinkEndpoints(GetAccessPointAwsEgressPrivateLinkEndpoint... awsEgressPrivateLinkEndpoints) {
            return awsEgressPrivateLinkEndpoints(List.of(awsEgressPrivateLinkEndpoints));
        }
        @CustomType.Setter
        public Builder awsPrivateNetworkInterfaces(List<GetAccessPointAwsPrivateNetworkInterface> awsPrivateNetworkInterfaces) {
            if (awsPrivateNetworkInterfaces == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "awsPrivateNetworkInterfaces");
            }
            this.awsPrivateNetworkInterfaces = awsPrivateNetworkInterfaces;
            return this;
        }
        public Builder awsPrivateNetworkInterfaces(GetAccessPointAwsPrivateNetworkInterface... awsPrivateNetworkInterfaces) {
            return awsPrivateNetworkInterfaces(List.of(awsPrivateNetworkInterfaces));
        }
        @CustomType.Setter
        public Builder azureEgressPrivateLinkEndpoints(List<GetAccessPointAzureEgressPrivateLinkEndpoint> azureEgressPrivateLinkEndpoints) {
            if (azureEgressPrivateLinkEndpoints == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "azureEgressPrivateLinkEndpoints");
            }
            this.azureEgressPrivateLinkEndpoints = azureEgressPrivateLinkEndpoints;
            return this;
        }
        public Builder azureEgressPrivateLinkEndpoints(GetAccessPointAzureEgressPrivateLinkEndpoint... azureEgressPrivateLinkEndpoints) {
            return azureEgressPrivateLinkEndpoints(List.of(azureEgressPrivateLinkEndpoints));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetAccessPointEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder gateways(List<GetAccessPointGateway> gateways) {
            if (gateways == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "gateways");
            }
            this.gateways = gateways;
            return this;
        }
        public Builder gateways(GetAccessPointGateway... gateways) {
            return gateways(List.of(gateways));
        }
        @CustomType.Setter
        public Builder gcpEgressPrivateServiceConnectEndpoints(@Nullable List<GetAccessPointGcpEgressPrivateServiceConnectEndpoint> gcpEgressPrivateServiceConnectEndpoints) {

            this.gcpEgressPrivateServiceConnectEndpoints = gcpEgressPrivateServiceConnectEndpoints;
            return this;
        }
        public Builder gcpEgressPrivateServiceConnectEndpoints(GetAccessPointGcpEgressPrivateServiceConnectEndpoint... gcpEgressPrivateServiceConnectEndpoints) {
            return gcpEgressPrivateServiceConnectEndpoints(List.of(gcpEgressPrivateServiceConnectEndpoints));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccessPointResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetAccessPointResult build() {
            final var _resultValue = new GetAccessPointResult();
            _resultValue.awsEgressPrivateLinkEndpoints = awsEgressPrivateLinkEndpoints;
            _resultValue.awsPrivateNetworkInterfaces = awsPrivateNetworkInterfaces;
            _resultValue.azureEgressPrivateLinkEndpoints = azureEgressPrivateLinkEndpoints;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.gateways = gateways;
            _resultValue.gcpEgressPrivateServiceConnectEndpoints = gcpEgressPrivateServiceConnectEndpoints;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
