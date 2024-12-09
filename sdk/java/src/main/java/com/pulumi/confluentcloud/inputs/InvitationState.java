// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.InvitationCreatorArgs;
import com.pulumi.confluentcloud.inputs.InvitationUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InvitationState extends com.pulumi.resources.ResourceArgs {

    public static final InvitationState Empty = new InvitationState();

    /**
     * (Optional String) The timestamp that the invitation was accepted.
     * 
     */
    @Import(name="acceptedAt")
    private @Nullable Output<String> acceptedAt;

    /**
     * @return (Optional String) The timestamp that the invitation was accepted.
     * 
     */
    public Optional<Output<String>> acceptedAt() {
        return Optional.ofNullable(this.acceptedAt);
    }

    @Import(name="allowDeletion")
    private @Nullable Output<Boolean> allowDeletion;

    public Optional<Output<Boolean>> allowDeletion() {
        return Optional.ofNullable(this.allowDeletion);
    }

    /**
     * Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * (Required Configuration Block) supports the following:
     * 
     */
    @Import(name="creators")
    private @Nullable Output<List<InvitationCreatorArgs>> creators;

    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public Optional<Output<List<InvitationCreatorArgs>>> creators() {
        return Optional.ofNullable(this.creators);
    }

    /**
     * The user/invitee&#39;s email address.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The user/invitee&#39;s email address.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * (Optional String) The timestamp that the invitation will expire.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return (Optional String) The timestamp that the invitation will expire.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * (Required Configuration Block) supports the following:
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<InvitationUserArgs>> users;

    /**
     * @return (Required Configuration Block) supports the following:
     * 
     */
    public Optional<Output<List<InvitationUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private InvitationState() {}

    private InvitationState(InvitationState $) {
        this.acceptedAt = $.acceptedAt;
        this.allowDeletion = $.allowDeletion;
        this.authType = $.authType;
        this.creators = $.creators;
        this.email = $.email;
        this.expiresAt = $.expiresAt;
        this.status = $.status;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InvitationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InvitationState $;

        public Builder() {
            $ = new InvitationState();
        }

        public Builder(InvitationState defaults) {
            $ = new InvitationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptedAt (Optional String) The timestamp that the invitation was accepted.
         * 
         * @return builder
         * 
         */
        public Builder acceptedAt(@Nullable Output<String> acceptedAt) {
            $.acceptedAt = acceptedAt;
            return this;
        }

        /**
         * @param acceptedAt (Optional String) The timestamp that the invitation was accepted.
         * 
         * @return builder
         * 
         */
        public Builder acceptedAt(String acceptedAt) {
            return acceptedAt(Output.of(acceptedAt));
        }

        public Builder allowDeletion(@Nullable Output<Boolean> allowDeletion) {
            $.allowDeletion = allowDeletion;
            return this;
        }

        public Builder allowDeletion(Boolean allowDeletion) {
            return allowDeletion(Output.of(allowDeletion));
        }

        /**
         * @param authType Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee&#39;s authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user&#39;s auth_type is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user&#39;s auth_type is `AUTH_TYPE_LOCAL` by default.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param creators (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder creators(@Nullable Output<List<InvitationCreatorArgs>> creators) {
            $.creators = creators;
            return this;
        }

        /**
         * @param creators (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder creators(List<InvitationCreatorArgs> creators) {
            return creators(Output.of(creators));
        }

        /**
         * @param creators (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder creators(InvitationCreatorArgs... creators) {
            return creators(List.of(creators));
        }

        /**
         * @param email The user/invitee&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The user/invitee&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param expiresAt (Optional String) The timestamp that the invitation will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt (Optional String) The timestamp that the invitation will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param status (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param users (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<InvitationUserArgs>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder users(List<InvitationUserArgs> users) {
            return users(Output.of(users));
        }

        /**
         * @param users (Required Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder users(InvitationUserArgs... users) {
            return users(List.of(users));
        }

        public InvitationState build() {
            return $;
        }
    }

}