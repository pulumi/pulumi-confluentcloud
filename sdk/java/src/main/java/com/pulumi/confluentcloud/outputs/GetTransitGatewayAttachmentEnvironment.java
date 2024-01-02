// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitGatewayAttachmentEnvironment {
    /**
     * @return The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    private String id;

    private GetTransitGatewayAttachmentEnvironment() {}
    /**
     * @return The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayAttachmentEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetTransitGatewayAttachmentEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransitGatewayAttachmentEnvironment", "id");
            }
            this.id = id;
            return this;
        }
        public GetTransitGatewayAttachmentEnvironment build() {
            final var _resultValue = new GetTransitGatewayAttachmentEnvironment();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
