// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetKafkaClientQuotaEnvironment;
import com.pulumi.confluentcloud.outputs.GetKafkaClientQuotaKafkaCluster;
import com.pulumi.confluentcloud.outputs.GetKafkaClientQuotaThroughput;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKafkaClientQuotaResult {
    /**
     * @return (Required String) The description of the Kafka Client Quota.
     * - `throughput` (Required Configuration Block) supports the following:
     * 
     */
    private String description;
    /**
     * @return (Required String) The name of the Kafka Client Quota.
     * 
     */
    private String displayName;
    private List<GetKafkaClientQuotaEnvironment> environments;
    /**
     * @return (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     * 
     */
    private String id;
    private List<GetKafkaClientQuotaKafkaCluster> kafkaClusters;
    /**
     * @return (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;default&#34;, to represent the default quota for all users and service accounts.
     * - `kafka_cluster` (Required Configuration Block) supports the following:
     * 
     */
    private List<String> principals;
    private List<GetKafkaClientQuotaThroughput> throughputs;

    private GetKafkaClientQuotaResult() {}
    /**
     * @return (Required String) The description of the Kafka Client Quota.
     * - `throughput` (Required Configuration Block) supports the following:
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Required String) The name of the Kafka Client Quota.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public List<GetKafkaClientQuotaEnvironment> environments() {
        return this.environments;
    }
    /**
     * @return (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetKafkaClientQuotaKafkaCluster> kafkaClusters() {
        return this.kafkaClusters;
    }
    /**
     * @return (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, &#34;default&#34;, to represent the default quota for all users and service accounts.
     * - `kafka_cluster` (Required Configuration Block) supports the following:
     * 
     */
    public List<String> principals() {
        return this.principals;
    }
    public List<GetKafkaClientQuotaThroughput> throughputs() {
        return this.throughputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaClientQuotaResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String displayName;
        private List<GetKafkaClientQuotaEnvironment> environments;
        private String id;
        private List<GetKafkaClientQuotaKafkaCluster> kafkaClusters;
        private List<String> principals;
        private List<GetKafkaClientQuotaThroughput> throughputs;
        public Builder() {}
        public Builder(GetKafkaClientQuotaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environments = defaults.environments;
    	      this.id = defaults.id;
    	      this.kafkaClusters = defaults.kafkaClusters;
    	      this.principals = defaults.principals;
    	      this.throughputs = defaults.throughputs;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environments(List<GetKafkaClientQuotaEnvironment> environments) {
            this.environments = Objects.requireNonNull(environments);
            return this;
        }
        public Builder environments(GetKafkaClientQuotaEnvironment... environments) {
            return environments(List.of(environments));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kafkaClusters(List<GetKafkaClientQuotaKafkaCluster> kafkaClusters) {
            this.kafkaClusters = Objects.requireNonNull(kafkaClusters);
            return this;
        }
        public Builder kafkaClusters(GetKafkaClientQuotaKafkaCluster... kafkaClusters) {
            return kafkaClusters(List.of(kafkaClusters));
        }
        @CustomType.Setter
        public Builder principals(List<String> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }
        @CustomType.Setter
        public Builder throughputs(List<GetKafkaClientQuotaThroughput> throughputs) {
            this.throughputs = Objects.requireNonNull(throughputs);
            return this;
        }
        public Builder throughputs(GetKafkaClientQuotaThroughput... throughputs) {
            return throughputs(List.of(throughputs));
        }
        public GetKafkaClientQuotaResult build() {
            final var o = new GetKafkaClientQuotaResult();
            o.description = description;
            o.displayName = displayName;
            o.environments = environments;
            o.id = id;
            o.kafkaClusters = kafkaClusters;
            o.principals = principals;
            o.throughputs = throughputs;
            return o;
        }
    }
}
