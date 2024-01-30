// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemaRegistryKekCredentials {
    private String key;
    private String secret;

    private GetSchemaRegistryKekCredentials() {}
    public String key() {
        return this.key;
    }
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryKekCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String secret;
        public Builder() {}
        public Builder(GetSchemaRegistryKekCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekCredentials", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetSchemaRegistryKekCredentials", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetSchemaRegistryKekCredentials build() {
            final var _resultValue = new GetSchemaRegistryKekCredentials();
            _resultValue.key = key;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
