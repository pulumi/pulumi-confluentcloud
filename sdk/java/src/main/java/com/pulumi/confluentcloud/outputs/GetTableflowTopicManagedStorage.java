// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetTableflowTopicManagedStorage {
    private GetTableflowTopicManagedStorage() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableflowTopicManagedStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetTableflowTopicManagedStorage defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetTableflowTopicManagedStorage build() {
            final var _resultValue = new GetTableflowTopicManagedStorage();
            return _resultValue;
        }
    }
}
