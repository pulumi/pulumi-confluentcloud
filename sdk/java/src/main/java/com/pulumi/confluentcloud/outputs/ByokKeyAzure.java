// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ByokKeyAzure {
    /**
     * @return (Optional String) The Application ID created for this key-environment combination.
     * 
     */
    private @Nullable String applicationId;
    /**
     * @return The unique Key Object Identifier URL of an Azure Key Vault key.
     * 
     */
    private String keyIdentifier;
    /**
     * @return Key Vault ID containing the key.
     * 
     */
    private String keyVaultId;
    /**
     * @return Tenant ID (uuid) hosting the Key Vault containing the key.
     * 
     */
    private String tenantId;

    private ByokKeyAzure() {}
    /**
     * @return (Optional String) The Application ID created for this key-environment combination.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return The unique Key Object Identifier URL of an Azure Key Vault key.
     * 
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }
    /**
     * @return Key Vault ID containing the key.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return Tenant ID (uuid) hosting the Key Vault containing the key.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByokKeyAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationId;
        private String keyIdentifier;
        private String keyVaultId;
        private String tenantId;
        public Builder() {}
        public Builder(ByokKeyAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder keyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public ByokKeyAzure build() {
            final var _resultValue = new ByokKeyAzure();
            _resultValue.applicationId = applicationId;
            _resultValue.keyIdentifier = keyIdentifier;
            _resultValue.keyVaultId = keyVaultId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
