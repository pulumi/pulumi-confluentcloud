// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.KafkaClusterBasicArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterByokKeyArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterDedicatedArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterEnterpriseArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterFreightArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterNetworkArgs;
import com.pulumi.confluentcloud.inputs.KafkaClusterStandardArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterArgs Empty = new KafkaClusterArgs();

    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
     * 
     */
    @Import(name="availability", required=true)
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
    @Import(name="basic")
    private @Nullable Output<KafkaClusterBasicArgs> basic;

    /**
     * @return The configuration of the Basic Kafka cluster.
     * 
     */
    public Optional<Output<KafkaClusterBasicArgs>> basic() {
        return Optional.ofNullable(this.basic);
    }

    @Import(name="byokKey")
    private @Nullable Output<KafkaClusterByokKeyArgs> byokKey;

    public Optional<Output<KafkaClusterByokKeyArgs>> byokKey() {
        return Optional.ofNullable(this.byokKey);
    }

    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="cloud", required=true)
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
    @Import(name="dedicated")
    private @Nullable Output<KafkaClusterDedicatedArgs> dedicated;

    /**
     * @return (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     * 
     */
    public Optional<Output<KafkaClusterDedicatedArgs>> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }

    /**
     * The name of the Kafka cluster.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Kafka cluster.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The configuration of the Enterprise Kafka cluster.
     * 
     */
    @Import(name="enterprises")
    private @Nullable Output<List<KafkaClusterEnterpriseArgs>> enterprises;

    /**
     * @return The configuration of the Enterprise Kafka cluster.
     * 
     */
    public Optional<Output<List<KafkaClusterEnterpriseArgs>>> enterprises() {
        return Optional.ofNullable(this.enterprises);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment", required=true)
    private Output<KafkaClusterEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<KafkaClusterEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The configuration of the Freight Kafka cluster.
     * 
     */
    @Import(name="freights")
    private @Nullable Output<List<KafkaClusterFreightArgs>> freights;

    /**
     * @return The configuration of the Freight Kafka cluster.
     * 
     */
    public Optional<Output<List<KafkaClusterFreightArgs>>> freights() {
        return Optional.ofNullable(this.freights);
    }

    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Import(name="network")
    private @Nullable Output<KafkaClusterNetworkArgs> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Optional<Output<KafkaClusterNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The configuration of the Standard Kafka cluster.
     * 
     */
    @Import(name="standard")
    private @Nullable Output<KafkaClusterStandardArgs> standard;

    /**
     * @return The configuration of the Standard Kafka cluster.
     * 
     */
    public Optional<Output<KafkaClusterStandardArgs>> standard() {
        return Optional.ofNullable(this.standard);
    }

    private KafkaClusterArgs() {}

    private KafkaClusterArgs(KafkaClusterArgs $) {
        this.availability = $.availability;
        this.basic = $.basic;
        this.byokKey = $.byokKey;
        this.cloud = $.cloud;
        this.dedicated = $.dedicated;
        this.displayName = $.displayName;
        this.enterprises = $.enterprises;
        this.environment = $.environment;
        this.freights = $.freights;
        this.network = $.network;
        this.region = $.region;
        this.standard = $.standard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterArgs $;

        public Builder() {
            $ = new KafkaClusterArgs();
        }

        public Builder(KafkaClusterArgs defaults) {
            $ = new KafkaClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availability The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
         * 
         * @return builder
         * 
         */
        public Builder availability(Output<String> availability) {
            $.availability = availability;
            return this;
        }

        /**
         * @param availability The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
         * 
         * @return builder
         * 
         */
        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        /**
         * @param basic The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basic(@Nullable Output<KafkaClusterBasicArgs> basic) {
            $.basic = basic;
            return this;
        }

        /**
         * @param basic The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basic(KafkaClusterBasicArgs basic) {
            return basic(Output.of(basic));
        }

        public Builder byokKey(@Nullable Output<KafkaClusterByokKeyArgs> byokKey) {
            $.byokKey = byokKey;
            return this;
        }

        public Builder byokKey(KafkaClusterByokKeyArgs byokKey) {
            return byokKey(Output.of(byokKey));
        }

        /**
         * @param cloud The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param dedicated (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dedicated(@Nullable Output<KafkaClusterDedicatedArgs> dedicated) {
            $.dedicated = dedicated;
            return this;
        }

        /**
         * @param dedicated (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dedicated(KafkaClusterDedicatedArgs dedicated) {
            return dedicated(Output.of(dedicated));
        }

        /**
         * @param displayName The name of the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enterprises The configuration of the Enterprise Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder enterprises(@Nullable Output<List<KafkaClusterEnterpriseArgs>> enterprises) {
            $.enterprises = enterprises;
            return this;
        }

        /**
         * @param enterprises The configuration of the Enterprise Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder enterprises(List<KafkaClusterEnterpriseArgs> enterprises) {
            return enterprises(Output.of(enterprises));
        }

        /**
         * @param enterprises The configuration of the Enterprise Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder enterprises(KafkaClusterEnterpriseArgs... enterprises) {
            return enterprises(List.of(enterprises));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<KafkaClusterEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(KafkaClusterEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param freights The configuration of the Freight Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder freights(@Nullable Output<List<KafkaClusterFreightArgs>> freights) {
            $.freights = freights;
            return this;
        }

        /**
         * @param freights The configuration of the Freight Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder freights(List<KafkaClusterFreightArgs> freights) {
            return freights(Output.of(freights));
        }

        /**
         * @param freights The configuration of the Freight Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder freights(KafkaClusterFreightArgs... freights) {
            return freights(List.of(freights));
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<KafkaClusterNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
         * accounts.
         * 
         * @return builder
         * 
         */
        public Builder network(KafkaClusterNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param region The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param standard The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standard(@Nullable Output<KafkaClusterStandardArgs> standard) {
            $.standard = standard;
            return this;
        }

        /**
         * @param standard The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standard(KafkaClusterStandardArgs standard) {
            return standard(Output.of(standard));
        }

        public KafkaClusterArgs build() {
            if ($.availability == null) {
                throw new MissingRequiredPropertyException("KafkaClusterArgs", "availability");
            }
            if ($.cloud == null) {
                throw new MissingRequiredPropertyException("KafkaClusterArgs", "cloud");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("KafkaClusterArgs", "environment");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("KafkaClusterArgs", "region");
            }
            return $;
        }
    }

}
