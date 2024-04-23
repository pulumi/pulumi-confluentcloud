// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetGatewayEnvironment;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayPlainArgs Empty = new GetGatewayPlainArgs();

    @Import(name="environment", required=true)
    private GetGatewayEnvironment environment;

    public GetGatewayEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Gateway, for example, `gw-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Gateway, for example, `gw-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetGatewayPlainArgs() {}

    private GetGatewayPlainArgs(GetGatewayPlainArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayPlainArgs $;

        public Builder() {
            $ = new GetGatewayPlainArgs();
        }

        public Builder(GetGatewayPlainArgs defaults) {
            $ = new GetGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(GetGatewayEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Gateway, for example, `gw-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetGatewayPlainArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetGatewayPlainArgs", "environment");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetGatewayPlainArgs", "id");
            }
            return $;
        }
    }

}
