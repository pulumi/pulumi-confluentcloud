// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.KafkaClientQuotaEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.KafkaClientQuotaKafkaClusterArgs;
import com.pulumi.confluentcloud.inputs.KafkaClientQuotaThroughputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClientQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClientQuotaArgs Empty = new KafkaClientQuotaArgs();

    /**
     * The description of the Kafka Client Quota.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Kafka Client Quota.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Kafka Client Quota.
     * 
     */
    @Import(name="displayName", required=true)
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
    @Import(name="environment", required=true)
    private Output<KafkaClientQuotaEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<KafkaClientQuotaEnvironmentArgs> environment() {
        return this.environment;
    }

    @Import(name="kafkaCluster", required=true)
    private Output<KafkaClientQuotaKafkaClusterArgs> kafkaCluster;

    public Output<KafkaClientQuotaKafkaClusterArgs> kafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;&lt;default&gt;&#34;, to represent the default quota for all users and service accounts.
     * 
     */
    @Import(name="principals", required=true)
    private Output<List<String>> principals;

    /**
     * @return The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;&lt;default&gt;&#34;, to represent the default quota for all users and service accounts.
     * 
     */
    public Output<List<String>> principals() {
        return this.principals;
    }

    /**
     * Block for representing a Kafka Quota.
     * 
     */
    @Import(name="throughput", required=true)
    private Output<KafkaClientQuotaThroughputArgs> throughput;

    /**
     * @return Block for representing a Kafka Quota.
     * 
     */
    public Output<KafkaClientQuotaThroughputArgs> throughput() {
        return this.throughput;
    }

    private KafkaClientQuotaArgs() {}

    private KafkaClientQuotaArgs(KafkaClientQuotaArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.kafkaCluster = $.kafkaCluster;
        this.principals = $.principals;
        this.throughput = $.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClientQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClientQuotaArgs $;

        public Builder() {
            $ = new KafkaClientQuotaArgs();
        }

        public Builder(KafkaClientQuotaArgs defaults) {
            $ = new KafkaClientQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Kafka Client Quota.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Kafka Client Quota.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the Kafka Client Quota.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Kafka Client Quota.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<KafkaClientQuotaEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(KafkaClientQuotaEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder kafkaCluster(Output<KafkaClientQuotaKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(KafkaClientQuotaKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param principals The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;&lt;default&gt;&#34;, to represent the default quota for all users and service accounts.
         * 
         * @return builder
         * 
         */
        public Builder principals(Output<List<String>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;&lt;default&gt;&#34;, to represent the default quota for all users and service accounts.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<String> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;&lt;default&gt;&#34;, to represent the default quota for all users and service accounts.
         * 
         * @return builder
         * 
         */
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param throughput Block for representing a Kafka Quota.
         * 
         * @return builder
         * 
         */
        public Builder throughput(Output<KafkaClientQuotaThroughputArgs> throughput) {
            $.throughput = throughput;
            return this;
        }

        /**
         * @param throughput Block for representing a Kafka Quota.
         * 
         * @return builder
         * 
         */
        public Builder throughput(KafkaClientQuotaThroughputArgs throughput) {
            return throughput(Output.of(throughput));
        }

        public KafkaClientQuotaArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.kafkaCluster = Objects.requireNonNull($.kafkaCluster, "expected parameter 'kafkaCluster' to be non-null");
            $.principals = Objects.requireNonNull($.principals, "expected parameter 'principals' to be non-null");
            $.throughput = Objects.requireNonNull($.throughput, "expected parameter 'throughput' to be non-null");
            return $;
        }
    }

}
