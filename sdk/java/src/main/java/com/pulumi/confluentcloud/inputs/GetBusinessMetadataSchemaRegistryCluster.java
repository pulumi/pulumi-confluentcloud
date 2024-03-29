// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetBusinessMetadataSchemaRegistryCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessMetadataSchemaRegistryCluster Empty = new GetBusinessMetadataSchemaRegistryCluster();

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

    private GetBusinessMetadataSchemaRegistryCluster() {}

    private GetBusinessMetadataSchemaRegistryCluster(GetBusinessMetadataSchemaRegistryCluster $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessMetadataSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessMetadataSchemaRegistryCluster $;

        public Builder() {
            $ = new GetBusinessMetadataSchemaRegistryCluster();
        }

        public Builder(GetBusinessMetadataSchemaRegistryCluster defaults) {
            $ = new GetBusinessMetadataSchemaRegistryCluster(Objects.requireNonNull(defaults));
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

        public GetBusinessMetadataSchemaRegistryCluster build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetBusinessMetadataSchemaRegistryCluster", "id");
            }
            return $;
        }
    }

}
