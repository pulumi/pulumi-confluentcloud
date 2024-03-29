// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryRegionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryRegionPlainArgs Empty = new GetSchemaRegistryRegionPlainArgs();

    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="cloud", required=true)
    private String cloud;

    /**
     * @return The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     * &gt; **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
     * 
     */
    @Import(name="package", required=true)
    private String package_;

    /**
     * @return The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
     * 
     * &gt; **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
     * 
     */
    public String package_() {
        return this.package_;
    }

    /**
     * The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     * 
     */
    public String region() {
        return this.region;
    }

    private GetSchemaRegistryRegionPlainArgs() {}

    private GetSchemaRegistryRegionPlainArgs(GetSchemaRegistryRegionPlainArgs $) {
        this.cloud = $.cloud;
        this.package_ = $.package_;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryRegionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryRegionPlainArgs $;

        public Builder() {
            $ = new GetSchemaRegistryRegionPlainArgs();
        }

        public Builder(GetSchemaRegistryRegionPlainArgs defaults) {
            $ = new GetSchemaRegistryRegionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloud The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param package_ The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
         * 
         * &gt; **Note:** See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to manually find a corresponding region ID based on desired cloud provider region and types of the billing package.
         * 
         * @return builder
         * 
         */
        public Builder package_(String package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param region The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetSchemaRegistryRegionPlainArgs build() {
            if ($.cloud == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryRegionPlainArgs", "cloud");
            }
            if ($.package_ == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryRegionPlainArgs", "package_");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryRegionPlainArgs", "region");
            }
            return $;
        }
    }

}
