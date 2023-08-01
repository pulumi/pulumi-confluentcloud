// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetKafkaClusterBasic;
import com.pulumi.confluentcloud.inputs.GetKafkaClusterDedicated;
import com.pulumi.confluentcloud.inputs.GetKafkaClusterEnterprise;
import com.pulumi.confluentcloud.inputs.GetKafkaClusterEnvironment;
import com.pulumi.confluentcloud.inputs.GetKafkaClusterStandard;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKafkaClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKafkaClusterPlainArgs Empty = new GetKafkaClusterPlainArgs();

    /**
     * (Optional Configuration Block) The configuration of the Basic Kafka cluster.
     * 
     */
    @Import(name="basics")
    private @Nullable List<GetKafkaClusterBasic> basics;

    /**
     * @return (Optional Configuration Block) The configuration of the Basic Kafka cluster.
     * 
     */
    public Optional<List<GetKafkaClusterBasic>> basics() {
        return Optional.ofNullable(this.basics);
    }

    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     * 
     */
    @Import(name="dedicated")
    private @Nullable GetKafkaClusterDedicated dedicated;

    /**
     * @return (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     * 
     */
    public Optional<GetKafkaClusterDedicated> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }

    /**
     * A human-readable name for the Kafka cluster.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A human-readable name for the Kafka cluster.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
     * 
     */
    @Import(name="enterprises")
    private @Nullable List<GetKafkaClusterEnterprise> enterprises;

    /**
     * @return (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
     * 
     */
    public Optional<List<GetKafkaClusterEnterprise>> enterprises() {
        return Optional.ofNullable(this.enterprises);
    }

    @Import(name="environment", required=true)
    private GetKafkaClusterEnvironment environment;

    public GetKafkaClusterEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * (Optional Configuration Block) The configuration of the Standard Kafka cluster.
     * 
     */
    @Import(name="standards")
    private @Nullable List<GetKafkaClusterStandard> standards;

    /**
     * @return (Optional Configuration Block) The configuration of the Standard Kafka cluster.
     * 
     */
    public Optional<List<GetKafkaClusterStandard>> standards() {
        return Optional.ofNullable(this.standards);
    }

    private GetKafkaClusterPlainArgs() {}

    private GetKafkaClusterPlainArgs(GetKafkaClusterPlainArgs $) {
        this.basics = $.basics;
        this.dedicated = $.dedicated;
        this.displayName = $.displayName;
        this.enterprises = $.enterprises;
        this.environment = $.environment;
        this.id = $.id;
        this.standards = $.standards;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKafkaClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKafkaClusterPlainArgs $;

        public Builder() {
            $ = new GetKafkaClusterPlainArgs();
        }

        public Builder(GetKafkaClusterPlainArgs defaults) {
            $ = new GetKafkaClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basics (Optional Configuration Block) The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basics(@Nullable List<GetKafkaClusterBasic> basics) {
            $.basics = basics;
            return this;
        }

        /**
         * @param basics (Optional Configuration Block) The configuration of the Basic Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder basics(GetKafkaClusterBasic... basics) {
            return basics(List.of(basics));
        }

        /**
         * @param dedicated (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
         * 
         * @return builder
         * 
         */
        public Builder dedicated(@Nullable GetKafkaClusterDedicated dedicated) {
            $.dedicated = dedicated;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param enterprises (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder enterprises(@Nullable List<GetKafkaClusterEnterprise> enterprises) {
            $.enterprises = enterprises;
            return this;
        }

        /**
         * @param enterprises (Optional Configuration Block) The configuration of the Enterprise Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder enterprises(GetKafkaClusterEnterprise... enterprises) {
            return enterprises(List.of(enterprises));
        }

        public Builder environment(GetKafkaClusterEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param standards (Optional Configuration Block) The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standards(@Nullable List<GetKafkaClusterStandard> standards) {
            $.standards = standards;
            return this;
        }

        /**
         * @param standards (Optional Configuration Block) The configuration of the Standard Kafka cluster.
         * 
         * @return builder
         * 
         */
        public Builder standards(GetKafkaClusterStandard... standards) {
            return standards(List.of(standards));
        }

        public GetKafkaClusterPlainArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            return $;
        }
    }

}
