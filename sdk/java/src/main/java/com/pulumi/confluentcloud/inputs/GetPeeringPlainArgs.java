// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPeeringEnvironment;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringPlainArgs Empty = new GetPeeringPlainArgs();

    /**
     * A human-readable name for the Peering.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Peering.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="environment", required=true)
    private GetPeeringEnvironment environment;

    public GetPeeringEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetPeeringPlainArgs() {}

    private GetPeeringPlainArgs(GetPeeringPlainArgs $) {
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringPlainArgs $;

        public Builder() {
            $ = new GetPeeringPlainArgs();
        }

        public Builder(GetPeeringPlainArgs defaults) {
            $ = new GetPeeringPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Peering.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder environment(GetPeeringEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetPeeringPlainArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            return $;
        }
    }

}
