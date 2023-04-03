// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `Invitation` describes an Invitation data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			main, err := confluentcloud.LookupInvitation(ctx, &confluentcloud.LookupInvitationArgs{
//				Id: "i-gxxn1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("invitation", main)
//			return nil
//		})
//	}
//
// ```
func LookupInvitation(ctx *pulumi.Context, args *LookupInvitationArgs, opts ...pulumi.InvokeOption) (*LookupInvitationResult, error) {
	var rv LookupInvitationResult
	err := ctx.Invoke("confluentcloud:index/getInvitation:getInvitation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInvitation.
type LookupInvitationArgs struct {
	// The ID of the Invitation, for example, `i-zyw30`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getInvitation.
type LookupInvitationResult struct {
	// (Optional String) The timestamp that the invitation was accepted.
	AcceptedAt string `pulumi:"acceptedAt"`
	// (Optional String) Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite AUTH_TYPE_LOCAL users to SSO organizations. The user's authType is set as AUTH_TYPE_SSO by default if the organization has SSO enabled. Otherwise, the user's authType is AUTH_TYPE_LOCAL by default.
	AuthType string `pulumi:"authType"`
	// (Required Configuration Block) supports the following:
	Creators []GetInvitationCreator `pulumi:"creators"`
	// (Required String) The user/invitee's email address.
	Email string `pulumi:"email"`
	// (Optional String) The timestamp that the invitation will expire.
	ExpiresAt string `pulumi:"expiresAt"`
	// (Required String) The id of invitation creator.
	Id string `pulumi:"id"`
	// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
	Status string `pulumi:"status"`
	// (Required Configuration Block) supports the following:
	Users []GetInvitationUser `pulumi:"users"`
}

func LookupInvitationOutput(ctx *pulumi.Context, args LookupInvitationOutputArgs, opts ...pulumi.InvokeOption) LookupInvitationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInvitationResult, error) {
			args := v.(LookupInvitationArgs)
			r, err := LookupInvitation(ctx, &args, opts...)
			var s LookupInvitationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInvitationResultOutput)
}

// A collection of arguments for invoking getInvitation.
type LookupInvitationOutputArgs struct {
	// The ID of the Invitation, for example, `i-zyw30`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupInvitationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInvitationArgs)(nil)).Elem()
}

// A collection of values returned by getInvitation.
type LookupInvitationResultOutput struct{ *pulumi.OutputState }

func (LookupInvitationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInvitationResult)(nil)).Elem()
}

func (o LookupInvitationResultOutput) ToLookupInvitationResultOutput() LookupInvitationResultOutput {
	return o
}

func (o LookupInvitationResultOutput) ToLookupInvitationResultOutputWithContext(ctx context.Context) LookupInvitationResultOutput {
	return o
}

// (Optional String) The timestamp that the invitation was accepted.
func (o LookupInvitationResultOutput) AcceptedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.AcceptedAt }).(pulumi.StringOutput)
}

// (Optional String) Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite AUTH_TYPE_LOCAL users to SSO organizations. The user's authType is set as AUTH_TYPE_SSO by default if the organization has SSO enabled. Otherwise, the user's authType is AUTH_TYPE_LOCAL by default.
func (o LookupInvitationResultOutput) AuthType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.AuthType }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupInvitationResultOutput) Creators() GetInvitationCreatorArrayOutput {
	return o.ApplyT(func(v LookupInvitationResult) []GetInvitationCreator { return v.Creators }).(GetInvitationCreatorArrayOutput)
}

// (Required String) The user/invitee's email address.
func (o LookupInvitationResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.Email }).(pulumi.StringOutput)
}

// (Optional String) The timestamp that the invitation will expire.
func (o LookupInvitationResultOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.ExpiresAt }).(pulumi.StringOutput)
}

// (Required String) The id of invitation creator.
func (o LookupInvitationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
func (o LookupInvitationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInvitationResult) string { return v.Status }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupInvitationResultOutput) Users() GetInvitationUserArrayOutput {
	return o.ApplyT(func(v LookupInvitationResult) []GetInvitationUser { return v.Users }).(GetInvitationUserArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInvitationResultOutput{})
}
