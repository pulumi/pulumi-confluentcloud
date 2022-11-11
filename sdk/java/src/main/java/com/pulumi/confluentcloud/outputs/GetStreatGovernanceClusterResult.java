// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetStreatGovernanceClusterEnvironment;
import com.pulumi.confluentcloud.outputs.GetStreatGovernanceClusterRegion;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStreatGovernanceClusterResult {
    /**
     * @return (Required String) An API Version of the schema version of the Stream Governance cluster, for example, `stream-governance/v2`.
     * 
     */
    private String apiVersion;
    /**
     * @return (Required String) The name of the Stream Governance cluster, for example, `Stream Governance Package`.
     * 
     */
    private String displayName;
    private GetStreatGovernanceClusterEnvironment environment;
    /**
     * @return (Required String) The HTTP endpoint of the Stream Governance cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    private String httpEndpoint;
    private String id;
    /**
     * @return (Required String) A kind of the Stream Governance cluster, for example, `Cluster`.
     * 
     */
    private String kind;
    /**
     * @return (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * - `region` (Required Configuration Block) supports the following:
     * 
     */
    private String package_;
    private List<GetStreatGovernanceClusterRegion> regions;
    /**
     * @return (Required String) The Confluent Resource Name of the Stream Governance cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    private String resourceName;

    private GetStreatGovernanceClusterResult() {}
    /**
     * @return (Required String) An API Version of the schema version of the Stream Governance cluster, for example, `stream-governance/v2`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return (Required String) The name of the Stream Governance cluster, for example, `Stream Governance Package`.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public GetStreatGovernanceClusterEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Required String) The HTTP endpoint of the Stream Governance cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) A kind of the Stream Governance cluster, for example, `Cluster`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * - `region` (Required Configuration Block) supports the following:
     * 
     */
    public String package_() {
        return this.package_;
    }
    public List<GetStreatGovernanceClusterRegion> regions() {
        return this.regions;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Stream Governance cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreatGovernanceClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private String displayName;
        private GetStreatGovernanceClusterEnvironment environment;
        private String httpEndpoint;
        private String id;
        private String kind;
        private String package_;
        private List<GetStreatGovernanceClusterRegion> regions;
        private String resourceName;
        public Builder() {}
        public Builder(GetStreatGovernanceClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.package_ = defaults.package_;
    	      this.regions = defaults.regions;
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetStreatGovernanceClusterEnvironment environment) {
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
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter("package")
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<GetStreatGovernanceClusterRegion> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(GetStreatGovernanceClusterRegion... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetStreatGovernanceClusterResult build() {
            final var o = new GetStreatGovernanceClusterResult();
            o.apiVersion = apiVersion;
            o.displayName = displayName;
            o.environment = environment;
            o.httpEndpoint = httpEndpoint;
            o.id = id;
            o.kind = kind;
            o.package_ = package_;
            o.regions = regions;
            o.resourceName = resourceName;
            return o;
        }
    }
}
