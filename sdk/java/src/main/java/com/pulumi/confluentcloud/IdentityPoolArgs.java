// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.IdentityPoolIdentityProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IdentityPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityPoolArgs Empty = new IdentityPoolArgs();

    /**
     * A description for the Identity Pool.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description for the Identity Pool.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * A human-readable name for the Identity Pool.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return A human-readable name for the Identity Pool.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    @Import(name="identityClaim", required=true)
    private Output<String> identityClaim;

    /**
     * @return The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    public Output<String> identityClaim() {
        return this.identityClaim;
    }

    /**
     * Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
     * 
     */
    @Import(name="identityProvider", required=true)
    private Output<IdentityPoolIdentityProviderArgs> identityProvider;

    /**
     * @return Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
     * 
     */
    public Output<IdentityPoolIdentityProviderArgs> identityProvider() {
        return this.identityProvider;
    }

    private IdentityPoolArgs() {}

    private IdentityPoolArgs(IdentityPoolArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.filter = $.filter;
        this.identityClaim = $.identityClaim;
        this.identityProvider = $.identityProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPoolArgs $;

        public Builder() {
            $ = new IdentityPoolArgs();
        }

        public Builder(IdentityPoolArgs defaults) {
            $ = new IdentityPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for the Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A human-readable name for the Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param filter A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param identityClaim The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
         * 
         * @return builder
         * 
         */
        public Builder identityClaim(Output<String> identityClaim) {
            $.identityClaim = identityClaim;
            return this;
        }

        /**
         * @param identityClaim The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
         * 
         * @return builder
         * 
         */
        public Builder identityClaim(String identityClaim) {
            return identityClaim(Output.of(identityClaim));
        }

        /**
         * @param identityProvider Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(Output<IdentityPoolIdentityProviderArgs> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(IdentityPoolIdentityProviderArgs identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        public IdentityPoolArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.identityClaim = Objects.requireNonNull($.identityClaim, "expected parameter 'identityClaim' to be non-null");
            $.identityProvider = Objects.requireNonNull($.identityProvider, "expected parameter 'identityProvider' to be non-null");
            return $;
        }
    }

}
