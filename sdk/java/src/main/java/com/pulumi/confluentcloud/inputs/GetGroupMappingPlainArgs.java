// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupMappingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupMappingPlainArgs Empty = new GetGroupMappingPlainArgs();

    /**
     * The name of the Group Mapping.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The name of the Group Mapping.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the Group Mapping.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Group Mapping.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetGroupMappingPlainArgs() {}

    private GetGroupMappingPlainArgs(GetGroupMappingPlainArgs $) {
        this.displayName = $.displayName;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupMappingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupMappingPlainArgs $;

        public Builder() {
            $ = new GetGroupMappingPlainArgs();
        }

        public Builder(GetGroupMappingPlainArgs defaults) {
            $ = new GetGroupMappingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The name of the Group Mapping.
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
         * @param id The ID of the Group Mapping.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetGroupMappingPlainArgs build() {
            return $;
        }
    }

}
