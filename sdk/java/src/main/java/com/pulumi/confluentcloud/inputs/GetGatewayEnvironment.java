// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayEnvironment Empty = new GetGatewayEnvironment();

    /**
     * The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetGatewayEnvironment() {}

    private GetGatewayEnvironment(GetGatewayEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayEnvironment $;

        public Builder() {
            $ = new GetGatewayEnvironment();
        }

        public Builder(GetGatewayEnvironment defaults) {
            $ = new GetGatewayEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Gateway belongs to, for example, `env-123abc`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetGatewayEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetGatewayEnvironment", "id");
            }
            return $;
        }
    }

}
