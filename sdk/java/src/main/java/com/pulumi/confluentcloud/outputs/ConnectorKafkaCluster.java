// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorKafkaCluster {
    /**
     * @return The ID of the Kafka cluster that the connector belongs to, for example, `lkc-abc123`.
     * 
     */
    private String id;

    private ConnectorKafkaCluster() {}
    /**
     * @return The ID of the Kafka cluster that the connector belongs to, for example, `lkc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(ConnectorKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ConnectorKafkaCluster", "id");
            }
            this.id = id;
            return this;
        }
        public ConnectorKafkaCluster build() {
            final var _resultValue = new ConnectorKafkaCluster();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}