// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaRegistryDekCredentials;
import com.pulumi.confluentcloud.inputs.GetSchemaRegistryDekSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRegistryDekPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryDekPlainArgs Empty = new GetSchemaRegistryDekPlainArgs();

    /**
     * Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    @Import(name="algorithm")
    private @Nullable String algorithm;

    /**
     * @return Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    @Import(name="credentials")
    private @Nullable GetSchemaRegistryDekCredentials credentials;

    public Optional<GetSchemaRegistryDekCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The name of the KEK used to encrypt this DEK.
     * 
     */
    @Import(name="kekName", required=true)
    private String kekName;

    /**
     * @return The name of the KEK used to encrypt this DEK.
     * 
     */
    public String kekName() {
        return this.kekName;
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
    private @Nullable GetSchemaRegistryDekSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetSchemaRegistryDekSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The subject for this DEK.
     * 
     */
    @Import(name="subjectName", required=true)
    private String subjectName;

    /**
     * @return The subject for this DEK.
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * The version of this DEK. Defaults to `1`.
     * 
     */
    @Import(name="version")
    private @Nullable Integer version;

    /**
     * @return The version of this DEK. Defaults to `1`.
     * 
     */
    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSchemaRegistryDekPlainArgs() {}

    private GetSchemaRegistryDekPlainArgs(GetSchemaRegistryDekPlainArgs $) {
        this.algorithm = $.algorithm;
        this.credentials = $.credentials;
        this.kekName = $.kekName;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRegistryDekPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRegistryDekPlainArgs $;

        public Builder() {
            $ = new GetSchemaRegistryDekPlainArgs();
        }

        public Builder(GetSchemaRegistryDekPlainArgs defaults) {
            $ = new GetSchemaRegistryDekPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder credentials(@Nullable GetSchemaRegistryDekCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param kekName The name of the KEK used to encrypt this DEK.
         * 
         * @return builder
         * 
         */
        public Builder kekName(String kekName) {
            $.kekName = kekName;
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

        public Builder schemaRegistryCluster(@Nullable GetSchemaRegistryDekSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        /**
         * @param subjectName The subject for this DEK.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param version The version of this DEK. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Integer version) {
            $.version = version;
            return this;
        }

        public GetSchemaRegistryDekPlainArgs build() {
            if ($.kekName == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryDekPlainArgs", "kekName");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSchemaRegistryDekPlainArgs", "subjectName");
            }
            return $;
        }
    }

}
