// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetPrivateLinkAccessAw;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAccessAzure;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAccessEnvironment;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAccessGcp;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAccessNetwork;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAccessResult {
    /**
     * @return (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
     * 
     */
    private List<GetPrivateLinkAccessAw> aws;
    /**
     * @return (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
     * 
     */
    private List<GetPrivateLinkAccessAzure> azures;
    /**
     * @return (Optional String) The name of the Private Link Access.
     * 
     */
    private String displayName;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private GetPrivateLinkAccessEnvironment environment;
    /**
     * @return (Optional Configuration Block) The GCP-specific Private Service Connect details if available. It supports the following:
     * 
     */
    private List<GetPrivateLinkAccessGcp> gcps;
    /**
     * @return (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetPrivateLinkAccessNetwork> networks;

    private GetPrivateLinkAccessResult() {}
    /**
     * @return (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
     * 
     */
    public List<GetPrivateLinkAccessAw> aws() {
        return this.aws;
    }
    /**
     * @return (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
     * 
     */
    public List<GetPrivateLinkAccessAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Optional String) The name of the Private Link Access.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetPrivateLinkAccessEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Optional Configuration Block) The GCP-specific Private Service Connect details if available. It supports the following:
     * 
     */
    public List<GetPrivateLinkAccessGcp> gcps() {
        return this.gcps;
    }
    /**
     * @return (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetPrivateLinkAccessNetwork> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAccessResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPrivateLinkAccessAw> aws;
        private List<GetPrivateLinkAccessAzure> azures;
        private String displayName;
        private GetPrivateLinkAccessEnvironment environment;
        private List<GetPrivateLinkAccessGcp> gcps;
        private String id;
        private List<GetPrivateLinkAccessNetwork> networks;
        public Builder() {}
        public Builder(GetPrivateLinkAccessResult defaults) {
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
        public Builder aws(List<GetPrivateLinkAccessAw> aws) {
            if (aws == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "aws");
            }
            this.aws = aws;
            return this;
        }
        public Builder aws(GetPrivateLinkAccessAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder azures(List<GetPrivateLinkAccessAzure> azures) {
            if (azures == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "azures");
            }
            this.azures = azures;
            return this;
        }
        public Builder azures(GetPrivateLinkAccessAzure... azures) {
            return azures(List.of(azures));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetPrivateLinkAccessEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder gcps(List<GetPrivateLinkAccessGcp> gcps) {
            if (gcps == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "gcps");
            }
            this.gcps = gcps;
            return this;
        }
        public Builder gcps(GetPrivateLinkAccessGcp... gcps) {
            return gcps(List.of(gcps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetPrivateLinkAccessNetwork> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAccessResult", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(GetPrivateLinkAccessNetwork... networks) {
            return networks(List.of(networks));
        }
        public GetPrivateLinkAccessResult build() {
            final var _resultValue = new GetPrivateLinkAccessResult();
            _resultValue.aws = aws;
            _resultValue.azures = azures;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.gcps = gcps;
            _resultValue.id = id;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
