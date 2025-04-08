// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.TableflowTopicArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.TableflowTopicState;
import com.pulumi.confluentcloud.outputs.TableflowTopicByobAws;
import com.pulumi.confluentcloud.outputs.TableflowTopicCredentials;
import com.pulumi.confluentcloud.outputs.TableflowTopicEnvironment;
import com.pulumi.confluentcloud.outputs.TableflowTopicKafkaCluster;
import com.pulumi.confluentcloud.outputs.TableflowTopicManagedStorage;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.TableflowTopic;
 * import com.pulumi.confluentcloud.TableflowTopicArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicManagedStorageArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicCredentialsArgs;
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
 *         var example = new TableflowTopic("example", TableflowTopicArgs.builder()
 *             .managedStorages(TableflowTopicManagedStorageArgs.builder()
 *                 .build())
 *             .environment(TableflowTopicEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .kafkaCluster(TableflowTopicKafkaClusterArgs.builder()
 *                 .id(stagingConfluentKafkaCluster.id())
 *                 .build())
 *             .displayName(orders.topicName())
 *             .tableFormats(            
 *                 "ICEBERG",
 *                 "DELTA")
 *             .credentials(TableflowTopicCredentialsArgs.builder()
 *                 .key(env_admin_tableflow_api_key.id())
 *                 .secret(env_admin_tableflow_api_key.secret())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.TableflowTopic;
 * import com.pulumi.confluentcloud.TableflowTopicArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.TableflowTopicByobAwsArgs;
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
 *         var example = new TableflowTopic("example", TableflowTopicArgs.builder()
 *             .environment(TableflowTopicEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .kafkaCluster(TableflowTopicKafkaClusterArgs.builder()
 *                 .id(stagingConfluentKafkaCluster.id())
 *                 .build())
 *             .displayName(orders.topicName())
 *             .byobAws(TableflowTopicByobAwsArgs.builder()
 *                 .bucketName("bucket_1")
 *                 .providerIntegrationId(main.id())
 *                 .build())
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
 * The following end-to-end examples might help to get started with `confluentcloud.TableflowTopic` resource:
 * * `confluent-managed-storage`: Tableflow topic with Confluent-managed storage.
 * * `byob-aws-storage`: Tableflow topic with custom (BYOB AWS) storage.
 * 
 * ## Import
 * 
 * You can import a Tableflow Topic by using the Tableflow Topic name, Environment ID, and Kafka Cluster ID, in the format `&lt;Environment ID&gt;/&lt;Kafka Cluster ID&gt;/&lt;Tableflow Topic name&gt;`, for example:
 * 
 * Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
 * 
 * $ export IMPORT_TABLEFLOW_API_KEY=&#34;&lt;tableflow_api_key&gt;&#34;
 * 
 * $ export IMPORT_TABLEFLOW_API_SECRET=&#34;&lt;tableflow_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
 * ```
 * 
 * Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/tableflowTopic:TableflowTopic")
public class TableflowTopic extends com.pulumi.resources.CustomResource {
    /**
     * supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
     * 
     */
    @Export(name="byobAws", refs={TableflowTopicByobAws.class}, tree="[0]")
    private Output</* @Nullable */ TableflowTopicByobAws> byobAws;

    /**
     * @return supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
     * 
     */
    public Output<Optional<TableflowTopicByobAws>> byobAws() {
        return Codegen.optional(this.byobAws);
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={TableflowTopicCredentials.class}, tree="[0]")
    private Output</* @Nullable */ TableflowTopicCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<TableflowTopicCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The name of the Kafka topic for which Tableflow is enabled.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Kafka topic for which Tableflow is enabled.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
     * 
     */
    @Export(name="enableCompaction", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableCompaction;

    /**
     * @return (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
     * 
     */
    public Output<Boolean> enableCompaction() {
        return this.enableCompaction;
    }
    /**
     * (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
     * 
     */
    @Export(name="enablePartitioning", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enablePartitioning;

    /**
     * @return (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
     * 
     */
    public Output<Boolean> enablePartitioning() {
        return this.enablePartitioning;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={TableflowTopicEnvironment.class}, tree="[0]")
    private Output<TableflowTopicEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<TableflowTopicEnvironment> environment() {
        return this.environment;
    }
    @Export(name="kafkaCluster", refs={TableflowTopicKafkaCluster.class}, tree="[0]")
    private Output<TableflowTopicKafkaCluster> kafkaCluster;

    public Output<TableflowTopicKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
     * 
     */
    @Export(name="managedStorages", refs={List.class,TableflowTopicManagedStorage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TableflowTopicManagedStorage>> managedStorages;

    /**
     * @return The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
     * 
     */
    public Output<Optional<List<TableflowTopicManagedStorage>>> managedStorages() {
        return Codegen.optional(this.managedStorages);
    }
    /**
     * The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
     * 
     */
    @Export(name="recordFailureStrategy", refs={String.class}, tree="[0]")
    private Output<String> recordFailureStrategy;

    /**
     * @return The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
     * 
     */
    public Output<String> recordFailureStrategy() {
        return this.recordFailureStrategy;
    }
    /**
     * The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
     * 
     */
    @Export(name="retentionMs", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> retentionMs;

    /**
     * @return The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
     * 
     */
    public Output<Optional<String>> retentionMs() {
        return Codegen.optional(this.retentionMs);
    }
    /**
     * (Optional Boolean) Indicates whether the Tableflow should be suspended.
     * 
     */
    @Export(name="suspended", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> suspended;

    /**
     * @return (Optional Boolean) Indicates whether the Tableflow should be suspended.
     * 
     */
    public Output<Boolean> suspended() {
        return this.suspended;
    }
    /**
     * The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
     * 
     */
    @Export(name="tableFormats", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tableFormats;

    /**
     * @return The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
     * 
     */
    public Output<List<String>> tableFormats() {
        return this.tableFormats;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableflowTopic(java.lang.String name) {
        this(name, TableflowTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableflowTopic(java.lang.String name, TableflowTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableflowTopic(java.lang.String name, TableflowTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/tableflowTopic:TableflowTopic", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TableflowTopic(java.lang.String name, Output<java.lang.String> id, @Nullable TableflowTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/tableflowTopic:TableflowTopic", name, state, makeResourceOptions(options, id), false);
    }

    private static TableflowTopicArgs makeArgs(TableflowTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TableflowTopicArgs.Empty : args;
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
    public static TableflowTopic get(java.lang.String name, Output<java.lang.String> id, @Nullable TableflowTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableflowTopic(name, id, state, options);
    }
}
