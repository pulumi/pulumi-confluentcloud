// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCatalogIntegrationCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCatalogIntegrationCredentialsArgs Empty = new GetCatalogIntegrationCredentialsArgs();

    /**
     * The Tableflow API Key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The Tableflow API Key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Cluster API Secret for your Confluent Cloud cluster.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private GetCatalogIntegrationCredentialsArgs() {}

    private GetCatalogIntegrationCredentialsArgs(GetCatalogIntegrationCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogIntegrationCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogIntegrationCredentialsArgs $;

        public Builder() {
            $ = new GetCatalogIntegrationCredentialsArgs();
        }

        public Builder(GetCatalogIntegrationCredentialsArgs defaults) {
            $ = new GetCatalogIntegrationCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Tableflow API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The Tableflow API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param secret The Cluster API Secret for your Confluent Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Cluster API Secret for your Confluent Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public GetCatalogIntegrationCredentialsArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetCatalogIntegrationCredentialsArgs", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetCatalogIntegrationCredentialsArgs", "secret");
            }
            return $;
        }
    }

}
