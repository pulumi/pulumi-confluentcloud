// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetKafkaClusterDedicated extends com.pulumi.resources.InvokeArgs {

    public static final GetKafkaClusterDedicated Empty = new GetKafkaClusterDedicated();

    /**
     * (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    @Import(name="cku", required=true)
    private Integer cku;

    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    public Integer cku() {
        return this.cku;
    }

    /**
     * The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    @Import(name="encryptionKey", required=true)
    private String encryptionKey;

    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    @Import(name="zones", required=true)
    private List<String> zones;

    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public List<String> zones() {
        return this.zones;
    }

    private GetKafkaClusterDedicated() {}

    private GetKafkaClusterDedicated(GetKafkaClusterDedicated $) {
        this.cku = $.cku;
        this.encryptionKey = $.encryptionKey;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaClusterDedicated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaClusterDedicated $;

        public Builder() {
            $ = new GetKafkaClusterDedicated();
        }

        public Builder(GetKafkaClusterDedicated defaults) {
            $ = new GetKafkaClusterDedicated(Objects.requireNonNull(defaults));
        }

        /**
         * @param cku (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
         * 
         * @return builder
         * 
         */
        public Builder cku(Integer cku) {
            $.cku = cku;
            return this;
        }

        /**
         * @param encryptionKey The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public GetKafkaClusterDedicated build() {
            if ($.cku == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "cku");
            }
            if ($.encryptionKey == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "encryptionKey");
            }
            if ($.zones == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicated", "zones");
            }
            return $;
        }
    }

}
