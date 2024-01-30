// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryKekCredentials extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryKekCredentials Empty = new GetSchemaRegistryKekCredentials();

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

    private GetSchemaRegistryKekCredentials() {}

    private GetSchemaRegistryKekCredentials(GetSchemaRegistryKekCredentials $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryKekCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryKekCredentials $;

        public Builder() {
            $ = new GetSchemaRegistryKekCredentials();
        }

        public Builder(GetSchemaRegistryKekCredentials defaults) {
            $ = new GetSchemaRegistryKekCredentials(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public GetSchemaRegistryKekCredentials build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryKekCredentials", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryKekCredentials", "secret");
            }
            return $;
        }
    }

}
