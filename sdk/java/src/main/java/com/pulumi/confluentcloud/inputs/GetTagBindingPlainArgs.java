// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetTagBindingCredentials;
import com.pulumi.confluentcloud.inputs.GetTagBindingSchemaRegistryCluster;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagBindingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagBindingPlainArgs Empty = new GetTagBindingPlainArgs();

    @Import(name="credentials")
    private @Nullable GetTagBindingCredentials credentials;

    public Optional<GetTagBindingCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     * 
     */
    @Import(name="entityName", required=true)
    private String entityName;

    /**
     * @return The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     * 
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * The entity type, for example, `sr_schema`.
     * 
     */
    @Import(name="entityType", required=true)
    private String entityType;

    /**
     * @return The entity type, for example, `sr_schema`.
     * 
     */
    public String entityType() {
        return this.entityType;
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
    private @Nullable GetTagBindingSchemaRegistryCluster schemaRegistryCluster;

    public Optional<GetTagBindingSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the tag to be applied, for example, `PII`.
     * 
     */
    @Import(name="tagName", required=true)
    private String tagName;

    /**
     * @return The name of the tag to be applied, for example, `PII`.
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    private GetTagBindingPlainArgs() {}

    private GetTagBindingPlainArgs(GetTagBindingPlainArgs $) {
        this.credentials = $.credentials;
        this.entityName = $.entityName;
        this.entityType = $.entityType;
        this.restEndpoint = $.restEndpoint;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagBindingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagBindingPlainArgs $;

        public Builder() {
            $ = new GetTagBindingPlainArgs();
        }

        public Builder(GetTagBindingPlainArgs defaults) {
            $ = new GetTagBindingPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable GetTagBindingCredentials credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param entityName The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
         * 
         * @return builder
         * 
         */
        public Builder entityName(String entityName) {
            $.entityName = entityName;
            return this;
        }

        /**
         * @param entityType The entity type, for example, `sr_schema`.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            $.entityType = entityType;
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

        public Builder schemaRegistryCluster(@Nullable GetTagBindingSchemaRegistryCluster schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        /**
         * @param tagName The name of the tag to be applied, for example, `PII`.
         * 
         * @return builder
         * 
         */
        public Builder tagName(String tagName) {
            $.tagName = tagName;
            return this;
        }

        public GetTagBindingPlainArgs build() {
            $.entityName = Objects.requireNonNull($.entityName, "expected parameter 'entityName' to be non-null");
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            $.tagName = Objects.requireNonNull($.tagName, "expected parameter 'tagName' to be non-null");
            return $;
        }
    }

}
