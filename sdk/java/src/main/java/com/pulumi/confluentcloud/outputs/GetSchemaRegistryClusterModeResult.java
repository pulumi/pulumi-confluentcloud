// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClusterModeCredentials;
import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClusterModeSchemaRegistryCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSchemaRegistryClusterModeResult {
    private @Nullable GetSchemaRegistryClusterModeCredentials credentials;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    private String mode;
    private @Nullable String restEndpoint;
    private @Nullable GetSchemaRegistryClusterModeSchemaRegistryCluster schemaRegistryCluster;

    private GetSchemaRegistryClusterModeResult() {}
    public Optional<GetSchemaRegistryClusterModeCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }
    public Optional<GetSchemaRegistryClusterModeSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryClusterModeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetSchemaRegistryClusterModeCredentials credentials;
        private String id;
        private String mode;
        private @Nullable String restEndpoint;
        private @Nullable GetSchemaRegistryClusterModeSchemaRegistryCluster schemaRegistryCluster;
        public Builder() {}
        public Builder(GetSchemaRegistryClusterModeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.schemaRegistryCluster = defaults.schemaRegistryCluster;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable GetSchemaRegistryClusterModeCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClusterModeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClusterModeResult", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {

            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistryCluster(@Nullable GetSchemaRegistryClusterModeSchemaRegistryCluster schemaRegistryCluster) {

            this.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }
        public GetSchemaRegistryClusterModeResult build() {
            final var _resultValue = new GetSchemaRegistryClusterModeResult();
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.mode = mode;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.schemaRegistryCluster = schemaRegistryCluster;
            return _resultValue;
        }
    }
}
