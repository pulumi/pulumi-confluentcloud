// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.CertificatePoolCertificateAuthorityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CertificatePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificatePoolArgs Empty = new CertificatePoolArgs();

    @Import(name="certificateAuthority", required=true)
    private Output<CertificatePoolCertificateAuthorityArgs> certificateAuthority;

    public Output<CertificatePoolCertificateAuthorityArgs> certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * A description of the Certificate Pool.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description of the Certificate Pool.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The name of the Certificate Pool.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the Certificate Pool.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The certificate field that will be used to represent the pool&#39;s external identity for audit logging.
     * 
     */
    @Import(name="externalIdentifier", required=true)
    private Output<String> externalIdentifier;

    /**
     * @return The certificate field that will be used to represent the pool&#39;s external identity for audit logging.
     * 
     */
    public Output<String> externalIdentifier() {
        return this.externalIdentifier;
    }

    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    private CertificatePoolArgs() {}

    private CertificatePoolArgs(CertificatePoolArgs $) {
        this.certificateAuthority = $.certificateAuthority;
        this.description = $.description;
        this.displayName = $.displayName;
        this.externalIdentifier = $.externalIdentifier;
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificatePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificatePoolArgs $;

        public Builder() {
            $ = new CertificatePoolArgs();
        }

        public Builder(CertificatePoolArgs defaults) {
            $ = new CertificatePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateAuthority(Output<CertificatePoolCertificateAuthorityArgs> certificateAuthority) {
            $.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder certificateAuthority(CertificatePoolCertificateAuthorityArgs certificateAuthority) {
            return certificateAuthority(Output.of(certificateAuthority));
        }

        /**
         * @param description A description of the Certificate Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Certificate Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the Certificate Pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Certificate Pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param externalIdentifier The certificate field that will be used to represent the pool&#39;s external identity for audit logging.
         * 
         * @return builder
         * 
         */
        public Builder externalIdentifier(Output<String> externalIdentifier) {
            $.externalIdentifier = externalIdentifier;
            return this;
        }

        /**
         * @param externalIdentifier The certificate field that will be used to represent the pool&#39;s external identity for audit logging.
         * 
         * @return builder
         * 
         */
        public Builder externalIdentifier(String externalIdentifier) {
            return externalIdentifier(Output.of(externalIdentifier));
        }

        /**
         * @param filter A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/mtls/cel-filters.html) that specifies which identities can authenticate using your certificate pool.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public CertificatePoolArgs build() {
            if ($.certificateAuthority == null) {
                throw new MissingRequiredPropertyException("CertificatePoolArgs", "certificateAuthority");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CertificatePoolArgs", "description");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("CertificatePoolArgs", "displayName");
            }
            if ($.externalIdentifier == null) {
                throw new MissingRequiredPropertyException("CertificatePoolArgs", "externalIdentifier");
            }
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("CertificatePoolArgs", "filter");
            }
            return $;
        }
    }

}
