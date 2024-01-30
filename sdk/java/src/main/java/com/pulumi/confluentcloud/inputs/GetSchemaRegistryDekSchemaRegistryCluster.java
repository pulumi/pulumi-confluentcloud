// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryDekSchemaRegistryCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryDekSchemaRegistryCluster Empty = new GetSchemaRegistryDekSchemaRegistryCluster();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetSchemaRegistryDekSchemaRegistryCluster() {}

    private GetSchemaRegistryDekSchemaRegistryCluster(GetSchemaRegistryDekSchemaRegistryCluster $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryDekSchemaRegistryCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryDekSchemaRegistryCluster $;

        public Builder() {
            $ = new GetSchemaRegistryDekSchemaRegistryCluster();
        }

        public Builder(GetSchemaRegistryDekSchemaRegistryCluster defaults) {
            $ = new GetSchemaRegistryDekSchemaRegistryCluster(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetSchemaRegistryDekSchemaRegistryCluster build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryDekSchemaRegistryCluster", "id");
            }
            return $;
        }
    }

}
