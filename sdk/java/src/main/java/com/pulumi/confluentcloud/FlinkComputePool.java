// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.FlinkComputePoolArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.FlinkComputePoolState;
import com.pulumi.confluentcloud.outputs.FlinkComputePoolEnvironment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.FlinkComputePool;
 * import com.pulumi.confluentcloud.FlinkComputePoolArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkComputePoolEnvironmentArgs;
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
 *         var development = new Environment("development", EnvironmentArgs.builder()
 *             .displayName("Development")
 *             .build());
 * 
 *         var main = new FlinkComputePool("main", FlinkComputePoolArgs.builder()
 *             .displayName("standard_compute_pool")
 *             .cloud("AWS")
 *             .region("us-east-1")
 *             .maxCfu(5)
 *             .environment(FlinkComputePoolEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You can import a Flink Compute Pool by using Environment ID and Flink Compute Pool ID, in the format `&lt;Environment ID&gt;/&lt;Flink Compute Pool ID&gt;`. The following example shows how to import a Flink Compute Pool:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/flinkComputePool:FlinkComputePool main env-abc123/lfcp-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/flinkComputePool:FlinkComputePool")
public class FlinkComputePool extends com.pulumi.resources.CustomResource {
    /**
     * (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * The cloud service provider that runs the Flink Compute Pool.
     * 
     */
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    /**
     * @return The cloud service provider that runs the Flink Compute Pool.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }
    /**
     * The name of the Flink Compute Pool.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Flink Compute Pool.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={FlinkComputePoolEnvironment.class}, tree="[0]")
    private Output<FlinkComputePoolEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<FlinkComputePoolEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
     * 
     */
    @Export(name="maxCfu", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxCfu;

    /**
     * @return Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
     * 
     */
    public Output<Integer> maxCfu() {
        return this.maxCfu;
    }
    /**
     * The cloud service provider region that hosts the Flink Compute Pool.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The cloud service provider region that hosts the Flink Compute Pool.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * (Required String) The Confluent Resource Name of the Flink Compute Pool.
     * 
     */
    @Export(name="resourceName", refs={String.class}, tree="[0]")
    private Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Flink Compute Pool.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlinkComputePool(java.lang.String name) {
        this(name, FlinkComputePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlinkComputePool(java.lang.String name, FlinkComputePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlinkComputePool(java.lang.String name, FlinkComputePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkComputePool:FlinkComputePool", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FlinkComputePool(java.lang.String name, Output<java.lang.String> id, @Nullable FlinkComputePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkComputePool:FlinkComputePool", name, state, makeResourceOptions(options, id), false);
    }

    private static FlinkComputePoolArgs makeArgs(FlinkComputePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FlinkComputePoolArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static FlinkComputePool get(java.lang.String name, Output<java.lang.String> id, @Nullable FlinkComputePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlinkComputePool(name, id, state, options);
    }
}
