// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetIdentityPoolIdentityProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIdentityPoolResult {
    /**
     * @return (Required String) A description for the Identity Pool.
     * 
     */
    private String description;
    /**
     * @return (Required String) A human-readable name for the Identity Pool.
     * 
     */
    private String displayName;
    /**
     * @return (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    private String filter;
    /**
     * @return (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    private String identityClaim;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private GetIdentityPoolIdentityProvider identityProvider;

    private GetIdentityPoolResult() {}
    /**
     * @return (Required String) A description for the Identity Pool.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Required String) A human-readable name for the Identity Pool.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    public String identityClaim() {
        return this.identityClaim;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetIdentityPoolIdentityProvider identityProvider() {
        return this.identityProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdentityPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String displayName;
        private String filter;
        private String id;
        private String identityClaim;
        private GetIdentityPoolIdentityProvider identityProvider;
        public Builder() {}
        public Builder(GetIdentityPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.identityClaim = defaults.identityClaim;
    	      this.identityProvider = defaults.identityProvider;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identityClaim(String identityClaim) {
            this.identityClaim = Objects.requireNonNull(identityClaim);
            return this;
        }
        @CustomType.Setter
        public Builder identityProvider(GetIdentityPoolIdentityProvider identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }
        public GetIdentityPoolResult build() {
            final var _resultValue = new GetIdentityPoolResult();
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.identityClaim = identityClaim;
            _resultValue.identityProvider = identityProvider;
            return _resultValue;
        }
    }
}
