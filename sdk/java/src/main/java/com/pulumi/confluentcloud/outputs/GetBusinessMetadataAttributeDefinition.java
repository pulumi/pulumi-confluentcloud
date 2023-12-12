// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBusinessMetadataAttributeDefinition {
    /**
     * @return (Optional String) The default value of this attribute.
     * 
     */
    private String defaultValue;
    /**
     * @return (Optional String) The description of this attribute.
     * 
     */
    private String description;
    /**
     * @return (Optional Boolean) An optional flag to control whether the attribute should be optional or required.
     * 
     */
    private Boolean isOptional;
    /**
     * @return The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    private String name;
    /**
     * @return (Optional Map) Block for the attribute options:
     * 
     */
    private Map<String,String> options;
    /**
     * @return (Required String) The type of the attribute, it always returns `string`.
     * 
     */
    private String type;

    private GetBusinessMetadataAttributeDefinition() {}
    /**
     * @return (Optional String) The default value of this attribute.
     * 
     */
    public String defaultValue() {
        return this.defaultValue;
    }
    /**
     * @return (Optional String) The description of this attribute.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Optional Boolean) An optional flag to control whether the attribute should be optional or required.
     * 
     */
    public Boolean isOptional() {
        return this.isOptional;
    }
    /**
     * @return The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional Map) Block for the attribute options:
     * 
     */
    public Map<String,String> options() {
        return this.options;
    }
    /**
     * @return (Required String) The type of the attribute, it always returns `string`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBusinessMetadataAttributeDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultValue;
        private String description;
        private Boolean isOptional;
        private String name;
        private Map<String,String> options;
        private String type;
        public Builder() {}
        public Builder(GetBusinessMetadataAttributeDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.isOptional = defaults.isOptional;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder isOptional(Boolean isOptional) {
            this.isOptional = Objects.requireNonNull(isOptional);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder options(Map<String,String> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBusinessMetadataAttributeDefinition build() {
            final var _resultValue = new GetBusinessMetadataAttributeDefinition();
            _resultValue.defaultValue = defaultValue;
            _resultValue.description = description;
            _resultValue.isOptional = isOptional;
            _resultValue.name = name;
            _resultValue.options = options;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
