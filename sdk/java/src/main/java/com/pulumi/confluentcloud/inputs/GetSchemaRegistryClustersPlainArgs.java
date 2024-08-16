// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaRegistryClustersEnvironment;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRegistryClustersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryClustersPlainArgs Empty = new GetSchemaRegistryClustersPlainArgs();

    /**
     * (Required Object) exports the following attributes:
     * 
     */
    @Import(name="environment")
    private @Nullable GetSchemaRegistryClustersEnvironment environment;

    /**
     * @return (Required Object) exports the following attributes:
     * 
     */
    public Optional<GetSchemaRegistryClustersEnvironment> environment() {
        return Optional.ofNullable(this.environment);
    }

    private GetSchemaRegistryClustersPlainArgs() {}

    private GetSchemaRegistryClustersPlainArgs(GetSchemaRegistryClustersPlainArgs $) {
        this.environment = $.environment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryClustersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryClustersPlainArgs $;

        public Builder() {
            $ = new GetSchemaRegistryClustersPlainArgs();
        }

        public Builder(GetSchemaRegistryClustersPlainArgs defaults) {
            $ = new GetSchemaRegistryClustersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment (Required Object) exports the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable GetSchemaRegistryClustersEnvironment environment) {
            $.environment = environment;
            return this;
        }

        public GetSchemaRegistryClustersPlainArgs build() {
            return $;
        }
    }

}