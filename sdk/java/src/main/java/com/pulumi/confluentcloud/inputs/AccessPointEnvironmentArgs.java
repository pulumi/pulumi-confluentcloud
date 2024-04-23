// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessPointEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointEnvironmentArgs Empty = new AccessPointEnvironmentArgs();

    /**
     * The ID of the Environment that the Access Point belongs to, for example, `env-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Access Point belongs to, for example, `env-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private AccessPointEnvironmentArgs() {}

    private AccessPointEnvironmentArgs(AccessPointEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointEnvironmentArgs $;

        public Builder() {
            $ = new AccessPointEnvironmentArgs();
        }

        public Builder(AccessPointEnvironmentArgs defaults) {
            $ = new AccessPointEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Access Point belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Access Point belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AccessPointEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessPointEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
