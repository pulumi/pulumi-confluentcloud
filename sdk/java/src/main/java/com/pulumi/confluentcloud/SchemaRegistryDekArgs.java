// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.SchemaRegistryDekCredentialsArgs;
import com.pulumi.confluentcloud.inputs.SchemaRegistryDekSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaRegistryDekArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryDekArgs Empty = new SchemaRegistryDekArgs();

    @Import(name="algorithm")
    private @Nullable Output<String> algorithm;

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

    @Import(name="encryptedKeyMaterial")
    private @Nullable Output<String> encryptedKeyMaterial;

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

    @Import(name="kekName", required=true)
    private Output<String> kekName;

    public Output<String> kekName() {
        return this.kekName;
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example,
     * `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example,
     * `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
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

    @Import(name="subjectName", required=true)
    private Output<String> subjectName;

    public Output<String> subjectName() {
        return this.subjectName;
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private SchemaRegistryDekArgs() {}

    private SchemaRegistryDekArgs(SchemaRegistryDekArgs $) {
        this.algorithm = $.algorithm;
        this.credentials = $.credentials;
        this.encryptedKeyMaterial = $.encryptedKeyMaterial;
        this.hardDelete = $.hardDelete;
        this.kekName = $.kekName;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRegistryDekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRegistryDekArgs $;

        public Builder() {
            $ = new SchemaRegistryDekArgs();
        }

        public Builder(SchemaRegistryDekArgs defaults) {
            $ = new SchemaRegistryDekArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

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

        public Builder encryptedKeyMaterial(@Nullable Output<String> encryptedKeyMaterial) {
            $.encryptedKeyMaterial = encryptedKeyMaterial;
            return this;
        }

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

        public Builder kekName(Output<String> kekName) {
            $.kekName = kekName;
            return this;
        }

        public Builder kekName(String kekName) {
            return kekName(Output.of(kekName));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example,
         * `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example,
         * `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
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

        public Builder subjectName(Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public SchemaRegistryDekArgs build() {
            if ($.kekName == null) {
                throw new MissingRequiredPropertyException("SchemaRegistryDekArgs", "kekName");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("SchemaRegistryDekArgs", "subjectName");
            }
            return $;
        }
    }

}
