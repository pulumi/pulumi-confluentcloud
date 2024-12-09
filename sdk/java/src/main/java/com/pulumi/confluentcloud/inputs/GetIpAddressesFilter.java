// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpAddressesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetIpAddressesFilter Empty = new GetIpAddressesFilter();

    /**
     * A list of address types to filter by. Accepted values are: `EGRESS`, `INGRESS`.
     * 
     */
    @Import(name="addressTypes")
    private @Nullable List<String> addressTypes;

    /**
     * @return A list of address types to filter by. Accepted values are: `EGRESS`, `INGRESS`.
     * 
     */
    public Optional<List<String>> addressTypes() {
        return Optional.ofNullable(this.addressTypes);
    }

    /**
     * A list of clouds to filter by. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    @Import(name="clouds")
    private @Nullable List<String> clouds;

    /**
     * @return A list of clouds to filter by. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     * 
     */
    public Optional<List<String>> clouds() {
        return Optional.ofNullable(this.clouds);
    }

    /**
     * A list of regions to filter by.
     * 
     */
    @Import(name="regions")
    private @Nullable List<String> regions;

    /**
     * @return A list of regions to filter by.
     * 
     */
    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
     * 
     */
    @Import(name="services")
    private @Nullable List<String> services;

    /**
     * @return A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
     * 
     */
    public Optional<List<String>> services() {
        return Optional.ofNullable(this.services);
    }

    private GetIpAddressesFilter() {}

    private GetIpAddressesFilter(GetIpAddressesFilter $) {
        this.addressTypes = $.addressTypes;
        this.clouds = $.clouds;
        this.regions = $.regions;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpAddressesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpAddressesFilter $;

        public Builder() {
            $ = new GetIpAddressesFilter();
        }

        public Builder(GetIpAddressesFilter defaults) {
            $ = new GetIpAddressesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressTypes A list of address types to filter by. Accepted values are: `EGRESS`, `INGRESS`.
         * 
         * @return builder
         * 
         */
        public Builder addressTypes(@Nullable List<String> addressTypes) {
            $.addressTypes = addressTypes;
            return this;
        }

        /**
         * @param addressTypes A list of address types to filter by. Accepted values are: `EGRESS`, `INGRESS`.
         * 
         * @return builder
         * 
         */
        public Builder addressTypes(String... addressTypes) {
            return addressTypes(List.of(addressTypes));
        }

        /**
         * @param clouds A list of clouds to filter by. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder clouds(@Nullable List<String> clouds) {
            $.clouds = clouds;
            return this;
        }

        /**
         * @param clouds A list of clouds to filter by. Accepted values are: `AWS`, `AZURE`, and `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder clouds(String... clouds) {
            return clouds(List.of(clouds));
        }

        /**
         * @param regions A list of regions to filter by.
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions A list of regions to filter by.
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param services A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable List<String> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        public GetIpAddressesFilter build() {
            return $;
        }
    }

}