// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KafkaClusterEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterEnvironmentArgs Empty = new KafkaClusterEnvironmentArgs();

    /**
     * The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private KafkaClusterEnvironmentArgs() {}

    private KafkaClusterEnvironmentArgs(KafkaClusterEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterEnvironmentArgs $;

        public Builder() {
            $ = new KafkaClusterEnvironmentArgs();
        }

        public Builder(KafkaClusterEnvironmentArgs defaults) {
            $ = new KafkaClusterEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public KafkaClusterEnvironmentArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
