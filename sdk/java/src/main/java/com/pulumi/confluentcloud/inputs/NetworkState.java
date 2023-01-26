// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.NetworkAwArgs;
import com.pulumi.confluentcloud.inputs.NetworkAzureArgs;
import com.pulumi.confluentcloud.inputs.NetworkDnsConfigArgs;
import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.NetworkGcpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    @Import(name="aws")
    private @Nullable Output<List<NetworkAwArgs>> aws;

    /**
     * @return (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
     * 
     */
    public Optional<Output<List<NetworkAwArgs>>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    @Import(name="azures")
    private @Nullable Output<List<NetworkAzureArgs>> azures;

    /**
     * @return (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
     * 
     */
    public Optional<Output<List<NetworkAzureArgs>>> azures() {
        return Optional.ofNullable(this.azures);
    }

    /**
     * The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    /**
     * @return The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    @Import(name="connectionTypes")
    private @Nullable Output<List<String>> connectionTypes;

    /**
     * @return The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
     * 
     */
    public Optional<Output<List<String>>> connectionTypes() {
        return Optional.ofNullable(this.connectionTypes);
    }

    /**
     * The name of the Network.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Network.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Network DNS config. It applies only to the PRIVATELINK network connection type.
     * 
     */
    @Import(name="dnsConfig")
    private @Nullable Output<NetworkDnsConfigArgs> dnsConfig;

    /**
     * @return Network DNS config. It applies only to the PRIVATELINK network connection type.
     * 
     */
    public Optional<Output<NetworkDnsConfigArgs>> dnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }

    /**
     * (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     * 
     */
    @Import(name="dnsDomain")
    private @Nullable Output<String> dnsDomain;

    /**
     * @return (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
     * 
     */
    public Optional<Output<String>> dnsDomain() {
        return Optional.ofNullable(this.dnsDomain);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<NetworkEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<NetworkEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    @Import(name="gcps")
    private @Nullable Output<List<NetworkGcpArgs>> gcps;

    /**
     * @return (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
     * 
     */
    public Optional<Output<List<NetworkGcpArgs>>> gcps() {
        return Optional.ofNullable(this.gcps);
    }

    /**
     * The cloud provider region where the network exists.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The cloud provider region where the network exists.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (Required String) The Confluent Resource Name of the Network.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Network.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    @Import(name="zonalSubdomains")
    private @Nullable Output<Map<String,String>> zonalSubdomains;

    /**
     * @return (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    public Optional<Output<Map<String,String>>> zonalSubdomains() {
        return Optional.ofNullable(this.zonalSubdomains);
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
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return The 3 availability zones for this network. They can optionally be specified for AWS networks
     * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
     * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private NetworkState() {}

    private NetworkState(NetworkState $) {
        this.aws = $.aws;
        this.azures = $.azures;
        this.cidr = $.cidr;
        this.cloud = $.cloud;
        this.connectionTypes = $.connectionTypes;
        this.displayName = $.displayName;
        this.dnsConfig = $.dnsConfig;
        this.dnsDomain = $.dnsDomain;
        this.environment = $.environment;
        this.gcps = $.gcps;
        this.region = $.region;
        this.resourceName = $.resourceName;
        this.zonalSubdomains = $.zonalSubdomains;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkState $;

        public Builder() {
            $ = new NetworkState();
        }

        public Builder(NetworkState defaults) {
            $ = new NetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<List<NetworkAwArgs>> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(List<NetworkAwArgs> aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param aws (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(NetworkAwArgs... aws) {
            return aws(List.of(aws));
        }

        /**
         * @param azures (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder azures(@Nullable Output<List<NetworkAzureArgs>> azures) {
            $.azures = azures;
            return this;
        }

        /**
         * @param azures (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder azures(List<NetworkAzureArgs> azures) {
            return azures(Output.of(azures));
        }

        /**
         * @param azures (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder azures(NetworkAzureArgs... azures) {
            return azures(List.of(azures));
        }

        /**
         * @param cidr The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param cloud The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param connectionTypes The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectionTypes(@Nullable Output<List<String>> connectionTypes) {
            $.connectionTypes = connectionTypes;
            return this;
        }

        /**
         * @param connectionTypes The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectionTypes(List<String> connectionTypes) {
            return connectionTypes(Output.of(connectionTypes));
        }

        /**
         * @param connectionTypes The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectionTypes(String... connectionTypes) {
            return connectionTypes(List.of(connectionTypes));
        }

        /**
         * @param displayName The name of the Network.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Network.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dnsConfig Network DNS config. It applies only to the PRIVATELINK network connection type.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(@Nullable Output<NetworkDnsConfigArgs> dnsConfig) {
            $.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * @param dnsConfig Network DNS config. It applies only to the PRIVATELINK network connection type.
         * 
         * @return builder
         * 
         */
        public Builder dnsConfig(NetworkDnsConfigArgs dnsConfig) {
            return dnsConfig(Output.of(dnsConfig));
        }

        /**
         * @param dnsDomain (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
         * 
         * @return builder
         * 
         */
        public Builder dnsDomain(@Nullable Output<String> dnsDomain) {
            $.dnsDomain = dnsDomain;
            return this;
        }

        /**
         * @param dnsDomain (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
         * 
         * @return builder
         * 
         */
        public Builder dnsDomain(String dnsDomain) {
            return dnsDomain(Output.of(dnsDomain));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<NetworkEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(NetworkEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param gcps (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(@Nullable Output<List<NetworkGcpArgs>> gcps) {
            $.gcps = gcps;
            return this;
        }

        /**
         * @param gcps (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(List<NetworkGcpArgs> gcps) {
            return gcps(Output.of(gcps));
        }

        /**
         * @param gcps (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(NetworkGcpArgs... gcps) {
            return gcps(List.of(gcps));
        }

        /**
         * @param region The cloud provider region where the network exists.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud provider region where the network exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Network.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Network.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param zonalSubdomains (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder zonalSubdomains(@Nullable Output<Map<String,String>> zonalSubdomains) {
            $.zonalSubdomains = zonalSubdomains;
            return this;
        }

        /**
         * @param zonalSubdomains (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder zonalSubdomains(Map<String,String> zonalSubdomains) {
            return zonalSubdomains(Output.of(zonalSubdomains));
        }

        /**
         * @param zones The 3 availability zones for this network. They can optionally be specified for AWS networks
         * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
         * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
         * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones The 3 availability zones for this network. They can optionally be specified for AWS networks
         * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
         * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
         * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones The 3 availability zones for this network. They can optionally be specified for AWS networks
         * used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
         * networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
         * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public NetworkState build() {
            return $;
        }
    }

}
