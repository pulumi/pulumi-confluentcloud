// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetTransitGatewayAttachmentAw;
import com.pulumi.confluentcloud.outputs.GetTransitGatewayAttachmentEnvironment;
import com.pulumi.confluentcloud.outputs.GetTransitGatewayAttachmentNetwork;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTransitGatewayAttachmentResult {
    /**
     * @return (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    private List<GetTransitGatewayAttachmentAw> aws;
    /**
     * @return (Required String) The name of the Transit Gateway Attachment.
     * 
     */
    private String displayName;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private GetTransitGatewayAttachmentEnvironment environment;
    /**
     * @return (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetTransitGatewayAttachmentNetwork> networks;

    private GetTransitGatewayAttachmentResult() {}
    /**
     * @return (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    public List<GetTransitGatewayAttachmentAw> aws() {
        return this.aws;
    }
    /**
     * @return (Required String) The name of the Transit Gateway Attachment.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetTransitGatewayAttachmentEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetTransitGatewayAttachmentNetwork> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayAttachmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTransitGatewayAttachmentAw> aws;
        private String displayName;
        private GetTransitGatewayAttachmentEnvironment environment;
        private String id;
        private List<GetTransitGatewayAttachmentNetwork> networks;
        public Builder() {}
        public Builder(GetTransitGatewayAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder aws(List<GetTransitGatewayAttachmentAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder aws(GetTransitGatewayAttachmentAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetTransitGatewayAttachmentEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetTransitGatewayAttachmentNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetTransitGatewayAttachmentNetwork... networks) {
            return networks(List.of(networks));
        }
        public GetTransitGatewayAttachmentResult build() {
            final var _resultValue = new GetTransitGatewayAttachmentResult();
            _resultValue.aws = aws;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
