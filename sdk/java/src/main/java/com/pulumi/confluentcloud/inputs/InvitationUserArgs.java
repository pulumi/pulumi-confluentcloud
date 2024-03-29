// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InvitationUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final InvitationUserArgs Empty = new InvitationUserArgs();

    /**
     * (Required String) The id of invitation creator.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return (Required String) The id of invitation creator.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private InvitationUserArgs() {}

    private InvitationUserArgs(InvitationUserArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InvitationUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InvitationUserArgs $;

        public Builder() {
            $ = new InvitationUserArgs();
        }

        public Builder(InvitationUserArgs defaults) {
            $ = new InvitationUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id (Required String) The id of invitation creator.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Required String) The id of invitation creator.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public InvitationUserArgs build() {
            return $;
        }
    }

}
