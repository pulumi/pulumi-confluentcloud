// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.NetworkArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.NetworkState;
import com.pulumi.confluentcloud.outputs.NetworkAw;
import com.pulumi.confluentcloud.outputs.NetworkAzure;
import com.pulumi.confluentcloud.outputs.NetworkDnsConfig;
import com.pulumi.confluentcloud.outputs.NetworkEnvironment;
import com.pulumi.confluentcloud.outputs.NetworkGateway;
import com.pulumi.confluentcloud.outputs.NetworkGcp;
import com.pulumi.confluentcloud.outputs.NetworkZoneInfo;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Example Network that supports Private Link Connections
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Network;
 * import com.pulumi.confluentcloud.NetworkArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
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
 *         var aws_private_link = new Network(&#34;aws-private-link&#34;, NetworkArgs.builder()        
 *             .displayName(&#34;AWS Private Link Network&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .connectionTypes(&#34;PRIVATELINK&#34;)
 *             .zones(            
 *                 &#34;use1-az1&#34;,
 *                 &#34;use1-az2&#34;,
 *                 &#34;use1-az6&#34;)
 *             .environment(NetworkEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Network that supports Peering Connections
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Network;
 * import com.pulumi.confluentcloud.NetworkArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
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
 *         var azure_peering = new Network(&#34;azure-peering&#34;, NetworkArgs.builder()        
 *             .displayName(&#34;Azure Peering Network&#34;)
 *             .cloud(&#34;AZURE&#34;)
 *             .region(&#34;eastus2&#34;)
 *             .cidr(&#34;10.10.0.0/16&#34;)
 *             .connectionTypes(&#34;PEERING&#34;)
 *             .environment(NetworkEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Network that supports Private Service Connect Connections
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Network;
 * import com.pulumi.confluentcloud.NetworkArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkDnsConfigArgs;
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
 *         var gcp_private_service_connect = new Network(&#34;gcp-private-service-connect&#34;, NetworkArgs.builder()        
 *             .displayName(&#34;GCP Private Service Connect Network&#34;)
 *             .cloud(&#34;GCP&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .connectionTypes(&#34;PRIVATELINK&#34;)
 *             .zones(            
 *                 &#34;us-central1-a&#34;,
 *                 &#34;us-central1-b&#34;,
 *                 &#34;us-central1-c&#34;)
 *             .environment(NetworkEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .dnsConfig(NetworkDnsConfigArgs.builder()
 *                 .resolution(&#34;PRIVATE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Network that supports Transit Gateway Endpoints
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Network;
 * import com.pulumi.confluentcloud.NetworkArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
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
 *         var aws_transit_gateway_attachment = new Network(&#34;aws-transit-gateway-attachment&#34;, NetworkArgs.builder()        
 *             .displayName(&#34;AWS Transit Gateway Attachment Network&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .cidr(&#34;10.10.0.0/16&#34;)
 *             .connectionTypes(&#34;TRANSITGATEWAY&#34;)
 *             .environment(NetworkEnvironmentArgs.builder()
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
 * The following end-to-end examples might help to get started with `confluentcloud.Network` resource:
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
 * 
 * ## Import
 * 
 * You can import a Network by using Environment ID and Network ID, in the format `&lt;Environment ID&gt;/&lt;Network ID&gt;`. The following example shows how to import a Network:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/network:Network")
public class Network extends com.pulumi.resources.CustomResource {
    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    @Export(name="aws", refs={List.class,NetworkAw.class}, tree="[0,1]")
    private Output<List<NetworkAw>> aws;

    /**
     * @return (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    public Output<List<NetworkAw>> aws() {
        return this.aws;
    }
    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    @Export(name="azures", refs={List.class,NetworkAzure.class}, tree="[0,1]")
    private Output<List<NetworkAzure>> azures;

    /**
     * @return (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    public Output<List<NetworkAzure>> azures() {
        return this.azures;
    }
    /**
     * The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     * 
     * &gt; **Note:** The `zone_info` configuration block and `reserved_cidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it&#39;s available only for AWS networks with PEERING connection type.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     * 
     * &gt; **Note:** The `zone_info` configuration block and `reserved_cidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it&#39;s available only for AWS networks with PEERING connection type.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    /**
     * @return The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }
    /**
     * The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    @Export(name="connectionTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> connectionTypes;

    /**
     * @return The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    public Output<List<String>> connectionTypes() {
        return this.connectionTypes;
    }
    /**
     * The name of the Network.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Network.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Network DNS config. It applies only to the PRIVATELINK network connection type.
     * 
     */
    @Export(name="dnsConfig", refs={NetworkDnsConfig.class}, tree="[0]")
    private Output<NetworkDnsConfig> dnsConfig;

    /**
     * @return Network DNS config. It applies only to the PRIVATELINK network connection type.
     * 
     */
    public Output<NetworkDnsConfig> dnsConfig() {
        return this.dnsConfig;
    }
    /**
     * (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     * 
     */
    @Export(name="dnsDomain", refs={String.class}, tree="[0]")
    private Output<String> dnsDomain;

    /**
     * @return (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     * 
     */
    public Output<String> dnsDomain() {
        return this.dnsDomain;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={NetworkEnvironment.class}, tree="[0]")
    private Output<NetworkEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<NetworkEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Export(name="gateways", refs={List.class,NetworkGateway.class}, tree="[0,1]")
    private Output<List<NetworkGateway>> gateways;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Output<List<NetworkGateway>> gateways() {
        return this.gateways;
    }
    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    @Export(name="gcps", refs={List.class,NetworkGcp.class}, tree="[0,1]")
    private Output<List<NetworkGcp>> gcps;

    /**
     * @return (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    public Output<List<NetworkGcp>> gcps() {
        return this.gcps;
    }
    /**
     * The cloud provider region where the network exists.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The cloud provider region where the network exists.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     * 
     */
    @Export(name="reservedCidr", refs={String.class}, tree="[0]")
    private Output<String> reservedCidr;

    /**
     * @return The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
     * 
     */
    public Output<String> reservedCidr() {
        return this.reservedCidr;
    }
    /**
     * (Required String) The Confluent Resource Name of the Network.
     * 
     */
    @Export(name="resourceName", refs={String.class}, tree="[0]")
    private Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Network.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }
    /**
     * (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    @Export(name="zonalSubdomains", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> zonalSubdomains;

    /**
     * @return (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    public Output<Map<String,String>> zonalSubdomains() {
        return this.zonalSubdomains;
    }
    /**
     * Each item represents information related to a single zone.
     * 
     */
    @Export(name="zoneInfos", refs={List.class,NetworkZoneInfo.class}, tree="[0,1]")
    private Output<List<NetworkZoneInfo>> zoneInfos;

    /**
     * @return Each item represents information related to a single zone.
     * 
     */
    public Output<List<NetworkZoneInfo>> zoneInfos() {
        return this.zoneInfos;
    }
    /**
     * The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> zones;

    /**
     * @return The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(String name, NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(String name, NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/network:Network", name, args == null ? NetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Network(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/network:Network", name, state, makeResourceOptions(options, id));
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
    public static Network get(String name, Output<String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, state, options);
    }
}
