// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class TableflowTopicManagedStorage {
    private TableflowTopicManagedStorage() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableflowTopicManagedStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(TableflowTopicManagedStorage defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public TableflowTopicManagedStorage build() {
            final var _resultValue = new TableflowTopicManagedStorage();
            return _resultValue;
        }
    }
}
