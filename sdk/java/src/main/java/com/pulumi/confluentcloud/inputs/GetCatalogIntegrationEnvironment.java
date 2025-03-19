// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCatalogIntegrationEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogIntegrationEnvironment Empty = new GetCatalogIntegrationEnvironment();

    /**
     * The ID of the Environment, for example, `env-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment, for example, `env-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetCatalogIntegrationEnvironment() {}

    private GetCatalogIntegrationEnvironment(GetCatalogIntegrationEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogIntegrationEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogIntegrationEnvironment $;

        public Builder() {
            $ = new GetCatalogIntegrationEnvironment();
        }

        public Builder(GetCatalogIntegrationEnvironment defaults) {
            $ = new GetCatalogIntegrationEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetCatalogIntegrationEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetCatalogIntegrationEnvironment", "id");
            }
            return $;
        }
    }

}
