// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetBusinessMetadataBindingCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetBusinessMetadataBindingSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBusinessMetadataBindingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBusinessMetadataBindingArgs Empty = new GetBusinessMetadataBindingArgs();

    /**
     * The name of the Business Metadata to be applied, for example, `PII`.
     * 
     */
    @Import(name="businessMetadataName", required=true)
    private Output<String> businessMetadataName;

    /**
     * @return The name of the Business Metadata to be applied, for example, `PII`.
     * 
     */
    public Output<String> businessMetadataName() {
        return this.businessMetadataName;
    }

    @Import(name="credentials")
    private @Nullable Output<GetBusinessMetadataBindingCredentialsArgs> credentials;

    public Optional<Output<GetBusinessMetadataBindingCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     * 
     */
    @Import(name="entityName", required=true)
    private Output<String> entityName;

    /**
     * @return The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     * 
     */
    public Output<String> entityName() {
        return this.entityName;
    }

    /**
     * The entity type, for example, `sr_schema`.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<String> entityType;

    /**
     * @return The entity type, for example, `sr_schema`.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
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
    private @Nullable Output<GetBusinessMetadataBindingSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetBusinessMetadataBindingSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    private GetBusinessMetadataBindingArgs() {}

    private GetBusinessMetadataBindingArgs(GetBusinessMetadataBindingArgs $) {
        this.businessMetadataName = $.businessMetadataName;
        this.credentials = $.credentials;
        this.entityName = $.entityName;
        this.entityType = $.entityType;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBusinessMetadataBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBusinessMetadataBindingArgs $;

        public Builder() {
            $ = new GetBusinessMetadataBindingArgs();
        }

        public Builder(GetBusinessMetadataBindingArgs defaults) {
            $ = new GetBusinessMetadataBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param businessMetadataName The name of the Business Metadata to be applied, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder businessMetadataName(Output<String> businessMetadataName) {
            $.businessMetadataName = businessMetadataName;
            return this;
        }

        /**
         * @param businessMetadataName The name of the Business Metadata to be applied, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder businessMetadataName(String businessMetadataName) {
            return businessMetadataName(Output.of(businessMetadataName));
        }

        public Builder credentials(@Nullable Output<GetBusinessMetadataBindingCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetBusinessMetadataBindingCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param entityName The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
         * 
         * @return builder
         * 
         */
        public Builder entityName(Output<String> entityName) {
            $.entityName = entityName;
            return this;
        }

        /**
         * @param entityName The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
         * 
         * @return builder
         * 
         */
        public Builder entityName(String entityName) {
            return entityName(Output.of(entityName));
        }

        /**
         * @param entityType The entity type, for example, `sr_schema`.
         * 
         * @return builder
         * 
         */
        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType The entity type, for example, `sr_schema`.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
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

        public Builder schemaRegistryCluster(@Nullable Output<GetBusinessMetadataBindingSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetBusinessMetadataBindingSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        public GetBusinessMetadataBindingArgs build() {
            $.businessMetadataName = Objects.requireNonNull($.businessMetadataName, "expected parameter 'businessMetadataName' to be non-null");
            $.entityName = Objects.requireNonNull($.entityName, "expected parameter 'entityName' to be non-null");
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}
