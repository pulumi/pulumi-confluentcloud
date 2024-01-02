// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetKsqlClusterCredentialIdentity;
import com.pulumi.confluentcloud.outputs.GetKsqlClusterEnvironment;
import com.pulumi.confluentcloud.outputs.GetKsqlClusterKafkaCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetKsqlClusterCredentialIdentity> credentialIdentities;
    /**
     * @return (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
     * 
     */
    private Integer csu;
    private String displayName;
    private GetKsqlClusterEnvironment environment;
    /**
     * @return (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
     * 
     */
    private String id;
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetKsqlClusterKafkaCluster> kafkaClusters;
    /**
     * @return (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
     * 
     */
    private String kind;
    /**
     * @return (Required String) The Confluent Resource Name of the ksqlDB cluster.
     * 
     */
    private String resourceName;
    /**
     * @return (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
     * 
     */
    private String restEndpoint;
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
    /**
     * @return (Optional Boolean) Controls whether the row data should be included in the processing log topic.
     * 
     */
    private Boolean useDetailedProcessingLog;

    private GetKsqlClusterResult() {}
    /**
     * @return (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetKsqlClusterCredentialIdentity> credentialIdentities() {
        return this.credentialIdentities;
    }
    /**
     * @return (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
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
     * @return (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
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
     * @return (Required String) The Confluent Resource Name of the ksqlDB cluster.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
     * 
     */
    public String restEndpoint() {
        return this.restEndpoint;
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
    /**
     * @return (Optional Boolean) Controls whether the row data should be included in the processing log topic.
     * 
     */
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
        private String id;
        private List<GetKsqlClusterKafkaCluster> kafkaClusters;
        private String kind;
        private String resourceName;
        private String restEndpoint;
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
    	      this.id = defaults.id;
    	      this.kafkaClusters = defaults.kafkaClusters;
    	      this.kind = defaults.kind;
    	      this.resourceName = defaults.resourceName;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.storage = defaults.storage;
    	      this.topicPrefix = defaults.topicPrefix;
    	      this.useDetailedProcessingLog = defaults.useDetailedProcessingLog;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            if (apiVersion == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "apiVersion");
            }
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder credentialIdentities(List<GetKsqlClusterCredentialIdentity> credentialIdentities) {
            if (credentialIdentities == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "credentialIdentities");
            }
            this.credentialIdentities = credentialIdentities;
            return this;
        }
        public Builder credentialIdentities(GetKsqlClusterCredentialIdentity... credentialIdentities) {
            return credentialIdentities(List.of(credentialIdentities));
        }
        @CustomType.Setter
        public Builder csu(Integer csu) {
            if (csu == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "csu");
            }
            this.csu = csu;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetKsqlClusterEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaClusters(List<GetKsqlClusterKafkaCluster> kafkaClusters) {
            if (kafkaClusters == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "kafkaClusters");
            }
            this.kafkaClusters = kafkaClusters;
            return this;
        }
        public Builder kafkaClusters(GetKsqlClusterKafkaCluster... kafkaClusters) {
            return kafkaClusters(List.of(kafkaClusters));
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            if (resourceName == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "resourceName");
            }
            this.resourceName = resourceName;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(String restEndpoint) {
            if (restEndpoint == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "restEndpoint");
            }
            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder storage(Integer storage) {
            if (storage == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "storage");
            }
            this.storage = storage;
            return this;
        }
        @CustomType.Setter
        public Builder topicPrefix(String topicPrefix) {
            if (topicPrefix == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "topicPrefix");
            }
            this.topicPrefix = topicPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder useDetailedProcessingLog(Boolean useDetailedProcessingLog) {
            if (useDetailedProcessingLog == null) {
              throw new MissingRequiredPropertyException("GetKsqlClusterResult", "useDetailedProcessingLog");
            }
            this.useDetailedProcessingLog = useDetailedProcessingLog;
            return this;
        }
        public GetKsqlClusterResult build() {
            final var _resultValue = new GetKsqlClusterResult();
            _resultValue.apiVersion = apiVersion;
            _resultValue.credentialIdentities = credentialIdentities;
            _resultValue.csu = csu;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.kafkaClusters = kafkaClusters;
            _resultValue.kind = kind;
            _resultValue.resourceName = resourceName;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.storage = storage;
            _resultValue.topicPrefix = topicPrefix;
            _resultValue.useDetailedProcessingLog = useDetailedProcessingLog;
            return _resultValue;
        }
    }
}
