// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetKsqlClusterEnvironmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKsqlClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKsqlClusterArgs Empty = new GetKsqlClusterArgs();

    /**
     * The name of the ksqlDB cluster.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the ksqlDB cluster.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="environment", required=true)
    private Output<GetKsqlClusterEnvironmentArgs> environment;

    public Output<GetKsqlClusterEnvironmentArgs> environment() {
        return this.environment;
    }

    /**
     * The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetKsqlClusterArgs() {}

    private GetKsqlClusterArgs(GetKsqlClusterArgs $) {
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKsqlClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKsqlClusterArgs $;

        public Builder() {
            $ = new GetKsqlClusterArgs();
        }

        public Builder(GetKsqlClusterArgs defaults) {
            $ = new GetKsqlClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The name of the ksqlDB cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the ksqlDB cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder environment(Output<GetKsqlClusterEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(GetKsqlClusterEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param id The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
         * 
         * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetKsqlClusterArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetKsqlClusterArgs", "environment");
            }
            return $;
        }
    }

}
