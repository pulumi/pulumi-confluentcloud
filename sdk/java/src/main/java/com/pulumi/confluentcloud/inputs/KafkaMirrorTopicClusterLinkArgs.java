// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class KafkaMirrorTopicClusterLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaMirrorTopicClusterLinkArgs Empty = new KafkaMirrorTopicClusterLinkArgs();

    /**
     * The name of the cluster link to attach to the mirror topic, for example, `my-cluster-link`.
     * 
     */
    @Import(name="linkName", required=true)
    private Output<String> linkName;

    /**
     * @return The name of the cluster link to attach to the mirror topic, for example, `my-cluster-link`.
     * 
     */
    public Output<String> linkName() {
        return this.linkName;
    }

    private KafkaMirrorTopicClusterLinkArgs() {}

    private KafkaMirrorTopicClusterLinkArgs(KafkaMirrorTopicClusterLinkArgs $) {
        this.linkName = $.linkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaMirrorTopicClusterLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaMirrorTopicClusterLinkArgs $;

        public Builder() {
            $ = new KafkaMirrorTopicClusterLinkArgs();
        }

        public Builder(KafkaMirrorTopicClusterLinkArgs defaults) {
            $ = new KafkaMirrorTopicClusterLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkName The name of the cluster link to attach to the mirror topic, for example, `my-cluster-link`.
         * 
         * @return builder
         * 
         */
        public Builder linkName(Output<String> linkName) {
            $.linkName = linkName;
            return this;
        }

        /**
         * @param linkName The name of the cluster link to attach to the mirror topic, for example, `my-cluster-link`.
         * 
         * @return builder
         * 
         */
        public Builder linkName(String linkName) {
            return linkName(Output.of(linkName));
        }

        public KafkaMirrorTopicClusterLinkArgs build() {
            if ($.linkName == null) {
                throw new MissingRequiredPropertyException("KafkaMirrorTopicClusterLinkArgs", "linkName");
            }
            return $;
        }
    }

}
