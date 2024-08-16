// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryClustersEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryClustersEnvironment Empty = new GetSchemaRegistryClustersEnvironment();

    /**
     * The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     * - If no environment id is specified, clusters from all environments will be displayed.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     * - If no environment id is specified, clusters from all environments will be displayed.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetSchemaRegistryClustersEnvironment() {}

    private GetSchemaRegistryClustersEnvironment(GetSchemaRegistryClustersEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryClustersEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryClustersEnvironment $;

        public Builder() {
            $ = new GetSchemaRegistryClustersEnvironment();
        }

        public Builder(GetSchemaRegistryClustersEnvironment defaults) {
            $ = new GetSchemaRegistryClustersEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
         * - If no environment id is specified, clusters from all environments will be displayed.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetSchemaRegistryClustersEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryClustersEnvironment", "id");
            }
            return $;
        }
    }

}