// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryRegionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryRegionArgs Empty = new GetSchemaRegistryRegionArgs();

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
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    @Import(name="package", required=true)
    private Output<String> package_;

    /**
     * @return The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     */
    public Output<String> package_() {
        return this.package_;
    }

    /**
     * The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetSchemaRegistryRegionArgs() {}

    private GetSchemaRegistryRegionArgs(GetSchemaRegistryRegionArgs $) {
        this.cloud = $.cloud;
        this.package_ = $.package_;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryRegionArgs $;

        public Builder() {
            $ = new GetSchemaRegistryRegionArgs();
        }

        public Builder(GetSchemaRegistryRegionArgs defaults) {
            $ = new GetSchemaRegistryRegionArgs(Objects.requireNonNull(defaults));
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
         * @param package_ The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
         * 
         * @return builder
         * 
         */
        public Builder package_(Output<String> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
         * 
         * @return builder
         * 
         */
        public Builder package_(String package_) {
            return package_(Output.of(package_));
        }

        /**
         * @param region The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetSchemaRegistryRegionArgs build() {
            $.cloud = Objects.requireNonNull($.cloud, "expected parameter 'cloud' to be non-null");
            $.package_ = Objects.requireNonNull($.package_, "expected parameter 'package' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
