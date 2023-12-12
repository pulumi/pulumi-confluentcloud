// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.ApiKeyManagedResourceEnvironment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiKeyManagedResource {
    /**
     * @return The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     * 
     */
    private String apiVersion;
    private ApiKeyManagedResourceEnvironment environment;
    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
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
    public ApiKeyManagedResourceEnvironment environment() {
        return this.environment;
    }
    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
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
        private ApiKeyManagedResourceEnvironment environment;
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
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder environment(ApiKeyManagedResourceEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
