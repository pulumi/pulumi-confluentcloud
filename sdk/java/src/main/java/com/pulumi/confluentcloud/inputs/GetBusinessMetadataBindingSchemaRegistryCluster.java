// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBusinessMetadataBindingSchemaRegistryCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessMetadataBindingSchemaRegistryCluster Empty = new GetBusinessMetadataBindingSchemaRegistryCluster();

    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetBusinessMetadataBindingSchemaRegistryCluster() {}

    private GetBusinessMetadataBindingSchemaRegistryCluster(GetBusinessMetadataBindingSchemaRegistryCluster $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessMetadataBindingSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessMetadataBindingSchemaRegistryCluster $;

        public Builder() {
            $ = new GetBusinessMetadataBindingSchemaRegistryCluster();
        }

        public Builder(GetBusinessMetadataBindingSchemaRegistryCluster defaults) {
            $ = new GetBusinessMetadataBindingSchemaRegistryCluster(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetBusinessMetadataBindingSchemaRegistryCluster build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
