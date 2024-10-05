// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetCertificatePoolCertificateAuthority;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificatePoolResult {
    private GetCertificatePoolCertificateAuthority certificateAuthority;
    /**
     * @return (Required String) A description of the Certificate Pool.
     * 
     */
    private String description;
    /**
     * @return (Required String) A human-readable name for the Certificate Pool.
     * 
     */
    private String displayName;
    /**
     * @return (Required String) The certificate field that will be used to represent the pool&#39;s external identity for audit logging, for example, `UID`.
     * 
     */
    private String externalIdentifier;
    /**
     * @return (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     * 
     */
    private String filter;
    private String id;

    private GetCertificatePoolResult() {}
    public GetCertificatePoolCertificateAuthority certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * @return (Required String) A description of the Certificate Pool.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Required String) A human-readable name for the Certificate Pool.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required String) The certificate field that will be used to represent the pool&#39;s external identity for audit logging, for example, `UID`.
     * 
     */
    public String externalIdentifier() {
        return this.externalIdentifier;
    }
    /**
     * @return (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     * 
     */
    public String filter() {
        return this.filter;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatePoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetCertificatePoolCertificateAuthority certificateAuthority;
        private String description;
        private String displayName;
        private String externalIdentifier;
        private String filter;
        private String id;
        public Builder() {}
        public Builder(GetCertificatePoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.externalIdentifier = defaults.externalIdentifier;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder certificateAuthority(GetCertificatePoolCertificateAuthority certificateAuthority) {
            if (certificateAuthority == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "certificateAuthority");
            }
            this.certificateAuthority = certificateAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder externalIdentifier(String externalIdentifier) {
            if (externalIdentifier == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "externalIdentifier");
            }
            this.externalIdentifier = externalIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCertificatePoolResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetCertificatePoolResult build() {
            final var _resultValue = new GetCertificatePoolResult();
            _resultValue.certificateAuthority = certificateAuthority;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.externalIdentifier = externalIdentifier;
            _resultValue.filter = filter;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
