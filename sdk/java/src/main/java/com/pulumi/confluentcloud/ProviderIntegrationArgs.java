// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.ProviderIntegrationAwsArgs;
import com.pulumi.confluentcloud.inputs.ProviderIntegrationEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderIntegrationArgs Empty = new ProviderIntegrationArgs();

    /**
     * (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     * 
     */
    @Import(name="aws")
    private @Nullable Output<ProviderIntegrationAwsArgs> aws;

    /**
     * @return (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     * 
     */
    public Optional<Output<ProviderIntegrationAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * The name of the Provider Integration.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the Provider Integration.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment", required=true)
    private Output<ProviderIntegrationEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<ProviderIntegrationEnvironmentArgs> environment() {
        return this.environment;
    }

    private ProviderIntegrationArgs() {}

    private ProviderIntegrationArgs(ProviderIntegrationArgs $) {
        this.aws = $.aws;
        this.displayName = $.displayName;
        this.environment = $.environment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderIntegrationArgs $;

        public Builder() {
            $ = new ProviderIntegrationArgs();
        }

        public Builder(ProviderIntegrationArgs defaults) {
            $ = new ProviderIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<ProviderIntegrationAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(ProviderIntegrationAwsArgs aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param displayName The name of the Provider Integration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Provider Integration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<ProviderIntegrationEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(ProviderIntegrationEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public ProviderIntegrationArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("ProviderIntegrationArgs", "displayName");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("ProviderIntegrationArgs", "environment");
            }
            return $;
        }
    }

}