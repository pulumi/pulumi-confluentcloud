// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.PluginEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final PluginArgs Empty = new PluginArgs();

    /**
     * Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
     * 
     */
    @Import(name="cloud", required=true)
    private Output<String> cloud;

    /**
     * @return Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }

    /**
     * The description of the Plugin.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Plugin.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Plugin.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the Plugin.
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
    private Output<PluginEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<PluginEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * (Optional String) Runtime language of the plugin.
     * 
     */
    @Import(name="runtimeLanguage")
    private @Nullable Output<String> runtimeLanguage;

    /**
     * @return (Optional String) Runtime language of the plugin.
     * 
     */
    public Optional<Output<String>> runtimeLanguage() {
        return Optional.ofNullable(this.runtimeLanguage);
    }

    private PluginArgs() {}

    private PluginArgs(PluginArgs $) {
        this.cloud = $.cloud;
        this.description = $.description;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.runtimeLanguage = $.runtimeLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluginArgs $;

        public Builder() {
            $ = new PluginArgs();
        }

        public Builder(PluginArgs defaults) {
            $ = new PluginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloud Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param description The description of the Plugin.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Plugin.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the Plugin.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Plugin.
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
        public Builder environment(Output<PluginEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(PluginEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param runtimeLanguage (Optional String) Runtime language of the plugin.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(@Nullable Output<String> runtimeLanguage) {
            $.runtimeLanguage = runtimeLanguage;
            return this;
        }

        /**
         * @param runtimeLanguage (Optional String) Runtime language of the plugin.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(String runtimeLanguage) {
            return runtimeLanguage(Output.of(runtimeLanguage));
        }

        public PluginArgs build() {
            if ($.cloud == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "cloud");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "displayName");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "environment");
            }
            return $;
        }
    }

}
