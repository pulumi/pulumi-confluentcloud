// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkAttachmentAzure {
    private @Nullable String privateLinkServiceAlias;
    private @Nullable String privateLinkServiceResourceId;
    private @Nullable String zone;

    private PrivateLinkAttachmentAzure() {}
    public Optional<String> privateLinkServiceAlias() {
        return Optional.ofNullable(this.privateLinkServiceAlias);
    }
    public Optional<String> privateLinkServiceResourceId() {
        return Optional.ofNullable(this.privateLinkServiceResourceId);
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkAttachmentAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String privateLinkServiceAlias;
        private @Nullable String privateLinkServiceResourceId;
        private @Nullable String zone;
        public Builder() {}
        public Builder(PrivateLinkAttachmentAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceAlias = defaults.privateLinkServiceAlias;
    	      this.privateLinkServiceResourceId = defaults.privateLinkServiceResourceId;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder privateLinkServiceAlias(@Nullable String privateLinkServiceAlias) {

            this.privateLinkServiceAlias = privateLinkServiceAlias;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceResourceId(@Nullable String privateLinkServiceResourceId) {

            this.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public PrivateLinkAttachmentAzure build() {
            final var _resultValue = new PrivateLinkAttachmentAzure();
            _resultValue.privateLinkServiceAlias = privateLinkServiceAlias;
            _resultValue.privateLinkServiceResourceId = privateLinkServiceResourceId;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
