// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PrivateLinkAttachmentConnectionAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkAttachmentConnectionAwsArgs Empty = new PrivateLinkAttachmentConnectionAwsArgs();

    /**
     * ID of a VPC Endpoint that is connected to the VPC Endpoint service.
     * 
     */
    @Import(name="vpcEndpointId", required=true)
    private Output<String> vpcEndpointId;

    /**
     * @return ID of a VPC Endpoint that is connected to the VPC Endpoint service.
     * 
     */
    public Output<String> vpcEndpointId() {
        return this.vpcEndpointId;
    }

    private PrivateLinkAttachmentConnectionAwsArgs() {}

    private PrivateLinkAttachmentConnectionAwsArgs(PrivateLinkAttachmentConnectionAwsArgs $) {
        this.vpcEndpointId = $.vpcEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkAttachmentConnectionAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkAttachmentConnectionAwsArgs $;

        public Builder() {
            $ = new PrivateLinkAttachmentConnectionAwsArgs();
        }

        public Builder(PrivateLinkAttachmentConnectionAwsArgs defaults) {
            $ = new PrivateLinkAttachmentConnectionAwsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpcEndpointId ID of a VPC Endpoint that is connected to the VPC Endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(Output<String> vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * @param vpcEndpointId ID of a VPC Endpoint that is connected to the VPC Endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            return vpcEndpointId(Output.of(vpcEndpointId));
        }

        public PrivateLinkAttachmentConnectionAwsArgs build() {
            if ($.vpcEndpointId == null) {
                throw new MissingRequiredPropertyException("PrivateLinkAttachmentConnectionAwsArgs", "vpcEndpointId");
            }
            return $;
        }
    }

}
