// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFlinkArtifactVersion {
    /**
     * @return The version of this Flink Artifact.
     * 
     */
    private String version;

    private GetFlinkArtifactVersion() {}
    /**
     * @return The version of this Flink Artifact.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlinkArtifactVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String version;
        public Builder() {}
        public Builder(GetFlinkArtifactVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetFlinkArtifactVersion", "version");
            }
            this.version = version;
            return this;
        }
        public GetFlinkArtifactVersion build() {
            final var _resultValue = new GetFlinkArtifactVersion();
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
