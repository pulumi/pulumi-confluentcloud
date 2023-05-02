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


public final class TfImporterState extends com.pulumi.resources.ResourceArgs {

    public static final TfImporterState Empty = new TfImporterState();

    /**
     * A list of resources names to export. Defaults to all exportable resources.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of resources names to export. Defaults to all exportable resources.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private TfImporterState() {}

    private TfImporterState(TfImporterState $) {
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TfImporterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TfImporterState $;

        public Builder() {
            $ = new TfImporterState();
        }

        public Builder(TfImporterState defaults) {
            $ = new TfImporterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resources A list of resources names to export. Defaults to all exportable resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of resources names to export. Defaults to all exportable resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of resources names to export. Defaults to all exportable resources.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public TfImporterState build() {
            return $;
        }
    }

}