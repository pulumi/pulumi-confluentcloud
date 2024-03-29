// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAzureArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAzureArgs Empty = new NetworkAzureArgs();

    /**
     * (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zone names, for example, `1` and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service), for example, `s-nk99e-privatelink-1.8c43dcd0-695c-1234-bc35-11fe6abb303a.centralus.azure.privatelinkservice`.
     * 
     */
    @Import(name="privateLinkServiceAliases")
    private @Nullable Output<Map<String,String>> privateLinkServiceAliases;

    /**
     * @return (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zone names, for example, `1` and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service), for example, `s-nk99e-privatelink-1.8c43dcd0-695c-1234-bc35-11fe6abb303a.centralus.azure.privatelinkservice`.
     * 
     */
    public Optional<Output<Map<String,String>>> privateLinkServiceAliases() {
        return Optional.ofNullable(this.privateLinkServiceAliases);
    }

    private NetworkAzureArgs() {}

    private NetworkAzureArgs(NetworkAzureArgs $) {
        this.privateLinkServiceAliases = $.privateLinkServiceAliases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAzureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAzureArgs $;

        public Builder() {
            $ = new NetworkAzureArgs();
        }

        public Builder(NetworkAzureArgs defaults) {
            $ = new NetworkAzureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateLinkServiceAliases (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zone names, for example, `1` and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service), for example, `s-nk99e-privatelink-1.8c43dcd0-695c-1234-bc35-11fe6abb303a.centralus.azure.privatelinkservice`.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceAliases(@Nullable Output<Map<String,String>> privateLinkServiceAliases) {
            $.privateLinkServiceAliases = privateLinkServiceAliases;
            return this;
        }

        /**
         * @param privateLinkServiceAliases (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zone names, for example, `1` and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service), for example, `s-nk99e-privatelink-1.8c43dcd0-695c-1234-bc35-11fe6abb303a.centralus.azure.privatelinkservice`.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceAliases(Map<String,String> privateLinkServiceAliases) {
            return privateLinkServiceAliases(Output.of(privateLinkServiceAliases));
        }

        public NetworkAzureArgs build() {
            return $;
        }
    }

}
