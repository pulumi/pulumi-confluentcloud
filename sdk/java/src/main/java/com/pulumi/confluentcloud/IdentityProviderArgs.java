// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class IdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProviderArgs Empty = new IdentityProviderArgs();

    /**
     * A description for the Identity Provider.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description for the Identity Provider.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * A human-readable name for the Identity Provider.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return A human-readable name for the Identity Provider.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     * 
     * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    @Import(name="jwksUri", required=true)
    private Output<String> jwksUri;

    /**
     * @return A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     * 
     * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    public Output<String> jwksUri() {
        return this.jwksUri;
    }

    private IdentityProviderArgs() {}

    private IdentityProviderArgs(IdentityProviderArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.issuer = $.issuer;
        this.jwksUri = $.jwksUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProviderArgs $;

        public Builder() {
            $ = new IdentityProviderArgs();
        }

        public Builder(IdentityProviderArgs defaults) {
            $ = new IdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for the Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A human-readable name for the Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param issuer A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
         * 
         * @return builder
         * 
         */
        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param jwksUri A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
         * 
         * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
         * 
         * @return builder
         * 
         */
        public Builder jwksUri(Output<String> jwksUri) {
            $.jwksUri = jwksUri;
            return this;
        }

        /**
         * @param jwksUri A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
         * 
         * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
         * 
         * @return builder
         * 
         */
        public Builder jwksUri(String jwksUri) {
            return jwksUri(Output.of(jwksUri));
        }

        public IdentityProviderArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("IdentityProviderArgs", "description");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("IdentityProviderArgs", "displayName");
            }
            if ($.issuer == null) {
                throw new MissingRequiredPropertyException("IdentityProviderArgs", "issuer");
            }
            if ($.jwksUri == null) {
                throw new MissingRequiredPropertyException("IdentityProviderArgs", "jwksUri");
            }
            return $;
        }
    }

}
