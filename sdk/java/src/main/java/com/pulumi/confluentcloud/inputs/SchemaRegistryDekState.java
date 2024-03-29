// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.SchemaRegistryDekCredentialsArgs;
import com.pulumi.confluentcloud.inputs.SchemaRegistryDekSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaRegistryDekState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryDekState Empty = new SchemaRegistryDekState();

    /**
     * Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<String> algorithm;

    /**
     * @return Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
     * 
     */
    public Optional<Output<String>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<SchemaRegistryDekCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<SchemaRegistryDekCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The encrypted key material for the DEK.
     * 
     */
    @Import(name="encryptedKeyMaterial")
    private @Nullable Output<String> encryptedKeyMaterial;

    /**
     * @return The encrypted key material for the DEK.
     * 
     */
    public Optional<Output<String>> encryptedKeyMaterial() {
        return Optional.ofNullable(this.encryptedKeyMaterial);
    }

    /**
     * Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
     * on destroy. Defaults to `false` (soft delete).
     * 
     */
    @Import(name="hardDelete")
    private @Nullable Output<Boolean> hardDelete;

    /**
     * @return Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
     * on destroy. Defaults to `false` (soft delete).
     * 
     */
    public Optional<Output<Boolean>> hardDelete() {
        return Optional.ofNullable(this.hardDelete);
    }

    /**
     * The name of the KEK used to encrypt this DEK.
     * 
     */
    @Import(name="kekName")
    private @Nullable Output<String> kekName;

    /**
     * @return The name of the KEK used to encrypt this DEK.
     * 
     */
    public Optional<Output<String>> kekName() {
        return Optional.ofNullable(this.kekName);
    }

    /**
     * (Optional String) The decrypted version of encrypted key material.
     * 
     */
    @Import(name="keyMaterial")
    private @Nullable Output<String> keyMaterial;

    /**
     * @return (Optional String) The decrypted version of encrypted key material.
     * 
     */
    public Optional<Output<String>> keyMaterial() {
        return Optional.ofNullable(this.keyMaterial);
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable Output<SchemaRegistryDekSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<SchemaRegistryDekSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The subject for this DEK.
     * 
     */
    @Import(name="subjectName")
    private @Nullable Output<String> subjectName;

    /**
     * @return The subject for this DEK.
     * 
     */
    public Optional<Output<String>> subjectName() {
        return Optional.ofNullable(this.subjectName);
    }

    /**
     * The version of this DEK. Defaults to `1`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of this DEK. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private SchemaRegistryDekState() {}

    private SchemaRegistryDekState(SchemaRegistryDekState $) {
        this.algorithm = $.algorithm;
        this.credentials = $.credentials;
        this.encryptedKeyMaterial = $.encryptedKeyMaterial;
        this.hardDelete = $.hardDelete;
        this.kekName = $.kekName;
        this.keyMaterial = $.keyMaterial;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRegistryDekState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRegistryDekState $;

        public Builder() {
            $ = new SchemaRegistryDekState();
        }

        public Builder(SchemaRegistryDekState defaults) {
            $ = new SchemaRegistryDekState(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm Accepted values are: `AES128_GCM`, `AES256_GCM`, and `AES256_SIV`. Defaults to `AES256_GCM`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<SchemaRegistryDekCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(SchemaRegistryDekCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param encryptedKeyMaterial The encrypted key material for the DEK.
         * 
         * @return builder
         * 
         */
        public Builder encryptedKeyMaterial(@Nullable Output<String> encryptedKeyMaterial) {
            $.encryptedKeyMaterial = encryptedKeyMaterial;
            return this;
        }

        /**
         * @param encryptedKeyMaterial The encrypted key material for the DEK.
         * 
         * @return builder
         * 
         */
        public Builder encryptedKeyMaterial(String encryptedKeyMaterial) {
            return encryptedKeyMaterial(Output.of(encryptedKeyMaterial));
        }

        /**
         * @param hardDelete Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
         * on destroy. Defaults to `false` (soft delete).
         * 
         * @return builder
         * 
         */
        public Builder hardDelete(@Nullable Output<Boolean> hardDelete) {
            $.hardDelete = hardDelete;
            return this;
        }

        /**
         * @param hardDelete Controls whether a dek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry dek
         * on destroy. Defaults to `false` (soft delete).
         * 
         * @return builder
         * 
         */
        public Builder hardDelete(Boolean hardDelete) {
            return hardDelete(Output.of(hardDelete));
        }

        /**
         * @param kekName The name of the KEK used to encrypt this DEK.
         * 
         * @return builder
         * 
         */
        public Builder kekName(@Nullable Output<String> kekName) {
            $.kekName = kekName;
            return this;
        }

        /**
         * @param kekName The name of the KEK used to encrypt this DEK.
         * 
         * @return builder
         * 
         */
        public Builder kekName(String kekName) {
            return kekName(Output.of(kekName));
        }

        /**
         * @param keyMaterial (Optional String) The decrypted version of encrypted key material.
         * 
         * @return builder
         * 
         */
        public Builder keyMaterial(@Nullable Output<String> keyMaterial) {
            $.keyMaterial = keyMaterial;
            return this;
        }

        /**
         * @param keyMaterial (Optional String) The decrypted version of encrypted key material.
         * 
         * @return builder
         * 
         */
        public Builder keyMaterial(String keyMaterial) {
            return keyMaterial(Output.of(keyMaterial));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public Builder schemaRegistryCluster(@Nullable Output<SchemaRegistryDekSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(SchemaRegistryDekSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        /**
         * @param subjectName The subject for this DEK.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(@Nullable Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param subjectName The subject for this DEK.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        /**
         * @param version The version of this DEK. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of this DEK. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public SchemaRegistryDekState build() {
            return $;
        }
    }

}
