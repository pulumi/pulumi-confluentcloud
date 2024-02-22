// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DnsForwarderEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsForwarderEnvironmentArgs Empty = new DnsForwarderEnvironmentArgs();

    /**
     * The ID of the gateway to which the DNS Forwarder belongs, for example, `gw-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the gateway to which the DNS Forwarder belongs, for example, `gw-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private DnsForwarderEnvironmentArgs() {}

    private DnsForwarderEnvironmentArgs(DnsForwarderEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsForwarderEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsForwarderEnvironmentArgs $;

        public Builder() {
            $ = new DnsForwarderEnvironmentArgs();
        }

        public Builder(DnsForwarderEnvironmentArgs defaults) {
            $ = new DnsForwarderEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the gateway to which the DNS Forwarder belongs, for example, `gw-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the gateway to which the DNS Forwarder belongs, for example, `gw-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public DnsForwarderEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("DnsForwarderEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
