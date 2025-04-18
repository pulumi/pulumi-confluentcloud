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


public final class DnsForwarderForwardViaGcpDnsZonesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsForwarderForwardViaGcpDnsZonesArgs Empty = new DnsForwarderForwardViaGcpDnsZonesArgs();

    /**
     * List of Maps which contains the domain to zone and project mapping.
     * 
     * &gt; **Note:** The `forward_via_gcp_zones` and `forward_via_ip` blocks are mutually exclusive, and one of them must be provided.
     * 
     * &gt; **Note:** The zone and project must be specified in the correct order, separated by a comma, to ensure accurate `domain_mappings`.
     * 
     */
    @Import(name="domainMappings")
    private @Nullable Output<Map<String,String>> domainMappings;

    /**
     * @return List of Maps which contains the domain to zone and project mapping.
     * 
     * &gt; **Note:** The `forward_via_gcp_zones` and `forward_via_ip` blocks are mutually exclusive, and one of them must be provided.
     * 
     * &gt; **Note:** The zone and project must be specified in the correct order, separated by a comma, to ensure accurate `domain_mappings`.
     * 
     */
    public Optional<Output<Map<String,String>>> domainMappings() {
        return Optional.ofNullable(this.domainMappings);
    }

    private DnsForwarderForwardViaGcpDnsZonesArgs() {}

    private DnsForwarderForwardViaGcpDnsZonesArgs(DnsForwarderForwardViaGcpDnsZonesArgs $) {
        this.domainMappings = $.domainMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsForwarderForwardViaGcpDnsZonesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsForwarderForwardViaGcpDnsZonesArgs $;

        public Builder() {
            $ = new DnsForwarderForwardViaGcpDnsZonesArgs();
        }

        public Builder(DnsForwarderForwardViaGcpDnsZonesArgs defaults) {
            $ = new DnsForwarderForwardViaGcpDnsZonesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainMappings List of Maps which contains the domain to zone and project mapping.
         * 
         * &gt; **Note:** The `forward_via_gcp_zones` and `forward_via_ip` blocks are mutually exclusive, and one of them must be provided.
         * 
         * &gt; **Note:** The zone and project must be specified in the correct order, separated by a comma, to ensure accurate `domain_mappings`.
         * 
         * @return builder
         * 
         */
        public Builder domainMappings(@Nullable Output<Map<String,String>> domainMappings) {
            $.domainMappings = domainMappings;
            return this;
        }

        /**
         * @param domainMappings List of Maps which contains the domain to zone and project mapping.
         * 
         * &gt; **Note:** The `forward_via_gcp_zones` and `forward_via_ip` blocks are mutually exclusive, and one of them must be provided.
         * 
         * &gt; **Note:** The zone and project must be specified in the correct order, separated by a comma, to ensure accurate `domain_mappings`.
         * 
         * @return builder
         * 
         */
        public Builder domainMappings(Map<String,String> domainMappings) {
            return domainMappings(Output.of(domainMappings));
        }

        public DnsForwarderForwardViaGcpDnsZonesArgs build() {
            return $;
        }
    }

}
