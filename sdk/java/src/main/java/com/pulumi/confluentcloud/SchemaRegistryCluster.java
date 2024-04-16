// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.SchemaRegistryClusterArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterState;
import com.pulumi.confluentcloud.outputs.SchemaRegistryClusterEnvironment;
import com.pulumi.confluentcloud.outputs.SchemaRegistryClusterRegion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.ConfluentcloudFunctions;
 * import com.pulumi.confluentcloud.inputs.GetSchemaRegistryRegionArgs;
 * import com.pulumi.confluentcloud.SchemaRegistryCluster;
 * import com.pulumi.confluentcloud.SchemaRegistryClusterArgs;
 * import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.SchemaRegistryClusterRegionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var development = new Environment(&#34;development&#34;, EnvironmentArgs.builder()        
 *             .displayName(&#34;Development&#34;)
 *             .build());
 * 
 *         final var example = ConfluentcloudFunctions.getSchemaRegistryRegion(GetSchemaRegistryRegionArgs.builder()
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-2&#34;)
 *             .package_(&#34;ESSENTIALS&#34;)
 *             .build());
 * 
 *         var essentials = new SchemaRegistryCluster(&#34;essentials&#34;, SchemaRegistryClusterArgs.builder()        
 *             .package_(example.applyValue(getSchemaRegistryRegionResult -&gt; getSchemaRegistryRegionResult.package()))
 *             .environment(SchemaRegistryClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .region(SchemaRegistryClusterRegionArgs.builder()
 *                 .id(example.applyValue(getSchemaRegistryRegionResult -&gt; getSchemaRegistryRegionResult.id()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You can import a Schema Registry cluster by using Environment ID and Schema Registry cluster ID, in the format `&lt;Environment ID&gt;/&lt;Schema Registry cluster ID&gt;`, for example:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster example env-abc123/lsrc-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster")
public class SchemaRegistryCluster extends com.pulumi.resources.CustomResource {
    /**
     * (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={SchemaRegistryClusterEnvironment.class}, tree="[0]")
    private Output<SchemaRegistryClusterEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<SchemaRegistryClusterEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    @Export(name="package", refs={String.class}, tree="[0]")
    private Output<String> package_;

    /**
     * @return The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    public Output<String> package_() {
        return this.package_;
    }
    @Export(name="region", refs={SchemaRegistryClusterRegion.class}, tree="[0]")
    private Output<SchemaRegistryClusterRegion> region;

    public Output<SchemaRegistryClusterRegion> region() {
        return this.region;
    }
    /**
     * (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    @Export(name="resourceName", refs={String.class}, tree="[0]")
    private Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }
    /**
     * (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output<String> restEndpoint;

    /**
     * @return (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    public Output<String> restEndpoint() {
        return this.restEndpoint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchemaRegistryCluster(String name) {
        this(name, SchemaRegistryClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchemaRegistryCluster(String name, SchemaRegistryClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaRegistryCluster(String name, SchemaRegistryClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster", name, args == null ? SchemaRegistryClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchemaRegistryCluster(String name, Output<String> id, @Nullable SchemaRegistryClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SchemaRegistryCluster get(String name, Output<String> id, @Nullable SchemaRegistryClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchemaRegistryCluster(name, id, state, options);
    }
}
