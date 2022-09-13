// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIdentityPoolIdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetIdentityPoolIdentityProviderArgs Empty = new GetIdentityPoolIdentityProviderArgs();

    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetIdentityPoolIdentityProviderArgs() {}

    private GetIdentityPoolIdentityProviderArgs(GetIdentityPoolIdentityProviderArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityPoolIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityPoolIdentityProviderArgs $;

        public Builder() {
            $ = new GetIdentityPoolIdentityProviderArgs();
        }

        public Builder(GetIdentityPoolIdentityProviderArgs defaults) {
            $ = new GetIdentityPoolIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetIdentityPoolIdentityProviderArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
