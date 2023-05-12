// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BusinessMetadataCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessMetadataCredentialsArgs Empty = new BusinessMetadataCredentialsArgs();

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

    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    private BusinessMetadataCredentialsArgs() {}

    private BusinessMetadataCredentialsArgs(BusinessMetadataCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessMetadataCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessMetadataCredentialsArgs $;

        public Builder() {
            $ = new BusinessMetadataCredentialsArgs();
        }

        public Builder(BusinessMetadataCredentialsArgs defaults) {
            $ = new BusinessMetadataCredentialsArgs(Objects.requireNonNull(defaults));
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

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public BusinessMetadataCredentialsArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
