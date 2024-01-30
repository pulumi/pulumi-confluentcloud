// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryDekCredentials extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryDekCredentials Empty = new GetSchemaRegistryDekCredentials();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="secret", required=true)
    private String secret;

    public String secret() {
        return this.secret;
    }

    private GetSchemaRegistryDekCredentials() {}

    private GetSchemaRegistryDekCredentials(GetSchemaRegistryDekCredentials $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryDekCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryDekCredentials $;

        public Builder() {
            $ = new GetSchemaRegistryDekCredentials();
        }

        public Builder(GetSchemaRegistryDekCredentials defaults) {
            $ = new GetSchemaRegistryDekCredentials(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public GetSchemaRegistryDekCredentials build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryDekCredentials", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryDekCredentials", "secret");
            }
            return $;
        }
    }

}
