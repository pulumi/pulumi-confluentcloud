// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPrivateLinkAttachmentEnvironment;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkAttachmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAttachmentPlainArgs Empty = new GetPrivateLinkAttachmentPlainArgs();

    @Import(name="environment", required=true)
    private GetPrivateLinkAttachmentEnvironment environment;

    public GetPrivateLinkAttachmentEnvironment environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPrivateLinkAttachmentPlainArgs() {}

    private GetPrivateLinkAttachmentPlainArgs(GetPrivateLinkAttachmentPlainArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAttachmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAttachmentPlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkAttachmentPlainArgs();
        }

        public Builder(GetPrivateLinkAttachmentPlainArgs defaults) {
            $ = new GetPrivateLinkAttachmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(GetPrivateLinkAttachmentEnvironment environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPrivateLinkAttachmentPlainArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}