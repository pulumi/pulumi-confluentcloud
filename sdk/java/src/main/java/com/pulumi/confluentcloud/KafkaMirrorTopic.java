// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaMirrorTopicArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicState;
import com.pulumi.confluentcloud.outputs.KafkaMirrorTopicClusterLink;
import com.pulumi.confluentcloud.outputs.KafkaMirrorTopicKafkaCluster;
import com.pulumi.confluentcloud.outputs.KafkaMirrorTopicSourceKafkaTopic;
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
 * import com.pulumi.confluentcloud.KafkaMirrorTopic;
 * import com.pulumi.confluentcloud.KafkaMirrorTopicArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicSourceKafkaTopicArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicClusterLinkArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicKafkaClusterCredentialsArgs;
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
 *         var example = new KafkaMirrorTopic(&#34;example&#34;, KafkaMirrorTopicArgs.builder()        
 *             .sourceKafkaTopic(KafkaMirrorTopicSourceKafkaTopicArgs.builder()
 *                 .topicName(&#34;orders&#34;)
 *                 .build())
 *             .clusterLink(KafkaMirrorTopicClusterLinkArgs.builder()
 *                 .linkName(source_outbound.linkName())
 *                 .build())
 *             .kafkaCluster(KafkaMirrorTopicKafkaClusterArgs.builder()
 *                 .id(destination.id())
 *                 .restEndpoint(destination.restEndpoint())
 *                 .credentials(KafkaMirrorTopicKafkaClusterCredentialsArgs.builder()
 *                     .key(app_manager_destination_cluster_api_key.id())
 *                     .secret(app_manager_destination_cluster_api_key.secret())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Getting Started
 * 
 * The following end-to-end examples might help to get started with `confluentcloud.KafkaMirrorTopic` resource:
 *   * `destination-initiated-cluster-link-rbac`: An example of setting up a _destination_ initiated cluster link with a mirror topic
 *   * `source-initiated-cluster-link-rbac`: An example of setting up a _source_ initiated cluster link with a mirror topic
 * 
 * See [Mirror Topics on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/mirror-topics-cc.html) to learn more about Mirror Topics on Confluent Cloud.
 * 
 * ## Import
 * 
 * You can import a Kafka mirror topic by using the Kafka cluster ID, cluster link name, and Kafka topic name in the format `&lt;Kafka cluster ID&gt;/&lt;Cluster link name&gt;/&lt;Kafka topic name&gt;`, for example:
 * 
 * $ export IMPORT_KAFKA_API_KEY=&#34;&lt;kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_KAFKA_API_SECRET=&#34;&lt;kafka_api_secret&gt;&#34;
 * 
 * $ export IMPORT_KAFKA_REST_ENDPOINT=&#34;&lt;kafka_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic my_mirror_topic lkc-abc123/my-cluster-link/orders-123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic")
public class KafkaMirrorTopic extends com.pulumi.resources.CustomResource {
    @Export(name="clusterLink", refs={KafkaMirrorTopicClusterLink.class}, tree="[0]")
    private Output<KafkaMirrorTopicClusterLink> clusterLink;

    public Output<KafkaMirrorTopicClusterLink> clusterLink() {
        return this.clusterLink;
    }
    @Export(name="kafkaCluster", refs={KafkaMirrorTopicKafkaCluster.class}, tree="[0]")
    private Output<KafkaMirrorTopicKafkaCluster> kafkaCluster;

    public Output<KafkaMirrorTopicKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
     * 
     */
    @Export(name="mirrorTopicName", refs={String.class}, tree="[0]")
    private Output<String> mirrorTopicName;

    /**
     * @return The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
     * 
     */
    public Output<String> mirrorTopicName() {
        return this.mirrorTopicName;
    }
    @Export(name="sourceKafkaTopic", refs={KafkaMirrorTopicSourceKafkaTopic.class}, tree="[0]")
    private Output<KafkaMirrorTopicSourceKafkaTopic> sourceKafkaTopic;

    public Output<KafkaMirrorTopicSourceKafkaTopic> sourceKafkaTopic() {
        return this.sourceKafkaTopic;
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaMirrorTopic(String name) {
        this(name, KafkaMirrorTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaMirrorTopic(String name, KafkaMirrorTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaMirrorTopic(String name, KafkaMirrorTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic", name, args == null ? KafkaMirrorTopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KafkaMirrorTopic(String name, Output<String> id, @Nullable KafkaMirrorTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic", name, state, makeResourceOptions(options, id));
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
    public static KafkaMirrorTopic get(String name, Output<String> id, @Nullable KafkaMirrorTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaMirrorTopic(name, id, state, options);
    }
}
