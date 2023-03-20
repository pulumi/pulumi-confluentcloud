// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ByokKeyAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ByokKeyAwsArgs Empty = new ByokKeyAwsArgs();

    /**
     * The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    @Import(name="keyArn", required=true)
    private Output<String> keyArn;

    /**
     * @return The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    public Output<String> keyArn() {
        return this.keyArn;
    }

    /**
     * (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    private ByokKeyAwsArgs() {}

    private ByokKeyAwsArgs(ByokKeyAwsArgs $) {
        this.keyArn = $.keyArn;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ByokKeyAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByokKeyAwsArgs $;

        public Builder() {
            $ = new ByokKeyAwsArgs();
        }

        public Builder(ByokKeyAwsArgs defaults) {
            $ = new ByokKeyAwsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyArn The Amazon Resource Name (ARN) of an AWS KMS key.
         * 
         * @return builder
         * 
         */
        public Builder keyArn(Output<String> keyArn) {
            $.keyArn = keyArn;
            return this;
        }

        /**
         * @param keyArn The Amazon Resource Name (ARN) of an AWS KMS key.
         * 
         * @return builder
         * 
         */
        public Builder keyArn(String keyArn) {
            return keyArn(Output.of(keyArn));
        }

        /**
         * @param roles (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        public ByokKeyAwsArgs build() {
            $.keyArn = Objects.requireNonNull($.keyArn, "expected parameter 'keyArn' to be non-null");
            return $;
        }
    }

}
