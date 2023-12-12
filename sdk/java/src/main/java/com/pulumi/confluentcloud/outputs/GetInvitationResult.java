// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetInvitationCreator;
import com.pulumi.confluentcloud.outputs.GetInvitationUser;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInvitationResult {
    /**
     * @return (Optional String) The timestamp that the invitation was accepted.
     * 
     */
    private String acceptedAt;
    /**
     * @return (Optional String) Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
     * 
     */
    private String authType;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetInvitationCreator> creators;
    /**
     * @return (Required String) The user/invitee&#39;s email address.
     * 
     */
    private String email;
    /**
     * @return (Optional String) The timestamp that the invitation will expire.
     * 
     */
    private String expiresAt;
    /**
     * @return (Required String) The id of invitation creator.
     * 
     */
    private String id;
    /**
     * @return (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
     * 
     */
    private String status;
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    private List<GetInvitationUser> users;

    private GetInvitationResult() {}
    /**
     * @return (Optional String) The timestamp that the invitation was accepted.
     * 
     */
    public String acceptedAt() {
        return this.acceptedAt;
    }
    /**
     * @return (Optional String) Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
     * 
     */
    public String authType() {
        return this.authType;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetInvitationCreator> creators() {
        return this.creators;
    }
    /**
     * @return (Required String) The user/invitee&#39;s email address.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return (Optional String) The timestamp that the invitation will expire.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return (Required String) The id of invitation creator.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public List<GetInvitationUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvitationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceptedAt;
        private String authType;
        private List<GetInvitationCreator> creators;
        private String email;
        private String expiresAt;
        private String id;
        private String status;
        private List<GetInvitationUser> users;
        public Builder() {}
        public Builder(GetInvitationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedAt = defaults.acceptedAt;
    	      this.authType = defaults.authType;
    	      this.creators = defaults.creators;
    	      this.email = defaults.email;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder acceptedAt(String acceptedAt) {
            this.acceptedAt = Objects.requireNonNull(acceptedAt);
            return this;
        }
        @CustomType.Setter
        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        @CustomType.Setter
        public Builder creators(List<GetInvitationCreator> creators) {
            this.creators = Objects.requireNonNull(creators);
            return this;
        }
        public Builder creators(GetInvitationCreator... creators) {
            return creators(List.of(creators));
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder users(List<GetInvitationUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetInvitationUser... users) {
            return users(List.of(users));
        }
        public GetInvitationResult build() {
            final var _resultValue = new GetInvitationResult();
            _resultValue.acceptedAt = acceptedAt;
            _resultValue.authType = authType;
            _resultValue.creators = creators;
            _resultValue.email = email;
            _resultValue.expiresAt = expiresAt;
            _resultValue.id = id;
            _resultValue.status = status;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}
