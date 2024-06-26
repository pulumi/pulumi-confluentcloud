// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayAttachmentEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayAttachmentEnvironmentArgs Empty = new TransitGatewayAttachmentEnvironmentArgs();

    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private TransitGatewayAttachmentEnvironmentArgs() {}

    private TransitGatewayAttachmentEnvironmentArgs(TransitGatewayAttachmentEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayAttachmentEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayAttachmentEnvironmentArgs $;

        public Builder() {
            $ = new TransitGatewayAttachmentEnvironmentArgs();
        }

        public Builder(TransitGatewayAttachmentEnvironmentArgs defaults) {
            $ = new TransitGatewayAttachmentEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public TransitGatewayAttachmentEnvironmentArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("TransitGatewayAttachmentEnvironmentArgs", "id");
            }
            return $;
        }
    }

}
