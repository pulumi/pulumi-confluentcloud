// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.ApiKeyManagedResourceEnvironment;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiKeyManagedResource {
    /**
     * @return The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     * 
     */
    private String apiVersion;
    private @Nullable ApiKeyManagedResourceEnvironment environment;
    /**
     * @return The ID of the managed resource that the API Key associated with, for example, `lkc-abc123`.
     * 
     */
    private String id;
    /**
     * @return The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     * 
     */
    private String kind;

    private ApiKeyManagedResource() {}
    /**
     * @return The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    public Optional<ApiKeyManagedResourceEnvironment> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return The ID of the managed resource that the API Key associated with, for example, `lkc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyManagedResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private @Nullable ApiKeyManagedResourceEnvironment environment;
        private String id;
        private String kind;
        public Builder() {}
        public Builder(ApiKeyManagedResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            if (apiVersion == null) {
              throw new MissingRequiredPropertyException("ApiKeyManagedResource", "apiVersion");
            }
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder environment(@Nullable ApiKeyManagedResourceEnvironment environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ApiKeyManagedResource", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("ApiKeyManagedResource", "kind");
            }
            this.kind = kind;
            return this;
        }
        public ApiKeyManagedResource build() {
            final var _resultValue = new ApiKeyManagedResource();
            _resultValue.apiVersion = apiVersion;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.kind = kind;
            return _resultValue;
        }
    }
}
