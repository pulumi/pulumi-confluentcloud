// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetPrivateLinkAttachmentConnectionEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkAttachmentConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAttachmentConnectionArgs Empty = new GetPrivateLinkAttachmentConnectionArgs();

    @Import(name="environment", required=true)
    private Output<GetPrivateLinkAttachmentConnectionEnvironmentArgs> environment;

    public Output<GetPrivateLinkAttachmentConnectionEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetPrivateLinkAttachmentConnectionArgs() {}

    private GetPrivateLinkAttachmentConnectionArgs(GetPrivateLinkAttachmentConnectionArgs $) {
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAttachmentConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAttachmentConnectionArgs $;

        public Builder() {
            $ = new GetPrivateLinkAttachmentConnectionArgs();
        }

        public Builder(GetPrivateLinkAttachmentConnectionArgs defaults) {
            $ = new GetPrivateLinkAttachmentConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(Output<GetPrivateLinkAttachmentConnectionEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(GetPrivateLinkAttachmentConnectionEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param id The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetPrivateLinkAttachmentConnectionArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}