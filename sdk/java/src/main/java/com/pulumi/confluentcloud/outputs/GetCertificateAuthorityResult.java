// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityResult {
    /**
     * @return (Required String) The name of the certificate file, for example, `certificate.pem`.
     * 
     */
    private String certificateChainFilename;
    /**
     * @return (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     * 
     */
    private String crlSource;
    /**
     * @return (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     * 
     */
    private String crlUpdatedAt;
    /**
     * @return (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
     * 
     */
    private String crlUrl;
    /**
     * @return (Required String) A description for the Certificate Authority.
     * 
     */
    private String description;
    /**
     * @return (Required String) A human-readable name for the Certificate Authority.
     * 
     */
    private String displayName;
    /**
     * @return (Required List of Strings) The expiration dates of certificates in the chain, for example, `[&#34;2017-07-21T17:32:28Z&#34;]`.
     * 
     */
    private List<String> expirationDates;
    /**
     * @return (Required List of Strings) The fingerprints for each certificate in the certificate chain, for example, `[&#34;B1BC968BD4f49D622AA89A81F2150152A41D829C&#34;]`.
     * 
     */
    private List<String> fingerprints;
    private String id;
    /**
     * @return (Required List of Strings) The serial numbers for each certificate in the certificate chain.
     * 
     */
    private List<String> serialNumbers;

    private GetCertificateAuthorityResult() {}
    /**
     * @return (Required String) The name of the certificate file, for example, `certificate.pem`.
     * 
     */
    public String certificateChainFilename() {
        return this.certificateChainFilename;
    }
    /**
     * @return (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     * 
     */
    public String crlSource() {
        return this.crlSource;
    }
    /**
     * @return (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     * 
     */
    public String crlUpdatedAt() {
        return this.crlUpdatedAt;
    }
    /**
     * @return (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
     * 
     */
    public String crlUrl() {
        return this.crlUrl;
    }
    /**
     * @return (Required String) A description for the Certificate Authority.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Required String) A human-readable name for the Certificate Authority.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required List of Strings) The expiration dates of certificates in the chain, for example, `[&#34;2017-07-21T17:32:28Z&#34;]`.
     * 
     */
    public List<String> expirationDates() {
        return this.expirationDates;
    }
    /**
     * @return (Required List of Strings) The fingerprints for each certificate in the certificate chain, for example, `[&#34;B1BC968BD4f49D622AA89A81F2150152A41D829C&#34;]`.
     * 
     */
    public List<String> fingerprints() {
        return this.fingerprints;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return (Required List of Strings) The serial numbers for each certificate in the certificate chain.
     * 
     */
    public List<String> serialNumbers() {
        return this.serialNumbers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateChainFilename;
        private String crlSource;
        private String crlUpdatedAt;
        private String crlUrl;
        private String description;
        private String displayName;
        private List<String> expirationDates;
        private List<String> fingerprints;
        private String id;
        private List<String> serialNumbers;
        public Builder() {}
        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChainFilename = defaults.certificateChainFilename;
    	      this.crlSource = defaults.crlSource;
    	      this.crlUpdatedAt = defaults.crlUpdatedAt;
    	      this.crlUrl = defaults.crlUrl;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.expirationDates = defaults.expirationDates;
    	      this.fingerprints = defaults.fingerprints;
    	      this.id = defaults.id;
    	      this.serialNumbers = defaults.serialNumbers;
        }

        @CustomType.Setter
        public Builder certificateChainFilename(String certificateChainFilename) {
            if (certificateChainFilename == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "certificateChainFilename");
            }
            this.certificateChainFilename = certificateChainFilename;
            return this;
        }
        @CustomType.Setter
        public Builder crlSource(String crlSource) {
            if (crlSource == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "crlSource");
            }
            this.crlSource = crlSource;
            return this;
        }
        @CustomType.Setter
        public Builder crlUpdatedAt(String crlUpdatedAt) {
            if (crlUpdatedAt == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "crlUpdatedAt");
            }
            this.crlUpdatedAt = crlUpdatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder crlUrl(String crlUrl) {
            if (crlUrl == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "crlUrl");
            }
            this.crlUrl = crlUrl;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDates(List<String> expirationDates) {
            if (expirationDates == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "expirationDates");
            }
            this.expirationDates = expirationDates;
            return this;
        }
        public Builder expirationDates(String... expirationDates) {
            return expirationDates(List.of(expirationDates));
        }
        @CustomType.Setter
        public Builder fingerprints(List<String> fingerprints) {
            if (fingerprints == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "fingerprints");
            }
            this.fingerprints = fingerprints;
            return this;
        }
        public Builder fingerprints(String... fingerprints) {
            return fingerprints(List.of(fingerprints));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumbers(List<String> serialNumbers) {
            if (serialNumbers == null) {
              throw new MissingRequiredPropertyException("GetCertificateAuthorityResult", "serialNumbers");
            }
            this.serialNumbers = serialNumbers;
            return this;
        }
        public Builder serialNumbers(String... serialNumbers) {
            return serialNumbers(List.of(serialNumbers));
        }
        public GetCertificateAuthorityResult build() {
            final var _resultValue = new GetCertificateAuthorityResult();
            _resultValue.certificateChainFilename = certificateChainFilename;
            _resultValue.crlSource = crlSource;
            _resultValue.crlUpdatedAt = crlUpdatedAt;
            _resultValue.crlUrl = crlUrl;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.expirationDates = expirationDates;
            _resultValue.fingerprints = fingerprints;
            _resultValue.id = id;
            _resultValue.serialNumbers = serialNumbers;
            return _resultValue;
        }
    }
}
