// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaClusterConfigArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaClusterConfigState;
import com.pulumi.confluentcloud.outputs.KafkaClusterConfigCredentials;
import com.pulumi.confluentcloud.outputs.KafkaClusterConfigKafkaCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [![Open Preview](https://img.shields.io/badge/Lifecycle%20Stage-Open%20Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.KafkaClusterConfig` provides a Kafka cluster config resource that enables updating configs on a Dedicated Kafka cluster on Confluent Cloud.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.KafkaClusterConfig;
 * import com.pulumi.confluentcloud.KafkaClusterConfigArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterConfigKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterConfigCredentialsArgs;
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
 *         var orders = new KafkaClusterConfig(&#34;orders&#34;, KafkaClusterConfigArgs.builder()        
 *             .kafkaCluster(KafkaClusterConfigKafkaClusterArgs.builder()
 *                 .id(confluent_kafka_cluster.dedicated().id())
 *                 .build())
 *             .restEndpoint(confluent_kafka_cluster.dedicated().rest_endpoint())
 *             .config(Map.ofEntries(
 *                 Map.entry(&#34;auto.create.topics.enable&#34;, &#34;true&#34;),
 *                 Map.entry(&#34;log.retention.ms&#34;, &#34;604800123&#34;)
 *             ))
 *             .credentials(KafkaClusterConfigCredentialsArgs.builder()
 *                 .key(confluent_api_key.app-manager-kafka-api-key().id())
 *                 .secret(confluent_api_key.app-manager-kafka-api-key().secret())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * You can import a Kafka cluster config by using the Kafka cluster ID, for example$ export IMPORT_KAFKA_API_KEY=&#34;&lt;kafka_api_key&gt;&#34; $ export IMPORT_KAFKA_API_SECRET=&#34;&lt;kafka_api_secret&gt;&#34; $ export IMPORT_KAFKA_REST_ENDPOINT=&#34;&lt;kafka_rest_endpoint&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig test lkc-abc123
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig")
public class KafkaClusterConfig extends com.pulumi.resources.CustomResource {
    /**
     * The custom cluster settings to set:
     * 
     */
    @Export(name="config", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> config;

    /**
     * @return The custom cluster settings to set:
     * 
     */
    public Output<Map<String,String>> config() {
        return this.config;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", type=KafkaClusterConfigCredentials.class, parameters={})
    private Output</* @Nullable */ KafkaClusterConfigCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<KafkaClusterConfigCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    @Export(name="kafkaCluster", type=KafkaClusterConfigKafkaCluster.class, parameters={})
    private Output<KafkaClusterConfigKafkaCluster> kafkaCluster;

    public Output<KafkaClusterConfigKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Export(name="restEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaClusterConfig(String name) {
        this(name, KafkaClusterConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaClusterConfig(String name, KafkaClusterConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaClusterConfig(String name, KafkaClusterConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig", name, args == null ? KafkaClusterConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KafkaClusterConfig(String name, Output<String> id, @Nullable KafkaClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig", name, state, makeResourceOptions(options, id));
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
    public static KafkaClusterConfig get(String name, Output<String> id, @Nullable KafkaClusterConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaClusterConfig(name, id, state, options);
    }
}
