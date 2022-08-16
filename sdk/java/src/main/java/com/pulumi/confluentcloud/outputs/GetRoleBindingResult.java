// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRoleBindingResult {
    /**
     * @return (Required String) A [Confluent Resource Name(CRN)](&lt;https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)&gt;) that specifies the scope and resource patterns necessary for the role to bind.
     * 
     */
    private final String crnPattern;
    private final String id;
    /**
     * @return (Required String) A principal User to bind the role to, for example, &#34;User:u-111aaa&#34; for binding to a user &#34;u-111aaa&#34;, or &#34;User:sa-111aaa&#34; for binding to a service account &#34;sa-111aaa&#34;.
     * 
     */
    private final String principal;
    /**
     * @return (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     * 
     */
    private final String roleName;

    @CustomType.Constructor
    private GetRoleBindingResult(
        @CustomType.Parameter("crnPattern") String crnPattern,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("principal") String principal,
        @CustomType.Parameter("roleName") String roleName) {
        this.crnPattern = crnPattern;
        this.id = id;
        this.principal = principal;
        this.roleName = roleName;
    }

    /**
     * @return (Required String) A [Confluent Resource Name(CRN)](&lt;https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)&gt;) that specifies the scope and resource patterns necessary for the role to bind.
     * 
     */
    public String crnPattern() {
        return this.crnPattern;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) A principal User to bind the role to, for example, &#34;User:u-111aaa&#34; for binding to a user &#34;u-111aaa&#34;, or &#34;User:sa-111aaa&#34; for binding to a service account &#34;sa-111aaa&#34;.
     * 
     */
    public String principal() {
        return this.principal;
    }
    /**
     * @return (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleBindingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crnPattern;
        private String id;
        private String principal;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crnPattern = defaults.crnPattern;
    	      this.id = defaults.id;
    	      this.principal = defaults.principal;
    	      this.roleName = defaults.roleName;
        }

        public Builder crnPattern(String crnPattern) {
            this.crnPattern = Objects.requireNonNull(crnPattern);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }        public GetRoleBindingResult build() {
            return new GetRoleBindingResult(crnPattern, id, principal, roleName);
        }
    }
}
