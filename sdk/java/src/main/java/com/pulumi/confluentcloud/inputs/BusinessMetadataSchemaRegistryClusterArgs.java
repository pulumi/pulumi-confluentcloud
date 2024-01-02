// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BusinessMetadataSchemaRegistryClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessMetadataSchemaRegistryClusterArgs Empty = new BusinessMetadataSchemaRegistryClusterArgs();

    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private BusinessMetadataSchemaRegistryClusterArgs() {}

    private BusinessMetadataSchemaRegistryClusterArgs(BusinessMetadataSchemaRegistryClusterArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessMetadataSchemaRegistryClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessMetadataSchemaRegistryClusterArgs $;

        public Builder() {
            $ = new BusinessMetadataSchemaRegistryClusterArgs();
        }

        public Builder(BusinessMetadataSchemaRegistryClusterArgs defaults) {
            $ = new BusinessMetadataSchemaRegistryClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public BusinessMetadataSchemaRegistryClusterArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("BusinessMetadataSchemaRegistryClusterArgs", "id");
            }
            return $;
        }
    }

}
