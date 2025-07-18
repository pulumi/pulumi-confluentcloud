// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetConnectArtifactEnvironment;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectArtifactResult {
    private String cloud;
    /**
     * @return (String) Archive format of the Connect Artifact. Supported formats are `JAR` and `ZIP`.
     * 
     */
    private String contentFormat;
    /**
     * @return (String) Description of the Connect Artifact.
     * 
     */
    private String description;
    /**
     * @return (String) The unique name of the Connect Artifact per cloud, environment scope.
     * 
     */
    private String displayName;
    private GetConnectArtifactEnvironment environment;
    private String id;

    private GetConnectArtifactResult() {}
    public String cloud() {
        return this.cloud;
    }
    /**
     * @return (String) Archive format of the Connect Artifact. Supported formats are `JAR` and `ZIP`.
     * 
     */
    public String contentFormat() {
        return this.contentFormat;
    }
    /**
     * @return (String) Description of the Connect Artifact.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (String) The unique name of the Connect Artifact per cloud, environment scope.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public GetConnectArtifactEnvironment environment() {
        return this.environment;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectArtifactResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloud;
        private String contentFormat;
        private String description;
        private String displayName;
        private GetConnectArtifactEnvironment environment;
        private String id;
        public Builder() {}
        public Builder(GetConnectArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloud = defaults.cloud;
    	      this.contentFormat = defaults.contentFormat;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder cloud(String cloud) {
            if (cloud == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "cloud");
            }
            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder contentFormat(String contentFormat) {
            if (contentFormat == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "contentFormat");
            }
            this.contentFormat = contentFormat;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetConnectArtifactEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConnectArtifactResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetConnectArtifactResult build() {
            final var _resultValue = new GetConnectArtifactResult();
            _resultValue.cloud = cloud;
            _resultValue.contentFormat = contentFormat;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
