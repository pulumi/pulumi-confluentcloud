// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SchemaRegistryClusterRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryClusterRegionArgs Empty = new SchemaRegistryClusterRegionArgs();

    /**
     * The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private SchemaRegistryClusterRegionArgs() {}

    private SchemaRegistryClusterRegionArgs(SchemaRegistryClusterRegionArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRegistryClusterRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRegistryClusterRegionArgs $;

        public Builder() {
            $ = new SchemaRegistryClusterRegionArgs();
        }

        public Builder(SchemaRegistryClusterRegionArgs defaults) {
            $ = new SchemaRegistryClusterRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public SchemaRegistryClusterRegionArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("SchemaRegistryClusterRegionArgs", "id");
            }
            return $;
        }
    }

}
