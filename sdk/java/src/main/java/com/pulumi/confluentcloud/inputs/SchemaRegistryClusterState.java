// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterRegionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaRegistryClusterState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryClusterState Empty = new SchemaRegistryClusterState();

    /**
     * (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
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
    private @Nullable Output<SchemaRegistryClusterEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<SchemaRegistryClusterEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    @Import(name="package")
    private @Nullable Output<String> package_;

    /**
     * @return The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    public Optional<Output<String>> package_() {
        return Optional.ofNullable(this.package_);
    }

    @Import(name="region")
    private @Nullable Output<SchemaRegistryClusterRegionArgs> region;

    public Optional<Output<SchemaRegistryClusterRegionArgs>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    private SchemaRegistryClusterState() {}

    private SchemaRegistryClusterState(SchemaRegistryClusterState $) {
        this.apiVersion = $.apiVersion;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.kind = $.kind;
        this.package_ = $.package_;
        this.region = $.region;
        this.resourceName = $.resourceName;
        this.restEndpoint = $.restEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRegistryClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRegistryClusterState $;

        public Builder() {
            $ = new SchemaRegistryClusterState();
        }

        public Builder(SchemaRegistryClusterState defaults) {
            $ = new SchemaRegistryClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param displayName (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
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
        public Builder environment(@Nullable Output<SchemaRegistryClusterEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(SchemaRegistryClusterEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param kind (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param package_ The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<String> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
         * 
         * @return builder
         * 
         */
        public Builder package_(String package_) {
            return package_(Output.of(package_));
        }

        public Builder region(@Nullable Output<SchemaRegistryClusterRegionArgs> region) {
            $.region = region;
            return this;
        }

        public Builder region(SchemaRegistryClusterRegionArgs region) {
            return region(Output.of(region));
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param restEndpoint (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public SchemaRegistryClusterState build() {
            return $;
        }
    }

}