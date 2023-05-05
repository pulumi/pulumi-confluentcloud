// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTagCredentialsArgs Empty = new GetTagCredentialsArgs();

    /**
     * The Schema Registry API Key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The Schema Registry API Key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The Schema Registry API Secret.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Schema Registry API Secret.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private GetTagCredentialsArgs() {}

    private GetTagCredentialsArgs(GetTagCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagCredentialsArgs $;

        public Builder() {
            $ = new GetTagCredentialsArgs();
        }

        public Builder(GetTagCredentialsArgs defaults) {
            $ = new GetTagCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Schema Registry API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The Schema Registry API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param secret The Schema Registry API Secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Schema Registry API Secret.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public GetTagCredentialsArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
