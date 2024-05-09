// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaClusterDedicated {
    /**
     * @return The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     * &gt; **Note:** Exactly one from the `basic`, `standard`, `dedicated`, and `enterprise` configuration blocks must be specified.
     * 
     * !&gt; **Warning:** You can only upgrade clusters from `basic` to `standard`.
     * 
     * &gt; **Note:** Currently, provisioning of a Dedicated Kafka cluster takes around 25 minutes on average but might take up to 24 hours. If you can&#39;t wait for the `pulumi up` step to finish, you can exit it and import the cluster by using the `pulumi import` command once it has been provisioned. When the cluster is provisioned, you will receive an email notification, and you can also follow updates on the Target Environment web page of the Confluent Cloud website.
     * 
     */
    private Integer cku;
    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    private @Nullable String encryptionKey;
    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    private @Nullable List<String> zones;

    private KafkaClusterDedicated() {}
    /**
     * @return The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have `2` CKUs or more.
     * 
     * &gt; **Note:** Exactly one from the `basic`, `standard`, `dedicated`, and `enterprise` configuration blocks must be specified.
     * 
     * !&gt; **Warning:** You can only upgrade clusters from `basic` to `standard`.
     * 
     * &gt; **Note:** Currently, provisioning of a Dedicated Kafka cluster takes around 25 minutes on average but might take up to 24 hours. If you can&#39;t wait for the `pulumi up` step to finish, you can exit it and import the cluster by using the `pulumi import` command once it has been provisioned. When the cluster is provisioned, you will receive an email notification, and you can also follow updates on the Target Environment web page of the Confluent Cloud website.
     * 
     */
    public Integer cku() {
        return this.cku;
    }
    /**
     * @return The ID of the encryption key that is used to encrypt the data in the Kafka cluster.
     * 
     */
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaClusterDedicated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cku;
        private @Nullable String encryptionKey;
        private @Nullable List<String> zones;
        public Builder() {}
        public Builder(KafkaClusterDedicated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cku = defaults.cku;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder cku(Integer cku) {
            if (cku == null) {
              throw new MissingRequiredPropertyException("KafkaClusterDedicated", "cku");
            }
            this.cku = cku;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKey(@Nullable String encryptionKey) {

            this.encryptionKey = encryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder zones(@Nullable List<String> zones) {

            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public KafkaClusterDedicated build() {
            final var _resultValue = new KafkaClusterDedicated();
            _resultValue.cku = cku;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.zones = zones;
            return _resultValue;
        }
    }
}
