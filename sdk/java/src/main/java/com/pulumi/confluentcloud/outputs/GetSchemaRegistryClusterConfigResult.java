// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClusterConfigCredentials;
import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClusterConfigSchemaRegistryCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSchemaRegistryClusterConfigResult {
    /**
     * @return (Required String) The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
     * 
     */
    private String compatibilityLevel;
    private @Nullable GetSchemaRegistryClusterConfigCredentials credentials;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String restEndpoint;
    private @Nullable GetSchemaRegistryClusterConfigSchemaRegistryCluster schemaRegistryCluster;

    private GetSchemaRegistryClusterConfigResult() {}
    /**
     * @return (Required String) The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
     * 
     */
    public String compatibilityLevel() {
        return this.compatibilityLevel;
    }
    public Optional<GetSchemaRegistryClusterConfigCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }
    public Optional<GetSchemaRegistryClusterConfigSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryClusterConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String compatibilityLevel;
        private @Nullable GetSchemaRegistryClusterConfigCredentials credentials;
        private String id;
        private @Nullable String restEndpoint;
        private @Nullable GetSchemaRegistryClusterConfigSchemaRegistryCluster schemaRegistryCluster;
        public Builder() {}
        public Builder(GetSchemaRegistryClusterConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.schemaRegistryCluster = defaults.schemaRegistryCluster;
        }

        @CustomType.Setter
        public Builder compatibilityLevel(String compatibilityLevel) {
            if (compatibilityLevel == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClusterConfigResult", "compatibilityLevel");
            }
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(@Nullable GetSchemaRegistryClusterConfigCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClusterConfigResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {

            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistryCluster(@Nullable GetSchemaRegistryClusterConfigSchemaRegistryCluster schemaRegistryCluster) {

            this.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }
        public GetSchemaRegistryClusterConfigResult build() {
            final var _resultValue = new GetSchemaRegistryClusterConfigResult();
            _resultValue.compatibilityLevel = compatibilityLevel;
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.schemaRegistryCluster = schemaRegistryCluster;
            return _resultValue;
        }
    }
}
