// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKsqlClusterCredentialIdentity {
    /**
     * @return The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    private String id;

    private GetKsqlClusterCredentialIdentity() {}
    /**
     * @return The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     * 
     * &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKsqlClusterCredentialIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetKsqlClusterCredentialIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetKsqlClusterCredentialIdentity build() {
            final var o = new GetKsqlClusterCredentialIdentity();
            o.id = id;
            return o;
        }
    }
}
