// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.ProviderArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the confluent package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:confluentcloud")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The Stream Catalog REST Endpoint.
     * 
     */
    @Export(name="catalogRestEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> catalogRestEndpoint;

    /**
     * @return The Stream Catalog REST Endpoint.
     * 
     */
    public Output<Optional<String>> catalogRestEndpoint() {
        return Codegen.optional(this.catalogRestEndpoint);
    }
    /**
     * The Confluent Cloud API Key.
     * 
     */
    @Export(name="cloudApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudApiKey;

    /**
     * @return The Confluent Cloud API Key.
     * 
     */
    public Output<Optional<String>> cloudApiKey() {
        return Codegen.optional(this.cloudApiKey);
    }
    /**
     * The Confluent Cloud API Secret.
     * 
     */
    @Export(name="cloudApiSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudApiSecret;

    /**
     * @return The Confluent Cloud API Secret.
     * 
     */
    public Output<Optional<String>> cloudApiSecret() {
        return Codegen.optional(this.cloudApiSecret);
    }
    /**
     * The base endpoint of Confluent Cloud API.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return The base endpoint of Confluent Cloud API.
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * The Flink Environment ID.
     * 
     */
    @Export(name="environmentId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> environmentId;

    /**
     * @return The Flink Environment ID.
     * 
     */
    public Output<Optional<String>> environmentId() {
        return Codegen.optional(this.environmentId);
    }
    /**
     * The Flink API Key.
     * 
     */
    @Export(name="flinkApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flinkApiKey;

    /**
     * @return The Flink API Key.
     * 
     */
    public Output<Optional<String>> flinkApiKey() {
        return Codegen.optional(this.flinkApiKey);
    }
    /**
     * The Flink API Secret.
     * 
     */
    @Export(name="flinkApiSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flinkApiSecret;

    /**
     * @return The Flink API Secret.
     * 
     */
    public Output<Optional<String>> flinkApiSecret() {
        return Codegen.optional(this.flinkApiSecret);
    }
    /**
     * The Flink Compute Pool ID.
     * 
     */
    @Export(name="flinkComputePoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flinkComputePoolId;

    /**
     * @return The Flink Compute Pool ID.
     * 
     */
    public Output<Optional<String>> flinkComputePoolId() {
        return Codegen.optional(this.flinkComputePoolId);
    }
    /**
     * The Flink Principal ID.
     * 
     */
    @Export(name="flinkPrincipalId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flinkPrincipalId;

    /**
     * @return The Flink Principal ID.
     * 
     */
    public Output<Optional<String>> flinkPrincipalId() {
        return Codegen.optional(this.flinkPrincipalId);
    }
    /**
     * The Flink REST Endpoint.
     * 
     */
    @Export(name="flinkRestEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flinkRestEndpoint;

    /**
     * @return The Flink REST Endpoint.
     * 
     */
    public Output<Optional<String>> flinkRestEndpoint() {
        return Codegen.optional(this.flinkRestEndpoint);
    }
    /**
     * The Kafka Cluster API Key.
     * 
     */
    @Export(name="kafkaApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kafkaApiKey;

    /**
     * @return The Kafka Cluster API Key.
     * 
     */
    public Output<Optional<String>> kafkaApiKey() {
        return Codegen.optional(this.kafkaApiKey);
    }
    /**
     * The Kafka Cluster API Secret.
     * 
     */
    @Export(name="kafkaApiSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kafkaApiSecret;

    /**
     * @return The Kafka Cluster API Secret.
     * 
     */
    public Output<Optional<String>> kafkaApiSecret() {
        return Codegen.optional(this.kafkaApiSecret);
    }
    /**
     * The Kafka Cluster ID.
     * 
     */
    @Export(name="kafkaId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kafkaId;

    /**
     * @return The Kafka Cluster ID.
     * 
     */
    public Output<Optional<String>> kafkaId() {
        return Codegen.optional(this.kafkaId);
    }
    /**
     * The Kafka Cluster REST Endpoint.
     * 
     */
    @Export(name="kafkaRestEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kafkaRestEndpoint;

    /**
     * @return The Kafka Cluster REST Endpoint.
     * 
     */
    public Output<Optional<String>> kafkaRestEndpoint() {
        return Codegen.optional(this.kafkaRestEndpoint);
    }
    /**
     * The Flink Organization ID.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organizationId;

    /**
     * @return The Flink Organization ID.
     * 
     */
    public Output<Optional<String>> organizationId() {
        return Codegen.optional(this.organizationId);
    }
    /**
     * The Schema Registry Cluster API Key.
     * 
     */
    @Export(name="schemaRegistryApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaRegistryApiKey;

    /**
     * @return The Schema Registry Cluster API Key.
     * 
     */
    public Output<Optional<String>> schemaRegistryApiKey() {
        return Codegen.optional(this.schemaRegistryApiKey);
    }
    /**
     * The Schema Registry Cluster API Secret.
     * 
     */
    @Export(name="schemaRegistryApiSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaRegistryApiSecret;

    /**
     * @return The Schema Registry Cluster API Secret.
     * 
     */
    public Output<Optional<String>> schemaRegistryApiSecret() {
        return Codegen.optional(this.schemaRegistryApiSecret);
    }
    /**
     * The Schema Registry Cluster ID.
     * 
     */
    @Export(name="schemaRegistryId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaRegistryId;

    /**
     * @return The Schema Registry Cluster ID.
     * 
     */
    public Output<Optional<String>> schemaRegistryId() {
        return Codegen.optional(this.schemaRegistryId);
    }
    /**
     * The Schema Registry Cluster REST Endpoint.
     * 
     */
    @Export(name="schemaRegistryRestEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaRegistryRestEndpoint;

    /**
     * @return The Schema Registry Cluster REST Endpoint.
     * 
     */
    public Output<Optional<String>> schemaRegistryRestEndpoint() {
        return Codegen.optional(this.schemaRegistryRestEndpoint);
    }
    /**
     * The Tableflow API Key.
     * 
     */
    @Export(name="tableflowApiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tableflowApiKey;

    /**
     * @return The Tableflow API Key.
     * 
     */
    public Output<Optional<String>> tableflowApiKey() {
        return Codegen.optional(this.tableflowApiKey);
    }
    /**
     * The Tableflow API Secret.
     * 
     */
    @Export(name="tableflowApiSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tableflowApiSecret;

    /**
     * @return The Tableflow API Secret.
     * 
     */
    public Output<Optional<String>> tableflowApiSecret() {
        return Codegen.optional(this.tableflowApiSecret);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "cloudApiKey",
                "cloudApiSecret",
                "flinkApiKey",
                "flinkApiSecret",
                "kafkaApiKey",
                "kafkaApiSecret",
                "schemaRegistryApiKey",
                "schemaRegistryApiSecret",
                "tableflowApiKey",
                "tableflowApiSecret"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
