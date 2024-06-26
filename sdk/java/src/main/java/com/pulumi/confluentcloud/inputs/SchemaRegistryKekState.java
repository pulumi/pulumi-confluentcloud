// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.SchemaRegistryKekCredentialsArgs;
import com.pulumi.confluentcloud.inputs.SchemaRegistryKekSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaRegistryKekState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryKekState Empty = new SchemaRegistryKekState();

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<SchemaRegistryKekCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<SchemaRegistryKekCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The optional description for the KEK.
     * 
     */
    @Import(name="doc")
    private @Nullable Output<String> doc;

    /**
     * @return The optional description for the KEK.
     * 
     */
    public Optional<Output<String>> doc() {
        return Optional.ofNullable(this.doc);
    }

    /**
     * Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
     * on destroy. Defaults to `false` (soft delete).
     * 
     */
    @Import(name="hardDelete")
    private @Nullable Output<Boolean> hardDelete;

    /**
     * @return Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
     * on destroy. Defaults to `false` (soft delete).
     * 
     */
    public Optional<Output<Boolean>> hardDelete() {
        return Optional.ofNullable(this.hardDelete);
    }

    /**
     * The ID of the key from KMS.
     * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
     * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
     * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ID of the key from KMS.
     * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
     * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
     * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
     * 
     */
    @Import(name="kmsType")
    private @Nullable Output<String> kmsType;

    /**
     * @return The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
     * 
     */
    public Optional<Output<String>> kmsType() {
        return Optional.ofNullable(this.kmsType);
    }

    /**
     * The name for the KEK.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the KEK.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
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
    private @Nullable Output<SchemaRegistryKekSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<SchemaRegistryKekSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
     * 
     */
    @Import(name="shared")
    private @Nullable Output<Boolean> shared;

    /**
     * @return The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> shared() {
        return Optional.ofNullable(this.shared);
    }

    private SchemaRegistryKekState() {}

    private SchemaRegistryKekState(SchemaRegistryKekState $) {
        this.credentials = $.credentials;
        this.doc = $.doc;
        this.hardDelete = $.hardDelete;
        this.kmsKeyId = $.kmsKeyId;
        this.kmsType = $.kmsType;
        this.name = $.name;
        this.properties = $.properties;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.shared = $.shared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRegistryKekState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRegistryKekState $;

        public Builder() {
            $ = new SchemaRegistryKekState();
        }

        public Builder(SchemaRegistryKekState defaults) {
            $ = new SchemaRegistryKekState(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<SchemaRegistryKekCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(SchemaRegistryKekCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param doc The optional description for the KEK.
         * 
         * @return builder
         * 
         */
        public Builder doc(@Nullable Output<String> doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param doc The optional description for the KEK.
         * 
         * @return builder
         * 
         */
        public Builder doc(String doc) {
            return doc(Output.of(doc));
        }

        /**
         * @param hardDelete Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
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
         * @param hardDelete Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
         * on destroy. Defaults to `false` (soft delete).
         * 
         * @return builder
         * 
         */
        public Builder hardDelete(Boolean hardDelete) {
            return hardDelete(Output.of(hardDelete));
        }

        /**
         * @param kmsKeyId The ID of the key from KMS.
         * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
         * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
         * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ID of the key from KMS.
         * - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
         * - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
         * - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param kmsType The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
         * 
         * @return builder
         * 
         */
        public Builder kmsType(@Nullable Output<String> kmsType) {
            $.kmsType = kmsType;
            return this;
        }

        /**
         * @param kmsType The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
         * 
         * @return builder
         * 
         */
        public Builder kmsType(String kmsType) {
            return kmsType(Output.of(kmsType));
        }

        /**
         * @param name The name for the KEK.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the KEK.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
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

        public Builder schemaRegistryCluster(@Nullable Output<SchemaRegistryKekSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(SchemaRegistryKekSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        /**
         * @param shared The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder shared(@Nullable Output<Boolean> shared) {
            $.shared = shared;
            return this;
        }

        /**
         * @param shared The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder shared(Boolean shared) {
            return shared(Output.of(shared));
        }

        public SchemaRegistryKekState build() {
            return $;
        }
    }

}
