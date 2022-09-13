// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKafkaClusterDedicated {
    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
     * 
     */
    private Integer cku;
    /**
     * @return (Optional String) The ID of the encryption key that is used to encrypt the data in the Kafka cluster, for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` (key Amazon Resource Name) for AWS or `projects/my-test-project/locations/global/keyRings/test-byok/cryptoKeys/test` for GCP. Append required permissions to the key policy before creating a Kafka cluster, see [Encrypt Confluent Cloud Clusters using Self-Managed Keys](https://docs.confluent.io/cloud/current/clusters/byok/index.html) for more details. At the moment, self-managed encryption keys are only available for the Dedicated clusters on AWS or GCP.
     * 
     */
    private String encryptionKey;

    private GetKafkaClusterDedicated() {}
    /**
     * @return (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
     * 
     */
    public Integer cku() {
        return this.cku;
    }
    /**
     * @return (Optional String) The ID of the encryption key that is used to encrypt the data in the Kafka cluster, for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` (key Amazon Resource Name) for AWS or `projects/my-test-project/locations/global/keyRings/test-byok/cryptoKeys/test` for GCP. Append required permissions to the key policy before creating a Kafka cluster, see [Encrypt Confluent Cloud Clusters using Self-Managed Keys](https://docs.confluent.io/cloud/current/clusters/byok/index.html) for more details. At the moment, self-managed encryption keys are only available for the Dedicated clusters on AWS or GCP.
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
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
        public Builder() {}
        public Builder(GetKafkaClusterDedicated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cku = defaults.cku;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        @CustomType.Setter
        public Builder cku(Integer cku) {
            this.cku = Objects.requireNonNull(cku);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public GetKafkaClusterDedicated build() {
            final var o = new GetKafkaClusterDedicated();
            o.cku = cku;
            o.encryptionKey = encryptionKey;
            return o;
        }
    }
}
