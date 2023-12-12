// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ByokKeyAws {
    /**
     * @return The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    private String keyArn;
    /**
     * @return (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
     * 
     */
    private @Nullable List<String> roles;

    private ByokKeyAws() {}
    /**
     * @return The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    public String keyArn() {
        return this.keyArn;
    }
    /**
     * @return (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
     * 
     */
    public List<String> roles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByokKeyAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyArn;
        private @Nullable List<String> roles;
        public Builder() {}
        public Builder(ByokKeyAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder keyArn(String keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<String> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public ByokKeyAws build() {
            final var _resultValue = new ByokKeyAws();
            _resultValue.keyArn = keyArn;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}
