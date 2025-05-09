// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.ClusterLinkArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.ClusterLinkState;
import com.pulumi.confluentcloud.outputs.ClusterLinkDestinationKafkaCluster;
import com.pulumi.confluentcloud.outputs.ClusterLinkLocalKafkaCluster;
import com.pulumi.confluentcloud.outputs.ClusterLinkRemoteKafkaCluster;
import com.pulumi.confluentcloud.outputs.ClusterLinkSourceKafkaCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
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
 * import com.pulumi.confluentcloud.ClusterLink;
 * import com.pulumi.confluentcloud.ClusterLinkArgs;
 * import com.pulumi.confluentcloud.inputs.ClusterLinkLocalKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.ClusterLinkLocalKafkaClusterCredentialsArgs;
 * import com.pulumi.confluentcloud.inputs.ClusterLinkRemoteKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.ClusterLinkRemoteKafkaClusterCredentialsArgs;
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
 *         // https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode
 *         var east_to_west = new ClusterLink("east-to-west", ClusterLinkArgs.builder()
 *             .link("bidirectional-link")
 *             .linkMode("BIDIRECTIONAL")
 *             .localKafkaCluster(ClusterLinkLocalKafkaClusterArgs.builder()
 *                 .id(east.id())
 *                 .restEndpoint(east.restEndpoint())
 *                 .credentials(ClusterLinkLocalKafkaClusterCredentialsArgs.builder()
 *                     .key(app_manager_east_cluster_api_key.id())
 *                     .secret(app_manager_east_cluster_api_key.secret())
 *                     .build())
 *                 .build())
 *             .remoteKafkaCluster(ClusterLinkRemoteKafkaClusterArgs.builder()
 *                 .id(west.id())
 *                 .bootstrapEndpoint(west.bootstrapEndpoint())
 *                 .credentials(ClusterLinkRemoteKafkaClusterCredentialsArgs.builder()
 *                     .key(app_manager_west_cluster_api_key.id())
 *                     .secret(app_manager_west_cluster_api_key.secret())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var west_to_east = new ClusterLink("west-to-east", ClusterLinkArgs.builder()
 *             .link("bidirectional-link")
 *             .linkMode("BIDIRECTIONAL")
 *             .localKafkaCluster(ClusterLinkLocalKafkaClusterArgs.builder()
 *                 .id(west.id())
 *                 .restEndpoint(west.restEndpoint())
 *                 .credentials(ClusterLinkLocalKafkaClusterCredentialsArgs.builder()
 *                     .key(app_manager_west_cluster_api_key.id())
 *                     .secret(app_manager_west_cluster_api_key.secret())
 *                     .build())
 *                 .build())
 *             .remoteKafkaCluster(ClusterLinkRemoteKafkaClusterArgs.builder()
 *                 .id(east.id())
 *                 .bootstrapEndpoint(east.bootstrapEndpoint())
 *                 .credentials(ClusterLinkRemoteKafkaClusterCredentialsArgs.builder()
 *                     .key(app_manager_east_cluster_api_key.id())
 *                     .secret(app_manager_east_cluster_api_key.secret())
 *                     .build())
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
 * The following end-to-end examples might help to get started with `confluentcloud.ClusterLink` resource:
 *   * destination-initiated-cluster-link-rbac: An example of setting up a _destination_ initiated cluster link with a mirror topic
 *   * source-initiated-cluster-link-rbac: An example of setting up a _source_ initiated cluster link with a mirror topic
 *   * regular-bidirectional-cluster-link-rbac: An example of setting up a bidirectional cluster link with 2 mirror topics
 *   * advanced-bidirectional-cluster-link-rbac: An example of setting up a bidirectional cluster link with 2 mirror topics ([advanced option](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode))
 * 
 * See [Cluster Linking on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/index.html) to learn more about Cluster Linking on Confluent Cloud.
 * 
 * ## Import
 * 
 * You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode,
 * 
 * source (or local for bidirectional cluster links) Kafka cluster ID, and destination (or remote  for bidirectional cluster links) Kafka cluster ID, in the format `&lt;Cluster link name&gt;/&lt;Cluster link mode&gt;/&lt;Cluster connection mode&gt;/&lt;Source (Local) Kafka cluster ID&gt;/&lt;Destination (Remote) Kafka cluster ID&gt;`, for example:
 * 
 * Option #1 when using source-initiated or destination-initiated cluster links
 * 
 * $ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT=&#34;&lt;source_kafka_bootstrap_endpoint&gt;&#34;
 * 
 * $ export IMPORT_SOURCE_KAFKA_API_KEY=&#34;&lt;source_kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_SOURCE_KAFKA_API_SECRET=&#34;&lt;source_kafka_api_secret&gt;&#34;
 * 
 * $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT=&#34;&lt;destination_kafka_rest_endpoint&gt;&#34;
 * 
 * $ export IMPORT_DESTINATION_KAFKA_API_KEY=&#34;&lt;destination_kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_DESTINATION_KAFKA_API_SECRET=&#34;&lt;destination_kafka_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
 * ```
 * 
 * Option #2 when using bidirectional cluster links
 * 
 * $ export IMPORT_LOCAL_KAFKA_BOOTSTRAP_ENDPOINT=&#34;&lt;local_kafka_bootstrap_endpoint&gt;&#34;
 * 
 * $ export IMPORT_LOCAL_KAFKA_API_KEY=&#34;&lt;local_kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_LOCAL_KAFKA_API_SECRET=&#34;&lt;local_kafka_api_secret&gt;&#34;
 * 
 * $ export IMPORT_REMOTE_KAFKA_REST_ENDPOINT=&#34;&lt;remote_kafka_rest_endpoint&gt;&#34;
 * 
 * $ export IMPORT_REMOTE_KAFKA_API_KEY=&#34;&lt;remote_kafka_api_key&gt;&#34;
 * 
 * $ export IMPORT_REMOTE_KAFKA_API_SECRET=&#34;&lt;remote_kafka_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/BIDIRECTIONAL/OUTBOUND/lkc-abc123/lkc-xyz456
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/clusterLink:ClusterLink")
public class ClusterLink extends com.pulumi.resources.CustomResource {
    /**
     * (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
     * 
     */
    @Export(name="clusterLinkId", refs={String.class}, tree="[0]")
    private Output<String> clusterLinkId;

    /**
     * @return (Required String) The actual Cluster Link ID assigned from Confluent Cloud that uniquely represents a link between two Kafka clusters, for example, `qz0HDEV-Qz2B5aPFpcWQJQ`.
     * 
     */
    public Output<String> clusterLinkId() {
        return this.clusterLinkId;
    }
    /**
     * The custom cluster link settings to set:
     * 
     */
    @Export(name="config", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> config;

    /**
     * @return The custom cluster link settings to set:
     * 
     */
    public Output<Map<String,String>> config() {
        return this.config;
    }
    /**
     * The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
     * 
     */
    @Export(name="connectionMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionMode;

    /**
     * @return The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
     * 
     */
    public Output<Optional<String>> connectionMode() {
        return Codegen.optional(this.connectionMode);
    }
    @Export(name="destinationKafkaCluster", refs={ClusterLinkDestinationKafkaCluster.class}, tree="[0]")
    private Output</* @Nullable */ ClusterLinkDestinationKafkaCluster> destinationKafkaCluster;

    public Output<Optional<ClusterLinkDestinationKafkaCluster>> destinationKafkaCluster() {
        return Codegen.optional(this.destinationKafkaCluster);
    }
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     * 
     */
    @Export(name="link", refs={String.class}, tree="[0]")
    private Output<String> link;

    /**
     * @return The name of the cluster link, for example, `my-cluster-link`.
     * 
     */
    public Output<String> link() {
        return this.link;
    }
    /**
     * The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;`, `&#34;SOURCE&#34;`, and `&#34;BIDIRECTIONAL&#34;`. Defaults to `&#34;DESTINATION&#34;`.
     * 
     */
    @Export(name="linkMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> linkMode;

    /**
     * @return The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;`, `&#34;SOURCE&#34;`, and `&#34;BIDIRECTIONAL&#34;`. Defaults to `&#34;DESTINATION&#34;`.
     * 
     */
    public Output<Optional<String>> linkMode() {
        return Codegen.optional(this.linkMode);
    }
    @Export(name="localKafkaCluster", refs={ClusterLinkLocalKafkaCluster.class}, tree="[0]")
    private Output</* @Nullable */ ClusterLinkLocalKafkaCluster> localKafkaCluster;

    public Output<Optional<ClusterLinkLocalKafkaCluster>> localKafkaCluster() {
        return Codegen.optional(this.localKafkaCluster);
    }
    @Export(name="remoteKafkaCluster", refs={ClusterLinkRemoteKafkaCluster.class}, tree="[0]")
    private Output</* @Nullable */ ClusterLinkRemoteKafkaCluster> remoteKafkaCluster;

    public Output<Optional<ClusterLinkRemoteKafkaCluster>> remoteKafkaCluster() {
        return Codegen.optional(this.remoteKafkaCluster);
    }
    @Export(name="sourceKafkaCluster", refs={ClusterLinkSourceKafkaCluster.class}, tree="[0]")
    private Output</* @Nullable */ ClusterLinkSourceKafkaCluster> sourceKafkaCluster;

    public Output<Optional<ClusterLinkSourceKafkaCluster>> sourceKafkaCluster() {
        return Codegen.optional(this.sourceKafkaCluster);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterLink(java.lang.String name) {
        this(name, ClusterLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterLink(java.lang.String name, @Nullable ClusterLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterLink(java.lang.String name, @Nullable ClusterLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/clusterLink:ClusterLink", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ClusterLink(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/clusterLink:ClusterLink", name, state, makeResourceOptions(options, id), false);
    }

    private static ClusterLinkArgs makeArgs(@Nullable ClusterLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClusterLinkArgs.Empty : args;
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
    public static ClusterLink get(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterLink(name, id, state, options);
    }
}
