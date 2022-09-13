// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![Limited Availability](https://img.shields.io/badge/Lifecycle%20Stage-Limited%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy) [![Request Access To OAuth API](https://img.shields.io/badge/-Request%20Access%20To%20OAuth%20API-%23bc8540)](mailto:ccloud-api-access+iam-v2-closed-preview@confluent.io?subject=Request%20to%20join%20OAuth%20API%20Closed%20Preview&body=I%E2%80%99d%20like%20to%20join%20the%20Confluent%20Cloud%20API%20Closed%20Preview%20for%20iam/v2%20to%20provide%20early%20feedback%21%20My%20Cloud%20Organization%20ID%20is%20%3Cretrieve%20from%20https%3A//confluent.cloud/settings/billing/payment%3E.)
//
// > **Note:** `IdentityPool` resource is available in a **Limited Availability** for early adopters. Limited Availability features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
// **Limited Availability** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Limited Availability features. Limited Availability features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Limited Availability features at any time in Confluent’s sole discretion.
//
// `IdentityPool` provides an Identity Pool resource that enables creating, editing, and deleting identity pools on Confluent Cloud.
//
// ## Example Usage
// ### Example Identity Pool to be used with Azure AD
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
//			azure, err := confluentcloud.NewIdentityProvider(ctx, "azure", &confluentcloud.IdentityProviderArgs{
//				DisplayName: pulumi.String("My OIDC Provider: Azure AD"),
//				Description: pulumi.String("My description"),
//				Issuer:      pulumi.String("https://login.microsoftonline.com/{tenant_id}/v2.0"),
//				JwksUri:     pulumi.String("https://login.microsoftonline.com/common/discovery/v2.0/keys"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewIdentityPool(ctx, "example", &confluentcloud.IdentityPoolArgs{
//				IdentityProvider: &IdentityPoolIdentityProviderArgs{
//					Id: azure.ID(),
//				},
//				DisplayName:   pulumi.String("My Identity Pool"),
//				Description:   pulumi.String("Prod Access to Kafka clusters to Release Engineering"),
//				IdentityClaim: pulumi.String("claims.sub"),
//				Filter:        pulumi.String("claims.aud==\"confluent\" && claims.group!=\"invalid_group\""),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Example Identity Pool to be used with Okta
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
//			okta, err := confluentcloud.NewIdentityProvider(ctx, "okta", &confluentcloud.IdentityProviderArgs{
//				DisplayName: pulumi.String("My OIDC Provider: Okta"),
//				Description: pulumi.String("My description"),
//				Issuer:      pulumi.String("https://mycompany.okta.com/oauth2/default"),
//				JwksUri:     pulumi.String("https://mycompany.okta.com/oauth2/default/v1/keys"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewIdentityPool(ctx, "example", &confluentcloud.IdentityPoolArgs{
//				IdentityProvider: &IdentityPoolIdentityProviderArgs{
//					Id: okta.ID(),
//				},
//				DisplayName:   pulumi.String("My Identity Pool"),
//				Description:   pulumi.String("Prod Access to Kafka clusters to Release Engineering"),
//				IdentityClaim: pulumi.String("claims.sub"),
//				Filter:        pulumi.String("claims.aud==\"confluent\" && claims.group!=\"invalid_group\""),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## External Documentation
//
// * [Use identity pools with your OAuth provider](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html).
//
// ## Import
//
// You can import an Identity Pool by using Identity Provider ID and Identity Pool ID, in the format `<Identity Provider ID>/<Identity Pool ID>`. The following example shows how to import an Identity Pool$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/identityPool:IdentityPool example op-abc123/pool-xyz456
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type IdentityPool struct {
	pulumi.CustomResourceState

	// A description for the Identity Pool.
	Description pulumi.StringOutput `pulumi:"description"`
	// A human-readable name for the Identity Pool.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter pulumi.StringOutput `pulumi:"filter"`
	// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim pulumi.StringOutput `pulumi:"identityClaim"`
	// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
	IdentityProvider IdentityPoolIdentityProviderOutput `pulumi:"identityProvider"`
}

// NewIdentityPool registers a new resource with the given unique name, arguments, and options.
func NewIdentityPool(ctx *pulumi.Context,
	name string, args *IdentityPoolArgs, opts ...pulumi.ResourceOption) (*IdentityPool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	if args.IdentityClaim == nil {
		return nil, errors.New("invalid value for required argument 'IdentityClaim'")
	}
	if args.IdentityProvider == nil {
		return nil, errors.New("invalid value for required argument 'IdentityProvider'")
	}
	var resource IdentityPool
	err := ctx.RegisterResource("confluentcloud:index/identityPool:IdentityPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityPool gets an existing IdentityPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityPoolState, opts ...pulumi.ResourceOption) (*IdentityPool, error) {
	var resource IdentityPool
	err := ctx.ReadResource("confluentcloud:index/identityPool:IdentityPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityPool resources.
type identityPoolState struct {
	// A description for the Identity Pool.
	Description *string `pulumi:"description"`
	// A human-readable name for the Identity Pool.
	DisplayName *string `pulumi:"displayName"`
	// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter *string `pulumi:"filter"`
	// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim *string `pulumi:"identityClaim"`
	// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
	IdentityProvider *IdentityPoolIdentityProvider `pulumi:"identityProvider"`
}

type IdentityPoolState struct {
	// A description for the Identity Pool.
	Description pulumi.StringPtrInput
	// A human-readable name for the Identity Pool.
	DisplayName pulumi.StringPtrInput
	// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter pulumi.StringPtrInput
	// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim pulumi.StringPtrInput
	// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
	IdentityProvider IdentityPoolIdentityProviderPtrInput
}

func (IdentityPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolState)(nil)).Elem()
}

type identityPoolArgs struct {
	// A description for the Identity Pool.
	Description string `pulumi:"description"`
	// A human-readable name for the Identity Pool.
	DisplayName string `pulumi:"displayName"`
	// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter string `pulumi:"filter"`
	// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim string `pulumi:"identityClaim"`
	// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
	IdentityProvider IdentityPoolIdentityProvider `pulumi:"identityProvider"`
}

// The set of arguments for constructing a IdentityPool resource.
type IdentityPoolArgs struct {
	// A description for the Identity Pool.
	Description pulumi.StringInput
	// A human-readable name for the Identity Pool.
	DisplayName pulumi.StringInput
	// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter pulumi.StringInput
	// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim pulumi.StringInput
	// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
	IdentityProvider IdentityPoolIdentityProviderInput
}

func (IdentityPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolArgs)(nil)).Elem()
}

type IdentityPoolInput interface {
	pulumi.Input

	ToIdentityPoolOutput() IdentityPoolOutput
	ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput
}

func (*IdentityPool) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPool)(nil)).Elem()
}

func (i *IdentityPool) ToIdentityPoolOutput() IdentityPoolOutput {
	return i.ToIdentityPoolOutputWithContext(context.Background())
}

func (i *IdentityPool) ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolOutput)
}

// IdentityPoolArrayInput is an input type that accepts IdentityPoolArray and IdentityPoolArrayOutput values.
// You can construct a concrete instance of `IdentityPoolArrayInput` via:
//
//	IdentityPoolArray{ IdentityPoolArgs{...} }
type IdentityPoolArrayInput interface {
	pulumi.Input

	ToIdentityPoolArrayOutput() IdentityPoolArrayOutput
	ToIdentityPoolArrayOutputWithContext(context.Context) IdentityPoolArrayOutput
}

type IdentityPoolArray []IdentityPoolInput

func (IdentityPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPool)(nil)).Elem()
}

func (i IdentityPoolArray) ToIdentityPoolArrayOutput() IdentityPoolArrayOutput {
	return i.ToIdentityPoolArrayOutputWithContext(context.Background())
}

func (i IdentityPoolArray) ToIdentityPoolArrayOutputWithContext(ctx context.Context) IdentityPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolArrayOutput)
}

// IdentityPoolMapInput is an input type that accepts IdentityPoolMap and IdentityPoolMapOutput values.
// You can construct a concrete instance of `IdentityPoolMapInput` via:
//
//	IdentityPoolMap{ "key": IdentityPoolArgs{...} }
type IdentityPoolMapInput interface {
	pulumi.Input

	ToIdentityPoolMapOutput() IdentityPoolMapOutput
	ToIdentityPoolMapOutputWithContext(context.Context) IdentityPoolMapOutput
}

type IdentityPoolMap map[string]IdentityPoolInput

func (IdentityPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPool)(nil)).Elem()
}

func (i IdentityPoolMap) ToIdentityPoolMapOutput() IdentityPoolMapOutput {
	return i.ToIdentityPoolMapOutputWithContext(context.Background())
}

func (i IdentityPoolMap) ToIdentityPoolMapOutputWithContext(ctx context.Context) IdentityPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolMapOutput)
}

type IdentityPoolOutput struct{ *pulumi.OutputState }

func (IdentityPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPool)(nil)).Elem()
}

func (o IdentityPoolOutput) ToIdentityPoolOutput() IdentityPoolOutput {
	return o
}

func (o IdentityPoolOutput) ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput {
	return o
}

// A description for the Identity Pool.
func (o IdentityPoolOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A human-readable name for the Identity Pool.
func (o IdentityPoolOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
func (o IdentityPoolOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

// The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
func (o IdentityPoolOutput) IdentityClaim() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.IdentityClaim }).(pulumi.StringOutput)
}

// Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
func (o IdentityPoolOutput) IdentityProvider() IdentityPoolIdentityProviderOutput {
	return o.ApplyT(func(v *IdentityPool) IdentityPoolIdentityProviderOutput { return v.IdentityProvider }).(IdentityPoolIdentityProviderOutput)
}

type IdentityPoolArrayOutput struct{ *pulumi.OutputState }

func (IdentityPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPool)(nil)).Elem()
}

func (o IdentityPoolArrayOutput) ToIdentityPoolArrayOutput() IdentityPoolArrayOutput {
	return o
}

func (o IdentityPoolArrayOutput) ToIdentityPoolArrayOutputWithContext(ctx context.Context) IdentityPoolArrayOutput {
	return o
}

func (o IdentityPoolArrayOutput) Index(i pulumi.IntInput) IdentityPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IdentityPool {
		return vs[0].([]*IdentityPool)[vs[1].(int)]
	}).(IdentityPoolOutput)
}

type IdentityPoolMapOutput struct{ *pulumi.OutputState }

func (IdentityPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPool)(nil)).Elem()
}

func (o IdentityPoolMapOutput) ToIdentityPoolMapOutput() IdentityPoolMapOutput {
	return o
}

func (o IdentityPoolMapOutput) ToIdentityPoolMapOutputWithContext(ctx context.Context) IdentityPoolMapOutput {
	return o
}

func (o IdentityPoolMapOutput) MapIndex(k pulumi.StringInput) IdentityPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IdentityPool {
		return vs[0].(map[string]*IdentityPool)[vs[1].(string)]
	}).(IdentityPoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolInput)(nil)).Elem(), &IdentityPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolArrayInput)(nil)).Elem(), IdentityPoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolMapInput)(nil)).Elem(), IdentityPoolMap{})
	pulumi.RegisterOutputType(IdentityPoolOutput{})
	pulumi.RegisterOutputType(IdentityPoolArrayOutput{})
	pulumi.RegisterOutputType(IdentityPoolMapOutput{})
}
