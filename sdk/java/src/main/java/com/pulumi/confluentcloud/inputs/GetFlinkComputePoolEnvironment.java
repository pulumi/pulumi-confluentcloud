// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlinkComputePoolEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetFlinkComputePoolEnvironment Empty = new GetFlinkComputePoolEnvironment();

    /**
     * The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetFlinkComputePoolEnvironment() {}

    private GetFlinkComputePoolEnvironment(GetFlinkComputePoolEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlinkComputePoolEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlinkComputePoolEnvironment $;

        public Builder() {
            $ = new GetFlinkComputePoolEnvironment();
        }

        public Builder(GetFlinkComputePoolEnvironment defaults) {
            $ = new GetFlinkComputePoolEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetFlinkComputePoolEnvironment build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
