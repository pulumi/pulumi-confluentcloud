// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTagCredentials extends com.pulumi.resources.InvokeArgs {

    public static final GetTagCredentials Empty = new GetTagCredentials();

    /**
     * The Schema Registry API Key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The Schema Registry API Key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The Schema Registry API Secret.
     * 
     */
    @Import(name="secret", required=true)
    private String secret;

    /**
     * @return The Schema Registry API Secret.
     * 
     */
    public String secret() {
        return this.secret;
    }

    private GetTagCredentials() {}

    private GetTagCredentials(GetTagCredentials $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagCredentials $;

        public Builder() {
            $ = new GetTagCredentials();
        }

        public Builder(GetTagCredentials defaults) {
            $ = new GetTagCredentials(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Schema Registry API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param secret The Schema Registry API Secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public GetTagCredentials build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetTagCredentials", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetTagCredentials", "secret");
            }
            return $;
        }
    }

}