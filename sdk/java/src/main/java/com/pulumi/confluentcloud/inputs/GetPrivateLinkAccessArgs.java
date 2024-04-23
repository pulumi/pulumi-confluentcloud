// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPrivateLinkAccessEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateLinkAccessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAccessArgs Empty = new GetPrivateLinkAccessArgs();

    /**
     * A human-readable name for the Private Link Access.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-readable name for the Private Link Access.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Required Configuration Block) supports the following:
     * 
     */
    @Import(name="environment", required=true)
    private Output<GetPrivateLinkAccessEnvironmentArgs> environment;

    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public Output<GetPrivateLinkAccessEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The ID of the Private Link Access, for example, `pla-abc123`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Private Link Access, for example, `pla-abc123`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetPrivateLinkAccessArgs() {}

    private GetPrivateLinkAccessArgs(GetPrivateLinkAccessArgs $) {
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAccessArgs $;

        public Builder() {
            $ = new GetPrivateLinkAccessArgs();
        }

        public Builder(GetPrivateLinkAccessArgs defaults) {
            $ = new GetPrivateLinkAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Private Link Access.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Private Link Access.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<GetPrivateLinkAccessEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder environment(GetPrivateLinkAccessEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param id The ID of the Private Link Access, for example, `pla-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Private Link Access, for example, `pla-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetPrivateLinkAccessArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetPrivateLinkAccessArgs", "environment");
            }
            return $;
        }
    }

}
