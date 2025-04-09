// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.BusinessMetadataBindingArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.BusinessMetadataBindingState;
import com.pulumi.confluentcloud.outputs.BusinessMetadataBindingCredentials;
import com.pulumi.confluentcloud.outputs.BusinessMetadataBindingSchemaRegistryCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.BusinessMetadataBinding` provides a Business Metadata Binding resource that enables creating, editing, and deleting Business Metadata Bindings on Confluent Cloud.
 * 
 * ## Example Usage
 * 
 * ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.ConfluentcloudFunctions;
 * import com.pulumi.confluentcloud.inputs.GetKafkaTopicArgs;
 * import com.pulumi.confluentcloud.BusinessMetadataBinding;
 * import com.pulumi.confluentcloud.BusinessMetadataBindingArgs;
 * import com.pulumi.confluentcloud.inputs.BusinessMetadataBindingSchemaRegistryClusterArgs;
 * import com.pulumi.confluentcloud.inputs.BusinessMetadataBindingCredentialsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var main = ConfluentcloudFunctions.getKafkaTopic(GetKafkaTopicArgs.builder()
 *             .topicName("orders")
 *             .build());
 * 
 *         var mainBusinessMetadataBinding = new BusinessMetadataBinding("mainBusinessMetadataBinding", BusinessMetadataBindingArgs.builder()
 *             .schemaRegistryCluster(BusinessMetadataBindingSchemaRegistryClusterArgs.builder()
 *                 .id(essentials.id())
 *                 .build())
 *             .restEndpoint(essentials.restEndpoint())
 *             .credentials(BusinessMetadataBindingCredentialsArgs.builder()
 *                 .key("<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>")
 *                 .secret("<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>")
 *                 .build())
 *             .businessMetadataName(pii.name())
 *             .entityName(String.format("%s:%s:%s", schemaRegistryId,kafkaId,main.topicName()))
 *             .entityType("kafka_topic")
 *             .attributes(Map.ofEntries(
 *                 Map.entry("team", "teamName"),
 *                 Map.entry("email", "team}{@literal @}{@code company.com")
 *             ))
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.ConfluentcloudFunctions;
 * import com.pulumi.confluentcloud.inputs.GetKafkaTopicArgs;
 * import com.pulumi.confluentcloud.BusinessMetadataBinding;
 * import com.pulumi.confluentcloud.BusinessMetadataBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var main = ConfluentcloudFunctions.getKafkaTopic(GetKafkaTopicArgs.builder()
 *             .topicName("orders")
 *             .build());
 * 
 *         var mainBusinessMetadataBinding = new BusinessMetadataBinding("mainBusinessMetadataBinding", BusinessMetadataBindingArgs.builder()
 *             .businessMetadataName(pii.name())
 *             .entityName(String.format("%s:%s:%s", schemaRegistryId,kafkaId,main.topicName()))
 *             .entityType("kafka_topic")
 *             .attributes(Map.ofEntries(
 *                 Map.entry("team", "teamName"),
 *                 Map.entry("email", "team}{@literal @}{@code company.com")
 *             ))
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * &gt; **Note:** We also support `schema_registry_rest_endpoint` instead of `catalog_rest_endpoint` for the time being.
 * 
 * ## Getting Started
 * 
 * The following end-to-end example might help to get started with [Stream Catalog](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html):
 * * stream-catalog
 * 
 * ## Import
 * 
 * You can import a Business Metadata Binding by using the Schema Registry cluster ID, Business Metadata name, entity name and entity type in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Business Metadata Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example:
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY=&#34;&lt;schema_registry_api_key&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET=&#34;&lt;schema_registry_api_secret&gt;&#34;
 * 
 * $ export IMPORT_CATALOG_REST_ENDPOINT=&#34;&lt;catalog_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding")
public class BusinessMetadataBinding extends com.pulumi.resources.CustomResource {
    /**
     * The attributes.
     * 
     */
    @Export(name="attributes", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> attributes;

    /**
     * @return The attributes.
     * 
     */
    public Output<Map<String,String>> attributes() {
        return this.attributes;
    }
    /**
     * The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     */
    @Export(name="businessMetadataName", refs={String.class}, tree="[0]")
    private Output<String> businessMetadataName;

    /**
     * @return The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     */
    public Output<String> businessMetadataName() {
        return this.businessMetadataName;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={BusinessMetadataBindingCredentials.class}, tree="[0]")
    private Output</* @Nullable */ BusinessMetadataBindingCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<BusinessMetadataBindingCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
     * 
     */
    @Export(name="entityName", refs={String.class}, tree="[0]")
    private Output<String> entityName;

    /**
     * @return The qualified name of the entity, for example, `${data.confluent_schema_registry_cluster.essentials.id}:.:${confluent_schema.purchase.schema_identifier}`, `${data.confluent_schema_registry_cluster.essentials.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`. Refer to the [Examples of qualified names](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#examples-of-qualified-names) to see the full list of supported values for the `entity_name` attribute.
     * 
     */
    public Output<String> entityName() {
        return this.entityName;
    }
    /**
     * The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
     * 
     */
    @Export(name="entityType", refs={String.class}, tree="[0]")
    private Output<String> entityType;

    /**
     * @return The entity type, for example, `sr_schema`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
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
    @Export(name="schemaRegistryCluster", refs={BusinessMetadataBindingSchemaRegistryCluster.class}, tree="[0]")
    private Output</* @Nullable */ BusinessMetadataBindingSchemaRegistryCluster> schemaRegistryCluster;

    public Output<Optional<BusinessMetadataBindingSchemaRegistryCluster>> schemaRegistryCluster() {
        return Codegen.optional(this.schemaRegistryCluster);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BusinessMetadataBinding(java.lang.String name) {
        this(name, BusinessMetadataBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessMetadataBinding(java.lang.String name, BusinessMetadataBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessMetadataBinding(java.lang.String name, BusinessMetadataBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BusinessMetadataBinding(java.lang.String name, Output<java.lang.String> id, @Nullable BusinessMetadataBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding", name, state, makeResourceOptions(options, id), false);
    }

    private static BusinessMetadataBindingArgs makeArgs(BusinessMetadataBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BusinessMetadataBindingArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static BusinessMetadataBinding get(java.lang.String name, Output<java.lang.String> id, @Nullable BusinessMetadataBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessMetadataBinding(name, id, state, options);
    }
}
