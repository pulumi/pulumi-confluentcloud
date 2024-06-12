// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterFreightArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterFreightArgs Empty = new KafkaClusterFreightArgs();

    /**
     * (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return (Required List of String) The list of zones the cluster is in.
     * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private KafkaClusterFreightArgs() {}

    private KafkaClusterFreightArgs(KafkaClusterFreightArgs $) {
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterFreightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterFreightArgs $;

        public Builder() {
            $ = new KafkaClusterFreightArgs();
        }

        public Builder(KafkaClusterFreightArgs defaults) {
            $ = new KafkaClusterFreightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones (Required List of String) The list of zones the cluster is in.
         * - On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
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
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public KafkaClusterFreightArgs build() {
            return $;
        }
    }

}
