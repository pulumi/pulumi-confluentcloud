// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetTagCredentials;
import com.pulumi.confluentcloud.inputs.GetTagSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagPlainArgs Empty = new GetTagPlainArgs();

    @Import(name="credentials")
    private @Nullable GetTagCredentials credentials;

    public Optional<GetTagCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable String restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable GetTagSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetTagSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetTagPlainArgs() {}

    private GetTagPlainArgs(GetTagPlainArgs $) {
        this.credentials = $.credentials;
        this.name = $.name;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagPlainArgs $;

        public Builder() {
            $ = new GetTagPlainArgs();
        }

        public Builder(GetTagPlainArgs defaults) {
            $ = new GetTagPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetTagCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param name The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable String restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        public Builder schemaRegistryCluster(@Nullable GetTagSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public GetTagPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetTagPlainArgs", "name");
            }
            return $;
        }
    }

}