// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaMetadataTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaMetadataTagArgs Empty = new SchemaMetadataTagArgs();

    /**
     * The setting name.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The setting name.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The list of tags.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The list of tags.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SchemaMetadataTagArgs() {}

    private SchemaMetadataTagArgs(SchemaMetadataTagArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaMetadataTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaMetadataTagArgs $;

        public Builder() {
            $ = new SchemaMetadataTagArgs();
        }

        public Builder(SchemaMetadataTagArgs defaults) {
            $ = new SchemaMetadataTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The setting name.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The setting name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The list of tags.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SchemaMetadataTagArgs build() {
            return $;
        }
    }

}