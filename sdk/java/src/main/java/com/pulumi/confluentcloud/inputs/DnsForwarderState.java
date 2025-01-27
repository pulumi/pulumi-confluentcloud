// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.DnsForwarderEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.DnsForwarderForwardViaGcpDnsZonesArgs;
import com.pulumi.confluentcloud.inputs.DnsForwarderForwardViaIpArgs;
import com.pulumi.confluentcloud.inputs.DnsForwarderGatewayArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnsForwarderState extends com.pulumi.resources.ResourceArgs {

    public static final DnsForwarderState Empty = new DnsForwarderState();

    /**
     * The name of the DNS Forwarder.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the DNS Forwarder.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * List of domains for the DNS forwarder to use.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return List of domains for the DNS forwarder to use.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<DnsForwarderEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<DnsForwarderEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="forwardViaGcpDnsZones")
    private @Nullable Output<DnsForwarderForwardViaGcpDnsZonesArgs> forwardViaGcpDnsZones;

    public Optional<Output<DnsForwarderForwardViaGcpDnsZonesArgs>> forwardViaGcpDnsZones() {
        return Optional.ofNullable(this.forwardViaGcpDnsZones);
    }

    @Import(name="forwardViaIp")
    private @Nullable Output<DnsForwarderForwardViaIpArgs> forwardViaIp;

    public Optional<Output<DnsForwarderForwardViaIpArgs>> forwardViaIp() {
        return Optional.ofNullable(this.forwardViaIp);
    }

    @Import(name="gateway")
    private @Nullable Output<DnsForwarderGatewayArgs> gateway;

    public Optional<Output<DnsForwarderGatewayArgs>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    private DnsForwarderState() {}

    private DnsForwarderState(DnsForwarderState $) {
        this.displayName = $.displayName;
        this.domains = $.domains;
        this.environment = $.environment;
        this.forwardViaGcpDnsZones = $.forwardViaGcpDnsZones;
        this.forwardViaIp = $.forwardViaIp;
        this.gateway = $.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsForwarderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsForwarderState $;

        public Builder() {
            $ = new DnsForwarderState();
        }

        public Builder(DnsForwarderState defaults) {
            $ = new DnsForwarderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The name of the DNS Forwarder.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the DNS Forwarder.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param domains List of domains for the DNS forwarder to use.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains List of domains for the DNS forwarder to use.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains List of domains for the DNS forwarder to use.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<DnsForwarderEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(DnsForwarderEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder forwardViaGcpDnsZones(@Nullable Output<DnsForwarderForwardViaGcpDnsZonesArgs> forwardViaGcpDnsZones) {
            $.forwardViaGcpDnsZones = forwardViaGcpDnsZones;
            return this;
        }

        public Builder forwardViaGcpDnsZones(DnsForwarderForwardViaGcpDnsZonesArgs forwardViaGcpDnsZones) {
            return forwardViaGcpDnsZones(Output.of(forwardViaGcpDnsZones));
        }

        public Builder forwardViaIp(@Nullable Output<DnsForwarderForwardViaIpArgs> forwardViaIp) {
            $.forwardViaIp = forwardViaIp;
            return this;
        }

        public Builder forwardViaIp(DnsForwarderForwardViaIpArgs forwardViaIp) {
            return forwardViaIp(Output.of(forwardViaIp));
        }

        public Builder gateway(@Nullable Output<DnsForwarderGatewayArgs> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(DnsForwarderGatewayArgs gateway) {
            return gateway(Output.of(gateway));
        }

        public DnsForwarderState build() {
            return $;
        }
    }

}
