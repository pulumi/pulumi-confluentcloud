// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InvitationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InvitationArgs Empty = new InvitationArgs();

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
     * The user/invitee&#39;s email address.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The user/invitee&#39;s email address.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    private InvitationArgs() {}

    private InvitationArgs(InvitationArgs $) {
        this.authType = $.authType;
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InvitationArgs $;

        public Builder() {
            $ = new InvitationArgs();
        }

        public Builder(InvitationArgs defaults) {
            $ = new InvitationArgs(Objects.requireNonNull(defaults));
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
         * @param email The user/invitee&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
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

        public InvitationArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("InvitationArgs", "email");
            }
            return $;
        }
    }

}