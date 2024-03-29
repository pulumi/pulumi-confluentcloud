// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPeeringEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringEnvironment Empty = new GetPeeringEnvironment();

    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPeeringEnvironment() {}

    private GetPeeringEnvironment(GetPeeringEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringEnvironment $;

        public Builder() {
            $ = new GetPeeringEnvironment();
        }

        public Builder(GetPeeringEnvironment defaults) {
            $ = new GetPeeringEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPeeringEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPeeringEnvironment", "id");
            }
            return $;
        }
    }

}
