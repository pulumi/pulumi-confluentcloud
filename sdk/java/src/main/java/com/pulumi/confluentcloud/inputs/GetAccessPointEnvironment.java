// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointEnvironment Empty = new GetAccessPointEnvironment();

    /**
     * The ID of the Environment that the Access Point belongs to, for example, `env-123abc`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Access Point belongs to, for example, `env-123abc`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAccessPointEnvironment() {}

    private GetAccessPointEnvironment(GetAccessPointEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointEnvironment $;

        public Builder() {
            $ = new GetAccessPointEnvironment();
        }

        public Builder(GetAccessPointEnvironment defaults) {
            $ = new GetAccessPointEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Access Point belongs to, for example, `env-123abc`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAccessPointEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetAccessPointEnvironment", "id");
            }
            return $;
        }
    }

}
