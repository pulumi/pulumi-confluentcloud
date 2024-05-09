// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaClusterArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaClusterState;
import com.pulumi.confluentcloud.outputs.KafkaClusterBasic;
import com.pulumi.confluentcloud.outputs.KafkaClusterByokKey;
import com.pulumi.confluentcloud.outputs.KafkaClusterDedicated;
import com.pulumi.confluentcloud.outputs.KafkaClusterEnterprise;
import com.pulumi.confluentcloud.outputs.KafkaClusterEnvironment;
import com.pulumi.confluentcloud.outputs.KafkaClusterNetwork;
import com.pulumi.confluentcloud.outputs.KafkaClusterStandard;
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
 * ### Example Kafka clusters on AWS
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
 * import com.pulumi.confluentcloud.KafkaCluster;
 * import com.pulumi.confluentcloud.KafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterBasicArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterStandardArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterDedicatedArgs;
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
 *         var basic = new KafkaCluster(&#34;basic&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;basic_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-2&#34;)
 *             .basic()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var standard = new KafkaCluster(&#34;standard&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;standard_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-2&#34;)
 *             .standard()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var dedicated = new KafkaCluster(&#34;dedicated&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;dedicated_kafka_cluster&#34;)
 *             .availability(&#34;MULTI_ZONE&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-2&#34;)
 *             .dedicated(KafkaClusterDedicatedArgs.builder()
 *                 .cku(2)
 *                 .build())
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Kafka clusters on Azure
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
 * import com.pulumi.confluentcloud.KafkaCluster;
 * import com.pulumi.confluentcloud.KafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterBasicArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterStandardArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterDedicatedArgs;
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
 *         var basic = new KafkaCluster(&#34;basic&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;basic_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;AZURE&#34;)
 *             .region(&#34;centralus&#34;)
 *             .basic()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var standard = new KafkaCluster(&#34;standard&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;standard_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;AZURE&#34;)
 *             .region(&#34;centralus&#34;)
 *             .standard()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var dedicated = new KafkaCluster(&#34;dedicated&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;dedicated_kafka_cluster&#34;)
 *             .availability(&#34;MULTI_ZONE&#34;)
 *             .cloud(&#34;AZURE&#34;)
 *             .region(&#34;centralus&#34;)
 *             .dedicated(KafkaClusterDedicatedArgs.builder()
 *                 .cku(2)
 *                 .build())
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Kafka clusters on GCP
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
 * import com.pulumi.confluentcloud.KafkaCluster;
 * import com.pulumi.confluentcloud.KafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterBasicArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterStandardArgs;
 * import com.pulumi.confluentcloud.inputs.KafkaClusterDedicatedArgs;
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
 *         var basic = new KafkaCluster(&#34;basic&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;basic_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;GCP&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .basic()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var standard = new KafkaCluster(&#34;standard&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;standard_kafka_cluster&#34;)
 *             .availability(&#34;SINGLE_ZONE&#34;)
 *             .cloud(&#34;GCP&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .standard()
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var dedicated = new KafkaCluster(&#34;dedicated&#34;, KafkaClusterArgs.builder()        
 *             .displayName(&#34;dedicated_kafka_cluster&#34;)
 *             .availability(&#34;MULTI_ZONE&#34;)
 *             .cloud(&#34;GCP&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .dedicated(KafkaClusterDedicatedArgs.builder()
 *                 .cku(2)
 *                 .build())
 *             .environment(KafkaClusterEnvironmentArgs.builder()
 *                 .id(development.id())
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
 * The following end-to-end examples might help to get started with `confluentcloud.KafkaCluster` resource:
 *   * `basic-kafka-acls`: _Basic_ Kafka cluster with authorization using ACLs
 *   * `basic-kafka-acls-with-alias`: _Basic_ Kafka cluster with authorization using ACLs
 *   * `standard-kafka-acls`: _Standard_ Kafka cluster with authorization using ACLs
 *   * `standard-kafka-rbac`: _Standard_ Kafka cluster with authorization using RBAC
 *   * `dedicated-public-kafka-acls`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
 *   * `dedicated-public-kafka-rbac`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
 *   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
 *   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
 *   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
 *   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *   * `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 * 
 * ## Import
 * 
 * You can import a Kafka cluster by using Environment ID and Kafka cluster ID, in the format `&lt;Environment ID&gt;/&lt;Kafka cluster ID&gt;`, e.g.
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaCluster:KafkaCluster my_kafka env-abc123/lkc-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaCluster:KafkaCluster")
public class KafkaCluster extends com.pulumi.resources.CustomResource {
    /**
     * (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
     * 
     */
    @Export(name="availability", refs={String.class}, tree="[0]")
    private Output<String> availability;

    /**
     * @return The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
     * 
     */
    public Output<String> availability() {
        return this.availability;
    }
    /**
     * The configuration of the Basic Kafka cluster.
     * 
     */
    @Export(name="basic", refs={KafkaClusterBasic.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterBasic> basic;

    /**
     * @return The configuration of the Basic Kafka cluster.
     * 
     */
    public Output<Optional<KafkaClusterBasic>> basic() {
        return Codegen.optional(this.basic);
    }
    /**
     * (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    @Export(name="bootstrapEndpoint", refs={String.class}, tree="[0]")
    private Output<String> bootstrapEndpoint;

    /**
     * @return (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     * 
     */
    public Output<String> bootstrapEndpoint() {
        return this.bootstrapEndpoint;
    }
    @Export(name="byokKey", refs={KafkaClusterByokKey.class}, tree="[0]")
    private Output<KafkaClusterByokKey> byokKey;

    public Output<KafkaClusterByokKey> byokKey() {
        return this.byokKey;
    }
    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    /**
     * @return The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     * 
     */
    @Export(name="dedicated", refs={KafkaClusterDedicated.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterDedicated> dedicated;

    /**
     * @return (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     * 
     */
    public Output<Optional<KafkaClusterDedicated>> dedicated() {
        return Codegen.optional(this.dedicated);
    }
    /**
     * The name of the Kafka cluster.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Kafka cluster.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The configuration of the Enterprise Kafka cluster.
     * 
     */
    @Export(name="enterprises", refs={List.class,KafkaClusterEnterprise.class}, tree="[0,1]")
    private Output</* @Nullable */ List<KafkaClusterEnterprise>> enterprises;

    /**
     * @return The configuration of the Enterprise Kafka cluster.
     * 
     */
    public Output<Optional<List<KafkaClusterEnterprise>>> enterprises() {
        return Codegen.optional(this.enterprises);
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={KafkaClusterEnvironment.class}, tree="[0]")
    private Output<KafkaClusterEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<KafkaClusterEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Export(name="network", refs={KafkaClusterNetwork.class}, tree="[0]")
    private Output<KafkaClusterNetwork> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Output<KafkaClusterNetwork> network() {
        return this.network;
    }
    /**
     * (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     * 
     */
    @Export(name="rbacCrn", refs={String.class}, tree="[0]")
    private Output<String> rbacCrn;

    /**
     * @return (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     * 
     */
    public Output<String> rbacCrn() {
        return this.rbacCrn;
    }
    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output<String> restEndpoint;

    /**
     * @return (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Output<String> restEndpoint() {
        return this.restEndpoint;
    }
    /**
     * The configuration of the Standard Kafka cluster.
     * 
     */
    @Export(name="standard", refs={KafkaClusterStandard.class}, tree="[0]")
    private Output</* @Nullable */ KafkaClusterStandard> standard;

    /**
     * @return The configuration of the Standard Kafka cluster.
     * 
     */
    public Output<Optional<KafkaClusterStandard>> standard() {
        return Codegen.optional(this.standard);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaCluster(String name) {
        this(name, KafkaClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaCluster(String name, KafkaClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaCluster(String name, KafkaClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaCluster:KafkaCluster", name, args == null ? KafkaClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KafkaCluster(String name, Output<String> id, @Nullable KafkaClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaCluster:KafkaCluster", name, state, makeResourceOptions(options, id));
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
    public static KafkaCluster get(String name, Output<String> id, @Nullable KafkaClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaCluster(name, id, state, options);
    }
}
