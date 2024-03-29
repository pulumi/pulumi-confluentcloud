// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetByokKeyAw {
    /**
     * @return (Required String) The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    private String keyArn;
    /**
     * @return (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment combination.
     * 
     */
    private List<String> roles;

    private GetByokKeyAw() {}
    /**
     * @return (Required String) The Amazon Resource Name (ARN) of an AWS KMS key.
     * 
     */
    public String keyArn() {
        return this.keyArn;
    }
    /**
     * @return (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment combination.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetByokKeyAw defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyArn;
        private List<String> roles;
        public Builder() {}
        public Builder(GetByokKeyAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder keyArn(String keyArn) {
            if (keyArn == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAw", "keyArn");
            }
            this.keyArn = keyArn;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetByokKeyAw", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public GetByokKeyAw build() {
            final var _resultValue = new GetByokKeyAw();
            _resultValue.keyArn = keyArn;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}
