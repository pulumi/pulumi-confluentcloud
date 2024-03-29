// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TransitGatewayAttachmentNetwork {
    /**
     * @return The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     * 
     */
    private String id;

    private TransitGatewayAttachmentNetwork() {}
    /**
     * @return The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayAttachmentNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(TransitGatewayAttachmentNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("TransitGatewayAttachmentNetwork", "id");
            }
            this.id = id;
            return this;
        }
        public TransitGatewayAttachmentNetwork build() {
            final var _resultValue = new TransitGatewayAttachmentNetwork();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
