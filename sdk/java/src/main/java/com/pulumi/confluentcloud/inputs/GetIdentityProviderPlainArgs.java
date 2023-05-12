// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIdentityProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdentityProviderPlainArgs Empty = new GetIdentityProviderPlainArgs();

    /**
     * A human-readable name for the Identity Provider.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Identity Provider.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the Identity Provider, for example, `op-abc123`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Identity Provider, for example, `op-abc123`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetIdentityProviderPlainArgs() {}

    private GetIdentityProviderPlainArgs(GetIdentityProviderPlainArgs $) {
        this.displayName = $.displayName;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityProviderPlainArgs $;

        public Builder() {
            $ = new GetIdentityProviderPlainArgs();
        }

        public Builder(GetIdentityProviderPlainArgs defaults) {
            $ = new GetIdentityProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Identity Provider.
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
         * @param id The ID of the Identity Provider, for example, `op-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetIdentityProviderPlainArgs build() {
            return $;
        }
    }

}
