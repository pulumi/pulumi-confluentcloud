// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAttachmentConnectionAzure {
    private String privateEndpointResourceId;

    private GetPrivateLinkAttachmentConnectionAzure() {}
    public String privateEndpointResourceId() {
        return this.privateEndpointResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAttachmentConnectionAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateEndpointResourceId;
        public Builder() {}
        public Builder(GetPrivateLinkAttachmentConnectionAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointResourceId = defaults.privateEndpointResourceId;
        }

        @CustomType.Setter
        public Builder privateEndpointResourceId(String privateEndpointResourceId) {
            if (privateEndpointResourceId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentConnectionAzure", "privateEndpointResourceId");
            }
            this.privateEndpointResourceId = privateEndpointResourceId;
            return this;
        }
        public GetPrivateLinkAttachmentConnectionAzure build() {
            final var _resultValue = new GetPrivateLinkAttachmentConnectionAzure();
            _resultValue.privateEndpointResourceId = privateEndpointResourceId;
            return _resultValue;
        }
    }
}
