// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRoleBindingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleBindingPlainArgs Empty = new GetRoleBindingPlainArgs();

    /**
     * The ID of the Role Binding (for example, `rb-abc123`).
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Role Binding (for example, `rb-abc123`).
     * 
     */
    public String id() {
        return this.id;
    }

    private GetRoleBindingPlainArgs() {}

    private GetRoleBindingPlainArgs(GetRoleBindingPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleBindingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleBindingPlainArgs $;

        public Builder() {
            $ = new GetRoleBindingPlainArgs();
        }

        public Builder(GetRoleBindingPlainArgs defaults) {
            $ = new GetRoleBindingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Role Binding (for example, `rb-abc123`).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetRoleBindingPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRoleBindingPlainArgs", "id");
            }
            return $;
        }
    }

}