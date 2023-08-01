// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateLinkAttachmentEnvironment {
    /**
     * @return The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     * 
     */
    private String id;

    private PrivateLinkAttachmentEnvironment() {}
    /**
     * @return The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkAttachmentEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(PrivateLinkAttachmentEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public PrivateLinkAttachmentEnvironment build() {
            final var o = new PrivateLinkAttachmentEnvironment();
            o.id = id;
            return o;
        }
    }
}