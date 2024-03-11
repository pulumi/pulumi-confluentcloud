// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `Invitation` provides an invitation resource that enables creating, reading, and deleting invitation on Confluent Cloud.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := confluentcloud.NewInvitation(ctx, "main", &confluentcloud.InvitationArgs{
//				Email: pulumi.String(""),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewInvitation(ctx, "main2", &confluentcloud.InvitationArgs{
//				AuthType: pulumi.String("AUTH_TYPE_LOCAL"),
//				Email:    pulumi.String(""),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// You can import an Invitation by using Invitation ID, for example:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/invitation:Invitation main i-gxxn1
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type Invitation struct {
	pulumi.CustomResourceState

	// (Optional String) The timestamp that the invitation was accepted.
	AcceptedAt pulumi.StringOutput `pulumi:"acceptedAt"`
	// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
	AuthType pulumi.StringOutput `pulumi:"authType"`
	// (Required Configuration Block) supports the following:
	Creators InvitationCreatorArrayOutput `pulumi:"creators"`
	// The user/invitee's email address.
	Email pulumi.StringOutput `pulumi:"email"`
	// (Optional String) The timestamp that the invitation will expire.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
	Status pulumi.StringOutput `pulumi:"status"`
	// (Required Configuration Block) supports the following:
	Users InvitationUserArrayOutput `pulumi:"users"`
}

// NewInvitation registers a new resource with the given unique name, arguments, and options.
func NewInvitation(ctx *pulumi.Context,
	name string, args *InvitationArgs, opts ...pulumi.ResourceOption) (*Invitation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Invitation
	err := ctx.RegisterResource("confluentcloud:index/invitation:Invitation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInvitation gets an existing Invitation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInvitation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InvitationState, opts ...pulumi.ResourceOption) (*Invitation, error) {
	var resource Invitation
	err := ctx.ReadResource("confluentcloud:index/invitation:Invitation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Invitation resources.
type invitationState struct {
	// (Optional String) The timestamp that the invitation was accepted.
	AcceptedAt *string `pulumi:"acceptedAt"`
	// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
	AuthType *string `pulumi:"authType"`
	// (Required Configuration Block) supports the following:
	Creators []InvitationCreator `pulumi:"creators"`
	// The user/invitee's email address.
	Email *string `pulumi:"email"`
	// (Optional String) The timestamp that the invitation will expire.
	ExpiresAt *string `pulumi:"expiresAt"`
	// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
	Status *string `pulumi:"status"`
	// (Required Configuration Block) supports the following:
	Users []InvitationUser `pulumi:"users"`
}

type InvitationState struct {
	// (Optional String) The timestamp that the invitation was accepted.
	AcceptedAt pulumi.StringPtrInput
	// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
	AuthType pulumi.StringPtrInput
	// (Required Configuration Block) supports the following:
	Creators InvitationCreatorArrayInput
	// The user/invitee's email address.
	Email pulumi.StringPtrInput
	// (Optional String) The timestamp that the invitation will expire.
	ExpiresAt pulumi.StringPtrInput
	// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
	Status pulumi.StringPtrInput
	// (Required Configuration Block) supports the following:
	Users InvitationUserArrayInput
}

func (InvitationState) ElementType() reflect.Type {
	return reflect.TypeOf((*invitationState)(nil)).Elem()
}

type invitationArgs struct {
	// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
	AuthType *string `pulumi:"authType"`
	// The user/invitee's email address.
	Email string `pulumi:"email"`
}

// The set of arguments for constructing a Invitation resource.
type InvitationArgs struct {
	// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
	AuthType pulumi.StringPtrInput
	// The user/invitee's email address.
	Email pulumi.StringInput
}

func (InvitationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*invitationArgs)(nil)).Elem()
}

type InvitationInput interface {
	pulumi.Input

	ToInvitationOutput() InvitationOutput
	ToInvitationOutputWithContext(ctx context.Context) InvitationOutput
}

func (*Invitation) ElementType() reflect.Type {
	return reflect.TypeOf((**Invitation)(nil)).Elem()
}

func (i *Invitation) ToInvitationOutput() InvitationOutput {
	return i.ToInvitationOutputWithContext(context.Background())
}

func (i *Invitation) ToInvitationOutputWithContext(ctx context.Context) InvitationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InvitationOutput)
}

// InvitationArrayInput is an input type that accepts InvitationArray and InvitationArrayOutput values.
// You can construct a concrete instance of `InvitationArrayInput` via:
//
//	InvitationArray{ InvitationArgs{...} }
type InvitationArrayInput interface {
	pulumi.Input

	ToInvitationArrayOutput() InvitationArrayOutput
	ToInvitationArrayOutputWithContext(context.Context) InvitationArrayOutput
}

type InvitationArray []InvitationInput

func (InvitationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Invitation)(nil)).Elem()
}

func (i InvitationArray) ToInvitationArrayOutput() InvitationArrayOutput {
	return i.ToInvitationArrayOutputWithContext(context.Background())
}

func (i InvitationArray) ToInvitationArrayOutputWithContext(ctx context.Context) InvitationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InvitationArrayOutput)
}

// InvitationMapInput is an input type that accepts InvitationMap and InvitationMapOutput values.
// You can construct a concrete instance of `InvitationMapInput` via:
//
//	InvitationMap{ "key": InvitationArgs{...} }
type InvitationMapInput interface {
	pulumi.Input

	ToInvitationMapOutput() InvitationMapOutput
	ToInvitationMapOutputWithContext(context.Context) InvitationMapOutput
}

type InvitationMap map[string]InvitationInput

func (InvitationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Invitation)(nil)).Elem()
}

func (i InvitationMap) ToInvitationMapOutput() InvitationMapOutput {
	return i.ToInvitationMapOutputWithContext(context.Background())
}

func (i InvitationMap) ToInvitationMapOutputWithContext(ctx context.Context) InvitationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InvitationMapOutput)
}

type InvitationOutput struct{ *pulumi.OutputState }

func (InvitationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Invitation)(nil)).Elem()
}

func (o InvitationOutput) ToInvitationOutput() InvitationOutput {
	return o
}

func (o InvitationOutput) ToInvitationOutputWithContext(ctx context.Context) InvitationOutput {
	return o
}

// (Optional String) The timestamp that the invitation was accepted.
func (o InvitationOutput) AcceptedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Invitation) pulumi.StringOutput { return v.AcceptedAt }).(pulumi.StringOutput)
}

// Accepted values are: `AUTH_TYPE_LOCAL` and `AUTH_TYPE_SSO`. The user/invitee's authentication type. Note that only the [`OrganizationAdmin role`](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#organizationadmin) can invite `AUTH_TYPE_LOCAL` users to SSO organizations. The user's authType is set as `AUTH_TYPE_SSO` by default if the organization has SSO enabled. Otherwise, the user's authType is `AUTH_TYPE_LOCAL` by default.
func (o InvitationOutput) AuthType() pulumi.StringOutput {
	return o.ApplyT(func(v *Invitation) pulumi.StringOutput { return v.AuthType }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o InvitationOutput) Creators() InvitationCreatorArrayOutput {
	return o.ApplyT(func(v *Invitation) InvitationCreatorArrayOutput { return v.Creators }).(InvitationCreatorArrayOutput)
}

// The user/invitee's email address.
func (o InvitationOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *Invitation) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// (Optional String) The timestamp that the invitation will expire.
func (o InvitationOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Invitation) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// (Optional String) The status of invitations. Accepted values are: `INVITE_STATUS_SENT`,`INVITE_STATUS_STAGED`,`INVITE_STATUS_ACCEPTED`,`INVITE_STATUS_EXPIRED`, and `INVITE_STATUS_DEACTIVATED`.
func (o InvitationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Invitation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o InvitationOutput) Users() InvitationUserArrayOutput {
	return o.ApplyT(func(v *Invitation) InvitationUserArrayOutput { return v.Users }).(InvitationUserArrayOutput)
}

type InvitationArrayOutput struct{ *pulumi.OutputState }

func (InvitationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Invitation)(nil)).Elem()
}

func (o InvitationArrayOutput) ToInvitationArrayOutput() InvitationArrayOutput {
	return o
}

func (o InvitationArrayOutput) ToInvitationArrayOutputWithContext(ctx context.Context) InvitationArrayOutput {
	return o
}

func (o InvitationArrayOutput) Index(i pulumi.IntInput) InvitationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Invitation {
		return vs[0].([]*Invitation)[vs[1].(int)]
	}).(InvitationOutput)
}

type InvitationMapOutput struct{ *pulumi.OutputState }

func (InvitationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Invitation)(nil)).Elem()
}

func (o InvitationMapOutput) ToInvitationMapOutput() InvitationMapOutput {
	return o
}

func (o InvitationMapOutput) ToInvitationMapOutputWithContext(ctx context.Context) InvitationMapOutput {
	return o
}

func (o InvitationMapOutput) MapIndex(k pulumi.StringInput) InvitationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Invitation {
		return vs[0].(map[string]*Invitation)[vs[1].(string)]
	}).(InvitationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InvitationInput)(nil)).Elem(), &Invitation{})
	pulumi.RegisterInputType(reflect.TypeOf((*InvitationArrayInput)(nil)).Elem(), InvitationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InvitationMapInput)(nil)).Elem(), InvitationMap{})
	pulumi.RegisterOutputType(InvitationOutput{})
	pulumi.RegisterOutputType(InvitationArrayOutput{})
	pulumi.RegisterOutputType(InvitationMapOutput{})
}
