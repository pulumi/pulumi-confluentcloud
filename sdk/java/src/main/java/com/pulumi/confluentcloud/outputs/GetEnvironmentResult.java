// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetEnvironmentStreamGovernance;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return (Required String) A human-readable name for the Environment.
     * 
     */
    private String displayName;
    /**
     * @return (Required String) The ID of the Environment, for example, `env-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     * 
     */
    private String resourceName;
    private GetEnvironmentStreamGovernance streamGovernance;

    private GetEnvironmentResult() {}
    /**
     * @return (Required String) A human-readable name for the Environment.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required String) The ID of the Environment, for example, `env-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    public GetEnvironmentStreamGovernance streamGovernance() {
        return this.streamGovernance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        private String resourceName;
        private GetEnvironmentStreamGovernance streamGovernance;
        public Builder() {}
        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.resourceName = defaults.resourceName;
    	      this.streamGovernance = defaults.streamGovernance;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            if (resourceName == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "resourceName");
            }
            this.resourceName = resourceName;
            return this;
        }
        @CustomType.Setter
        public Builder streamGovernance(GetEnvironmentStreamGovernance streamGovernance) {
            if (streamGovernance == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "streamGovernance");
            }
            this.streamGovernance = streamGovernance;
            return this;
        }
        public GetEnvironmentResult build() {
            final var _resultValue = new GetEnvironmentResult();
            _resultValue.displayName = displayName;
            _resultValue.id = id;
            _resultValue.resourceName = resourceName;
            _resultValue.streamGovernance = streamGovernance;
            return _resultValue;
        }
    }
}
