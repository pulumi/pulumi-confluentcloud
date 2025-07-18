// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.FlinkArtifactEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkArtifactArgs Empty = new FlinkArtifactArgs();

    /**
     * The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
     * 
     */
    @Import(name="artifactFile")
    private @Nullable Output<String> artifactFile;

    /**
     * @return The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
     * 
     */
    public Optional<Output<String>> artifactFile() {
        return Optional.ofNullable(this.artifactFile);
    }

    /**
     * Java class or alias for the Flink Artifact as provided by developer.
     * 
     * @deprecated
     * The &#34;class&#34; attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
     * 
     */
    @Deprecated /* The ""class"" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released. */
    @Import(name="class")
    private @Nullable Output<String> class_;

    /**
     * @return Java class or alias for the Flink Artifact as provided by developer.
     * 
     * @deprecated
     * The &#34;class&#34; attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
     * 
     */
    @Deprecated /* The ""class"" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released. */
    public Optional<Output<String>> class_() {
        return Optional.ofNullable(this.class_);
    }

    /**
     * The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
     * 
     */
    @Import(name="cloud", required=true)
    private Output<String> cloud;

    /**
     * @return The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }

    /**
     * Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
     * 
     */
    @Import(name="contentFormat")
    private @Nullable Output<String> contentFormat;

    /**
     * @return Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
     * 
     */
    public Optional<Output<String>> contentFormat() {
        return Optional.ofNullable(this.contentFormat);
    }

    /**
     * (Optional String) Description of the Flink Artifact.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Optional String) Description of the Flink Artifact.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique name of the Flink Artifact per cloud, region, environment scope.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The unique name of the Flink Artifact per cloud, region, environment scope.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * (Optional String) Documentation link of the Flink Artifact.
     * 
     */
    @Import(name="documentationLink")
    private @Nullable Output<String> documentationLink;

    /**
     * @return (Optional String) Documentation link of the Flink Artifact.
     * 
     */
    public Optional<Output<String>> documentationLink() {
        return Optional.ofNullable(this.documentationLink);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment", required=true)
    private Output<FlinkArtifactEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<FlinkArtifactEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The cloud service provider region that hosts the Flink Artifact.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The cloud service provider region that hosts the Flink Artifact.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
     * 
     */
    @Import(name="runtimeLanguage")
    private @Nullable Output<String> runtimeLanguage;

    /**
     * @return (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
     * 
     */
    public Optional<Output<String>> runtimeLanguage() {
        return Optional.ofNullable(this.runtimeLanguage);
    }

    private FlinkArtifactArgs() {}

    private FlinkArtifactArgs(FlinkArtifactArgs $) {
        this.artifactFile = $.artifactFile;
        this.class_ = $.class_;
        this.cloud = $.cloud;
        this.contentFormat = $.contentFormat;
        this.description = $.description;
        this.displayName = $.displayName;
        this.documentationLink = $.documentationLink;
        this.environment = $.environment;
        this.region = $.region;
        this.runtimeLanguage = $.runtimeLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkArtifactArgs $;

        public Builder() {
            $ = new FlinkArtifactArgs();
        }

        public Builder(FlinkArtifactArgs defaults) {
            $ = new FlinkArtifactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactFile The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
         * 
         * @return builder
         * 
         */
        public Builder artifactFile(@Nullable Output<String> artifactFile) {
            $.artifactFile = artifactFile;
            return this;
        }

        /**
         * @param artifactFile The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
         * 
         * @return builder
         * 
         */
        public Builder artifactFile(String artifactFile) {
            return artifactFile(Output.of(artifactFile));
        }

        /**
         * @param class_ Java class or alias for the Flink Artifact as provided by developer.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#34;class&#34; attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
         * 
         */
        @Deprecated /* The ""class"" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released. */
        public Builder class_(@Nullable Output<String> class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param class_ Java class or alias for the Flink Artifact as provided by developer.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#34;class&#34; attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
         * 
         */
        @Deprecated /* The ""class"" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released. */
        public Builder class_(String class_) {
            return class_(Output.of(class_));
        }

        /**
         * @param cloud The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param contentFormat Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
         * 
         * @return builder
         * 
         */
        public Builder contentFormat(@Nullable Output<String> contentFormat) {
            $.contentFormat = contentFormat;
            return this;
        }

        /**
         * @param contentFormat Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
         * 
         * @return builder
         * 
         */
        public Builder contentFormat(String contentFormat) {
            return contentFormat(Output.of(contentFormat));
        }

        /**
         * @param description (Optional String) Description of the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Optional String) Description of the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The unique name of the Flink Artifact per cloud, region, environment scope.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The unique name of the Flink Artifact per cloud, region, environment scope.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param documentationLink (Optional String) Documentation link of the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder documentationLink(@Nullable Output<String> documentationLink) {
            $.documentationLink = documentationLink;
            return this;
        }

        /**
         * @param documentationLink (Optional String) Documentation link of the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder documentationLink(String documentationLink) {
            return documentationLink(Output.of(documentationLink));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<FlinkArtifactEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(FlinkArtifactEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param region The cloud service provider region that hosts the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region that hosts the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param runtimeLanguage (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(@Nullable Output<String> runtimeLanguage) {
            $.runtimeLanguage = runtimeLanguage;
            return this;
        }

        /**
         * @param runtimeLanguage (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(String runtimeLanguage) {
            return runtimeLanguage(Output.of(runtimeLanguage));
        }

        public FlinkArtifactArgs build() {
            if ($.cloud == null) {
                throw new MissingRequiredPropertyException("FlinkArtifactArgs", "cloud");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("FlinkArtifactArgs", "displayName");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("FlinkArtifactArgs", "environment");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("FlinkArtifactArgs", "region");
            }
            return $;
        }
    }

}
