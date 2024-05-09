// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.CatalogEntityAttributesArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.CatalogEntityAttributesState;
import com.pulumi.confluentcloud.outputs.CatalogEntityAttributesCredentials;
import com.pulumi.confluentcloud.outputs.CatalogEntityAttributesSchemaRegistryCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes")
public class CatalogEntityAttributes extends com.pulumi.resources.CustomResource {
    /**
     * The attributes.
     * 
     */
    @Export(name="attributes", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> attributes;

    /**
     * @return The attributes.
     * 
     */
    public Output<Optional<Map<String,String>>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={CatalogEntityAttributesCredentials.class}, tree="[0]")
    private Output</* @Nullable */ CatalogEntityAttributesCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<CatalogEntityAttributesCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The qualified name of the entity, for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     * 
     */
    @Export(name="entityName", refs={String.class}, tree="[0]")
    private Output<String> entityName;

    /**
     * @return The qualified name of the entity, for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
     * 
     */
    public Output<String> entityName() {
        return this.entityName;
    }
    /**
     * The entity type, for example, `sr_schema`, `kafka_topic`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     * 
     */
    @Export(name="entityType", refs={String.class}, tree="[0]")
    private Output<String> entityType;

    /**
     * @return The entity type, for example, `sr_schema`, `kafka_topic`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }
    @Export(name="schemaRegistryCluster", refs={CatalogEntityAttributesSchemaRegistryCluster.class}, tree="[0]")
    private Output</* @Nullable */ CatalogEntityAttributesSchemaRegistryCluster> schemaRegistryCluster;

    public Output<Optional<CatalogEntityAttributesSchemaRegistryCluster>> schemaRegistryCluster() {
        return Codegen.optional(this.schemaRegistryCluster);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogEntityAttributes(String name) {
        this(name, CatalogEntityAttributesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogEntityAttributes(String name, CatalogEntityAttributesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogEntityAttributes(String name, CatalogEntityAttributesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes", name, args == null ? CatalogEntityAttributesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CatalogEntityAttributes(String name, Output<String> id, @Nullable CatalogEntityAttributesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "credentials"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CatalogEntityAttributes get(String name, Output<String> id, @Nullable CatalogEntityAttributesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CatalogEntityAttributes(name, id, state, options);
    }
}
