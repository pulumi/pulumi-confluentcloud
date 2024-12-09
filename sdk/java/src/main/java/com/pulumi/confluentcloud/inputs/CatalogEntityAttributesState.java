// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.CatalogEntityAttributesCredentialsArgs;
import com.pulumi.confluentcloud.inputs.CatalogEntityAttributesSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogEntityAttributesState extends com.pulumi.resources.ResourceArgs {

    public static final CatalogEntityAttributesState Empty = new CatalogEntityAttributesState();

    /**
     * The attributes.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,String>> attributes;

    /**
     * @return The attributes.
     * 
     */
    public Optional<Output<Map<String,String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<CatalogEntityAttributesCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<CatalogEntityAttributesCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     * 
     */
    @Import(name="entityName")
    private @Nullable Output<String> entityName;

    /**
     * @return The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     * 
     */
    public Optional<Output<String>> entityName() {
        return Optional.ofNullable(this.entityName);
    }

    /**
     * The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     * 
     */
    @Import(name="entityType")
    private @Nullable Output<String> entityType;

    /**
     * @return The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     * 
     */
    public Optional<Output<String>> entityType() {
        return Optional.ofNullable(this.entityType);
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
    private @Nullable Output<CatalogEntityAttributesSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<CatalogEntityAttributesSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private CatalogEntityAttributesState() {}

    private CatalogEntityAttributesState(CatalogEntityAttributesState $) {
        this.attributes = $.attributes;
        this.credentials = $.credentials;
        this.entityName = $.entityName;
        this.entityType = $.entityType;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogEntityAttributesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogEntityAttributesState $;

        public Builder() {
            $ = new CatalogEntityAttributesState();
        }

        public Builder(CatalogEntityAttributesState defaults) {
            $ = new CatalogEntityAttributesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes The attributes.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes The attributes.
         * 
         * @return builder
         * 
         */
        public Builder attributes(Map<String,String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<CatalogEntityAttributesCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(CatalogEntityAttributesCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param entityName The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
         * 
         * @return builder
         * 
         */
        public Builder entityName(@Nullable Output<String> entityName) {
            $.entityName = entityName;
            return this;
        }

        /**
         * @param entityName The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
         * 
         * @return builder
         * 
         */
        public Builder entityName(String entityName) {
            return entityName(Output.of(entityName));
        }

        /**
         * @param entityType The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
         * 
         * @return builder
         * 
         */
        public Builder entityType(@Nullable Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType The entity type, for example, `cf_environment`, `kafka_logical_cluster`, `kafka_topic`, `sr_schema`, etc. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
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

        public Builder schemaRegistryCluster(@Nullable Output<CatalogEntityAttributesSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(CatalogEntityAttributesSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public CatalogEntityAttributesState build() {
            return $;
        }
    }

}