// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetTagBindingCredentials;
import com.pulumi.confluentcloud.outputs.GetTagBindingSchemaRegistryCluster;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagBindingResult {
    private @Nullable GetTagBindingCredentials credentials;
    private String entityName;
    private String entityType;
    /**
     * @return (Required String) The ID of the Tag Binding, in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Tag Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
     * 
     */
    private String id;
    private @Nullable String restEndpoint;
    private @Nullable GetTagBindingSchemaRegistryCluster schemaRegistryCluster;
    private String tagName;

    private GetTagBindingResult() {}
    public Optional<GetTagBindingCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String entityName() {
        return this.entityName;
    }
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return (Required String) The ID of the Tag Binding, in the format `&lt;Schema Registry Cluster Id&gt;/&lt;Tag Name&gt;/&lt;Entity Name&gt;/&lt;Entity Type&gt;`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }
    public Optional<GetTagBindingSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagBindingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetTagBindingCredentials credentials;
        private String entityName;
        private String entityType;
        private String id;
        private @Nullable String restEndpoint;
        private @Nullable GetTagBindingSchemaRegistryCluster schemaRegistryCluster;
        private String tagName;
        public Builder() {}
        public Builder(GetTagBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.entityName = defaults.entityName;
    	      this.entityType = defaults.entityType;
    	      this.id = defaults.id;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.schemaRegistryCluster = defaults.schemaRegistryCluster;
    	      this.tagName = defaults.tagName;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable GetTagBindingCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder entityName(String entityName) {
            this.entityName = Objects.requireNonNull(entityName);
            return this;
        }
        @CustomType.Setter
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {
            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistryCluster(@Nullable GetTagBindingSchemaRegistryCluster schemaRegistryCluster) {
            this.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }
        @CustomType.Setter
        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        public GetTagBindingResult build() {
            final var o = new GetTagBindingResult();
            o.credentials = credentials;
            o.entityName = entityName;
            o.entityType = entityType;
            o.id = id;
            o.restEndpoint = restEndpoint;
            o.schemaRegistryCluster = schemaRegistryCluster;
            o.tagName = tagName;
            return o;
        }
    }
}