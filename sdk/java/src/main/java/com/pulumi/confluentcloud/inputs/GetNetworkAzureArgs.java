// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetNetworkAzureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetNetworkAzureArgs Empty = new GetNetworkAzureArgs();

    /**
     * (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
     * 
     */
    @Import(name="privateLinkServiceAliases", required=true)
    private Output<Map<String,String>> privateLinkServiceAliases;

    /**
     * @return (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
     * 
     */
    public Output<Map<String,String>> privateLinkServiceAliases() {
        return this.privateLinkServiceAliases;
    }

    private GetNetworkAzureArgs() {}

    private GetNetworkAzureArgs(GetNetworkAzureArgs $) {
        this.privateLinkServiceAliases = $.privateLinkServiceAliases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAzureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAzureArgs $;

        public Builder() {
            $ = new GetNetworkAzureArgs();
        }

        public Builder(GetNetworkAzureArgs defaults) {
            $ = new GetNetworkAzureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateLinkServiceAliases (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceAliases(Output<Map<String,String>> privateLinkServiceAliases) {
            $.privateLinkServiceAliases = privateLinkServiceAliases;
            return this;
        }

        /**
         * @param privateLinkServiceAliases (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceAliases(Map<String,String> privateLinkServiceAliases) {
            return privateLinkServiceAliases(Output.of(privateLinkServiceAliases));
        }

        public GetNetworkAzureArgs build() {
            if ($.privateLinkServiceAliases == null) {
                throw new MissingRequiredPropertyException("GetNetworkAzureArgs", "privateLinkServiceAliases");
            }
            return $;
        }
    }

}
