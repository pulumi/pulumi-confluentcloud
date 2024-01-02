// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFlinkRegionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlinkRegionArgs Empty = new GetFlinkRegionArgs();

    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="cloud", required=true)
    private Output<String> cloud;

    /**
     * @return The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }

    /**
     * The cloud service provider region, for example, `us-east-1`.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The cloud service provider region, for example, `us-east-1`.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetFlinkRegionArgs() {}

    private GetFlinkRegionArgs(GetFlinkRegionArgs $) {
        this.cloud = $.cloud;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlinkRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlinkRegionArgs $;

        public Builder() {
            $ = new GetFlinkRegionArgs();
        }

        public Builder(GetFlinkRegionArgs defaults) {
            $ = new GetFlinkRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloud The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param region The cloud service provider region, for example, `us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region, for example, `us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetFlinkRegionArgs build() {
            if ($.cloud == null) {
                throw new MissingRequiredPropertyException("GetFlinkRegionArgs", "cloud");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetFlinkRegionArgs", "region");
            }
            return $;
        }
    }

}
