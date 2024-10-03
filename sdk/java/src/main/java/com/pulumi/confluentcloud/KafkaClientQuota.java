// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaClientQuotaArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaClientQuotaState;
import com.pulumi.confluentcloud.outputs.KafkaClientQuotaEnvironment;
import com.pulumi.confluentcloud.outputs.KafkaClientQuotaKafkaCluster;
import com.pulumi.confluentcloud.outputs.KafkaClientQuotaThroughput;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * import com.pulumi.confluentcloud.KafkaClientQuota;
 * import com.pulumi.confluentcloud.KafkaClientQuotaArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClientQuotaThroughputArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClientQuotaKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClientQuotaEnvironmentArgs;
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
 *         var example = new KafkaClientQuota("example", KafkaClientQuotaArgs.builder()
 *             .displayName("test-quota")
 *             .description("Test Quota")
 *             .throughput(KafkaClientQuotaThroughputArgs.builder()
 *                 .ingressByteRate("100")
 *                 .egressByteRate("200")
 *                 .build())
 *             .principals(            
 *                 appManager.id(),
 *                 appManager2.id())
 *             .kafkaCluster(KafkaClientQuotaKafkaClusterArgs.builder()
 *                 .id(dedicated.id())
 *                 .build())
 *             .environment(KafkaClientQuotaEnvironmentArgs.builder()
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
 * You can import a Kafka Client Quota by using Kafka Client Quota ID. The following example shows how to import a Kafka Client Quota ID:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaClientQuota:KafkaClientQuota example cq-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaClientQuota:KafkaClientQuota")
public class KafkaClientQuota extends com.pulumi.resources.CustomResource {
    /**
     * The description of the Kafka Client Quota.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Kafka Client Quota.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the Kafka Client Quota.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Kafka Client Quota.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={KafkaClientQuotaEnvironment.class}, tree="[0]")
    private Output<KafkaClientQuotaEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<KafkaClientQuotaEnvironment> environment() {
        return this.environment;
    }
    @Export(name="kafkaCluster", refs={KafkaClientQuotaKafkaCluster.class}, tree="[0]")
    private Output<KafkaClientQuotaKafkaCluster> kafkaCluster;

    public Output<KafkaClientQuotaKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, `&#34;&lt;default&gt;&#34;`, to represent the default quota for all users and service accounts.
     * 
     */
    @Export(name="principals", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> principals;

    /**
     * @return The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, `&#34;&lt;default&gt;&#34;`, to represent the default quota for all users and service accounts.
     * 
     */
    public Output<List<String>> principals() {
        return this.principals;
    }
    /**
     * Block for representing a Kafka Quota.
     * 
     */
    @Export(name="throughput", refs={KafkaClientQuotaThroughput.class}, tree="[0]")
    private Output<KafkaClientQuotaThroughput> throughput;

    /**
     * @return Block for representing a Kafka Quota.
     * 
     */
    public Output<KafkaClientQuotaThroughput> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaClientQuota(java.lang.String name) {
        this(name, KafkaClientQuotaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaClientQuota(java.lang.String name, KafkaClientQuotaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaClientQuota(java.lang.String name, KafkaClientQuotaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KafkaClientQuota(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaClientQuotaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, state, makeResourceOptions(options, id), false);
    }

    private static KafkaClientQuotaArgs makeArgs(KafkaClientQuotaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KafkaClientQuotaArgs.Empty : args;
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
    public static KafkaClientQuota get(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaClientQuotaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaClientQuota(name, id, state, options);
    }
}
