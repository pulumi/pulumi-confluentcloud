// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectArtifactEnvironment {
    /**
     * @return The ID of the Environment that the Connect Artifact belongs to.
     * 
     */
    private String id;

    private ConnectArtifactEnvironment() {}
    /**
     * @return The ID of the Environment that the Connect Artifact belongs to.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectArtifactEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(ConnectArtifactEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ConnectArtifactEnvironment", "id");
            }
            this.id = id;
            return this;
        }
        public ConnectArtifactEnvironment build() {
            final var _resultValue = new ConnectArtifactEnvironment();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
