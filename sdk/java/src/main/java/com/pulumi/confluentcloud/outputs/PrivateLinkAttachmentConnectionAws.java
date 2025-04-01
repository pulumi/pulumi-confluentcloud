// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateLinkAttachmentConnectionAws {
    /**
     * @return ID of a VPC Endpoint that is connected to the VPC Endpoint service.
     * 
     */
    private String vpcEndpointId;

    private PrivateLinkAttachmentConnectionAws() {}
    /**
     * @return ID of a VPC Endpoint that is connected to the VPC Endpoint service.
     * 
     */
    public String vpcEndpointId() {
        return this.vpcEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkAttachmentConnectionAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String vpcEndpointId;
        public Builder() {}
        public Builder(PrivateLinkAttachmentConnectionAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        @CustomType.Setter
        public Builder vpcEndpointId(String vpcEndpointId) {
            if (vpcEndpointId == null) {
              throw new MissingRequiredPropertyException("PrivateLinkAttachmentConnectionAws", "vpcEndpointId");
            }
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public PrivateLinkAttachmentConnectionAws build() {
            final var _resultValue = new PrivateLinkAttachmentConnectionAws();
            _resultValue.vpcEndpointId = vpcEndpointId;
            return _resultValue;
        }
    }
}
