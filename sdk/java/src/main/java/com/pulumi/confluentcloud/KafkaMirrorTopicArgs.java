// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicClusterLinkArgs;
import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicKafkaClusterArgs;
import com.pulumi.confluentcloud.inputs.KafkaMirrorTopicSourceKafkaTopicArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaMirrorTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaMirrorTopicArgs Empty = new KafkaMirrorTopicArgs();

    @Import(name="clusterLink", required=true)
    private Output<KafkaMirrorTopicClusterLinkArgs> clusterLink;

    public Output<KafkaMirrorTopicClusterLinkArgs> clusterLink() {
        return this.clusterLink;
    }

    @Import(name="kafkaCluster", required=true)
    private Output<KafkaMirrorTopicKafkaClusterArgs> kafkaCluster;

    public Output<KafkaMirrorTopicKafkaClusterArgs> kafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
     * 
     */
    @Import(name="mirrorTopicName")
    private @Nullable Output<String> mirrorTopicName;

    /**
     * @return The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
     * 
     */
    public Optional<Output<String>> mirrorTopicName() {
        return Optional.ofNullable(this.mirrorTopicName);
    }

    @Import(name="sourceKafkaTopic", required=true)
    private Output<KafkaMirrorTopicSourceKafkaTopicArgs> sourceKafkaTopic;

    public Output<KafkaMirrorTopicSourceKafkaTopicArgs> sourceKafkaTopic() {
        return this.sourceKafkaTopic;
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private KafkaMirrorTopicArgs() {}

    private KafkaMirrorTopicArgs(KafkaMirrorTopicArgs $) {
        this.clusterLink = $.clusterLink;
        this.kafkaCluster = $.kafkaCluster;
        this.mirrorTopicName = $.mirrorTopicName;
        this.sourceKafkaTopic = $.sourceKafkaTopic;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaMirrorTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaMirrorTopicArgs $;

        public Builder() {
            $ = new KafkaMirrorTopicArgs();
        }

        public Builder(KafkaMirrorTopicArgs defaults) {
            $ = new KafkaMirrorTopicArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterLink(Output<KafkaMirrorTopicClusterLinkArgs> clusterLink) {
            $.clusterLink = clusterLink;
            return this;
        }

        public Builder clusterLink(KafkaMirrorTopicClusterLinkArgs clusterLink) {
            return clusterLink(Output.of(clusterLink));
        }

        public Builder kafkaCluster(Output<KafkaMirrorTopicKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(KafkaMirrorTopicKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param mirrorTopicName The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder mirrorTopicName(@Nullable Output<String> mirrorTopicName) {
            $.mirrorTopicName = mirrorTopicName;
            return this;
        }

        /**
         * @param mirrorTopicName The name of the mirror topic. Only required when there is a prefix configured on the cluster link. For example, when `&lt;prefix&gt;` is configured for the cluster link, the mirror topic name has to be of the format `&lt;prefix&gt;&lt;source_topic_name&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder mirrorTopicName(String mirrorTopicName) {
            return mirrorTopicName(Output.of(mirrorTopicName));
        }

        public Builder sourceKafkaTopic(Output<KafkaMirrorTopicSourceKafkaTopicArgs> sourceKafkaTopic) {
            $.sourceKafkaTopic = sourceKafkaTopic;
            return this;
        }

        public Builder sourceKafkaTopic(KafkaMirrorTopicSourceKafkaTopicArgs sourceKafkaTopic) {
            return sourceKafkaTopic(Output.of(sourceKafkaTopic));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public KafkaMirrorTopicArgs build() {
            $.clusterLink = Objects.requireNonNull($.clusterLink, "expected parameter 'clusterLink' to be non-null");
            $.kafkaCluster = Objects.requireNonNull($.kafkaCluster, "expected parameter 'kafkaCluster' to be non-null");
            $.sourceKafkaTopic = Objects.requireNonNull($.sourceKafkaTopic, "expected parameter 'sourceKafkaTopic' to be non-null");
            return $;
        }
    }

}
