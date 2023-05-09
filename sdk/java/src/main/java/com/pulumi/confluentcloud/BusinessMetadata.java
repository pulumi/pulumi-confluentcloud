// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.BusinessMetadataArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.BusinessMetadataState;
import com.pulumi.confluentcloud.outputs.BusinessMetadataAttributeDefinition;
import com.pulumi.confluentcloud.outputs.BusinessMetadataCredentials;
import com.pulumi.confluentcloud.outputs.BusinessMetadataSchemaRegistryCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Business Metadata by using the Schema Registry cluster ID, Business Metadata name in the format `&lt;Schema Registry cluster ID&gt;/&lt;Business Metadata name&gt;`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY=&#34;&lt;schema_registry_api_key&gt;&#34; $ export IMPORT_SCHEMA_REGISTRY_API_SECRET=&#34;&lt;schema_registry_api_secret&gt;&#34; $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT=&#34;&lt;schema_registry_rest_endpoint&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/businessMetadata:BusinessMetadata pii lsrc-8wrx70/PII
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/businessMetadata:BusinessMetadata")
public class BusinessMetadata extends com.pulumi.resources.CustomResource {
    /**
     * The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     * 
     */
    @Export(name="attributeDefinitions", type=List.class, parameters={BusinessMetadataAttributeDefinition.class})
    private Output<List<BusinessMetadataAttributeDefinition>> attributeDefinitions;

    /**
     * @return The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     * 
     */
    public Output<List<BusinessMetadataAttributeDefinition>> attributeDefinitions() {
        return this.attributeDefinitions;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", type=BusinessMetadataCredentials.class, parameters={})
    private Output</* @Nullable */ BusinessMetadataCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<BusinessMetadataCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The description of the Business Metadata.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Business Metadata.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the attribute.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Export(name="restEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }
    @Export(name="schemaRegistryCluster", type=BusinessMetadataSchemaRegistryCluster.class, parameters={})
    private Output</* @Nullable */ BusinessMetadataSchemaRegistryCluster> schemaRegistryCluster;

    public Output<Optional<BusinessMetadataSchemaRegistryCluster>> schemaRegistryCluster() {
        return Codegen.optional(this.schemaRegistryCluster);
    }
    /**
     * (Required Integer) The version of the Business Metadata, for example, `1`.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return (Required Integer) The version of the Business Metadata, for example, `1`.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BusinessMetadata(String name) {
        this(name, BusinessMetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessMetadata(String name, @Nullable BusinessMetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessMetadata(String name, @Nullable BusinessMetadataArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/businessMetadata:BusinessMetadata", name, args == null ? BusinessMetadataArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BusinessMetadata(String name, Output<String> id, @Nullable BusinessMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/businessMetadata:BusinessMetadata", name, state, makeResourceOptions(options, id));
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
    public static BusinessMetadata get(String name, Output<String> id, @Nullable BusinessMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessMetadata(name, id, state, options);
    }
}