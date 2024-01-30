// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemaRegistryKekCredentials;
import com.pulumi.confluentcloud.outputs.GetSchemaRegistryKekSchemaRegistryCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSchemaRegistryKekResult {
    private @Nullable GetSchemaRegistryKekCredentials credentials;
    private String doc;
    private Boolean hardDelete;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyId;
    private String kmsType;
    private String name;
    private Map<String,String> properties;
    private @Nullable String restEndpoint;
    private @Nullable GetSchemaRegistryKekSchemaRegistryCluster schemaRegistryCluster;
    private Boolean shared;

    private GetSchemaRegistryKekResult() {}
    public Optional<GetSchemaRegistryKekCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String doc() {
        return this.doc;
    }
    public Boolean hardDelete() {
        return this.hardDelete;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public String kmsType() {
        return this.kmsType;
    }
    public String name() {
        return this.name;
    }
    public Map<String,String> properties() {
        return this.properties;
    }
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }
    public Optional<GetSchemaRegistryKekSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }
    public Boolean shared() {
        return this.shared;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryKekResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetSchemaRegistryKekCredentials credentials;
        private String doc;
        private Boolean hardDelete;
        private String id;
        private String kmsKeyId;
        private String kmsType;
        private String name;
        private Map<String,String> properties;
        private @Nullable String restEndpoint;
        private @Nullable GetSchemaRegistryKekSchemaRegistryCluster schemaRegistryCluster;
        private Boolean shared;
        public Builder() {}
        public Builder(GetSchemaRegistryKekResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.doc = defaults.doc;
    	      this.hardDelete = defaults.hardDelete;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.kmsType = defaults.kmsType;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.schemaRegistryCluster = defaults.schemaRegistryCluster;
    	      this.shared = defaults.shared;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable GetSchemaRegistryKekCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder doc(String doc) {
            if (doc == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "doc");
            }
            this.doc = doc;
            return this;
        }
        @CustomType.Setter
        public Builder hardDelete(Boolean hardDelete) {
            if (hardDelete == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "hardDelete");
            }
            this.hardDelete = hardDelete;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            if (kmsKeyId == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "kmsKeyId");
            }
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder kmsType(String kmsType) {
            if (kmsType == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "kmsType");
            }
            this.kmsType = kmsType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder properties(Map<String,String> properties) {
            if (properties == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "properties");
            }
            this.properties = properties;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {

            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistryCluster(@Nullable GetSchemaRegistryKekSchemaRegistryCluster schemaRegistryCluster) {

            this.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }
        @CustomType.Setter
        public Builder shared(Boolean shared) {
            if (shared == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekResult", "shared");
            }
            this.shared = shared;
            return this;
        }
        public GetSchemaRegistryKekResult build() {
            final var _resultValue = new GetSchemaRegistryKekResult();
            _resultValue.credentials = credentials;
            _resultValue.doc = doc;
            _resultValue.hardDelete = hardDelete;
            _resultValue.id = id;
            _resultValue.kmsKeyId = kmsKeyId;
            _resultValue.kmsType = kmsType;
            _resultValue.name = name;
            _resultValue.properties = properties;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.schemaRegistryCluster = schemaRegistryCluster;
            _resultValue.shared = shared;
            return _resultValue;
        }
    }
}
