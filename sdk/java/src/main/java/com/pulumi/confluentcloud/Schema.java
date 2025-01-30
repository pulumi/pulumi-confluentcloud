// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.SchemaArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.SchemaState;
import com.pulumi.confluentcloud.outputs.SchemaCredentials;
import com.pulumi.confluentcloud.outputs.SchemaMetadata;
import com.pulumi.confluentcloud.outputs.SchemaRuleset;
import com.pulumi.confluentcloud.outputs.SchemaSchemaReference;
import com.pulumi.confluentcloud.outputs.SchemaSchemaRegistryCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * You can import a Schema by using the Schema Registry cluster ID, Subject name, and unique identifier (or `latest` when `recreate_on_update = false`) of the Schema in the format `&lt;Schema Registry cluster ID&gt;/&lt;Subject name&gt;/&lt;Schema identifier&gt;`, for example:
 * 
 * Option A: recreate_on_update = false (by default)
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY=&#34;&lt;schema_registry_api_key&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET=&#34;&lt;schema_registry_api_secret&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT=&#34;&lt;schema_registry_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/latest
 * ```
 * 
 * Option B: recreate_on_update = true
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY=&#34;&lt;schema_registry_api_key&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET=&#34;&lt;schema_registry_api_secret&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT=&#34;&lt;schema_registry_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/100003
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/schema:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={SchemaCredentials.class}, tree="[0]")
    private Output</* @Nullable */ SchemaCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<SchemaCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     * 
     */
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    /**
     * @return The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }
    /**
     * An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
     * 
     */
    @Export(name="hardDelete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hardDelete;

    /**
     * @return An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
     * 
     */
    public Output<Optional<Boolean>> hardDelete() {
        return Codegen.optional(this.hardDelete);
    }
    /**
     * See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     * 
     */
    @Export(name="metadata", refs={SchemaMetadata.class}, tree="[0]")
    private Output<SchemaMetadata> metadata;

    /**
     * @return See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     * 
     */
    public Output<SchemaMetadata> metadata() {
        return this.metadata;
    }
    /**
     * An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
     * 
     */
    @Export(name="recreateOnUpdate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> recreateOnUpdate;

    /**
     * @return An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
     * 
     */
    public Output<Optional<Boolean>> recreateOnUpdate() {
        return Codegen.optional(this.recreateOnUpdate);
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
    /**
     * The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     * 
     */
    @Export(name="ruleset", refs={SchemaRuleset.class}, tree="[0]")
    private Output</* @Nullable */ SchemaRuleset> ruleset;

    /**
     * @return The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     * 
     */
    public Output<Optional<SchemaRuleset>> ruleset() {
        return Codegen.optional(this.ruleset);
    }
    /**
     * The schema string, for example, `file(&#34;./schema_version_1.avsc&#34;)`.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema string, for example, `file(&#34;./schema_version_1.avsc&#34;)`.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     */
    @Export(name="schemaIdentifier", refs={Integer.class}, tree="[0]")
    private Output<Integer> schemaIdentifier;

    /**
     * @return (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     */
    public Output<Integer> schemaIdentifier() {
        return this.schemaIdentifier;
    }
    /**
     * The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     * 
     */
    @Export(name="schemaReferences", refs={List.class,SchemaSchemaReference.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SchemaSchemaReference>> schemaReferences;

    /**
     * @return The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     * 
     */
    public Output<Optional<List<SchemaSchemaReference>>> schemaReferences() {
        return Codegen.optional(this.schemaReferences);
    }
    @Export(name="schemaRegistryCluster", refs={SchemaSchemaRegistryCluster.class}, tree="[0]")
    private Output</* @Nullable */ SchemaSchemaRegistryCluster> schemaRegistryCluster;

    public Output<Optional<SchemaSchemaRegistryCluster>> schemaRegistryCluster() {
        return Codegen.optional(this.schemaRegistryCluster);
    }
    /**
     * An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
     * 
     */
    @Export(name="skipValidationDuringPlan", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipValidationDuringPlan;

    /**
     * @return An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
     * 
     */
    public Output<Optional<Boolean>> skipValidationDuringPlan() {
        return Codegen.optional(this.skipValidationDuringPlan);
    }
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    @Export(name="subjectName", refs={String.class}, tree="[0]")
    private Output<String> subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    public Output<String> subjectName() {
        return this.subjectName;
    }
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return (Required Integer) The version of the Schema, for example, `4`.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(java.lang.String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(java.lang.String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(java.lang.String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schema:Schema", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Schema(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schema:Schema", name, state, makeResourceOptions(options, id), false);
    }

    private static SchemaArgs makeArgs(SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SchemaArgs.Empty : args;
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
    public static Schema get(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
