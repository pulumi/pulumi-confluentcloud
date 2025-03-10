// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFlinkArtifactEnvironment {
    /**
     * @return The ID of the Environment that the Flink Artifact belongs to, for example, `env-xyz456`.
     * 
     */
    private String id;

    private GetFlinkArtifactEnvironment() {}
    /**
     * @return The ID of the Environment that the Flink Artifact belongs to, for example, `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlinkArtifactEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetFlinkArtifactEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlinkArtifactEnvironment", "id");
            }
            this.id = id;
            return this;
        }
        public GetFlinkArtifactEnvironment build() {
            final var _resultValue = new GetFlinkArtifactEnvironment();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
