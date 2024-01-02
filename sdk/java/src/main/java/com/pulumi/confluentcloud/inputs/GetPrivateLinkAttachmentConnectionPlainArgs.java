// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPrivateLinkAttachmentConnectionEnvironment;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkAttachmentConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAttachmentConnectionPlainArgs Empty = new GetPrivateLinkAttachmentConnectionPlainArgs();

    @Import(name="environment", required=true)
    private GetPrivateLinkAttachmentConnectionEnvironment environment;

    public GetPrivateLinkAttachmentConnectionEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPrivateLinkAttachmentConnectionPlainArgs() {}

    private GetPrivateLinkAttachmentConnectionPlainArgs(GetPrivateLinkAttachmentConnectionPlainArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAttachmentConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAttachmentConnectionPlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkAttachmentConnectionPlainArgs();
        }

        public Builder(GetPrivateLinkAttachmentConnectionPlainArgs defaults) {
            $ = new GetPrivateLinkAttachmentConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(GetPrivateLinkAttachmentConnectionEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPrivateLinkAttachmentConnectionPlainArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentConnectionPlainArgs", "environment");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentConnectionPlainArgs", "id");
            }
            return $;
        }
    }

}
