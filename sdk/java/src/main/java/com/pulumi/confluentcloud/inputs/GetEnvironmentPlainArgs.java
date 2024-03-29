// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetEnvironmentStreamGovernance;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentPlainArgs Empty = new GetEnvironmentPlainArgs();

    /**
     * A human-readable name for the Environment.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Environment.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the Environment, for example, `env-abc123`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Environment, for example, `env-abc123`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="streamGovernance")
    private @Nullable GetEnvironmentStreamGovernance streamGovernance;

    public Optional<GetEnvironmentStreamGovernance> streamGovernance() {
        return Optional.ofNullable(this.streamGovernance);
    }

    private GetEnvironmentPlainArgs() {}

    private GetEnvironmentPlainArgs(GetEnvironmentPlainArgs $) {
        this.displayName = $.displayName;
        this.id = $.id;
        this.streamGovernance = $.streamGovernance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentPlainArgs();
        }

        public Builder(GetEnvironmentPlainArgs defaults) {
            $ = new GetEnvironmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Environment.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param id The ID of the Environment, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder streamGovernance(@Nullable GetEnvironmentStreamGovernance streamGovernance) {
            $.streamGovernance = streamGovernance;
            return this;
        }

        public GetEnvironmentPlainArgs build() {
            return $;
        }
    }

}
