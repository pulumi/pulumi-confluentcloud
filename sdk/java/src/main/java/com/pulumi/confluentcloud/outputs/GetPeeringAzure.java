// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPeeringAzure {
    /**
     * @return (Required String) The region of the Azure peer VNet.
     * 
     */
    private String customerRegion;
    /**
     * @return (Required String) The Tenant ID that represents an organization in Azure Active Directory. You can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    private String tenant;
    /**
     * @return (Required String) The resource (composite) ID of the peer Virtual Network that you&#39;re peering with Confluent Cloud, in the format `/subscriptions/&lt;Subscription ID&gt;/resourceGroups/&lt;Resource Group Name&gt;/providers/Microsoft.Network/virtualNetworks/&lt;VNet name&gt;`. You can find Subscription ID, Resource Group Name and your VNet name under **Virtual Networks &gt; Target VNet &gt; Essentials** section of your [Microsoft Azure Portal](https://portal.azure.com/).
     * 
     */
    private String vnet;

    private GetPeeringAzure() {}
    /**
     * @return (Required String) The region of the Azure peer VNet.
     * 
     */
    public String customerRegion() {
        return this.customerRegion;
    }
    /**
     * @return (Required String) The Tenant ID that represents an organization in Azure Active Directory. You can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    public String tenant() {
        return this.tenant;
    }
    /**
     * @return (Required String) The resource (composite) ID of the peer Virtual Network that you&#39;re peering with Confluent Cloud, in the format `/subscriptions/&lt;Subscription ID&gt;/resourceGroups/&lt;Resource Group Name&gt;/providers/Microsoft.Network/virtualNetworks/&lt;VNet name&gt;`. You can find Subscription ID, Resource Group Name and your VNet name under **Virtual Networks &gt; Target VNet &gt; Essentials** section of your [Microsoft Azure Portal](https://portal.azure.com/).
     * 
     */
    public String vnet() {
        return this.vnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customerRegion;
        private String tenant;
        private String vnet;
        public Builder() {}
        public Builder(GetPeeringAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerRegion = defaults.customerRegion;
    	      this.tenant = defaults.tenant;
    	      this.vnet = defaults.vnet;
        }

        @CustomType.Setter
        public Builder customerRegion(String customerRegion) {
            if (customerRegion == null) {
              throw new MissingRequiredPropertyException("GetPeeringAzure", "customerRegion");
            }
            this.customerRegion = customerRegion;
            return this;
        }
        @CustomType.Setter
        public Builder tenant(String tenant) {
            if (tenant == null) {
              throw new MissingRequiredPropertyException("GetPeeringAzure", "tenant");
            }
            this.tenant = tenant;
            return this;
        }
        @CustomType.Setter
        public Builder vnet(String vnet) {
            if (vnet == null) {
              throw new MissingRequiredPropertyException("GetPeeringAzure", "vnet");
            }
            this.vnet = vnet;
            return this;
        }
        public GetPeeringAzure build() {
            final var _resultValue = new GetPeeringAzure();
            _resultValue.customerRegion = customerRegion;
            _resultValue.tenant = tenant;
            _resultValue.vnet = vnet;
            return _resultValue;
        }
    }
}
