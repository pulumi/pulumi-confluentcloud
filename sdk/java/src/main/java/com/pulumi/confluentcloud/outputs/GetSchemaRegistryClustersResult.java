// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSchemaRegistryClustersCluster;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSchemaRegistryClustersResult {
    /**
     * @return (Required List of Object) List of Schema Registry clusters. Each Schema Registry cluster object exports the following attributes:
     * 
     */
    private List<GetSchemaRegistryClustersCluster> clusters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetSchemaRegistryClustersResult() {}
    /**
     * @return (Required List of Object) List of Schema Registry clusters. Each Schema Registry cluster object exports the following attributes:
     * 
     */
    public List<GetSchemaRegistryClustersCluster> clusters() {
        return this.clusters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryClustersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSchemaRegistryClustersCluster> clusters;
        private String id;
        public Builder() {}
        public Builder(GetSchemaRegistryClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusters = defaults.clusters;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder clusters(List<GetSchemaRegistryClustersCluster> clusters) {
            this.clusters = Objects.requireNonNull(clusters);
            return this;
        }
        public Builder clusters(GetSchemaRegistryClustersCluster... clusters) {
            return clusters(List.of(clusters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetSchemaRegistryClustersResult build() {
            final var _resultValue = new GetSchemaRegistryClustersResult();
            _resultValue.clusters = clusters;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
