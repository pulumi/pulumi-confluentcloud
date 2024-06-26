// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetDnsRecordEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDnsRecordArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsRecordArgs Empty = new GetDnsRecordArgs();

    @Import(name="environment", required=true)
    private Output<GetDnsRecordEnvironmentArgs> environment;

    public Output<GetDnsRecordEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The ID of the DNS Record, for example, `dnsrec-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the DNS Record, for example, `dnsrec-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetDnsRecordArgs() {}

    private GetDnsRecordArgs(GetDnsRecordArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsRecordArgs $;

        public Builder() {
            $ = new GetDnsRecordArgs();
        }

        public Builder(GetDnsRecordArgs defaults) {
            $ = new GetDnsRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(Output<GetDnsRecordEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(GetDnsRecordEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param id The ID of the DNS Record, for example, `dnsrec-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the DNS Record, for example, `dnsrec-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetDnsRecordArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetDnsRecordArgs", "environment");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDnsRecordArgs", "id");
            }
            return $;
        }
    }

}
