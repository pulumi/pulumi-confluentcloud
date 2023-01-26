// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetPeeringAw;
import com.pulumi.confluentcloud.outputs.GetPeeringAzure;
import com.pulumi.confluentcloud.outputs.GetPeeringEnvironment;
import com.pulumi.confluentcloud.outputs.GetPeeringGcp;
import com.pulumi.confluentcloud.outputs.GetPeeringNetwork;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPeeringResult {
    /**
     * @return (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
     * 
     */
    private List<GetPeeringAw> aws;
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    private List<GetPeeringAzure> azures;
    /**
     * @return (Optional String) The name of the Peering.
     * 
     */
    private String displayName;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private GetPeeringEnvironment environment;
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    private List<GetPeeringGcp> gcps;
    /**
     * @return (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetPeeringNetwork> networks;

    private GetPeeringResult() {}
    /**
     * @return (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringAw> aws() {
        return this.aws;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Optional String) The name of the Peering.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetPeeringEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
     * 
     */
    public List<GetPeeringGcp> gcps() {
        return this.gcps;
    }
    /**
     * @return (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetPeeringNetwork> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPeeringAw> aws;
        private List<GetPeeringAzure> azures;
        private String displayName;
        private GetPeeringEnvironment environment;
        private List<GetPeeringGcp> gcps;
        private String id;
        private List<GetPeeringNetwork> networks;
        public Builder() {}
        public Builder(GetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azures = defaults.azures;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.gcps = defaults.gcps;
    	      this.id = defaults.id;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder aws(List<GetPeeringAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder aws(GetPeeringAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder azures(List<GetPeeringAzure> azures) {
            this.azures = Objects.requireNonNull(azures);
            return this;
        }
        public Builder azures(GetPeeringAzure... azures) {
            return azures(List.of(azures));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetPeeringEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        @CustomType.Setter
        public Builder gcps(List<GetPeeringGcp> gcps) {
            this.gcps = Objects.requireNonNull(gcps);
            return this;
        }
        public Builder gcps(GetPeeringGcp... gcps) {
            return gcps(List.of(gcps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetPeeringNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetPeeringNetwork... networks) {
            return networks(List.of(networks));
        }
        public GetPeeringResult build() {
            final var o = new GetPeeringResult();
            o.aws = aws;
            o.azures = azures;
            o.displayName = displayName;
            o.environment = environment;
            o.gcps = gcps;
            o.id = id;
            o.networks = networks;
            return o;
        }
    }
}
