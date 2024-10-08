// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetProviderIntegrationEnvironment;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProviderIntegrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderIntegrationPlainArgs Empty = new GetProviderIntegrationPlainArgs();

    /**
     * A human-readable name for the Provider Integration.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Provider Integration.
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
    private GetProviderIntegrationEnvironment environment;

    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public GetProviderIntegrationEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Provider Integration, for example, `cspi-4xg0q`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Provider Integration, for example, `cspi-4xg0q`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetProviderIntegrationPlainArgs() {}

    private GetProviderIntegrationPlainArgs(GetProviderIntegrationPlainArgs $) {
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderIntegrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderIntegrationPlainArgs $;

        public Builder() {
            $ = new GetProviderIntegrationPlainArgs();
        }

        public Builder(GetProviderIntegrationPlainArgs defaults) {
            $ = new GetProviderIntegrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Provider Integration.
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
        public Builder environment(GetProviderIntegrationEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Provider Integration, for example, `cspi-4xg0q`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetProviderIntegrationPlainArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetProviderIntegrationPlainArgs", "environment");
            }
            return $;
        }
    }

}
