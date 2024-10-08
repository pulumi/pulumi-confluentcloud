// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointAzureEgressPrivateLinkEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointAzureEgressPrivateLinkEndpointArgs Empty = new AccessPointAzureEgressPrivateLinkEndpointArgs();

    /**
     * (Required List of Strings) Domains of the Private Endpoint (if any) based off FQDNs in Azure custom DNS configs, which are required in your private DNS setup, for example: `[&#34;dbname.database.windows.net&#34;, &#34;dbname-region.database.windows.net&#34;]`.
     * 
     */
    @Import(name="privateEndpointCustomDnsConfigDomains")
    private @Nullable Output<List<String>> privateEndpointCustomDnsConfigDomains;

    /**
     * @return (Required List of Strings) Domains of the Private Endpoint (if any) based off FQDNs in Azure custom DNS configs, which are required in your private DNS setup, for example: `[&#34;dbname.database.windows.net&#34;, &#34;dbname-region.database.windows.net&#34;]`.
     * 
     */
    public Optional<Output<List<String>>> privateEndpointCustomDnsConfigDomains() {
        return Optional.ofNullable(this.privateEndpointCustomDnsConfigDomains);
    }

    /**
     * (Required String) Domain of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    @Import(name="privateEndpointDomain")
    private @Nullable Output<String> privateEndpointDomain;

    /**
     * @return (Required String) Domain of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    public Optional<Output<String>> privateEndpointDomain() {
        return Optional.ofNullable(this.privateEndpointDomain);
    }

    /**
     * (Required String) IP address of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    @Import(name="privateEndpointIpAddress")
    private @Nullable Output<String> privateEndpointIpAddress;

    /**
     * @return (Required String) IP address of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    public Optional<Output<String>> privateEndpointIpAddress() {
        return Optional.ofNullable(this.privateEndpointIpAddress);
    }

    /**
     * (Required String) Resource ID of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    @Import(name="privateEndpointResourceId")
    private @Nullable Output<String> privateEndpointResourceId;

    /**
     * @return (Required String) Resource ID of the Private Endpoint (if any) that is connected to the Private Link service.
     * 
     */
    public Optional<Output<String>> privateEndpointResourceId() {
        return Optional.ofNullable(this.privateEndpointResourceId);
    }

    /**
     * Resource ID of the Azure Private Link service.
     * 
     */
    @Import(name="privateLinkServiceResourceId", required=true)
    private Output<String> privateLinkServiceResourceId;

    /**
     * @return Resource ID of the Azure Private Link service.
     * 
     */
    public Output<String> privateLinkServiceResourceId() {
        return this.privateLinkServiceResourceId;
    }

    /**
     * Name of the subresource for the Private Endpoint to connect to.
     * 
     */
    @Import(name="privateLinkSubresourceName")
    private @Nullable Output<String> privateLinkSubresourceName;

    /**
     * @return Name of the subresource for the Private Endpoint to connect to.
     * 
     */
    public Optional<Output<String>> privateLinkSubresourceName() {
        return Optional.ofNullable(this.privateLinkSubresourceName);
    }

    private AccessPointAzureEgressPrivateLinkEndpointArgs() {}

    private AccessPointAzureEgressPrivateLinkEndpointArgs(AccessPointAzureEgressPrivateLinkEndpointArgs $) {
        this.privateEndpointCustomDnsConfigDomains = $.privateEndpointCustomDnsConfigDomains;
        this.privateEndpointDomain = $.privateEndpointDomain;
        this.privateEndpointIpAddress = $.privateEndpointIpAddress;
        this.privateEndpointResourceId = $.privateEndpointResourceId;
        this.privateLinkServiceResourceId = $.privateLinkServiceResourceId;
        this.privateLinkSubresourceName = $.privateLinkSubresourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointAzureEgressPrivateLinkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointAzureEgressPrivateLinkEndpointArgs $;

        public Builder() {
            $ = new AccessPointAzureEgressPrivateLinkEndpointArgs();
        }

        public Builder(AccessPointAzureEgressPrivateLinkEndpointArgs defaults) {
            $ = new AccessPointAzureEgressPrivateLinkEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointCustomDnsConfigDomains (Required List of Strings) Domains of the Private Endpoint (if any) based off FQDNs in Azure custom DNS configs, which are required in your private DNS setup, for example: `[&#34;dbname.database.windows.net&#34;, &#34;dbname-region.database.windows.net&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointCustomDnsConfigDomains(@Nullable Output<List<String>> privateEndpointCustomDnsConfigDomains) {
            $.privateEndpointCustomDnsConfigDomains = privateEndpointCustomDnsConfigDomains;
            return this;
        }

        /**
         * @param privateEndpointCustomDnsConfigDomains (Required List of Strings) Domains of the Private Endpoint (if any) based off FQDNs in Azure custom DNS configs, which are required in your private DNS setup, for example: `[&#34;dbname.database.windows.net&#34;, &#34;dbname-region.database.windows.net&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointCustomDnsConfigDomains(List<String> privateEndpointCustomDnsConfigDomains) {
            return privateEndpointCustomDnsConfigDomains(Output.of(privateEndpointCustomDnsConfigDomains));
        }

        /**
         * @param privateEndpointCustomDnsConfigDomains (Required List of Strings) Domains of the Private Endpoint (if any) based off FQDNs in Azure custom DNS configs, which are required in your private DNS setup, for example: `[&#34;dbname.database.windows.net&#34;, &#34;dbname-region.database.windows.net&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointCustomDnsConfigDomains(String... privateEndpointCustomDnsConfigDomains) {
            return privateEndpointCustomDnsConfigDomains(List.of(privateEndpointCustomDnsConfigDomains));
        }

        /**
         * @param privateEndpointDomain (Required String) Domain of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointDomain(@Nullable Output<String> privateEndpointDomain) {
            $.privateEndpointDomain = privateEndpointDomain;
            return this;
        }

        /**
         * @param privateEndpointDomain (Required String) Domain of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointDomain(String privateEndpointDomain) {
            return privateEndpointDomain(Output.of(privateEndpointDomain));
        }

        /**
         * @param privateEndpointIpAddress (Required String) IP address of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(@Nullable Output<String> privateEndpointIpAddress) {
            $.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }

        /**
         * @param privateEndpointIpAddress (Required String) IP address of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            return privateEndpointIpAddress(Output.of(privateEndpointIpAddress));
        }

        /**
         * @param privateEndpointResourceId (Required String) Resource ID of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointResourceId(@Nullable Output<String> privateEndpointResourceId) {
            $.privateEndpointResourceId = privateEndpointResourceId;
            return this;
        }

        /**
         * @param privateEndpointResourceId (Required String) Resource ID of the Private Endpoint (if any) that is connected to the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointResourceId(String privateEndpointResourceId) {
            return privateEndpointResourceId(Output.of(privateEndpointResourceId));
        }

        /**
         * @param privateLinkServiceResourceId Resource ID of the Azure Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceResourceId(Output<String> privateLinkServiceResourceId) {
            $.privateLinkServiceResourceId = privateLinkServiceResourceId;
            return this;
        }

        /**
         * @param privateLinkServiceResourceId Resource ID of the Azure Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceResourceId(String privateLinkServiceResourceId) {
            return privateLinkServiceResourceId(Output.of(privateLinkServiceResourceId));
        }

        /**
         * @param privateLinkSubresourceName Name of the subresource for the Private Endpoint to connect to.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkSubresourceName(@Nullable Output<String> privateLinkSubresourceName) {
            $.privateLinkSubresourceName = privateLinkSubresourceName;
            return this;
        }

        /**
         * @param privateLinkSubresourceName Name of the subresource for the Private Endpoint to connect to.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkSubresourceName(String privateLinkSubresourceName) {
            return privateLinkSubresourceName(Output.of(privateLinkSubresourceName));
        }

        public AccessPointAzureEgressPrivateLinkEndpointArgs build() {
            if ($.privateLinkServiceResourceId == null) {
                throw new MissingRequiredPropertyException("AccessPointAzureEgressPrivateLinkEndpointArgs", "privateLinkServiceResourceId");
            }
            return $;
        }
    }

}
