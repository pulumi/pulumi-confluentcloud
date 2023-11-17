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
 * ## Import
 * 
 * You can import a Network by using Environment ID and Network ID, in the format `&lt;Environment ID&gt;/&lt;Network ID&gt;`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
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
     * The IPv4 CIDR block to be used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return The IPv4 CIDR block to be used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
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
     * Network DNS config. It applies only to the PRIVATELINK network connection type. When omitted, `resolution` defaults to `CHASED_PRIVATE`. It supports the following:
     * 
     */
    @Export(name="dnsConfig", refs={NetworkDnsConfig.class}, tree="[0]")
    private Output<NetworkDnsConfig> dnsConfig;

    /**
     * @return Network DNS config. It applies only to the PRIVATELINK network connection type. When omitted, `resolution` defaults to `CHASED_PRIVATE`. It supports the following:
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
