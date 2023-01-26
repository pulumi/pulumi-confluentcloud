// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPrivateLinkAccessEnvironment;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateLinkAccessPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAccessPlainArgs Empty = new GetPrivateLinkAccessPlainArgs();

    /**
     * A human-readable name for the Private Link Access.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Private Link Access.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Required Configuration Block) supports the following:
     * 
     */
    @Import(name="environment", required=true)
    private GetPrivateLinkAccessEnvironment environment;

    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetPrivateLinkAccessEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetPrivateLinkAccessPlainArgs() {}

    private GetPrivateLinkAccessPlainArgs(GetPrivateLinkAccessPlainArgs $) {
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAccessPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAccessPlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkAccessPlainArgs();
        }

        public Builder(GetPrivateLinkAccessPlainArgs defaults) {
            $ = new GetPrivateLinkAccessPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Private Link Access.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param environment (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder environment(GetPrivateLinkAccessEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetPrivateLinkAccessPlainArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            return $;
        }
    }

}
