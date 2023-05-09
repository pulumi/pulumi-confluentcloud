// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.BusinessMetadataAttributeDefinitionArgs;
import com.pulumi.confluentcloud.inputs.BusinessMetadataCredentialsArgs;
import com.pulumi.confluentcloud.inputs.BusinessMetadataSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BusinessMetadataState extends com.pulumi.resources.ResourceArgs {

    public static final BusinessMetadataState Empty = new BusinessMetadataState();

    /**
     * The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     * 
     */
    @Import(name="attributeDefinitions")
    private @Nullable Output<List<BusinessMetadataAttributeDefinitionArgs>> attributeDefinitions;

    /**
     * @return The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     * 
     */
    public Optional<Output<List<BusinessMetadataAttributeDefinitionArgs>>> attributeDefinitions() {
        return Optional.ofNullable(this.attributeDefinitions);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<BusinessMetadataCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<BusinessMetadataCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The description of the Business Metadata.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Business Metadata.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the attribute.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the attribute.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable Output<BusinessMetadataSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<BusinessMetadataSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * (Required Integer) The version of the Business Metadata, for example, `1`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return (Required Integer) The version of the Business Metadata, for example, `1`.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private BusinessMetadataState() {}

    private BusinessMetadataState(BusinessMetadataState $) {
        this.attributeDefinitions = $.attributeDefinitions;
        this.credentials = $.credentials;
        this.description = $.description;
        this.name = $.name;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessMetadataState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessMetadataState $;

        public Builder() {
            $ = new BusinessMetadataState();
        }

        public Builder(BusinessMetadataState defaults) {
            $ = new BusinessMetadataState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributeDefinitions The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
         * 
         * @return builder
         * 
         */
        public Builder attributeDefinitions(@Nullable Output<List<BusinessMetadataAttributeDefinitionArgs>> attributeDefinitions) {
            $.attributeDefinitions = attributeDefinitions;
            return this;
        }

        /**
         * @param attributeDefinitions The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
         * 
         * @return builder
         * 
         */
        public Builder attributeDefinitions(List<BusinessMetadataAttributeDefinitionArgs> attributeDefinitions) {
            return attributeDefinitions(Output.of(attributeDefinitions));
        }

        /**
         * @param attributeDefinitions The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
         * 
         * @return builder
         * 
         */
        public Builder attributeDefinitions(BusinessMetadataAttributeDefinitionArgs... attributeDefinitions) {
            return attributeDefinitions(List.of(attributeDefinitions));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<BusinessMetadataCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(BusinessMetadataCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param description The description of the Business Metadata.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Business Metadata.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public Builder schemaRegistryCluster(@Nullable Output<BusinessMetadataSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(BusinessMetadataSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        /**
         * @param version (Required Integer) The version of the Business Metadata, for example, `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version (Required Integer) The version of the Business Metadata, for example, `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public BusinessMetadataState build() {
            return $;
        }
    }

}