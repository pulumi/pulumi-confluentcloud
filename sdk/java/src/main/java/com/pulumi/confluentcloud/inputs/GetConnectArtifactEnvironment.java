// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectArtifactEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectArtifactEnvironment Empty = new GetConnectArtifactEnvironment();

    /**
     * The ID of the Environment that the Connect Artifact belongs to.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the Environment that the Connect Artifact belongs to.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetConnectArtifactEnvironment() {}

    private GetConnectArtifactEnvironment(GetConnectArtifactEnvironment $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectArtifactEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectArtifactEnvironment $;

        public Builder() {
            $ = new GetConnectArtifactEnvironment();
        }

        public Builder(GetConnectArtifactEnvironment defaults) {
            $ = new GetConnectArtifactEnvironment(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the Connect Artifact belongs to.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetConnectArtifactEnvironment build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetConnectArtifactEnvironment", "id");
            }
            return $;
        }
    }

}
