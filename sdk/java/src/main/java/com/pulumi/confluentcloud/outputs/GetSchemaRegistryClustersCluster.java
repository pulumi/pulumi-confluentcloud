// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClustersClusterEnvironment;
import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClustersClusterRegion;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSchemaRegistryClustersCluster {
    /**
     * @return (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
     * 
     */
    private String apiVersion;
    /**
     * @return (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     * 
     */
    private String displayName;
    /**
     * @return (Required Object) exports the following attributes:
     * 
     */
    private GetSchemaRegistryClustersClusterEnvironment environment;
    /**
     * @return (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
     * 
     */
    private String id;
    /**
     * @return (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    private String kind;
    /**
     * @return (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    private String package_;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetSchemaRegistryClustersClusterRegion> regions;
    /**
     * @return (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    private String resourceName;
    /**
     * @return (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    private String restEndpoint;

    private GetSchemaRegistryClustersCluster() {}
    /**
     * @return (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required Object) exports the following attributes:
     * 
     */
    public GetSchemaRegistryClustersClusterEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    public String package_() {
        return this.package_;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetSchemaRegistryClustersClusterRegion> regions() {
        return this.regions;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    public String restEndpoint() {
        return this.restEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private String displayName;
        private GetSchemaRegistryClustersClusterEnvironment environment;
        private String id;
        private String kind;
        private String package_;
        private List<GetSchemaRegistryClustersClusterRegion> regions;
        private String resourceName;
        private String restEndpoint;
        public Builder() {}
        public Builder(GetSchemaRegistryClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.package_ = defaults.package_;
    	      this.regions = defaults.regions;
    	      this.resourceName = defaults.resourceName;
    	      this.restEndpoint = defaults.restEndpoint;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            if (apiVersion == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "apiVersion");
            }
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetSchemaRegistryClustersClusterEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter("package")
        public Builder package_(String package_) {
            if (package_ == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "package_");
            }
            this.package_ = package_;
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<GetSchemaRegistryClustersClusterRegion> regions) {
            if (regions == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "regions");
            }
            this.regions = regions;
            return this;
        }
        public Builder regions(GetSchemaRegistryClustersClusterRegion... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            if (resourceName == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "resourceName");
            }
            this.resourceName = resourceName;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(String restEndpoint) {
            if (restEndpoint == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryClustersCluster", "restEndpoint");
            }
            this.restEndpoint = restEndpoint;
            return this;
        }
        public GetSchemaRegistryClustersCluster build() {
            final var _resultValue = new GetSchemaRegistryClustersCluster();
            _resultValue.apiVersion = apiVersion;
            _resultValue.displayName = displayName;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.package_ = package_;
            _resultValue.regions = regions;
            _resultValue.resourceName = resourceName;
            _resultValue.restEndpoint = restEndpoint;
            return _resultValue;
        }
    }
}
