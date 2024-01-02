// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetInvitationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInvitationPlainArgs Empty = new GetInvitationPlainArgs();

    /**
     * The ID of the Invitation, for example, `i-zyw30`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Invitation, for example, `i-zyw30`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetInvitationPlainArgs() {}

    private GetInvitationPlainArgs(GetInvitationPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInvitationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInvitationPlainArgs $;

        public Builder() {
            $ = new GetInvitationPlainArgs();
        }

        public Builder(GetInvitationPlainArgs defaults) {
            $ = new GetInvitationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Invitation, for example, `i-zyw30`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetInvitationPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetInvitationPlainArgs", "id");
            }
            return $;
        }
    }

}
