// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CatalogIntegrationAwsGlueArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogIntegrationAwsGlueArgs Empty = new CatalogIntegrationAwsGlueArgs();

    /**
     * The provider integration id.
     * 
     */
    @Import(name="providerIntegrationId", required=true)
    private Output<String> providerIntegrationId;

    /**
     * @return The provider integration id.
     * 
     */
    public Output<String> providerIntegrationId() {
        return this.providerIntegrationId;
    }

    private CatalogIntegrationAwsGlueArgs() {}

    private CatalogIntegrationAwsGlueArgs(CatalogIntegrationAwsGlueArgs $) {
        this.providerIntegrationId = $.providerIntegrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogIntegrationAwsGlueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogIntegrationAwsGlueArgs $;

        public Builder() {
            $ = new CatalogIntegrationAwsGlueArgs();
        }

        public Builder(CatalogIntegrationAwsGlueArgs defaults) {
            $ = new CatalogIntegrationAwsGlueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerIntegrationId The provider integration id.
         * 
         * @return builder
         * 
         */
        public Builder providerIntegrationId(Output<String> providerIntegrationId) {
            $.providerIntegrationId = providerIntegrationId;
            return this;
        }

        /**
         * @param providerIntegrationId The provider integration id.
         * 
         * @return builder
         * 
         */
        public Builder providerIntegrationId(String providerIntegrationId) {
            return providerIntegrationId(Output.of(providerIntegrationId));
        }

        public CatalogIntegrationAwsGlueArgs build() {
            if ($.providerIntegrationId == null) {
                throw new MissingRequiredPropertyException("CatalogIntegrationAwsGlueArgs", "providerIntegrationId");
            }
            return $;
        }
    }

}
