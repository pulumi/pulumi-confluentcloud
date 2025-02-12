// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ConnectorOffsetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorOffsetArgs Empty = new ConnectorOffsetArgs();

    /**
     * Block with offset information that supports different keys depending on the connector type. For sink connectors, use `kafka_offset`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys. Alternatively, use the [Manage custom offsets section](https://docs.confluent.io/cloud/current/connectors/cc-github-source.html#manage-custom-offsets) on the homepage of the target source connector.
     * 
     */
    @Import(name="offset", required=true)
    private Output<Map<String,String>> offset;

    /**
     * @return Block with offset information that supports different keys depending on the connector type. For sink connectors, use `kafka_offset`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys. Alternatively, use the [Manage custom offsets section](https://docs.confluent.io/cloud/current/connectors/cc-github-source.html#manage-custom-offsets) on the homepage of the target source connector.
     * 
     */
    public Output<Map<String,String>> offset() {
        return this.offset;
    }

    /**
     * Block with partition information that supports different keys depending on the connector type. For sink connectors, use `kafka_partition` and `kafka_topic`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys.
     * 
     */
    @Import(name="partition", required=true)
    private Output<Map<String,String>> partition;

    /**
     * @return Block with partition information that supports different keys depending on the connector type. For sink connectors, use `kafka_partition` and `kafka_topic`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys.
     * 
     */
    public Output<Map<String,String>> partition() {
        return this.partition;
    }

    private ConnectorOffsetArgs() {}

    private ConnectorOffsetArgs(ConnectorOffsetArgs $) {
        this.offset = $.offset;
        this.partition = $.partition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorOffsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorOffsetArgs $;

        public Builder() {
            $ = new ConnectorOffsetArgs();
        }

        public Builder(ConnectorOffsetArgs defaults) {
            $ = new ConnectorOffsetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offset Block with offset information that supports different keys depending on the connector type. For sink connectors, use `kafka_offset`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys. Alternatively, use the [Manage custom offsets section](https://docs.confluent.io/cloud/current/connectors/cc-github-source.html#manage-custom-offsets) on the homepage of the target source connector.
         * 
         * @return builder
         * 
         */
        public Builder offset(Output<Map<String,String>> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset Block with offset information that supports different keys depending on the connector type. For sink connectors, use `kafka_offset`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys. Alternatively, use the [Manage custom offsets section](https://docs.confluent.io/cloud/current/connectors/cc-github-source.html#manage-custom-offsets) on the homepage of the target source connector.
         * 
         * @return builder
         * 
         */
        public Builder offset(Map<String,String> offset) {
            return offset(Output.of(offset));
        }

        /**
         * @param partition Block with partition information that supports different keys depending on the connector type. For sink connectors, use `kafka_partition` and `kafka_topic`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys.
         * 
         * @return builder
         * 
         */
        public Builder partition(Output<Map<String,String>> partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param partition Block with partition information that supports different keys depending on the connector type. For sink connectors, use `kafka_partition` and `kafka_topic`. For source connectors, the applicable keys differ by kind—refer to the [Source connectors page](https://docs.confluent.io/cloud/current/connectors/offsets.html#source-connectors) for the full list of supported keys.
         * 
         * @return builder
         * 
         */
        public Builder partition(Map<String,String> partition) {
            return partition(Output.of(partition));
        }

        public ConnectorOffsetArgs build() {
            if ($.offset == null) {
                throw new MissingRequiredPropertyException("ConnectorOffsetArgs", "offset");
            }
            if ($.partition == null) {
                throw new MissingRequiredPropertyException("ConnectorOffsetArgs", "partition");
            }
            return $;
        }
    }

}
