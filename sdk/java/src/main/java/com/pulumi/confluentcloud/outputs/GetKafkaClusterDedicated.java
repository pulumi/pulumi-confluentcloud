// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKafkaClusterDedicated {
    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    private Integer cku;
    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    private String encryptionKey;
    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    private List<String> zones;

    private GetKafkaClusterDedicated() {}
    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    public Integer cku() {
        return this.cku;
    }
    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaClusterDedicated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cku;
        private String encryptionKey;
        private List<String> zones;
        public Builder() {}
        public Builder(GetKafkaClusterDedicated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cku = defaults.cku;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder cku(Integer cku) {
            if (cku == null) {
              throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "cku");
            }
            this.cku = cku;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKey(String encryptionKey) {
            if (encryptionKey == null) {
              throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "encryptionKey");
            }
            this.encryptionKey = encryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder zones(List<String> zones) {
            if (zones == null) {
              throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "zones");
            }
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public GetKafkaClusterDedicated build() {
            final var _resultValue = new GetKafkaClusterDedicated();
            _resultValue.cku = cku;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
