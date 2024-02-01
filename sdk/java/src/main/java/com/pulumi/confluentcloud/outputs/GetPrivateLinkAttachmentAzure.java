// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAttachmentAzure {
    /**
     * @return Azure PrivateLink service alias for the availability zone.
     * 
     */
    private String privateLinkServiceAlias;
    /**
     * @return Azure PrivateLink service resource id for the availability zone.
     * 
     */
    private String privateLinkServiceResourceId;
    /**
     * @return Availability zone associated with the Azure PrivateLink service.
     * 
     */
    private String zone;

    private GetPrivateLinkAttachmentAzure() {}
    /**
     * @return Azure PrivateLink service alias for the availability zone.
     * 
     */
    public String privateLinkServiceAlias() {
        return this.privateLinkServiceAlias;
    }
    /**
     * @return Azure PrivateLink service resource id for the availability zone.
     * 
     */
    public String privateLinkServiceResourceId() {
        return this.privateLinkServiceResourceId;
    }
    /**
     * @return Availability zone associated with the Azure PrivateLink service.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAttachmentAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateLinkServiceAlias;
        private String privateLinkServiceResourceId;
        private String zone;
        public Builder() {}
        public Builder(GetPrivateLinkAttachmentAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceAlias = defaults.privateLinkServiceAlias;
    	      this.privateLinkServiceResourceId = defaults.privateLinkServiceResourceId;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder privateLinkServiceAlias(String privateLinkServiceAlias) {
            if (privateLinkServiceAlias == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentAzure", "privateLinkServiceAlias");
            }
            this.privateLinkServiceAlias = privateLinkServiceAlias;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceResourceId(String privateLinkServiceResourceId) {
            if (privateLinkServiceResourceId == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentAzure", "privateLinkServiceResourceId");
            }
            this.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentAzure", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetPrivateLinkAttachmentAzure build() {
            final var _resultValue = new GetPrivateLinkAttachmentAzure();
            _resultValue.privateLinkServiceAlias = privateLinkServiceAlias;
            _resultValue.privateLinkServiceResourceId = privateLinkServiceResourceId;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
