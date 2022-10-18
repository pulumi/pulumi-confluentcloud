// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.ClusterLinkDestinationKafkaClusterArgs;
import com.pulumi.confluentcloud.inputs.ClusterLinkSourceKafkaClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLinkArgs Empty = new ClusterLinkArgs();

    /**
     * The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
     * 
     */
    @Import(name="connectionMode")
    private @Nullable Output<String> connectionMode;

    /**
     * @return The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
     * 
     */
    public Optional<Output<String>> connectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }

    @Import(name="destinationKafkaCluster", required=true)
    private Output<ClusterLinkDestinationKafkaClusterArgs> destinationKafkaCluster;

    public Output<ClusterLinkDestinationKafkaClusterArgs> destinationKafkaCluster() {
        return this.destinationKafkaCluster;
    }

    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     * 
     */
    @Import(name="link")
    private @Nullable Output<String> link;

    /**
     * @return The name of the cluster link, for example, `my-cluster-link`.
     * 
     */
    public Optional<Output<String>> link() {
        return Optional.ofNullable(this.link);
    }

    /**
     * The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;` and `&#34;SOURCE&#34;`. Defaults to `&#34;DESTINATION&#34;`.
     * 
     */
    @Import(name="linkMode")
    private @Nullable Output<String> linkMode;

    /**
     * @return The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;` and `&#34;SOURCE&#34;`. Defaults to `&#34;DESTINATION&#34;`.
     * 
     */
    public Optional<Output<String>> linkMode() {
        return Optional.ofNullable(this.linkMode);
    }

    @Import(name="sourceKafkaCluster", required=true)
    private Output<ClusterLinkSourceKafkaClusterArgs> sourceKafkaCluster;

    public Output<ClusterLinkSourceKafkaClusterArgs> sourceKafkaCluster() {
        return this.sourceKafkaCluster;
    }

    private ClusterLinkArgs() {}

    private ClusterLinkArgs(ClusterLinkArgs $) {
        this.connectionMode = $.connectionMode;
        this.destinationKafkaCluster = $.destinationKafkaCluster;
        this.link = $.link;
        this.linkMode = $.linkMode;
        this.sourceKafkaCluster = $.sourceKafkaCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLinkArgs $;

        public Builder() {
            $ = new ClusterLinkArgs();
        }

        public Builder(ClusterLinkArgs defaults) {
            $ = new ClusterLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionMode The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder connectionMode(@Nullable Output<String> connectionMode) {
            $.connectionMode = connectionMode;
            return this;
        }

        /**
         * @param connectionMode The connection mode of the cluster link. The supported values are `&#34;INBOUND&#34;` and `&#34;OUTBOUND&#34;`. Defaults to `&#34;OUTBOUND&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder connectionMode(String connectionMode) {
            return connectionMode(Output.of(connectionMode));
        }

        public Builder destinationKafkaCluster(Output<ClusterLinkDestinationKafkaClusterArgs> destinationKafkaCluster) {
            $.destinationKafkaCluster = destinationKafkaCluster;
            return this;
        }

        public Builder destinationKafkaCluster(ClusterLinkDestinationKafkaClusterArgs destinationKafkaCluster) {
            return destinationKafkaCluster(Output.of(destinationKafkaCluster));
        }

        /**
         * @param link The name of the cluster link, for example, `my-cluster-link`.
         * 
         * @return builder
         * 
         */
        public Builder link(@Nullable Output<String> link) {
            $.link = link;
            return this;
        }

        /**
         * @param link The name of the cluster link, for example, `my-cluster-link`.
         * 
         * @return builder
         * 
         */
        public Builder link(String link) {
            return link(Output.of(link));
        }

        /**
         * @param linkMode The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;` and `&#34;SOURCE&#34;`. Defaults to `&#34;DESTINATION&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder linkMode(@Nullable Output<String> linkMode) {
            $.linkMode = linkMode;
            return this;
        }

        /**
         * @param linkMode The mode of the cluster link. The supported values are `&#34;DESTINATION&#34;` and `&#34;SOURCE&#34;`. Defaults to `&#34;DESTINATION&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder linkMode(String linkMode) {
            return linkMode(Output.of(linkMode));
        }

        public Builder sourceKafkaCluster(Output<ClusterLinkSourceKafkaClusterArgs> sourceKafkaCluster) {
            $.sourceKafkaCluster = sourceKafkaCluster;
            return this;
        }

        public Builder sourceKafkaCluster(ClusterLinkSourceKafkaClusterArgs sourceKafkaCluster) {
            return sourceKafkaCluster(Output.of(sourceKafkaCluster));
        }

        public ClusterLinkArgs build() {
            $.destinationKafkaCluster = Objects.requireNonNull($.destinationKafkaCluster, "expected parameter 'destinationKafkaCluster' to be non-null");
            $.sourceKafkaCluster = Objects.requireNonNull($.sourceKafkaCluster, "expected parameter 'sourceKafkaCluster' to be non-null");
            return $;
        }
    }

}
