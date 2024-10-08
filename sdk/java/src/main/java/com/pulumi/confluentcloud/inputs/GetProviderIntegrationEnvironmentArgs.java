// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProviderIntegrationEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetProviderIntegrationEnvironmentArgs Empty = new GetProviderIntegrationEnvironmentArgs();

    /**
     * The ID of the Environment that the Provider Integration belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Provider Integration belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetProviderIntegrationEnvironmentArgs() {}

    private GetProviderIntegrationEnvironmentArgs(GetProviderIntegrationEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderIntegrationEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderIntegrationEnvironmentArgs $;

        public Builder() {
            $ = new GetProviderIntegrationEnvironmentArgs();
        }

        public Builder(GetProviderIntegrationEnvironmentArgs defaults) {
            $ = new GetProviderIntegrationEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Provider Integration belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Provider Integration belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetProviderIntegrationEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetProviderIntegrationEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
