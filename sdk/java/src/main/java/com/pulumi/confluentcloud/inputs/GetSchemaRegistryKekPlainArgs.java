// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaRegistryKekCredentials;
import com.pulumi.confluentcloud.inputs.GetSchemaRegistryKekSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRegistryKekPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryKekPlainArgs Empty = new GetSchemaRegistryKekPlainArgs();

    @Import(name="credentials")
    private @Nullable GetSchemaRegistryKekCredentials credentials;

    public Optional<GetSchemaRegistryKekCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="restEndpoint")
    private @Nullable String restEndpoint;

    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable GetSchemaRegistryKekSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetSchemaRegistryKekSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetSchemaRegistryKekPlainArgs() {}

    private GetSchemaRegistryKekPlainArgs(GetSchemaRegistryKekPlainArgs $) {
        this.credentials = $.credentials;
        this.name = $.name;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryKekPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryKekPlainArgs $;

        public Builder() {
            $ = new GetSchemaRegistryKekPlainArgs();
        }

        public Builder(GetSchemaRegistryKekPlainArgs defaults) {
            $ = new GetSchemaRegistryKekPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetSchemaRegistryKekCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder restEndpoint(@Nullable String restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        public Builder schemaRegistryCluster(@Nullable GetSchemaRegistryKekSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public GetSchemaRegistryKekPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryKekPlainArgs", "name");
            }
            return $;
        }
    }

}