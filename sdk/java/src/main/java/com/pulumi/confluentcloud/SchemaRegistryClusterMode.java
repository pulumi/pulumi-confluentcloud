// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.SchemaRegistryClusterModeArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterModeState;
import com.pulumi.confluentcloud.outputs.SchemaRegistryClusterModeCredentials;
import com.pulumi.confluentcloud.outputs.SchemaRegistryClusterModeSchemaRegistryCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Mode by using the Schema Registry cluster ID, Subject name in the format `&lt;Schema Registry cluster ID&gt;`, for example:
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_KEY=&#34;&lt;schema_registry_api_key&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_API_SECRET=&#34;&lt;schema_registry_api_secret&gt;&#34;
 * 
 * $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT=&#34;&lt;schema_registry_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode example lsrc-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode")
public class SchemaRegistryClusterMode extends com.pulumi.resources.CustomResource {
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={SchemaRegistryClusterModeCredentials.class}, tree="[0]")
    private Output</* @Nullable */ SchemaRegistryClusterModeCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<SchemaRegistryClusterModeCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
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
    @Export(name="schemaRegistryCluster", refs={SchemaRegistryClusterModeSchemaRegistryCluster.class}, tree="[0]")
    private Output</* @Nullable */ SchemaRegistryClusterModeSchemaRegistryCluster> schemaRegistryCluster;

    public Output<Optional<SchemaRegistryClusterModeSchemaRegistryCluster>> schemaRegistryCluster() {
        return Codegen.optional(this.schemaRegistryCluster);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchemaRegistryClusterMode(String name) {
        this(name, SchemaRegistryClusterModeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchemaRegistryClusterMode(String name, @Nullable SchemaRegistryClusterModeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaRegistryClusterMode(String name, @Nullable SchemaRegistryClusterModeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, args == null ? SchemaRegistryClusterModeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchemaRegistryClusterMode(String name, Output<String> id, @Nullable SchemaRegistryClusterModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, state, makeResourceOptions(options, id));
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
    public static SchemaRegistryClusterMode get(String name, Output<String> id, @Nullable SchemaRegistryClusterModeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchemaRegistryClusterMode(name, id, state, options);
    }
}
