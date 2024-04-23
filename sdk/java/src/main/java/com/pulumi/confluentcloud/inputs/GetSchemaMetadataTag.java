// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetSchemaMetadataTag extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaMetadataTag Empty = new GetSchemaMetadataTag();

    /**
     * (Required String) The setting name.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return (Required String) The setting name.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * (Required List of Strings) The list of tags.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return (Required List of Strings) The list of tags.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetSchemaMetadataTag() {}

    private GetSchemaMetadataTag(GetSchemaMetadataTag $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaMetadataTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaMetadataTag $;

        public Builder() {
            $ = new GetSchemaMetadataTag();
        }

        public Builder(GetSchemaMetadataTag defaults) {
            $ = new GetSchemaMetadataTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key (Required String) The setting name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param values (Required List of Strings) The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
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

        public GetSchemaMetadataTag build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetSchemaMetadataTag", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetSchemaMetadataTag", "values");
            }
            return $;
        }
    }

}
