// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ApiKeyManagedResourceEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyManagedResourceEnvironmentArgs Empty = new ApiKeyManagedResourceEnvironmentArgs();

    /**
     * The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private ApiKeyManagedResourceEnvironmentArgs() {}

    private ApiKeyManagedResourceEnvironmentArgs(ApiKeyManagedResourceEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyManagedResourceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyManagedResourceEnvironmentArgs $;

        public Builder() {
            $ = new ApiKeyManagedResourceEnvironmentArgs();
        }

        public Builder(ApiKeyManagedResourceEnvironmentArgs defaults) {
            $ = new ApiKeyManagedResourceEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ApiKeyManagedResourceEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ApiKeyManagedResourceEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
