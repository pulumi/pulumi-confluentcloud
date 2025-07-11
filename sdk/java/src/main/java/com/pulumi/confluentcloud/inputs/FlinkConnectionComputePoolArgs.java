// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FlinkConnectionComputePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkConnectionComputePoolArgs Empty = new FlinkConnectionComputePoolArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private FlinkConnectionComputePoolArgs() {}

    private FlinkConnectionComputePoolArgs(FlinkConnectionComputePoolArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkConnectionComputePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkConnectionComputePoolArgs $;

        public Builder() {
            $ = new FlinkConnectionComputePoolArgs();
        }

        public Builder(FlinkConnectionComputePoolArgs defaults) {
            $ = new FlinkConnectionComputePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public FlinkConnectionComputePoolArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("FlinkConnectionComputePoolArgs", "id");
            }
            return $;
        }
    }

}
