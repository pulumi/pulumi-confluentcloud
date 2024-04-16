// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetGatewayEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    @Import(name="environment", required=true)
    private Output<GetGatewayEnvironmentArgs> environment;

    public Output<GetGatewayEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetGatewayArgs() {}

    private GetGatewayArgs(GetGatewayArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayArgs $;

        public Builder() {
            $ = new GetGatewayArgs();
        }

        public Builder(GetGatewayArgs defaults) {
            $ = new GetGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(Output<GetGatewayEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(GetGatewayEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param id The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetGatewayArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetGatewayArgs", "environment");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetGatewayArgs", "id");
            }
            return $;
        }
    }

}