// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.SchemaExporterDestinationSchemaRegistryClusterCredentials;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchemaExporterDestinationSchemaRegistryCluster {
    private SchemaExporterDestinationSchemaRegistryClusterCredentials credentials;
    /**
     * @return The REST endpoint of the destination Schema Registry cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    private String restEndpoint;

    private SchemaExporterDestinationSchemaRegistryCluster() {}
    public SchemaExporterDestinationSchemaRegistryClusterCredentials credentials() {
        return this.credentials;
    }
    /**
     * @return The REST endpoint of the destination Schema Registry cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public String restEndpoint() {
        return this.restEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaExporterDestinationSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SchemaExporterDestinationSchemaRegistryClusterCredentials credentials;
        private String restEndpoint;
        public Builder() {}
        public Builder(SchemaExporterDestinationSchemaRegistryCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.restEndpoint = defaults.restEndpoint;
        }

        @CustomType.Setter
        public Builder credentials(SchemaExporterDestinationSchemaRegistryClusterCredentials credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(String restEndpoint) {
            this.restEndpoint = Objects.requireNonNull(restEndpoint);
            return this;
        }
        public SchemaExporterDestinationSchemaRegistryCluster build() {
            final var o = new SchemaExporterDestinationSchemaRegistryCluster();
            o.credentials = credentials;
            o.restEndpoint = restEndpoint;
            return o;
        }
    }
}
