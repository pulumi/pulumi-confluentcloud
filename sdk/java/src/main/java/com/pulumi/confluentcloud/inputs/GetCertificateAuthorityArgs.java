// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateAuthorityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityArgs Empty = new GetCertificateAuthorityArgs();

    /**
     * (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     * 
     */
    @Import(name="crlSource")
    private @Nullable Output<String> crlSource;

    /**
     * @return (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
     * 
     */
    public Optional<Output<String>> crlSource() {
        return Optional.ofNullable(this.crlSource);
    }

    /**
     * (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     * 
     */
    @Import(name="crlUpdatedAt")
    private @Nullable Output<String> crlUpdatedAt;

    /**
     * @return (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
     * 
     */
    public Optional<Output<String>> crlUpdatedAt() {
        return Optional.ofNullable(this.crlUpdatedAt);
    }

    /**
     * (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
     * 
     */
    @Import(name="crlUrl")
    private @Nullable Output<String> crlUrl;

    /**
     * @return (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
     * 
     */
    public Optional<Output<String>> crlUrl() {
        return Optional.ofNullable(this.crlUrl);
    }

    /**
     * The ID of the Certificate Authority, for example, `op-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Certificate Authority, for example, `op-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetCertificateAuthorityArgs() {}

    private GetCertificateAuthorityArgs(GetCertificateAuthorityArgs $) {
        this.crlSource = $.crlSource;
        this.crlUpdatedAt = $.crlUpdatedAt;
        this.crlUrl = $.crlUrl;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityArgs $;

        public Builder() {
            $ = new GetCertificateAuthorityArgs();
        }

        public Builder(GetCertificateAuthorityArgs defaults) {
            $ = new GetCertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crlSource (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
         * 
         * @return builder
         * 
         */
        public Builder crlSource(@Nullable Output<String> crlSource) {
            $.crlSource = crlSource;
            return this;
        }

        /**
         * @param crlSource (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL). Accepted values are `LOCAL` and `URL`.
         * 
         * @return builder
         * 
         */
        public Builder crlSource(String crlSource) {
            return crlSource(Output.of(crlSource));
        }

        /**
         * @param crlUpdatedAt (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
         * 
         * @return builder
         * 
         */
        public Builder crlUpdatedAt(@Nullable Output<String> crlUpdatedAt) {
            $.crlUpdatedAt = crlUpdatedAt;
            return this;
        }

        /**
         * @param crlUpdatedAt (Optional String) The timestamp for when CRL was last updated, for example, `2017-07-21T17:32:28Z`.
         * 
         * @return builder
         * 
         */
        public Builder crlUpdatedAt(String crlUpdatedAt) {
            return crlUpdatedAt(Output.of(crlUpdatedAt));
        }

        /**
         * @param crlUrl (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
         * 
         * @return builder
         * 
         */
        public Builder crlUrl(@Nullable Output<String> crlUrl) {
            $.crlUrl = crlUrl;
            return this;
        }

        /**
         * @param crlUrl (Optional String) The url from which to fetch the CRL for the certificate authority if crl_source is URL.
         * 
         * @return builder
         * 
         */
        public Builder crlUrl(String crlUrl) {
            return crlUrl(Output.of(crlUrl));
        }

        /**
         * @param id The ID of the Certificate Authority, for example, `op-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Certificate Authority, for example, `op-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetCertificateAuthorityArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetCertificateAuthorityArgs", "id");
            }
            return $;
        }
    }

}
