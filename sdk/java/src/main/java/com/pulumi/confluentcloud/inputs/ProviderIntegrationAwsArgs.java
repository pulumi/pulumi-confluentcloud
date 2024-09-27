// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderIntegrationAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderIntegrationAwsArgs Empty = new ProviderIntegrationAwsArgs();

    /**
     * Amazon Resource Name (ARN) that identifies the AWS Identity and Access Management (IAM) role that Confluent Cloud assumes when it accesses resources in your AWS account.
     * 
     * &gt; **Note:** Currently only `aws` config is supported, more cloud service provider config will be supported in the short future.
     * 
     * &gt; **Note:** `customer_role_arn` must be unique in a given environment for creating a new Provider Integration.
     * 
     */
    @Import(name="customerRoleArn", required=true)
    private Output<String> customerRoleArn;

    /**
     * @return Amazon Resource Name (ARN) that identifies the AWS Identity and Access Management (IAM) role that Confluent Cloud assumes when it accesses resources in your AWS account.
     * 
     * &gt; **Note:** Currently only `aws` config is supported, more cloud service provider config will be supported in the short future.
     * 
     * &gt; **Note:** `customer_role_arn` must be unique in a given environment for creating a new Provider Integration.
     * 
     */
    public Output<String> customerRoleArn() {
        return this.customerRoleArn;
    }

    /**
     * (Required String) Unique external ID that Confluent Cloud uses when it assumes the IAM role in your Amazon Web Services (AWS) account.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return (Required String) Unique external ID that Confluent Cloud uses when it assumes the IAM role in your Amazon Web Services (AWS) account.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * (Required String) The IAM role ARN used in Confluent Cloud internally, bundled with `customer_role_arn`.
     * 
     */
    @Import(name="iamRoleArn")
    private @Nullable Output<String> iamRoleArn;

    /**
     * @return (Required String) The IAM role ARN used in Confluent Cloud internally, bundled with `customer_role_arn`.
     * 
     */
    public Optional<Output<String>> iamRoleArn() {
        return Optional.ofNullable(this.iamRoleArn);
    }

    private ProviderIntegrationAwsArgs() {}

    private ProviderIntegrationAwsArgs(ProviderIntegrationAwsArgs $) {
        this.customerRoleArn = $.customerRoleArn;
        this.externalId = $.externalId;
        this.iamRoleArn = $.iamRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderIntegrationAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderIntegrationAwsArgs $;

        public Builder() {
            $ = new ProviderIntegrationAwsArgs();
        }

        public Builder(ProviderIntegrationAwsArgs defaults) {
            $ = new ProviderIntegrationAwsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerRoleArn Amazon Resource Name (ARN) that identifies the AWS Identity and Access Management (IAM) role that Confluent Cloud assumes when it accesses resources in your AWS account.
         * 
         * &gt; **Note:** Currently only `aws` config is supported, more cloud service provider config will be supported in the short future.
         * 
         * &gt; **Note:** `customer_role_arn` must be unique in a given environment for creating a new Provider Integration.
         * 
         * @return builder
         * 
         */
        public Builder customerRoleArn(Output<String> customerRoleArn) {
            $.customerRoleArn = customerRoleArn;
            return this;
        }

        /**
         * @param customerRoleArn Amazon Resource Name (ARN) that identifies the AWS Identity and Access Management (IAM) role that Confluent Cloud assumes when it accesses resources in your AWS account.
         * 
         * &gt; **Note:** Currently only `aws` config is supported, more cloud service provider config will be supported in the short future.
         * 
         * &gt; **Note:** `customer_role_arn` must be unique in a given environment for creating a new Provider Integration.
         * 
         * @return builder
         * 
         */
        public Builder customerRoleArn(String customerRoleArn) {
            return customerRoleArn(Output.of(customerRoleArn));
        }

        /**
         * @param externalId (Required String) Unique external ID that Confluent Cloud uses when it assumes the IAM role in your Amazon Web Services (AWS) account.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId (Required String) Unique external ID that Confluent Cloud uses when it assumes the IAM role in your Amazon Web Services (AWS) account.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param iamRoleArn (Required String) The IAM role ARN used in Confluent Cloud internally, bundled with `customer_role_arn`.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn (Required String) The IAM role ARN used in Confluent Cloud internally, bundled with `customer_role_arn`.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        public ProviderIntegrationAwsArgs build() {
            if ($.customerRoleArn == null) {
                throw new MissingRequiredPropertyException("ProviderIntegrationAwsArgs", "customerRoleArn");
            }
            return $;
        }
    }

}
