// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetSchemaMetadataTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSchemaMetadataTagArgs Empty = new GetSchemaMetadataTagArgs();

    /**
     * (Required String) The setting name.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return (Required String) The setting name.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * (Required List of Strings) The list of tags.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return (Required List of Strings) The list of tags.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetSchemaMetadataTagArgs() {}

    private GetSchemaMetadataTagArgs(GetSchemaMetadataTagArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaMetadataTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaMetadataTagArgs $;

        public Builder() {
            $ = new GetSchemaMetadataTagArgs();
        }

        public Builder(GetSchemaMetadataTagArgs defaults) {
            $ = new GetSchemaMetadataTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key (Required String) The setting name.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Required String) The setting name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values (Required List of Strings) The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values (Required List of Strings) The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values (Required List of Strings) The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetSchemaMetadataTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetSchemaMetadataTagArgs", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetSchemaMetadataTagArgs", "values");
            }
            return $;
        }
    }

}
