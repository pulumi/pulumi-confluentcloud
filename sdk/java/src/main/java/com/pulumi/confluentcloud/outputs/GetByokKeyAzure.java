// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetByokKeyAzure {
    /**
     * @return (Optional String) The Application ID created for this key-environment combination.
     * 
     */
    private String applicationId;
    /**
     * @return (Required String) The unique Key Object Identifier URL of an Azure Key Vault key.
     * 
     */
    private String keyIdentifier;
    /**
     * @return (Required String) Key Vault ID containing the key.
     * 
     */
    private String keyVaultId;
    /**
     * @return (Required String) Tenant ID (uuid) hosting the Key Vault containing the key.
     * 
     */
    private String tenantId;

    private GetByokKeyAzure() {}
    /**
     * @return (Optional String) The Application ID created for this key-environment combination.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return (Required String) The unique Key Object Identifier URL of an Azure Key Vault key.
     * 
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }
    /**
     * @return (Required String) Key Vault ID containing the key.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return (Required String) Tenant ID (uuid) hosting the Key Vault containing the key.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetByokKeyAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private String keyIdentifier;
        private String keyVaultId;
        private String tenantId;
        public Builder() {}
        public Builder(GetByokKeyAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            if (applicationId == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAzure", "applicationId");
            }
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder keyIdentifier(String keyIdentifier) {
            if (keyIdentifier == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAzure", "keyIdentifier");
            }
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            if (keyVaultId == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAzure", "keyVaultId");
            }
            this.keyVaultId = keyVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAzure", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        public GetByokKeyAzure build() {
            final var _resultValue = new GetByokKeyAzure();
            _resultValue.applicationId = applicationId;
            _resultValue.keyIdentifier = keyIdentifier;
            _resultValue.keyVaultId = keyVaultId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
