// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.FlinkArtifactEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.FlinkArtifactVersionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkArtifactState extends com.pulumi.resources.ResourceArgs {

    public static final FlinkArtifactState Empty = new FlinkArtifactState();

    /**
     * (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * The artifact file for Flink Artifact.
     * 
     */
    @Import(name="artifactFile")
    private @Nullable Output<String> artifactFile;

    /**
     * @return The artifact file for Flink Artifact.
     * 
     */
    public Optional<Output<String>> artifactFile() {
        return Optional.ofNullable(this.artifactFile);
    }

    /**
     * Java class or alias for the Flink Artifact as provided by developer.
     * 
     */
    @Import(name="class")
    private @Nullable Output<String> class_;

    /**
     * @return Java class or alias for the Flink Artifact as provided by developer.
     * 
     */
    public Optional<Output<String>> class_() {
        return Optional.ofNullable(this.class_);
    }

    /**
     * The cloud service provider that runs the Flink Artifact.
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    /**
     * @return The cloud service provider that runs the Flink Artifact.
     * 
     */
    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * (Optional String) Archive format of the Flink Artifact.
     * 
     */
    @Import(name="contentFormat")
    private @Nullable Output<String> contentFormat;

    /**
     * @return (Optional String) Archive format of the Flink Artifact.
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
     * The display name of Flink Artifact.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of Flink Artifact.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<FlinkArtifactEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<FlinkArtifactEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The cloud service provider region that hosts the Flink Artifact.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The cloud service provider region that hosts the Flink Artifact.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
     * 
     */
    @Import(name="runtimeLanguage")
    private @Nullable Output<String> runtimeLanguage;

    /**
     * @return (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
     * 
     */
    public Optional<Output<String>> runtimeLanguage() {
        return Optional.ofNullable(this.runtimeLanguage);
    }

    /**
     * List of versions for this Flink Artifact.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<List<FlinkArtifactVersionArgs>> versions;

    /**
     * @return List of versions for this Flink Artifact.
     * 
     */
    public Optional<Output<List<FlinkArtifactVersionArgs>>> versions() {
        return Optional.ofNullable(this.versions);
    }

    private FlinkArtifactState() {}

    private FlinkArtifactState(FlinkArtifactState $) {
        this.apiVersion = $.apiVersion;
        this.artifactFile = $.artifactFile;
        this.class_ = $.class_;
        this.cloud = $.cloud;
        this.contentFormat = $.contentFormat;
        this.description = $.description;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.kind = $.kind;
        this.region = $.region;
        this.runtimeLanguage = $.runtimeLanguage;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkArtifactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkArtifactState $;

        public Builder() {
            $ = new FlinkArtifactState();
        }

        public Builder(FlinkArtifactState defaults) {
            $ = new FlinkArtifactState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param artifactFile The artifact file for Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder artifactFile(@Nullable Output<String> artifactFile) {
            $.artifactFile = artifactFile;
            return this;
        }

        /**
         * @param artifactFile The artifact file for Flink Artifact.
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
         */
        public Builder class_(@Nullable Output<String> class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param class_ Java class or alias for the Flink Artifact as provided by developer.
         * 
         * @return builder
         * 
         */
        public Builder class_(String class_) {
            return class_(Output.of(class_));
        }

        /**
         * @param cloud The cloud service provider that runs the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that runs the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param contentFormat (Optional String) Archive format of the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder contentFormat(@Nullable Output<String> contentFormat) {
            $.contentFormat = contentFormat;
            return this;
        }

        /**
         * @param contentFormat (Optional String) Archive format of the Flink Artifact.
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
         * @param displayName The display name of Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of Flink Artifact.
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
        public Builder environment(@Nullable Output<FlinkArtifactEnvironmentArgs> environment) {
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
         * @param kind (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param region The cloud service provider region that hosts the Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
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
         * @param runtimeLanguage (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(@Nullable Output<String> runtimeLanguage) {
            $.runtimeLanguage = runtimeLanguage;
            return this;
        }

        /**
         * @param runtimeLanguage (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
         * 
         * @return builder
         * 
         */
        public Builder runtimeLanguage(String runtimeLanguage) {
            return runtimeLanguage(Output.of(runtimeLanguage));
        }

        /**
         * @param versions List of versions for this Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable Output<List<FlinkArtifactVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions List of versions for this Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder versions(List<FlinkArtifactVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        /**
         * @param versions List of versions for this Flink Artifact.
         * 
         * @return builder
         * 
         */
        public Builder versions(FlinkArtifactVersionArgs... versions) {
            return versions(List.of(versions));
        }

        public FlinkArtifactState build() {
            return $;
        }
    }

}
