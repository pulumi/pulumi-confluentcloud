// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKsqlClusterEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetKsqlClusterEnvironmentArgs Empty = new GetKsqlClusterEnvironmentArgs();

    /**
     * The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetKsqlClusterEnvironmentArgs() {}

    private GetKsqlClusterEnvironmentArgs(GetKsqlClusterEnvironmentArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKsqlClusterEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKsqlClusterEnvironmentArgs $;

        public Builder() {
            $ = new GetKsqlClusterEnvironmentArgs();
        }

        public Builder(GetKsqlClusterEnvironmentArgs defaults) {
            $ = new GetKsqlClusterEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetKsqlClusterEnvironmentArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
