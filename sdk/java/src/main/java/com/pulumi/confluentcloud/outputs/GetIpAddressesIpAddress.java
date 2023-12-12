// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpAddressesIpAddress {
    /**
     * @return (Required Integer) Whether the address is used for egress or ingress.
     * 
     */
    private String addressType;
    /**
     * @return (Required String) An API Version of the schema version of the IP Address, for example, `networking/v1`.
     * 
     */
    private String apiVersion;
    /**
     * @return (Required String) The cloud service provider in which the address exists.
     * 
     */
    private String cloud;
    /**
     * @return (Required String) The IP Address range.
     * 
     */
    private String ipPrefix;
    /**
     * @return (Required String) A kind of the Kafka cluster, for example, `IpAddress`.
     * 
     */
    private String kind;
    /**
     * @return (Required Integer) The region/location where the IP Address is in use.
     * 
     */
    private String region;
    /**
     * @return A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
     * 
     */
    private List<String> services;

    private GetIpAddressesIpAddress() {}
    /**
     * @return (Required Integer) Whether the address is used for egress or ingress.
     * 
     */
    public String addressType() {
        return this.addressType;
    }
    /**
     * @return (Required String) An API Version of the schema version of the IP Address, for example, `networking/v1`.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return (Required String) The cloud service provider in which the address exists.
     * 
     */
    public String cloud() {
        return this.cloud;
    }
    /**
     * @return (Required String) The IP Address range.
     * 
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }
    /**
     * @return (Required String) A kind of the Kafka cluster, for example, `IpAddress`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Required Integer) The region/location where the IP Address is in use.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return A list of services to filter by. Accepted values are: `CONNECT`, `KAFKA`.
     * 
     */
    public List<String> services() {
        return this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpAddressesIpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressType;
        private String apiVersion;
        private String cloud;
        private String ipPrefix;
        private String kind;
        private String region;
        private List<String> services;
        public Builder() {}
        public Builder(GetIpAddressesIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.cloud = defaults.cloud;
    	      this.ipPrefix = defaults.ipPrefix;
    	      this.kind = defaults.kind;
    	      this.region = defaults.region;
    	      this.services = defaults.services;
        }

        @CustomType.Setter
        public Builder addressType(String addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }
        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder cloud(String cloud) {
            this.cloud = Objects.requireNonNull(cloud);
            return this;
        }
        @CustomType.Setter
        public Builder ipPrefix(String ipPrefix) {
            this.ipPrefix = Objects.requireNonNull(ipPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder services(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        public GetIpAddressesIpAddress build() {
            final var _resultValue = new GetIpAddressesIpAddress();
            _resultValue.addressType = addressType;
            _resultValue.apiVersion = apiVersion;
            _resultValue.cloud = cloud;
            _resultValue.ipPrefix = ipPrefix;
            _resultValue.kind = kind;
            _resultValue.region = region;
            _resultValue.services = services;
            return _resultValue;
        }
    }
}
