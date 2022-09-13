// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetKsqlClusterCredentialIdentity;
import com.pulumi.confluentcloud.outputs.GetKsqlClusterEnvironment;
import com.pulumi.confluentcloud.outputs.GetKsqlClusterKafkaCluster;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKsqlClusterResult {
    /**
     * @return (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
     * 
     */
    private String apiVersion;
    private List<GetKsqlClusterCredentialIdentity> credentialIdentities;
    /**
     * @return (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
     * - `use_detailed_processing_log` (Optional Boolean) Controls whether the row data should be included in the processing log topic.
     * 
     */
    private Integer csu;
    private String displayName;
    private GetKsqlClusterEnvironment environment;
    /**
     * @return (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
     * - `kafka_cluster` (Optional Configuration Block) supports the following:
     * 
     */
    private String httpEndpoint;
    /**
     * @return (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
     * 
     */
    private String id;
    private List<GetKsqlClusterKafkaCluster> kafkaClusters;
    /**
     * @return (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
     * 
     */
    private String kind;
    /**
     * @return (Required Integer) The amount of storage (in GB) provisioned to this cluster.
     * 
     */
    private Integer storage;
    /**
     * @return (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
     * 
     */
    private String topicPrefix;
    private Boolean useDetailedProcessingLog;

    private GetKsqlClusterResult() {}
    /**
     * @return (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    public List<GetKsqlClusterCredentialIdentity> credentialIdentities() {
        return this.credentialIdentities;
    }
    /**
     * @return (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
     * - `use_detailed_processing_log` (Optional Boolean) Controls whether the row data should be included in the processing log topic.
     * 
     */
    public Integer csu() {
        return this.csu;
    }
    public String displayName() {
        return this.displayName;
    }
    public GetKsqlClusterEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
     * - `kafka_cluster` (Optional Configuration Block) supports the following:
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * @return (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetKsqlClusterKafkaCluster> kafkaClusters() {
        return this.kafkaClusters;
    }
    /**
     * @return (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Required Integer) The amount of storage (in GB) provisioned to this cluster.
     * 
     */
    public Integer storage() {
        return this.storage;
    }
    /**
     * @return (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
     * 
     */
    public String topicPrefix() {
        return this.topicPrefix;
    }
    public Boolean useDetailedProcessingLog() {
        return this.useDetailedProcessingLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKsqlClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private List<GetKsqlClusterCredentialIdentity> credentialIdentities;
        private Integer csu;
        private String displayName;
        private GetKsqlClusterEnvironment environment;
        private String httpEndpoint;
        private String id;
        private List<GetKsqlClusterKafkaCluster> kafkaClusters;
        private String kind;
        private Integer storage;
        private String topicPrefix;
        private Boolean useDetailedProcessingLog;
        public Builder() {}
        public Builder(GetKsqlClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.credentialIdentities = defaults.credentialIdentities;
    	      this.csu = defaults.csu;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.id = defaults.id;
    	      this.kafkaClusters = defaults.kafkaClusters;
    	      this.kind = defaults.kind;
    	      this.storage = defaults.storage;
    	      this.topicPrefix = defaults.topicPrefix;
    	      this.useDetailedProcessingLog = defaults.useDetailedProcessingLog;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder credentialIdentities(List<GetKsqlClusterCredentialIdentity> credentialIdentities) {
            this.credentialIdentities = Objects.requireNonNull(credentialIdentities);
            return this;
        }
        public Builder credentialIdentities(GetKsqlClusterCredentialIdentity... credentialIdentities) {
            return credentialIdentities(List.of(credentialIdentities));
        }
        @CustomType.Setter
        public Builder csu(Integer csu) {
            this.csu = Objects.requireNonNull(csu);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetKsqlClusterEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(String httpEndpoint) {
            this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kafkaClusters(List<GetKsqlClusterKafkaCluster> kafkaClusters) {
            this.kafkaClusters = Objects.requireNonNull(kafkaClusters);
            return this;
        }
        public Builder kafkaClusters(GetKsqlClusterKafkaCluster... kafkaClusters) {
            return kafkaClusters(List.of(kafkaClusters));
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder storage(Integer storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }
        @CustomType.Setter
        public Builder topicPrefix(String topicPrefix) {
            this.topicPrefix = Objects.requireNonNull(topicPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder useDetailedProcessingLog(Boolean useDetailedProcessingLog) {
            this.useDetailedProcessingLog = Objects.requireNonNull(useDetailedProcessingLog);
            return this;
        }
        public GetKsqlClusterResult build() {
            final var o = new GetKsqlClusterResult();
            o.apiVersion = apiVersion;
            o.credentialIdentities = credentialIdentities;
            o.csu = csu;
            o.displayName = displayName;
            o.environment = environment;
            o.httpEndpoint = httpEndpoint;
            o.id = id;
            o.kafkaClusters = kafkaClusters;
            o.kind = kind;
            o.storage = storage;
            o.topicPrefix = topicPrefix;
            o.useDetailedProcessingLog = useDetailedProcessingLog;
            return o;
        }
    }
}
