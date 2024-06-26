// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetKafkaClusterDedicatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetKafkaClusterDedicatedArgs Empty = new GetKafkaClusterDedicatedArgs();

    /**
     * (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    @Import(name="cku", required=true)
    private Output<Integer> cku;

    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     */
    public Output<Integer> cku() {
        return this.cku;
    }

    /**
     * The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    @Import(name="encryptionKey", required=true)
    private Output<String> encryptionKey;

    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    public Output<String> encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    @Import(name="zones", required=true)
    private Output<List<String>> zones;

    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    private GetKafkaClusterDedicatedArgs() {}

    private GetKafkaClusterDedicatedArgs(GetKafkaClusterDedicatedArgs $) {
        this.cku = $.cku;
        this.encryptionKey = $.encryptionKey;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaClusterDedicatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaClusterDedicatedArgs $;

        public Builder() {
            $ = new GetKafkaClusterDedicatedArgs();
        }

        public Builder(GetKafkaClusterDedicatedArgs defaults) {
            $ = new GetKafkaClusterDedicatedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cku (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
         * 
         * @return builder
         * 
         */
        public Builder cku(Output<Integer> cku) {
            $.cku = cku;
            return this;
        }

        /**
         * @param cku (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
         * 
         * @return builder
         * 
         */
        public Builder cku(Integer cku) {
            return cku(Output.of(cku));
        }

        /**
         * @param encryptionKey The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * - On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
         * - On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public GetKafkaClusterDedicatedArgs build() {
            if ($.cku == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicatedArgs", "cku");
            }
            if ($.encryptionKey == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicatedArgs", "encryptionKey");
            }
            if ($.zones == null) {
                throw new MissingRequiredPropertyException("GetKafkaClusterDedicatedArgs", "zones");
            }
            return $;
        }
    }

}
