// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.FlinkStatementArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.FlinkStatementState;
import com.pulumi.confluentcloud.outputs.FlinkStatementComputePool;
import com.pulumi.confluentcloud.outputs.FlinkStatementCredentials;
import com.pulumi.confluentcloud.outputs.FlinkStatementEnvironment;
import com.pulumi.confluentcloud.outputs.FlinkStatementOrganization;
import com.pulumi.confluentcloud.outputs.FlinkStatementPrincipal;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Option #1: Manage multiple Flink Compute Pools in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.FlinkStatement;
 * import com.pulumi.confluentcloud.FlinkStatementArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkStatementOrganizationArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkStatementEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkStatementComputePoolArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkStatementPrincipalArgs;
 * import com.pulumi.confluentcloud.inputs.FlinkStatementCredentialsArgs;
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
 *         var randomIntTable = new FlinkStatement("randomIntTable", FlinkStatementArgs.builder()
 *             .organization(FlinkStatementOrganizationArgs.builder()
 *                 .id(main.id())
 *                 .build())
 *             .environment(FlinkStatementEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .computePool(FlinkStatementComputePoolArgs.builder()
 *                 .id(example.id())
 *                 .build())
 *             .principal(FlinkStatementPrincipalArgs.builder()
 *                 .id(app_manager_flink.id())
 *                 .build())
 *             .statement("CREATE TABLE random_int_table(ts TIMESTAMP_LTZ(3), random_value INT);")
 *             .properties(Map.ofEntries(
 *                 Map.entry("sql.current-catalog", exampleConfluentEnvironment.displayName()),
 *                 Map.entry("sql.current-database", exampleConfluentKafkaCluster.displayName())
 *             ))
 *             .restEndpoint(mainConfluentFlinkRegion.restEndpoint())
 *             .credentials(FlinkStatementCredentialsArgs.builder()
 *                 .key(env_admin_flink_api_key.id())
 *                 .secret(env_admin_flink_api_key.secret())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Option #2: Manage a single Flink Compute Pool in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.FlinkStatement;
 * import com.pulumi.confluentcloud.FlinkStatementArgs;
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
 *         var example = new FlinkStatement("example", FlinkStatementArgs.builder()
 *             .statement("CREATE TABLE random_int_table(ts TIMESTAMP_LTZ(3), random_value INT);")
 *             .properties(Map.ofEntries(
 *                 Map.entry("sql.current-catalog", confluentEnvironmentDisplayName),
 *                 Map.entry("sql.current-database", confluentKafkaClusterDisplayName)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Getting Started
 * 
 * The following end-to-end example might help to get started with [Flink Statements](https://docs.confluent.io/cloud/current/flink/get-started/overview.html):
 *   * flink-quickstart
 *   * flink-carry-over-offset-between-statements
 * 
 * ## Import
 * 
 * You can import a Flink statement by using the Flink Statement name, for example:
 * 
 * Option #1: Manage multiple Flink Compute Pools in the same Pulumi Stack
 * 
 * $ export IMPORT_CONFLUENT_ORGANIZATION_ID=&#34;&lt;organization_id&gt;&#34;
 * 
 * $ export IMPORT_CONFLUENT_ENVIRONMENT_ID=&#34;&lt;environment_id&gt;&#34;
 * 
 * $ export IMPORT_FLINK_COMPUTE_POOL_ID=&#34;&lt;flink_compute_pool_id&gt;&#34;
 * 
 * $ export IMPORT_FLINK_API_KEY=&#34;&lt;flink_api_key&gt;&#34;
 * 
 * $ export IMPORT_FLINK_API_SECRET=&#34;&lt;flink_api_secret&gt;&#34;
 * 
 * $ export IMPORT_FLINK_REST_ENDPOINT=&#34;&lt;flink_rest_endpoint&gt;&#34;
 * 
 * $ export IMPORT_FLINK_PRINCIPAL_ID=&#34;&lt;flink_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 * 
 * Option #2: Manage a single Flink Compute Pool in the same Pulumi Stack
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/flinkStatement:FlinkStatement")
public class FlinkStatement extends com.pulumi.resources.CustomResource {
    @Export(name="computePool", refs={FlinkStatementComputePool.class}, tree="[0]")
    private Output<FlinkStatementComputePool> computePool;

    public Output<FlinkStatementComputePool> computePool() {
        return this.computePool;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={FlinkStatementCredentials.class}, tree="[0]")
    private Output</* @Nullable */ FlinkStatementCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<FlinkStatementCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    @Export(name="environment", refs={FlinkStatementEnvironment.class}, tree="[0]")
    private Output<FlinkStatementEnvironment> environment;

    public Output<FlinkStatementEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Optional String) The last Kafka offsets that a statement has processed. Represented by a mapping from Kafka topic to a string representation of partitions mapped to offsets. For example,
     * 
     */
    @Export(name="latestOffsets", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> latestOffsets;

    /**
     * @return (Optional String) The last Kafka offsets that a statement has processed. Represented by a mapping from Kafka topic to a string representation of partitions mapped to offsets. For example,
     * 
     */
    public Output<Map<String,String>> latestOffsets() {
        return this.latestOffsets;
    }
    /**
     * (Optional String) The date and time at which the Kafka topic offsets were added to the statement status. It is represented in RFC3339 format and is in UTC. For example, `2023-03-31T00:00:00-00:00`.
     * 
     */
    @Export(name="latestOffsetsTimestamp", refs={String.class}, tree="[0]")
    private Output<String> latestOffsetsTimestamp;

    /**
     * @return (Optional String) The date and time at which the Kafka topic offsets were added to the statement status. It is represented in RFC3339 format and is in UTC. For example, `2023-03-31T00:00:00-00:00`.
     * 
     */
    public Output<String> latestOffsetsTimestamp() {
        return this.latestOffsetsTimestamp;
    }
    @Export(name="organization", refs={FlinkStatementOrganization.class}, tree="[0]")
    private Output<FlinkStatementOrganization> organization;

    public Output<FlinkStatementOrganization> organization() {
        return this.organization;
    }
    @Export(name="principal", refs={FlinkStatementPrincipal.class}, tree="[0]")
    private Output<FlinkStatementPrincipal> principal;

    public Output<FlinkStatementPrincipal> principal() {
        return this.principal;
    }
    /**
     * The custom topic settings to set:
     * 
     */
    @Export(name="properties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> properties;

    /**
     * @return The custom topic settings to set:
     * 
     */
    public Output<Map<String,String>> properties() {
        return this.properties;
    }
    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }
    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    @Export(name="statement", refs={String.class}, tree="[0]")
    private Output<String> statement;

    /**
     * @return The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }
    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    @Export(name="statementName", refs={String.class}, tree="[0]")
    private Output<String> statementName;

    /**
     * @return The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    public Output<String> statementName() {
        return this.statementName;
    }
    /**
     * Indicates whether the statement should be stopped.
     * 
     */
    @Export(name="stopped", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> stopped;

    /**
     * @return Indicates whether the statement should be stopped.
     * 
     */
    public Output<Boolean> stopped() {
        return this.stopped;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlinkStatement(java.lang.String name) {
        this(name, FlinkStatementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlinkStatement(java.lang.String name, FlinkStatementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlinkStatement(java.lang.String name, FlinkStatementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkStatement:FlinkStatement", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FlinkStatement(java.lang.String name, Output<java.lang.String> id, @Nullable FlinkStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkStatement:FlinkStatement", name, state, makeResourceOptions(options, id), false);
    }

    private static FlinkStatementArgs makeArgs(FlinkStatementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FlinkStatementArgs.Empty : args;
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
    public static FlinkStatement get(java.lang.String name, Output<java.lang.String> id, @Nullable FlinkStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlinkStatement(name, id, state, options);
    }
}
