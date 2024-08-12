// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaTopicArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaTopicState;
import com.pulumi.confluentcloud.outputs.KafkaTopicCredentials;
import com.pulumi.confluentcloud.outputs.KafkaTopicKafkaCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `&lt;Kafka cluster ID&gt;/&lt;Kafka topic name&gt;`, for example:
 * 
 * Option #1: Manage multiple Kafka clusters in the same Terraform workspace
 * 
 * $ export IMPORT_KAFKA_API_KEY=&#34;&lt;kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_KAFKA_API_SECRET=&#34;&lt;kafka_api_secret&gt;&#34;
 * 
 * $ export IMPORT_KAFKA_REST_ENDPOINT=&#34;&lt;kafka_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
 * ```
 * 
 * Option #2: Manage a single Kafka cluster in the same Terraform workspace
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
 * ```
 * 
 * resource &#34;confluent_kafka_topic&#34; &#34;orders&#34; {
 * 
 *   kafka_cluster {
 * 
 *     id = confluent_kafka_cluster.basic-cluster.id
 * 
 *   }
 * 
 *   topic_name         = &#34;orders&#34;
 * 
 *   partitions_count   = 4
 * 
 *   rest_endpoint      = confluent_kafka_cluster.basic-cluster.rest_endpoint
 * 
 * # https://docs.confluent.io/cloud/current/client-apps/topics/manage.html#ak-topic-configurations-for-all-ccloud-cluster-types
 * 
 *   config = {
 * 
 *     &#34;cleanup.policy&#34;                      = &#34;delete&#34;
 *     
 *     &#34;delete.retention.ms&#34;                 = &#34;86400000&#34;
 *     
 *     &#34;max.compaction.lag.ms&#34;               = &#34;9223372036854775807&#34;
 *     
 *     &#34;max.message.bytes&#34;                   = &#34;2097164&#34;
 *     
 *     &#34;message.timestamp.after.max.ms&#34;      = &#34;9223372036854775807&#34;
 *     
 *     &#34;message.timestamp.before.max.ms&#34;     = &#34;9223372036854775807&#34;      
 *     
 *     &#34;message.timestamp.difference.max.ms&#34; = &#34;9223372036854775807&#34;
 *     
 *     &#34;message.timestamp.type&#34;              = &#34;CreateTime&#34;
 *     
 *     &#34;min.compaction.lag.ms&#34;               = &#34;0&#34;
 *     
 *     &#34;min.insync.replicas&#34;                 = &#34;2&#34;
 *     
 *     &#34;retention.bytes&#34;                     = &#34;-1&#34;
 *     
 *     &#34;retention.ms&#34;                        = &#34;604800000&#34;
 *     
 *     &#34;segment.bytes&#34;                       = &#34;104857600&#34;
 *     
 *     &#34;segment.ms&#34;                          = &#34;604800000&#34;
 * 
 *   }
 * 
 *   credentials {
 * 
 *     key    = confluent_api_key.app-manager-kafka-api-key.id
 *     
 *     secret = confluent_api_key.app-manager-kafka-api-key.secret
 * 
 *   }
 * 
 * }
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaTopic:KafkaTopic")
public class KafkaTopic extends com.pulumi.resources.CustomResource {
    /**
     * The custom topic settings to set:
     * 
     */
    @Export(name="config", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> config;

    /**
     * @return The custom topic settings to set:
     * 
     */
    public Output<Map<String,String>> config() {
        return this.config;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={KafkaTopicCredentials.class}, tree="[0]")
    private Output</* @Nullable */ KafkaTopicCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<KafkaTopicCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * @deprecated
     * This property has been deprecated. Please use &#34;restEndpoint&#34; instead.
     * 
     */
    @Deprecated /* This property has been deprecated. Please use ""restEndpoint"" instead. */
    @Export(name="httpEndpoint", refs={String.class}, tree="[0]")
    private Output<String> httpEndpoint;

    public Output<String> httpEndpoint() {
        return this.httpEndpoint;
    }
    @Export(name="kafkaCluster", refs={KafkaTopicKafkaCluster.class}, tree="[0]")
    private Output</* @Nullable */ KafkaTopicKafkaCluster> kafkaCluster;

    public Output<Optional<KafkaTopicKafkaCluster>> kafkaCluster() {
        return Codegen.optional(this.kafkaCluster);
    }
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    @Export(name="partitionsCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> partitionsCount;

    /**
     * @return The number of partitions to create in the topic. Defaults to `6`.
     * 
     */
    public Output<Optional<Integer>> partitionsCount() {
        return Codegen.optional(this.partitionsCount);
    }
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     * 
     */
    @Export(name="topicName", refs={String.class}, tree="[0]")
    private Output<String> topicName;

    /**
     * @return The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaTopic(java.lang.String name) {
        this(name, KafkaTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaTopic(java.lang.String name, KafkaTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaTopic(java.lang.String name, KafkaTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaTopic:KafkaTopic", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KafkaTopic(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaTopic:KafkaTopic", name, state, makeResourceOptions(options, id), false);
    }

    private static KafkaTopicArgs makeArgs(KafkaTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KafkaTopicArgs.Empty : args;
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
    public static KafkaTopic get(java.lang.String name, Output<java.lang.String> id, @Nullable KafkaTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaTopic(name, id, state, options);
    }
}
