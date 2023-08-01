// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateLinkAttachmentConnectionAzure {
    private String privateEndpointResourceId;

    private PrivateLinkAttachmentConnectionAzure() {}
    public String privateEndpointResourceId() {
        return this.privateEndpointResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkAttachmentConnectionAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateEndpointResourceId;
        public Builder() {}
        public Builder(PrivateLinkAttachmentConnectionAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointResourceId = defaults.privateEndpointResourceId;
        }

        @CustomType.Setter
        public Builder privateEndpointResourceId(String privateEndpointResourceId) {
            this.privateEndpointResourceId = Objects.requireNonNull(privateEndpointResourceId);
            return this;
        }
        public PrivateLinkAttachmentConnectionAzure build() {
            final var o = new PrivateLinkAttachmentConnectionAzure();
            o.privateEndpointResourceId = privateEndpointResourceId;
            return o;
        }
    }
}