// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayAttachmentEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayAttachmentEnvironment Empty = new GetTransitGatewayAttachmentEnvironment();

    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetTransitGatewayAttachmentEnvironment() {}

    private GetTransitGatewayAttachmentEnvironment(GetTransitGatewayAttachmentEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayAttachmentEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayAttachmentEnvironment $;

        public Builder() {
            $ = new GetTransitGatewayAttachmentEnvironment();
        }

        public Builder(GetTransitGatewayAttachmentEnvironment defaults) {
            $ = new GetTransitGatewayAttachmentEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
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

        public GetTransitGatewayAttachmentEnvironment build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
